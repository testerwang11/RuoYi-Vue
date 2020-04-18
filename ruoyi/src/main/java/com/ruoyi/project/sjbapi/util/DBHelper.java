package com.ruoyi.project.sjbapi.util;

import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.ds.druid.DruidDSFactory;
import cn.hutool.db.ds.tomcat.TomcatDSFactory;
import com.jcraft.jsch.JSchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private static final Logger log = LoggerFactory.getLogger(DBHelper.class);

    private static DBHelper dbHelper = null;

    private static SSHUtil sshUtils = new SSHUtil();

    public Statement bams, stock_center, plateform_test;

    public static DBHelper getInstance() {
        if (dbHelper == null) {
            synchronized (DBHelper.class) {
                if(dbHelper == null){
                    dbHelper = new DBHelper();
                }
            }
        }
        return dbHelper;
    }

    private DBHelper() {
        sshUtils.startSSH(3310, "192.168.32.90", 6612);
        try {
            DSFactory.setCurrentDSFactory(new DruidDSFactory());

            bams = DSFactory.get("group_db1").getConnection().createStatement();
            stock_center = DSFactory.get("group_db2").getConnection().createStatement();
            plateform_test = DSFactory.get("group_db3").getConnection().createStatement();
        }catch (Exception e){
            log.error("数据库连接异常");
            log.error(e.getMessage());
        }
    }

    /**
     * 查询
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public List<Object> execSqlQuery(Statement st, String sql, String column) {
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
    public ResultSet execSqlQuery(Statement st, String sql) {
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
    public boolean execSql(Statement st, String sql) throws SQLException {
        boolean rs = false;
        rs = st.execute(sql);
        return rs;
    }

    public void close() {
        try {
            sshUtils.close(3310);
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws JSchException {
        DBHelper dbHelper = DBHelper.getInstance();

        try {
            dbHelper.execSql(dbHelper.plateform_test,"UPDATE assure_orders set dynamic_state = '12' WHERE order_number = '1906111014610001'");
            /*while (resultSet.next()){
                System.out.println(resultSet.getString("company_phone"));
            }
            ResultSet resultSet2 = dbHelper.db_plateform.execSqlQuery("SELECT company_phone FROM company where company_phone = '171000000021'");
            while (resultSet2.next()){
                System.out.println(resultSet2.getString("company_phone"));
            }*/
/*            if(resultSet.next()||resultSet2.next()){

            }else{
                System.out.println("无数据");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbHelper.close();
        }
    }
}
