package com.ruoyi.project.sjbapi.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.SignUtil;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 会员服务相关接口
 */
public class SJBStockOrderService {

    private static String url = "http://sjb-service.sijibao.co/sjbStockOrder/router";
    private static String appcode = "100094";

   /* private static String url = Config.getYml().getUrl("sjbStockOrder");
    private static String appcode = Config.getYml().getAppCode("sjbStockOrder");*/

    /**
     * 运单指派给车队长的司机1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderAssignDriver1(String isAssigned, String orderNumber, String userLeaderDriverCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isAssigned", isAssigned);//是否已经有过指派，第一次指派传0，修改指派传1，默认为0
        map.put("orderNumber", orderNumber);//订单号
        map.put("userLeaderDriverCode", userLeaderDriverCode);//被指派的司机的编号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.assign.driver");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 取消运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancel1(String orderNumber, String dynamicStates, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("dynamicStates", dynamicStates);//订单当前状态
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机处理被取消运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelDeal1(String cancelAssureOrderCode, String type, String ordernumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cancelAssureOrderCode", cancelAssureOrderCode);//取消的运单编码
        map.put("type", type);//处理类型 1表示企业端取消取消，2表示司机端拒绝，3表示司机端同意，4表示客服处理
        map.put("ordernumber", ordernumber);//运单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.deal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询取消运单详情2.0版本2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelQueryDetail2(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.query.detail");//接口路径
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
     * 查询取消运单详情1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelQueryDetail1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 提交更新取消运单请求2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelSubmit2(String orderNumber, String refundableCash, String reason, String images, String refundCash, String orderCancleRecord, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//运单号
        map.put("refundableCash", refundableCash);//总共的现金
        map.put("reason", reason);//赔偿原因
        map.put("images", images);//图片
        map.put("refundCash", refundCash);//赔偿的现金
        map.put("orderCancleRecord", orderCancleRecord);//取消记录
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.submit");//接口路径
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
     * 提交取消运单请求1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelSubmit1(String orderNumber, String refundableCash, String refundableOilcard, String refundableDeposit, String refundCash, String refundOilcard, String refundDeposit, String reason, String images, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//运单号
        map.put("refundableCash", refundableCash);//总共的现金
        map.put("refundableOilcard", refundableOilcard);//总共的油卡
        map.put("refundableDeposit", refundableDeposit);//总共的保证金
        map.put("refundCash", refundCash);//赔偿的现金
        map.put("refundOilcard", refundOilcard);//赔偿的油卡
        map.put("refundDeposit", refundDeposit);//赔偿的保证金
        map.put("reason", reason);//赔偿原因
        map.put("images", images);//图片
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.submit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelTest1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.test");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改取消运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCancelUpdate1(String cancelAssureOrderCode, String refundCash, String refundOilcard, String refundDeposit, String ordernumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cancelAssureOrderCode", cancelAssureOrderCode);//取消的订单编码
        map.put("refundCash", refundCash);//赔偿现金
        map.put("refundOilcard", refundOilcard);//赔偿的油卡
        map.put("refundDeposit", refundDeposit);//赔偿的保证金
        map.put("ordernumber", ordernumber);//取消运单运单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.cancel.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过运单号查询收单规则复核信息1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCoalruleQuerybyordernumber1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.coalrule.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180413企业端查询运单列表 各运单数量1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCompanyqueryCount1(String membercode, String isweb, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//成员编码
        map.put("isweb", isweb);//是否web端
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.companyquery.count");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180622企业端查询运单列表2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCompanyqueryList2(String membercode, String querytype, String begindate, String enddate, String start, String limit, String keyword, String month, String type, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//成员编码
        map.put("querytype", querytype);//状态 1待装货 2在途 3协商中4完结运单
        map.put("type", type);
        map.put("begindate", begindate);//开始日期
        map.put("enddate", enddate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("keyword", keyword);//关键子查询 待定
        map.put("month", month);//月份信息
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.companyquery.list");//接口路径
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
     * 20180822企业端查询运单列表3.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCompanyqueryList3(String membercode, String querytype, String begindate, String enddate, String start, String limit, String keyword, String month, String loadAddressCode, String unloadAddressCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//成员编码
        map.put("querytype", querytype);//状态 1待装货 2在途 3协商中4完结运单
        map.put("begindate", begindate);//开始日期
        map.put("enddate", enddate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("keyword", keyword);//关键子查询 待定
        map.put("month", month);//月份信息
        map.put("loadAddressCode", loadAddressCode);//装货地 编码
        map.put("unloadAddressCode", unloadAddressCode);//卸货地编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.companyquery.list");//接口路径
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
     * 20180413企业端查询运单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCompanyqueryList1(String membercode, String querytype, String begindate, String enddate, String start, String limit, String keyword, String month, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//成员编码
        map.put("querytype", querytype);//状态 1待装货 2在途 3协商中4完结运单
        map.put("begindate", begindate);//开始日期
        map.put("enddate", enddate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("keyword", keyword);//关键子查询 待定
        map.put("month", month);//月份信息
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.companyquery.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 业务员修改结果下一步1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderConsultCalculateResult1(String ordernumber, String actualunit, String originalunit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("actualunit", actualunit);//实际吨位
        map.put("originalunit", originalunit);//发货吨位
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.consult.calculate.result");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
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
    public JSONObject assureorderConsultQuery1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.consult.query");//接口路径
        map.put("format", "json");//数据交互格式
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
    public JSONObject assureorderConsultQuery2(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.consult.query");//接口路径
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
     * 业务员修改结果确认1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderConsultSubmit1(String ordernumber, String needpay, String variateparamjson, String smscode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("needpay", needpay);//应付运费
        map.put("variateparamjson", variateparamjson);//变量json
        map.put("smscode", smscode);//短信验证码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.consult.submit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 协商记录同意或拒绝1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderConsultUpdatestate1(String consultRecordCode, String type, String consultType, String agreeContract, String contractNo, String ordernumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultRecordCode", consultRecordCode);//协商编码
        map.put("type", type);//0:拒绝协商；1同意协商；2：停止协商
        map.put("consultType", consultType);//协商类型
        map.put("agreeContract", agreeContract);//(运费结果调整需要签合同)是否同意签合同，同意签合同传1，默认不需要传
        map.put("contractNo", contractNo);//合同号
        map.put("ordernumber", ordernumber);//运单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.consult.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 抢单接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderCreate1(String stockCode, String driverCode, String driverPhone, String vehicleCode, String stockChannelCode, String contractType, String leaderDriver, String agentCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编号
        map.put("driverCode", driverCode);//司机的usercode
        map.put("driverPhone", driverPhone);//司机的电话号码
        map.put("vehicleCode", vehicleCode);//车辆编号
        map.put("stockChannelCode", stockChannelCode);//信息部分享货源
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("leaderDriver", leaderDriver);//车队长司机编码
        map.put("agentCode", agentCode);//经纪人编码
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 抢单接口2.0
     *
     * @return response
     * @
     */
    @Step("抢单")
    public JSONObject assureorderCreate2(String stockCode, String driverCode, String driverPhone, String vehicleCode, String stockChannelCode, String contractType, String leaderDriver, String agentCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编号
        map.put("driverCode", driverCode);//司机的usercode
        map.put("driverPhone", driverPhone);//司机的电话号码
        map.put("vehicleCode", vehicleCode);//车辆编号
        map.put("stockChannelCode", stockChannelCode);//信息部分享货源
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("leaderDriver", leaderDriver);//车队长司机编码
        map.put("agentCode", agentCode);//经纪人编码
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        map.put("locale", "zh_CN");
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    @Step("抢单")
    public JSONObject assureorderCreate3(String stockCode, String driverCode, String driverPhone, String vehicleCode, String stockChannelCode, String contractType, String leaderDriver, String agentCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编号
        map.put("driverCode", driverCode);//司机的usercode
        map.put("driverPhone", driverPhone);//司机的电话号码
        map.put("vehicleCode", vehicleCode);//车辆编号
        map.put("stockChannelCode", stockChannelCode);//信息部分享货源
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("leaderDriver", leaderDriver);//车队长司机编码
        map.put("agentCode", agentCode);//经纪人编码
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "3.0");//接口版本
        map.put("locale", "zh_CN");
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }
    /**
     * 处理待审批运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderDealApprove1(String orderNumbers, String dealResult, String reason, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//批量的订单号
        map.put("dealResult", dealResult);//处理结果，同意：1；拒绝：2（默认）；暂时是需要处理拒绝
        map.put("reason", reason);//原因
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.deal.approve");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderDelete1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180413司机端查询运单列表 各运单数量1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderDriverqueryCount1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.driverquery.count");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180413司机端查询运单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderDriverqueryList1(String querytype, String begindate, String enddate, String start, String limit, String keyword, String month, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//状态 1进行中 2已完结
        map.put("begindate", begindate);//开始日期
        map.put("enddate", enddate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("keyword", keyword);//关键子查询 待定
        map.put("month", month);//月份信息
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.driverquery.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180622司机端查询运单列表2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderDriverqueryList2(String querytype, String begindate, String enddate, String start, String limit, String keyword, String month, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//状态 1待装货 2在途 3协商中4完结运单
        map.put("begindate", begindate);//开始日期
        map.put("enddate", enddate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("keyword", keyword);//关键子查询 待定
        map.put("month", month);//月份信息
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.driverquery.list");//接口路径
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
     * 20180622司机端查询运单列表2.0
     *
     * @return response
     * @

    public JSONObject assureorderDriverqueryList3(String membercode, String querytype, String begindate, String enddate, String start, String limit, String keyword, String month, String loadAddressCode, String unloadAddressCode, String session) {
    HashMap<String, String> map = new HashMap<>();
    map.put("membercode", membercode);
    map.put("querytype", querytype);//状态 1待装货 2在途 3协商中4完结运单
    map.put("begindate", begindate);//开始日期
    map.put("enddate", enddate);//结束日期
    map.put("start", start);//从第几页开始
    map.put("limit", limit);//每页包含的数据数量
    map.put("keyword", keyword);//关键子查询 待定
    map.put("month", month);//月份信息
    map.put("loadAddressCode", loadAddressCode);//月份信息
    map.put("unloadAddressCode", unloadAddressCode);//月份信息

    map.put("session", session);//系统框架参数
    map.put("appcode", appcode);//应用程序编码
    map.put("method", "assureorder.driverquery.list");//接口路径
    map.put("format", "json");//数据交互格式
    map.put("v", "3.0");//接口版本
    //忽略签名的字段
    List<String> ignoreParamNames = new ArrayList<>();
    //签名
    String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
    map.put("sign", signValue);
    return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }*/

