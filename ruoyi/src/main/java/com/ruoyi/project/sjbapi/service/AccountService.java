package com.ruoyi.project.sjbapi.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.SignUtil;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 会员服务相关接口
 */
public class AccountService {

    //private static String url =  Config.getYml().getUrl("sjbAccount");

    //private static String appcode = Config.getYml().getAppCode("sjbAccount");

    private static String url =  "http://sjb-service.sijibao.co/sjbAccount/router";

    private static String appcode = "100094";

    private static AccountService accountService = null;

    public static AccountService getInstance() {
        if (accountService == null) {
            synchronized (AccountService.class){
                if (accountService==null){
                    accountService = new AccountService();
                }
            }
        }

        return accountService;
    }


    /**
     * 注册信息部帐号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("注册信息部帐号1.0")
    public JSONObject accountChannelRegister1(String account, String password, String companyName, String companyLinkMan, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("companyName", companyName);//公司名称
        map.put("companyLinkMan", companyLinkMan);//公司联系人
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("lon", "114.429231");//经纬度
        map.put("lat", "30.460185");//经纬度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.channel.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 调度帐号登录1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountCompanyLogin1(String account, String password, String userType, String force, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("userType", userType);//用户类型
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("force", force);//是否强制登录
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.company.login");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();

    }

    /**
     * 注册企业帐号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("注册企业帐号1.0")
    public JSONObject accountCompanyRegister1(String account, String password, String companyName, String companyLogo, String companyLinkMan, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("companyName", companyName);//公司名称
        map.put("companyLogo", companyLogo);//公司头像
        map.put("companyLinkMan", companyLinkMan);//公司联系人
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("lon", "114.429231");//经纬度
        map.put("lat", "30.460185");//经纬度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.company.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 注册司机帐号3.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountDriverRegister3(String account, String password, String smsNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.driver.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "3.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //ignoreParamNames.add(password);
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 注册司机帐号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("注册司机帐号1.0")
    public JSONObject accountDriverRegister1(String account, String password, String userName, String truckNum, String invitecode, String testNum, String idCode, String userLogo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("userName", userName);//用户名
        map.put("truckNum", truckNum);//车牌号
        map.put("invitecode", invitecode);//邀请码
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编码
        map.put("deviceType", "4");//设备类型
        map.put("lon", "114.429231");//经纬度
        map.put("lat", "30.460185");//经纬度
        map.put("testNum", testNum);//
        map.put("idCode", idCode);//身份证
        map.put("userLogo", userLogo);//用户头像
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.driver.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 注册司机帐号2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountDriverRegister2(String account, String password, String userName, String truckNum, String invitecode, String userLogo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("userName", userName);//用户姓名
        map.put("truckNum", truckNum);//车牌号
        map.put("invitecode", invitecode);//邀请码
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("lon", "114.429231");//经纬度
        map.put("lat", "30.460185");//经纬度
        map.put("userLogo", userLogo);//用户头像
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.driver.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 校验帐号身份证信息1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountIdcardCheck1(String userName, String idcard, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", userName);//用户名称
        map.put("idcard", idcard);//身份证
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.idcard.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 帐号登录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("账号登录")
    public JSONObject accountLogin1(String account, String password, String userType, String force, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("userType", userType);//用户类型
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("force", force);//是否强制登录
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.login");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 自动登录1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountLoginAuto1(String account, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号电话
        map.put("password", password);//密码
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.login.auto");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 信息部登录1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountLoginChannel1(String account, String password, String userType, String force, String forceChannel, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("userType", userType);//用户类型
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备编号
        map.put("deviceType", "4");//设备类型
        map.put("force", force);//是否强制登录
        map.put("forceChannel", forceChannel);//是否强制登录信息部
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.login.channel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 帐号异地登录1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountLoginOther1(String account, String testNum, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("testNum", testNum);//短信验证码
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备号
        map.put("deviceType", "4");//设备类型
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.login.other");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 退出登录1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountLogout1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.logout");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 校验登录密码是否正确1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountPasswordCheck1(String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 修改登录密码1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountPasswordModify1(String oldPassword, String newPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldPassword", oldPassword);//旧密码
        map.put("newPassword", newPassword);//新密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.modify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 重置登录密码1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountPasswordReset1(String account, String newpass, String smsnumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("newpass", newpass);//新密码
        map.put("smsnumber", smsnumber);//验证码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.reset");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 重置登录密码2.3
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountPasswordReset23(String account, String newpass, String smsnumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("newpass", newpass);//新密码
        map.put("smsnumber", smsnumber);//验证码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.reset");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.3");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 重置登录密码2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountPasswordReset2(String account, String newpass, String smsnumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("newpass", newpass);//新密码
        map.put("smsnumber", smsnumber);//验证码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.reset");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 校验验证码是否正确1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsCheck1(String account, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 忘记密码短信验证码校验1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsCheckForgetPassword1(String account, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.check.forget.password");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }
    /**
     * 忘记密码短信验证码校验1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsCheckForgetPassword23(String account, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.check.forget.password");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.3");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }


    /**
     * 修改手机号短信验证码校验1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsCheckModifyMobile1(String account, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.check.modify.mobile");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 注册短信验证码校验1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsCheckRegister1(String account, String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.check.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 忘记密码发送短信1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsForgetPassword1(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.forget.password");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 忘记密码发送短信2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsForgetPassword2(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.forget.password");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);//"2dddc367e1f2452f853d15c43bbd8078"
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 忘记密码发送短信2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsForgetPassword23(String account) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.forget.password");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.3");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);//"2dddc367e1f2452f853d15c43bbd8078"
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 验证码登录1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsLogin1(String account, String testNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("testNum", testNum);//短信验证码
        map.put("deviceNum", "AND-c1d9579e9a7dff7c");//设备号
        map.put("deviceType", "4");//设备类型
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.login");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 异地登录发送短信1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsLoginOther1(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.login.other");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 异地登录发送短信2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsLoginOther2(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.login.other");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 修改手机号发送短信1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsModifyMobile1(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.modify.mobile");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 修改手机号发送短信2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsModifyMobile2(String account, String loginPassword, String idcardNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("loginPassword", loginPassword);//登录密码
        map.put("idcardNumber", idcardNumber);//身份证号码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.modify.mobile");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 注册帐号发送短信2.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsRegister2(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 注册帐号发送短信1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsRegister1(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 验证码登录，发送短信验证码1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountSmsSend1(String type, String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//验证码类型
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.send");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 修改帐号信息1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject accountUserModify1(String smsNum, String userName, String userNick, String userLogo, String userSign, String needConfirm, String idCode, String mobile, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("smsNum", smsNum);//验证码
        map.put("userName", userName);//用户名称
        map.put("userNick", userNick);//用户昵称
        map.put("userLogo", userLogo);//用户头像
        map.put("userSign", userSign);//用户签名
        map.put("needConfirm", needConfirm);//添加是否需要同意
        map.put("idCode", idCode);//身份证
        map.put("mobile", mobile);//手机号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.user.modify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 添加子帐号1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberCreate1(String companyCode, String groupCode, String memberName, String memberMobile, String memberSourceType, String smsNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//公司编码
        map.put("groupCode", groupCode);//群组编码
        map.put("memberName", memberName);//成员姓名
        map.put("memberMobile", memberMobile);//成员电话
        map.put("memberSourceType", memberSourceType);//成员来源
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 子帐号关系操作1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberOperate1(String companyMemberCode, String companyCode, String memberMobile, String operateType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//唯一主键
        map.put("companyCode", companyCode);//公司编码
        map.put("memberMobile", memberMobile);//成员电话
        map.put("operateType", operateType);//操作类型
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.operate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 查询公司子帐号列表1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberQueryList1(String companyCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//公司编号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 查询子帐号权限1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberQueryPower1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.power");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 查询公司管理员和公司信息1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberQueryPreinfo1(String groupCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupCode", groupCode);//群组编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.preinfo");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 发送通知对方激活帐号短信1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberSendSmsActivite1(String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.send.sms.activite");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 成员主动申请加入公司发送短信验证码1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberSendSmsApplyJoin1(String account, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.send.sms.apply.join");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 修改子帐号信息1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberUpdate1(String companyMemberCode, String companyCode, String memberMobile, String newMobile, String newName, String memberMemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//主键编码
        map.put("companyCode", companyCode);//公司编码
        map.put("memberMobile", memberMobile);//电话
        map.put("newMobile", newMobile);//新手机号
        map.put("newName", newName);//新名称
        map.put("memberMemo", memberMemo);//备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 修改帐号权限1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject companyMemberUpdatePower1(String companymembercode, String payOrder, String submitLoad, String submitUnload, String submitReceipt, String powerOpen, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companymembercode", companymembercode);//
        map.put("payOrder", payOrder);//支付运单
        map.put("submitLoad", submitLoad);//确认装货
        map.put("submitUnload", submitUnload);//确认卸货
        map.put("submitReceipt", submitReceipt);//确认回单
        map.put("powerOpen", powerOpen);//权限大开关
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.update.power");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * session保鲜1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject kepalive1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "kepalive");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    /**
     * 权限查询1.0
     *
     * @return response
     * @throws Exception
     */
    public JSONObject powerQueryList1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "power.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }

    public static void main(String[] args) {
        String data = "deviceNum=AND-c1d9579e9a7dff7c&deviceType=4&password=123456&method=account.driver.register&v=3.0&format=json&appcode=100004&account=17022222223&smsNum=568502&";
        String signValue = SignUtil.signByString(data, appcode);
        System.out.println(signValue);
    }
}
