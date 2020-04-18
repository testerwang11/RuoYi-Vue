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
public class SJBOperationService {
    /*private static String url =  Config.getYml().getUrl("sjbOperation");
    private static String appcode = Config.getYml().getAppCode("sjbOperation");*/
    private static String url = "http://op-service.sijibao.co/sjboperation/router";
    private static String appcode = "100004";
    /**
     * 广告功能点列表1.0
     *
     * @return response
     * @
     */
    public JSONObject adAppfunctionList1()  {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ad.appfunction.list");//接口路径
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
     * 广告修改/添加1.0
     *
     * @return response
     * @
     */
    public JSONObject adUpdate1(String type, String id, String adname, String adtype, String starttime, String endtime, String imgurl, String linkurl, String enable, String delete, String lastupdateuser, String sort, String jumptype, String functionpoint)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//操作类型1.插入2.修改资料,禁用/启用3.删除
        map.put("id", id);//广告id
        map.put("adname", adname);//广告名称
        map.put("adtype", adtype);//广告类型1.启动页2.banner
        map.put("starttime", starttime);//广告生效日期
        map.put("endtime", endtime);//广告失效日期
        map.put("imgurl", imgurl);//广告图片
        map.put("linkurl", linkurl);//广告链接地址
        map.put("enable", enable);//广告是否启用
        map.put("delete", delete);//广告是否删除
        map.put("lastupdateuser", lastupdateuser);//操作人的usercode
        map.put("sort", sort);//排序设置
        map.put("jumptype", jumptype);//跳转类型1.页面链接2.功能点
        map.put("functionpoint", functionpoint);//功能点
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ad.update");//接口路径
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
     * 车队长货源创建1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderDriverstockCreate1(String stockcode, String leaderdriver)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("leaderdriver", leaderdriver);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.driverstock.create");//接口路径
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
     * 补单创建运单1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderOrderCreate1(String stockcode, String ordernumber, String drivermobile, String loadtime, String loadurl, String uploadtime, String uploadurl, String platenumber, String rulecode, String name, String originalunit, String actualunit, String unitprice, String leaderdriver, String agentmobile, String driverincome, String lastscheduingfee, String zerofee, String checkforfee, String lostunifee, String rulename, String isown, String otherduction, String isextpay, String extmoney, String payerrmobile, String payamt)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("drivermobile", drivermobile);//
        map.put("loadtime", loadtime);//
        map.put("loadurl", loadurl);//
        map.put("uploadtime", uploadtime);//
        map.put("uploadurl", uploadurl);//
        map.put("platenumber", platenumber);//
        map.put("rulecode", rulecode);//
        map.put("name", name);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("leaderdriver", leaderdriver);//
        map.put("agentmobile", agentmobile);//
        map.put("driverincome", driverincome);//
        map.put("lastscheduingfee", lastscheduingfee);//
        map.put("zerofee", zerofee);//
        map.put("checkforfee", checkforfee);//
        map.put("lostunifee", lostunifee);//
        map.put("rulename", rulename);//
        map.put("isown", isown);//
        map.put("otherduction", otherduction);//
        map.put("isextpay", isextpay);//
        map.put("extmoney", extmoney);//
        map.put("payerrmobile", payerrmobile);//
        map.put("payamt", payamt);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.order.create");//接口路径
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
     * 特殊补单创建运单1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderOrderCreateSpecial1(String stockcode, String ordernumber, String drivermobile, String loadtime, String loadurl, String uploadtime, String uploadurl, String platenumber, String rulecode, String name, String originalunit, String actualunit, String unitprice, String leaderdriver, String agentmobile, String driverincome, String lastscheduingfee, String zerofee, String checkforfee, String lostunifee, String rulename, String isown, String otherduction, String isextpay, String extmoney, String payerrmobile, String payamt)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("drivermobile", drivermobile);//
        map.put("loadtime", loadtime);//
        map.put("loadurl", loadurl);//
        map.put("uploadtime", uploadtime);//
        map.put("uploadurl", uploadurl);//
        map.put("platenumber", platenumber);//
        map.put("rulecode", rulecode);//
        map.put("name", name);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("leaderdriver", leaderdriver);//
        map.put("agentmobile", agentmobile);//
        map.put("driverincome", driverincome);//
        map.put("lastscheduingfee", lastscheduingfee);//
        map.put("zerofee", zerofee);//
        map.put("checkforfee", checkforfee);//
        map.put("lostunifee", lostunifee);//
        map.put("rulename", rulename);//
        map.put("isown", isown);//
        map.put("otherduction", otherduction);//
        map.put("isextpay", isextpay);//
        map.put("extmoney", extmoney);//
        map.put("payerrmobile", payerrmobile);//
        map.put("payamt", payamt);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.order.create.special");//接口路径
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
     * 线下单数据验证1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderOrderDataValidate1(String arcAddressName, String tarAddressName, String userMobile, String actualunit, String orignalunit, String unitprice, String stockunitprice, String stockcost, String drivermobile, String loadtime, String uploadtime, String platenumber, String name, String agentmobile, String driverincome, String rulename, String agentmoney, String isextpay, String isadvance, String iscredit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("arcAddressName", arcAddressName);//
        map.put("tarAddressName", tarAddressName);//
        map.put("userMobile", userMobile);//
        map.put("actualunit", actualunit);//
        map.put("orignalunit", orignalunit);//
        map.put("unitprice", unitprice);//
        map.put("stockunitprice", stockunitprice);//
        map.put("stockcost", stockcost);//
        map.put("drivermobile", drivermobile);//
        map.put("loadtime", loadtime);//
        map.put("uploadtime", uploadtime);//
        map.put("platenumber", platenumber);//
        map.put("name", name);//
        map.put("agentmobile", agentmobile);//
        map.put("driverincome", driverincome);//
        map.put("rulename", rulename);//
        map.put("agentmoney", agentmoney);//
        map.put("isextpay", isextpay);//
        map.put("isadvance", isadvance);//
        map.put("iscredit", iscredit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.order.data.validate");//接口路径
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
     * 运单支付1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderOrderRealpay1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.order.realpay");//接口路径
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
     * 补单创建货源1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderStockCreate1(String createdate, String arcAddressName, String tarAddressName, String userMobile, String actualunit, String orignalunit, String unitprice, String stockkind, String stockcost, String iscredit, String stockunit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("createdate", createdate);//
        map.put("arcAddressName", arcAddressName);//
        map.put("tarAddressName", tarAddressName);//
        map.put("userMobile", userMobile);//
        map.put("actualunit", actualunit);//
        map.put("orignalunit", orignalunit);//
        map.put("unitprice", unitprice);//
        map.put("stockkind", stockkind);//
        map.put("stockcost", stockcost);//
        map.put("iscredit", iscredit);//
        map.put("stockunit", stockunit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.stock.create");//接口路径
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
     * 经纪人货源创建1.0
     *
     * @return response
     * @
     */
    public JSONObject addorderStockagentCreate1(String agentmobile, String stockcode, String drivermobile, String agentmoney, String isown, String isadvance)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentmobile", agentmobile);//
        map.put("stockcode", stockcode);//
        map.put("drivermobile", drivermobile);//
        map.put("agentmoney", agentmoney);//
        map.put("isown", isown);//
        map.put("isadvance", isadvance);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "addorder.stockagent.create");//接口路径
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
     * 经纪人证件需更新1.0
     *
     * @return response
     * @
     */
    public JSONObject agentCertificateNeedupdate1(String certifycode, String state, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//经纪人认证唯一标识
        map.put("state", state);//经纪人认证状态
        map.put("memo", memo);//经纪人认证状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.certificate.needupdate");//接口路径
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
     * 经纪人取消认证1.0
     *
     * @return response
     * @
     */
    public JSONObject agentCertifyCancel1(String usercode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.certify.cancel");//接口路径
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
     * 注销经纪人1.0
     *
     * @return response
     * @
     */
    public JSONObject agentCertifyChgstate1(String usercode, String userstate)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("userstate", userstate);//用户状态
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.certify.chgstate");//接口路径
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
     * 经纪人认证失败1.0
     *
     * @return response
     * @
     */
    public JSONObject agentCertifyFailed1(String usercode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.certify.failed");//接口路径
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
     * 经纪人认证通过1.0
     *
     * @return response
     * @
     */
    public JSONObject agentCertifySuccess1(String certifycode, String state, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//经纪人认证唯一标识
        map.put("state", state);//经纪人认证状态
        map.put("memo", memo);//经纪人认证状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.certify.success");//接口路径
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
     * 经纪人认证修改资料后直接更新通过1.0
     *
     * @return response
     * @
     */
    public JSONObject agentCertifyUpdatestateTemp1(String certifycode, String agentusername, String headportrait, String idcode, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String industrycode, String industryphoto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//经纪人认证唯一标识
        map.put("agentusername", agentusername);//经纪人名称
        map.put("headportrait", headportrait);//经纪人的头像
        map.put("idcode", idcode);//经纪人身份证号
        map.put("idcardfrontphoto", idcardfrontphoto);//经纪人身份证号正面照片URL
        map.put("idcardbackphoto", idcardbackphoto);//经纪人身份证号反面照片URL
        map.put("idcardexpiretime", idcardexpiretime);//经纪人身份证有效期截止日期
        map.put("industrycode", industrycode);//工商户注册号
        map.put("industryphoto", industryphoto);//工商户照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.certify.updatestate.temp");//接口路径
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
     * 经纪人认证录入资料并认证/注册1.0
     *
     * @return response
     * @
     */
    public JSONObject agentDataCreateTemp1(String agentusermobile, String agentusername, String headportrait, String idcode, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String industrycode, String industryphoto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentusermobile", agentusermobile);//经纪人手机号
        map.put("agentusername", agentusername);//经纪人名称
        map.put("headportrait", headportrait);//经纪人的头像
        map.put("idcode", idcode);//经纪人身份证号
        map.put("idcardfrontphoto", idcardfrontphoto);//经纪人身份证号正面照片URL
        map.put("idcardbackphoto", idcardbackphoto);//经纪人身份证号反面照片URL
        map.put("idcardexpiretime", idcardexpiretime);//经纪人身份证有效期截止日期
        map.put("industrycode", industrycode);//工商户注册号
        map.put("industryphoto", industryphoto);//工商户照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.data.create.temp");//接口路径
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
     * 经纪人二维码创建1.0
     *
     * @return response
     * @
     */
    public JSONObject agentQrCreateTemp1(String agentusercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentusercode", agentusercode);//经纪人code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.qr.create.temp");//接口路径
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
     * 油气站二维码创建1.0
     *
     * @return response
     * @
     */
    public JSONObject agentQrcodebzCreateTemp1(String agentusercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentusercode", agentusercode);//经纪人code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.qrcodebz.create.temp");//接口路径
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
     * 经纪人认证修改资料1.0
     *
     * @return response
     * @
     */
    public JSONObject agentUpdateData1(String certifycode, String agentusername, String headportrait, String idcode, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String industrycode, String industryphoto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//经纪人认证唯一标识
        map.put("agentusername", agentusername);//经纪人名称
        map.put("headportrait", headportrait);//经纪人的头像
        map.put("idcode", idcode);//经纪人身份证号
        map.put("idcardfrontphoto", idcardfrontphoto);//经纪人身份证号正面照片URL
        map.put("idcardbackphoto", idcardbackphoto);//经纪人身份证号反面照片URL
        map.put("idcardexpiretime", idcardexpiretime);//经纪人身份证有效期截止日期
        map.put("industrycode", industrycode);//工商户注册号
        map.put("industryphoto", industryphoto);//工商户照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.update.data");//接口路径
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
     * 经纪人更新失败1.0
     *
     * @return response
     * @
     */
    public JSONObject agentUpdateFailed1(String usercode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.update.failed");//接口路径
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
     * 经纪人更新成功1.0
     *
     * @return response
     * @
     */
    public JSONObject agentUpdateSuccess1(String certifycode, String state, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//经纪人认证唯一标识
        map.put("state", state);//经纪人认证状态
        map.put("memo", memo);//经纪人认证状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "agent.update.success");//接口路径
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
     * 查询app版本最新版1.0
     *
     * @return response
     * @
     */
    public JSONObject appversionQueryLatest1(String oappcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//应用编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "appversion.query.latest");//接口路径
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
     * 企业行为限制1.0
     *
     * @return response
     * @
     */
    public JSONObject companyActionDeal1(String companycode, String actiondealtype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编码
        map.put("actiondealtype", actiondealtype);//行为操作类型 1禁用 2启用
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.action.deal");//接口路径
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
     * 修改企业编码1.0
     *
     * @return response
     * @
     */
    public JSONObject companyCodeModify1(String companycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.code.modify");//接口路径
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
     * 查询企业编码1.0
     *
     * @return response
     * @
     */
    public JSONObject companyCodeQuery1()  {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.code.query");//接口路径
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
     * 企业认证新版1.0
     *
     * @return response
     * @
     */
    public JSONObject companycertifyAuthenticationNew1(String flag, String certifymemo, String certifycode, String companycode, String licenceurl, String idcardfrontphoto, String idcardbackphoto, String otherurl, String companyname, String linkname, String licencecode, String idcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("flag", flag);//企业认证状态1认证通过 2认证失败 3取消认证(删)4.更新成功5.更新失败
        map.put("certifymemo", certifymemo);//企业认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("companycode", companycode);//认证信息的companycode
        map.put("licenceurl", licenceurl);//企业营业执照图片
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("otherurl", otherurl);//其它资料
        map.put("companyname", companyname);//企业名称
        map.put("linkname", linkname);//联系人名称
        map.put("licencecode", licencecode);//营业执照编码
        map.put("idcode", idcode);//身份证编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "companycertify.authentication.new");//接口路径
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
     * 企业认证-取消认证1.0
     *
     * @return response
     * @
     */
    public JSONObject companycertifyCancelCertify1(String flag, String certifymemo, String certifycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("flag", flag);//企业认证状态1认证通过 2认证失败 3取消认证(删)4.更新成功5.更新失败
        map.put("certifymemo", certifymemo);//企业认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "companycertify.cancel.certify");//接口路径
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
     * 企业认证-通过或失败1.0
     *
     * @return response
     * @
     */
    public String companycertifyCertifyNew1(String flag, String certifymemo, String certifycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("flag", flag);//企业认证状态1认证通过 2认证失败 3取消认证(删)4.更新成功5.更新失败
        map.put("certifymemo", certifymemo);//企业认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "companycertify.certify.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnData();
    }

    /**
     * 企业认证修改1.0
     *
     * @return response
     * @
     */
    public JSONObject companycertifyCertifyUpdate1(String flag, String certifymemo, String certifycode, String companycode, String licenceurl, String idcardfrontphoto, String idcardbackphoto, String otherurl, String companyname, String linkname, String licencecode, String idcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("flag", flag);//企业认证状态1认证通过 2认证失败 3取消认证(删)4.更新成功5.更新失败
        map.put("certifymemo", certifymemo);//企业认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("companycode", companycode);//认证信息的companycode
        map.put("licenceurl", licenceurl);//企业营业执照图片
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("otherurl", otherurl);//其它资料
        map.put("companyname", companyname);//企业名称
        map.put("linkname", linkname);//联系人名称
        map.put("licencecode", licencecode);//营业执照编码
        map.put("idcode", idcode);//身份证编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "companycertify.certify.update");//接口路径
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
     * 企业认证-修改企业信息1.0
     *
     * @return response
     * @
     */
    public JSONObject companycertifyUpdateData1(String certifycode, String licenceurl, String idcardfrontphoto, String idcardbackphoto, String otherurl, String companyname, String linkname, String licencecode, String idcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("licenceurl", licenceurl);//企业营业执照图片
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("otherurl", otherurl);//其它资料
        map.put("companyname", companyname);//企业名称
        map.put("linkname", linkname);//联系人名称
        map.put("licencecode", licencecode);//营业执照编码
        map.put("idcode", idcode);//身份证编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "companycertify.update.data");//接口路径
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
     * 企业认证-更新更新状态1.0
     *
     * @return response
     * @
     */
    public JSONObject companycertifyUpdateUpdatestate1(String flag, String certifymemo, String certifycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("flag", flag);//企业认证状态1认证通过 2认证失败 3取消认证(删)4.更新成功5.更新失败
        map.put("certifymemo", certifymemo);//企业认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "companycertify.update.updatestate");//接口路径
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
     * 全局设置删除1.0
     *
     * @return response
     * @
     */
    public JSONObject configDeleteConfigtype1(String configtype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("configtype", configtype);//配置类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "config.delete.configType");//接口路径
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
     * 全局设置修改或添加1.0
     *
     * @return response
     * @
     */
    public JSONObject configUpdateoraddConfigtype1(String configtype, String configdatatype, String configdatavalue, String recordstatus)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("configtype", configtype);//配置类型，运营平台对应字典值 review_global_setting_type
        map.put("configdatatype", configdatatype);//参数数据类型 1-6分别对应 int long double BigDecimal boolean string
        map.put("configdatavalue", configdatavalue);//参数值
        map.put("recordstatus", recordstatus);//是否生效 0有效 1删除 2失效
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "config.updateOrAdd.configType");//接口路径
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
     * 验算公式1.0
     *
     * @return response
     * @
     */
    public JSONObject consultRecordParamCheck1(String constantParam, String variableParam, String functionclassname, String stockunit, String transprice)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("constantParam", constantParam);//公式常量
        map.put("variableParam", variableParam);//公式变量
        map.put("functionclassname", functionclassname);//公式类名
        map.put("stockunit", stockunit);//下单数量
        map.put("transprice", transprice);//运费单价,扩大一万倍传给后台
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consult.record.param.check");//接口路径
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
     * 公式常量变量查询1.0
     *
     * @return response
     * @
     */
    public JSONObject consultRecordParamQuery1(String functionclassname)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("functionclassname", functionclassname);//公式类名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consult.record.param.query");//接口路径
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
     * 删除白名单1.0
     *
     * @return response
     * @
     */
    public JSONObject deleteDriverWhite1(String usercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机登录名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "delete.driver.white");//接口路径
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
     * 删除车辆关系1.0
     *
     * @return response
     * @
     */
    public JSONObject deleteVehicleDriverRelation1(String vehiclecode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//自有车编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "delete.vehicle.driver.relation");//接口路径
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
     * 删除自有车1.0
     *
     * @return response
     * @
     */
    public JSONObject deleteVehicleOwner1(String vehiclecode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//自有车编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "delete.vehicle.owner");//接口路径
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
     * 删除挂车1.0
     *
     * @return response
     * @
     */
    public JSONObject deleteVehicleTrailer1(String trailercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("trailercode", trailercode);//挂车编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "delete.vehicle.trailer");//接口路径
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
     * 点融数据接口获取详细信息(运单，车辆，企业信息)1.0
     *
     * @return response
     * @
     */
    public JSONObject dianrongGetdetailinfo1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "dianrong.getdetailinfo");//接口路径
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
     * 点融数据接口获取司机历史运单信息1.0
     *
     * @return response
     * @
     */
    public JSONObject dianrongGetorderinfohis1(String usercode, String begintime, String endtime, String startindex, String limit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户code
        map.put("begintime", begintime);//贷款开始时间
        map.put("endtime", endtime);//已还清借款时间
        map.put("startindex", startindex);//起始条数
        map.put("limit", limit);//条数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "dianrong.getorderinfohis");//接口路径
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
     * 点融数据接口获取图片资料1.0
     *
     * @return response
     * @
     */
    public JSONObject dianrongGetpicture1(String usercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "dianrong.getpicture");//接口路径
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
     * 字典项目创建1.0
     *
     * @return response
     * @
     */
    public JSONObject dictDictitemCreate1(String dictname, String typecode, String sortindex)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("dictname", dictname);//字典条目名称
        map.put("typecode", typecode);//字典类型 车辆类型:VehicleType 使用性质:UseCharacter
        map.put("sortindex", sortindex);//排序索引
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "dict.dictitem.create");//接口路径
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
     * 字典项目删除1.0
     *
     * @return response
     * @
     */
    public JSONObject dictDictitemDelete1(String typecode, String dictcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//字典类型 车辆类型:VehicleType 使用性质:UseCharacter
        map.put("dictcode", dictcode);//字典条母编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "dict.dictitem.delete");//接口路径
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
     * 字典项目删除1.0
     *
     * @return response
     * @
     */
    public JSONObject dictDictitemUpdate1(String dictname, String dictcode, String typecode, String sortindex)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("dictname", dictname);//字典条目名称
        map.put("dictcode", dictcode);//字典条目编码
        map.put("typecode", typecode);//字典类型 车辆类型:VehicleType 使用性质:UseCharacter
        map.put("sortindex", sortindex);//排序索引
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "dict.dictitem.update");//接口路径
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
     * 司机取消认证1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCancelCertify1(String usercode, String type, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("type", type);//操作类型:1认证通过 2认证失败 3取消认证(删)4身份证和驾驶证都需更新 5身份证需更新6驾驶证需更新 8更新成功9更新失败
        map.put("memo", memo);//司机状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.cancel.certify");//接口路径
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
     * 司机认证（通过或未通过）1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertificationNew1(String usercode, String type, String drivercertifymemo, String certifycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("type", type);//操作类型:1认证通过 2认证失败 3取消认证(删)4身份证和驾驶证都需更新 5身份证需更新6驾驶证需更新 8更新成功9更新失败
        map.put("drivercertifymemo", drivercertifymemo);//司机认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certification.new");//接口路径
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
     * 用户注销1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertifyChgstate1(String usercode, String userstate)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("userstate", userstate);//用户状态
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.chgstate");//接口路径
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
     * 司机认证1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertifyDriveraudit1(String drivercertifysate, String drivercertifymemo, String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String vehicledata, String usercode, String auto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("drivercertifysate", drivercertifysate);//司机认证状态1认证通过 2认证失败 3取消认证(删)
        map.put("drivercertifymemo", drivercertifymemo);//司机认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("vehicledata", vehicledata);//车辆信息json(必传usercode,platenumber,或要修改的行驶证照片)
        map.put("usercode", usercode);//司机用户编码
        map.put("auto", auto);//是否自动认证0正常1自动
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.driveraudit");//接口路径
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
     * 司机取消认证1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertifyDrivercancel1(String drivercertifysate, String drivercertifymemo, String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String vehicledata, String usercode, String auto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("drivercertifysate", drivercertifysate);//司机认证状态1认证通过 2认证失败 3取消认证(删)
        map.put("drivercertifymemo", drivercertifymemo);//司机认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("vehicledata", vehicledata);//车辆信息json(必传usercode,platenumber,或要修改的行驶证照片)
        map.put("usercode", usercode);//司机用户编码
        map.put("auto", auto);//是否自动认证0正常1自动
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.drivercancel");//接口路径
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
     * 修改司机认证资料1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertifyDriverupdate1(String drivercertifysate, String drivercertifymemo, String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String vehicledata, String usercode, String auto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("drivercertifysate", drivercertifysate);//司机认证状态1认证通过 2认证失败 3取消认证(删)
        map.put("drivercertifymemo", drivercertifymemo);//司机认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("vehicledata", vehicledata);//车辆信息json(必传usercode,platenumber,或要修改的行驶证照片)
        map.put("usercode", usercode);//司机用户编码
        map.put("auto", auto);//是否自动认证0正常1自动
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.driverupdate");//接口路径
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
     * 车辆认证1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertifyVehicleaudit1(String vehicleid, String certifystate, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehicleid", vehicleid);//车辆信息唯一编码
        map.put("certifystate", certifystate);//认证状态：3认证失败；4认证通过
        map.put("memo", memo);//认证备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.vehicleaudit");//接口路径
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
     * 修改车辆认证资料1.0
     *
     * @return response
     * @
     */
    public JSONObject driverCertifyVehicleupdate1(String usercode, String runlicence, String id)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("runlicence", runlicence);//行驶证照片地址
        map.put("id", id);//车辆id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.vehicleupdate");//接口路径
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
     * 用户注销恢复1.0
     *
     * @return response
     * @
     */
    public JSONObject driverChagstateRecover1(String usercode, String userstate)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("userstate", userstate);//用户状态
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.chagstate.recover");//接口路径
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
     * 司机车辆认证修改1.0
     *
     * @return response
     * @
     */
    public JSONObject driverDrivercertificationUpdate1(String drivercertifysate, String drivercertifymemo, String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String vehicledata, String usercode, String auto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("drivercertifysate", drivercertifysate);//司机认证状态1认证通过 2认证失败 3取消认证(删)
        map.put("drivercertifymemo", drivercertifymemo);//司机认证说明
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("vehicledata", vehicledata);//车辆信息json(必传usercode,platenumber,或要修改的行驶证照片)
        map.put("usercode", usercode);//司机用户编码
        map.put("auto", auto);//是否自动认证0正常1自动
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertification.update");//接口路径
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
     * 管理员认证审核1.0
     *
     * @return response
     * @
     */
    public JSONObject driverDrivercertifyAudit1(String certifycode, String memo, String pass)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("memo", memo);//状态变更备注
        map.put("pass", pass);//认证状态
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.audit");//接口路径
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
     * 管理员认证审核取消认证1.0
     *
     * @return response
     * @
     */
    public JSONObject driverDrivercertifyCancel1(String certifycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.cancel");//接口路径
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
     * 司机身份证校验1.0
     *
     * @return response
     * @
     */
    public JSONObject driverDrivercertifyIdcardVerify1(String usercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.idcard.verify");//接口路径
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
     * 修改司机认证资料1.0
     *
     * @return response
     * @
     */
    public JSONObject driverDrivercertifyUpdate1(String certifycode, String drivinglicence, String runlicence, String otherurl, String platenumbers, String headportrait, String idcardfrontphoto, String idcardbackphoto)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("runlicence", runlicence);//行驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("platenumbers", platenumbers);//车牌号
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.update");//接口路径
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
     * 司机修改车队长1.0
     *
     * @return response
     * @
     */
    public JSONObject driverDriverleaderUpdate1(String usercode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.driverleader.update");//接口路径
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
     * 司机认证通过后通知金融更新钱包1.0
     *
     * @return response
     * @
     */
    public JSONObject driverFinanceNotice1(String certifycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证code
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.finance.notice");//接口路径
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
     * 众数身份认证测试1.0
     *
     * @return response
     * @
     */
    public JSONObject driverIdcardTest1(String idcardnum, String name)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("idcardnum", idcardnum);//idcardnum
        map.put("name", name);//name
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.idcard.test");//接口路径
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
     * 司机驾驶证图像识别1.0
     *
     * @return response
     * @
     */
    public JSONObject driverLicenceOcr1(String usercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.licence.ocr");//接口路径
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
     * 司机证件需更新1.0
     *
     * @return response
     * @
     */
    public JSONObject driverPapersNeedupdate1(String usercode, String type, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("type", type);//操作类型:1认证通过 2认证失败 3取消认证(删)4身份证和驾驶证都需更新 5身份证需更新6驾驶证需更新 8更新成功9更新失败
        map.put("memo", memo);//司机状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.papers.needupdate");//接口路径
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
     * 司机修改资料1.0
     *
     * @return response
     * @
     */
    public JSONObject driverUpdateData1(String usercode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.update.data");//接口路径
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
     * 司机修改证件截止日期1.0
     *
     * @return response
     * @
     */
    public JSONObject driverUpdateExpiretime1(String usercode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.update.expiretime");//接口路径
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
     * 司机更新更新状态1.0
     *
     * @return response
     * @
     */
    public JSONObject driverUpdateUpdatestate1(String usercode, String type, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("type", type);//操作类型:1认证通过 2认证失败 3取消认证(删)4身份证和驾驶证都需更新 5身份证需更新6驾驶证需更新 8更新成功9更新失败
        map.put("memo", memo);//司机状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.update.updatestate");//接口路径
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
     * 司机车辆认证新版1.0
     *
     * @return response
     * @
     */
    @Step("司机车辆认证新版1.0")
    public JSONObject driverVehicleAuthentication1(String type, String usercode, String drivermemo, String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String auto, String idcardexpiretime, String driverlicenceexpiretime, String drivername, String idcode, String driverleader, String driverlimit, String vehicledata)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//操作类型:1认证通过 2认证失败 3取消认证(删)4身份证和驾驶证都需更新 5身份证需更新6驾驶证需更新 8更新成功9更新失败
        map.put("usercode", usercode);//司机用户编码
        map.put("drivermemo", drivermemo);//司机描述
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//其他认证图片地址，多个使用,隔开
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("auto", auto);//是否自动认证0正常1自动
        map.put("idcardexpiretime", idcardexpiretime);//身份证过期截止日期
        map.put("driverlicenceexpiretime", driverlicenceexpiretime);//驾驶证过期截止日期
        map.put("drivername", drivername);//司机姓名
        map.put("idcode", idcode);//司机身份证号
        map.put("driverleader", driverleader);//是否车队长1是2否
        map.put("driverlimit", driverlimit);//司机接单限制，为空 不做任何操作。，1解除限制，2添加限制
        map.put("vehicledata", vehicledata);//车辆信息json(id,type(1认证通过 2认证失败 3取消认证(删)4行驶证需更新 8更新成功9更新失败),memo,runlicence),有需要就传，不需要就不传
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.authentication");//接口路径
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
     * 取消车辆认证1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleCancelCertify1(String id, String vtype, String vmemo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("vtype", vtype);//操作类型1认证通过 2认证失败 3取消认证(删)4行驶证需更新 8更新成功9更新失败
        map.put("vmemo", vmemo);//车辆状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.cancel.certify");//接口路径
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
     * 车辆认证（通过或不通过）1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleCertificationNew1(String id, String vtype, String vmemo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("vtype", vtype);//操作类型1认证通过 2认证失败 3取消认证(删)4行驶证需更新 8更新成功9更新失败
        map.put("vmemo", vmemo);//车辆状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.certification.new");//接口路径
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
     * 车辆行驶证信息添加/修改1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleDrivinglicenceinfoCreate1(String id, String vehicletype, String vehicleowner, String address, String usecharacter, String brandmodel, String vehicleidentificationnumber, String enginenumber, String registertime, String issuetime, String curbweight, String gabaritelong, String gabaritewide, String gabaritehigh, String tractionmass, String fueltype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("vehicletype", vehicletype);//车辆类型
        map.put("vehicleowner", vehicleowner);//车辆所有人
        map.put("address", address);//住址(精确到县)
        map.put("usecharacter", usecharacter);//使用性质
        map.put("brandmodel", brandmodel);//品牌型号
        map.put("vehicleidentificationnumber", vehicleidentificationnumber);//车辆识别代码
        map.put("enginenumber", enginenumber);//发动机号码
        map.put("registertime", registertime);//车辆行驶证注册日期
        map.put("issuetime", issuetime);//车辆行驶证发证日期
        map.put("curbweight", curbweight);//整备质量(kg)
        map.put("gabaritelong", gabaritelong);//外廓尺寸：车长(mm)
        map.put("gabaritewide", gabaritewide);//外廓尺寸：车宽(mm)
        map.put("gabaritehigh", gabaritehigh);//外廓尺寸：车高(mm)
        map.put("tractionmass", tractionmass);//准牵引质量(kg)
        map.put("fueltype", fueltype);//燃料类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.drivinglicenceinfo.create");//接口路径
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
     * 车辆证件需更新1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehiclePapersNeedupdate1(String id, String vtype, String vmemo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("vtype", vtype);//操作类型1认证通过 2认证失败 3取消认证(删)4行驶证需更新 8更新成功9更新失败
        map.put("vmemo", vmemo);//车辆状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.papers.needupdate");//接口路径
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
     * 司机修改资料1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleUpdateData1(String id, String runlicence, String runlicenceexpiretime, String plateNumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("runlicence", runlicence);//行驶证
        map.put("runlicenceexpiretime", runlicenceexpiretime);//行驶证过期日期
        map.put("plateNumber", plateNumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.update.data");//接口路径
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
     * 司机修改证件截止日期1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleUpdateExpiretime1(String id, String runlicence, String runlicenceexpiretime, String plateNumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("runlicence", runlicence);//行驶证
        map.put("runlicenceexpiretime", runlicenceexpiretime);//行驶证过期日期
        map.put("plateNumber", plateNumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.update.expiretime");//接口路径
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
     * 车辆更新更新状态1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleUpdateUpdatestate1(String id, String vtype, String vmemo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("vtype", vtype);//操作类型1认证通过 2认证失败 3取消认证(删)4行驶证需更新 8更新成功9更新失败
        map.put("vmemo", vmemo);//车辆状态描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.update.updatestate");//接口路径
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
     * 车辆补充资料认证更新1.0
     *
     * @return response
     * @
     */
    public JSONObject driverVehicleextradataCertify1(String vehicleid, String roallicencetype, String roallicencememo, String roadlicence, String roadlicenceurl, String roadlicenceannualcheckurl, String roadlicenceexpiretime, String phototype, String photomemo, String vehicleimage1, String vehicleimage2, String vehicletype, String vehicleowner, String address, String usecharacter, String brandmodel, String vehicleidentificationnumber, String enginenumber, String registertime, String issuetime, String curbweight, String gabaritelong, String gabaritewide, String gabaritehigh, String tractionmass, String fueltype, String vehiclelimit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehicleid", vehicleid);//车辆id
        map.put("roallicencetype", roallicencetype);//道路运输许可证认证类型1认证通过 2认证失败3取消认证4证件需更新5更新成功6更新失败
        map.put("roallicencememo", roallicencememo);//道路运输许可证描述
        map.put("roadlicence", roadlicence);//道路运输许可证code
        map.put("roadlicenceurl", roadlicenceurl);//道路运输许可证url
        map.put("roadlicenceannualcheckurl", roadlicenceannualcheckurl);//道路运输许可证年审url
        map.put("roadlicenceexpiretime", roadlicenceexpiretime);//道路运输许可证截止日期
        map.put("phototype", phototype);//车辆照片认证类型1认证通过 2认证失败3取消认证 5更新成功6更新失败
        map.put("photomemo", photomemo);//车辆照片描述
        map.put("vehicleimage1", vehicleimage1);//车辆照片1
        map.put("vehicleimage2", vehicleimage2);//车辆照片2
        map.put("vehicletype", vehicletype);//车辆类型
        map.put("vehicleowner", vehicleowner);//车辆所有人
        map.put("address", address);//住址(精确到县)
        map.put("usecharacter", usecharacter);//使用性质，见字典数据UseCharacter
        map.put("brandmodel", brandmodel);//品牌型号
        map.put("vehicleidentificationnumber", vehicleidentificationnumber);//车辆识别代码
        map.put("enginenumber", enginenumber);//发动机号码
        map.put("registertime", registertime);//车辆行驶证注册日期
        map.put("issuetime", issuetime);//车辆行驶证发证日期
        map.put("curbweight", curbweight);//整备质量(kg)
        map.put("gabaritelong", gabaritelong);//外廓尺寸：车长(mm)
        map.put("gabaritewide", gabaritewide);//外廓尺寸：车宽(mm)
        map.put("gabaritehigh", gabaritehigh);//外廓尺寸：车高(mm)
        map.put("tractionmass", tractionmass);//准牵引质量(kg)
        map.put("fueltype", fueltype);//燃料类型，见字典数据FuelType
        map.put("vehiclelimit", vehiclelimit);//司机接单限制，为空 不做任何操作。，1解除限制，2添加限制
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicleextradata.certify");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject driveroilIncomeCount1(String begintime, String endtime)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//yyyy-MM-dd HH:mm:ss
        map.put("endtime", endtime);//yyyy-MM-dd HH:mm:ss
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driveroil.income.count");//接口路径
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
     * 冲正油费入账数据1.0
     *
     * @return response
     * @
     */
    public JSONObject driveroilOilCorrection1(String usercode, String total)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编号
        map.put("total", total);//金融平台 钱包账户的油费总额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driveroil.oil.correction");//接口路径
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
     * 用户油卡消费统计1.0
     *
     * @return response
     * @
     */
    public JSONObject driveroilOilcardInfoSendemail1(String begintime, String endtime)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//yyyy-MM-dd HH:mm:ss
        map.put("endtime", endtime);//yyyy-MM-dd HH:mm:ss
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driveroil.oilcard.info.sendemail");//接口路径
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
     * 承运业务合伙人创建1.0
     *
     * @return response
     * @
     */
    public JSONObject freightbusinessPartnerCreate1(String companyname, String frieghtusermobile, String licensecode, String linkername, String linkeridcode, String companyaddr, String companylinker, String companylinkphone, String regioncode, String regionname, String accountname, String bankname, String bankaccount, String licenseurl, String idcardfrontphoto, String idcardbackphoto, String entcertvaliddate, String legalcertvaliddate)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//企业名称
        map.put("frieghtusermobile", frieghtusermobile);//登录账号(仅限手机号)
        map.put("licensecode", licensecode);//统一社会信用代码,即营业执照号
        map.put("linkername", linkername);//法定代表人姓名
        map.put("linkeridcode", linkeridcode);//法定代表人身份证号
        map.put("companyaddr", companyaddr);//企业联系地址
        map.put("companylinker", companylinker);//企业联系人
        map.put("companylinkphone", companylinkphone);//联系电话
        map.put("regioncode", regioncode);//区域code
        map.put("regionname", regionname);//区域名称
        map.put("accountname", accountname);//账户名
        map.put("bankname", bankname);//开户行
        map.put("bankaccount", bankaccount);//账号
        map.put("licenseurl", licenseurl);//营业执照照片url
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证照片页，正面url
        map.put("idcardbackphoto", idcardbackphoto);//身份证国徽页，反面url
        map.put("entcertvaliddate", entcertvaliddate);//企业证件有效期，格式yyyyMMdd
        map.put("legalcertvaliddate", legalcertvaliddate);//法人证件有效期，格式yyyyMMdd
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "freightbusiness.partner.create");//接口路径
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
     * 历史运单补图1.0
     *
     * @return response
     * @
     */
    public JSONObject historyOrderAddurl1(String ordernumber, String signurl, String signinkind)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("signurl", signurl);//
        map.put("signinkind", signinkind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "history.order.addurl");//接口路径
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
     * 历史运单处理1.0
     *
     * @return response
     * @
     */
    public JSONObject historyOrderDeal1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "history.order.deal");//接口路径
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
     * 卡片查询1.0
     *
     * @return response
     * @
     */
    public JSONObject messageCardmsgQuery1(String begintime, String endtime, String title, String content, String phone, String category, String holdercode, String start, String limit, String cardmsgcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始时间
        map.put("endtime", endtime);//终止时间
        map.put("title", title);//标题
        map.put("content", content);//内容
        map.put("phone", phone);//电话
        map.put("category", category);//消息类别
        map.put("holdercode", holdercode);//持有者code
        map.put("start", start);//start
        map.put("limit", limit);//limit
        map.put("cardmsgcode", cardmsgcode);//cardmsgcode
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.cardmsg.query");//接口路径
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
     * 异步卡片发送1.0
     *
     * @return response
     * @
     */
    public JSONObject messageCardmsgSent_syn1(String sendtype, String cardmsgcode, String fromcode, String someusercodes, String messagetype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("sendtype", sendtype);//发送对象类型，1全部司机2全部企业3所有
        map.put("cardmsgcode", cardmsgcode);//卡片code
        map.put("fromcode", fromcode);//客服小司usercode
        map.put("someusercodes", someusercodes);//部分用户的usercode
        map.put("messagetype", messagetype);//消息类型1.系统类消息2.司机宝活动通告
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.cardmsg.sent_syn");//接口路径
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
     * 创建简单单卡片1.0
     *
     * @return response
     * @
     */
    public JSONObject messageCardmsgSimplecreate1(String usercode, String title, String imageurl, String audiourl, String videourl, String content, String linkurl, String linktype, String category, String tel, String name, String sourceurl, String fathercode, String tarnsmittimes)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("title", title);//标题
        map.put("imageurl", imageurl);//图片地址，多个使用逗号隔开
        map.put("audiourl", audiourl);//音频地址，多个使用逗号隔开
        map.put("videourl", videourl);//视频地址，多个使用逗号隔开
        map.put("content", content);//内容
        map.put("linkurl", linkurl);//链接地址
        map.put("linktype", linktype);//链接类型
        map.put("category", category);//消息类别
        map.put("tel", tel);//联系电话
        map.put("name", name);//联系人
        map.put("sourceurl", sourceurl);//信息来源地址
        map.put("fathercode", fathercode);//卡片来源fathercode
        map.put("tarnsmittimes", tarnsmittimes);//卡片可被转发次数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.cardmsg.simplecreate");//接口路径
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
     * 短信屏蔽名单新增1.0
     *
     * @return response
     * @
     */
    @Step("短信屏蔽名单新增")
    public JSONObject messageMobileBlacklistAdd1(String mobile, String remark) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//手机号,不为空
        map.put("remark", remark);//备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.mobile.blacklist.add");//接口路径
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
     * 短信屏蔽名单删除1.0
     *
     * @return response
     * @
     */
    @Step("短信屏蔽名单删除")
    public JSONObject messageMobileBlacklistDelete1(String mobile)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//手机号,不为空
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.mobile.blacklist.delete");//接口路径
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
     * 短信屏蔽名单更新1.0
     *
     * @return response
     * @
     */
    @Step("短信屏蔽名单更新")
    public JSONObject messageMobileBlacklistUpdate1(String mobile, String remark)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//手机号,不为空
        map.put("remark", remark);//备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.mobile.blacklist.update");//接口路径
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
     * 给指定的人发信息1.0
     *
     * @return response
     * @
     */
    @Step("给指定用户发送消息")
    public JSONObject messageSendSpecify1(String fromCode, String toCode, String type, String subType, String message, String extra, String noticeContent)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromCode", fromCode);//发送信息的用户编码
        map.put("toCode", toCode);//信息发送至此用户编码
        map.put("type", type);//消息类别
        map.put("subType", subType);//消息子类型
        map.put("message", message);//消息内容
        map.put("extra", extra);//消息扩展(附加属性,如tel:1234,href:http://zuv.cc,等)
        map.put("noticeContent", noticeContent);//标题内容
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.send.specify");//接口路径
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
     * 系统消息发送1.0
     *
     * @return response
     * @
     */
    @Step("系统消息发送")
    public JSONObject messageSystemmsgSent_syn1(String sendtype, String msgtitle, String msgcontent, String msgdealtype, String msgimageurl, String msglinkurl, String iosclassname, String andriodclassname, String andriodmapjson, String iosmapjson, String fromcode, String someusercodes, String messagetype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("sendtype", sendtype);//发送对象类型，1全部司机2全部企业3所有
        map.put("msgtitle", msgtitle);//消息标题
        map.put("msgcontent", msgcontent);//消息类容
        map.put("msgdealtype", msgdealtype);//消息处理类型 1外链 2内部类
        map.put("msgimageurl", msgimageurl);//消息图片地址
        map.put("msglinkurl", msglinkurl);//消息外链地址
        map.put("iosclassname", iosclassname);//消息ios处理类名
        map.put("andriodclassname", andriodclassname);//消息andrioid处理类名
        map.put("andriodmapjson", andriodmapjson);//map json key value 形式
        map.put("iosmapjson", iosmapjson);//ios map json key value 形式
        map.put("fromcode", fromcode);//客服小司usercode
        map.put("someusercodes", someusercodes);//部分用户的usercode
        map.put("messagetype", messagetype);//消息类型 1.系统类消息2.司机宝活动通告
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message.systemmsg.sent_syn");//接口路径
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
     * 线下单文件重新上传1.0
     *
     * @return response
     * @
     */
    public JSONObject offlineFileReupload1(String orderid, String originalfilename, String filetype, String fileurl) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderid", orderid);//线下单ID
        map.put("originalfilename", originalfilename);//源文件名称
        map.put("filetype", filetype);//文档类型，1-渣土，2-煤炭，3-煤炭-经纪人-标准，4-煤炭-经纪人-非标准，5-煤炭-备注
        map.put("fileurl", fileurl);//文件服务器返回的文件路径
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "offline.file.reupload");//接口路径
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
     * 线下单文件上传1.0
     *
     * @return response
     * @
     */
    public JSONObject offlineFileUpload1(String originalfilename, String filetype, String fileurl)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("originalfilename", originalfilename);//源文件名称
        map.put("filetype", filetype);//文档类型，1-渣土，2-煤炭，3-煤炭-经纪人-标准，4-煤炭-经纪人-非标准，5-煤炭-备注
        map.put("fileurl", fileurl);//文件服务器返回的文件路径
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "offline.file.upload");//接口路径
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
     * 全体跑单1.0
     *
     * @return response
     * @
     */
    public JSONObject offlineOrderAll1(String orderid, String ordertype, String filetype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderid", orderid);//线下单ID
        map.put("ordertype", ordertype);//跑单类型，1-全体跑单，2-继续跑单
        map.put("filetype", filetype);//文档类型，1-渣土，2-煤炭，3-煤炭-经纪人-标准，4-煤炭-经纪人-非标准，5-煤炭-备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "offline.order.all");//接口路径
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
     * 抽样跑单1.0
     *
     * @return response
     * @
     */
    public JSONObject offlineOrderSample1(String orderid, String filetype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderid", orderid);//线下单ID
        map.put("filetype", filetype);//文档类型，1-渣土，2-煤炭，3-煤炭-经纪人-标准，4-煤炭-经纪人-非标准，5-煤炭-备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "offline.order.sample");//接口路径
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
     * 线下单校验1.0
     *
     * @return response
     * @
     */
    public JSONObject offlineOrderValidate1(String orderid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderid", orderid);//线下单ID
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "offline.order.validate");//接口路径
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
     * 切换服务1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendChangeServer1()  {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.change.server");//接口路径
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
     * 运单上报统计今天的结果发邮件1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCountSendemail1(String someoneEmail, String createTime, String endTime)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("someoneEmail", someoneEmail);//上报运单日报的接收对象邮箱
        map.put("createTime", createTime);//统计的开始时间
        map.put("endTime", endTime);//统计的结束时间
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.count.sendemail");//接口路径
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
     * 运单上报（资金流和运单）1.0
     *
     * @return response
     * @
     */
    @Step("运单上报")
    public JSONObject ordersendCreate1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.create");//接口路径
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
     * 运单上报(创建并上报资金流)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCreateSendOrdermoneysender1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.create.send.ordermoneysender");//接口路径
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
     * 测试环境运单上报1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCreateTest1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.create.test");//接口路径
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
     * 运单上报21.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCreate21(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.create2");//接口路径
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
     * 运单上报(只上报资金流)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCreateordermoneysenderV11(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.createordermoneysender.v1");//接口路径
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
     * 运单上报(只上报资金流并且忽略SenderStatus)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCreateordermoneysenderV21(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.createordermoneysender.v2");//接口路径
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
     * 运单上报(只上报运单)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendCreateordersender1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.createordersender");//接口路径
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
     * 线下单运单上报1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendOffline1(String orderNumber, String shippingNoteNumber, String orderCreateTime, String deliveryTime, String signTime, String shipperAddress, String shipperAddressCode, String receiverAddressCode, String price, String carNumber, String vehicleWeight, String roadTransportCertificateNumber, String goodsName, String grossWeight)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//
        map.put("shippingNoteNumber", shippingNoteNumber);//
        map.put("orderCreateTime", orderCreateTime);//
        map.put("deliveryTime", deliveryTime);//
        map.put("signTime", signTime);//
        map.put("shipperAddress", shipperAddress);//
        map.put("shipperAddressCode", shipperAddressCode);//
        map.put("receiverAddressCode", receiverAddressCode);//
        map.put("price", price);//
        map.put("carNumber", carNumber);//
        map.put("vehicleWeight", vehicleWeight);//
        map.put("roadTransportCertificateNumber", roadTransportCertificateNumber);//
        map.put("goodsName", goodsName);//
        map.put("grossWeight", grossWeight);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.offline");//接口路径
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
     * 运单重新上报1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendRecreate1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.recreate");//接口路径
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
     * 回归上报管理1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendResendManager1(String num)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("num", num);//线程数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.resend.manager");//接口路径
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
     * 运单上报(通过id上报)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendSend1(String ordersendid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordersendid", ordersendid);//上报运单的id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.send");//接口路径
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
     * 运单上报1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendSendOrdernumber1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.send.ordernumber");//接口路径
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
     * 运单上报(上报入库运单)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendSendWaitorder1()  {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.send.waitorder");//接口路径
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
     * 运单上报(上报入库运单)1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendSendWaitorderV21(String threadNum)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("threadNum", threadNum);//线程数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.send.waitorder.v2");//接口路径
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
     * 启动上报线程1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendStart1(String num)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("num", num);//线程数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.start");//接口路径
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
     * 运单上报车辆信息入库1.0
     *
     * @return response
     * @
     */
    public JSONObject ordersendVehicleinfoInsert1(String platenumbers)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("platenumbers", platenumbers);//车辆车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordersend.vehicleinfo.insert");//接口路径
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
     * 通过货主和卸货地末次签到时间查订单信息(业务表)1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewBusinessQuery1(String keyword, String begintime, String endtime, String start, String limit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.business.query");//接口路径
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
     * 通过货主和货主确认回单时间查开票订单信息(开票对账表)1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewCheckingQuery1(String keyword, String begintime, String endtime, String start, String limit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.checking.query");//接口路径
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
     * 运单补票1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewOrderOpenticket1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.order.openticket");//接口路径
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
     * 运单轨迹补点或者更新1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewOrdertrackAddorupdate1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordertrack.addorupdate");//接口路径
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
     * 运单轨迹查询1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewOrdertrackQuery1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordertrack.query");//接口路径
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
     * 运单轨迹查询1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewOrdertrackQueryNew1(String ordernumber, String orderTrackSource)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("orderTrackSource", orderTrackSource);//轨迹数据源 1.中交，2.人工补点，3.设备定位数据，4.默认策略 优先返中交
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordertrack.query.new");//接口路径
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
     * 磅单查询1.0
     *
     * @return response
     * @
     */
    @Step("磅单查询")
    public JSONObject orderviewOrderurlQuery1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.orderurl.query");//接口路径
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
     * 渣土车补单1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewPartofthecarReportadd1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.partofthecar.reportadd");//接口路径
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
     * 超时运单查询1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewQueryOvertimeorder1(String orderstate, String span, String companyname, String start, String limit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderstate", orderstate);//
        map.put("span", span);//
        map.put("companyname", companyname);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.query.overtimeorder");//接口路径
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
     * 异常单审核1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewSignAbnormalUpdatestate1(String ordernumber, String signinkind, String targetkind, String dealstate, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinkind", signinkind);//处理类型 0 默认所有 1卸货 2装货
        map.put("targetkind", targetkind);//选择补图人 0 司机 1 收单员 2针对所有成员状态修改
        map.put("dealstate", dealstate);//处理状态 2驳回 3处理通过
        map.put("memo", memo);//描述
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.sign.abnormal.updatestate");//接口路径
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
     * 异常单撤销通知1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewSignCancel1(String ordernumber, String signinordertype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//签到类型1装货 2卸货
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.sign.cancel");//接口路径
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
     * 运单签到补发信息1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewSignSendmessage1(String ordernumber, String signinordercode, String title, String content, String targetkind, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordercode", signinordercode);//签到code
        map.put("title", title);//标题
        map.put("content", content);//内容
        map.put("targetkind", targetkind);//选择补图人 0 司机 1 收单员
        map.put("memo", memo);//显示备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.sign.sendmessage");//接口路径
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
     * 运单补签合同通知消息非承运变承运1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewSignthecontractSendmessage1(String ordernumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.signthecontract.sendmessage");//接口路径
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
     * 新增具体的策略方案1.0
     *
     * @return response
     * @
     */
    public JSONObject policyAddPolicy1(String policyname, String policytypeid, String policykind, String policymemo, String policyparams)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("policyname", policyname);//策略名称
        map.put("policytypeid", policytypeid);//策略类型id 关联字段
        map.put("policykind", policykind);//策略类型 1等级 2积分
        map.put("policymemo", policymemo);//策略说明
        map.put("policyparams", policyparams);//策略类型对应的详细参数，以键值对的方式存放paramkey和paramvalue。格式举例：{paramkey1:'paramvalue1',paramkey2:'paramvalue2'}
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.add.policy");//接口路径
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
     * 新增具体的策略关联1.0
     *
     * @return response
     * @
     */
    public JSONObject policyAddPolicyrule1(String id, String ruleusertype, String rankpolicys, String integralpolicys, String policyrankruledetails)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一识别主键，如果传入该参数，则表示为修改
        map.put("ruleusertype", ruleusertype);//用户类型，UserTypeEnum
        map.put("rankpolicys", rankpolicys);//等级策略集合，多个逗号隔开
        map.put("integralpolicys", integralpolicys);//积分策略集合，多个逗号隔开
        map.put("policyrankruledetails", policyrankruledetails);//对应的具体的等级策略的编号和权重的的集合（积分策略对应的编号不用存放）。格式举例：[{policyno:'1001',weight:'0.70'},{policyno:'1002',weight:'0.30'}]
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.add.policyrule");//接口路径
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
     * 新增策略类型1.0
     *
     * @return response
     * @
     */
    public JSONObject policyAddPolicytype1(String id, String policykind, String policytypename)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//编号，如果存在该值，那么就作为修改方法。否则添加
        map.put("policykind", policykind);//0未知 1等级 2积分
        map.put("policytypename", policytypename);//策略名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.add.policytype");//接口路径
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
     * 新增策略的参数的描述和条件限制1.0
     *
     * @return response
     * @
     */
    public JSONObject policyAddPolicytypeparam1(String id, String paramkey, String paramname, String policytypeid, String paramsort, String paramvaluetype, String paramminvalue, String parammaxvalue, String operationtype, String paramlogictype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//编号，如果存在该值，那么就作为修改方法。否则添加
        map.put("paramkey", paramkey);//参数key值
        map.put("paramname", paramname);//参数名称
        map.put("policytypeid", policytypeid);//策略类型id 关联字段
        map.put("paramsort", paramsort);//参数展示排序
        map.put("paramvaluetype", paramvaluetype);//参数数据类型 int 1 double 2
        map.put("paramminvalue", paramminvalue);//参数设置最小值
        map.put("parammaxvalue", parammaxvalue);//参数设置最大值
        map.put("operationtype", operationtype);//运算类型，1 增加，2 减少
        map.put("paramlogictype", paramlogictype);//参数逻辑类型 普通数据 0 限制次数 1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.add.policytypeparam");//接口路径
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
     * 新增等级信息1.0
     *
     * @return response
     * @
     */
    public JSONObject policyAddUserrank1(String ranktype, String rankminvalue, String rankmaxvalue, String usertype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ranktype", ranktype);//等级类型，对应RankTypeEnum
        map.put("rankminvalue", rankminvalue);//成长值 最小值
        map.put("rankmaxvalue", rankmaxvalue);//成长值 最大值
        map.put("usertype", usertype);//用户类型，对应UserTypeEnum
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.add.userrank");//接口路径
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
     * 修改具体的策略方案1.0
     *
     * @return response
     * @
     */
    public JSONObject policyEditPolicy1(String id, String policyname, String policymemo, String policyparams)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一识别主键
        map.put("policyname", policyname);//策略名称
        map.put("policymemo", policymemo);//策略说明
        map.put("policyparams", policyparams);//策略类型对应的详细参数，以键值对的方式存放paramkey和paramvalue。格式举例：{paramkey1:'paramvalue1',paramkey2:'paramvalue2'}
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.edit.policy");//接口路径
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
     * 修改具体的策略关联1.0
     *
     * @return response
     * @
     */
    public JSONObject policyEditPolicyrule1(String id, String rankpolicys, String integralpolicys, String policyrankruledetails)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一识别主键
        map.put("rankpolicys", rankpolicys);//等级策略集合，多个逗号隔开
        map.put("integralpolicys", integralpolicys);//积分策略集合，多个逗号隔开
        map.put("policyrankruledetails", policyrankruledetails);//对应的具体的等级策略的编号和权重的的集合（积分策略对应的编号不用存放）。格式举例：[{policyno:'1001',weight:'0.70'},{policyno:'1002',weight:'0.30'}]
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.edit.policyrule");//接口路径
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
     * 修改等级信息1.0
     *
     * @return response
     * @
     */
    public JSONObject policyEditUserrank1(String id, String rankminvalue, String rankmaxvalue, String usertype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一识别主键
        map.put("rankminvalue", rankminvalue);//成长值 最小值
        map.put("rankmaxvalue", rankmaxvalue);//成长值 最大值
        map.put("usertype", usertype);//用户类型，对应UserTypeEnum
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "policy.edit.userrank");//接口路径
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
     * 磅单文件上传1.0
     *
     * @return response
     * @
     */
    public JSONObject poundFileUpload1(String batchname, String fileurl, String companycode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("batchname", batchname);//源文件名称
        map.put("fileurl", fileurl);//文件服务器返回的文件路径
        map.put("companycode", companycode);//企业编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.file.upload");//接口路径
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
     * 磅单信息补录1.0
     *
     * @return response
     * @
     */
    public JSONObject poundInfoModify1(String matchdetailid, String logisticsnumber, String companycode, String goodsname, String ordernumber, String poundpictureurl, String driverphone, String lostunitprice, String freightunitprice, String signremark, String batchtype)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("matchdetailid", matchdetailid);//磅单匹配明细ID
        map.put("logisticsnumber", logisticsnumber);//企业订单号
        map.put("companycode", companycode);//企业编号
        map.put("goodsname", goodsname);//商品名称
        map.put("ordernumber", ordernumber);//运单号
        map.put("poundpictureurl", poundpictureurl);//磅单图片，多张图片以逗号分隔
        map.put("driverphone", driverphone);//司机手机号
        map.put("lostunitprice", lostunitprice);//亏吨单价
        map.put("freightunitprice", freightunitprice);//运费单价
        map.put("signremark", signremark);//收单备注
        map.put("batchtype", batchtype);//批次类型,1-Excel上传，2-数据对接
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.info.modify");//接口路径
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
     * 磅单匹配1.0
     *
     * @return response
     * @
     */
    public JSONObject poundMatch1(String batchid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("batchid", batchid);//磅单批次ID
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.match");//接口路径
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
     * 更新磅单批次状态1.0
     *
     * @return response
     * @
     */
    public JSONObject poundMatchBatchUpdate1(String batchid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("batchid", batchid);//磅单批次ID
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.match.batch.update");//接口路径
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
     * 新增磅单匹配规则1.0
     *
     * @return response
     * @
     */
    public JSONObject poundMatchRuleSave1(String holdercode, String companycode, String companyname, String freightname, String orderformula, String rulecode, String ispoundpicture, String islogisticsnumber, String matchnode, String matchtime, String timeunit, String goodsnames)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//企业持有人编码
        map.put("companycode", companycode);//企业编号
        map.put("companyname", companyname);//企业名称
        map.put("freightname", freightname);//货物种类
        map.put("orderformula", orderformula);//收单公式
        map.put("rulecode", rulecode);//规则Code
        map.put("ispoundpicture", ispoundpicture);//是否有磅单图片，0-无，1-有
        map.put("islogisticsnumber", islogisticsnumber);//是否有企业订单号，0-无，1-有
        map.put("matchnode", matchnode);//匹配节点，0-装货，1-卸货，2-装货及卸货
        map.put("matchtime", matchtime);//匹配时间，0-向前，1-向后，2-左右
        map.put("timeunit", timeunit);//时间间隔
        map.put("goodsnames", goodsnames);//关联商品名称，多个以逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.match.rule.save");//接口路径
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
     * 更新磅单匹配规则1.0
     *
     * @return response
     * @
     */
    public JSONObject poundMatchRuleUpdate1(String ruleid, String companycode, String freightname, String orderformula, String rulecode, String ispoundpicture, String islogisticsnumber, String matchnode, String matchtime, String timeunit, String goodsnames)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleid", ruleid);//匹配规则ID
        map.put("companycode", companycode);//企业编号
        map.put("freightname", freightname);//货物种类
        map.put("orderformula", orderformula);//收单公式
        map.put("rulecode", rulecode);//规则Code
        map.put("ispoundpicture", ispoundpicture);//是否有磅单图片，0-无，1-有
        map.put("islogisticsnumber", islogisticsnumber);//是否有企业订单号，0-无，1-有
        map.put("matchnode", matchnode);//匹配节点，0-装货，1-卸货，2-装货及卸货
        map.put("matchtime", matchtime);//匹配时间，0-向前，1-向后，2-左右
        map.put("timeunit", timeunit);//时间间隔
        map.put("goodsnames", goodsnames);//关联商品名称，多个以逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.match.rule.update");//接口路径
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
     * 磅单签收1.0
     *
     * @return response
     * @
     */
    public JSONObject poundSign1(String ids)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ids", ids);//签收明细ID，如有多个，则逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.sign");//接口路径
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
     * 转盘区块配置1.0
     *
     * @return response
     * @
     */
    public JSONObject promotionAddConfigintegraldrawprizeparam1(String promotionid, String drawprizeparams)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("promotionid", promotionid);//活动编号，若不传本参数则默认设置最新的活动
        map.put("drawprizeparams", drawprizeparams);//存放区块概率的集合,blockcode:区块编码 prizetype:奖项类型 prizeprobability:概率 最小0.01 最大100。格式举例：[{blockcode:'1',prizetype:5,prizeprobability:1},{blockcode:'2',prizetype:1,prizeprobability:20}....]
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.add.configIntegraldrawPrizeParam");//接口路径
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
     * 奖品批量核销1.0
     *
     * @return response
     * @
     */
    public JSONObject promotionBatchExchangePrize1(String ids, String operaterid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ids", ids);//抽奖记录编号集合。用逗号隔开 比如“1,2,4”
        map.put("operaterid", operaterid);//操作员编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.batch.exchange.prize");//接口路径
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
     * 奖品核销1.0
     *
     * @return response
     * @
     */
    public JSONObject promotionExchangePrize1(String promotionparticipationrecordid, String exchangecode, String operaterid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("promotionparticipationrecordid", promotionparticipationrecordid);//抽奖记录编号
        map.put("exchangecode", exchangecode);//兑奖码
        map.put("operaterid", operaterid);//操作员编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.exchange.prize");//接口路径
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
     * 添加策略1.0
     *
     * @return response
     * @
     */
    public JSONObject promotionPolicyAdd1(String policyname, String policymemo, String promotionpolicytype, String policyparams)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("policyname", policyname);//策略名称
        map.put("policymemo", policymemo);//策略说明
        map.put("promotionpolicytype", promotionpolicytype);//策略类型 对应枚举promotion_policy_type的值
        map.put("policyparams", policyparams);//策略参数的键值对，比如{promotion_integraldraw_reduction:20,promotion_integraldraw_drawtimes:10} 表示每天抽奖可抽10次，每次扣除20点积分 。key对应数据库
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.policy.add");//接口路径
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
     * 删除策略-假删1.0
     *
     * @return response
     * @
     */
    public JSONObject promotionPolicyDelete1(String policyid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("policyid", policyid);//策略编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.policy.delete");//接口路径
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
     * 修改策略-假删、新增1.0
     *
     * @return response
     * @
     */
    public JSONObject promotionPolicyUpdate1(String policyid, String policyname, String policymemo, String promotionpolicytype, String policyparams)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("policyid", policyid);//策略编号
        map.put("policyname", policyname);//策略名称
        map.put("policymemo", policymemo);//策略说明
        map.put("promotionpolicytype", promotionpolicytype);//策略类型 对应枚举promotion_policy_type的值
        map.put("policyparams", policyparams);//策略参数的键值对，比如{promotion_integraldraw_reduction:20,promotion_integraldraw_drawtimes:10} 表示每天抽奖可抽10次，每次扣除20点积分
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.policy.update");//接口路径
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
     * 划价运费报表匹配1.0
     *
     * @return response
     * @
     */
    public JSONObject reportFileMatch1(String reportid)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("reportid", reportid);//运费划价报表ID
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "report.file.match");//接口路径
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
     * 划价运费报表签收1.0
     *
     * @return response
     * @
     */
    public JSONObject reportFileSign1(String ids)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ids", ids);//签收明细ID，如有多个，则逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "report.file.sign");//接口路径
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
     * 划价运费报表文件上传1.0
     *
     * @return response
     * @
     */
    public JSONObject reportFileUpload1(String originalfile, String serverfile)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("originalfile", originalfile);//源文件名称
        map.put("serverfile", serverfile);//文件服务器返回的文件路径
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "report.file.upload");//接口路径
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
     * 新增白名单1.0
     *
     * @return response
     * @
     */
    public JSONObject saveDriverWhite1(String usercode, String drivername, String driverphone, String idcode, String ownerwhite, String remark, String contractimg)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("drivername", drivername);//司机姓名
        map.put("driverphone", driverphone);//司机手机号
        map.put("idcode", idcode);//身份证号码
        map.put("ownerwhite", ownerwhite);//是否自有车白名单,0-否，1-是
        map.put("remark", remark);//备注
        map.put("contractimg", contractimg);//自有车合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.driver.white");//接口路径
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
     * 调度费保存1.0
     *
     * @return response
     * @
     */
    public JSONObject saveOilcardFeerateContent1(String oilcardFeerateContent)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("oilcardFeerateContent", oilcardFeerateContent);//调度费信息
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.oilcard.feerate.content");//接口路径
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
     * 新增车辆关系1.0
     *
     * @return response
     * @
     */
    public JSONObject saveVehicleDriverRelation1(String vehiclecode, String chargeperson, String chargepersonphone, String usercodes)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//自有车编号
        map.put("chargeperson", chargeperson);//负责人
        map.put("chargepersonphone", chargepersonphone);//负责人电话
        map.put("usercodes", usercodes);//司机登录名，多个以逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.vehicle.driver.relation");//接口路径
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
     * 新增自有车1.0
     *
     * @return response
     * @
     */
    public JSONObject saveVehicleOwner1(String platecode, String vehicleframe, String licensenum, String enginecode, String vehiclecolor, String manufacturer, String supplier, String purchasefees, String purchasedate, String drivetype, String motdate, String repairperson, String repairphone, String vehiclestate, String remark, String vehiclelength, String vehiclewidth, String vehicleheight, String loadtype, String trailercode, String trailerplatecode, String usefeeratio, String freightfeeratio, String licenseimg, String contractimg, String routeid, String companycode, String companyname)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("platecode", platecode);//自有车牌号
        map.put("vehicleframe", vehicleframe);//车架号
        map.put("licensenum", licensenum);//行驶证号
        map.put("enginecode", enginecode);//发动机编号
        map.put("vehiclecolor", vehiclecolor);//车辆颜色，1-红色，2-蓝色
        map.put("manufacturer", manufacturer);//制造商
        map.put("supplier", supplier);//供货商
        map.put("purchasefees", purchasefees);//采购总价
        map.put("purchasedate", purchasedate);//采购时间
        map.put("drivetype", drivetype);//驱动形式，1-8*4，2-6*2,3-6*4，4-4*2
        map.put("motdate", motdate);//年检时间
        map.put("repairperson", repairperson);//报修人
        map.put("repairphone", repairphone);//报修电话
        map.put("vehiclestate", vehiclestate);//车辆状态，1-正常，2-修整，3-报废
        map.put("remark", remark);//备注
        map.put("vehiclelength", vehiclelength);//外型长
        map.put("vehiclewidth", vehiclewidth);//外型宽
        map.put("vehicleheight", vehicleheight);//外型高
        map.put("loadtype", loadtype);//载货类型
        map.put("trailercode", trailercode);//关联挂车
        map.put("trailerplatecode", trailerplatecode);//挂车牌号
        map.put("usefeeratio", usefeeratio);//车辆使用费比例
        map.put("freightfeeratio", freightfeeratio);//司机运费比例
        map.put("licenseimg", licenseimg);//行驶证照片
        map.put("contractimg", contractimg);//采购合同照片
        map.put("routeid", routeid);//线路ID
        map.put("companycode", companycode);//所属分公司Code
        map.put("companyname", companyname);//所属分公司名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.vehicle.owner");//接口路径
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
     * 新增自有车线下费用1.0
     *
     * @return response
     * @
     */
    public JSONObject saveVehicleOwnerFee1(String platecode, String feejsonstr, String feetype, String feeamount, String feeperson, String feedate, String feevoucher, String usercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("platecode", platecode);//自有车牌号
        map.put("feejsonstr", feejsonstr);//费用JSON字符串，格式举例：[{'feetype':'0','feeamount':'1.00','feeperson':'张三','feedate':'时间戳','feevoucher':'test.jpg','usercode':'13344448888'},{...}]
        map.put("feetype", feetype);//费用事项（JSON串的字段说明），1-二级维护，2-保险，3-维修，4-年检，5-违章，6-ETC，7-其他
        map.put("feeamount", feeamount);//费用金额（JSON串的字段说明）
        map.put("feeperson", feeperson);//费用发生人（JSON串的字段说明）
        map.put("feedate", feedate);//费用发生时间（JSON串的字段说明）
        map.put("feevoucher", feevoucher);//费用凭证（JSON串的字段说明）
        map.put("usercode", usercode);//用户编码（JSON串的字段说明）
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.vehicle.owner.fee");//接口路径
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
     * 新增线路1.0
     *
     * @return response
     * @
     */
    public JSONObject saveVehicleOwnerRoute1(String routename, String routestartprovincecode, String routestartprovince, String routestartcitycode, String routestartcity, String routestartdistrictcode, String routestartdistrict, String routeendprovincecode, String routeendprovince, String routeendcitycode, String routeendcity, String routeenddistrictcode, String routeenddistrict)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("routename", routename);//线路名称
        map.put("routestartprovincecode", routestartprovincecode);//线路起点的省份编号
        map.put("routestartprovince", routestartprovince);//线路起点的省份
        map.put("routestartcitycode", routestartcitycode);//线路起点的城市编码
        map.put("routestartcity", routestartcity);//线路起点的城市
        map.put("routestartdistrictcode", routestartdistrictcode);//线路起点的区域编码
        map.put("routestartdistrict", routestartdistrict);//线路起点的区域
        map.put("routeendprovincecode", routeendprovincecode);//线路终点的身份编码
        map.put("routeendprovince", routeendprovince);//线路终点的省份
        map.put("routeendcitycode", routeendcitycode);//线路终点的城市编码
        map.put("routeendcity", routeendcity);//线路终点的城市
        map.put("routeenddistrictcode", routeenddistrictcode);//线路终点的区域编码
        map.put("routeenddistrict", routeenddistrict);//线路终点的区域
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.vehicle.owner.route");//接口路径
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
     * 新增挂车1.0
     *
     * @return response
     * @
     */
    public JSONObject saveVehicleTrailer1(String trailerplatecode, String trailerlicense, String trailercolor, String trailertype, String trailermodel, String trailerlength, String trailerwidth, String trailerheight, String trailertonnage, String licenseimg, String contractimg)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("trailerplatecode", trailerplatecode);//挂车牌号
        map.put("trailerlicense", trailerlicense);//挂车行驶证号
        map.put("trailercolor", trailercolor);//挂车颜色，1-红色，2-蓝色
        map.put("trailertype", trailertype);//挂车类型，1-仓栏半挂，2-栏板半挂，3-集装箱骨架半挂，4-厢式半挂
        map.put("trailermodel", trailermodel);//公告型号
        map.put("trailerlength", trailerlength);//外型长
        map.put("trailerwidth", trailerwidth);//外型宽
        map.put("trailerheight", trailerheight);//外型高
        map.put("trailertonnage", trailertonnage);//实际整备
        map.put("licenseimg", licenseimg);//驾驶证照片
        map.put("contractimg", contractimg);//采购合同照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "save.vehicle.trailer");//接口路径
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
     * 司机图片修改(签到图片,司机补图，收单员补图)1.0
     *
     * @return response
     * @
     */
    public JSONObject signinorderUpdatesignurl1(String signinordercode, String url, String addurl, String otheraddurl)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signinordercode", signinordercode);//签到编码 唯一编码
        map.put("url", url);//签到图片
        map.put("addurl", addurl);//司机签到补充图片
        map.put("otheraddurl", otheraddurl);//收单员签到补充图片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.updatesignurl");//接口路径
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
     * 司机签到异常通过处理申请1.0
     *
     * @return response
     * @
     */
    public JSONObject signinorderUpdatesignway1(String ordernumber, String signway, String applyreason, String signinkind)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//解锁运单号
        map.put("signway", signway);//签到途径 0 正常 1 超出签到半径
        map.put("applyreason", applyreason);//申请理由
        map.put("signinkind", signinkind);//签到点类型，1：装货地；2：卸货地，默认装货地
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.updatesignway");//接口路径
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
     * 司机签到图片地址修改1.0
     *
     * @return response
     * @
     */
    public JSONObject signinorderUpdateurl1(String signinordercode, String url)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signinordercode", signinordercode);//签到编码 唯一编码
        map.put("url", url);//签到图片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.updateurl");//接口路径
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
     * 取消预约货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockBespeakCancel1(String reservationcode, String drs)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("reservationcode", reservationcode);//预约单号
        map.put("drs", drs);//司机预约有效性 1：有效 2：已取消司机预约
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.bespeak.cancel");//接口路径
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
     * 发布预约货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockBespeakSend1(String stockcode, String agentstockcode, String stowagetime, String endtime, String vehiclereceivetime, String demandnumber, String stocksourcetype, String stockstatus)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编号
        map.put("agentstockcode", agentstockcode);//经纪人货源编号 如果是企业货源则不需要传入该参数
        map.put("stowagetime", stowagetime);//装货时间 时间戳(毫秒)
        map.put("endtime", endtime);//结束时间 时间戳(毫秒)
        map.put("vehiclereceivetime", vehiclereceivetime);//车辆到厂时间 时间戳(毫秒)
        map.put("demandnumber", demandnumber);//需求车数
        map.put("stocksourcetype", stocksourcetype);//来源类型企业/经纪人 1:经纪人 2：企业
        map.put("stockstatus", stockstatus);//货源状态 0：待发布 1：已发布 2：已关闭 3：已删除
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.bespeak.send");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject stockCacheInit1()  {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.cache.init");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject stockCacheReload1(String stockcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.cache.reload");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject stockCacheRemove1(String stockcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.cache.remove");//接口路径
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
     * 货源删除1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDelete1(String stockcodes)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcodes", stockcodes);//批量删除的货源编码，批量逗号隔开
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.delete");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject stockLocateStockcode1(String stockcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.locate.stockcode");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject stockNewstock1(String sourceprovincecode, String sourcecitycode, String sourcecountycode, String targetprovincecode, String targetcitycode, String targetcountycode, String constructs, String lengths, String authStockFlag, String freightassure, String emptyassure, String stockkinds, String starttime, String endtime, String start, String limit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("sourceprovincecode", sourceprovincecode);//来源地省code
        map.put("sourcecitycode", sourcecitycode);//来源地市code
        map.put("sourcecountycode", sourcecountycode);//来源地区县code
        map.put("targetprovincecode", targetprovincecode);//目的地省code
        map.put("targetcitycode", targetcitycode);//目的地市code
        map.put("targetcountycode", targetcountycode);//目的地区县code
        map.put("constructs", constructs);//货箱结构,多个用","隔开
        map.put("lengths", lengths);//车长,多个用","隔开
        map.put("authStockFlag", authStockFlag);//是否认证货源 0否1是
        map.put("freightassure", freightassure);//是否运费担保,0否1是空不做限制
        map.put("emptyassure", emptyassure);//是否放空担保,0否1是空不做限制
        map.put("stockkinds", stockkinds);//货物类别名称,多个用逗号隔开
        map.put("starttime", starttime);//货源发布时间区间开始时间,格式yyyy-MM-dd HH:mm:ss
        map.put("endtime", endtime);//货源发布时间区间结束时间,格式yyyy-MM-dd HH:mm:ss
        map.put("start", start);//数据起始索引
        map.put("limit", limit);//每页显示数据数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.newstock");//接口路径
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
     * 货源查询通过手机号1.0
     *
     * @return response
     * @
     */
    public JSONObject stockQueryBymobile1(String mobile, String begindate, String enddate, String start, String limit)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话号码
        map.put("begindate", begindate);//起始时间
        map.put("enddate", enddate);//截止时间
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含数据数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.bymobile");//接口路径
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
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject stockReportUpdatedealstate1(String creditcode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("creditcode", creditcode);//评论编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.report.updatedealstate");//接口路径
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
     * 数据同步出问题时，开启自动认证1.0
     *
     * @return response
     * @
     */
    public JSONObject superDriverCertify1(String switchButton, String cron)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("switchButton", switchButton);//自动认证司机
        map.put("cron", cron);//时间表达式
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.certify");//接口路径
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
     * 企业配置1.0
     *
     * @return response
     * @
     */
    public JSONObject superOpenCompanyConfig1(String serviceInformation, String acountInformation, String signInformation, String businessMode, String formulaRel)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("serviceInformation", serviceInformation);//服务信息
        map.put("acountInformation", acountInformation);//账期信息
        map.put("signInformation", signInformation);//签约信息
        map.put("businessMode", businessMode);//业务模式
        map.put("formulaRel", formulaRel);//公式关联
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.open.company.config");//接口路径
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
     * 新增车牌号1.0
     *
     * @return response
     * @
     */
    public JSONObject transportationblacklistCarnumberAdd1(String carnumber)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("carnumber", carnumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transportationblacklist.carnumber.add");//接口路径
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
     * 查询黑名单车辆列表1.0
     *
     * @return response
     * @
     */
    public JSONObject transportationblacklistCarnumberPagelist1(String carnumber, String pageNum, String pageSize)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("carnumber", carnumber);//车牌号,可选参数
        map.put("pageNum", pageNum);//页码,从1开始
        map.put("pageSize", pageSize);//每页显示记录数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transportationblacklist.carnumber.pagelist");//接口路径
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
     * 删除车牌号1.0
     *
     * @return response
     * @
     */
    public JSONObject transportationblacklistCarnumberRemove1(String id)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一识别编号ID
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transportationblacklist.carnumber.remove");//接口路径
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
     * 修改白名单1.0
     *
     * @return response
     * @
     */
    public JSONObject updateDriverWhite1(String usercode, String ownerwhite, String remark, String contractimg)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("ownerwhite", ownerwhite);//是否自有车白名单，0-否，1-是
        map.put("remark", remark);//备注
        map.put("contractimg", contractimg);//自有车合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.driver.white");//接口路径
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
     * 修改车辆关系1.0
     *
     * @return response
     * @
     */
    public JSONObject updateVehicleDriverRelation1(String vehiclecode, String chargeperson, String chargepersonphone, String usercodes)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//自有车编号
        map.put("chargeperson", chargeperson);//负责人
        map.put("chargepersonphone", chargepersonphone);//负责人电话
        map.put("usercodes", usercodes);//司机登录名，多个以逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.vehicle.driver.relation");//接口路径
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
     * 修改自有车1.0
     *
     * @return response
     * @
     */
    public JSONObject updateVehicleOwner1(String vehiclecode, String vehiclecolor, String manufacturer, String supplier, String purchasefees, String purchasedate, String drivetype, String motdate, String repairperson, String repairphone, String vehiclestate, String remark, String vehiclelength, String vehiclewidth, String vehicleheight, String loadtype, String trailercode, String trailerplatecode, String usefeeratio, String freightfeeratio, String licenseimg, String contractimg, String routeid, String companycode, String companyname)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//自有车编号
        map.put("vehiclecolor", vehiclecolor);//车辆颜色，1-红色，2-蓝色
        map.put("manufacturer", manufacturer);//制造商
        map.put("supplier", supplier);//供货商
        map.put("purchasefees", purchasefees);//采购总价
        map.put("purchasedate", purchasedate);//采购时间
        map.put("drivetype", drivetype);//驱动形式，1-8*4，2-6*2,3-6*4，4-4*2
        map.put("motdate", motdate);//年检时间
        map.put("repairperson", repairperson);//报修人
        map.put("repairphone", repairphone);//报修电话
        map.put("vehiclestate", vehiclestate);//车辆状态，1-正常，2-修整，3-报废
        map.put("remark", remark);//备注
        map.put("vehiclelength", vehiclelength);//外型长
        map.put("vehiclewidth", vehiclewidth);//外型宽
        map.put("vehicleheight", vehicleheight);//外型高
        map.put("loadtype", loadtype);//载货类型
        map.put("trailercode", trailercode);//关联挂车
        map.put("trailerplatecode", trailerplatecode);//挂车牌号
        map.put("usefeeratio", usefeeratio);//车辆使用费比例
        map.put("freightfeeratio", freightfeeratio);//司机运费比例
        map.put("licenseimg", licenseimg);//行驶证照片
        map.put("contractimg", contractimg);//采购合同照片
        map.put("routeid", routeid);//线路ID
        map.put("companycode", companycode);//所属分公司Code
        map.put("companyname", companyname);//所属分公司名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.vehicle.owner");//接口路径
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
     * 修改自有车线下费用1.0
     *
     * @return response
     * @
     */
    public JSONObject updateVehicleOwnerFee1(String feeid, String feetype, String feeamount, String feeperson, String feedate, String feevoucher, String usercode)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("feeid", feeid);//费用ID
        map.put("feetype", feetype);//费用事项，1-二级维护，2-保险，3-维修，4-年检，5-违章，6-其他
        map.put("feeamount", feeamount);//费用金额
        map.put("feeperson", feeperson);//费用发生人
        map.put("feedate", feedate);//费用发生时间
        map.put("feevoucher", feevoucher);//费用凭证
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.vehicle.owner.fee");//接口路径
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
     * 修改线路1.0
     *
     * @return response
     * @
     */
    public JSONObject updateVehicleOwnerRoute1(String routeid, String routename)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("routeid", routeid);//线路ID
        map.put("routename", routename);//线路名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.vehicle.owner.route");//接口路径
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
     * 修改挂车1.0
     *
     * @return response
     * @
     */
    public JSONObject updateVehicleTrailer1(String trailercode, String trailerlicense, String trailercolor, String trailertype, String trailermodel, String trailerlength, String trailerwidth, String trailerheight, String trailertonnage, String licenseimg, String contractimg)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("trailercode", trailercode);//挂车编号
        map.put("trailerlicense", trailerlicense);//挂车行驶证号
        map.put("trailercolor", trailercolor);//挂车颜色，1-红色，2-蓝色
        map.put("trailertype", trailertype);//挂车类型，1-仓栏半挂，2-栏板半挂，3-集装箱骨架半挂，4-厢式半挂
        map.put("trailermodel", trailermodel);//公告型号
        map.put("trailerlength", trailerlength);//外型长
        map.put("trailerwidth", trailerwidth);//外型宽
        map.put("trailerheight", trailerheight);//外型高
        map.put("trailertonnage", trailertonnage);//实际整备
        map.put("licenseimg", licenseimg);//驾驶证照片
        map.put("contractimg", contractimg);//采购合同照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.vehicle.trailer");//接口路径
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
     * 用户和企业关系接口1.0
     *
     * @return response
     * @
     */
    public JSONObject userCompanyRelation1(String type, String usermobile, String companycode, String usercompanyname, String memo)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//操作类型1：创建, 2：删除 ,3：修改
        map.put("usermobile", usermobile);//微信报表用户手机号
        map.put("companycode", companycode);//物流平台Company的companyCode
        map.put("usercompanyname", usercompanyname);//用户关联企业后，取的别名
        map.put("memo", memo);//备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.company.relation");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().getReturnJsonObject();
    }
}
