package com.ruoyi.project.sjbapi.util;

import com.jcraft.jsch.*;
import com.ruoyi.project.common.CommonController;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class SSHUtil {
    private static final Logger log = LoggerFactory.getLogger(SSHUtil.class);

    int localPort = 3310;// 本地端口
    //static String keyFile = "src/main/resources/id_rsa_2048";
    //static String keyFile = new ClassPathResource("id_rsa_2048").getPath();
    //InputStream stream = getClass().getClassLoader().getResourceAsStream("id_rsa_2048");
    String keyFile = getClass().getClassLoader().getResource("id_rsa_2048").getPath().toString();

    private static Session session;
    // SSH连接用户名
    private static String sshUser = "pub";
    // SSH连接密码
    private static String sshPassword = "qqqq3333";
    // SSH服务器
    //private static String sshHost = "39.104.233.122";
    //private static int sshPort = 50022;
    // SSH访问端口
    private static String sshHost = "39.104.113.58";
    private static int sshPort = 53031;

/*    public void startSSH() {
        logger.debug("ssh连接跳板机");
        JSch jsch = new JSch();
        try {
            session = jsch.getSession(sshUser, sshHost, sshPort);
            jsch.addIdentity(keyFile);
            // 设置第一次登陆的时候提示，可选值：(ask | yes | no)
            session.setConfig("StrictHostKeyChecking", "no");
            UserInfo ui = new MyUserInfo(sshPassword);
            session.setUserInfo(ui);
            session.connect();
            // 打印SSH服务器版本信息
            System.out.println(session.getServerVersion());
            // 设置SSH本地端口转发,本地转发到远程
            int assinged_port = session.setPortForwardingL(localPort, remoteHost, remotePort);
            logger.debug("localhost:" + assinged_port + " -> " + remoteHost + ":" + remotePort);
        } catch (JSchException e) {
            logger.error(e);
        }
    }*/

    public void startSSH(int localPort, String remoteHost, int remotePort) {
        JSch jsch = new JSch();
        try {
            session = jsch.getSession(sshUser, sshHost, sshPort);
            jsch.addIdentity(keyFile);
            session.setConfig("StrictHostKeyChecking", "no");
            UserInfo ui = new MyUserInfo(sshPassword);
            session.setUserInfo(ui);
            session.connect();
            // 打印SSH服务器版本信息
            // 设置SSH本地端口转发,本地转发到远程
            int assinged_port = session.setPortForwardingL(localPort, remoteHost, remotePort);
            log.info("跳板机链接成功");

        } catch (JSchException e) {
            //e.printStackTrace();
            log.error("连接跳板机异常");
            log.error(e.getMessage());
        }
    }

    /**
     * 执行相关的命令
     *
     * @throws JSchException
     */
    public List<String> execCmd(String command) {
        BufferedReader reader = null;
        Channel channel = null;
        List<String> result = new ArrayList<>();
        try {
            if (command != null) {
                channel = session.openChannel("exec");
                ((ChannelExec) channel).setCommand(command);
                // ((ChannelExec) channel).setErrStream(System.err);
                channel.connect();

                InputStream in = channel.getInputStream();
                reader = new BufferedReader(new InputStreamReader(in));
                String buf = null;
                while ((buf = reader.readLine()) != null) {
                    System.out.println(buf);
                    result.add(buf);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSchException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            channel.disconnect();
        }
        return result;
    }

    /**
     * 上传文件
     *
     * @param directory  上传的目录
     * @param uploadFile 要上传的文件
     * @throws JSchException
     * @throws SftpException
     * @throws FileNotFoundException
     */
    public void upload(String directory, String uploadFile) throws JSchException, FileNotFoundException, SftpException {
        ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
        channelSftp.cd(directory);
        File file = new File(uploadFile);
        channelSftp.put(new FileInputStream(file), file.getName());
        System.out.println("Upload Success!");
    }

    /**
     * 下载文件
     *
     * @param src
     * @param dst
     * @throws JSchException
     * @throws SftpException
     */
    public void download(String src, String dst) throws JSchException, SftpException {
        // src linux服务器文件地址，dst 本地存放地址
        ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
        channelSftp.connect();
        channelSftp.get(src, dst);
        channelSftp.quit();
    }

    /**
     * 删除文件
     *
     * @param directory  要删除文件所在目录
     * @param deleteFile 要删除的文件
     * @throws SftpException
     * @throws JSchException
     */
    public void delete(String directory, String deleteFile) throws SftpException, JSchException {
        ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
        channelSftp.cd(directory);
        channelSftp.rm(deleteFile);
    }

    /**
     * 列出目录下的文件
     *
     * @param directory 要列出的目录
     * @return
     * @throws SftpException
     * @throws JSchException
     */
    @SuppressWarnings("rawtypes")
    public Vector listFiles(String directory) throws JSchException, SftpException {
        ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
        return channelSftp.ls(directory);
    }

    public void close() throws JSchException {
        session.delPortForwardingL("127.0.0.1", localPort);
        session.disconnect();
        log.info("关闭跳板机连接");
    }

    public void close(int localPort) throws JSchException {
        session.delPortForwardingL("127.0.0.1", localPort);
        session.disconnect();
        log.info("关闭跳板机连接");
    }

    public static class MyUserInfo implements UserInfo {
        private String passphrase = null;

        public MyUserInfo(String passphrase) {
            this.passphrase = passphrase;
        }

        public String getPassphrase() {
            return passphrase;
        }

        public String getPassword() {
            return null;
        }

        public boolean promptPassphrase(String s) {
            return true;
        }

        public boolean promptPassword(String s) {
            return true;
        }

        public boolean promptYesNo(String s) {
            return true;
        }

        public void showMessage(String s) {
            System.out.println(s);
        }
    }


    public static void searchFile() throws JSchException {
        SSHUtil sshUtils = new SSHUtil();
        //sshUtils.startSSH();
        List<String> result = sshUtils.execCmd("find . -name SmsHandler.class");
        System.out.println("文件个数:" + result.size());
        int i = 0;
        for (String path : result) {
            System.out.println(path);
            //System.out.println(i);
            /*List<String> temp = sshUtils.execCmd("cat " + path + "|grep 200102");
            if (temp.size() > 0) {
            }*/
            //i++;
        }
        sshUtils.close();
    }

    public static void checkLog() throws IOException, JSchException {
        //String filePath = "D:\\apache-jmeter-5.0\\result_10_50.csv";
        String filePath = "D:\\apache-jmeter-5.0\\errOrder.txt";

        List<String> lines = FileUtils.readLines(new File(filePath), Charset.defaultCharset());
        SSHUtil sshUtils = new SSHUtil();
        //sshUtils.startSSH();
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            //System.out.println("记录："+line);
            //result = sshUtils.execCmd("cat /data/applog/scfs-order/log.2018-12-27.log | grep " + line.split(",")[0]);
            result = sshUtils.execCmd("cat /data/applog/scfs-order/log.2018-12-27.log | grep " + "r");

            System.out.println(result.size());
            if (result.size() != 116) {
                //System.out.println(line);
            }
            break;
        }
        sshUtils.close();
    }


    public static void main(String[] args) throws JSchException, IOException {
        //checkLog();
        searchFile();
    }

}
