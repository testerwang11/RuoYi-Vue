package com.ruoyi.project.sjbapi.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jcraft.jsch.JSchException;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.DBHelper;
import com.ruoyi.project.sjbapi.util.RandomUtils;
import com.ruoyi.project.sjbapi.util.StringUtils;
import io.qameta.allure.Step;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class CommonService extends BaseService {
    private static final Logger log = LoggerFactory.getLogger(CommonService.class);

    private static CommonService commonService = null;
    //public static DBHelper dbHelper = DBHelper.getInstance();

    AccountService accountService = new AccountService();
    SJBAllService sjbAllService = new SJBAllService();

    SJBFinanceService sjbFinanceService = new SJBFinanceService();
    SJBStockOrderService sjbStockOrderService = new SJBStockOrderService();
    SJBToolService sjbToolService = new SJBToolService();
    SJBOperationService sjbOperationService = new SJBOperationService();
    ROPService ropservice = new ROPService();
    SJBWebService sjbWebService = new SJBWebService();
    PayGateService payGateService = new PayGateService();
    FinancialService financialService = FinancialService.getInstance();
    BamsServices bamsServices = BamsServices.getInstance();
    boolean isLaterPay;//是否账期

    public static CommonService getInstance() {
        if (commonService == null) {
            synchronized (CommonService.class) {
                if (commonService == null) {
                    commonService = new CommonService();
                }
            }
        }
        return commonService;
    }

    /**
     * @param freightKind       运费构成类型，2表示金额，1表示百分比
     * @param loadpayratio      装货支付比例_油卡
     * @param loadpayfee        装货支付金额_油卡
     * @param loadpayMonyeRatio 装货支付比例_现金
     * @param loadpayMoneyFee   装货支付金额_现金
     * @param deliveryratio     卸货支付比例
     * @param deliveryfee       卸货支付金额
     * @param uploadpayratio    卸货支付比例_油卡
     * @param uploadpayfee      卸货支付金额_油卡
     * @param agentCodes        经纪人编码
     */
    public void publishOrder3(String freightKind, String loadpayratio, String loadpayfee, String loadpayMonyeRatio, String loadpayMoneyFee, String loadpayEtcRatio, String loadpayEtcFee, String deliveryratio, String deliveryfee, String uploadpayratio, String uploadpayfee, String agentCodes, String sessionID) {
        int unit = 10;//货物重量
        int unitprice = 10; //运费单价 元/每吨
        int price = unitprice * unit; //运单总价 元
        int hunitprice = 10;//货物单价

        //String freightKind = "2";//运费构成类型，2表示金额，1表示百分比

        /*String loadpayratio = "0";//装货支付比例_油卡
        String loadpayfee = "0";//装货支付金额_油卡
        String loadpayMonyeRatio = "0";//装货支付比例_现金
        String loadpayMoneyFee = "0";//装货支付金额_现金
        String loadpayEtcRatio = "0";//装货支付比例_etc
        String loadpayEtcFee = "0";//装货支付金额_etc
        String deliveryratio = "";//卸货支付比例
        String deliveryfee = "";//卸货支付金额
        String uploadpayratio = "";//卸货支付比例_油卡
        String uploadpayfee = "";//卸货支付金额_油卡*/
        //String loadpayEtcRatio = "0";//装货支付比例_etc
        //String loadpayEtcFee = "0";//装货支付金额_etc

        String stockDesc = "现金";
        String stockType = "2";//货源类型
        String stockKind = "3";//货物类型
        String laterpaystate = "0";//账期支付开关，2表示开启，0表示关闭
        String clearingCycle = "0";
        String autoCheck = "false";//自动确认
        String autoUpdate = "false";
        String haulageoperatorstate = "1";//承运公司开关 0 关闭 1 打开
        String haulageoperatorname = "";//承运公司名称
        String haulageoperatorcode = "";//承运公司编码
        //String haulageoperatormoney = "";//承运公司费用
        //String agentCodes = "400000009848";
        String openable;
        if (agentCodes != null || agentCodes.length() > 0) {
            openable = "false";
        } else {
            openable = "true";
        }
        //查询装货、卸货地址
        JSONArray addressData = sjbAllService.companyAddressQueryList1(null, sessionID).getJSONArray("zones");//查询企业地址
        int size = addressData.size();
        JSONObject fahuo = addressData.getJSONObject(size - 1);
        JSONObject shouhuo = addressData.getJSONObject(size - 2);


        //企业油卡账户查询
        String oilMoney = Integer.parseInt(loadpayfee) + Integer.parseInt(uploadpayfee) + "";
        //查询收单规则
        String ruleCode = sjbStockOrderService.stockCoalruleQuery1(shouhuo.getString("contastTel"), sessionID).getJSONArray("rules").getJSONObject(0).getString("ruleCode");
        //查询货物单价
        sjbStockOrderService.stockCompanycoalQuery1(sessionID);

        JSONObject response = sjbFinanceService.oilcardMoneyQuery1(oilMoney, String.valueOf(price * 10000), loadpayEtcFee, "1", "0", sessionID);

        //企业配置项查询
        JSONObject configData = sjbFinanceService.accountConfigQuery1(sessionID);
        haulageoperatorcode = configData.getJSONObject("response").getString("companycode");
        haulageoperatorname = configData.getJSONObject("response").getString("companyname");

        //步骤1 企业发货
        sjbStockOrderService.stockPublish2("0", "false", null, null, "false", null, null, null, stockDesc, stockType, stockKind, shouhuo.getString("regionCode"), shouhuo.getString("regionName"), fahuo.getString("regionCode"), fahuo.getString("regionName"), "0", "0", "0", "0", "0", openable, "0.00", null, "0.00", "0.0", "0.0", null, fahuo.getString("lon"), fahuo.getString("lat"), null, String.valueOf(price), unitprice + "元/吨", unit + "吨", null, null, null, null, "false", "false", "false", "true", null, "0", "0", shouhuo.getString("zoneCode"), fahuo.getString("zoneCode"), "dh" + System.currentTimeMillis(), null, "3", "2147483647", clearingCycle, null, String.valueOf(price * 10000), freightKind, "0", "0", loadpayratio, loadpayfee, loadpayMonyeRatio, loadpayMoneyFee, loadpayEtcRatio, loadpayEtcFee, deliveryratio, deliveryfee, uploadpayratio, uploadpayfee, haulageoperatorstate, haulageoperatorname, haulageoperatorcode, response.getString("rateamount"), laterpaystate, "", agentCodes, autoUpdate, autoCheck, "false", null, null, null, System.currentTimeMillis() + "", ruleCode, "煤炭", String.valueOf(hunitprice * 10000), null, "false", "false", "true", null, sessionID);
    }

    /**
     * @param freightKind       运费构成类型，2表示金额，1表示百分比
     * @param loadpayratio      装货支付比例_油卡
     * @param loadpayfee        装货支付金额_油卡
     * @param loadpayMonyeRatio 装货支付比例_现金
     * @param loadpayMoneyFee   装货支付金额_现金
     * @param deliveryratio     卸货支付比例
     * @param deliveryfee       卸货支付金额
     * @param uploadpayratio    卸货支付比例_油卡
     * @param uploadpayfee      卸货支付金额_油卡
     * @param agentCodes        经纪人编号
     * @param stockqrcode       是否货源吗
     */
    public void publishOrder4(String freightKind, String loadpayratio, String loadpayfee, String loadpayMonyeRatio, String loadpayMoneyFee, String loadpayEtcRatio, String loadpayEtcFee, String deliveryratio, String deliveryfee, String uploadpayratio, String uploadpayfee, String agentCodes, String stockqrcode, String sessionID) {
        int unit = 10;//货物重量
        int unitprice = 10; //运费单价 元/每吨
        int price = unitprice * unit; //运单总价 元

        String stockDesc = "现金";
        String stockType = "2";//货源类型
        String stockKind = "3";//货物类型
        String laterpaystate = "0";//账期支付开关，2表示开启，0表示关闭
        String clearingCycle = "1";
        String autoCheck = "false";//自动确认
        String haulageoperatorstate = "1";//承运公司开关 0 关闭 1 打开
        String haulageoperatorname = "";//承运公司名称
        String haulageoperatorcode = "";//承运公司编码
        //String haulageoperatormoney = "";//承运公司费用
        //String agentCodes = "400000009848";
        String autoUpdate = "false";
        String openable;
        if (agentCodes != null && agentCodes.length() > 0) {
            openable = "false";
        } else {
            openable = "true";
        }
        //查询装货、卸货地址
        JSONArray addressData = sjbAllService.companyAddressQueryList1(null, sessionID).getJSONArray("zones");//查询企业地址
        int size = addressData.size();
        JSONObject fahuo = addressData.getJSONObject(size - 1);//发货地址
        JSONObject shouhuo = addressData.getJSONObject(size - 2);//卸货地址


        //企业油卡账户查询
        String oilMoney = Integer.parseInt(loadpayfee) + Integer.parseInt(uploadpayfee) + "";
        JSONObject response = sjbFinanceService.oilcardMoneyQuery1(oilMoney, String.valueOf(price * 10000), loadpayEtcFee, "1", "0", sessionID);
        //查询收单规则
        String ruleCode = sjbStockOrderService.stockCoalruleQuery1(shouhuo.getString("contastTel"), sessionID).getJSONArray("rules").getJSONObject(0).getString("ruleCode");
        //查询货物单价
        JSONObject response2 = sjbStockOrderService.stockCompanycoalQuery1(sessionID).getJSONArray("list").getJSONObject(0);
        String freightname = response2.getString("freightname");//货物名称
        int freightPrice = response2.getInteger("price");//货物单价
        //企业配置项查询
        JSONObject configData = sjbFinanceService.accountConfigQuery1(sessionID);
        haulageoperatorcode = configData.getJSONObject("response").getString("companycode");
        haulageoperatorname = configData.getJSONObject("response").getString("companyname");

        //步骤1 企业发货
        sjbStockOrderService.stockPublish2("0", "false", null, null, "false", null, null, null, stockDesc, stockType, stockKind, shouhuo.getString("regionCode"), shouhuo.getString("regionName"), fahuo.getString("regionCode"), fahuo.getString("regionName"), "0", "0", "0", "0", "0", openable, "0.00", null, "0.00", "0.0", "0.0", null, fahuo.getString("lon"), fahuo.getString("lat"), null, String.valueOf(price), unitprice + "元/吨", unit + "吨", null, null, null, null, "false", "false", "false", "true", null, "0", "0", shouhuo.getString("zoneCode"), fahuo.getString("zoneCode"), "dh" + System.currentTimeMillis(), null, "3", "2147483647", clearingCycle, null, String.valueOf(price * 10000), freightKind, "0", "0", loadpayratio, loadpayfee, loadpayMonyeRatio, loadpayMoneyFee, loadpayEtcRatio, loadpayEtcFee, deliveryratio, deliveryfee, uploadpayratio, uploadpayfee, haulageoperatorstate, haulageoperatorname, haulageoperatorcode, response.getString("rateamount"), laterpaystate, "", agentCodes, autoUpdate, autoCheck, "false", null, null, null, System.currentTimeMillis() + "", ruleCode, freightname, freightPrice + "", null, "false", "false", stockqrcode, null, sessionID);
    }

    /**
     * @param autoCheck       true自动确认司机 false手动确认
     * @param laterpaystate   账期支付开关，2表示开启，0表示关闭
     * @param loadpayfee      装货支付金额_油卡
     * @param loadpayMoneyFee 装货支付金额_现金
     * @param deliveryfee     卸货支付金额
     * @param uploadpayfee    卸货支付金额_油卡
     * @param agentCodes      经纪人编号
     * @param stockqrcode     是否货源吗
     * @Param tradeOrder      贸易货源订单编号PO1906250018_sjb_2
     */
    public JSONObject publishOrder5(String autoCheck, String laterpaystate, String loadpayfee, String loadpayMoneyFee, String loadpayEtcFee, String deliveryfee, String uploadpayfee, String agentCodes, String stockqrcode, String tradeOrder, String sessionID) {
        int unit = 10;//货物重量
        int unitprice = 10; //运费单价 元/每吨
        int price = unitprice * unit; //运单总价 元
        String freightKind = "2";//运费构成类型，2表示金额，1表示百分比 目前只能金额
        String stockDesc, clearingCycle;
        if (laterpaystate.equals("0")) {
            stockDesc = "现金";
            clearingCycle = "0";
        } else {
            stockDesc = "账期";
            clearingCycle = "1";
        }
        String stockType = "2";//货源类型
        String stockKind = "3";//货物类型
        //String laterpaystate = "0";//账期支付开关，2表示开启，0表示关闭
        //String autoCheck = "false";//自动确认
        String haulageoperatorstate = "1";//承运公司开关 0 关闭 1 打开
        String haulageoperatorname = "";//承运公司名称
        String haulageoperatorcode = "";//承运公司编码
        //String haulageoperatormoney = "";//承运公司费用
        //String agentCodes = "400000009848";
        String autoUpdate = "false";
        String openable;
        if (agentCodes != null && agentCodes.length() > 0) {
            openable = "false";
        } else {
            openable = "true";
        }
        //查询有无贸易货源
        //String orderPurchaseSn = sjbStockOrderService.stockTradeQuery1("0","10",sessionID).getJSONArray("list").getJSONObject(0).getString("orderPurchaseSn");


        //查询装货、卸货地址
        JSONArray addressData = sjbAllService.companyAddressQueryList1(null, sessionID).getJSONArray("zones");//查询企业地址
        int size = addressData.size();
        JSONObject fahuo = addressData.getJSONObject(size - 1);//发货地址
        JSONObject shouhuo = addressData.getJSONObject(size - 2);//卸货地址


        //企业油卡账户查询
        String oilMoney = Integer.parseInt(loadpayfee) + Integer.parseInt(uploadpayfee) + "";
        JSONObject response = sjbFinanceService.oilcardMoneyQuery1(oilMoney, String.valueOf(price * 10000), loadpayEtcFee, "1", "0", sessionID);
        //查询收单规则
        String ruleCode = sjbStockOrderService.stockCoalruleQuery1(shouhuo.getString("contastTel"), sessionID).getJSONArray("rules").getJSONObject(0).getString("ruleCode");
        //查询货物单价
        JSONObject response2 = sjbStockOrderService.stockCompanycoalQuery1(sessionID).getJSONArray("list").getJSONObject(0);
        String freightname = response2.getString("freightname");//货物名称
        int freightPrice = response2.getInteger("price");//货物单价
        //企业配置项查询
        JSONObject configData = sjbFinanceService.accountConfigQuery1(sessionID);
        haulageoperatorcode = configData.getJSONObject("response").getString("companycode");
        haulageoperatorname = configData.getJSONObject("response").getString("companyname");

        //步骤1 企业发货
        response = sjbStockOrderService.stockPublish2("0", "false", null, null, "false", null, null, null, stockDesc, stockType, stockKind, shouhuo.getString("regionCode"), shouhuo.getString("regionName"), fahuo.getString("regionCode"), fahuo.getString("regionName"), "0", "0", "0", "0", "0", openable, "0.00", null, "0.00", "0.0", "0.0", null, fahuo.getString("lon"), fahuo.getString("lat"), null, String.valueOf(price), unitprice + "元/吨", unit + "吨", null, null, null, null, "false", "false", "false", "true", null, "0", "0", shouhuo.getString("zoneCode"), fahuo.getString("zoneCode"), null, tradeOrder, "3", "2147483647", clearingCycle, null, String.valueOf(price * 10000), freightKind, "0", "0", "0", loadpayfee, "0", loadpayMoneyFee, "0", loadpayEtcFee, "0", deliveryfee, "0", uploadpayfee, haulageoperatorstate, haulageoperatorname, haulageoperatorcode, response.getString("rateamount"), laterpaystate, "", agentCodes, autoUpdate, autoCheck, "false", null, null, null, System.currentTimeMillis() + "", ruleCode, freightname, freightPrice + "", null, "false", "false", stockqrcode, null, sessionID);
        return response;
    }

    /**
     * 编辑货源
     *
     * @param stockCode
     * @param sessionID1
     * @return
     */
    public JSONObject stockUpdate(String stockCode, String sessionID1) {
        JSONObject detail = sjbStockOrderService.stockQueryDetail2(null, stockCode, null, null, null, null, sessionID1);
        DocumentContext json = JsonPath.parse(detail);
        JSONObject response = sjbStockOrderService.stockUpdate1(null, null, null, null, null, null, null,
                null, json.read("$.goodsInfo.stockdesc"), json.read("$.goodsInfo.stocktype") + "", json.read("$.goodsInfo.stockkindID") + "",
                json.read("$.goodsInfo.sourceaddresses[0].regionCode"), json.read("$.goodsInfo.sourceaddresses[0].regionName"), json.read("$.goodsInfo.targetaddresses[0].regionCode"), json.read("$.goodsInfo.sourcename"),
                json.read("$.goodsInfo.constructID") + "", json.read("$.goodsInfo.platecolorID") + "", json.read("$.goodsInfo.brandnameID") + "", json.read("$.goodsInfo.lengthID") + "", json.read("$.goodsInfo.specialID") + "", null,
                null, null, null, "0.0", "0.0", null, "0.0",
                "0.0", null, json.read("$.goodsInfo.unitprice") + "", json.read("$.goodsInfo.unitprice") + "", json.read("$.goodsInfo.unit") + "", null, null, null, null, "false",
                "false", "false", "true", null, json.read("$.goodsInfo.emptyMargin") + "", json.read("$.goodsInfo.informationFees") + "",
                json.read("$.goodsInfo.sourceaddresses[0].zoneCode"), json.read("$.goodsInfo.targetaddresses[0].zoneCode"), "", null, json.read("$.goodsInfo.transitTime") + "", json.read("$.goodsInfo.carNumber") + "", json.read("$.goodsInfo.clearingCycle") + "",
                null, json.read("$.goodsInfo.freightRates") + "", "2", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "1000000", "0", "0",
                json.read("$.goodsInfo.haulageoperatorstate") + "", json.read("$.goodsInfo.haulageoperatorname"), json.read("$.goodsInfo.haulageoperatorcode"), json.read("$.goodsInfo.haulageoperatormoney") + "", json.read("$.goodsInfo.laterpaystate") + "",
                null, null, json.read("$.goodsInfo.autoUpdate") + "", json.read("$.goodsInfo.autoCheck") + "", json.read("$.goodsInfo.workstock") + "", json.read("$.goodsInfo.stockkind") + "", stockCode, "false",
                null, json.read("$.goodsInfo.rulecode"), json.read("$.goodsInfo.freightname"),
                json.read("$.goodsInfo.freightprice") + "", json.read("$.goodsInfo.appointmenttime") + "", json.read("$.goodsInfo.appointmented") + "", json.read("$.goodsInfo.offlinepay") + "", null, sessionID1);
        return response;
    }

    /**
     * @param stockCode           货源编码
     * @param agentMode           //代收模式 1 总金额 2单价 0不收取
     * @param agentUnitPrice      //单价金额
     * @param agentMoney          //经纪费总额
     * @param informationfess     //信息费金额
     * @param vehiclefee          //车辆使用金额
     * @param advanceexpenditured //是否垫支 0 不 1垫支
     * @param advancePercent      //垫支比例
     * @param advanceMoney        //垫支金额
     * @param advanceType         //垫支方式 1现金 2账期
     * @param checkForFee         //对账费
     * @param allowLossUnit       //亏吨容忍
     * @param unitPrice           //单价
     * @param offlineServerfee    //新版抢单之前信息费
     * @param allowUpUnit         //涨吨容忍
     * @param unitUpPrice         //涨吨单价上浮
     * @param sessionID4
     * @return
     */
    @Step("经纪人发货")
    public String agentUpdateStock(String stockCode, String agentMode, String agentUnitPrice, String agentMoney, String informationfess, String vehiclefee, String advanceexpenditured, String advancePercent, String advanceMoney, String advanceType, String checkForFee, String allowLossUnit, String unitPrice, String offlineServerfee, String allowUpUnit, String unitUpPrice, String sessionID4) {
        JSONArray list = sjbToolService.stockagentStockQuery1("0", "0", "10", sessionID4).getJSONArray("list");
        Iterator it = list.iterator();
        String stockagentcode = null;
        while (it.hasNext()) {
            JSONObject temp = (JSONObject) it.next();
            if (temp.getJSONObject("agentstockdto").getString("stockcode").equals(stockCode)) {
                stockagentcode = temp.getString("stockagentcode");
                break;
            }
        }
        sjbToolService.stockagentStockUpdate1(stockagentcode, agentMode, agentUnitPrice, agentMoney, informationfess, vehiclefee, advanceexpenditured, advancePercent, advanceMoney, advanceType, "0", "0", null, "", checkForFee, null, allowLossUnit, unitPrice, offlineServerfee, allowUpUnit, unitUpPrice, sessionID4);
        return stockagentcode;
    }

    @Step("经纪人货源预约")
    public void agentOrderPreCreate(String stockagentcode, String payPassword, String sessionID2) {
        //查询车牌
        //查询支付口令
        String passwordalias = sjbFinanceService.accountPasswordaliasQuery1(payPassword, sessionID2).getString("passwordalias");

        //支付费用
        sjbStockOrderService.stockAgentorderPreCreate1(stockagentcode, "1", "2", null, passwordalias, "沪C79751", sessionID2);
    }

    /**
     * 接单
     */
    @Step("接单")
    public String assureorderCreate(String stockCode, String sessionID2) {
        //查询司机车辆信息
        JSONObject driverData = sjbAllService.driverQueryVehiclelist1(sessionID2).getJSONArray("list").getJSONObject(0);//查询车辆信息
        JSONObject accountData = sjbAllService.driverQueryfordriver1(null, sessionID2);

        String phone = accountData.getJSONObject("userInfo").getString("uid");
        String userCode = driverData.getString("usercode");//司机用户id
        String id = driverData.getString("id");//车辆ID

        JSONObject response = sjbStockOrderService.assureorderCreate2(stockCode, userCode, phone, id, "", "0", "", "", sessionID2);
        return response.getString("orderNumber");
    }

    /**
     * 接单
     */
    @Step("接单")
    public String assureorderCreate(String stockCode, String agentCode, String sessionID2) {
        //查询司机车辆信息
        JSONObject driverData = sjbAllService.driverQueryVehiclelist1(sessionID2).getJSONArray("list").getJSONObject(0);//查询车辆信息
        JSONObject accountData = sjbAllService.driverQueryfordriver1(null, sessionID2);

        String phone = accountData.getJSONObject("userInfo").getString("uid");
        String userCode = driverData.getString("usercode");//司机用户id
        String id = driverData.getString("id");//车辆ID
        JSONObject response = sjbStockOrderService.assureorderCreate2(stockCode, userCode, phone, id, "", "0", "", agentCode, sessionID2);
        return response.getString("orderNumber");
    }

    /**
     * 接单2
     */
    @Step("接单2")
    public JSONObject assureorderCreate2(String stockCode, String agentCode, String sessionID2) {
        //查询司机车辆信息
        JSONObject driverData = sjbAllService.driverQueryVehiclelist1(sessionID2).getJSONArray("list").getJSONObject(0);//查询车辆信息
        JSONObject accountData = sjbAllService.driverQueryfordriver1(null, sessionID2);

        String phone = accountData.getJSONObject("userInfo").getString("uid");
        String userCode = driverData.getString("usercode");//司机用户id
        String id = driverData.getString("id");//车辆ID
        JSONObject response = sjbStockOrderService.assureorderCreate2(stockCode, userCode, phone, id, "", "0", "", agentCode, sessionID2);
        return response;
    }

    /**
     * 判断订单状态
     *
     * @param orderNumber
     */
    @Step("检查订单状态")
    public boolean checkOrderState(String orderNumber, String session) {
        JSONObject response = sjbStockOrderService.assureorderQueryDetail1(orderNumber, session);
        response.getJSONObject("assureOrderDTO").getString("ordersimplestate");
        return isLaterPay = response.getJSONObject("assureOrderDTO").getBoolean("islaterpay");
    }

    /**
     * 检查订单状态与预期是否一致
     *
     * @param orderNo
     * @param expect
     * @param sessionID1
     * @param sessionID2
     * @throws InterruptedException
     */
    public void checkOrderState(String orderNo, String expect, String sessionID1, String sessionID2) throws InterruptedException {
        String memo;
        for (int i = 0; i < 30; i++) {
            Thread.sleep(1000);
            memo = sjbAllService.orderSchedule(orderNo, sessionID2).getJSONObject("data").getJSONArray("assureOrderScheduleDtos").getJSONObject(0).getString("memo");
            if (memo.equals(expect)) {
                return;
            }
            if (memo.equals("提交评价，运单完成")) {
                return;
            }
        }
        //运单状态与预期不符合时，取消运单取消运单
        commonService.cancelStockOrder(orderNo, sessionID1, sessionID2);
    }

    private String typeName;

    @Step("判断运单状态")
    public String getOrderState(String orderNo, String sessionID2) throws InterruptedException {
        String temp = "";
        JSONObject response;
        //第一次查询取个初始值
        response = sjbAllService.orderSchedule(orderNo, sessionID2);
        typeName = JsonPath.parse(response).read("$.data.assureOrderScheduleDtos[0].typeName");
        if (typeName.equals("下一步")) {
            typeName = JsonPath.parse(response).read("$.data.assureOrderScheduleDtos[0].memo");
        }
        Thread.sleep(1000);
        response = sjbAllService.orderSchedule(orderNo, sessionID2);
        int recordType = JsonPath.parse(response).read("$.data.assureOrderScheduleDtos[0].recordType");
        if (recordType == 37) {
            temp = JsonPath.parse(response).read("$.data.assureOrderScheduleDtos[0].typeName");
            if (temp.equals("下一步")) {
                temp = JsonPath.parse(response).read("$.data.assureOrderScheduleDtos[0].memo");
            }
        }
        log.info("比较值temp:" + temp + ";typeName:" + typeName);
        if (temp.equals(typeName)) {
            return temp;
        } else {
            getOrderState(orderNo, sessionID2);
        }
        return "";
    }

    /**
     * 检查订单状态与预期是否一致
     *
     * @param orderNo
     * @param expect
     * @param sessionID2
     * @throws InterruptedException
     */
    public boolean checkOrderState(String orderNo, String expect, String sessionID2) throws InterruptedException {
        String sessionID = accountService.accountLogin1(sessionID2, "123456", "2", "true", "").getString("sessionID");
        String memo;
        for (int i = 0; i < 30; i++) {
            Thread.sleep(1000);
            memo = sjbAllService.orderSchedule(orderNo, sessionID).getJSONObject("data").getJSONArray("assureOrderScheduleDtos").getJSONObject(0).getString("memo");
            if (memo.equals(expect)) {
                return true;
            }
            if (memo.equals("提交评价，运单完成")) {
                return false;
            }
        }
        return false;
    }

    /**
     * 确认司机
     *
     * @param orderNumber
     */
    @Step("确认司机")
    public void confirmDriver(String stockCode, String orderNumber, String sessionID1) {
        //查询货源详情
        JSONObject response1 = sjbStockOrderService.stockQueryDetail2(null, stockCode, null, null, null, null, sessionID1);
        if (!response1.getJSONObject("goodsInfo").getBoolean("autoCheck")) {
            if (isLaterPay) {
                //账期确认司机
                sjbFinanceService.tradeOrderBatchCreateLaterpay1(orderNumber, null, "1", sessionID1);

            } else {
                //现金确认司机
                JSONObject response = sjbFinanceService.tradeOrderBatchPre1(orderNumber, "1", sessionID1);
                int favorable = response.getInteger("totalintermediaryfavorable");
                int payMoney = response.getInteger("totalpay");
                int poundage = response.getInteger("totalintermediarypoundage");

                int pounType = response.getInteger("paytype");

                //查询账户详情
                JSONObject accountDetail = sjbFinanceService.accountDetailQuery1(sessionID1);

                //验证密码
                String passwordalias = sjbFinanceService.accountPasswordaliasQuery1("123456", sessionID1).getString("passwordalias");
                //支付给承运公司
                String data = "{\"list\":[{\"ordernumber\":\"" + orderNumber + "\",\"favorable\":" + favorable + ",\"paymoney\":" + payMoney + ",\"poundage\":" + poundage + "}]}";
                sjbFinanceService.tradeOrderBatchCreateNew1(data, payMoney + "", pounType + "", null, accountDetail.getJSONObject("walletaccount").getString("walletaccountid"), null, passwordalias, "http://www.baidu.com", null, accountDetail.getJSONObject("walletaccount").getString("moneybalance"), sessionID1);
            }
        } else {
            System.out.println("该订单自动确认司机");
        }
    }

    @Step("确认司机")
    public void confirmDriver(String stockCode, String orderNumber, String sessionID1, String pay_password) {
        //查询货源详情
        JSONObject response1 = sjbStockOrderService.stockQueryDetail2(null, stockCode, null, null, null, null, sessionID1);
        if (!response1.getJSONObject("goodsInfo").getBoolean("autoCheck")) {
            if (isLaterPay) {
                //账期确认司机
                sjbFinanceService.tradeOrderBatchCreateLaterpay1(orderNumber, null, "1", sessionID1);
            } else {
                //现金确认司机
                JSONObject response = sjbFinanceService.tradeOrderBatchPre1(orderNumber, "1", sessionID1);
                int favorable = response.getInteger("totalintermediaryfavorable");
                int payMoney = response.getInteger("totalpay");
                int poundage = response.getInteger("totalintermediarypoundage");
                int pounType = response.getInteger("paytype");
                //查询账户详情
                JSONObject accountDetail = sjbFinanceService.accountDetailQuery1(sessionID1);
                //验证密码
                String passwordalias = sjbFinanceService.accountPasswordaliasQuery1(pay_password, sessionID1).getString("passwordalias");
                //支付给承运公司
                String data = "{\"list\":[{\"ordernumber\":\"" + orderNumber + "\",\"favorable\":" + favorable + ",\"paymoney\":" + payMoney + ",\"poundage\":" + poundage + "}]}";
                sjbFinanceService.tradeOrderBatchCreateNew1(data, payMoney + "", pounType + "", null, accountDetail.getJSONObject("walletaccount").getString("walletaccountid"), null, passwordalias, "http://www.baidu.com", null, accountDetail.getJSONObject("walletaccount").getString("moneybalance"), sessionID1);
            }
        } else {
            System.out.println("该订单自动确认司机");
        }
    }

    /**
     * 完成装货
     *
     * @param orderNumber
     * @param payPassword
     * @param session
     */
    @Step("完成装货")
    public void confirmLoading(String orderNumber, String payPassword, String session) {
        sjbStockOrderService.assureorderSubmitLoadingComplete2(orderNumber, payPassword, session);
    }

    /**
     * 卸货签到
     *
     * @param orderNumber
     */
    @Step("卸货签到")
    public void unloadingSign(String orderNumber, String sessionID2) {
        JSONObject orderDetail = sjbStockOrderService.assureorderQueryDetail1(orderNumber, sessionID2);//查询运单详情
        JSONObject targetAddresses = orderDetail.getJSONObject("stockRspDTO").getJSONArray("targetaddresses").getJSONObject(0);
        sjbStockOrderService.assureorderSigninCreateUploading1(orderNumber, "/wyyt-image/2018/12/27/5169833204861753928.jpg", targetAddresses.getString("address"), targetAddresses.getString("zoneCode"), targetAddresses.getString("lon"), targetAddresses.getString("lat"), "2", "0", "0", sessionID2);
    }

    /**
     * 收单员签收(不亏吨)
     *
     * @param orderNumber
     */
    @Step("收单员签收")
    public void signIn(String orderNumber, String sessionID3) {
        JSONObject response1 = sjbToolService.webbusinessQuerySettingDetail1(orderNumber, null, sessionID3);
        String ruleCode = response1.getJSONArray("lineRules").getJSONObject(0).getString("ruleCode");

        //查询待签收运单
        JSONObject response2 = sjbToolService.webbusinessQueryAssureorderDetailSigninpart1(orderNumber, null, sessionID3);
        String stockUnit = response2.getString("stockunit");//货物重量+单位
        int stockUnitNum = response2.getInteger("stockunitnum");//货物重量
        String unitPrice = response2.getString("unitprice");//单价
        String stockKindMemo = response2.getString("stockkindmemo");//货物名称
        int stockCost = response2.getInteger("stockcost");//运单总价
        //判断有无卸货款
        //paynode 1装货 2卸货  payway 1 油卡 2 线上（现金） 3 线下  4 ETC
        //originalunit:实发，actualunit：实收,otherdeductions:其他扣款,unitprice:单价
        JSONObject data3 = new JSONObject();
        data3.put("originalunit", stockUnitNum);//实发重量
        data3.put("actualunit", stockUnitNum);//实收重量
        data3.put("otherdeductions", 0);//其他扣款
        data3.put("unitprice", stockKindMemo + "," + Integer.parseInt(StringUtils.getNumFromStr(unitPrice)) * 10000);//货物单价
        //计算运费
        JSONObject result = sjbToolService.webbusinessConsultCalculateResult1(orderNumber, ruleCode, data3.toString(), (stockCost / 10000) + "", stockUnitNum + "", unitPrice, sessionID3);
        //收单员签收
        String cashMoney;
        /*if (result.getInteger("resideneedpay") > 0) {
            cashMoney = result.getString("resideneedpay");
        } else {
            cashMoney = result.getString("resideallmoney");
        }*/
        cashMoney = result.getString("resideneedpay");
        sjbToolService.webbusinessLanuchAssureorderConsult1(orderNumber, null, "现场协商一致", "", "", "/wyyt-image/2018/12/27/5169833204861753928.jpg", data3.toString(), ruleCode, (stockCost / 10000) + "", stockUnitNum + "", unitPrice, "0", "0", cashMoney, "1", sessionID3);
    }

    /**
     * 收单员签收(支持亏吨)
     *
     * @param orderNumber
     */
    @Step("收单员签收")
    public void signIn(String orderNumber, int unit, String sessionID3) {
        JSONObject response1 = sjbToolService.webbusinessQuerySettingDetail1(orderNumber, null, sessionID3);
        String ruleCode = response1.getJSONArray("lineRules").getJSONObject(0).getString("ruleCode");

        //查询待签收运单
        JSONObject response2 = sjbToolService.webbusinessQueryAssureorderDetailSigninpart1(orderNumber, null, sessionID3);
        String stockUnit = response2.getString("stockunit");//货物重量+单位
        int stockUnitNum = response2.getInteger("stockunitnum");//货物重量
        String unitPrice = response2.getString("unitprice");//单价
        String stockKindMemo = response2.getString("stockkindmemo");//货物名称
        int stockCost = response2.getInteger("stockcost");//运单总价
        //判断有无卸货款
        //paynode 1装货 2卸货  payway 1 油卡 2 线上（现金） 3 线下  4 ETC
        //originalunit:实发，actualunit：实收,otherdeductions:其他扣款,unitprice:单价
        JSONObject data3 = new JSONObject();
        data3.put("originalunit", stockUnitNum);//实发重量
        data3.put("actualunit", stockUnitNum + unit);//实收重量
        data3.put("otherdeductions", 0);//其他扣款
        data3.put("unitprice", stockKindMemo + "," + Integer.parseInt(StringUtils.getNumFromStr(unitPrice)) * 10000);//货物单价
        //计算运费
        JSONObject result = sjbToolService.webbusinessConsultCalculateResult1(orderNumber, ruleCode, data3.toString(), (stockCost / 10000) + "", stockUnitNum + "", unitPrice, sessionID3);
        //收单员签收
        String cashMoney;
        /*if (result.getInteger("resideneedpay") > 0) {
            cashMoney = result.getString("resideneedpay");
        } else {
            cashMoney = result.getString("resideallmoney");
        }*/
        cashMoney = result.getString("resideneedpay");
        sjbToolService.webbusinessLanuchAssureorderConsult1(orderNumber, null, "现场协商一致", "", "", "/wyyt-image/2018/12/27/5169833204861753928.jpg", data3.toString(), ruleCode, (stockCost / 10000) + "", stockUnitNum + "", unitPrice, "0", "0", cashMoney, "1", sessionID3);
    }

    /**
     * 企业复核
     *
     * @param orderNumber
     * @param passOrNo
     */
    @Step("企业复核")
    public void companyOrderCheck(String orderNumber, boolean passOrNo, String sessionID1) {
        if (passOrNo) {
            sjbStockOrderService.assureorderOrdercheckBatchPass1(orderNumber, "123456", sessionID1);
        } else {
            sjbStockOrderService.assureorderOrdercheckBatchNotpass1(orderNumber, "企业审核不让你通过啊", sessionID1);
        }
    }

    @Step("企业复核")
    public JSONObject companyOrderCheck2(String orderNumber, boolean passOrNo, String password, String sessionID1) {
        if (passOrNo) {
            return sjbStockOrderService.assureorderOrdercheckBatchPass1(orderNumber, password, sessionID1);
        } else {
            return sjbStockOrderService.assureorderOrdercheckBatchNotpass1(orderNumber, "企业审核不让你通过啊", sessionID1);
        }
    }

    @Step("取消订单")
    public void cancelStockOrder(String orderNumber, String sessionID1, String sessionID2) throws InterruptedException {
        Thread.sleep(2000);
        //企业取消
        JSONObject response = sjbStockOrderService.assureorderCancelQueryDetail2(orderNumber, sessionID1);
        sjbStockOrderService.assureorderCancelSubmit2(orderNumber, response.getString("maxRefundMoney"), "车辆故障，无法抵达", "", "0", null, sessionID1);
        //司机同意取消
        JSONObject response2 = sjbStockOrderService.assureorderCancelQueryDetail1(orderNumber, sessionID2);
        sjbStockOrderService.assureorderCancelDeal1(response2.getString("cancelAssureOrderCode"), "3", orderNumber, sessionID2);
    }

    @Step("取消订单")
    public void cancelStockOrder(String orderNumber, String money, String sessionID1, String sessionID2) throws InterruptedException {
        Thread.sleep(2000);
        //企业取消
        JSONObject response = sjbStockOrderService.assureorderCancelQueryDetail2(orderNumber, sessionID1);
        sjbStockOrderService.assureorderCancelSubmit2(orderNumber, response.getString("maxRefundMoney"), "车辆故障，无法抵达", "", money, null, sessionID1);
        Thread.sleep(2000);
        JSONObject response3 = sjbStockOrderService.assureorderConsultQuery2(orderNumber, sessionID2);
        if (response3.getString("data") == null) {
            //直接取消
            JSONObject response2 = sjbStockOrderService.assureorderCancelQueryDetail1(orderNumber, sessionID2);
            sjbStockOrderService.assureorderCancelDeal1(response2.getString("cancelAssureOrderCode"), "3", orderNumber, sessionID2);
        } else {
            /*String oilmoney = response3.getJSONObject("incomeResultDto").getString("oilmoney");
            String cashmoney = response3.getJSONObject("incomeResultDto").getString("cashmoney");
            String etcmoney = response3.getJSONObject("incomeResultDto").getString("etcmoney");
            String consultRecordCode = response3.getString("consultRecordCode");
            //查询合同
            String contractnum = sjbFinanceService.supplyPaysolutionContract1(orderNumber, null, cashmoney, etcmoney, oilmoney, sessionID2).getString("contractnum");
            //取消
            sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "", "1", "1", contractnum, orderNumber, sessionID2);*/
        }
    }

    /**
     * 同意扣款协商
     *
     * @param orderNumber
     * @param sessionID2
     */
    public void kouKuanXs(String orderNumber, String sessionID2) {
        JSONObject response3 = sjbStockOrderService.assureorderConsultQuery2(orderNumber, sessionID2);
        String oilmoney = response3.getJSONObject("incomeResultDto").getString("oilmoney");
        String cashmoney = response3.getJSONObject("incomeResultDto").getString("cashmoney");
        String etcmoney = response3.getJSONObject("incomeResultDto").getString("etcmoney");
        String consultRecordCode = response3.getString("consultRecordCode");

        sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "1", "3", "0", null, orderNumber, sessionID2);

        //查询合同
        JSONObject res = sjbFinanceService.supplyPaysolutionContract1(orderNumber, null, cashmoney, etcmoney, oilmoney, sessionID2);
        String contractnum = res.getString("contractnum");
        String html = res.getString("html");
        try {
            Jsoup.connect(html).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //new BaseCall(html,"GET").addDefHeader().callService().close();

        //同意
        //sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "","3","0",contractnum, orderNumber, sessionID2);
        //sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "1","3","0",contractnum, orderNumber, sessionID2);

        sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "1", "3", "1", contractnum, orderNumber, sessionID2);


    }

    /**
     * 取消订单
     *
     * @param orderNo
     * @throws SQLException
     */
    @Step("取消订单")
    public void cancelStockOrder(String orderNo) throws SQLException {
        String sql = String.format("UPDATE assure_orders SET dynamic_state = '12' WHERE order_number ='%s'", orderNo);
        dbHelper.execSql(dbHelper.plateform_test, sql);
    }

    @Step("账期还款批量")
    public Boolean huankuanBatch(String phone, String password, String payPasssword) {
        String sessionID1 = accountService.accountLogin1(phone, password, "2", "true", "").getString("sessionID");
        //已逾期
        JSONObject response1 = sjbFinanceService.queryAccPeriodPayWaitingList1("1", "0", "100", "0", "0", null, null, null, null, null, sessionID1);
        //未逾期
        JSONObject response2 = sjbFinanceService.queryAccPeriodPayWaitingList1("2", "0", "100", "0", "0", null, null, null, null, null, sessionID1);

        String orders = "";
        JSONArray list1 = response1.getJSONArray("list");
        JSONArray list2 = response2.getJSONArray("list");

        Iterator iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            JSONObject object = (JSONObject) iterator1.next();
            orders += object.getString("orderNumber") + ",";
        }

        Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            JSONObject object = (JSONObject) iterator2.next();
            orders += object.getString("orderNumber");
        }
        if (orders.length() > 0) {
            JSONObject response = sjbFinanceService.accPeriodPaySubmit2(orders, payPasssword, sessionID1);
            if (response.toJSONString().contains("业务逻辑出错")) {
                return true;
            }
        } else {
            log.info("没有需要还款的订单");
        }


        //sjbFinanceService.getAccPeriodPayDetail1("", sessionID1);


        return false;
    }

    @Step("账期还款单条")
    public Boolean huankuan(String phone, String password, String orderNo, String payPasssword) {
        String sessionID1 = accountService.accountLogin1(phone, password, "2", "true", "").getString("sessionID");

        //sjbFinanceService.getAccPeriodPayDetail1("", sessionID1);
        JSONObject response = sjbFinanceService.accPeriodPaySubmit2(orderNo, payPasssword, sessionID1);
        if (response.toJSONString().contains("业务逻辑出错")) {
            return true;
        }
        return false;
    }

    @Step("开户")
    public void companyOpenEbank(String codeo, String acctNoo, String acctido, String entcert_Code) {
        String str = financialService.formOpenEbank(codeo, acctNoo, acctido);
        org.jsoup.nodes.Document doc = Jsoup.parse(str);
        String id = doc.getElementById("id").val();
        String acctId = doc.getElementById("acctId").val();
        String status = doc.getElementById("status").val();
        String code = doc.getElementById("code").val();
        String agentType = doc.getElementById("agentType").val();
        String isSjbUser = doc.getElementById("isSjbUser").val();
        String agentId = doc.getElementById("agentId").val();
        String tradeType = doc.getElementById("tradeType").val();
        String email = doc.getElementById("email").val();
        String isOutBank = doc.getElementById("isOutBank").val();
        String payBankCode = doc.getElementById("payBankCode").val();
        String clearAcctType = doc.getElementById("clearAcctType").val();
        String agentCode = doc.getElementById("agentCode").val();
        String agentName = doc.getElementById("agentName").val();
        String acctNo = doc.getElementById("acctNo").val();
        String chlType = "0";// doc.getElementById("chlType").val(); 3:华夏直连 1华夏 0,2 华夏直连 4
        String entcertType = "17";// doc.getElementById("entcertType").val();17 华夏直连
        String entcertCode = entcert_Code;// doc.getElementById("entcertCode").val();
        String entcertValidDate = doc.getElementById("entcertValidDate").val();
        String legalName = doc.getElementById("legalName").val();
        String legalCertCode = doc.getElementById("legalCertCode").val();
        String legalCertValidDate = doc.getElementById("legalCertValidDate").val();
        String legalTel = doc.getElementById("legalTel").val();
        String legalMobile = doc.getElementById("legalMobile").val();
        String legalAddress = doc.getElementById("legalAddress").val();
        String clearBankShortName = "ICBC";// doc.getElementById("tradeCompanyId").val();
        String clearBankName = "中国工商银行";// doc.getElementById("tradeCompanyName").val();
        String clearAcctName = doc.getElementById("clearAcctName").val();
        String clearAcct = doc.getElementById("clearAcct").val();
        String eacctNo = doc.getElementById("eacctNo").val();
        String eacctName = doc.getElementById("eacctName").val();
        String payBankName = doc.getElementById("payBankName").val();
        String result = financialService.openEbank(id, acctId, status, code, agentType, isSjbUser, agentId, tradeType, email, isOutBank, payBankCode, clearAcctType,
                agentCode, agentName, acctNo, chlType, entcertType, entcertCode, entcertValidDate, legalName, legalCertCode, legalCertValidDate, legalTel,
                legalMobile, legalAddress, clearBankShortName, clearBankName, clearAcctName, clearAcct, eacctNo, eacctName, payBankName);
        System.out.println("测试金融返回AAAAAAAAAAAAAAAAAAA" + result + "/r/n");
    }

    /**
     * 服务信息配置
     *
     * @param certifyCode
     * @param companyCode
     * @param holderCode
     */
    public void serviceInformation(String certifyCode, String companyCode, String holderCode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rateList[1].rateType", "1");
        map.put("rateList[1].isCharge", "1");
        map.put("rateList[1].chooseWayType", "0");
        map.put("rateList[1].rateAmount", "7");
        map.put("rateList[1].temp", "2");
        map.put("rateList[2].rateType", "2");
        map.put("rateList[2].isCharge", "0");
        map.put("rateList[2].chooseWayType", "0");
        map.put("rateList[2].rateAmount", "0");
        map.put("rateList[2].temp", "0");
        map.put("rateList[3].rateType", "3");
        map.put("rateList[3].isCharge", "0");
        map.put("rateList[3].chooseWayType", "0");
        map.put("rateList[3].rateAmount", "0");
        map.put("rateList[3].temp", "0");
        map.put("rateList[4].rateType", "4");
        map.put("rateList[4].isCharge", "1");
        map.put("rateList[4].chooseWayType", "0");
        map.put("rateList[4].rateAmount", "6");
        map.put("rateList[4].temp", "1");
        map.put("rateList[5].rateType", "5");
        map.put("rateList[5].isCharge", "0");
        map.put("rateList[5].chooseWayType", "0");
        map.put("rateList[5].rateAmount", "0");
        map.put("rateList[5].temp", "0");

        String result = bamsServices.servicesCompanyAdd(certifyCode, companyCode, holderCode, map);

        System.out.println("返回：" + result);
    }

    public void ToExamineservicesCompanyAdd(String certifyCode, String companyCode, String holderCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rateList[1].rateType", "1");
        map.put("rateList[2].rateType", "2");
        map.put("rateList[3].rateType", "3");
        map.put("rateList[4].rateType", "4");
        map.put("rateList[5].rateType", "5");

        String id = "";
        ResultSet listObj = dbHelper.execSqlQuery(dbHelper.bams, "SELECT * FROM bams_fin_service_info bfsi WHERE bfsi.holder_code = '" + holderCode + "' AND bfsi.company_code='" + companyCode + "' AND bfsi.certify_code='" + certifyCode + "'");
        while (listObj.next()) {
            id = listObj.getString("id");
            break;
        }
        String result = bamsServices.ToExamineservicesCompanyAdd(id, certifyCode, companyCode, holderCode, map);
        System.out.println("返回：" + result);
    }

    public void accountInformation(String certifyCode, String companyCode, String holderCode) {
        String isPaymentDays = "1";
        String paymentDays = "2";
        String paymentLimit = "1000000";
        String paymentDaysAutoRepay = "0";
        String isChangeOilEle = "1";
        String isDianrPaymentDays = "2";
        String dianrPaymentDays = "10";
        String result = bamsServices.accountInformationAdd(certifyCode, companyCode, holderCode, isPaymentDays, paymentDays, paymentLimit, paymentDaysAutoRepay, isChangeOilEle, isDianrPaymentDays, dianrPaymentDays);
        System.out.println("返回：" + result);
    }

    public void ToExamineaccountInformationAdd(String certifyCode, String companyCode, String holderCode) throws Exception {
        String id = "";
        System.out.println("SQL语句：" + "SELECT * FROM bams_ac_cust_info baci WHERE baci.holder_code = '" + holderCode + "' AND baci.company_code='" + companyCode + "' AND baci.certify_code='" + certifyCode + "'");
        ResultSet listObj = dbHelper.execSqlQuery(dbHelper.bams, "SELECT * FROM bams_ac_cust_info baci WHERE baci.holder_code = '" + holderCode + "' AND baci.company_code='" + companyCode + "' AND baci.certify_code='" + certifyCode + "'");
        while (listObj.next()) {
            id = listObj.getString("id");
            break;
        }
        String result = bamsServices.ToExamineaccountInformationAdd(id, certifyCode, companyCode, holderCode);
        System.out.println("返回：" + result);
    }

    public void subscriptionInformation(String certifyCode, String companyCode, String holderCode, String legal_Name, String entcert_Code) {
        String entcertType = "17";
        String entcertCode = entcert_Code;
        String entcertValidDate = "20501230";
        String legalName = legal_Name;
        String legalCertCode = "412723199506047335";
        String legalCertValidDate = "20501230";
        String legalTel = "15104968337";
        String legalMobile = "";
        String email = "dc366ad240734394a4dae333137b5d2c@iwuliu.com";
        String legalAddress = "";
        String clearBankShortName = "ICBC";
        String clearBankName = "中国工商银行";
        String clearAcctName = "";
        String clearAcct = "";

        String result = bamsServices.subscriptionInformationAdd(certifyCode, companyCode, holderCode, entcertType, entcertCode, entcertValidDate, legalName, legalCertCode, legalCertValidDate, legalTel, legalMobile, email, legalAddress, clearBankShortName, clearBankName, clearAcctName, clearAcct);
        System.out.println("返回：" + result);
    }

    public void ToExaminesubscriptionInformationAdd(String certifyCode, String companyCode, String holderCode) throws Exception {
        String id = "";
        System.out.println("SQL语句：" + "SELECT * FROM bams_fin_open_ebank_apply baci WHERE baci.holder_code = '" + holderCode + "' AND baci.company_code='" + companyCode + "' AND baci.certify_code='" + certifyCode + "'");
        ResultSet listObj = dbHelper.execSqlQuery(dbHelper.bams, "SELECT * FROM bams_fin_open_ebank_apply baci WHERE baci.holder_code = '" + holderCode + "' AND baci.company_code='" + companyCode + "' AND baci.certify_code='" + certifyCode + "'");
        while (listObj.next()) {
            id = listObj.getString("id");
            break;
        }
        String result = bamsServices.ToExaminesubscriptionInformationAdd(id, certifyCode, companyCode, holderCode);
        System.out.println("返回：" + result);
    }

    /**
     * 业务模式配置
     *
     * @param enterpriseNature 0 一般企业 1 煤炭 2 渣土
     * @param certifyCode
     * @param companyCode
     * @param holderCode
     * @param controlFlag      0-冻结 1-预付
     */
    public void businessInformation(String enterpriseNature, String certifyCode, String companyCode, String holderCode, String controlFlag) {
        //String enterpriseNature = "1";   //0 一般企业 1 煤炭 2 渣土
        String stockCostLimit = "20000";
        String realMoneyIncreaseAstrict = "0";
        String realUnitMoneyIncreaseAstrict = "0";
        String supportDdStockPub = "1";
        String supportInStockPub = "1";
        String supportAgentStockPub = "1";
        String supportTaskOrder = "0";
        String checkType = "0";
        String supportDeliveryPricing = "0";
        String signInRadius = "50000000";
        String oilLimit = "30";
        String etcLimit = "30";
        String isGetFraction = "0";
        String isGetCheckforfee = "0";
        String companyControlFlag1 = "1";
        String companyControlFlag2 = "0";
        String withholdingRatio = "30";
        String companyControlFlag3 = "0";
        String companyControlFlag4 = "0";
        String companyControlFlag5 = controlFlag;

        String result = bamsServices.businessInformationAdd(certifyCode, companyCode, holderCode, enterpriseNature, stockCostLimit, realMoneyIncreaseAstrict,
                realUnitMoneyIncreaseAstrict, supportDdStockPub, supportInStockPub, supportAgentStockPub, supportTaskOrder, checkType, supportDeliveryPricing,
                signInRadius, oilLimit, etcLimit, isGetFraction, isGetCheckforfee, companyControlFlag1, companyControlFlag2, withholdingRatio, companyControlFlag3, companyControlFlag4, companyControlFlag5);
        System.out.println("返回：" + result);
    }

    public void ToExaminebusinessInformationAdd(String certifyCode, String companyCode, String holderCode) throws Exception {
        String id = "";
        System.out.println("SQL语句：" + "SELECT * FROM bams_company_common_config bccc WHERE bccc.holder_code = '" + holderCode + "' AND bccc.company_code='" + companyCode + "' AND bccc.certify_code='" + certifyCode + "'");
        ResultSet listObj = dbHelper.execSqlQuery(dbHelper.bams, "SELECT * FROM bams_company_common_config bccc WHERE bccc.holder_code = '" + holderCode + "' AND bccc.company_code='" + companyCode + "' AND bccc.certify_code='" + certifyCode + "'");
        while (listObj.next()) {
            id = listObj.getString("id");
            break;
        }
        String result = bamsServices.ToExaminebusinessInformationAdd(id, certifyCode, companyCode, holderCode);
        System.out.println("返回：" + result);
    }

    public void formulaInformation(String companyCode, String companyName) {
        //String str = bamsServices.formulaInformationDetaile(companyCode, companyName);
        //org.jsoup.nodes.Document doc = Jsoup.parse(str);

        String isReview = "";
        String formulaName = "公式十六";
        String formulaCompanyName = "提出公式企业未记录";
        String formulaCompanyCode = "1111";
        String remarks = "20170712创建";
        String className = "com.sijibao.computational.formula.sixteenfunction.impl.SixteenFunction";
        String memo = "其他扣款";
        String status = "0";
        String remark = "";

        String strSql = "constantParam: [{\"name\":\"对账费\",\"key\":\"checkforfee\",\"dataType\":2,\"desc\":\"卸货点对账费\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":10},{\"name\":\"亏吨煤价上浮\",\"key\":\"floatingfee\",\"dataType\":2,\"desc\":\"价格上浮值\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":12},{\"name\":\"亏吨容忍值\",\"key\":\"effectivetonerror\",\"dataType\":3,\"desc\":\"允许运输损失的吨位\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"吨\",\"sortIndex\":11},{\"name\":\"抹零\",\"key\":\"freightprecisionrule\",\"dataType\":1,\"desc\":\"抹零规则\",\"isHidden\":false,\"inputType\":2,\"map\":{\"无\":0,\"取整\":3,\"5元以下\":1,\"10元以下\":2},\"unitName\":\"\",\"sortIndex\":20}]\n" +
                "variableParam: [{\"name\":\"实收数量\",\"key\":\"actualunit\",\"dataType\":3,\"desc\":\"司机卸货的煤的吨位数\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"吨\",\"sortIndex\":11},{\"name\":\"实发数量\",\"key\":\"originalunit\",\"dataType\":3,\"desc\":\"司机装货的煤的吨位数\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"吨\",\"sortIndex\":10},{\"name\":\"货物单价\",\"key\":\"unitprice\",\"dataType\":4,\"desc\":\"卸货时确认的煤价\",\"isHidden\":false,\"inputType\":2,\"map\":{},\"unitName\":\"元/吨\",\"sortIndex\":12},{\"name\":\"其它扣款\",\"key\":\"otherdeductions\",\"dataType\":2,\"desc\":\"其它扣款\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":13}]\n" +
                "resultParam: [{\"name\":\"应付运费\",\"key\":\"needpay\",\"dataType\":4,\"desc\":\"卸货应付运费\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":10},{\"name\":\"亏吨费\",\"key\":\"damagefee\",\"dataType\":4,\"desc\":\"吨位损失扣除费用\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":11},{\"name\":\"对账费\",\"key\":\"checkforfee\",\"dataType\":4,\"desc\":\"对账扣除费用\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":12},{\"name\":\"抹零\",\"key\":\"lostzerofee\",\"dataType\":4,\"desc\":\"计算规则抹零\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":13},{\"name\":\"其它扣减\",\"key\":\"otherdeductions\",\"dataType\":4,\"desc\":\"其它扣减\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":14},{\"name\":\"应付款\",\"key\":\"realpay\",\"dataType\":4,\"desc\":\"最后实际付款运费\",\"isHidden\":false,\"inputType\":1,\"unitName\":\"元\",\"sortIndex\":20}]";

        String result = bamsServices.formulaInformationAdd(companyCode, companyName, isReview, formulaName, formulaCompanyName, formulaCompanyCode, remarks, className, memo, status, remark, strSql);
        System.out.println("返回：" + result);
    }

    public void ToExamineformulaInformationAdd(String companyCode, String companyName) throws Exception {
        String id = "";
        System.out.println("SQL语句：" + "SELECT * FROM bams_order_formula bfsr WHERE bfsr.company_code = '" + companyCode + "'");
        ResultSet listObj = dbHelper.execSqlQuery(dbHelper.bams, "SELECT * FROM bams_order_formula bfsr WHERE bfsr.company_code = '" + companyCode + "'");
        while (listObj.next()) {
            id = listObj.getString("id");
            break;
        }
        String result = bamsServices.ToExamineformulaInformationAdd(id, companyCode, companyName);
        System.out.println("返回：" + result);
    }

    /**
     * 注册企业
     *
     * @param enterpriseNature 0 一般企业 1 煤炭 2 渣土
     * @param controlFlag      0-冻结 1-预付
     * @throws Exception
     */
    @Step("注册企业")
    public JSONObject registerCompany(String enterpriseNature, String controlFlag) throws Exception {
        JSONObject res = new JSONObject();
        try {
            log.info("生成基本信息");
            //注册的企业手机号
            String compay_phone = RandomUtils.getTel();
            //企业收单员A
            String people_A_Tel = RandomUtils.getTel();
            String people_A_Name = RandomUtils.getChineseName();
            //企业收单员B
            String people_B_Tel = RandomUtils.getTel();
            String people_B_Name = RandomUtils.getChineseName();
            log.info("手机号添加黑名单");
            JSONObject response = sjbOperationService.messageMobileBlacklistAdd1(compay_phone, "自动化测试");
            if (!response.getBoolean("state")){
                throw new Exception("添加黑名单失败");
            }
            sjbOperationService.messageMobileBlacklistAdd1(people_A_Tel, "自动化测试");
            sjbOperationService.messageMobileBlacklistAdd1(people_B_Tel, "自动化测试");

            //注册企业
            String entcert_Code = "XYZZH" + RandomUtils.getNum(1000000, 9999999);
            String companyname = "测试企业" + RandomUtils.getTime();
            log.info("注册企业:" + companyname);
            response = accountService.accountCompanyRegister1(compay_phone, "123456", companyname, "image/2018/12/27/8162171377188807206.jpg", "方俊生", "");
            String company_session = response.getString("sessionID");//企业session

            String company_code2 = response.getString("userCode");//userCode
            //查询企业信息
            JSONObject response2 = sjbAllService.companyQuery1(company_session);
            log.info("提交审核资料");
            JSONObject response3 = sjbAllService.companyCertify1(response2.getJSONObject("company").getString("companyCode"), companyname, entcert_Code, "方俊", "412723199506047335", "/wyyt-image/2018/12/28/888681722831506254.jpg", "/wyyt-image/2018/12/28/888681722831506254.jpg", "/wyyt-image/2018/12/28/888681722831506254.jpg", "/wyyt-image/2018/12/28/888681722831506254.jpg", company_session);
            Thread.sleep(2000);
            //运营平台审核
            log.info("运营平台审核");
            String response4 = sjbOperationService.companycertifyCertifyNew1("1", "", response2.getJSONObject("certifyData").getString("certifyCode"));
            log.info("金融平台签约");
            JSONObject resqiyeqb = sjbFinanceService.accountDetailQuery1(company_session);
            String certifyCode = response2.getJSONObject("certifyData").getString("certifyCode");
            companyOpenEbank(resqiyeqb.getJSONObject("walletaccount").getString("holdercode"), resqiyeqb.getJSONObject("walletaccount").getString("walletaccountid"), certifyCode, entcert_Code);
            String companyCode = response2.getJSONObject("company").getString("companyCode");
            String holderCode = response2.getJSONObject("certifyData").getString("holderCode");

            log.info("运营平台企业参数设置");
            //企业服务信息配置
            serviceInformation(certifyCode, companyCode, holderCode);
            //企业账期信息配置
            accountInformation(certifyCode, companyCode, holderCode);
            //企业签约信息配置
            subscriptionInformation(certifyCode, companyCode, holderCode, "方俊", entcert_Code);
            //企业业务模式配置
            businessInformation(enterpriseNature, certifyCode, companyCode, holderCode, controlFlag);
            //企业公式关联配置
            formulaInformation(companyCode, response2.getJSONObject("company").getString("companyName"));

            log.info("运营平台企业参数审核");
            Thread.sleep(2000);
            //审核服务信息配置
            ToExamineservicesCompanyAdd(certifyCode, companyCode, holderCode);
            //审核账期信息配置
            ToExamineaccountInformationAdd(certifyCode, companyCode, holderCode);
            //审核签约信息配置
            ToExaminesubscriptionInformationAdd(certifyCode, companyCode, holderCode);
            //审核业务模式配置
            ToExaminebusinessInformationAdd(certifyCode, companyCode, holderCode);
            //审核公式关联配置
            ToExamineformulaInformationAdd(companyCode, response2.getJSONObject("company").getString("companyName"));

            log.info("运营平台企业参数上线");
            Thread.sleep(1000);
            //审核企业完成上线
            bamsServices.configReviewInfoonline(certifyCode, companyCode, holderCode);

            log.info("企业收单规则添加");
            //企业添加收单规则
            response = accountService.accountCompanyLogin1(compay_phone, "123456", "2", "true", "");
            company_session = JsonPath.parse(response).read("$.user.sessionID");
            sjbToolService.coalRuleOperationSubmit1("", "公式十六", "{\"checkforfee\":100000,\"effectivetonerror\":0.5,\"floatingfee\":3000,\"freightprecisionrule\":1}", "9695780bfa1f44d499348ac35f6199b4", company_session);
            if (enterpriseNature.equals("1")) {
                sjbToolService.coalPriceCreateorupdate1("", "煤炭", "100000", company_session);
            } else {
                sjbToolService.coalPriceCreateorupdate1("", "渣土", "100000", company_session);
            }
            log.info("添加收单点");
            String recipientInfos = people_A_Name + "@" + people_A_Tel + "," + people_B_Name + "@" + people_B_Tel;
            JSONObject responseRules = sjbToolService.coalReceiveRuleQueryList1(company_session);
            sjbToolService.coalSiteCreateorupdate2("", "收单点", "", recipientInfos, responseRules.getJSONArray("rules").getJSONObject(0).getString("ruleCode"), company_session);
            restSdyPassword(people_A_Tel);
            restSdyPassword(people_B_Tel);
            log.info("企业添加常用地址");
            JSONObject responseCITY = ropservice.cloadlbsParserlocation1("114.429231", "30.460185", "2", null, company_session);
            ropservice.addressCreate1("114.429231", "30.460185", "测试装货地", "1", responseCITY.getString("countyCode"), responseCITY.getString("county"), companyCode, response2.getJSONObject("company").getString("companyName"), people_A_Name, people_A_Tel,
                    responseCITY.getString("address"), "2", "", "", responseCITY.getString("indexCode"), responseCITY.getString("province"), responseCITY.getString("provinceCode"), responseCITY.getString("city"), responseCITY.getString("cityCode"),
                    responseCITY.getString("street"), responseCITY.getString("streetNO"), company_session);

            responseCITY = ropservice.cloadlbsParserlocation1("120.38", "36.07", "2", null, company_session);
            ropservice.addressCreate1("114.429231", "30.460185", "测试卸货地", "1", responseCITY.getString("countyCode"), responseCITY.getString("county"), companyCode, response2.getJSONObject("company").getString("companyName"), people_B_Name, people_B_Tel,
                    responseCITY.getString("address"), "2", "", "", responseCITY.getString("indexCode"), responseCITY.getString("province"), responseCITY.getString("provinceCode"), responseCITY.getString("city"), responseCITY.getString("cityCode"),
                    responseCITY.getString("street"), responseCITY.getString("streetNO"), company_session);

            log.info("企业支付密码设置");
            sjbFinanceService.accountPasswordReset1("123456", company_session);
            log.info("企业充钱1000000");
            financialService.maintain(compay_phone, "2", "1000000");
            log.info("添加经纪人");
            String agentCode = sjbWebService.agentSearch1(null, "17600001294", "0", "20", companyCode, company_session).getJSONArray("list").getJSONObject(0).getString("usercode");
            sjbWebService.companyAddAgent1(agentCode, company_code2, company_session);
            agentCode = sjbWebService.agentSearch1(null, "17600008191", "0", "20", companyCode, company_session).getJSONArray("list").getJSONObject(0).getString("usercode");
            sjbWebService.companyAddAgent1(agentCode, company_code2, company_session);
            agentCode = sjbWebService.agentSearch1(null, "17600001389", "0", "20", companyCode, company_session).getJSONArray("list").getJSONObject(0).getString("usercode");
            sjbWebService.companyAddAgent1(agentCode, company_code2, company_session);
            log.info("设置开票信息");
            sjbStockOrderService.waybillInvoiceAdd1(companyname, entcert_Code, "金融港A3", "", compay_phone, "招商银行", "6225882138255259", "方俊",
                    compay_phone, "cs@sijibao.com", "13", "130100", null, "河北省", "石家庄市", null, "金融港", company_session);

            if (controlFlag.equals("1")) {
                log.info("企业类型:预付");
            } else {
                log.info("企业类型:冻结");
            }
            log.info("企业名称:" + companyname);
            log.info("企业手机号:" + compay_phone);
            log.info("收单员手机号:" + people_A_Tel + ";" + people_B_Tel);
            res.put("companyPhone", compay_phone);
            res.put("sdyPhone1", people_A_Tel);
            res.put("sdyPhone2", people_B_Tel);
        } catch (Exception e) {
            res.put("eMsg", e.getMessage());
        }
        return res;
    }

    /**
     * 重置收单员登录密码
     *
     * @param phone
     */
    public void restSdyPassword(String phone) {
        sjbToolService.webMobilePasswordSms1(phone, null);
        String verifycode = bamsServices.queryMsgCodeByPhone(phone);
        sjbToolService.webMobileLoginSetpassword1(phone, "123456", verifycode, null);
    }

    /**
     * 企业增加经纪人
     *
     * @param phone
     * @param password
     * @param agentPhone
     */
    public void addAgent(String phone, String password, String agentPhone) {
        //企业登录
        JSONObject response = accountService.accountLogin1(phone, password, "2", "true", "");
        String sessionID = response.getString("sessionID");
        String userCode = response.getString("userCode");
        String agentCode = sjbWebService.agentSearch1(null, agentPhone, "0", "20", userCode, sessionID).getJSONArray("list").getJSONObject(0).getString("usercode");
        sjbWebService.companyAddAgent1(agentCode, userCode, sessionID);
    }

    /**
     * 判断身份证有无被使用
     *
     * @param db
     * @param idCode
     * @return
     */
    @Step("判断身份证有无被使用")
    public boolean checkIDCardIsUsed(DBHelper db, String idCode) {
        int size = db.execSqlQuery(db.plateform_test, String.format("SELECT * FROM `driver_certification` WHERE id_code = '%s'", idCode), "user_code").size();
        return size == 0 ? true : false;
    }

    @Step("关闭")
    public void close() throws JSchException {
        bamsServices.close();
    }

    @Step("注册司机")
    public JSONObject driverRegister(String phone, String userName, String idCode) {

        JSONObject res = new JSONObject();
        try{
            //添加黑名单
            log.info("注册司机手机号加入黑名单");
            JSONObject response = sjbOperationService.messageMobileBlacklistAdd1(phone, "批量注册的司机");
            if (!response.getBoolean("state")){
                throw new Exception("添加黑名单失败");
            }
            log.info("注册司机发送短信");
            accountService.accountSmsRegister2("1", phone, "");
            Thread.sleep(2000);
            ///查询验证码
            String verifycode = bamsServices.queryMsgCodeByPhone(phone);
            //注册
            response = accountService.accountDriverRegister3(phone, "123456", verifycode, "");
            //提交认证
            sjbAllService.driverFirstFastCertify1("/wyyt-image/2019/04/14/935172417460054252.jpg", userName, idCode, "/wyyt-image/2019/04/14/935172417460054252.jpg", "/wyyt-image/2019/04/14/935172417460054252.jpg", "/wyyt-image/2019/04/14/935172417460054252.jpg", "沪C" + RandomUtils.getNum(10000, 99999), "/wyyt-image/2019/04/14/935172417460054252.jpg", response.getString("sessionID"));

            //车辆审核
            JSONObject response2 = sjbAllService.driverQueryCertifyVehiclelist1(response.getString("sessionID"));

            String certifyCode = response2.getJSONObject("driverCertify").getString("certifyCode");
            //车辆认证
            String vehicleid = response2.getJSONArray("vehicleList").getJSONObject(0).getString("id");

            sjbOperationService.driverCertifyVehicleaudit1(vehicleid, "4", "认证通过");
            //更新认证司机
            sjbOperationService.driverCertificationNew1(response.getString("userCode"), "1", "认证通过了", certifyCode);

        }catch (Exception e){
            log.error("注册司机报错");
            log.error(e.getMessage());
            res.put("eMsg", e.getMessage());
        }
        return res;
    }


    /**
     * 接单
     *
     * @param stockCode  货源码
     * @param agentCode  经纪人
     * @param password   支付密码
     * @param sessionID1 企业回话
     * @param sessionID2 司机回话
     * @param sessionID3 收单员回话
     */
    public void order(String stockCode, String agentCode, String password, String sessionID1, String sessionID2, String sessionID3) throws InterruptedException {
        //接单
        String orderNo = "";
        JSONObject response = assureorderCreate2(stockCode, agentCode, sessionID2);
        orderNo = response.getString("orderNumber");
        if (orderNo.length() == 0) {
            return;
        }
        //待卸货签到
        checkOrderState(orderNo, "卸货地签到", sessionID1, sessionID2);
        unloadingSign(orderNo, sessionID2);
        //签收
        checkOrderState(orderNo, "客户签收", sessionID1, sessionID2);
        signIn(orderNo, sessionID3);
        //复核
        checkOrderState(orderNo, "企业复核", sessionID1, sessionID2);
        companyOrderCheck2(orderNo, true, password, sessionID1);
    }

    /**
     * 对外服务
     *
     * @param stockCode  货源编号
     * @param agentCode
     * @param password   支付密码
     * @param deficit    亏吨
     * @param sessionID1 企业session
     * @param sessionID2 司机session
     * @param sessionID3 收单员session
     * @throws InterruptedException
     */
    public JSONObject order2(String stockCode, String agentCode, String password, int deficit, String sessionID1, String sessionID2, String sessionID3) throws InterruptedException {
        //接单
        String orderNo = "";
        JSONObject res = new JSONObject();
        Boolean status = false;
        String eMsg = "";
        try {
            JSONObject response = assureorderCreate2(stockCode, agentCode, sessionID2);
            orderNo = response.getString("orderNumber");
            if (orderNo.length() == 0) {
                return res;
            }
            //待卸货签到
            checkOrderState(orderNo, "卸货地签到", sessionID1, sessionID2);
            unloadingSign(orderNo, sessionID2);
            //签收
            checkOrderState(orderNo, "客户签收", sessionID1, sessionID2);
            signIn(orderNo, deficit, sessionID3);
            //复核
            checkOrderState(orderNo, "企业复核", sessionID1, sessionID2);
            companyOrderCheck2(orderNo, true, password, sessionID1);
            status = true;
        } catch (Exception e) {
            //e.printStackTrace();
            eMsg = e.getMessage();
        }
        res.put("errorMsg", eMsg);
        res.put("orderNo", orderNo);
        res.put("status", status);
        return res;
    }

    @Step("重置经纪人密码")
    public void restAgentPassword(String phone) {
        //忘记密码发送短信
        accountService.accountSmsForgetPassword2(null, phone, null);
        //查询验证码
        String verifycode = bamsServices.queryMsgCodeByPhone(phone);
        //验证验证码
        accountService.accountSmsCheckForgetPassword1(phone, verifycode, null);
        //重置密码
        accountService.accountPasswordReset1(phone, "123456", null, null);

    }

    @Step("新增开票信息")
    public void addBill(String phone) {
        //企业登录
        JSONObject object = accountService.accountLogin1(phone, "123456", "2", "true", "");
        String sessionID1 = JsonPath.parse(object).read("$.sessionID");
        //String userCode = JsonPath.parse(object).read("$.userCode");

        JSONObject response = sjbAllService.companyQuery1(sessionID1);
        String companyName = JsonPath.parse(response).read("$.company.companyName");
        String yyzCode = JsonPath.parse(response).read("$.certifyData.yyzCode");
        sjbStockOrderService.waybillInvoiceAdd1(companyName, yyzCode, "湖北省武汉市金融港", "072", "85263698", "招商银行", "6225882138255259", "方俊", phone, RandomUtils.getEmail(5, 5), "42", "420100", "420100", "湖北省", "武汉市", "武汉市", "金融港", sessionID1);
    }

    @Step("异常单处理")
    public void unNormalOrder(String phone) {
        //企业登录
        JSONObject object = accountService.accountLogin1(phone, "123456", "2", "true", "");
        String sessionID1 = JsonPath.parse(object).read("$.sessionID");
        JSONObject response = sjbStockOrderService.waybillOrderAbnormalListQuery1("1", "0", "0", null, null, null, null, "1", "0", "0", "500", sessionID1);
        JSONArray list = JsonPath.parse(response).read("$.list");
        HashMap<String, Object> headers_txt = new HashMap<>();
        headers_txt.put("Content-Type", "application/x-www-form-urlencoded");
        headers_txt.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        headers_txt.put("certification", sessionID1);
        HashMap data = new HashMap();
        data.put("urls", "/wyyt-image/2019/06/27/7612925461137143792.png");
        data.put("urlmemo", "自动化处理异常单");
        for (Object o : list) {
            JSONObject temp = JSON.parseObject(o.toString());
            int id = temp.getInteger("id");
            data.put("id", id + "");
            new BaseCall("http://web.sijibao.co/WEBproject/Companyservice/Wallet/ordersAddurl", "POST").addHeaders(headers_txt).setData(data).callService();
            //sjbStockOrderService.waybillOrdersAddUrl1(ordernumber, id+"", "/wyyt-image/2019/06/27/287205392273297434.png", sessionID1);
        }
    }

    @Step("提交开票")
    public void billOrdersSubmit(String orders, String session) {
        //开票预览
        JSONObject response = sjbStockOrderService.waybillOrdersPreview1(orders, session);
        JSONArray list = response.getJSONObject("freightpager").getJSONArray("list");
        JSONArray billjson = new JSONArray();
        for (int i = 0; i < 3; i++) {
            JSONObject object = list.getJSONObject(i);
            object.remove("ordercount");
            object.put("billopen", false);
            object.put("submitdate", 0);
            object.put("billstate", 0);
            if (object.getString("billtypename").equals("运费发票")) {
                object.put("billtype", 1);
            }
            if (object.getString("billtypename").equals("调度服务费发票")) {
                object.put("billtype", 3);
            }
            if (object.getString("billtypename").equals("技术服务费发票")) {
                object.put("billtype", 2);
            }
            billjson.add(object);
        }
        //提交开票
        sjbStockOrderService.waybillOrdersSubmit1(billjson.toJSONString(), "0", session);
    }

    public static void main(String[] args) throws Exception {
        CommonService commonService = new CommonService();
        try {
            //commonService.addBill("17600002238");
            //commonService.unNormalOrder("17600002238");
            //commonService.huankuanBatch("17600007495", "123456", "123456");
            //String phones = "17600003074,17600007202,17600001120,17600003884,17600003117,17600003392,17600008086,17600000227,17600000582,17600003172";
            /*String phones = "17600006011,17600004358,17600003240,17600001704";
            String[] temps = phones.split(",");
            //commonService.registerCompany("1", "0");
            for (String phone : temps) {
                commonService.restSdyPassword(phone);
                //commonService.addAgent(phone, "123456", "17600001294");
            }*/
            //commonService.restSdyPassword("17600001120");
            //commonService.restAgentPassword("17600001389");
            //commonService.addAgent("17600007495", "123456", "17600001294");
            //commonService.order2("67699328f9e84cc0b19fcd7852257a1e_330","","123456",-1,"c794fd23b92c4a299222f93a2bdca7df","77b4d14fe1cc43a180fcb0da0e7dfe03","87eeb17cb25f46ecae773db81ce99d61");
            //commonService.unNormalOrder("17858627394");
            commonService.registerCompany("1", "0");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            commonService.close();
        }
    }

}
