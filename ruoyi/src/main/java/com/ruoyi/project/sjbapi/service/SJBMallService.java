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
public class SJBMallService {

    private static String url = "http://sjb-service.sijibao.co/sjbMall/router";
    private static String appcode = "100004";
    /*private static String url =  Config.getYml().getUrl("sjbMall");
    private static String appcode = Config.getYml().getAppCode("sjbMall");*/

    /**
     * 加油员二维码批量修复接口.1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油员二维码批量修复接口.1.0")
    public JSONObject accountBathBind1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.bath.bind");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，企业银行账户更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，企业银行账户更新1.0")
    public JSONObject accountMobileBankaccountUpdate1(String bankaccountname, String bankname, String bankaccount) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankaccountname", bankaccountname);//银行账户开户名
        map.put("bankname", bankname);//开户行（支行）名称
        map.put("bankaccount", bankaccount);//银行账户
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.bankaccount.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，企业认证信息更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，企业认证信息更新1.0")
    public JSONObject accountMobileCertificationUpdate1(String companyname, String licensenum, String licensenumbegintime, String licensenumendtime, String mastername, String masteridcode, String masteridcodebegintime, String masteridcodeendtime, String address, String licenseurl, String masteridimagefronturl, String masteridimagebackurl, String oillicenseurl) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//企业名称
        map.put("licensenum", licensenum);//统一社会信用代码
        map.put("licensenumbegintime", licensenumbegintime);//营业执照有效期起始日期
        map.put("licensenumendtime", licensenumendtime);//营业执照有效期截止日期
        map.put("mastername", mastername);//企业法人姓名
        map.put("masteridcode", masteridcode);//企业法人身份证号码
        map.put("masteridcodebegintime", masteridcodebegintime);//身份证有效期起始日期
        map.put("masteridcodeendtime", masteridcodeendtime);//身份证有效期截止日期
        map.put("address", address);//详细地址
        map.put("licenseurl", licenseurl);//营业执照图片
        map.put("masteridimagefronturl", masteridimagefronturl);//企业法人身份证正面图片
        map.put("masteridimagebackurl", masteridimagebackurl);//企业法人身份证反面图片
        map.put("oillicenseurl", oillicenseurl);//成品油经营批准证书图片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.certification.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，子账号添加1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，子账号添加1.0")
    public JSONObject accountMobileEmployeeCreate1(String employeename, String employeemobile, String employeerole, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeename", employeename);//姓名
        map.put("employeemobile", employeemobile);//手机号码
        map.put("employeerole", employeerole);//角色,2：店长；3：普通员工
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.employee.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，子账号删除1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，子账号删除1.0")
    public JSONObject accountMobileEmployeeDelete1(String employeeid, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeeid", employeeid);//员工id
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.employee.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，子账号列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，子账号列表查询1.0")
    public JSONObject accountMobileEmployeeList1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.employee.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，子账号修改姓名和角色1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，子账号修改姓名和角色1.0")
    public JSONObject accountMobileEmployeeUpdateName1(String employeename, String employeerole, String employeeid, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeename", employeename);//姓名
        map.put("employeerole", employeerole);//角色,2：店长；3：普通员工
        map.put("employeeid", employeeid);//员工id
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.employee.update.name");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，登录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，登录1.0")
    public JSONObject accountMobileLogon1(String mobilenumber, String password, String platformtype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("password", password);//登录密码
        map.put("devicecode","AND-c1d9579e9a7dff7c");//设备号
        map.put("platformtype", platformtype);//平台类型,1:Android ; 2:IOS
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.logon");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，登出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，登出1.0")
    public JSONObject accountMobileLogout1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.logout");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，子账号修改是否接受消息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，子账号修改是否接受消息1.0")
    public JSONObject accountMobileMessageUpdate1(String flag) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flag", flag);//true:接受 false:不接受
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.message.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，忘记密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，忘记密码1.0")
    public JSONObject accountMobilePasswordForget1(String newpassword, String validatecode, String mobilenumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("validatecode", validatecode);//验证码
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.password.forget");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，忘记密码短信验证码发送1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，忘记密码短信验证码发送1.0")
    public JSONObject accountMobilePasswordForgetSmsSent1(String mobilenumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.password.forget.sms.sent");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，忘记密码短信验证码验证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，忘记密码短信验证码验证1.0")
    public JSONObject accountMobilePasswordForgetSmsVerify1(String mobilenumber, String validatecode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("validatecode", validatecode);//验证码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.password.forget.sms.verify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，修改密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，修改密码1.0")
    public JSONObject accountMobilePasswordUpdate1(String newpassword, String oldpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("oldpassword", oldpassword);//老密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.password.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpassword");
        ignoreParamNames.add("oldpassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，企业注册1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，企业注册1.0")
    public JSONObject accountMobileRegister1(String mobilenumber, String validatecode, String companyname, String companylinker, String companyphone, String password, String platformtype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("validatecode", validatecode);//验证码
        map.put("companyname", companyname);//企业名称
        map.put("companylinker", companylinker);//企业联系人
        map.put("companyphone", companyphone);//企业联系电话
        map.put("password", password);//登录密码
        map.put("devicecode","AND-c1d9579e9a7dff7c");//设备号
        map.put("platformtype", platformtype);//平台类型,1:Android ; 2:IOS
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，注册短信验证码发送1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，注册短信验证码发送1.0")
    public JSONObject accountMobileRegisterSmsSent1(String mobilenumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.mobile.register.sms.sent");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，企业认证信创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，企业认证信创建1.0")
    public JSONObject accountWebCertificationCreate1(String companyname, String licensenum, String licensenumbegintime, String licensenumendtime, String mastername, String masteridcode, String masteridcodebegintime, String masteridcodeendtime, String address, String licenseurl, String masteridimagefronturl, String masteridimagebackurl, String oillicenseurl, String bankaccountname, String bankname, String bankaccount) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//企业名称
        map.put("licensenum", licensenum);//统一社会信用代码
        map.put("licensenumbegintime", licensenumbegintime);//营业执照有效期起始日期
        map.put("licensenumendtime", licensenumendtime);//营业执照有效期截止日期
        map.put("mastername", mastername);//企业法人姓名
        map.put("masteridcode", masteridcode);//企业法人身份证号码
        map.put("masteridcodebegintime", masteridcodebegintime);//身份证有效期起始日期
        map.put("masteridcodeendtime", masteridcodeendtime);//身份证有效期截止日期
        map.put("address", address);//详细地址
        map.put("licenseurl", licenseurl);//营业执照图片
        map.put("masteridimagefronturl", masteridimagefronturl);//企业法人身份证正面图片
        map.put("masteridimagebackurl", masteridimagebackurl);//企业法人身份证反面图片
        map.put("oillicenseurl", oillicenseurl);//成品油经营批准证书图片
        map.put("bankaccountname", bankaccountname);//银行账户开户名
        map.put("bankname", bankname);//开户行（支行）名称
        map.put("bankaccount", bankaccount);//银行账户
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.certification.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，企业认证数据更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，企业认证数据更新1.0")
    public JSONObject accountWebCertificationUpdate1(String companyname, String licensenum, String licensenumbegintime, String licensenumendtime, String mastername, String masteridcode, String masteridcodebegintime, String masteridcodeendtime, String address, String licenseurl, String masteridimagefronturl, String masteridimagebackurl, String oillicenseurl) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//企业名称
        map.put("licensenum", licensenum);//统一社会信用代码
        map.put("licensenumbegintime", licensenumbegintime);//营业执照有效期起始日期
        map.put("licensenumendtime", licensenumendtime);//营业执照有效期截止日期
        map.put("mastername", mastername);//企业法人姓名
        map.put("masteridcode", masteridcode);//企业法人身份证号码
        map.put("masteridcodebegintime", masteridcodebegintime);//身份证有效期起始日期
        map.put("masteridcodeendtime", masteridcodeendtime);//身份证有效期截止日期
        map.put("address", address);//详细地址
        map.put("licenseurl", licenseurl);//营业执照图片
        map.put("masteridimagefronturl", masteridimagefronturl);//企业法人身份证正面图片
        map.put("masteridimagebackurl", masteridimagebackurl);//企业法人身份证反面图片
        map.put("oillicenseurl", oillicenseurl);//成品油经营批准证书图片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.certification.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，子账号添加1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，子账号添加1.0")
    public JSONObject accountWebEmployeeCreate1(String employeename, String employeemobile, String employeerole, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeename", employeename);//姓名
        map.put("employeemobile", employeemobile);//手机号码
        map.put("employeerole", employeerole);//角色,2：店长；3：普通员工
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.employee.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，子账号删除1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，子账号删除1.0")
    public JSONObject accountWebEmployeeDelete1(String employeeid, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeeid", employeeid);//员工id
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.employee.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，子账号列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，子账号列表查询1.0")
    public JSONObject accountWebEmployeeList1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.employee.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，子账号修改姓名1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，子账号修改姓名1.0")
    public JSONObject accountWebEmployeeUpdateName1(String employeename, String employeeid, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeename", employeename);//姓名
        map.put("employeeid", employeeid);//员工id
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.employee.update.name");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，子账号修改角色1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，子账号修改角色1.0")
    public JSONObject accountWebEmployeeUpdateRole1(String employeerole, String employeeid, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeerole", employeerole);//角色,2：店长；3：普通员工
        map.put("employeeid", employeeid);//员工id
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.employee.update.role");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端登录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端登录1.0")
    public JSONObject accountWebLogon1(String mobilenumber, String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("password", password);//登录密码
        map.put("devicecode","AND-c1d9579e9a7dff7c");//设备号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.logon");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，忘记密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，忘记密码1.0")
    public JSONObject accountWebPasswordForget1(String newpassword, String validatecode, String mobilenumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("validatecode", validatecode);//验证码
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.password.forget");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，忘记密码短信验证码发送1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，忘记密码短信验证码发送1.0")
    public JSONObject accountWebPasswordForgetSmsSent1(String mobilenumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.password.forget.sms.sent");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，忘记密码短信验证码验证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，忘记密码短信验证码验证1.0")
    public JSONObject accountWebPasswordForgetSmsVerify1(String mobilenumber, String validatecode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("validatecode", validatecode);//验证码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.password.forget.sms.verify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，修改密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，修改密码1.0")
    public JSONObject accountWebPasswordUpdate1(String newpassword, String oldpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("oldpassword", oldpassword);//老密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.password.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpassword");
        ignoreParamNames.add("oldpassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端登录企业注册1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端登录企业注册1.0")
    public JSONObject accountWebRegister1(String mobilenumber, String validatecode, String companyname, String companylinker, String companyphone, String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("validatecode", validatecode);//验证码
        map.put("companyname", companyname);//企业名称
        map.put("companylinker", companylinker);//企业联系人
        map.put("companyphone", companyphone);//企业联系电话
        map.put("password", password);//登录密码
        map.put("devicecode","AND-c1d9579e9a7dff7c");//设备号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，注册短信验证码发送1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，注册短信验证码发送1.0")
    public JSONObject accountWebRegisterSmsSent1(String mobilenumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilenumber", mobilenumber);//手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.web.register.sms.sent");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，行政区划逆地理编码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，行政区划逆地理编码1.0")
    public JSONObject commonMobileRegionReverse1(String longitude, String latitude) {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.mobile.region.reverse");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，企业信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，企业信息查询1.0")
    public JSONObject companyMobileDetail1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.mobile.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，最新版的企业信息,认证更新中的数据1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，最新版的企业信息,认证更新中的数据1.0")
    public JSONObject companyMobileDetailNew1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.mobile.detail.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，修改企业联系人、联系电话1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，修改企业联系人、联系电话1.0")
    public JSONObject companyMobileLinkerUpdate1(String companylinker, String companyphone) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companylinker", companylinker);//企业联系人
        map.put("companyphone", companyphone);//企业联系电话
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.mobile.linker.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，企业信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，企业信息查询1.0")
    public JSONObject companyWebDetail1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.web.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，最新版的企业信息,认证更新中的数据1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，最新版的企业信息,认证更新中的数据1.0")
    public JSONObject companyWebDetailNew1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.web.detail.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，修改企业联系人、联系电话1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，修改企业联系人、联系电话1.0")
    public JSONObject companyWebLinkerUpdate1(String companylinker, String companyphone) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companylinker", companylinker);//企业联系人
        map.put("companyphone", companyphone);//企业联系电话
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.web.linker.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，查询钱包明细列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，查询钱包明细列表1.0")
    public JSONObject financeMobileWalletDetailList1(String yearMonth, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("yearMonth", yearMonth);//按月份查询yyyy-MM
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.detail.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，设置修改钱包密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，设置修改钱包密码1.0")
    public JSONObject financeMobileWalletEditpwd1(String newpassword, String confirmpassword, String oldpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("confirmpassword", confirmpassword);//确认新密码
        map.put("oldpassword", oldpassword);//旧密码，为空时设置密码，不为空修改密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.editpwd");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpassword");
        ignoreParamNames.add("confirmpassword");
        ignoreParamNames.add("oldpassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，查询钱包的基本信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，查询钱包的基本信息1.0")
    public JSONObject financeMobileWalletQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//session

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，发送验证码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，发送验证码1.0")
    public JSONObject financeMobileWalletSendsms1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.sendsms");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//session

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，法人信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，法人信息1.0")
    public JSONObject financeMobileWalletValidcard1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.validcard");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//session

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，验证是否设置支付密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，验证是否设置支付密码1.0")
    public JSONObject financeMobileWalletValidpwd1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.validpwd");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//session

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，验证短信验证码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，验证短信验证码1.0")
    public JSONObject financeMobileWalletValidsms1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.validsms");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，钱包提现1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，钱包提现1.0")
    public JSONObject financeMobileWalletWithdrawal1(String password, String payPrice) {
        HashMap<String, String> map = new HashMap<>();
        map.put("password", password);//支付密码
        map.put("payPrice", payPrice);//支付金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.mobile.wallet.withdrawal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，查询钱包明细列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，查询钱包明细列表1.0")
    public JSONObject financeWebWalletDetailList1(String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.web.wallet.detail.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，查询钱包明细列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，查询钱包明细列表导出1.0")
    public JSONObject financeWebWalletDetailListExport1(String begintime, String endtime) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.web.wallet.detail.list.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，查询钱包1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，查询钱包1.0")
    public JSONObject financeWebWalletQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session",session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finance.web.wallet.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品创建1.0")
    public JSONObject goodsMobileCreate1(String goodsminclassid, String goodsminclassname, String goodsspecid, String goodsspecname, String marketprice, String withtaxprice, String onsaleprice, String futuremarketprice, String futurewithtaxprice, String futureonsaleprice, String futurevalidtime, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsminclassid", goodsminclassid);//商品最小分类id
        map.put("goodsminclassname", goodsminclassname);//商品最小分类名称
        map.put("goodsspecid", goodsspecid);//商品规格id
        map.put("goodsspecname", goodsspecname);//商品规格名称
        map.put("marketprice", marketprice);//市场价,单位元，精度两位小数，例如，12.45
        map.put("withtaxprice", withtaxprice);//含税价,单位元，精度两位小数，例如，12.45
        map.put("onsaleprice", onsaleprice);//优惠价,单位元，精度两位小数，例如，12.45
        map.put("futuremarketprice", futuremarketprice);//预约市场价,单位元，精度两位小数，例如，12.45
        map.put("futurewithtaxprice", futurewithtaxprice);//预约含税价,单位元，精度两位小数，例如，12.45
        map.put("futureonsaleprice", futureonsaleprice);//预约优惠价,单位元，精度两位小数，例如，12.45
        map.put("futurevalidtime", futurevalidtime);//预约有效时间
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品删除1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品删除1.0")
    public JSONObject goodsMobileDelete1(String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品删除预约的价格1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品删除预约的价格1.0")
    public JSONObject goodsMobileDeleteFutureprice1(String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.delete.futureprice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品详细信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品详细信息1.0")
    public JSONObject goodsMobileDetail1(String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品描述列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品描述列表1.0")
    public JSONObject goodsMobileGoodsdescList1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.goodsdesc.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品列表，含价格1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品列表，含价格1.0")
    public JSONObject goodsMobileList1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，商品更新：更新当前价格、更新预约价格1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，商品更新：更新当前价格、更新预约价格1.0")
    public JSONObject goodsMobileUpdate1(String goodsskuid, String marketprice, String withtaxprice, String onsaleprice, String futuremarketprice, String futurewithtaxprice, String futureonsaleprice, String futurevalidtime, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("marketprice", marketprice);//市场价,单位元，精度两位小数，例如，12.45
        map.put("withtaxprice", withtaxprice);//含税价,单位元，精度两位小数，例如，12.45
        map.put("onsaleprice", onsaleprice);//优惠价,单位元，精度两位小数，例如，12.45
        map.put("futuremarketprice", futuremarketprice);//预约市场价,单位元，精度两位小数，例如，12.45
        map.put("futurewithtaxprice", futurewithtaxprice);//预约含税价,单位元，精度两位小数，例如，12.45
        map.put("futureonsaleprice", futureonsaleprice);//预约优惠价,单位元，精度两位小数，例如，12.45
        map.put("futurevalidtime", futurevalidtime);//预约有效时间
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.mobile.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品创建1.0")
    public JSONObject goodsWebCreate1(String goodsminclassid, String goodsminclassname, String goodsspecid, String goodsspecname, String marketprice, String withtaxprice, String onsaleprice, String futuremarketprice, String futurewithtaxprice, String futureonsaleprice, String futurevalidtime, String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsminclassid", goodsminclassid);//商品最小分类id
        map.put("goodsminclassname", goodsminclassname);//商品最小分类名称
        map.put("goodsspecid", goodsspecid);//商品规格id
        map.put("goodsspecname", goodsspecname);//商品规格名称
        map.put("marketprice", marketprice);//市场价,单位元，精度两位小数，例如，12.45
        map.put("withtaxprice", withtaxprice);//含税价,单位元，精度两位小数，例如，12.45
        map.put("onsaleprice", onsaleprice);//优惠价,单位元，精度两位小数，例如，12.45
        map.put("futuremarketprice", futuremarketprice);//预约市场价,单位元，精度两位小数，例如，12.45
        map.put("futurewithtaxprice", futurewithtaxprice);//预约含税价,单位元，精度两位小数，例如，12.45
        map.put("futureonsaleprice", futureonsaleprice);//预约优惠价,单位元，精度两位小数，例如，12.45
        map.put("futurevalidtime", futurevalidtime);//预约有效时间
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品删除1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品删除1.0")
    public JSONObject goodsWebDelete1(String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品删除预约的价格1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品删除预约的价格1.0")
    public JSONObject goodsWebDeleteFutureprice1(String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.delete.futureprice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品详细信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品详细信息1.0")
    public JSONObject goodsWebDetail1(String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品描述列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品描述列表1.0")
    public JSONObject goodsWebGoodsdescList1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.goodsdesc.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品列表，含价格1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品列表，含价格1.0")
    public JSONObject goodsWebList1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品未来价格更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品未来价格更新1.0")
    public JSONObject goodsWebUpdateFutureprice1(String futuremarketprice, String futurewithtaxprice, String futureonsaleprice, String futurevalidtime, String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("futuremarketprice", futuremarketprice);//预约市场价,单位元，精度两位小数，例如，12.45
        map.put("futurewithtaxprice", futurewithtaxprice);//预约含税价,单位元，精度两位小数，例如，12.45
        map.put("futureonsaleprice", futureonsaleprice);//预约优惠价,单位元，精度两位小数，例如，12.45
        map.put("futurevalidtime", futurevalidtime);//预约有效时间
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.update.futureprice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，商品当前价格更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，商品当前价格更新1.0")
    public JSONObject goodsWebUpdatePrice1(String marketprice, String withtaxprice, String onsaleprice, String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("marketprice", marketprice);//市场价,单位元，精度两位小数，例如，12.45
        map.put("withtaxprice", withtaxprice);//含税价,单位元，精度两位小数，例如，12.45
        map.put("onsaleprice", onsaleprice);//优惠价,单位元，精度两位小数，例如，12.45
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "goods.web.update.price");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，企业认证资料修改/油品修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，企业认证资料修改/油品修改1.0")
    public JSONObject operationCompanyAuthdataUpdate1(String lincenceurl, String idcardfrontphotourl, String idcardbackphotourl, String oillicenceurl, String goodsdesclist, String companysn) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lincenceurl", lincenceurl);//营业执照片
        map.put("idcardfrontphotourl", idcardfrontphotourl);//法人身份证正面照片
        map.put("idcardbackphotourl", idcardbackphotourl);//法人身份证反面照片
        map.put("oillicenceurl", oillicenceurl);//成品油经营批准证书
        map.put("goodsdesclist", goodsdesclist);//商品品项列表
        map.put("companysn", companysn);//企业编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.authdata.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，企业认证(取消认证)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，企业认证(取消认证)1.0")
    public JSONObject operationCompanyCertifyCancel1(String companysn, String memo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companysn", companysn);//企业编号
        map.put("memo", memo);//原因描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.certify.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，企业认证(认证失败)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，企业认证(认证失败)1.0")
    public JSONObject operationCompanyCertifyFailed1(String companysn, String memo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companysn", companysn);//企业编号
        map.put("memo", memo);//原因描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.certify.failed");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，企业认证(认证通过)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，企业认证(认证通过)1.0")
    public JSONObject operationCompanyCertifySuccess1(String companysn) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companysn", companysn);//企业编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.certify.success");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，商品价差修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，商品价差修改1.0")
    public JSONObject operationCompanyPricediffUpdate1(String favorablepricediff, String taxinclusivepricediff, String goodsskuid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("favorablepricediff", favorablepricediff);//商品优惠价差
        map.put("taxinclusivepricediff", taxinclusivepricediff);//商品含税价差
        map.put("goodsskuid", goodsskuid);//商品skuid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.pricediff.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，企业认证(更新失败)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，企业认证(更新失败)1.0")
    public JSONObject operationCompanyUpdateFailed1(String companysn, String memo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companysn", companysn);//企业编号
        map.put("memo", memo);//原因描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.update.failed");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，企业认证(更新通过)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，企业认证(更新通过)1.0")
    public JSONObject operationCompanyUpdateSuccess1(String companysn) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companysn", companysn);//企业编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.company.update.success");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，商品品项列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，商品品项列表1.0")
    public JSONObject operationGoodsItemslist1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.goods.itemslist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，确认发票、复核、确认打款1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，确认发票、复核、确认打款1.0")
    public JSONObject operationOrderSettlement1(String ids, String state) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ids", ids);//订单ID组
        map.put("state", state);//请求接口类型，INVOICE-确认发票，REVIEW-复核，SETTLEMENT-结算
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.order.settlement");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运营端，修改店铺费率1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运营端，修改店铺费率1.0")
    public JSONObject operationStoreScaleUpdate1(String storeId, String scale) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//企业店铺ID
        map.put("scale", scale);//企业店铺费率，小数：4.5% = 0.045
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "operation.store.scale.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，订单详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，订单详情1.0")
    public JSONObject orderMobileDetail1(String orderno) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderno", orderno);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.mobile.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，订单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，订单列表查询1.0")
    public JSONObject orderMobileList1(String begintime, String endtime, String currentpage, String pagesize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.mobile.list");//接口路径
        map.put("session", session);
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，订单搜索1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，订单搜索1.0")
    public JSONObject orderMobileSearch1(String keyword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字，买家手机号、订单号、司机姓名、站点名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.mobile.search");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，订单详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，订单详情1.0")
    public JSONObject orderWebDetail1(String orderno) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderno", orderno);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.web.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，订单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，订单列表查询1.0")
    public JSONObject orderWebList1(String keyword, String storeid, String begintime, String endtime, String currentpage, String pagesize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字，买家手机号、订单号、司机姓名、站点名称
        map.put("storeid", storeid);//店铺id
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("session",session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.web.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，订单列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，订单列表导出1.0")
    public JSONObject orderWebListDownload1(String keyword, String storeid, String begintime, String endtime) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字，买家手机号、订单号、司机姓名、站点名称
        map.put("storeid", storeid);//店铺id
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.web.list.download");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺商品分类统计列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺商品分类统计列表1.0")
    public JSONObject storeMobileClassStatisticsList1(String csid, String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("csid", csid);//店铺ID
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.class.statistics.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，创建店铺1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，创建店铺1.0")
    public JSONObject storeMobileCreate1(String storename, String storeaddress, String linkerphone, String licenseurl, String storefronturl, String servicetype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storename", storename);//店铺名称
        map.put("storeaddress", storeaddress);//店铺地址
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("linkerphone", linkerphone);//联系电话
        map.put("licenseurl", licenseurl);//经营许可证
        map.put("storefronturl", storefronturl);//店铺前照
        map.put("servicetype", servicetype);//服务类型 1:油 2:气 3:油和气
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，删除店铺1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，删除店铺1.0")
    public JSONObject storeMobileDelete1(String id) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//目标id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺详情1.0")
    public JSONObject storeMobileDetail1(String id) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//目标id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺列表1.0")
    public JSONObject storeMobileList1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺详情统计1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺详情统计1.0")
    public JSONObject storeMobileStatisticsDetail1(String storeid, String flag, String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//站点id
        map.put("flag", flag);//是否含税 0全部 1含税 2不含税
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.statistics.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺统计列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺统计列表1.0")
    public JSONObject storeMobileStatisticsList1(String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.statistics.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺列表1.0")
    public JSONObject storeMobileStatisticsStore1(String storeid, String flag, String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//站点id
        map.put("flag", flag);//是否含税 0全部 1含税 2不含税
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.statistics.store");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺营业状态更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺营业状态更新1.0")
    public JSONObject storeMobileStatusUpdate1(String storeid, String storestatus) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//站点id
        map.put("storestatus", storestatus);//站点状态,1:营业；0：歇业
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.status.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，更新店铺1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，更新店铺1.0")
    public JSONObject storeMobileUpdate1(String storeid, String storename, String storeaddress, String linkerphone, String licenseurl, String storefronturl, String servicetype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//站点id
        map.put("storename", storename);//店铺名称
        map.put("storeaddress", storeaddress);//店铺地址
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("linkerphone", linkerphone);//联系电话
        map.put("licenseurl", licenseurl);//经营许可证
        map.put("storefronturl", storefronturl);//店铺前照
        map.put("servicetype", servicetype);//服务类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改二维码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改二维码1.0")
    public JSONObject storeUpdateQrcode1(String id) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//目标id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.update.qrcode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，修改油气站类型 国营还是民营1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，修改油气站类型 国营还是民营1.0")
    public JSONObject storeWebChangeStoreflag1(String storeId, String storeFlag) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//店铺id
        map.put("storeFlag", storeFlag);//店铺类型，1.国营，2.民营
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.change.storeflag");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺商品分类统计列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺商品分类统计列表1.0")
    public JSONObject storeWebClassStatisticsList1(String goodsName, String csid, String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsName", goodsName);//商品名称
        map.put("csid", csid);//店铺ID
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.class.statistics.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺商品分类统计列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺商品分类统计列表导出1.0")
    public JSONObject storeWebClassStatisticsListExport1(String goodsName, String csid, String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("goodsName", goodsName);//商品名称
        map.put("csid", csid);//店铺ID
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.class.statistics.list.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺创建1.0")
    public JSONObject storeWebCreate1(String employeename, String employeemobile, String storename, String storeaddress, String linkerphone, String licenseurl, String storefronturl, String servicetype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("employeename", employeename);//店长姓名
        map.put("employeemobile", employeemobile);//店长手机号码
        map.put("storename", storename);//店铺名称
        map.put("storeaddress", storeaddress);//店铺地址
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("linkerphone", linkerphone);//联系电话
        map.put("licenseurl", licenseurl);//经营许可证
        map.put("storefronturl", storefronturl);//店铺前照
        map.put("servicetype", servicetype);//服务类型 1:油 2:气 3:油和气
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，删除店铺1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，删除店铺1.0")
    public JSONObject storeWebDelete1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺详情1.0")
    public JSONObject storeWebDetail1(String storeid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//店铺id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺列表1.0")
    public JSONObject storeWebList1(String regioncode, String keyword, String currentpage, String pagesize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//需要查询的最小行政区划code
        map.put("keyword", keyword);//搜索关键字，店铺名称，店铺详细地址，站长姓名
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("session",session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺列表导出1.0")
    public JSONObject storeWebListExport1(String regioncode, String keyword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//需要查询的最小行政区划code
        map.put("keyword", keyword);//搜索关键字，店铺名称，店铺详细地址，站长姓名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.list.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺统计列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺统计列表1.0")
    public JSONObject storeWebStatisticsList1(String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.statistics.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺统计列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺统计列表导出1.0")
    public JSONObject storeWebStatisticsListExport1(String begintime, String endtime, String currentpage, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间,大于等于,包含这一秒
        map.put("endtime", endtime);//截止时间，小于,不包含这一秒
        map.put("currentpage", currentpage);//当前页，第一页为1
        map.put("pagesize", pagesize);//每页元素个数，最大1000,最小1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.statistics.list.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，店铺营业状态更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，店铺营业状态更新1.0")
    public JSONObject storeWebStatusUpdate1(String storeid, String storestatus) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//站点id
        map.put("storestatus", storestatus);//站点状态,1:营业；0：歇业
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.status.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端，更新店铺1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("web端，更新店铺1.0")
    public JSONObject storeWebUpdate1(String storeid, String storename, String storeaddress, String linkerphone, String licenseurl, String storefronturl, String servicetype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeid", storeid);//站点id
        map.put("storename", storename);//店铺名称
        map.put("storeaddress", storeaddress);//店铺地址
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("linkerphone", linkerphone);//联系电话
        map.put("licenseurl", licenseurl);//经营许可证
        map.put("storefronturl", storefronturl);//店铺前照
        map.put("servicetype", servicetype);//服务类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.web.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }
}
