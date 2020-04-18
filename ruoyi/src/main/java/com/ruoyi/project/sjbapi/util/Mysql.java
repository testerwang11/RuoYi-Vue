package com.ruoyi.project.sjbapi.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Mysql {


    static int localPort = 3310;// 本地端口
    //static int localPort = 6612;// 本地端口

    private Connection conn = null;

    private ConcurrentHashMap<String, String> np = new ConcurrentHashMap<>();

    private  Statement st;

    private String dataBase;


    public Mysql() {
    }

    public Mysql(String dataBase) {
        np.put("plateform_test", "plateform::78b209a6129d6bbdf46d6a7aff527d5d");
        np.put("bams_test", "bams::07442a66f04fd903b5ab3df6319b9811");
        //np.put("bams_test", "wanghy_ro::1bc9b0d4662b315e4da1360f30e160d0");
        //np.put("plateform_test", "wanghy_ro::1bc9b0d4662b315e4da1360f30e160d0");

        np.put("stock_center_test", "stock_center::d7559eb2cff47e4252d4fb3fb8e7e1a3");
        np.put("weixin_test", "weixin::b6d203f914cb37baeea011891c84cfff");
        np.put("mp01_test", "mp::mp");
        np.put("finance_test", "finance_test::finance_dev");
        this.dataBase = dataBase;
        connectDb(dataBase);//连接数据库

    }

/*    public void init(String dataBase) {
        connectDb(dataBase);//连接数据库
    }*/


    public void close() {
        if (st != null) {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            st = null;
            conn = null;
        }
    }

    public void connectDb(String dataBase) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 设置SSH本地端口转发后，访问本地ip+port就可以访问到远程的ip+port
            String jdbc_url = String.format("jdbc:mysql://localhost:%d/%s?autoReconnect=true", localPort, dataBase);
            //String jdbc_url = String.format("jdbc:mysql://172.31.255.205:%d/%s?autoReconnect=true", localPort, dataBase);
            conn = DriverManager.getConnection(jdbc_url, np.get(dataBase).split("::")[0], np.get(dataBase).split("::")[1]);
            st = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 查询
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public List<Object> execSqlQuery(String sql, String column) {
        List<Object> results = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                results.add(rs.getString(column));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    /**
     * 查询
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public ResultSet execSqlQuery(String sql) {
        List<Object> results = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * 操作数据
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public boolean execSql(String sql) throws SQLException {
        boolean rs = false;
        Statement st = conn.createStatement();
        rs = st.execute(sql);

        return rs;
    }

    public static void main(String[] args) {
        Mysql db = new Mysql("plateform_test");
        //Mysql db = new Mysql();
        List id = db.execSqlQuery("SELECT * FROM bams_tax_wait_open_bill_info where sjb_stock_no in ('1812281013280001')", "id");
        db.close();
    }
}