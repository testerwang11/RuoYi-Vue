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
public class SJBToolService {


    private static String url = "http://sjb-service.sijibao.co/sjbTool/router";
    private static String appcode = "200102";


    /**
     * 将好友添加到分组.支持批量1.0
     *
     * @return response
     * @
     */
    @Step("将好友添加到分组.支持批量1.0")
    public JSONObject addMebToGroup1(String id, String usercodes, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//组id
        map.put("usercodes", usercodes);//好友编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "add.meb.to.group");//接口路径
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
     * 收单员异常单列表2.0
     *
     * @return response
     * @
     */
    @Step("收单员异常单列表2.0")
    public JSONObject businessAbnormalAssureordersListSearch2(String queryType, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("queryType", queryType);//异常单状态，1-需处理，2-审核中
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.abnormal.assureorders.list.search");//接口路径
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
     * 收单员异常单列表1.0
     *
     * @return response
     * @
     */
    @Step("收单员异常单列表1.0")
    public JSONObject businessAbnormalAssureordersListSearch1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.abnormal.assureorders.list.search");//接口路径
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
     * 取消协商1.0
     *
     * @return response
     * @
     */
    @Step("取消协商1.0")
    public JSONObject businessCancelAssureorderConsult1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.cancel.assureorder.consult");//接口路径
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
     * 收单员绑定企业列表查询1.0
     *
     * @return response
     * @
     */
    @Step("收单员绑定企业列表查询1.0")
    public JSONObject businessCompanyListQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.company.list.query");//接口路径
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
     * 计算协商结果数字 版本22.0
     *
     * @return response
     * @
     */
    @Step("计算协商结果数字 版本22.0")
    public JSONObject businessConsultCalculateResult2(String ordernumber, String ruleCode, String variateParamJson, String transFee, String unit, String unitprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ruleCode", ruleCode);//规则编码
        map.put("variateParamJson", variateParamJson);//变量参数json
        map.put("transFee", transFee);//运费
        map.put("unit", unit);//吨位
        map.put("unitprice", unitprice);//单价
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.consult.calculate.result");//接口路径
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
     * 计算协商结果数字1.0
     *
     * @return response
     * @
     */
    @Step("计算协商结果数字1.0")
    public JSONObject businessConsultCalculateResult1(String ordernumber, String ruleCode, String variateParamJson, String transFee, String unit, String unitprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ruleCode", ruleCode);//规则编码
        map.put("variateParamJson", variateParamJson);//变量参数json
        map.put("transFee", transFee);//运费
        map.put("unit", unit);//吨位
        map.put("unitprice", unitprice);//单价
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.consult.calculate.result");//接口路径
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
     * 发起运动协商3.0
     *
     * @return response
     * @
     */
    @Step("发起运动协商3.0")
    public JSONObject businessLanuchAssureorderConsult3(String ordernumber, String money, String mainreason, String otherreason, String settlementnum, String images, String originalunit, String actualunit, String coalcode, String variableparamjson, String rulecode, String stockcost, String unit, String unitprice, String etcmoney, String oilmoney, String cashmoney, String collectiontype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("money", money);//协商金额
        map.put("mainreason", mainreason);//主要原因
        map.put("otherreason", otherreason);//其他原因
        map.put("settlementnum", settlementnum);//结算单号
        map.put("images", images);//图片列表
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("coalcode", coalcode);//
        map.put("variableparamjson", variableparamjson);//变量参数json
        map.put("rulecode", rulecode);//规则编码
        map.put("stockcost", stockcost);//货源运费
        map.put("unit", unit);//单位
        map.put("unitprice", unitprice);//单价
        map.put("etcmoney", etcmoney);//etc金额
        map.put("oilmoney", oilmoney);//油钱
        map.put("cashmoney", cashmoney);//现金金额
        map.put("collectiontype", collectiontype);//收款类型设置 1余额 2银行卡
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.lanuch.assureorder.consult");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "3.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 发起运单协商1.0
     *
     * @return response
     * @
     */
    @Step("发起运单协商1.0")
    public JSONObject businessLanuchAssureorderConsult1(String ordernumber, String money, String mainreason, String otherreason, String settlementnum, String images, String originalunit, String actualunit, String coalcode, String variableparamjson, String rulecode, String stockcost, String unit, String unitprice, String etcmoney, String oilmoney, String cashmoney, String collectiontype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("money", money);//协商金额
        map.put("mainreason", mainreason);//主要原因
        map.put("otherreason", otherreason);//其他原因
        map.put("settlementnum", settlementnum);//结算单号
        map.put("images", images);//图片列表
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("coalcode", coalcode);//
        map.put("variableparamjson", variableparamjson);//变量参数json
        map.put("rulecode", rulecode);//规则编码
        map.put("stockcost", stockcost);//货源运费
        map.put("unit", unit);//单位
        map.put("unitprice", unitprice);//单价
        map.put("etcmoney", etcmoney);//etc金额
        map.put("oilmoney", oilmoney);//油钱
        map.put("cashmoney", cashmoney);//现金金额
        map.put("collectiontype", collectiontype);//收款类型设置 1余额 2银行卡
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.lanuch.assureorder.consult");//接口路径
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
     * 发起运动协商2.0
     *
     * @return response
     * @
     */
    @Step("发起运动协商2.0")
    public JSONObject businessLanuchAssureorderConsult2(String ordernumber, String money, String mainreason, String otherreason, String settlementnum, String images, String originalunit, String actualunit, String coalcode, String variableparamjson, String rulecode, String stockcost, String unit, String unitprice, String etcmoney, String oilmoney, String cashmoney, String collectiontype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("money", money);//协商金额
        map.put("mainreason", mainreason);//主要原因
        map.put("otherreason", otherreason);//其他原因
        map.put("settlementnum", settlementnum);//结算单号
        map.put("images", images);//图片列表
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("coalcode", coalcode);//
        map.put("variableparamjson", variableparamjson);//变量参数json
        map.put("rulecode", rulecode);//规则编码
        map.put("stockcost", stockcost);//货源运费
        map.put("unit", unit);//单位
        map.put("unitprice", unitprice);//单价
        map.put("etcmoney", etcmoney);//etc金额
        map.put("oilmoney", oilmoney);//油钱
        map.put("cashmoney", cashmoney);//现金金额
        map.put("collectiontype", collectiontype);//收款类型设置 1余额 2银行卡
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.lanuch.assureorder.consult");//接口路径
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
     * 运单预签收1.0
     *
     * @return response
     * @
     */
    @Step("运单预签收1.0")
    public JSONObject businessOrderSignpre1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.order.signpre");//接口路径
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
     * 运单支付失败重新支付1.0
     *
     * @return response
     * @
     */
    @Step("运单支付失败重新支付1.0")
    public JSONObject businessOrderfaliuePayagain1(String ordernumbers, String submitall, String keyword, String companycode, String begindate, String enddate, String createbegindate, String crateenddate, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//逗号隔开
        map.put("submitall", submitall);//全部提交 0 运单号提交 1全部提交
        map.put("keyword", keyword);//
        map.put("companycode", companycode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("createbegindate", createbegindate);//
        map.put("crateenddate", crateenddate);//下单截止时间
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.orderfaliue.payagain");//接口路径
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
     * 查询协商记录2.0
     *
     * @return response
     * @
     */
    @Step("查询协商记录2.0")
    public JSONObject businessQueryAssureorderConsult2(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.consult");//接口路径
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
     * 查询协商记录1.0
     *
     * @return response
     * @
     */
    @Step("查询协商记录1.0")
    public JSONObject businessQueryAssureorderConsult1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.consult");//接口路径
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
     * 收单员调整运费支付方案参数校验1.0
     *
     * @return response
     * @
     */
    @Step("收单员调整运费支付方案参数校验1.0")
    public JSONObject businessQueryAssureorderConsultGreightChange1(String ordernumber, String actualcost, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("actualcost", actualcost);//实际应付运费
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.consult.greight.change");//接口路径
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
     * 查询运单详情1.0
     *
     * @return response
     * @
     */
    @Step("查询运单详情1.0")
    public JSONObject businessQueryAssureorderDetail1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.detail");//接口路径
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
     * 查询运单轨迹1.0
     *
     * @return response
     * @
     */
    @Step("查询运单轨迹1.0")
    public JSONObject businessQueryAssureorderGettrack1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.gettrack");//接口路径
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
     * 查询已经完成的运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询已经完成的运单列表1.0")
    public JSONObject businessQueryAssureorderListComplete1(String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.list.complete");//接口路径
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
     * 查询支付失败的运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询支付失败的运单列表1.0")
    public JSONObject businessQueryAssureorderListFailed1(String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.list.failed");//接口路径
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
     * 收单员搜索运单1.0
     *
     * @return response
     * @
     */
    @Step("收单员搜索运单1.0")
    public JSONObject businessQueryAssureorderListSearch1(String keyword, String orderState, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("orderState", orderState);//0:全部、1:待签收、2:已签收、3:复核中、4:拒绝付款、5:复核通过、6:支付失败、7:待卸货
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.list.search");//接口路径
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
     * 查询签到完成一般的运单1.0
     *
     * @return response
     * @
     */
    @Step("查询签到完成一般的运单1.0")
    public JSONObject businessQueryAssureorderListSigninpart1(String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.list.signinpart");//接口路径
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
     * 查询待处理的运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询待处理的运单列表1.0")
    public JSONObject businessQueryAssureorderListWaiting1(String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.assureorder.list.waiting");//接口路径
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
     * 司机收款方查询1.0
     *
     * @return response
     * @
     */
    @Step("司机收款方查询1.0")
    public JSONObject businessQueryCollectiontypeDetail1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.collectiontype.detail");//接口路径
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
     * 按照线路查询运单列表1.0
     *
     * @return response
     * @
     */
    @Step("按照线路查询运单列表1.0")
    public JSONObject businessQueryLineList1(String signSiteCode, String signPeopleCode, String dateQueryType, String loadAdressCode, String unLoadAdressCode, String start, String limit, String companyCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signSiteCode", signSiteCode);//站点编码 收单员查询时 不用传该字段
        map.put("signPeopleCode", signPeopleCode);//收单员编码 收单员查询时 不用传该字段
        map.put("dateQueryType", dateQueryType);//查询类型 今天(1),昨天(2),上周(4),本周(3),上月(6),本月(5)
        map.put("loadAdressCode", loadAdressCode);//装货地code
        map.put("unLoadAdressCode", unLoadAdressCode);//卸货地code
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("companyCode", companyCode);//企业编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.line.list");//接口路径
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
     * 按照线路查询统计1.0
     *
     * @return response
     * @
     */
    @Step("按照线路查询统计1.0")
    public JSONObject businessQueryLineStatisticsKpi1(String signSiteCode, String signPeopleCode, String dateQueryType, String companyCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signSiteCode", signSiteCode);//站点编码 收单员查询时 不用传该字段
        map.put("signPeopleCode", signPeopleCode);//收单员编码 收单员查询时 不用传该字段
        map.put("dateQueryType", dateQueryType);//查询类型 今天(1),昨天(2),上周(4),本周(3),上月(6),本月(5)
        map.put("companyCode", companyCode);//企业编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.line.statistics.kpi");//接口路径
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
     * 查询收单员设置信息1.0
     *
     * @return response
     * @
     */
    @Step("查询收单员设置信息1.0")
    public JSONObject businessQuerySettingDetail1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.setting.detail");//接口路径
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
     * 获取企业站点下的收单员1.0
     *
     * @return response
     * @
     */
    @Step("获取企业站点下的收单员1.0")
    public JSONObject businessQuerySignpeople1(String signsitecode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signsitecode", signsitecode);//站点编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.signpeople");//接口路径
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
     * 查询统计的四个数字1.0
     *
     * @return response
     * @
     */
    @Step("查询统计的四个数字1.0")
    public JSONObject businessQueryStatisticsKpi1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.query.statistics.kpi");//接口路径
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
     * 确认收货1.0
     *
     * @return response
     * @
     */
    @Step("确认收货1.0")
    public JSONObject businessSubmitReceivedGoods1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.submit.received.goods");//接口路径
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
     * 数据切割容错文案1.0
     *
     * @return response
     * @
     */
    @Step("数据切割容错文案1.0")
    public JSONObject businessTipsQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.tips.query");//接口路径
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
     * 修改协商1.0
     *
     * @return response
     * @
     */
    @Step("修改协商1.0")
    public JSONObject businessUpdateAssureorderConsult1(String consultCode, String memo, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultCode", consultCode);//协商编号
        map.put("memo", memo);//备注
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.update.assureorder.consult");//接口路径
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
     * 收单员补传卸货图片1.0
     *
     * @return response
     * @
     */
    @Step("收单员补传卸货图片1.0")
    public JSONObject businessUploadUrl1(String signInOrderCode, String Url, String urlmemo, String ordernumber, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signInOrderCode", signInOrderCode);//签到code
        map.put("Url", Url);//补传的卸货图片
        map.put("urlmemo", urlmemo);//补图描述
        map.put("ordernumber", ordernumber);//运单号
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "business.upload.url");//接口路径
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
     * 煤炭价格管理1.0
     *
     * @return response
     * @
     */
    @Step("煤炭价格管理1.0")
    public JSONObject coalPriceCreateorupdate1(String priceCode, String quailty, String price, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("priceCode", priceCode);//价格编码
        map.put("quailty", quailty);//质量
        map.put("price", price);//价格
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.price.createorupdate");//接口路径
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
     * 煤价删除1.0
     *
     * @return response
     * @
     */
    @Step("煤价删除1.0")
    public JSONObject coalPriceDelete1(String somethingcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//通用主键编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.price.delete");//接口路径
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
     * 收单点详情查询1.0
     *
     * @return response
     * @
     */
    @Step("收单点详情查询1.0")
    public JSONObject coalQueryReceivesiteDetail1(String sitecode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("sitecode", sitecode);//站点编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.query.receivesite.detail");//接口路径
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
     * 查询收单点列表1.0
     *
     * @return response
     * @
     */
    @Step("查询收单点列表1.0")
    public JSONObject coalQueryReceivesiteList1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.query.receivesite.list");//接口路径
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
     * 查询收单员列表1.0
     *
     * @return response
     * @
     */
    @Step("查询收单员列表1.0")
    public JSONObject coalQueryRecopientList1(String something, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("something", something);//通用字符串参数
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.query.recopient.list");//接口路径
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
     * 查询设置详情1.0
     *
     * @return response
     * @
     */
    @Step("查询设置详情1.0")
    public JSONObject coalQuerySettingDetail1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.query.setting.detail");//接口路径
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
     * 查询统计的4个数字1.0
     *
     * @return response
     * @
     */
    @Step("查询统计的4个数字1.0")
    public JSONObject coalQueryStatisticsKpi1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.query.statistics.kpi");//接口路径
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
     * 删除收单规则1.0
     *
     * @return response
     * @
     */
    @Step("删除收单规则1.0")
    public JSONObject coalReceiveRuleDelete1(String somethingcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//通用主键编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.receive.rule.delete");//接口路径
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
     * 查询收单规则列表1.0
     *
     * @return response
     * @
     */
    @Step("查询收单规则列表1.0")
    public JSONObject coalReceiveRuleQueryList1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.receive.rule.query.list");//接口路径
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
     * 创建收单员信息1.0
     *
     * @return response
     * @
     */
    @Step("创建收单员信息1.0")
    public JSONObject coalRecipientCreate1(String name, String phone, String siteCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", name);//姓名
        map.put("phone", phone);//电话
        map.put("siteCode", siteCode);//站点编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.recipient.create");//接口路径
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
     * 创建或者更新收单员信息1.0
     *
     * @return response
     * @
     */
    @Step("创建或者更新收单员信息1.0")
    public JSONObject coalRecipientCreateorupdate1(String recipientCode, String name, String phone, String siteCode, String oldSiteCode, String lineRules, String oldLineRules, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("recipientCode", recipientCode);//收单人编码
        map.put("name", name);//姓名
        map.put("phone", phone);//电话
        map.put("siteCode", siteCode);//站点编码
        map.put("oldSiteCode", oldSiteCode);//旧收单点
        map.put("lineRules", lineRules);//收单规则
        map.put("oldLineRules", oldLineRules);//旧收单规则
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.recipient.createorupdate");//接口路径
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
     * 删除签单员1.0
     *
     * @return response
     * @
     */
    @Step("删除签单员1.0")
    public JSONObject coalRecipientDelete1(String somethingcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//通用主键编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.recipient.delete");//接口路径
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
     * 查询公式列表1.0
     *
     * @return response
     * @
     */
    @Step("查询公式列表1.0")
    public JSONObject coalRuleOperationQueryList1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.rule.operation.query.list");//接口路径
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
     * 提交收单规则公式1.0
     *
     * @return response
     * @
     */
    @Step("提交收单规则公式1.0")
    public JSONObject coalRuleOperationSubmit1(String ruleCode, String ruleName, String constParamValues, String operationCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleCode", ruleCode);//规则编码
        map.put("ruleName", ruleName);//规则名称
        map.put("constParamValues", constParamValues);//常量参数
        map.put("operationCode", operationCode);//操作编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.rule.operation.submit");//接口路径
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
     * 添加或者修改签收点1.0
     *
     * @return response
     * @
     */
    @Step("添加或者修改签收点1.0")
    public JSONObject coalSiteCreateorupdate1(String siteCode, String siteName, String siteAddress, String fee, String range, String rule, String upFee, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("siteCode", siteCode);//站点编码
        map.put("siteName", siteName);//站点名称
        map.put("siteAddress", siteAddress);//站点地址
        map.put("fee", fee);//价格
        map.put("range", range);//容忍值
        map.put("rule", rule);//规则
        map.put("upFee", upFee);//上浮费用
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.site.createorupdate");//接口路径
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
     * 添加或者修改签收点2.0
     *
     * @return response
     * @
     */
    @Step("添加或者修改签收点2.0")
    public JSONObject coalSiteCreateorupdate2(String siteCode, String siteName, String siteAddress, String recipientInfos, String lineRules, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("siteCode", siteCode);//站点编码
        map.put("siteName", siteName);//站点名称
        map.put("siteAddress", siteAddress);//站点地址
        map.put("recipientInfos", recipientInfos);//收单人列表，修改时不传，创建时传递格式：姓名@电话，姓名@电话
        map.put("lineRules", lineRules);//收单规则列表，无修改时不传，有修改时全传
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.site.createorupdate");//接口路径
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
     * 删除签收点1.0
     *
     * @return response
     * @
     */
    @Step("删除签收点1.0")
    public JSONObject coalSiteDelete1(String somethingcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//通用主键编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.site.delete");//接口路径
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
     * 创建分组,支持创建的时候就添加好友1.0
     *
     * @return response
     * @
     */
    @Step("创建分组,支持创建的时候就添加好友1.0")
    public JSONObject createGroup1(String groupname, String grouptype, String usercodes, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupname", groupname);//分组名
        map.put("grouptype", grouptype);//分组类型 1-司机，2-经纪人，3-企业
        map.put("usercodes", usercodes);//好友的编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "create.group");//接口路径
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
     * 根据id删除分组1.0
     *
     * @return response
     * @
     */
    @Step("根据id删除分组1.0")
    public JSONObject deleteGroupById1(String id, String grouptype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//组的主键id
        map.put("grouptype", grouptype);//组类型， 1-司机好友，2-经纪人，3-企业
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "delete.group.by.id");//接口路径
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
     * 查询运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询运单列表1.0")
    public JSONObject intermediaryQueryAssureorderList1(String type, String keyword, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//运单类型
        map.put("keyword", keyword);//关键字
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "intermediary.query.assureorder.list");//接口路径
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
     * 按照线路查询签收运单列表1.0
     *
     * @return response
     * @
     */
    @Step("按照线路查询签收运单列表1.0")
    public JSONObject intermediaryQueryLineListQuery1(String signSiteCode, String signPeopleCode, String dateQueryType, String loadAdressCode, String unLoadAdressCode, String start, String limit, String companyCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signSiteCode", signSiteCode);//站点编码 收单员查询时 不用传该字段
        map.put("signPeopleCode", signPeopleCode);//收单员编码 收单员查询时 不用传该字段
        map.put("dateQueryType", dateQueryType);//查询类型 今天(1),昨天(2),上周(4),本周(3),上月(6),本月(5)
        map.put("loadAdressCode", loadAdressCode);//装货地code
        map.put("unLoadAdressCode", unLoadAdressCode);//卸货地code
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("companyCode", companyCode);//企业编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "intermediary.query.line.list.query");//接口路径
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
     * 按照线路查询统计1.0
     *
     * @return response
     * @
     */
    @Step("按照线路查询统计1.0")
    public JSONObject intermediaryQueryLineStatisticsKpi1(String signSiteCode, String signPeopleCode, String dateQueryType, String companyCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("signSiteCode", signSiteCode);//站点编码 收单员查询时 不用传该字段
        map.put("signPeopleCode", signPeopleCode);//收单员编码 收单员查询时 不用传该字段
        map.put("dateQueryType", dateQueryType);//查询类型 今天(1),昨天(2),上周(4),本周(3),上月(6),本月(5)
        map.put("companyCode", companyCode);//企业编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "intermediary.query.line.statistics.kpi");//接口路径
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
     * 查询统计的四个数字1.0
     *
     * @return response
     * @
     */
    @Step("查询统计的四个数字1.0")
    public JSONObject intermediaryQueryStatisticsKpi1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "intermediary.query.statistics.kpi");//接口路径
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
     * 通过手机号或者用户编码查询司机信息1.0
     *
     * @return response
     * @
     */
    @Step("通过手机号或者用户编码查询司机信息1.0")
    public JSONObject mobileDriverInfoQuery1(String mobile, String usercode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("usercode", usercode);//
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.driver.info.query");//接口路径
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
     * etc处理订单查询1.0
     *
     * @return response
     * @
     */
    @Step("etc处理订单查询1.0")
    public JSONObject mobileEtcOrderQuery1(String account, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//etc工具账号
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.etc.order.query");//接口路径
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
     * etc工具登陆1.0
     *
     * @return response
     * @
     */
    @Step("etc工具登陆1.0")
    public JSONObject mobileEtcRechargeLogon1(String account, String password, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//充值工具账号
        map.put("password", password);//充值工具密码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.etc.recharge.logon");//接口路径
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
     * etc工具充值单查询1.0
     *
     * @return response
     * @
     */
    @Step("etc工具充值单查询1.0")
    public JSONObject mobileEtcRechargequery1(String account, String password, String count, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//充值工具账号
        map.put("password", password);//充值工具密码
        map.put("count", count);//
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.etc.rechargequery");//接口路径
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
     * 短信验证码登录收单员1.0
     *
     * @return response
     * @
     */
    @Step("短信验证码登录收单员1.0")
    public JSONObject mobileLoginCheck1(String mobile, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.check");//接口路径
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
     * 短信验证码登录加油员1.0
     *
     * @return response
     * @
     */
    @Step("短信验证码登录加油员1.0")
    public JSONObject mobileLoginCheckOilsaler1(String mobile, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.check.oilsaler");//接口路径
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
     * 短信验证码登录磅单员1.0
     *
     * @return response
     * @
     */
    @Step("短信验证码登录磅单员1.0")
    public JSONObject mobileLoginCheckPounder1(String mobile, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.check.pounder");//接口路径
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
     * 收单员修改密码1.0
     *
     * @return response
     * @
     */
    @Step("收单员修改密码1.0")
    public JSONObject mobileLoginModifypassword1(String mobile, String loginpass, String newpass, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("loginpass", loginpass);//登录密码
        map.put("newpass", newpass);//新密码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.modifypassword");//接口路径
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
     * 密码登录收单员1.0
     *
     * @return response
     * @
     */
    @Step("密码登录收单员1.0")
    public JSONObject mobileLoginPassword1(String mobile, String loginpass, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("loginpass", loginpass);//登录密码
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.password");//接口路径
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
     * 收单员设置密码1.0
     *
     * @return response
     * @
     */
    @Step("收单员设置密码1.0")
    public JSONObject mobileLoginSetpassword1(String mobile, String loginpass, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("loginpass", loginpass);//登录密码
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.setpassword");//接口路径
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
     * 获取短信登录验证码收单员1.0
     *
     * @return response
     * @
     */
    @Step("获取短信登录验证码收单员1.0")
    public JSONObject mobileLoginSms1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.sms");//接口路径
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
     * 获取短信登录验证码加油员1.0
     *
     * @return response
     * @
     */
    @Step("获取短信登录验证码加油员1.0")
    public JSONObject mobileLoginSmsOilsaler1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.sms.oilsaler");//接口路径
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
     * 获取短信登录验证码磅单员1.0
     *
     * @return response
     * @
     */
    @Step("获取短信登录验证码磅单员1.0")
    public JSONObject mobileLoginSmsPounder1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.login.sms.pounder");//接口路径
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
     * web版收单员忘记密码 获取短信验证码1.0
     *
     * @return response
     * @
     */
    @Step("web版收单员忘记密码 获取短信验证码1.0")
    public JSONObject mobilePasswordSms1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.password.sms");//接口路径
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
     * 校验session并且保鲜1.0
     *
     * @return response
     * @
     */
    @Step("校验session并且保鲜1.0")
    public JSONObject mobileSessionCheck1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.session.check");//接口路径
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
     * 忘记密码或重置密码 验证验证码接口1.0
     *
     * @return response
     * @
     */
    @Step("忘记密码或重置密码 验证验证码接口1.0")
    public JSONObject mobileSmsCheck1(String mobile, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mobile.sms.check");//接口路径
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
     * 查询油枪列表1.0
     *
     * @return response
     * @
     */
    @Step("查询油枪列表1.0")
    public JSONObject oilGunQueryList1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oil.gun.query.list");//接口路径
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
     * 查询油单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询油单列表1.0")
    public JSONObject oilOrderQueryList1(String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oil.order.query.list");//接口路径
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
     * 退款油钱1.0
     *
     * @return response
     * @
     */
    @Step("退款油钱1.0")
    public JSONObject oilOrderRefundMoney1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oil.order.refund.money");//接口路径
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
     * 查询统计1.0
     *
     * @return response
     * @
     */
    @Step("查询统计1.0")
    public JSONObject oilStatisticsQueryKpi1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oil.statistics.query.kpi");//接口路径
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
     * 开票1.0
     *
     * @return response
     * @
     */
    @Step("开票1.0")
    public JSONObject poundPrintBilling1(String billCode, String orderNumber, String deviceCode, String lng, String roughWeight, String tareWeight, String netWeight, String signinImage, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("billCode", billCode);//票单号
        map.put("orderNumber", orderNumber);//运单号
        map.put("deviceCode", deviceCode);//设备号
        map.put("lat", "30.460185");//经纬度
        map.put("lng", lng);//经纬度
        map.put("roughWeight", roughWeight);//毛重
        map.put("tareWeight", tareWeight);//皮重
        map.put("netWeight", netWeight);//净重
        map.put("signinImage", signinImage);//签到图片地址
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.print.billing");//接口路径
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
     * 再来一单1.0
     *
     * @return response
     * @
     */
    @Step("再来一单1.0")
    public JSONObject poundPrintBillingAgain1(String orderScheduleCode, String orderNumber, String lng, String billCode, String signinImage, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderScheduleCode", orderScheduleCode);//任务单号
        map.put("orderNumber", orderNumber);//运单号
        map.put("lat", "30.460185");//经纬度
        map.put("lng", lng);//经纬度
        map.put("billCode", billCode);//票单号
        map.put("signinImage", signinImage);//签到图片地址
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.print.billing.again");//接口路径
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
     * 查询票单详情1.0
     *
     * @return response
     * @
     */
    @Step("查询票单详情1.0")
    public JSONObject poundQueryDetail1(String lng, String billCode, String orderNumber, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("lat", "30.460185");//经纬度
        map.put("lng", lng);//经纬度
        map.put("billCode", billCode);//票单编号
        map.put("orderNumber", orderNumber);//运单编号
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.query.detail");//接口路径
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
     * 查询运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询运单列表1.0")
    public JSONObject poundQueryListAll1(String keyword, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.query.list.all");//接口路径
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
     * 查询已经开票列表1.0
     *
     * @return response
     * @
     */
    @Step("查询已经开票列表1.0")
    public JSONObject poundQueryListComplete1(String keyword, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.query.list.complete");//接口路径
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
     * 查询装、卸地线路明细列表1.0
     *
     * @return response
     * @
     */
    @Step("查询装、卸地线路明细列表1.0")
    public JSONObject poundQueryListRegion1(String sourceCode, String targetCode, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("sourceCode", sourceCode);//起始地CODE
        map.put("targetCode", targetCode);//目的地CODE
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.query.list.region");//接口路径
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
     * 查询待开票列表1.0
     *
     * @return response
     * @
     */
    @Step("查询待开票列表1.0")
    public JSONObject poundQueryListWaiting1(String keyword, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//搜索关键字
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.query.list.waiting");//接口路径
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
     * 查询统计数字1.0
     *
     * @return response
     * @
     */
    @Step("查询统计数字1.0")
    public JSONObject poundQueryStatisticsKpi1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.query.statistics.kpi");//接口路径
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
     * 扫码查询开票列表1.0
     *
     * @return response
     * @
     */
    @Step("扫码查询开票列表1.0")
    public JSONObject poundScan1(String usercode, String beginDate, String endDate, String sorttype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//搜索关键字
        map.put("beginDate", beginDate);//起始时间
        map.put("endDate", endDate);//结束时间
        map.put("sorttype", sorttype);//排序类型 0默认排序1
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "pound.scan");//接口路径
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
     * 查询分组列表1.0
     *
     * @return response
     * @
     */
    @Step("查询分组列表1.0")
    public JSONObject queryGroupList1(String grouptype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("grouptype", grouptype);//组类型，1-司机好友，2-经纪人，3-企业
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.group.list");//接口路径
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
     * 查看组内好友列表1.0
     *
     * @return response
     * @
     */
    @Step("查看组内好友列表1.0")
    public JSONObject queryMebsInGroup1(String id, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//组的主键id
        map.put("start", start);//查询起始
        map.put("limit", limit);//查询截止
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.mebs.in.group");//接口路径
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
     * 移除组内好友.支持批量1.0
     *
     * @return response
     * @
     */
    @Step("移除组内好友.支持批量1.0")
    public JSONObject removeMebFromGroup1(String id, String usercodes, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//组的主键id
        map.put("usercodes", usercodes);//好友编码，多个好友用逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "remove.meb.from.group");//接口路径
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
     * 经纪人修改手机号1.0
     *
     * @return response
     * @
     */
    @Step("经纪人修改手机号1.0")
    public JSONObject stockagentAgentChangeMobile1(String mobile, String authCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//经纪人新手机号
        map.put("authCode", authCode);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.change.mobile");//接口路径
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
     * 删除自有司机1.0
     *
     * @return response
     * @
     */
    @Step("删除自有司机1.0")
    public JSONObject stockagentAgentDelete1(String usercode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.delete");//接口路径
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
     * 经纪人自有司机查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人自有司机查询1.0")
    public JSONObject stockagentAgentDriverlist1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.driverlist");//接口路径
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
     * 经纪人修改手机号，身份验证1.0
     *
     * @return response
     * @
     */
    @Step("经纪人修改手机号，身份验证1.0")
    public JSONObject stockagentAgentIdCheck1(String idCode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("idCode", idCode);//经纪人身份证号
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.id.check");//接口路径
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
     * 通过电话或姓名查询经纪人电话1.0
     *
     * @return response
     * @
     */
    @Step("通过电话或姓名查询经纪人电话1.0")
    public JSONObject stockagentAgentInsert1(String usercode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.insert");//接口路径
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
     * 经纪人分享货源给司机好友1.0
     *
     * @return response
     * @
     */
    @Step("经纪人分享货源给司机好友1.0")
    public JSONObject stockagentAgentShare1(String stockagentcode, String drivercodes, String allselected, String groupids, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("drivercodes", drivercodes);//司机编码
        map.put("allselected", allselected);//是否全选司机
        map.put("groupids", groupids);//司机好友圈子id,可多选，逗号隔开
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.share");//接口路径
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
     * 经纪人修改手机号，发送短信验证码1.0
     *
     * @return response
     * @
     */
    @Step("经纪人修改手机号，发送短信验证码1.0")
    public JSONObject stockagentAgentSms1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//经纪人新手机号
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.sms");//接口路径
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
     * 经纪人货源司机查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人货源司机查询1.0")
    public JSONObject stockagentAgentStockDriverlist1(String stockagentcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agent.stock.driverlist");//接口路径
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
     * 修改经纪人导出报表记录历史的邮箱1.0
     *
     * @return response
     * @
     */
    @Step("修改经纪人导出报表记录历史的邮箱1.0")
    public JSONObject stockagentAgentinfoExportEmailChange1(String id, String email, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//记录id
        map.put("email", email);//发送邮箱
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agentinfo.export.email.change");//接口路径
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
     * 经纪人导出报表记录历史1.0
     *
     * @return response
     * @
     */
    @Step("经纪人导出报表记录历史1.0")
    public JSONObject stockagentAgentinfoExportHistory1(String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agentinfo.export.history");//接口路径
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
     * 经纪人信息费查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人信息费查询1.0")
    public JSONObject stockagentAgentinfoQuery1(String begindate, String enddate, String start, String limit, String payway, String refundstate, String loadname, String unloadname, String platenumber, String drivermobile, String orderstate, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//起始时间
        map.put("enddate", enddate);//截止时间
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("payway", payway);//支付方式 1余额 2微信 3线下
        map.put("refundstate", refundstate);//退款状态 2退款成功 3退款中 4退款失败
        map.put("loadname", loadname);//装货地地址名称
        map.put("unloadname", unloadname);//卸货地地址名称
        map.put("platenumber", platenumber);//车牌号
        map.put("drivermobile", drivermobile);//电话
        map.put("orderstate", orderstate);//筛选状态 1支付 2退款
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agentinfo.query");//接口路径
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
     * 经纪人发起退款1.0
     *
     * @return response
     * @
     */
    @Step("经纪人发起退款1.0")
    public JSONObject stockagentAgentinfoRefund1(String preordercode, String memo, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("preordercode", preordercode);//预抢单唯一编码
        map.put("memo", memo);//备注
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.agentinfo.refund");//接口路径
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
     * 经纪人货源预约司机查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人货源预约司机查询1.0")
    public JSONObject stockagentAppointdriverQuery1(String stockcode, String stockagentcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.appointdriver.query");//接口路径
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
     * 经纪人线路统计列表接口查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人线路统计列表接口查询1.0")
    public JSONObject stockagentCompanyLineListQuery1(String dateformat, String loadcode, String unloadcode, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("dateformat", dateformat);//日期格式 比如 2017-12-5
        map.put("loadcode", loadcode);//装货地编码
        map.put("unloadcode", unloadcode);//卸货地编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.company.line.list.query");//接口路径
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
     * 经纪人线路统计生成报表并发送邮件1.0
     *
     * @return response
     * @
     */
    @Step("经纪人线路统计生成报表并发送邮件1.0")
    public JSONObject stockagentCompanyLineStaticsEmail1(String loadcode, String loadName, String unloadcode, String unloadName, String email, String companyCode, String companyName, String begindate, String enddate, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("loadcode", loadcode);//装货地编码
        map.put("loadName", loadName);//装货地名称
        map.put("unloadcode", unloadcode);//卸货地编码
        map.put("unloadName", unloadName);//卸货地名称
        map.put("email", email);//收件人邮箱
        map.put("companyCode", companyCode);//公司编码
        map.put("companyName", companyName);//公司名称
        map.put("begindate", begindate);//查询开始时间
        map.put("enddate", enddate);//查询结束时间
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.company.line.statics.email");//接口路径
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
     * 经纪人线路统计接口查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人线路统计接口查询1.0")
    public JSONObject stockagentCompanyLineStaticsQuery1(String loadcode, String unloadcode, String begindate, String enddate, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("loadcode", loadcode);//装货地编码
        map.put("unloadcode", unloadcode);//卸货地编码
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.company.line.statics.query");//接口路径
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
     * 经纪人绑定企业查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人绑定企业查询1.0")
    public JSONObject stockagentCompanyQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.company.query");//接口路径
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
     * 经纪人统计接口查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人统计接口查询1.0")
    public JSONObject stockagentCompanyStaticsQuery1(String companycode, String begindate, String enddate, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编码 空默认查所有企业运单统计
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.company.statics.query");//接口路径
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
     * 经纪人合同查询编辑之后1.0
     *
     * @return response
     * @
     */
    @Step("经纪人合同查询编辑之后1.0")
    public JSONObject stockagentContractDetailqueryafter1(String stockagentcode, String contacttype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("contacttype", contacttype);//合同类型 1 经纪服务合同 2保证金合同
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.contract.detailqueryafter");//接口路径
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
     * 经纪人合同查询编辑之前1.0
     *
     * @return response
     * @
     */
    @Step("经纪人合同查询编辑之前1.0")
    public JSONObject stockagentContractDetailquerybefore1(String stockagentcode, String agentmode, String agentunitprice, String agentmoney, String informationfees, String vehiclefee, String advanceexpenditured, String advancepercent, String advancemoney, String advancetype, String daysofaccount, String drivercodes, String contacttype, String rulename, String checkforfee, String precisionrule, String allowlossunit, String unitprice, String offlineserverfee, String allowupunit, String unitupprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("agentmode", agentmode);//代收模式 1 总金额 2单价
        map.put("agentunitprice", agentunitprice);//单价金额
        map.put("agentmoney", agentmoney);//经纪费总额
        map.put("informationfees", informationfees);//信息费金额
        map.put("vehiclefee", vehiclefee);//车辆使用金额
        map.put("advanceexpenditured", advanceexpenditured);//是否垫支 0 不 1垫支
        map.put("advancepercent", advancepercent);//垫支比例
        map.put("advancemoney", advancemoney);//垫支金额
        map.put("advancetype", advancetype);//垫支方式 1现金 2账期
        map.put("daysofaccount", daysofaccount);//账期天数
        map.put("drivercodes", drivercodes);//多个司机逗号隔开
        map.put("contacttype", contacttype);//合同类型 0 默认经纪服务合同 1保证金合同
        map.put("rulename", rulename);//规则名称
        map.put("checkforfee", checkforfee);//对账费
        map.put("precisionrule", precisionrule);//抹零规则0无1,5元以下2,10元以下
        map.put("allowlossunit", allowlossunit);//亏吨容忍
        map.put("unitprice", unitprice);//单价
        map.put("offlineserverfee", offlineserverfee);//新版抢单之前信息费
        map.put("allowupunit", allowupunit);//涨吨容忍
        map.put("unitupprice", unitupprice);//涨吨单价上浮
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.contract.detailquerybefore");//接口路径
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
     * 司机详细信息查询1.0
     *
     * @return response
     * @
     */
    @Step("司机详细信息查询1.0")
    public JSONObject stockagentDriverDetailquery1(String usercode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.driver.detailquery");//接口路径
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
     * 经纪人删除司机好友1.0
     *
     * @return response
     * @
     */
    @Step("经纪人删除司机好友1.0")
    public JSONObject stockagentDriverFreiendDelete1(String usercode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.driver.freiend.delete");//接口路径
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
     * 司机好友列表查询1.0
     *
     * @return response
     * @
     */
    @Step("司机好友列表查询1.0")
    public JSONObject stockagentDriverFreiendquery1(String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.driver.freiendquery");//接口路径
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
     * 经纪人邀请司机1.0
     *
     * @return response
     * @
     */
    @Step("经纪人邀请司机1.0")
    public JSONObject stockagentDriverInvite1(String usercode, String invitememo, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机编码
        map.put("invitememo", invitememo);//邀请备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.driver.invite");//接口路径
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
     * 关键字查询司机信息1.0
     *
     * @return response
     * @
     */
    @Step("关键字查询司机信息1.0")
    public JSONObject stockagentDriverQuerybykeyword1(String keyword, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字匹配查询
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.driver.querybykeyword");//接口路径
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
     * 经纪人登录接口1.0
     *
     * @return response
     * @
     */
    @Step("经纪人登录接口1.0")
    public JSONObject stockagentLogin1(String account, String password)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//帐号
        map.put("password", password);//密码
        map.put("devicenum", "000000000000000");//设备编号
        map.put("devicetype", "4");//设备类型
        map.put("session", null);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.login");//接口路径
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
     * 添加子帐号1.0
     *
     * @return response
     * @
     */
    @Step("添加子帐号1.0")
    public JSONObject stockagentMemberCreate1(String membermobile, String membername, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("membermobile", membermobile);//子成员电话
        map.put("membername", membername);//子成员姓名
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.member.create");//接口路径
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
     * 移除子帐号1.0
     *
     * @return response
     * @
     */
    @Step("移除子帐号1.0")
    public JSONObject stockagentMemberDelete1(String agentmembercode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentmembercode", agentmembercode);//子成员唯一标识
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.member.delete");//接口路径
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
     * 子帐号列表查询1.0
     *
     * @return response
     * @
     */
    @Step("子帐号列表查询1.0")
    public JSONObject stockagentMemberQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.member.query");//接口路径
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
     * 经纪人运单详情查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人运单详情查询1.0")
    public JSONObject stockagentOrderDetailQuery1(String ordernumber, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.detail.query");//接口路径
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
     * 经纪人运单列表查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人运单列表查询1.0")
    public JSONObject stockagentOrderListQuery1(String begindate, String enddate, String start, String limit, String orderstate, String querytype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderstate", orderstate);//运单状态 querytype1（1待确认 2待装货 3待卸货） querytype2（1已完结 2已取消） 0 全部
        map.put("querytype", querytype);//查询类别 1 进行中 2 已完结
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.list.query");//接口路径
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
     * 抹零规则列表查询1.0
     *
     * @return response
     * @
     */
    @Step("抹零规则列表查询1.0")
    public JSONObject stockagentOrderPresiousruleQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.presiousrule.query");//接口路径
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
     * 经纪人规则创建1.0
     *
     * @return response
     * @
     */
    @Step("经纪人规则创建1.0")
    public JSONObject stockagentOrderRuleCreate1(String rulecode, String rulename, String checkforfee, String agentmode, String precisionrule, String allowlossunit, String allowupunit, String unitprice, String unitupprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecode", rulecode);//规则编码 更新时参数必须传
        map.put("rulename", rulename);//规则名称
        map.put("checkforfee", checkforfee);//对账费
        map.put("agentmode", agentmode);//经纪费收取模式
        map.put("precisionrule", precisionrule);//抹零规则 0 无 1 5 2 10 3 取整
        map.put("allowlossunit", allowlossunit);//亏吨容忍
        map.put("allowupunit", allowupunit);//涨吨容忍
        map.put("unitprice", unitprice);//单价
        map.put("unitupprice", unitupprice);//涨吨单价上浮
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.rule.create");//接口路径
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
     * 经纪人规则删除1.0
     *
     * @return response
     * @
     */
    @Step("经纪人规则删除1.0")
    public JSONObject stockagentOrderRuleDelete1(String rulecodes, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecodes", rulecodes);//规则编码 多个逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.rule.delete");//接口路径
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
     * 经纪人规则查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人规则查询1.0")
    public JSONObject stockagentOrderRuleQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.rule.query");//接口路径
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
     * 经纪人规则创建1.0
     *
     * @return response
     * @
     */
    @Step("经纪人规则创建1.0")
    public JSONObject stockagentOrderRuleUpdate1(String rulecode, String rulename, String checkforfee, String agentmode, String precisionrule, String allowlossunit, String allowupunit, String unitprice, String unitupprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecode", rulecode);//规则编码 更新时参数必须传
        map.put("rulename", rulename);//规则名称
        map.put("checkforfee", checkforfee);//对账费
        map.put("agentmode", agentmode);//经纪费收取模式
        map.put("precisionrule", precisionrule);//抹零规则 0 无 1 5 2 10 3 取整
        map.put("allowlossunit", allowlossunit);//亏吨容忍
        map.put("allowupunit", allowupunit);//涨吨容忍
        map.put("unitprice", unitprice);//单价
        map.put("unitupprice", unitupprice);//涨吨单价上浮
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.order.rule.update");//接口路径
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
     * 通过电话或姓名查询经纪人电话1.0
     *
     * @return response
     * @
     */
    @Step("通过电话或姓名查询经纪人电话1.0")
    public JSONObject stockagentQueryBymobileorname1(String keyword, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字全匹配
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.query.bymobileorname");//接口路径
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
     * 经纪费计算1.0
     *
     * @return response
     * @
     */
    @Step("经纪费计算1.0")
    public JSONObject stockagentStockAgentcalculate1(String stockcode, String agentmode, String money, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("agentmode", agentmode);//经纪费模式 1 总价 2单价
        map.put("money", money);//金额
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stock.agentcalculate");//接口路径
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
     * 经纪人货源详情查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人货源详情查询1.0")
    public JSONObject stockagentStockDetailquery1(String stockcode, String stockagentcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stock.detailquery");//接口路径
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
     * 经纪人货源列表查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人货源列表查询1.0")
    public JSONObject stockagentStockQuery1(String stockagentstate, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentstate", stockagentstate);//0 待发布 1 已发布 2 已关闭
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stock.query");//接口路径
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
     * 经纪人货源编辑1.0
     *
     * @return response
     * @
     */
    @Step("经纪人货源编辑1.0")
    public JSONObject stockagentStockUpdate1(String stockagentcode, String agentmode, String agentunitprice, String agentmoney, String informationfees, String vehiclefee, String advanceexpenditured, String advancepercent, String advancemoney, String advancetype, String daysofaccount, String drivercodes, String contacttype, String rulename, String checkforfee, String precisionrule, String allowlossunit, String unitprice, String offlineserverfee, String allowupunit, String unitupprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("agentmode", agentmode);//代收模式 1 总金额 2单价
        map.put("agentunitprice", agentunitprice);//单价金额
        map.put("agentmoney", agentmoney);//经纪费总额
        map.put("informationfees", informationfees);//信息费金额
        map.put("vehiclefee", vehiclefee);//车辆使用金额
        map.put("advanceexpenditured", advanceexpenditured);//是否垫支 0 不 1垫支
        map.put("advancepercent", advancepercent);//垫支比例
        map.put("advancemoney", advancemoney);//垫支金额
        map.put("advancetype", advancetype);//垫支方式 1现金 2账期
        map.put("daysofaccount", daysofaccount);//账期天数
        map.put("drivercodes", drivercodes);//多个司机逗号隔开
        map.put("contacttype", contacttype);//合同类型 0 默认经纪服务合同 1保证金合同
        map.put("rulename", rulename);//规则名称
        map.put("checkforfee", checkforfee);//对账费
        map.put("precisionrule", precisionrule);//抹零规则0无1,5元以下2,10元以下
        map.put("allowlossunit", allowlossunit);//亏吨容忍
        map.put("unitprice", unitprice);//单价
        map.put("offlineserverfee", offlineserverfee);//新版抢单之前信息费
        map.put("allowupunit", allowupunit);//涨吨容忍
        map.put("unitupprice", unitupprice);//涨吨单价上浮
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stock.update");//接口路径
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
     * 经纪人货源编辑之前配置信息查询1.0
     *
     * @return response
     * @
     */
    @Step("经纪人货源编辑之前配置信息查询1.0")
    public JSONObject stockagentStockUpdatebeforevalidate1(String stockcode, String stockagentcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stock.updatebeforevalidate");//接口路径
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
     * 关闭经纪人货源1.0
     *
     * @return response
     * @
     */
    @Step("关闭经纪人货源1.0")
    public JSONObject stockagentStockUpdatestate1(String stockagentcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stock.updatestate");//接口路径
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
     * 货源地址详情查询1.0
     *
     * @return response
     * @
     */
    @Step("货源地址详情查询1.0")
    public JSONObject stockagentStockaddressDetailquery1(String stockcode, String stockagentcode, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.stockaddress.detailquery");//接口路径
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
     * 经纪人修改密码1.0
     *
     * @return response
     * @
     */
    @Step("经纪人修改密码1.0")
    public JSONObject stockagentUpdatepassword1(String oldpassword, String newpassword, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldpassword", oldpassword);//旧密码
        map.put("newpassword", newpassword);//新密码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockagent.updatepassword");//接口路径
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
     * 修改组名1.0
     *
     * @return response
     * @
     */
    @Step("修改组名1.0")
    public JSONObject updateGroupName1(String groupname, String id, String grouptype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupname", groupname);//分组名
        map.put("id", id);//分组id
        map.put("grouptype", grouptype);//组类型， 1-司机好友，2-经纪人，3-企业
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.group.name");//接口路径
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
     * web版短信验证码登录收单员1.0
     *
     * @return response
     * @
     */
    @Step("web版短信验证码登录收单员1.0")
    public JSONObject webMobileLoginCheck1(String mobile, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.login.check");//接口路径
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
     * web版收单员修改密码1.0
     *
     * @return response
     * @
     */
    @Step("web版收单员修改密码1.0")
    public JSONObject webMobileLoginModifypassword1(String mobile, String loginpass, String newpass, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("loginpass", loginpass);//登录密码
        map.put("newpass", newpass);//新密码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.login.modifypassword");//接口路径
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
     * web版密码登录收单员1.0
     *
     * @return response
     * @
     */
    @Step("web版密码登录收单员1.0")
    public JSONObject webMobileLoginPassword1(String mobile, String loginpass, String smsNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("loginpass", loginpass);//登录密码
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.login.password");//接口路径
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
     * web版收单员设置密码1.0
     *
     * @return response
     * @
     */
    @Step("web版收单员设置密码1.0")
    public JSONObject webMobileLoginSetpassword1(String mobile, String loginpass, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("loginpass", loginpass);//登录密码
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.login.setpassword");//接口路径
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
     * web版获取短信登录验证码收单员1.0
     *
     * @return response
     * @
     */
    @Step("web版获取短信登录验证码收单员1.0")
    public JSONObject webMobileLoginSms1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.login.sms");//接口路径
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
     * 忘记密码 获取短信验证码1.0
     *
     * @return response
     * @
     */
    @Step("忘记密码 获取短信验证码1.0")
    public JSONObject webMobilePasswordSms1(String mobile, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.password.sms");//接口路径
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
     * web版忘记密码或重置密码 验证验证码接口1.0
     *
     * @return response
     * @
     */
    @Step("web版忘记密码或重置密码 验证验证码接口1.0")
    public JSONObject webMobileSmsCheck1(String mobile, String smsNum, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话
        map.put("smsNum", smsNum);//短信验证码
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "web.mobile.sms.check");//接口路径
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
     * 收单员绑定企业列表查询1.0
     *
     * @return response
     * @
     */
    @Step("收单员绑定企业列表查询1.0")
    public JSONObject webbusinessCompanyListQuery1(String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.company.list.query");//接口路径
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
     * 计算协商结果数字1.0
     *
     * @return response
     * @
     */
    @Step("计算协商结果数字1.0")
    public JSONObject webbusinessConsultCalculateResult1(String ordernumber, String ruleCode, String variateParamJson, String transFee, String unit, String unitprice, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ruleCode", ruleCode);//规则编码
        map.put("variateParamJson", variateParamJson);//变量参数json
        map.put("transFee", transFee);//运费
        map.put("unit", unit);//吨位
        map.put("unitprice", unitprice);//单价
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.consult.calculate.result");//接口路径
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
     * 收单员重新上传凭证1.0
     *
     * @return response
     * @
     */
    @Step("收单员重新上传凭证1.0")
    public JSONObject webbusinessConsultUpdateproof1(String ordernumber, String proof, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("proof", proof);//收单凭证
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.consult.updateproof");//接口路径
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
     * 发起运动协商1.0
     *
     * @return response
     * @
     */
    @Step("发起运动协商1.0")
    public JSONObject webbusinessLanuchAssureorderConsult1(String ordernumber, String money, String mainreason, String otherreason, String settlementnum, String images, String variableparamjson, String rulecode, String stockcost, String unit, String unitprice, String etcmoney, String oilmoney, String cashmoney, String collectiontype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("money", money);//协商金额
        map.put("mainreason", mainreason);//主要原因
        map.put("otherreason", otherreason);//其他原因
        map.put("settlementnum", settlementnum);//结算单号
        map.put("images", images);//图片列表
        map.put("variableparamjson", variableparamjson);//变量参数json
        map.put("rulecode", rulecode);//规则编码
        map.put("stockcost", stockcost);//货源运费
        map.put("unit", unit);//单位
        map.put("unitprice", unitprice);//单价
        map.put("etcmoney", etcmoney);//etc金额
        map.put("oilmoney", oilmoney);//油钱
        map.put("cashmoney", cashmoney);//现金金额
        map.put("collectiontype", collectiontype);//收款类型设置 1余额 2银行卡
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.lanuch.assureorder.consult");//接口路径
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
     * 收单员调整运费支付方案参数校验1.0
     *
     * @return response
     * @
     */
    @Step("收单员调整运费支付方案参数校验1.0")
    public JSONObject webbusinessQueryAssureorderConsultGreightChange1(String ordernumber, String actualcost, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("actualcost", actualcost);//实际应付运费
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.consult.greight.change");//接口路径
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
     * 已签收运单详情(复核被拒绝)1.0
     *
     * @return response
     * @
     */
    @Step("已签收运单详情(复核被拒绝)1.0")
    public JSONObject webbusinessQueryAssureorderDetailSign1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.detail.sign");//接口路径
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
     * 未签收，在途，异常运单详情1.0
     *
     * @return response
     * @
     */
    @Step("未签收，在途，异常运单详情1.0")
    public JSONObject webbusinessQueryAssureorderDetailSigninpart1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.detail.signinpart");//接口路径
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
     * 查询运单轨迹1.0
     *
     * @return response
     * @
     */
    @Step("查询运单轨迹1.0")
    public JSONObject webbusinessQueryAssureorderGettrack1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.gettrack");//接口路径
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
     * 收单员异常单列表2.0
     *
     * @return response
     * @
     */
    @Step("收单员异常单列表2.0")
    public JSONObject webbusinessQueryAssureorderListAbnormal2(String begindate, String enddate, String keyword, String companycode, String sorttype, String querytype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//下单起始时间
        map.put("enddate", enddate);//下单截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("companycode", companycode);//企业编码
        map.put("sorttype", sorttype);//默认倒序排序 1 顺序排序
        map.put("querytype", querytype);//查询类型 1待处理 2待审核 3已驳回 4已处理
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.abnormal");//接口路径
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
     * 异常单列表查询1.0
     *
     * @return response
     * @
     */
    @Step("异常单列表查询1.0")
    public JSONObject webbusinessQueryAssureorderListAbnormal1(String begindate, String enddate, String keyword, String companycode, String sorttype, String querytype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//下单起始时间
        map.put("enddate", enddate);//下单截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("companycode", companycode);//企业编码
        map.put("sorttype", sorttype);//默认倒序排序 1 顺序排序
        map.put("querytype", querytype);//查询类型 1待处理 2待审核 3已驳回 4已处理
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.abnormal");//接口路径
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
     * 已签收列表查询1.0
     *
     * @return response
     * @
     */
    @Step("已签收列表查询1.0")
    public JSONObject webbusinessQueryAssureorderListComplete1(String begindate, String enddate, String keyword, String orderstate, String companycode, String createbegindate, String crateenddate, String orderbysigntime, String orderbycreatetime, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//到达起始时间
        map.put("enddate", enddate);//到达截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("orderstate", orderstate);//运单状态 1 已签收 2待复核 3复核通过 4 处理中
        map.put("companycode", companycode);//企业编码
        map.put("createbegindate", createbegindate);//下单起始时间
        map.put("crateenddate", crateenddate);//下单截止时间
        map.put("orderbysigntime", orderbysigntime);//运单到达时间排序，1：递减，2：递增，0：不排序
        map.put("orderbycreatetime", orderbycreatetime);//运单创建时间排序，1：递减，2：递增，0：不排序
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.complete");//接口路径
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
     * 已签收列表导出1.0
     *
     * @return response
     * @
     */
    @Step("已签收列表导出1.0")
    public JSONObject webbusinessQueryAssureorderListCompleteExport1(String begindate, String enddate, String keyword, String orderstate, String companycode, String createbegindate, String crateenddate, String orderbysigntime, String orderbycreatetime, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//到达起始时间
        map.put("enddate", enddate);//到达截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("orderstate", orderstate);//运单状态 1 已签收 2待复核 3复核通过 4 处理中
        map.put("companycode", companycode);//企业编码
        map.put("createbegindate", createbegindate);//下单起始时间
        map.put("crateenddate", crateenddate);//下单截止时间
        map.put("orderbysigntime", orderbysigntime);//运单到达时间排序，1：递减，2：递增，0：不排序
        map.put("orderbycreatetime", orderbycreatetime);//运单创建时间排序，1：递减，2：递增，0：不排序
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.complete.export");//接口路径
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
     * 支付失败运单列表查询1.0
     *
     * @return response
     * @
     */
    @Step("支付失败运单列表查询1.0")
    public JSONObject webbusinessQueryAssureorderListFailed1(String begindate, String enddate, String createbegindate, String crateenddate, String keyword, String companycode, String orderbysigntime, String orderbycreatetime, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//签收起始时间
        map.put("enddate", enddate);//签收截止时间
        map.put("createbegindate", createbegindate);//下单起始时间
        map.put("crateenddate", crateenddate);//下单截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("companycode", companycode);//企业编码
        map.put("orderbysigntime", orderbysigntime);//运单签收时间排序，1：递减，2：递增，0：不排序
        map.put("orderbycreatetime", orderbycreatetime);//运单创建时间排序，1：递减，2：递增，0：不排序
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.failed");//接口路径
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
     * 在途单查询1.0
     *
     * @return response
     * @
     */
    @Step("在途单查询1.0")
    public JSONObject webbusinessQueryAssureorderListSigninpart1(String begindate, String enddate, String keyword, String companycode, String sorttype, String querytype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//下单起始时间
        map.put("enddate", enddate);//下单截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("companycode", companycode);//企业编码
        map.put("sorttype", sorttype);//默认倒序排序 1 顺序排序
        map.put("querytype", querytype);//查询类型 1待处理 2待审核 3已驳回 4已处理
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.signinpart");//接口路径
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
     * 在途运单导出1.0
     *
     * @return response
     * @
     */
    @Step("在途运单导出1.0")
    public JSONObject webbusinessQueryAssureorderListSigninpartExport1(String begindate, String enddate, String keyword, String companycode, String sorttype, String querytype, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//下单起始时间
        map.put("enddate", enddate);//下单截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("companycode", companycode);//企业编码
        map.put("sorttype", sorttype);//默认倒序排序 1 顺序排序
        map.put("querytype", querytype);//查询类型 1待处理 2待审核 3已驳回 4已处理
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.signinpart.export");//接口路径
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
     * 待签收列表查询1.0
     *
     * @return response
     * @
     */
    @Step("待签收列表查询1.0")
    public JSONObject webbusinessQueryAssureorderListWaiting1(String begindate, String enddate, String keyword, String orderstate, String companycode, String createbegindate, String crateenddate, String orderbysigntime, String orderbycreatetime, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//到达起始时间
        map.put("enddate", enddate);//到达截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("orderstate", orderstate);//运单状态 1 待签收 2复核被拒绝
        map.put("companycode", companycode);//企业编码
        map.put("createbegindate", createbegindate);//下单起始时间
        map.put("crateenddate", crateenddate);//下单截止时间
        map.put("orderbysigntime", orderbysigntime);//运单到达时间排序，1：递减，2：递增，0：不排序
        map.put("orderbycreatetime", orderbycreatetime);//运单创建时间排序，1：递减，2：递增，0：不排序
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.waiting");//接口路径
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
     * 待签收列表导出1.0
     *
     * @return response
     * @
     */
    @Step("待签收列表导出1.0")
    public JSONObject webbusinessQueryAssureorderListWaitingExport1(String begindate, String enddate, String keyword, String orderstate, String companycode, String createbegindate, String crateenddate, String orderbysigntime, String orderbycreatetime, String start, String limit, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//到达起始时间
        map.put("enddate", enddate);//到达截止时间
        map.put("keyword", keyword);//关键字查询
        map.put("orderstate", orderstate);//运单状态 1 待签收 2复核被拒绝
        map.put("companycode", companycode);//企业编码
        map.put("createbegindate", createbegindate);//下单起始时间
        map.put("crateenddate", crateenddate);//下单截止时间
        map.put("orderbysigntime", orderbysigntime);//运单到达时间排序，1：递减，2：递增，0：不排序
        map.put("orderbycreatetime", orderbycreatetime);//运单创建时间排序，1：递减，2：递增，0：不排序
        map.put("start", start);//分页起始
        map.put("limit", limit);//分页大小
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.assureorder.list.waiting.export");//接口路径
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
     * 司机收款方查询1.0
     *
     * @return response
     * @
     */
    @Step("司机收款方查询1.0")
    public JSONObject webbusinessQueryCollectiontypeDetail1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.collectiontype.detail");//接口路径
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
     * 按照线路查询统计1.0
     *
     * @return response
     * @
     */
    @Step("按照线路查询统计1.0")
    public JSONObject webbusinessQueryLineStatisticsKpi1(String companycode, String begindate, String enddate, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编码
        map.put("begindate", begindate);//其实时间
        map.put("enddate", enddate);//截止时间
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.line.statistics.kpi");//接口路径
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
     * 查询收单员签收规则列表1.0
     *
     * @return response
     * @
     */
    @Step("查询收单员签收规则列表1.0")
    public JSONObject webbusinessQuerySettingDetail1(String ordernumber, String signinordertype, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("signinordertype", signinordertype);//运单异常状态 0 无异常 1装 2卸
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.query.setting.detail");//接口路径
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
     * 收单员补传卸货图片1.0
     *
     * @return response
     * @
     */
    @Step("收单员补传卸货图片1.0")
    public JSONObject webbusinessUnloadUrl1(String url, String signinordercode, String urlmemo, String ordernumber, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("url", url);//补传的卸货图片
        map.put("signinordercode", signinordercode);//签到编码
        map.put("urlmemo", urlmemo);//备注说明
        map.put("ordernumber", ordernumber);//运单号
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.unload.url");//接口路径
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
     * 修改协商备注1.0
     *
     * @return response
     * @
     */
    @Step("修改协商备注1.0")
    public JSONObject webbusinessUpdateAssureorderConsult1(String consultCode, String memo, String session)  {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultCode", consultCode);//协商编号
        map.put("memo", memo);//备注
        map.put("session", session);//用户标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "webbusiness.update.assureorder.consult");//接口路径
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
     * 20190814 025213
     * @return response
     * @throws Exception
     */
    @Step("新建开票点1.0")
        public JSONObject ticketPositionCreate1 (String positionName, String memberListJsonStr, String session) {
        HashMap<String, String> map = new HashMap<>();
            map.put("positionName", positionName);//开票点名称
            map.put("memberListJsonStr", memberListJsonStr);//开票点初始成员列表json串：[{'mobile':'18086047775','memberName':'乐思文'},{'mobile':'15927161639','memberName':'何斌'}]
            map.put("session", session);//用户标识
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
}
