package com.ruoyi.project.sjbapi.util;

import com.jcraft.jsch.JSchException;

public class DBHelper2 {

    private static DBHelper2 dbHelper = null;

    public static Mysql db_weixin;
    public static Mysql db_plateform;
    public static Mysql db_bams;
    public static Mysql db_stock_center;
    public static Mysql db_mp01;
    public static Mysql db_finance;

    private static SSHUtil sshUtils = new SSHUtil();

    public static DBHelper2 getInstance() {
        /*if(true){
            return dbHelper;
        }*/
        if (dbHelper == null) {
            synchronized (DBHelper2.class) {
                if(dbHelper == null){
                    dbHelper = new DBHelper2();
                }
            }
        }
        return dbHelper;
    }

    private DBHelper2() {
        sshUtils.startSSH(3310, "192.168.32.90", 6612);
        db_weixin = new Mysql("weixin_test");
        db_plateform = new Mysql("plateform_test");
        db_bams = new Mysql("bams_test");
        db_stock_center = new Mysql("stock_center_test");
        db_mp01 = new Mysql("mp01_test");
        db_finance = new Mysql("finance_test");
    }

    public void close() throws JSchException {
        try {
            db_weixin.close();
            db_bams.close();
            db_mp01.close();
            db_plateform.close();
            db_stock_center.close();
            db_finance.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sshUtils.close();
        }
    }

    public void cancelOrder(String orderNumber) {

    }

    public static void main(String[] args) throws JSchException {
        DBHelper2 dbHelper = DBHelper2.getInstance();

        try {
            dbHelper.db_plateform.execSql("UPDATE assure_orders set dynamic_state = '12' WHERE order_number = '1906111014610001'");
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