    /**
     * 车队长货源运单查询1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderDriverstockQueryList1(String driver, String stockcode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//司机编码
        map.put("stockcode", stockcode);//货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.driverstock.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单节点_ETC充值(依靠工具)1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderEtcRecharge1(String orderNumber, String payPassword, String token, String paytime, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("payPassword", payPassword);//密码
        map.put("token", token);//金融平台token
        map.put("paytime", paytime);//支付节点 1 装货 2 交货 3 尾款
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.etc.recharge");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业确认运单无需支付1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderCheck1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.order.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改装卸货地址1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderaddressUpdate1(String orderNumber, String orignalAddressCode, String targetAddressCode, String type, String clientType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("orignalAddressCode", orignalAddressCode);//修改之前地址编码
        map.put("targetAddressCode", targetAddressCode);//修改之后地址编码
        map.put("type", type);//修改类型 1 装货地修改 2 卸货地修改
        map.put("clientType", clientType);//客户端类型 1web 2app
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderaddress.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核详情(简约版)1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckAddDetailQueryApp1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.add.detail.query.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量复核不通过(非多级)1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckBatchNotpass1(String orderNumbers, String checkMemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//运单号,逗号隔开
        map.put("checkMemo", checkMemo);//备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.batch.notpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量复核通过(非多级)1.0
     *
     * @return response
     * @
     */
    @Step("批量复核通过(非多级)1.0")
    public JSONObject assureorderOrdercheckBatchPass1(String orderNumbers, String payPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//运单号,逗号隔开
        map.put("payPassword", payPassword);//支付密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.batch.pass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("payPassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核详情1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckDetailQueryApp1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.detail.query.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckListQueryApp1(String beginDate, String endDate, String start, String limit, String checkState, String signPeopleMobile, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//
        map.put("endDate", endDate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("checkState", checkState);//0 所有 2待复核 3拒绝付款 4复核通过
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("keyword", keyword);//关键字 手机号码 车牌号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.list.query.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核不通过(非多级)1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckNotpass1(String orderNumber, String checkMemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//运单号
        map.put("checkMemo", checkMemo);//备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.notpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核通过(非多级)1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckPass1(String orderNumber, String payPassword, String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//运单号
        map.put("payPassword", payPassword);//支付密码
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.pass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("payPassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 发货统计线路列表查询接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckStaticsListQuery1(String dateQueryType, String memberCode, String loadAdressCode, String unLoadAdressCode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dateQueryType", dateQueryType);//查询类型 今天(1),昨天(2),上周(4),本周(3),上月(6),本月(5)
        map.put("memberCode", memberCode);//成员编码 可选参数
        map.put("loadAdressCode", loadAdressCode);//装货地code
        map.put("unLoadAdressCode", unLoadAdressCode);//卸货地code
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.statics.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 最新发货统计线路列表查询接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckStaticsListQueryNew1(String begindate, String enddate, String membercode, String staticstype, String loadadresscode, String unLoadadresscode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//起始时间
        map.put("enddate", enddate);//截至时间
        map.put("membercode", membercode);//成员编码 可选参数
        map.put("staticstype", staticstype);//统计类型 1,下单统计;2,实发统计;3,实收统计;4,取消统计
        map.put("loadadresscode", loadadresscode);//装货地code
        map.put("unLoadadresscode", unLoadadresscode);//卸货地code
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.statics.list.query.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 发货统计接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckStaticsQuery1(String dateQueryType, String memberCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dateQueryType", dateQueryType);//查询类型 今天(1),昨天(2),上周(4),本周(3),上月(6),本月(5)
        map.put("memberCode", memberCode);//成员编码 可选参数
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.statics.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 最新发货统计接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckStaticsQueryNew1(String begindate, String enddate, String membercode, String staticstype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//起始时间
        map.put("enddate", enddate);//截至时间
        map.put("membercode", membercode);//成员编码 可选参数
        map.put("staticstype", staticstype);//统计类型 1,下单统计;2,实发统计;3,实收统计;4,取消统计
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheck.statics.query.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业运费复核详情查询1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercheckfreightQuery1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercheckfreight.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业运单数量查询1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdercountQuery1(String membercode, String isweb, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//成员编码
        map.put("isweb", isweb);//是否web端
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordercount.query");//接口路径
        map.put("format", "json");//数据交互格式
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
    public JSONObject assureorderOrderfaliuePayagain1(String ordernumbers, String submitall, String begindate, String enddate, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//逗号隔开
        map.put("submitall", submitall);//全部提交 0 运单号提交 1全部提交
        map.put("begindate", begindate);//复核时间最小值
        map.put("enddate", enddate);//复核时间最大值
        map.put("keyword", keyword);//关键字 手机号码 车牌号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderfaliue.payagain");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机端查看运单运费详情1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderfreightQuery1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderfreight.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量复核不通过1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdermulticheckBatchnotpass1(String ordernumbers, String memo, String ordertype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号 多个逗号隔开
        map.put("memo", memo);//复核备注
        map.put("ordertype", ordertype);//审核人身份 1业务员 2普通财务 3财务总监
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordermulticheck.batchnotpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量复核通过1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdermulticheckBatchpass1(String ordernumbers, String smscode, String ordertype, String paypassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号 多个逗号隔开
        map.put("smscode", smscode);//短信验证码
        map.put("ordertype", ordertype);//审核人身份 1业务员 2普通财务 3财务总监
        map.put("paypassword", paypassword);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordermulticheck.batchpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("paypassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核验收获取验证码1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdermulticheckGetsms1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordermulticheck.getsms");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核不通过1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdermulticheckNotpass1(String memo, String ordernumber, String ordertype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("memo", memo);//备注
        map.put("ordernumber", ordernumber);//运单号
        map.put("ordertype", ordertype);//审核人身份 1业务员 2普通财务 3财务总监
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordermulticheck.notpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核通过1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrdermulticheckPass1(String smscode, String ordernumber, String ordertype, String paypassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("smscode", smscode);//验证码
        map.put("ordernumber", ordernumber);//运单号
        map.put("ordertype", ordertype);//审核人身份 1业务员 2普通财务 3财务总监
        map.put("paypassword", paypassword);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.ordermulticheck.pass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("paypassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 结束任务单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderscheduleFinish1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderschedule.finish");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 继续任务单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderscheduleGoon1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderschedule.goon");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机端查看货源运单情况1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderstockstateQuery1(String stockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderstockstate.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 支付失败列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderPayFailedOrderListQueryApp1(String beginDate, String endDate, String start, String limit, String checkState, String signPeopleMobile, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("beginDate", beginDate);//
        map.put("endDate", endDate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("checkState", checkState);//0 所有 2待复核 3拒绝付款 4复核通过
        map.put("signPeopleMobile", signPeopleMobile);//收单员电话
        map.put("keyword", keyword);//关键字 手机号码 车牌号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.pay.failed.order.list.query.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 预抢单接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderPreCreate1(String stockCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.pre.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单凭证查询1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderProofQuery1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.proof.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询货源剩余审批数量1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryApproveCount1(String stockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.approve.count");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询所有自己已提交的运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryApproveList1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.approve.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询已经审批的运单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryApproved1(String holderCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("holderCode", holderCode);//订单所属成员的code
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.approved");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询待处理的审批运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryApproving1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.approving");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过任务单号查询运单2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryByOrderschedule2(String somethingcode, String begindate, String enddate, String month, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//任务单号
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("month", month);//月份信息
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.by.orderschedule");//接口路径
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
     * 通过任务单号查询运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryByOrderschedule1(String somethingcode, String begindate, String enddate, String month, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//任务单号
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("month", month);//月份信息
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.by.orderschedule");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单总数2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryCount2(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.count");//接口路径
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
     * 查询运单总数1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryCount1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.count");//接口路径
        map.put("format", "json");//数据交互格式
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
    public JSONObject assureorderQueryDetail1(String orderNumber, String session) {
        BaseCall call = new BaseCall(url, "POST");
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单详情2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryDetail2(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.detail");//接口路径
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
     * 查询运单列表3.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryList3(String type, String holderCode, String beginDate, String endDate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//状态
        map.put("holderCode", holderCode);//订单所属成员编码
        map.put("beginDate", beginDate);//开始日期
        map.put("endDate", endDate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list");//接口路径
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
     * 查询运单列表2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryList2(String type, String holderCode, String beginDate, String endDate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//状态
        map.put("holderCode", holderCode);//订单所属成员编码
        map.put("beginDate", beginDate);//开始日期
        map.put("endDate", endDate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list");//接口路径
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
     * 查询运单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryList1(String type, String holderCode, String beginDate, String endDate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//状态
        map.put("holderCode", holderCode);//订单所属成员编码
        map.put("beginDate", beginDate);//开始日期
        map.put("endDate", endDate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单列表4.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryList4(String type, String holderCode, String beginDate, String endDate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//状态
        map.put("holderCode", holderCode);//订单所属成员编码
        map.put("beginDate", beginDate);//开始日期
        map.put("endDate", endDate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "4.0");//接口版本
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
    public JSONObject assureorderQueryListBynumbers1(String orderNumbers, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//批量的运单号，逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list.bynumbers");//接口路径
        map.put("format", "json");//数据交互格式
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
    public JSONObject assureorderQueryListBysearch1(String keyword, String beginDate, String endDate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//货源编码
        map.put("beginDate", beginDate);//开始日期
        map.put("endDate", endDate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list.bysearch");//接口路径
        map.put("format", "json");//数据交互格式
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
    public JSONObject assureorderQueryListBystock1(String stockCode, String beginDate, String endDate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编码
        map.put("beginDate", beginDate);//开始日期
        map.put("endDate", endDate);//结束日期
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.list.bystock");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业或者子成员查询任务单2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleCompany2(String companyCode, String holderCode, String keyWord, String loadCode, String uploadCode, String orderScheduleState, String begindate, String enddate, String month, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//企业编码
        map.put("holderCode", holderCode);//子成员编码
        map.put("keyWord", keyWord);//关键词 web端使用
        map.put("loadCode", loadCode);//装货地编码 web端使用
        map.put("uploadCode", uploadCode);//卸货地编码 web端使用
        map.put("orderScheduleState", orderScheduleState);//任务单状态 web端使用
        map.put("begindate", begindate);//起始时间 web端使用
        map.put("enddate", enddate);//截止时间 web端使用
        map.put("month", month);//月份信息
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.company");//接口路径
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
     * 企业或者子成员查询任务单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleCompany1(String companyCode, String holderCode, String keyWord, String loadCode, String uploadCode, String orderScheduleState, String begindate, String enddate, String month, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//企业编码
        map.put("holderCode", holderCode);//子成员编码
        map.put("keyWord", keyWord);//关键词 web端使用
        map.put("loadCode", loadCode);//装货地编码 web端使用
        map.put("uploadCode", uploadCode);//卸货地编码 web端使用
        map.put("orderScheduleState", orderScheduleState);//任务单状态 web端使用
        map.put("begindate", begindate);//起始时间 web端使用
        map.put("enddate", enddate);//截止时间 web端使用
        map.put("month", month);//月份信息
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.company");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业或者子成员查询任务单,供web端查询1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleCompanyWeb1(String companyCode, String holderCode, String keyWord, String loadCode, String uploadCode, String orderScheduleState, String begindate, String enddate, String month, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//企业编码
        map.put("holderCode", holderCode);//子成员编码
        map.put("keyWord", keyWord);//关键词 web端使用
        map.put("loadCode", loadCode);//装货地编码 web端使用
        map.put("uploadCode", uploadCode);//卸货地编码 web端使用
        map.put("orderScheduleState", orderScheduleState);//任务单状态 web端使用
        map.put("begindate", begindate);//起始时间 web端使用
        map.put("enddate", enddate);//截止时间 web端使用
        map.put("month", month);//月份信息
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.company.web");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180427企业或者子成员查询任务单,供web端查询V2版本2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleCompanyWeb2(String begintime, String endtime, String sourcename, String targetname, String keyword, String start, String limit, String intermediary, String sourcecode, String targetcode, String filterstate, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始日期
        map.put("endtime", endtime);//截止日期
        map.put("sourcename", sourcename);//装货地地址名称
        map.put("targetname", targetname);//卸货地地址名称
        map.put("keyword", keyword);//关键字：订单号，接单人姓名，电话，车牌
        map.put("start", start);//分页起始数
        map.put("limit", limit);//数量
        map.put("intermediary", intermediary);//下单人code
        map.put("sourcecode", sourcecode);//装货地地址编码
        map.put("targetcode", targetcode);//卸货地地址编码
        map.put("filterstate", filterstate);//历史运单 筛选小状态 :1.待结算 2.进行中 3.已完成
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.company.web");//接口路径
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
     * 查询任务单详情1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleDetail1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询任务单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleDriver1(String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.driver");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过货源编码查询任务单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryOrderscheduleStockcode1(String shareQuery, String stockcode, String assureOrderNum, String stockagentcode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("shareQuery", shareQuery);//是否是分享货源查询，无需客户端传递此参数
        map.put("stockcode", stockcode);//货源编码
        map.put("assureOrderNum", assureOrderNum);//运单号
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.stockcode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单总数1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryRunningCount1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.running.count");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询简化运单详情1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQuerySimpledetail1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.simpledetail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单轨迹2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryTrack2(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.track");//接口路径
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
     * 查询运单轨迹1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderQueryTrack1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.track");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 短信提醒收货1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderRemindSmsReceive1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.remind.sms.receive");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 服务费调度费查询接口1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderServerschedulefeeQuery1(String ordernumber, String paymoney, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("paymoney", paymoney);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.serverschedulefee.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 收单凭证查询1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSignevindenceQuery1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signevindence.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 装货地签到补图片1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSigninAddimage1(String signinOrderCode, String imageUrl, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("signinOrderCode", signinOrderCode);//签到编码
        map.put("imageUrl", imageUrl);//签到图片地址
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signin.addimage");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 装货地签到1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSigninCreate1(String orderNumber, String imageUrl, String address, String addressCode, String signinKind, String longitude, String latitude, String geoType, String payPassword, String signWay, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("imageUrl", imageUrl);//签到图片地址
        map.put("address", address);//签到地址
        map.put("addressCode", addressCode);//发货员时候，装卸货地地址code
        map.put("signinKind", signinKind);//签到类型 装货地:1;卸货地:2
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("geoType", geoType);//地理类型
        map.put("payPassword", payPassword);//密码
        map.put("signWay", signWay);//签到方式 0 正常 1 异常
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signin.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 装货地签到1.0
     *
     * @return response
     * @
     */
    @Step("装货地签到1.0")
    public JSONObject assureorderSigninCreateLoading1(String orderNumber, String imageUrl, String address, String addressCode, String longitude, String latitude, String geoType, String payPassword, String agreeContract, String signWay, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("imageUrl", imageUrl);//签到图片地址
        map.put("address", address);//签到地址
        map.put("addressCode", addressCode);//发货员时候，装卸货地地址code
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("geoType", geoType);//地理类型
        map.put("payPassword", payPassword);//密码
        map.put("agreeContract", agreeContract);//是否同意签合同，同意签合同传1，默认不需要传
        map.put("signWay", signWay);//是否正常签到，非法签到1
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signin.create.loading");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();

    }

    /**
     * 卸货地签到1.0
     *
     * @return response
     * @
     */
    @Step("卸货地签到")
    public JSONObject assureorderSigninCreateUploading1(String orderNumber, String imageUrl, String address, String addressCode, String longitude, String latitude, String geoType, String agreeContract, String signWay, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("imageUrl", imageUrl);//签到图片地址
        map.put("address", address);//签到地址
        map.put("addressCode", addressCode);//发货员时候，装卸货地地址code
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("geoType", geoType);//地理类型
        map.put("agreeContract", agreeContract);//是否同意签合同，同意签合同传1，默认不需要传
        map.put("signWay", signWay);//是否正常签到，非法签到1
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signin.create.uploading");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询装货地签到1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSigninQuery1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signin.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 装卸货地补图1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSigninorderAddurl1(String ordernumber, String addresscode, String url, String originalunit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("addresscode", addresscode);//地址编码
        map.put("url", url);//图片地址
        map.put("originalunit", originalunit);//发货吨位
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signinorder.addurl");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 子帐号提交审批运单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSubmitApprove1(String orderNumbers, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//批量的运单号，逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.submit.approve");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度确认收到货物1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSubmitGoodsReceived1(String orderNumber, String payPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("payPassword", payPassword);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.submit.goods.received");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度确认装货完成_ETC3.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSubmitLoadingComplete3(String orderNumber, String payPassword, String token, String paytime, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("payPassword", payPassword);//密码
        map.put("token", token);//金融平台token
        map.put("paytime", paytime);//支付节点 1 装货 2 交货 3 尾款
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.submit.loading.complete");//接口路径
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
     * 调度确认装货完成1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSubmitLoadingComplete1(String orderNumber, String payPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("payPassword", payPassword);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.submit.loading.complete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度确认装货完成2.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSubmitLoadingComplete2(String orderNumber, String payPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("payPassword", payPassword);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.submit.loading.complete");//接口路径
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
     * 调度确认收到回单1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderSubmitReceiptReceived1(String orderNumber, String payPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("payPassword", payPassword);//密码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.submit.receipt.received");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 微信查询运单列表数量1.0
     *
     * @return response
     * @
     */
    public JSONObject assureorderWechatqueryCount1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.wechatquery.count");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查看运单详情1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewDetailForweb1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.detail.forweb");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 关键字搜索订单1.0
     *
     * @return response
     * @
     */
    public JSONObject orderviewSearchForweb1(String begintime, String endtime, String sourcename, String targetname, String keyword, String start, String limit, String kind, String intermediary, String sourcecode, String targetcode, String filterstate, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begintime", begintime);//起始日期
        map.put("endtime", endtime);//截止日期
        map.put("sourcename", sourcename);//装货地地址名称
        map.put("targetname", targetname);//卸货地地址名称
        map.put("keyword", keyword);//关键字：订单号，接单人姓名，电话，车牌
        map.put("start", start);//分页起始数
        map.put("limit", limit);//数量
        map.put("kind", kind);//类型:1.待装货 ,2.配送中,3.协商中,4.历史,5.待审批 6.历史运单支付时间查询
        map.put("intermediary", intermediary);//下单人code
        map.put("sourcecode", sourcecode);//装货地地址编码
        map.put("targetcode", targetcode);//卸货地地址编码
        map.put("filterstate", filterstate);//历史运单 筛选小状态 :1.已完成 2.已取消 3.已失效
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.search.forweb");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 签收订单后详情查询1.0
     *
     * @return response
     * @
     */
    public JSONObject receivedOrderDetailQuery1(String ordernumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "received.order.detail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业绑定经纪人查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAgentQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.agent.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询经纪人分享货源列表1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAgentShareListQuery1(String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.agent.share.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 经纪人预约货源创建1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAgentorderPreCreate1(String stockagentcode, String paytype, String cliettype, String openid, String paytoken, String paltenumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("paytype", paytype);//支付类型 1余额 2微信 3线下当面支付
        map.put("cliettype", cliettype);//客户端类型 1微信 2app端
        map.put("openid", openid);//微信端使用openid
        map.put("paytoken", paytoken);//支付密码
        map.put("paltenumber", paltenumber);//车牌号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.agentorder.pre.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 经纪人预约支付通知1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAgentorderPrePaynotice1(String ret, String ordernumber, String transtype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ret", ret);//支付状态 0成功 1失败
        map.put("ordernumber", ordernumber);//物流订单
        map.put("transtype", transtype);//支付类型 1冻结 2支付 3退款
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.agentorder.pre.paynotice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 预约司机列表查询2.0
     *
     * @return response
     * @
     */
    public JSONObject stockAppointdriverQuery2(String shareQuery, String stockcode, String assureOrderNum, String stockagentcode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("shareQuery", shareQuery);//是否是分享货源查询，无需客户端传递此参数
        map.put("stockcode", stockcode);//货源编码
        map.put("assureOrderNum", assureOrderNum);//运单号
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.appointdriver.query");//接口路径
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
     * 司机预约操作1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAppointedDriverDeal1(String dealtype, String reservationcode, String reservationdriverid, String reamrks, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dealtype", dealtype);//预约类型 1取消预约 2预约
        map.put("reservationcode", reservationcode);//预约编码 预约用
        map.put("reservationdriverid", reservationdriverid);//取消预约用 预约编码关系id
        map.put("reamrks", reamrks);//取消预约备注描述
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.appointed.driver.deal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机预约信息费经纪人货源支付判断1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAppointedDriverValidate1(String stockcode, String lan, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("lon", "114.429231");//经度
        map.put("lan", lan);//维度
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.appointed.driver.validate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询本人预约货源列表1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAppointedListQuery1(String appointstockstate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appointstockstate", appointstockstate);//预约货源状态 0全部 1预约中 2预约已取消 3预约已生效 4预约已失效 5预约待编辑
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.appointed.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 判断司机是否已经预约过该预约货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockAppointedValidateQuery1(String reservationcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("reservationcode", reservationcode);//预约货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.appointed.validate.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 收单规则查询1.0
     *
     * @return response
     * @
     */
    @Step("查询收单规则")
    public JSONObject stockCoalruleQuery1(String mobile, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//卸货地签收人电话
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.coalrule.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业收货货物单价查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockCompanycoalQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.companycoal.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询派车单发布货源的派车单详情1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDistributeQueryDetail1(String orderCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderCode", orderCode);//派车单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.distribute.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询企业派发给我的货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDistributeQueryList1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.distribute.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除派车单1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDistributeRemove1(String truckingCodes, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("truckingCodes", truckingCodes);//派车单code：多个之间用英文逗号隔开，注意是传String类型
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.distribute.remove");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 单个车队长抢单货源取消1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDriverCancel1(String driverstockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("driverstockcode", driverstockcode);//车队长抢单货源主键
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.driver.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长抢单货源创建1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDriverCreate1(String driver, String stockcode, String contractno, String stockchannelcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//抢单司机车队长编码
        map.put("stockcode", stockcode);//货源编码
        map.put("contractno", contractno);//合同号
        map.put("stockchannelcode", stockchannelcode);//渠道货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.driver.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长抢单货源查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDriverQuery1(String driver, String driverstockstate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//用户编码
        map.put("driverstockstate", driverstockstate);//列表状态 1 发布中 2 关闭
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.driver.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 单个车队长抢单货源查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockDriverQueryone1(String driver, String stockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//抢单司机车队长编码
        map.put("stockcode", stockcode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.driver.queryone");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改货源地址1.0
     *
     * @return response
     * @
     */
    public JSONObject stockModifyAddress1(String stockCode, String addressCode, String linkerName, String linkerTel, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编码
        map.put("addressCode", addressCode);//货源地址编码
        map.put("linkerName", linkerName);//联系人姓名
        map.put("linkerTel", linkerTel);//联系人电话
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.modify.address");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业查看运费详情1.0
     *
     * @return response
     * @
     */
    public JSONObject stockOrderFeeQuery1(String orderNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumber", orderNumber);//订单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.order.fee.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 货运发布1.0
     *
     * @return response
     * @
     */
    @Step("货运发布1.0")
    public JSONObject stockPublish1(String userissb, String isToAllUser, String userCodes, String groupRosters, String isToAllGroup, String groupHolderCodes, String group2GroupRosters, String stockname, String stockdesc, String stocktype, String stockkind, String sourcecode, String sourcename, String targetcode, String targetname, String construct, String platecolor, String brandname, String length, String special, String openable, String stockheft, String dispatchdate, String stockcost, String sourcelon, String sourcelat, String sourcememo, String targetlon, String targetlat, String targetmemo, String price, String unitprice, String unit, String parentStockCode, String holderName, String holderPhone, String companyLinkerCode, String needReturn, String openFees, String openEmpty, String openFreight, String activeTime, String emptyMargin, String informationFees, String sourceAddressCodes, String targetAddressCodes, String stockorder, String tradeorder, String transitTime, String carNumber, String clearingCycle, String truckingOrderCode, String freightRates, String freightKind, String depositratio, String depositfee, String loadpayratio, String loadpayfee, String loadpayMonyeRatio, String loadpayMoneyFee, String loadpayEtcRatio, String loadpayEtcFee, String deliveryratio, String deliveryfee, String uploadpayratio, String uploadpayfee, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String laterpaystate, String channelCodes, String agentCodes, String autoUpdate, String autoCheck, String workStock, String stockKindName, String fatherStockCode, String needLater, String laterTime, String rulecode, String freightname, String freightprice, String appointmenttime, String appointmented, String offlinepay, String stockqrcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userissb", userissb);//检测用户是否强行关闭承运开关，强行关闭了就传非零
        map.put("isToAllUser", isToAllUser);//是否向物流圈中所有司机发送
        map.put("userCodes", userCodes);//定向发送的用户集合
        map.put("groupRosters", groupRosters);//指定的司机分组
        map.put("isToAllGroup", isToAllGroup);//是否向物流圈中所有调度发送
        map.put("groupHolderCodes", groupHolderCodes);//定向发送的调度集合
        map.put("group2GroupRosters", group2GroupRosters);//指定的调度分组
        map.put("stockname", stockname);//货源标题
        map.put("stockdesc", stockdesc);//货源描述
        map.put("stocktype", stocktype);//货源类型，默认为2干线物流
        map.put("stockkind", stockkind);//货物类型
        map.put("sourcecode", sourcecode);//起始地区划编码
        map.put("sourcename", sourcename);//起始地区划名称
        map.put("targetcode", targetcode);//目的地区划编码
        map.put("targetname", targetname);//目的地区划名称
        map.put("construct", construct);//货箱结构
        map.put("platecolor", platecolor);//号牌颜色
        map.put("brandname", brandname);//品牌
        map.put("length", length);//需求车长
        map.put("special", special);//特殊功能
        map.put("openable", openable);//是否公开
        map.put("stockheft", stockheft);//
        map.put("dispatchdate", dispatchdate);//配送时间 传4689417599999视为不限
        map.put("stockcost", stockcost);//
        map.put("sourcelon", sourcelon);//出发地经度
        map.put("sourcelat", sourcelat);//出发地纬度
        map.put("sourcememo", sourcememo);//出发地备注
        map.put("targetlon", targetlon);//目的地经度
        map.put("targetlat", targetlat);//目的地纬度
        map.put("targetmemo", targetmemo);//目的地备注
        map.put("price", price);//价钱，可以是总价（99元），可以是单价（100元/吨）
        map.put("unitprice", unitprice);//单价
        map.put("unit", unit);//重量
        map.put("parentStockCode", parentStockCode);//上级货源编号
        map.put("holderName", holderName);//业务员姓名
        map.put("holderPhone", holderPhone);//业务员联系电话
        map.put("companyLinkerCode", companyLinkerCode);//业务员编号
        map.put("needReturn", needReturn);//是否需要返回，在会话消息界面，需要返回
        map.put("openFees", openFees);//开启收取信息费
        map.put("openEmpty", openEmpty);//开启放空保证金
        map.put("openFreight", openFreight);//开启运费支付
        map.put("activeTime", activeTime);//
        map.put("emptyMargin", emptyMargin);//放空保证金
        map.put("informationFees", informationFees);//信息费
        map.put("sourceAddressCodes", sourceAddressCodes);//始发地
        map.put("targetAddressCodes", targetAddressCodes);//目的地
        map.put("stockorder", stockorder);//合同号
        map.put("tradeorder", tradeorder);//贸易单号
        map.put("transitTime", transitTime);//运输时限
        map.put("carNumber", carNumber);//需要车数量
        map.put("clearingCycle", clearingCycle);//结算周期
        map.put("truckingOrderCode", truckingOrderCode);//派车单单号
        map.put("freightRates", freightRates);//运价，真正需要支付的运费
        map.put("freightKind", freightKind);//运费构成类型，2表示金额，1表示百分比
        map.put("depositratio", depositratio);//押金:比例
        map.put("depositfee", depositfee);//押金:金额
        map.put("loadpayratio", loadpayratio);//装货支付比例_油卡
        map.put("loadpayfee", loadpayfee);//装货支付金额_油卡
        map.put("loadpayMonyeRatio", loadpayMonyeRatio);//装货支付比例_现金
        map.put("loadpayMoneyFee", loadpayMoneyFee);//装货支付金额_现金
        map.put("loadpayEtcRatio", loadpayEtcRatio);//装货支付比例_etc
        map.put("loadpayEtcFee", loadpayEtcFee);//装货支付金额_etc
        map.put("deliveryratio", deliveryratio);//卸货支付比例
        map.put("deliveryfee", deliveryfee);//卸货支付金额
        map.put("uploadpayratio", uploadpayratio);//卸货支付比例_油卡
        map.put("uploadpayfee", uploadpayfee);//卸货支付金额_油卡
        map.put("haulageoperatorstate", haulageoperatorstate);//承运公司开关 0 关闭 1 打开
        map.put("haulageoperatorname", haulageoperatorname);//承运公司名称
        map.put("haulageoperatorcode", haulageoperatorcode);//承运公司编码
        map.put("haulageoperatormoney", haulageoperatormoney);//费用
        map.put("laterpaystate", laterpaystate);//账期支付开关，2表示开启，0表示关闭
        map.put("channelCodes", channelCodes);//信息部列表
        map.put("agentCodes", agentCodes);//经纪人列表
        map.put("autoUpdate", autoUpdate);//自动更新
        map.put("autoCheck", autoCheck);//自动确认
        map.put("workStock", workStock);//任务货源
        map.put("stockKindName", stockKindName);//货物种类名称
        map.put("fatherStockCode", fatherStockCode);//编辑原始货源编码
        map.put("needLater", needLater);//延后预约
        map.put("laterTime", laterTime);//预约时间
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("appointmenttime", appointmenttime);//预约生效时间
        map.put("appointmented", appointmented);//预约中
        map.put("offlinepay", offlinepay);//是否线下支付
        map.put("stockqrcode", stockqrcode);//指定货源码货源
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.publish");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 货运发布2.0
     *
     * @return response
     * @
     */
    @Step("货运发布2.0")
    public JSONObject stockPublish2(String userissb, String isToAllUser, String userCodes, String groupRosters, String isToAllGroup, String groupHolderCodes, String group2GroupRosters, String stockname, String stockdesc, String stocktype, String stockkind, String sourcecode, String sourcename, String targetcode, String targetname, String construct, String platecolor, String brandname, String length, String special, String openable, String stockheft, String dispatchdate, String stockcost, String sourcelon, String sourcelat, String sourcememo, String targetlon, String targetlat, String targetmemo, String price, String unitprice, String unit, String parentStockCode, String holderName, String holderPhone, String companyLinkerCode, String needReturn, String openFees, String openEmpty, String openFreight, String activeTime, String emptyMargin, String informationFees, String sourceAddressCodes, String targetAddressCodes, String stockorder, String tradeorder, String transitTime, String carNumber, String clearingCycle, String truckingOrderCode, String freightRates, String freightKind, String depositratio, String depositfee, String loadpayratio, String loadpayfee, String loadpayMonyeRatio, String loadpayMoneyFee, String loadpayEtcRatio, String loadpayEtcFee, String deliveryratio, String deliveryfee, String uploadpayratio, String uploadpayfee, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String laterpaystate, String channelCodes, String agentCodes, String autoUpdate, String autoCheck, String workStock, String stockKindName, String fatherStockCode, String needLater, String laterTime, String rulecode, String freightname, String freightprice, String appointmenttime, String appointmented, String offlinepay, String stockqrcode, String dailyAutoEndTime, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userissb", userissb);//检测用户是否强行关闭承运开关，强行关闭了就传非零
        map.put("isToAllUser", isToAllUser);//是否向物流圈中所有司机发送
        map.put("userCodes", userCodes);//定向发送的用户集合
        map.put("groupRosters", groupRosters);//指定的司机分组
        map.put("isToAllGroup", isToAllGroup);//是否向物流圈中所有调度发送
        map.put("groupHolderCodes", groupHolderCodes);//定向发送的调度集合
        map.put("group2GroupRosters", group2GroupRosters);//指定的调度分组
        map.put("stockname", stockname);//货源标题
        map.put("stockdesc", stockdesc);//货源描述
        map.put("stocktype", stocktype);//货源类型，默认为2干线物流
        map.put("stockkind", stockkind);//货物类型
        map.put("sourcecode", sourcecode);//起始地区划编码
        map.put("sourcename", sourcename);//起始地区划名称
        map.put("targetcode", targetcode);//目的地区划编码
        map.put("targetname", targetname);//目的地区划名称
        map.put("construct", construct);//货箱结构
        map.put("platecolor", platecolor);//号牌颜色
        map.put("brandname", brandname);//品牌
        map.put("length", length);//需求车长
        map.put("special", special);//特殊功能
        map.put("openable", openable);//是否公开
        map.put("stockheft", stockheft);//
        map.put("dispatchdate", dispatchdate);//配送时间 传4689417599999视为不限
        map.put("stockcost", stockcost);//
        map.put("sourcelon", sourcelon);//出发地经度
        map.put("sourcelat", sourcelat);//出发地纬度
        map.put("sourcememo", sourcememo);//出发地备注
        map.put("targetlon", targetlon);//目的地经度
        map.put("targetlat", targetlat);//目的地纬度
        map.put("targetmemo", targetmemo);//目的地备注
        map.put("price", price);//价钱，可以是总价（99元），可以是单价（100元/吨）
        map.put("unitprice", unitprice);//单价
        map.put("unit", unit);//重量
        map.put("parentStockCode", parentStockCode);//上级货源编号
        map.put("holderName", holderName);//业务员姓名
        map.put("holderPhone", holderPhone);//业务员联系电话
        map.put("companyLinkerCode", companyLinkerCode);//业务员编号
        map.put("needReturn", needReturn);//是否需要返回，在会话消息界面，需要返回
        map.put("openFees", openFees);//开启收取信息费
        map.put("openEmpty", openEmpty);//开启放空保证金
        map.put("openFreight", openFreight);//开启运费支付
        map.put("activeTime", activeTime);//
        map.put("emptyMargin", emptyMargin);//放空保证金
        map.put("informationFees", informationFees);//信息费
        map.put("sourceAddressCodes", sourceAddressCodes);//始发地
        map.put("targetAddressCodes", targetAddressCodes);//目的地
        map.put("stockorder", stockorder);//合同号
        map.put("tradeorder", tradeorder);//贸易单号
        map.put("transitTime", transitTime);//运输时限
        map.put("carNumber", carNumber);//需要车数量
        map.put("clearingCycle", clearingCycle);//结算周期
        map.put("truckingOrderCode", truckingOrderCode);//派车单单号
        map.put("freightRates", freightRates);//运价，真正需要支付的运费
        map.put("freightKind", freightKind);//运费构成类型，2表示金额，1表示百分比
        map.put("depositratio", depositratio);//押金:比例
        map.put("depositfee", depositfee);//押金:金额
        map.put("loadpayratio", loadpayratio);//装货支付比例_油卡
        map.put("loadpayfee", loadpayfee);//装货支付金额_油卡
        map.put("loadpayMonyeRatio", loadpayMonyeRatio);//装货支付比例_现金
        map.put("loadpayMoneyFee", loadpayMoneyFee);//装货支付金额_现金
        map.put("loadpayEtcRatio", loadpayEtcRatio);//装货支付比例_etc
        map.put("loadpayEtcFee", loadpayEtcFee);//装货支付金额_etc
        map.put("deliveryratio", deliveryratio);//卸货支付比例
        map.put("deliveryfee", deliveryfee);//卸货支付金额
        map.put("uploadpayratio", uploadpayratio);//卸货支付比例_油卡
        map.put("uploadpayfee", uploadpayfee);//卸货支付金额_油卡
        map.put("haulageoperatorstate", haulageoperatorstate);//承运公司开关 0 关闭 1 打开
        map.put("haulageoperatorname", haulageoperatorname);//承运公司名称
        map.put("haulageoperatorcode", haulageoperatorcode);//承运公司编码
        map.put("haulageoperatormoney", haulageoperatormoney);//费用
        map.put("laterpaystate", laterpaystate);//账期支付开关，2表示开启，0表示关闭
        map.put("channelCodes", channelCodes);//信息部列表
        map.put("agentCodes", agentCodes);//经纪人列表
        map.put("autoUpdate", autoUpdate);//自动更新
        map.put("autoCheck", autoCheck);//自动确认
        map.put("workStock", workStock);//任务货源
        map.put("stockKindName", stockKindName);//货物种类名称
        map.put("fatherStockCode", fatherStockCode);//编辑原始货源编码
        map.put("needLater", needLater);//延后预约
        map.put("laterTime", laterTime);//预约时间
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("appointmenttime", appointmenttime);//预约生效时间
        map.put("appointmented", appointmented);//预约中
        map.put("offlinepay", offlinepay);//是否线下支付
        map.put("stockqrcode", stockqrcode);//指定货源码货源
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.publish");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        map.put("dailyAutoEndTime", dailyAutoEndTime);//每日运单自动结束时间
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 置顶货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockPublishTop1(String stockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.publish.top");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 私有货源发布对象详情查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockPublishobjectDetail1(String shareQuery, String stockcode, String assureOrderNum, String stockagentcode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("shareQuery", shareQuery);//是否是分享货源查询，无需客户端传递此参数
        map.put("stockcode", stockcode);//货源编码
        map.put("assureOrderNum", assureOrderNum);//运单号
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.publishobject.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询好友发送给我的货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockQueryBymember1(String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.bymember");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查看货源详情1.0
     *
     * @return response
     * @
     */
    @Step("查看货源详情")
    public JSONObject stockQueryDetail1(String shareQuery, String stockcode, String assureOrderNum, String stockagentcode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("shareQuery", shareQuery);//是否是分享货源查询，无需客户端传递此参数
        map.put("stockcode", stockcode);//货源编码
        map.put("assureOrderNum", assureOrderNum);//运单号
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查看货源详情2.0
     *
     * @return response
     * @
     */
    public JSONObject stockQueryDetail2(String shareQuery, String stockcode, String assureOrderNum, String stockagentcode, String start, String limit, String session) {
        BaseCall call = new BaseCall(url, "POST");
        HashMap<String, String> map = new HashMap<>();
        map.put("shareQuery", shareQuery);//是否是分享货源查询，无需客户端传递此参数
        map.put("stockcode", stockcode);//货源编码
        map.put("assureOrderNum", assureOrderNum);//运单号
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        map.put("hiddenInfo", "false");//是否隐藏装货卸货手机号
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询配货圈发布的货源1.0
     *
     * @return response
     * @
     */
    @Step("查询配货圈发布的货源1.0")
    public JSONObject stockQueryGroupPublish1(String closed, String running, String keyword, String holderCode, String start, String limit, String session) {
        BaseCall call = new BaseCall(url, "POST");
        HashMap<String, String> map = new HashMap<>();
        map.put("closed", closed);//是否查询已关闭的货源列表
        map.put("running", running);//是否查询正在运行的货源列表
        map.put("keyword", keyword);//查询搜索关键字
        map.put("holderCode", holderCode);//货源所属用户编码
        map.put("start", start);//分页从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.group.publish");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        /*Map<String, Object> header = new HashMap<>();
        header.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 5.0.2; Redmi Note 2 MIUI/7.9.21)");
        header.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");*/
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询分享的货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockQueryShare1(String stockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.share");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询货源天气1.0
     *
     * @return response
     * @
     */
    public JSONObject stockQueryWeather1(String stockWeatherCodes, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockWeatherCodes", stockWeatherCodes);//城市编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.weather");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除好友发送给我的货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockRemoveBymember1(String stockCodes, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCodes", stockCodes);//货源code：多个之间用英文逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.remove.bymember");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 搜索货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockSearchList1(String srcLocalCode, String destLocalCode, String stocktype, String goodsType, String vehicleConstruct, String vehicleLength, String stockHeft, String vehiclePlateColor, String vehicleBrandName, String vehicleSpecial, String isAssureEmpty, String isFreight, String isCertified, String start, String limit, String session) {
        BaseCall call = new BaseCall(url, "POST");
        HashMap<String, String> map = new HashMap<>();
        map.put("srcLocalCode", srcLocalCode);//出发地
        map.put("destLocalCode", destLocalCode);//目的地
        map.put("stocktype", stocktype);//货源类型
        map.put("goodsType", goodsType);//货物类型
        map.put("vehicleConstruct", vehicleConstruct);//货箱结构
        map.put("vehicleLength", vehicleLength);//货箱车长
        map.put("stockHeft", stockHeft);//货物重量
        map.put("vehiclePlateColor", vehiclePlateColor);//车牌颜色
        map.put("vehicleBrandName", vehicleBrandName);//车辆商标
        map.put("vehicleSpecial", vehicleSpecial);//车辆特殊功能
        map.put("isAssureEmpty", isAssureEmpty);//是否放空担保
        map.put("isFreight", isFreight);//是否运费担保
        map.put("isCertified", isCertified);//是否认证企业
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.search.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 货源经济费查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockStockagentQuery1(String stockcode, String agentcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("agentcode", agentcode);//经纪人编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockagent.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建或者修改货源模版1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTemplateCreateorupdate1(String stocktemplatecode, String stocktemplatename, String stocktemplatememo, String stockname, String stockdesc, String stocktype, String stockkind, String stockkindValue, String sourcecode, String sourcename, String targetcode, String targetname, String construct, String constructValue, String platecolor, String brandname, String length, String lengthValue, String special, String openable, String dispatchdate, String sourcelon, String sourcelat, String sourcememo, String targetlon, String targetlat, String targetmemo, String price, String unit, String holderName, String holderPhone, String openFees, String openEmpty, String openFreight, String emptyMargin, String informationFees, String sourceAddressCodes, String targetAddressCodes, String sourceAddresses, String targetAddresses, String stockorder, String transitTime, String carNumber, String clearingCycle, String freightRates, String freightKind, String depositratio, String depositfee, String loadpayratio, String loadpayfee, String loadpayMonyeRatio, String loadpayMoneyFee, String loadpayEtcRatio, String loadpayEtcFee, String deliveryratio, String deliveryfee, String uploadpayratio, String uploadpayfee, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String laterpaystate, String channelCodes, String autoUpdate, String autoCheck, String workStock, String stockKindName, String rulecode, String freightname, String freightprice, String rulename, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stocktemplatecode", stocktemplatecode);//模版code
        map.put("stocktemplatename", stocktemplatename);//模版名称
        map.put("stocktemplatememo", stocktemplatememo);//模版备注
        map.put("stockname", stockname);//货源标题
        map.put("stockdesc", stockdesc);//货源描述
        map.put("stocktype", stocktype);//货源类型，默认为2干线物流
        map.put("stockkind", stockkind);//货物类型
        map.put("stockkindValue", stockkindValue);//货物类型描述
        map.put("sourcecode", sourcecode);//起始地区划编码
        map.put("sourcename", sourcename);//起始地区划名称
        map.put("targetcode", targetcode);//目的地区划编码
        map.put("targetname", targetname);//目的地区划名称
        map.put("construct", construct);//货箱结构
        map.put("constructValue", constructValue);//货箱结构描述
        map.put("platecolor", platecolor);//号牌颜色
        map.put("brandname", brandname);//品牌
        map.put("length", length);//需求车长
        map.put("lengthValue", lengthValue);//车长描述
        map.put("special", special);//特殊功能
        map.put("openable", openable);//是否公开
        map.put("dispatchdate", dispatchdate);//配送时间
        map.put("sourcelon", sourcelon);//出发地经度
        map.put("sourcelat", sourcelat);//出发地纬度
        map.put("sourcememo", sourcememo);//出发地备注
        map.put("targetlon", targetlon);//目的地经度
        map.put("targetlat", targetlat);//目的地纬度
        map.put("targetmemo", targetmemo);//目的地备注
        map.put("price", price);//价钱
        map.put("unit", unit);//重量
        map.put("holderName", holderName);//业务员姓名
        map.put("holderPhone", holderPhone);//业务员联系电话
        map.put("openFees", openFees);//开启收取信息费
        map.put("openEmpty", openEmpty);//开启放空保证金
        map.put("openFreight", openFreight);//开启运费支付
        map.put("emptyMargin", emptyMargin);//放空保证金
        map.put("informationFees", informationFees);//信息费
        map.put("sourceAddressCodes", sourceAddressCodes);//始发地
        map.put("targetAddressCodes", targetAddressCodes);//目的地
        map.put("sourceAddresses", sourceAddresses);//来源地地址信息
        map.put("targetAddresses", targetAddresses);//目的地地址信息
        map.put("stockorder", stockorder);//合同号
        map.put("transitTime", transitTime);//运输时限
        map.put("carNumber", carNumber);//需要车数量
        map.put("clearingCycle", clearingCycle);//结算周期
        map.put("freightRates", freightRates);//运价，真正需要支付的运费
        map.put("freightKind", freightKind);//运费构成类型，1表示金额，2表示百分比
        map.put("depositratio", depositratio);//押金:比例
        map.put("depositfee", depositfee);//押金:金额
        map.put("loadpayratio", loadpayratio);//装货支付比例_油卡
        map.put("loadpayfee", loadpayfee);//装货支付金额_油卡
        map.put("loadpayMonyeRatio", loadpayMonyeRatio);//装货支付比例_现金
        map.put("loadpayMoneyFee", loadpayMoneyFee);//装货支付金额_现金
        map.put("loadpayEtcRatio", loadpayEtcRatio);//装货支付比例_ETC
        map.put("loadpayEtcFee", loadpayEtcFee);//装货支付金额_ETC
        map.put("deliveryratio", deliveryratio);//交货支付比例
        map.put("deliveryfee", deliveryfee);//交货支付金额
        map.put("uploadpayratio", uploadpayratio);//卸货支付比例_油卡
        map.put("uploadpayfee", uploadpayfee);//卸货支付金额_油卡
        map.put("haulageoperatorstate", haulageoperatorstate);//承运公司开关 0 关闭 1 打开
        map.put("haulageoperatorname", haulageoperatorname);//承运公司名称
        map.put("haulageoperatorcode", haulageoperatorcode);//承运公司编码
        map.put("haulageoperatormoney", haulageoperatormoney);//费用
        map.put("laterpaystate", laterpaystate);//账期支付标识，2表示账期支付
        map.put("channelCodes", channelCodes);//信息部列表
        map.put("autoUpdate", autoUpdate);//自动更新
        map.put("autoCheck", autoCheck);//自动确认
        map.put("workStock", workStock);//是否任务单
        map.put("stockKindName", stockKindName);//货源名称
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("rulename", rulename);//规则名称
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.template.createorupdate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除货源模版1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTemplateDelete1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.template.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询货源模版列表1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTemplateQueryList1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.template.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 是否含有贸易运单1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTradeContain1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.trade.contain");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 贸易单合同查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTradeContractQuery1(String tradeId, String orderDemandId, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("tradeId", tradeId);//贸易订单主键
        map.put("orderDemandId", orderDemandId);//贸易需求单主键
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.trade.contract.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 贸易单签署合同1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTradeContractSign1(String tradeId, String tradeVersion, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("tradeId", tradeId);//贸易订单主键
        map.put("tradeVersion", tradeVersion);//合同版本号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.trade.contract.sign");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 贸易单列表查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockTradeQuery1(String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.trade.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 货运发布，新版编辑货源1.0
     *
     * @return response
     * @
     */
    public JSONObject stockUpdate1(String userissb, String isToAllUser, String userCodes, String groupRosters, String isToAllGroup, String groupHolderCodes, String group2GroupRosters, String stockname, String stockdesc, String stocktype, String stockkind, String sourcecode, String sourcename, String targetcode, String targetname, String construct, String platecolor, String brandname, String length, String special, String openable, String stockheft, String dispatchdate, String stockcost, String sourcelon, String sourcelat, String sourcememo, String targetlon, String targetlat, String targetmemo, String price, String unitprice, String unit, String parentStockCode, String holderName, String holderPhone, String companyLinkerCode, String needReturn, String openFees, String openEmpty, String openFreight, String activeTime, String emptyMargin, String informationFees, String sourceAddressCodes, String targetAddressCodes, String stockorder, String tradeorder, String transitTime, String carNumber, String clearingCycle, String truckingOrderCode, String freightRates, String freightKind, String depositratio, String depositfee, String loadpayratio, String loadpayfee, String loadpayMonyeRatio, String loadpayMoneyFee, String loadpayEtcRatio, String loadpayEtcFee, String deliveryratio, String deliveryfee, String uploadpayratio, String uploadpayfee, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String laterpaystate, String channelCodes, String agentCodes, String autoUpdate, String autoCheck, String workStock, String stockKindName, String fatherStockCode, String needLater, String laterTime, String rulecode, String freightname, String freightprice, String appointmenttime, String appointmented, String offlinepay, String stockqrcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userissb", userissb);//检测用户是否强行关闭承运开关，强行关闭了就传非零
        map.put("isToAllUser", isToAllUser);//是否向物流圈中所有司机发送
        map.put("userCodes", userCodes);//定向发送的用户集合
        map.put("groupRosters", groupRosters);//指定的司机分组
        map.put("isToAllGroup", isToAllGroup);//是否向物流圈中所有调度发送
        map.put("groupHolderCodes", groupHolderCodes);//定向发送的调度集合
        map.put("group2GroupRosters", group2GroupRosters);//指定的调度分组
        map.put("stockname", stockname);//货源标题
        map.put("stockdesc", stockdesc);//货源描述
        map.put("stocktype", stocktype);//货源类型，默认为2干线物流
        map.put("stockkind", stockkind);//货物类型
        map.put("sourcecode", sourcecode);//起始地区划编码
        map.put("sourcename", sourcename);//起始地区划名称
        map.put("targetcode", targetcode);//目的地区划编码
        map.put("targetname", targetname);//目的地区划名称
        map.put("construct", construct);//货箱结构
        map.put("platecolor", platecolor);//号牌颜色
        map.put("brandname", brandname);//品牌
        map.put("length", length);//需求车长
        map.put("special", special);//特殊功能
        map.put("openable", openable);//是否公开
        map.put("stockheft", stockheft);//
        map.put("dispatchdate", dispatchdate);//配送时间 传4689417599999视为不限
        map.put("stockcost", stockcost);//
        map.put("sourcelon", sourcelon);//出发地经度
        map.put("sourcelat", sourcelat);//出发地纬度
        map.put("sourcememo", sourcememo);//出发地备注
        map.put("targetlon", targetlon);//目的地经度
        map.put("targetlat", targetlat);//目的地纬度
        map.put("targetmemo", targetmemo);//目的地备注
        map.put("price", price);//价钱，可以是总价（99元），可以是单价（100元/吨）
        map.put("unitprice", unitprice);//单价
        map.put("unit", unit);//重量
        map.put("parentStockCode", parentStockCode);//上级货源编号
        map.put("holderName", holderName);//业务员姓名
        map.put("holderPhone", holderPhone);//业务员联系电话
        map.put("companyLinkerCode", companyLinkerCode);//业务员编号
        map.put("needReturn", needReturn);//是否需要返回，在会话消息界面，需要返回
        map.put("openFees", openFees);//开启收取信息费
        map.put("openEmpty", openEmpty);//开启放空保证金
        map.put("openFreight", openFreight);//开启运费支付
        map.put("activeTime", activeTime);//
        map.put("emptyMargin", emptyMargin);//放空保证金
        map.put("informationFees", informationFees);//信息费
        map.put("sourceAddressCodes", sourceAddressCodes);//始发地
        map.put("targetAddressCodes", targetAddressCodes);//目的地
        map.put("stockorder", stockorder);//合同号
        map.put("tradeorder", tradeorder);//贸易单号
        map.put("transitTime", transitTime);//运输时限
        map.put("carNumber", carNumber);//需要车数量
        map.put("clearingCycle", clearingCycle);//结算周期
        map.put("truckingOrderCode", truckingOrderCode);//派车单单号
        map.put("freightRates", freightRates);//运价，真正需要支付的运费
        map.put("freightKind", freightKind);//运费构成类型，2表示金额，1表示百分比
        map.put("depositratio", depositratio);//押金:比例
        map.put("depositfee", depositfee);//押金:金额
        map.put("loadpayratio", loadpayratio);//装货支付比例_油卡
        map.put("loadpayfee", loadpayfee);//装货支付金额_油卡
        map.put("loadpayMonyeRatio", loadpayMonyeRatio);//装货支付比例_现金
        map.put("loadpayMoneyFee", loadpayMoneyFee);//装货支付金额_现金
        map.put("loadpayEtcRatio", loadpayEtcRatio);//装货支付比例_etc
        map.put("loadpayEtcFee", loadpayEtcFee);//装货支付金额_etc
        map.put("deliveryratio", deliveryratio);//交货支付比例
        map.put("deliveryfee", deliveryfee);//交货支付金额
        map.put("uploadpayratio", uploadpayratio);//卸货支付比例_油卡
        map.put("uploadpayfee", uploadpayfee);//卸货支付金额_油卡
        map.put("haulageoperatorstate", haulageoperatorstate);//承运公司开关 0 关闭 1 打开
        map.put("haulageoperatorname", haulageoperatorname);//承运公司名称
        map.put("haulageoperatorcode", haulageoperatorcode);//承运公司编码
        map.put("haulageoperatormoney", haulageoperatormoney);//费用
        map.put("laterpaystate", laterpaystate);//账期支付开关，2表示开启，0表示关闭
        map.put("channelCodes", channelCodes);//信息部列表
        map.put("agentCodes", agentCodes);//经纪人列表
        map.put("autoUpdate", autoUpdate);//自动更新
        map.put("autoCheck", autoCheck);//自动确认
        map.put("workStock", workStock);//任务货源
        map.put("stockKindName", stockKindName);//货物种类名称
        map.put("fatherStockCode", fatherStockCode);//编辑原始货源编码
        map.put("needLater", needLater);//延后预约
        map.put("laterTime", laterTime);//预约时间
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("appointmenttime", appointmenttime);//预约生效时间
        map.put("appointmented", appointmented);//预约中
        map.put("offlinepay", offlinepay);//是否线下支付
        map.put("stockqrcode", stockqrcode);//指定货源码货源
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 编辑延迟预约货源时间查询1.0
     *
     * @return response
     * @
     */
    public JSONObject stockUpdateQuery1(String shareQuery, String stockcode, String assureOrderNum, String stockagentcode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("shareQuery", shareQuery);//是否是分享货源查询，无需客户端传递此参数
        map.put("stockcode", stockcode);//货源编码
        map.put("assureOrderNum", assureOrderNum);//运单号
        map.put("stockagentcode", stockagentcode);//经纪人货源编码
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.update.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }


    /**
     * 发票收票地址修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("发票收票地址修改1.0")
    public JSONObject waybillInvoiceAddressUpdate1(String receivername, String receiverphone, String receiveremail, String addressprovincecode, String addresscitycode, String addresscountycode, String addressprovincename, String addresscityname, String addresscountyname, String addressdetail, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("receivername", receivername);//收票人姓名
        map.put("receiverphone", receiverphone);//收票人联系电话
        map.put("receiveremail", receiveremail);//收票人电子邮箱
        map.put("addressprovincecode", addressprovincecode);//收票地址省编码
        map.put("addresscitycode", addresscitycode);//收票地址市编码
        map.put("addresscountycode", addresscountycode);//收票地址区县编码
        map.put("addressprovincename", addressprovincename);//收票地址省名称
        map.put("addresscityname", addresscityname);//收票地址市名称
        map.put("addresscountyname", addresscountyname);//收票地址区县名称
        map.put("addressdetail", addressdetail);//详细地址
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.invoice.address.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票信息管理详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("开票信息管理详情1.0")
    public JSONObject waybillInvoiceDetail1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.invoice.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 增值税发票开票信息修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("增值税发票开票信息修改1.0")
    public JSONObject waybillInvoiceTitleUpdate1(String companyname, String taxno, String areacode, String address, String mobile, String bankname, String bankno, String whetherSynchronize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//单位名称
        map.put("taxno", taxno);//税务人识别号
        map.put("areacode", areacode);//区号
        map.put("address", address);//注册地址
        map.put("mobile", mobile);//注册电话
        map.put("bankname", bankname);//开户行
        map.put("bankno", bankno);//开户账号
        map.put("whetherSynchronize", whetherSynchronize);//修改时使用，可为空，同意未开出的发票使用修改后的开票信息开票
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.invoice.title.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }


    /**
     * 提交待开票1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillAddToPool1(String orderNumbers, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//运单号,逗号间隔
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.add.to.pool");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单开票全选预览1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillAllordersPreview1(String paybegintime, String payendtime, String loadaddress, String unloadaddress, String stockorder, String stockmemo, String keyword, String taxcode, String ispool, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("stockorder", stockorder);//发货单号
        map.put("stockmemo", stockmemo);//发货备注
        map.put("keyword", keyword);//关键子搜索
        map.put("taxcode", taxcode);//承运企业编码
        map.put("ispool", ispool);//是否在池子中，0-否，1-在
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.allorders.preview");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 承运企业列表查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillCompanyListQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.company.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移除待开票池1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillDelFromPool1(String orderNumbers, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNumbers", orderNumbers);//运单号,逗号间隔
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.del.from.pool");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 发票明细 下载1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillDetailLaborExport1(String flowid, String billmemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//开票申请流水号
        map.put("billmemo", billmemo);//开票备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.detail.labor.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票物流信息查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillLogisticsDetailquery1(String expressname, String expressno, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("expressname", expressname);//快递公司名称
        map.put("expressno", expressno);//快递单号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.logistics.detailquery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票模板地址查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillModelurlQuery1(String modelkind, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("modelkind", modelkind);//模板类型 1车牌信息填写错误的业务证明 2非承运运单业务证明 3货物类型选择错误的业务证明 4 原始单据时间更正说明
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.modelurl.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票下载
     *
     * @return response
     */
    public JSONObject waybillModelurlticket1(String ticketUrl) {
        return new BaseCall(ticketUrl, "GET").setData("").addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询发票详情1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOpenDetailquery1(String flowid, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String start, String limit, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//流水号
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.open.detailquery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 发票列表报表导出1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOpenListexcelExport1(String submitbegindate, String submitenddate, String flowid, String billtype, String billstate, String start, String limit, String month, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("submitbegindate", submitbegindate);//提交开始日期
        map.put("submitenddate", submitenddate);//提交截至日期
        map.put("flowid", flowid);//流水号
        map.put("billtype", billtype);//发票类型 1运费 2服务费 3调度费
        map.put("billstate", billstate);//发票状态 进展
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("month", month);//月份，格式：201806
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.open.listexcel.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询发票列表1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOpenListquery1(String submitbegindate, String submitenddate, String flowid, String billtype, String billstate, String start, String limit, String month, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("submitbegindate", submitbegindate);//提交开始日期
        map.put("submitenddate", submitenddate);//提交截至日期
        map.put("flowid", flowid);//流水号
        map.put("billtype", billtype);//发票类型 1运费 2服务费 3调度费
        map.put("billstate", billstate);//发票状态 进展
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("month", month);//月份，格式：201806
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.open.listquery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询发票列表2.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOpenListquery2(String submitbegindate, String submitenddate, String flowid, String billtype, String billstate, String start, String limit, String month, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("submitbegindate", submitbegindate);//提交开始日期
        map.put("submitenddate", submitenddate);//提交截至日期
        map.put("flowid", flowid);//流水号
        map.put("billtype", billtype);//发票类型 1运费 2服务费 3调度费
        map.put("billstate", billstate);//发票状态 进展
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("month", month);//月份，格式：201806
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.open.listquery");//接口路径
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
     * 开票异常单数量查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrderAbnormalCount1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.order.abnormal.count");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单列表报表导出1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrderListExcelExport1(String querytype, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String stockorder, String stockmemo, String start, String limit, String keyword, String orderstate, String ordernumber, String platenumber, String month, String taxcode, String querytimekind, String ispool, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//0全部运单 1可开票，2待处理，3不可开票，4预审中
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("stockorder", stockorder);//发货单号
        map.put("stockmemo", stockmemo);//发货备注
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("orderstate", orderstate);//(web查询全部运单筛选字段使用)运单状态 1全部 2可开票 3已申请 4已受理 5不可开票 6异常待处理 7预审中 9已开票 10 无需开票
        map.put("ordernumber", ordernumber);//(APP精确查询使用)运单号
        map.put("platenumber", platenumber);//(APP精确查询使用)车牌号
        map.put("month", month);//月份信息
        map.put("taxcode", taxcode);//承运企业编码
        map.put("querytimekind", querytimekind);//查询时间类型 1付款时间 2接单时间
        map.put("ispool", ispool);//是否在池子中 0 ：否，1：在
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.order.list.excel.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单开票列表查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrderListQuery1(String querytype, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String stockorder, String stockmemo, String start, String limit, String keyword, String orderstate, String ordernumber, String platenumber, String month, String taxcode, String querytimekind, String ispool, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//0全部运单 1可开票，2待处理，3不可开票，4预审中
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("stockorder", stockorder);//发货单号
        map.put("stockmemo", stockmemo);//发货备注
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("orderstate", orderstate);//(web查询全部运单筛选字段使用)运单状态 1全部 2可开票 3已申请 4已受理 5不可开票 6异常待处理 7预审中 9已开票 10 无需开票
        map.put("ordernumber", ordernumber);//(APP精确查询使用)运单号
        map.put("platenumber", platenumber);//(APP精确查询使用)车牌号
        map.put("month", month);//月份信息
        map.put("taxcode", taxcode);//承运企业编码
        map.put("querytimekind", querytimekind);//查询时间类型 1付款时间 2接单时间
        map.put("ispool", ispool);//是否在池子中 0 ：否，1：在
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.order.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web运单开票列表查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrderListWebQuery1(String querytype, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String stockorder, String stockmemo, String start, String limit, String keyword, String orderstate, String ordernumber, String platenumber, String month, String taxcode, String querytimekind, String ispool, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//0全部运单 1可开票，2待处理，3不可开票，4预审中
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("stockorder", stockorder);//发货单号
        map.put("stockmemo", stockmemo);//发货备注
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("orderstate", orderstate);//(web查询全部运单筛选字段使用)运单状态 1全部 2可开票 3已申请 4已受理 5不可开票 6异常待处理 7预审中 9已开票 10 无需开票
        map.put("ordernumber", ordernumber);//(APP精确查询使用)运单号
        map.put("platenumber", platenumber);//(APP精确查询使用)车牌号
        map.put("month", month);//月份信息
        map.put("taxcode", taxcode);//承运企业编码
        map.put("querytimekind", querytimekind);//查询时间类型 1付款时间 2接单时间
        map.put("ispool", ispool);//是否在池子中 0 ：否，1：在
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.order.list.web.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单补充资料1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersAddDetailquery1(String ordernumber, String treadeid, String orderstate, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("treadeid", treadeid);//异常单异常类型标记
        map.put("orderstate", orderstate);//运单状态 web端查询运单用
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.add.detailquery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询运单补充资料2.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersAddDetailquery2(String id, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//主键id
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.add.detailquery");//接口路径
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
     * 提交运单补充资料1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersAddUrl1(String ordernumber, String treadeid, String urls, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("treadeid", treadeid);//异常单异常类型标记
        map.put("urls", urls);//图片列表 多个逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.add.url");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * app开票备注修改1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersAppUpdate1(String flowid, String billmemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//开票申请流水号
        map.put("billmemo", billmemo);//开票备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.app.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询开票运单详情1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersDetailquery1(String ordernumber, String treadeid, String orderstate, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("treadeid", treadeid);//异常单异常类型标记
        map.put("orderstate", orderstate);//运单状态 web端查询运单用
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.detailquery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web劳务清单 下载1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersLaborExport1(String flowid, String billmemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//开票申请流水号
        map.put("billmemo", billmemo);//开票备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.labor.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单开票预览1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersPreview1(String ordernumbers, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号 多个逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.preview");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 可开票列表查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillInvoiceStatus(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.invoice.status");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端根据发票流水号查询运单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersQuerybyflowid1(String flowid, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String start, String limit, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//流水号
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.querybyflowid");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web端根据发票流水号查询运单列表报表导出1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersQuerybyflowidExcelExport1(String flowid, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String start, String limit, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//流水号
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.querybyflowid.excel.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 根据发票流水号查询运单列表1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersQuerybyflowids1(String flowids, String querytype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowids", flowids);//开票流水号，多个逗号隔开
        map.put("querytype", querytype);//查询类型 1 待开票 2 已提交
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.querybyflowids");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 提交开票1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersSubmit1(String billjson, String laborlisting, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("billjson", billjson);//开票参数json格式 如[{"flowid":"1","billmemo":"11"},{"flowid":"2","billmemo":"22"}]
        map.put("laborlisting", laborlisting);//是否需要劳务清单 0 否 1需要
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.submit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * web开票备注修改1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrdersUpdate1(String flowid, String billmemo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//开票申请流水号
        map.put("billmemo", billmemo);//开票备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.orders.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        SJBStockOrderService SJBStockOrderService = new SJBStockOrderService();
        List<String> lines = FileUtils.readLines(new File("C:\\Users\\Administrator\\Desktop\\citys.txt"), "utf-8");
        JSONObject reponse;
        JSONObject reponse2;
        List<String> data = new ArrayList<>();
        int total = 0;
        int size = 0;
        String stockCode = "";
        for (String line : lines) {
            Thread.sleep(1000);
            reponse = SJBStockOrderService.stockSearchList1(line, null, "2", null, null, null, null, null, null, null, "0", "0", "0", "0", "100", "0ff19c837e65405785b4382852c9b99a");
            size = reponse.getJSONArray("goodsInfos").size();
            if (size > 0) {
                total += size;
                System.out.println("有数据：" + reponse.getJSONArray("goodsInfos").size() + "条");
                for (int i = 0; i < size; i++) {
                    stockCode = reponse.getJSONArray("goodsInfos").getJSONObject(i).getJSONObject("goodsInfoSentCount").getString("stockCode");
                    reponse2 = SJBStockOrderService.stockQueryDetail2(null, stockCode, null, null, null, null, "0ff19c837e65405785b4382852c9b99a");

                    String sname = reponse2.getJSONObject("goodsInfo").getJSONArray("sourceaddresses").getJSONObject(0).getString("contastName");
                    String sphone = reponse2.getJSONObject("goodsInfo").getJSONArray("sourceaddresses").getJSONObject(0).getString("contastTel");
                    String sadd = reponse2.getJSONObject("goodsInfo").getJSONArray("sourceaddresses").getJSONObject(0).getString("address");

                    String dname = reponse2.getJSONObject("goodsInfo").getJSONArray("targetaddresses").getJSONObject(0).getString("contastName");
                    String dphone = reponse2.getJSONObject("goodsInfo").getJSONArray("targetaddresses").getJSONObject(0).getString("contastTel");
                    String dadd = reponse2.getJSONObject("goodsInfo").getJSONArray("targetaddresses").getJSONObject(0).getString("address");

                    data.add("货物种类:" + reponse2.getJSONObject("goodsInfo").getString("stockkind") + "," + "单价:" + reponse2.getJSONObject("goodsInfo").getString("unitprice") + "重量:" + reponse2.getJSONObject("goodsInfo").getString("unit") + "总价:" + reponse2.getJSONObject("goodsInfo").getString("price"));
                    data.add("发货人姓名:" + sname + "," + "发货手机号:" + sphone + "发货地址:" + sadd);
                    data.add("收货人姓名:" + dname + "," + "收货手机号:" + dphone + "收货地址:" + dadd);
                    data.add("");
                }
            }
        }
        System.out.println("订单总数：" + total);
        FileUtils.writeLines(new File("data.txt"), data);

    }

    /**
     * 开票异常列表查询1.0
     *
     * @return response
     * @
     */
    public JSONObject waybillOrderAbnormalListQuery1(String querytype, String begintime, String endtime, String loadname, String unloadname, String keyword,
                                                     String signpeoplemobilekeyword, String errstatetype, String errobjecttype, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//查询时间类型 0运单创建时间 1签收时间 2支付时间
        map.put("begintime", begintime);
        map.put("endtime", endtime);
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地址名称
        map.put("keyword", keyword);//关键字查询
        map.put("signpeoplemobilekeyword", signpeoplemobilekeyword);//签收人电话关键字
        map.put("errstatetype", errstatetype);//0 包括1，2 1待处理 2审核中
        map.put("errobjecttype", errobjecttype);//0 包括1，2 1收单员 2企业
        map.put("start", start);
        map.put("limit", limit);

        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.order.abnormal.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票信息新增1.0
     * 20190529 0222460waybill.invoice.detail
     *
     * @return response
     * @throws Exception
     */
    @Step("开票信息新增1.0")
    public JSONObject waybillInvoiceAdd1(String companyname, String taxno, String address, String areacode, String mobile, String bankname, String bankno, String receivername, String receiverphone, String receiveremail, String addressprovincecode, String addresscitycode, String addresscountycode, String addressprovincename, String addresscityname, String addresscountyname, String addressdetail, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//单位名称
        map.put("taxno", taxno);//税务人识别号
        map.put("address", address);//注册地址
        map.put("areacode", areacode);//区号
        map.put("mobile", mobile);//注册电话
        map.put("bankname", bankname);//开户行
        map.put("bankno", bankno);//开户账号
        map.put("receivername", receivername);//收票人姓名
        map.put("receiverphone", receiverphone);//收票人联系电话
        map.put("receiveremail", receiveremail);//收票人电子邮箱
        map.put("addressprovincecode", addressprovincecode);//收票地址省编码
        map.put("addresscitycode", addresscitycode);//收票地址市编码
        map.put("addresscountycode", addresscountycode);//收票地址区县编码
        map.put("addressprovincename", addressprovincename);//收票地址省名称
        map.put("addresscityname", addresscityname);//收票地址市名称
        map.put("addresscountyname", addresscountyname);//收票地址区县名称
        map.put("addressdetail", addressdetail);//详细地址
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.invoice.add");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票池运单移动-将指定条件的运单1.0
     * 20190529 0249606
     *
     * @return response
     * @throws Exception
     */
    @Step("开票池运单移动-将指定条件的运单1.0")
    public JSONObject waybillPoolAllMove1(String querytype, String paybegintime, String payendtime, String loadaddress, String unloadaddress, String stockorder, String stockmemo, String start, String limit, String keyword, String orderstate, String ordernumber, String platenumber, String month, String taxcode, String querytimekind, String ispool, String querymoneytype, String querystartmoney, String queryendmoney, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//0全部运单 1可开票，2待处理，3不可开票，4预审中
        map.put("paybegintime", paybegintime);//付款起始时间
        map.put("payendtime", payendtime);//付款截至时间
        map.put("loadaddress", loadaddress);//发货地
        map.put("unloadaddress", unloadaddress);//卸货地
        map.put("stockorder", stockorder);//发货单号
        map.put("stockmemo", stockmemo);//发货备注
        map.put("start", start);//起始
        map.put("limit", limit);//分页当前页记录数
        map.put("keyword", keyword);//关键子搜索
        map.put("orderstate", orderstate);//(web查询全部运单筛选字段使用)运单状态 1全部 2可开票 3已申请 4已受理 5不可开票 6异常待处理 7预审中 9已开票 10 无需开票
        map.put("ordernumber", ordernumber);//(APP精确查询使用)运单号
        map.put("platenumber", platenumber);//(APP精确查询使用)车牌号
        map.put("month", month);//月份信息
        map.put("taxcode", taxcode);//承运企业编码
        map.put("querytimekind", querytimekind);//查询时间类型 1付款时间 2接单时间
        map.put("ispool", ispool);//是否在池子中 0 ：否，1：在
        map.put("querymoneytype", querymoneytype);//1下单运价 2收单运价
        map.put("querystartmoney", querystartmoney);//查询起始金额
        map.put("queryendmoney", queryendmoney);//查询截止金额
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "waybill.pool.all.move");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }



    /**
     * 取消任务单
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderscheduleFinishOrderSchedule(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderschedule.finishOrderSchedule");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 任务单--装货签到
     *
     * @return response
     * @
     */
    public JSONObject assureorderOrderscheduleGoonCoal(String somethingcode, String lon, String lat, String addressCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);
        map.put("lon", lon);
        map.put("lat", lat);
        map.put("addressCode", addressCode);
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.orderschedule.goon.coal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 任务单详情查询
     * @param orderScheduleCode
     * @param session
     * @return
     */
    public JSONObject assureorderQueryOrderscheduleDetailCoal(String orderScheduleCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderScheduleCode", orderScheduleCode);
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.detail.coal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }


    /**
     * 任务单卸货签到
     * @param orderNumber
     * @param address
     * @param addressCode
     * @param longitude
     * @param latitude
     * @param session
     * @return
     */
    public JSONObject assureorderSigninCreateUploadingCoal(String orderNumber, String address, String addressCode, String longitude, String latitude, String signWay, String agreeContract, String geoType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("signWay", "0");
        map.put("address", address);
        map.put("orderNumber", orderNumber);
        map.put("addressCode", addressCode);
        map.put("longitude", longitude);
        map.put("latitude", latitude);
        map.put("agreeContract", "0");
        map.put("geoType", "2");

        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.signin.create.uploading.coal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }


    /**
     * 刷新任务信息
     * @param somethingcode
     * @param session
     * @return
     */
    public JSONObject assureorderQueryOrderscheduleOntheway(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorder.query.orderschedule.ontheway");//接口路径
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
