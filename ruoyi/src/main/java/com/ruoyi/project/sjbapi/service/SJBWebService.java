package com.ruoyi.project.sjbapi.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.SignUtil;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * SJBweb服务相关接口
 */
public class SJBWebService {

    private static String url = "http://sjb-service.sijibao.co/sjbWeb/router";
    private static String appcode = "100094";


    /**
     * 账户信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("账户信息查询1.0")
    public JSONObject accountInfoQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.info.query");//接口路径
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
     * 通过id查询广告页详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过id查询广告页详情1.0")
    public JSONObject adQueryBydriveryearid1(String driverYearId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("driverYearId", driverYearId);//广告页详情id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ad.query.bydriveryearid");//接口路径
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
     * 通过企业查询经纪人列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过企业查询经纪人列表1.0")
    public JSONObject agentListCompany1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.list.company");//接口路径
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
     * 经纪人搜索列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("经纪人搜索列表1.0")
    public JSONObject agentSearch1(String username, String usermobile, String start, String limit, String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", username);//经纪人姓名，模糊匹配
        map.put("usermobile", usermobile);//经纪人手机号,模糊匹配
        map.put("start", start);//起始标记，第一个元素0
        map.put("limit", limit);//起始标记， 每页最大显示数
        map.put("usercode", usercode);//用户code
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.search");//接口路径
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
     * 余额明细导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("余额明细导出1.0")
    public JSONObject balanceDetailExport1(String beginTime, String endTime, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginTime", beginTime);//查询开始时间 可空
        map.put("endTime", endTime);//查询截止时间 可空
        map.put("start", start);//起始标记，第一个元素0
        map.put("limit", limit);//起始标记， 每页最大显示数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "balance.detail.export");//接口路径
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
     * 余额明细1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("余额明细1.0")
    public JSONObject balanceDetailQuery1(String beginTime, String endTime, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginTime", beginTime);//查询开始时间 可空
        map.put("endTime", endTime);//查询截止时间 可空
        map.put("start", start);//起始标记，第一个元素0
        map.put("limit", limit);//起始标记， 每页最大显示数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "balance.detail.query");//接口路径
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
     * 校验手机验证码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("校验手机验证码1.0")
    public JSONObject carrierCheckIdentifyCode1(String phone, String identifycode, String identifytype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//手机号
        map.put("identifycode", identifycode);//验证码
        map.put("identifytype", identifytype);//验证码业务类型,忘记密码：966，修改密码：965
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.check.identify.code");//接口路径
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
     * 校验支付相关验证码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("校验支付相关验证码1.0")
    public JSONObject carrierCheckPayIdentifyCode1(String phone, String identifycode, String identifytype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//手机号
        map.put("identifycode", identifycode);//验证码
        map.put("identifytype", identifytype);//验证码业务类型,忘记密码：966，修改密码：965
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.check.pay.identify.code");//接口路径
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
     * 企业信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业信息1.0")
    public JSONObject carrierCompanyInfoQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.company.info.query");//接口路径
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
     * 提现1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("提现1.0")
    public JSONObject carrierCompanyTransFee1(String cashoutamount, String paypassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cashoutamount", cashoutamount);//提现金额
        map.put("paypassword", paypassword);//支付密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.company.trans.fee");//接口路径
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
     * 初次设置支付密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("初次设置支付密码1.0")
    public JSONObject carrierFirstSetPayPwssord1(String newpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.first.set.pay.pwssord");//接口路径
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
     * 忘记登录密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("忘记登录密码1.0")
    public JSONObject carrierForgetPassword1(String phone, String identifycode, String identifytype, String newpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//手机号
        map.put("identifycode", identifycode);//验证码
        map.put("identifytype", identifytype);//验证码
        map.put("newpassword", newpassword);//新密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.forget.password");//接口路径
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
     * 忘记支付密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("忘记支付密码1.0")
    public JSONObject carrierForgetPayPwssord1(String newpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.forget.pay.pwssord");//接口路径
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
     * 获取验证码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("获取验证码1.0")
    public JSONObject carrierGetIdentifyCode1(String phone, String type) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//手机号
        map.put("type", type);//业务类型,忘记密码：966，修改密码：965
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.get.identify.code");//接口路径
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
     * 多级承运人登录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("多级承运人登录1.0")
    public JSONObject carrierLogin1(String phone, String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//手机号
        map.put("password", password);//密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.login");//接口路径
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
     * 校验旧支付密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("校验旧支付密码1.0")
    public JSONObject carrierPayPwssordValidate1(String oldpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldpassword", oldpassword);//旧密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.pay.pwssord.validate");//接口路径
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
     * 与支付相关的短信验证码获取1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("与支付相关的短信验证码获取1.0")
    public JSONObject carrierPaySendIdentifycode1(String phone, String type) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//手机号
        map.put("type", type);//业务类型,忘记密码：966，修改密码：965
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.pay.send.identifycode");//接口路径
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
     * 修改登录密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改登录密码1.0")
    public JSONObject carrierUpdatePassword1(String newpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.update.password");//接口路径
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
     * 修改支付密码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改支付密码1.0")
    public JSONObject carrierUpdatePayPwssord1(String newpassword, String oldpassword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("newpassword", newpassword);//新密码
        map.put("oldpassword", oldpassword);//旧密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "carrier.update.pay.pwssord");//接口路径
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
     * 查询字典列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询字典列表1.0")
    public JSONObject commonDictitemQuery1(String dicttypecode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dicttypecode", dicttypecode);//字典类型code，比如车长是：VehicleLength
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.query");//接口路径
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
     * 字典-货物类型列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("字典-货物类型列表1.0")
    public JSONObject commonDictitemStockkind1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.stockkind");//接口路径
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
     * 字典-车辆拖挂轮轴列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("字典-车辆拖挂轮轴列表1.0")
    public JSONObject commonDictitemVehicleaxle1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.vehicleaxle");//接口路径
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
     * 字典-车长列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("字典-车长列表1.0")
    public JSONObject commonDictitemVehiclelength1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.vehiclelength");//接口路径
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
     * 字典-车辆特殊功能列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("字典-车辆特殊功能列表1.0")
    public JSONObject commonDictitemVehiclespecial1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.vehiclespecial");//接口路径
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
     * 查询区域列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询区域列表1.0")
    public JSONObject commonRegionList1(String regioncode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.list");//接口路径
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
     * 区划查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("区划查询1.0")
    public JSONObject commonRegionQuery1(String regioncode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//区划code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.query");//接口路径
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
     * 企业添加经纪人1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业添加经纪人1.0")
    public JSONObject companyAddAgent1(String agentusercode, String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentusercode", agentusercode);//经纪人usercode
        map.put("usercode", usercode);//用户code
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.add.agent");//接口路径
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
     * 企业子账号绑定经纪人1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业子账号绑定经纪人1.0")
    public JSONObject companyMemberBindAgent1(String companymembercode, String agentusercodes, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companymembercode", companymembercode);//企业子账号code
        map.put("agentusercodes", agentusercodes);//经纪人usercode,多个用逗号隔开
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.bind.agent");//接口路径
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
     * 企业子账号列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业子账号列表1.0")
    public JSONObject companyMemberList1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.list");//接口路径
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
     * 企业子账号解绑经纪人1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业子账号解绑经纪人1.0")
    public JSONObject companyMemberUnbindAgent1(String companymembercode, String agentusercodes, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companymembercode", companymembercode);//企业子账号code
        map.put("agentusercodes", agentusercodes);//经纪人usercode,多个用逗号隔开
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.unbind.agent");//接口路径
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
     * 企业删除经纪人1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业删除经纪人1.0")
    public JSONObject companyRemoveAgent1(String agentusercodes, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentusercodes", agentusercodes);//经纪人usercode,多个用逗号隔开
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.remove.agent");//接口路径
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
     * 客户列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("客户列表查询1.0")
    public JSONObject customerListQuery1(String querykey, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querykey", querykey);//查询关键字
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页截止
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "customer.list.query");//接口路径
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
     * 提现手续费查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("提现手续费查询1.0")
    public JSONObject handlingFeeQuery1(String withdAmt) {
        HashMap<String, String> map = new HashMap<>();
        map.put("withdAmt", withdAmt);//提现金额，非必填
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "handling.fee.query");//接口路径
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
     * 应付账期报表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("应付账期报表1.0")
    public JSONObject laterResultCompany1(String startTime, String endTime, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//开始时间 yyyy-MM-dd HH:mm:ss
        map.put("endTime", endTime);//结束时间 yyyy-MM-dd HH:mm:ss
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "later.result.company");//接口路径
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
     * 运单多级复合详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单多级复合详情1.0")
    public JSONObject orderCheckMultiDetail1(String keyword, String loadAddressCode, String loadAddressRegionCode, String uploadAddressCode, String uploadAddressRegionCode, String beginTime, String endTime, String checkstate, String signPeopleMobile, String isChief, String start, String limit, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字:接单司机姓名，电话，车牌；收单员名字，运单号
        map.put("loadAddressCode", loadAddressCode);//装货地code
        map.put("loadAddressRegionCode", loadAddressRegionCode);//装货地行政区划code
        map.put("uploadAddressCode", uploadAddressCode);//卸货地code
        map.put("uploadAddressRegionCode", uploadAddressRegionCode);//卸货地行政区划code
        map.put("beginTime", beginTime);//收单员提交起始时间
        map.put("endTime", endTime);//收单员提交截止时间
        map.put("checkstate", checkstate);//0 所有 1待复核 2未通过财务审核 3待财务审核 4待业务审核 5已审核，待付款 6已付款
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("isChief", isChief);//是否是总监 0不是 1是
        map.put("start", start);//起始位置
        map.put("limit", limit);//每页最大显示数
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.check.multi.detail");//接口路径
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
     * 运单多级复合列表2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单多级复合列表2.0")
    public JSONObject orderCheckMultiList2(String keyword, String loadAddressRegionCode, String uploadAddressRegionCode, String beginTime, String endTime, String checkState, String signPeopleMobile, String orderType, String start, String limit, String filterState, String sourceAddressName, String targetAddressName, String timequerytype, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字:接单司机姓名，电话，车牌；收单员名字，运单号
        map.put("loadAddressRegionCode", loadAddressRegionCode);//装货地行政区划code
        map.put("uploadAddressRegionCode", uploadAddressRegionCode);//卸货地行政区划code
        map.put("beginTime", beginTime);//收单员提交起始时间
        map.put("endTime", endTime);//收单员提交截止时间
        map.put("checkState", checkState);//1待复核 2已复核
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("orderType", orderType);//1 一级 2 二级 3 三级
        map.put("start", start);//起始位置
        map.put("limit", limit);//每页最大显示数
        map.put("filterState", filterState);//复核赛选状态 1(1,待一级复核 2,待二级级复核 3,待三级复核) 2(1，已拒绝 2支付中 3已复核)
        map.put("sourceAddressName", sourceAddressName);//发货地详细地址名称
        map.put("targetAddressName", targetAddressName);//卸货地详细地址名称
        map.put("timequerytype", timequerytype);//时间查询类型 0 签收 1接单 2复核
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.check.multi.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单多级复合列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单多级复合列表1.0")
    public JSONObject orderCheckMultiList1(String keyword, String loadAddressCode, String loadAddressRegionCode, String uploadAddressCode, String uploadAddressRegionCode, String beginTime, String endTime, String checkstate, String signPeopleMobile, String isChief, String start, String limit, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字:接单司机姓名，电话，车牌；收单员名字，运单号
        map.put("loadAddressCode", loadAddressCode);//装货地code
        map.put("loadAddressRegionCode", loadAddressRegionCode);//装货地行政区划code
        map.put("uploadAddressCode", uploadAddressCode);//卸货地code
        map.put("uploadAddressRegionCode", uploadAddressRegionCode);//卸货地行政区划code
        map.put("beginTime", beginTime);//收单员提交起始时间
        map.put("endTime", endTime);//收单员提交截止时间
        map.put("checkstate", checkstate);//0 所有 1待复核 2未通过财务审核 3待财务审核 4待业务审核 5已审核，待付款 6已付款
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("isChief", isChief);//是否是总监 0不是 1是
        map.put("start", start);//起始位置
        map.put("limit", limit);//每页最大显示数
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.check.multi.list");//接口路径
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
     * 运单多级复合列表导出2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单多级复合列表导出2.0")
    public JSONObject orderCheckMultiListExport2(String keyword, String loadAddressRegionCode, String uploadAddressRegionCode, String beginTime, String endTime, String checkState, String signPeopleMobile, String orderType, String start, String limit, String filterState, String sourceAddressName, String targetAddressName, String timequerytype, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字:接单司机姓名，电话，车牌；收单员名字，运单号
        map.put("loadAddressRegionCode", loadAddressRegionCode);//装货地行政区划code
        map.put("uploadAddressRegionCode", uploadAddressRegionCode);//卸货地行政区划code
        map.put("beginTime", beginTime);//收单员提交起始时间
        map.put("endTime", endTime);//收单员提交截止时间
        map.put("checkState", checkState);//1待复核 2已复核
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("orderType", orderType);//1 一级 2 二级 3 三级
        map.put("start", start);//起始位置
        map.put("limit", limit);//每页最大显示数
        map.put("filterState", filterState);//复核赛选状态 1(1,待一级复核 2,待二级级复核 3,待三级复核) 2(1，已拒绝 2支付中 3已复核)
        map.put("sourceAddressName", sourceAddressName);//发货地详细地址名称
        map.put("targetAddressName", targetAddressName);//卸货地详细地址名称
        map.put("timequerytype", timequerytype);//时间查询类型 0 签收 1接单 2复核
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.check.multi.list.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单多级复合列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单多级复合列表导出1.0")
    public JSONObject orderCheckMultiListExport1(String keyword, String loadAddressCode, String loadAddressRegionCode, String uploadAddressCode, String uploadAddressRegionCode, String beginTime, String endTime, String checkstate, String signPeopleMobile, String isChief, String start, String limit, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字:接单司机姓名，电话，车牌；收单员名字，运单号
        map.put("loadAddressCode", loadAddressCode);//装货地code
        map.put("loadAddressRegionCode", loadAddressRegionCode);//装货地行政区划code
        map.put("uploadAddressCode", uploadAddressCode);//卸货地code
        map.put("uploadAddressRegionCode", uploadAddressRegionCode);//卸货地行政区划code
        map.put("beginTime", beginTime);//收单员提交起始时间
        map.put("endTime", endTime);//收单员提交截止时间
        map.put("checkstate", checkstate);//0 所有 1待复核 2未通过财务审核 3待财务审核 4待业务审核 5已审核，待付款 6已付款
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("isChief", isChief);//是否是总监 0不是 1是
        map.put("start", start);//起始位置
        map.put("limit", limit);//每页最大显示数
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.check.multi.list.export");//接口路径
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
     * 运单汇总列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单汇总列表1.0")
    public JSONObject orderGatherList1(String beginTime, String endTime, String orderMainState, String keyword, String sourceAddressCode, String targetAddressCode, String sourceRegionCode, String targetRegionCode, String start, String limit, String sourceAddressName, String targetAddressName, String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginTime", beginTime);//运单创建时间，起始
        map.put("endTime", endTime);//运单创建时间，截止
        map.put("orderMainState", orderMainState);//1、全部；2、待装货；3、配送中；4、协商中；5、历史运单；6、取消运单
        map.put("keyword", keyword);//接单司机车牌号、接单司机姓名、接单司机手机号、下单人姓名、运单号进行模糊匹配
        map.put("sourceAddressCode", sourceAddressCode);//发货地详细地址code
        map.put("targetAddressCode", targetAddressCode);//卸货地详细地址code
        map.put("sourceRegionCode", sourceRegionCode);//出发地行政区划编码，省、地市、区县三级均可，服务自动识别
        map.put("targetRegionCode", targetRegionCode);//目的地行政区划编码，省、地市、区县三级均可，服务自动识别
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sourceAddressName", sourceAddressName);//发货地详细地址名称
        map.put("targetAddressName", targetAddressName);//卸货地详细地址名称
        map.put("usercode", usercode);//用户code
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.gather.list");//接口路径
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
     * 运单汇总列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单汇总列表导出1.0")
    public JSONObject orderGatherListExport1(String beginTime, String endTime, String orderMainState, String keyword, String sourceAddressCode, String targetAddressCode, String sourceRegionCode, String targetRegionCode, String sourceAddressName, String targetAddressName, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginTime", beginTime);//运单创建时间，起始
        map.put("endTime", endTime);//运单创建时间，截止
        map.put("orderMainState", orderMainState);//1、全部；2、待装货；3、配送中；4、协商中；5、历史运单；6、取消运单
        map.put("keyword", keyword);//接单司机车牌号、接单司机姓名、接单司机手机号、下单人姓名、运单号进行模糊匹配
        map.put("sourceAddressCode", sourceAddressCode);//发货地详细地址code
        map.put("targetAddressCode", targetAddressCode);//卸货地详细地址code
        map.put("sourceRegionCode", sourceRegionCode);//出发地行政区划编码，省、地市、区县三级均可，服务自动识别
        map.put("targetRegionCode", targetRegionCode);//目的地行政区划编码，省、地市、区县三级均可，服务自动识别
        map.put("sourceAddressName", sourceAddressName);//发货地详细地址名称
        map.put("targetAddressName", targetAddressName);//卸货地详细地址名称
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.gather.list.export");//接口路径
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
     * 运单列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单列表导出1.0")
    public JSONObject orderListExport1(String orderstate, String orderfilterstate, String querykey, String ordercreatetimestart, String ordercreatetimeend, String sourceaddresscode, String targetaddresscode, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderstate", orderstate);//运单状态 1.查询全部，2.在途，3.已完成
        map.put("orderfilterstate", orderfilterstate);//运单过滤小状态 0.全部，1.待装货，2.配送中，3.协商中，4.已取消，5.已失效，6.已完成，7.待评价，8.已评价
        map.put("querykey", querykey);//搜索关键字
        map.put("ordercreatetimestart", ordercreatetimestart);//下单时间
        map.put("ordercreatetimeend", ordercreatetimeend);//下单时间
        map.put("sourceaddresscode", sourceaddresscode);//运单发货地编码
        map.put("targetaddresscode", targetaddresscode);//运单到货地编码
        map.put("start", start);//起始标记，第一个元素0
        map.put("limit", limit);//起始标记， 每页最大显示数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.list.export");//接口路径
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
     * 运单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单列表查询1.0")
    public JSONObject orderListQuery1(String orderstate, String orderfilterstate, String querykey, String ordercreatetimestart, String ordercreatetimeend, String sourceaddresscode, String targetaddresscode, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderstate", orderstate);//运单状态 1.查询全部，2.在途，3.已完成
        map.put("orderfilterstate", orderfilterstate);//运单过滤小状态 0.全部，1.待装货，2.配送中，3.协商中，4.已取消，5.已失效，6.已完成，7.待评价，8.已评价
        map.put("querykey", querykey);//搜索关键字
        map.put("ordercreatetimestart", ordercreatetimestart);//下单时间
        map.put("ordercreatetimeend", ordercreatetimeend);//下单时间
        map.put("sourceaddresscode", sourceaddresscode);//运单发货地编码
        map.put("targetaddresscode", targetaddresscode);//运单到货地编码
        map.put("start", start);//起始标记，第一个元素0
        map.put("limit", limit);//起始标记， 每页最大显示数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.list.query");//接口路径
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
     * 运单签收复合列表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单签收复合列表导出1.0")
    public JSONObject orderReceivedCheckListExport1(String begindate, String enddate, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String loadaddresscode, String uploadaddresscode, String beginintermediarypaytime, String endintermediarypaytime, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//复合申请时间，起始
        map.put("enddate", enddate);//复合申请时间，截止
        map.put("sourcecode", sourcecode);//出发地行政区划编码，省、地市、区县三级均可，服务自动识别
        map.put("targetcode", targetcode);//目的地行政区划编码，省、地市、区县三级均可，服务自动识别
        map.put("keyword", keyword);//可以是接单司机姓名，电话，车牌；收单员名字，运单号
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("loadaddresscode", loadaddresscode);//装货地地址code
        map.put("uploadaddresscode", uploadaddresscode);//卸货地地址code
        map.put("beginintermediarypaytime", beginintermediarypaytime);//下单时间，起始
        map.put("endintermediarypaytime", endintermediarypaytime);//下单时间，截止
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.received.check.list.export");//接口路径
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
     * 资金详情明细报表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("资金详情明细报表1.0")
    public JSONObject reportexportCapitalDetail1(String expensetype, String tradetype, String beginTime, String endTime, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("expensetype", expensetype);//收支类型 0所有 1收 2支
        map.put("tradetype", tradetype);//0所有 1下单-余额冻结 2线下充值 3支付调度费 4支付司机运费 5余额解冻
        map.put("beginTime", beginTime);//起始时间
        map.put("endTime", endTime);//截止时间
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.capital.detail");//接口路径
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
     * 资金冻结明细报表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("资金冻结明细报表1.0")
    public JSONObject reportexportCapitalFreeze1(String beginTime, String endTime, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginTime", beginTime);//起始时间
        map.put("endTime", endTime);//截止时间
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.capital.freeze");//接口路径
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
     * 资金汇总报表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("资金汇总报表1.0")
    public JSONObject reportexportCapitalGather1(String beginTime, String endTime, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginTime", beginTime);//起始时间
        map.put("endTime", endTime);//截止时间
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.capital.gather");//接口路径
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
     * 信用借款账单报表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("信用借款账单报表1.0")
    public JSONObject reportexportCreaditLoan1(String state, String orderNum, String allState, String beginTime, String endTime, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//状态 0待发标, 1招标中, 2放款中, 3还款中, 4已还款, 5 已逾期 , 6 已回收, 7已坏账, 8待审核, 9提前还
        map.put("orderNum", orderNum);//运单号
        map.put("allState", allState);//是否全选 0:代表根据状态来查询 1:代表查询所有状态的数据
        map.put("beginTime", beginTime);//起始时间
        map.put("endTime", endTime);//截止时间
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.creadit.loan");//接口路径
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
     * 运单复核报表导出2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核报表导出2.0")
    public JSONObject reportexportOrderCheck2(String begindate, String enddate, String timequerytype, String start, String limit, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String companycode, String loadaddresscode, String uploadaddresscode, String ordercheckbegintime, String ordercheckendtime, String loadname, String unloadname, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//签收时间起始
        map.put("enddate", enddate);//签收时间截至
        map.put("timequerytype", timequerytype);//时间查询类型 0默认签收时间 1接单时间 2复核时间
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sourcecode", sourcecode);//装货地
        map.put("targetcode", targetcode);//目的地
        map.put("keyword", keyword);//关键词
        map.put("checkstate", checkstate);//0 所有 1拒绝付款 2复核通过 ,3 处理中
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("companycode", companycode);//
        map.put("loadaddresscode", loadaddresscode);//装货地地址code
        map.put("uploadaddresscode", uploadaddresscode);//卸货地地址code
        map.put("ordercheckbegintime", ordercheckbegintime);//复核起始时间
        map.put("ordercheckendtime", ordercheckendtime);//复核截至时间
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址址名称
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.order.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单复核报表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核报表导出1.0")
    public JSONObject reportexportOrderCheck1(String begindate, String enddate, String timequerytype, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String companycode, String loadaddresscode, String uploadaddresscode, String beginintermediarypaytime, String endintermediarypaytime, String orderstatetag, String loadname, String unloadname, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//起始时间
        map.put("enddate", enddate);//结束时间
        map.put("timequerytype", timequerytype);//时间查询类型 0默认签收时间 1接单时间 2复核时间
        map.put("sourcecode", sourcecode);//装货地地区code
        map.put("targetcode", targetcode);//目的地地区code
        map.put("keyword", keyword);//关键词
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("companycode", companycode);//公司编码
        map.put("loadaddresscode", loadaddresscode);//装货地地址code
        map.put("uploadaddresscode", uploadaddresscode);//卸货地地址code
        map.put("beginintermediarypaytime", beginintermediarypaytime);//下单时间，起始
        map.put("endintermediarypaytime", endintermediarypaytime);//下单时间，截止
        map.put("orderstatetag", orderstatetag);//运单选择标签 0 所有 1已标注 2 未标注
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址址名称
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.order.check");//接口路径
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
     * 运单报表导出1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单报表导出1.0")
    public JSONObject reportexportOrderDetail1(String keyword, String loadaddressregioncode, String loadaddresscode, String uploadaddressregioncode, String uploadaddresscode, String timetype, String beginTime, String endTime, String beginintermediarypaytime, String endintermediarypaytime, String loadname, String unloadname, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//可以是接单司机姓名，电话，车牌，下单人(公司账号，子账号)，运单号
        map.put("loadaddressregioncode", loadaddressregioncode);//装货地行政区划编码
        map.put("loadaddresscode", loadaddresscode);//装货地code
        map.put("uploadaddressregioncode", uploadaddressregioncode);//卸货地行政区划编码
        map.put("uploadaddresscode", uploadaddresscode);//卸货地code
        map.put("timetype", timetype);//查询的时间类型.1：司机抢单时间 2：企业确认司机时间
        map.put("beginTime", beginTime);//起始时间
        map.put("endTime", endTime);//结束时间
        map.put("beginintermediarypaytime", beginintermediarypaytime);//下单时间，起始
        map.put("endintermediarypaytime", endintermediarypaytime);//下单时间，截止
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址名称
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "reportexport.order.detail");//接口路径
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
     * 新建开票点1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("新建开票点1.0")
    public JSONObject ticketPositionCreate1(String positionName, String memberListJsonStr, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("positionName", positionName);//开票点名称
        map.put("memberListJsonStr", memberListJsonStr);//开票点初始成员列表json串：[{'mobile':'18086047775','memberName':'乐思文'},{'mobile':'15927161639','memberName':'何斌'}]
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ticket.position.create");//接口路径
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
     * 开票点删除1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("开票点删除1.0")
    public JSONObject ticketPositionDelete1(String id, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//开票点id
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ticket.position.delete");//接口路径
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
     * 开票点详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("开票点详情1.0")
    public JSONObject ticketPositionDetail1(String id, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//开票点id
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ticket.position.detail");//接口路径
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
     * 开票点列报表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("开票点列报表1.0")
    public JSONObject ticketPositionList1(String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ticket.position.list");//接口路径
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
     * 修改开票点1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改开票点1.0")
    public JSONObject ticketPositionUpdate1(String id, String positionName, String memberListJsonStr, String usercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//开票点id
        map.put("positionName", positionName);//开票点名称
        map.put("memberListJsonStr", memberListJsonStr);//开票点初始成员列表json串：[{'mobile':'18086047775','memberName':'乐思文'},{'mobile':'15927161639','memberName':'何斌'}]
        map.put("usercode", usercode);//用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ticket.position.update");//接口路径
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
