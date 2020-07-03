package com.ruoyi.project.sjbapi.service;

import cn.hutool.crypto.digest.MD5;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.jayway.jsonpath.JsonPath;
import com.ruoyi.common.utils.security.Md5Utils;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.StringUtils;
import io.qameta.allure.Step;
import org.apache.commons.codec.digest.DigestUtils;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class CommonService2 extends BaseService {
    private static final Logger log = LoggerFactory.getLogger(CommonService2.class);

    private static CommonService2 commonService = null;
    public BamsServices bamsServices = BamsServices.getInstance();
    public AccountService accountService = new AccountService();
    SJBAllService sjbAllService = new SJBAllService();
    SJBFinanceService sjbFinanceService = new SJBFinanceService();
    public SJBStockOrderService sjbStockOrderService = new SJBStockOrderService();
    public SJBToolService sjbToolService = new SJBToolService();
    boolean isLaterPay;
    private String typeName;

    public CommonService2() {
    }

    public static CommonService2 getInstance() {
        if (commonService == null) {
            synchronized (CommonService2.class) {
                if (commonService == null) {
                    commonService = new CommonService2();
                }
            }
        }
        return commonService;
    }

    public JSONObject publishOrder5(int unit, int unitprice, String stockKind, String autoCheck, String workStock, String autoUpdate, String laterpaystate, String loadpayfee, String loadpayMoneyFee, String loadpayEtcFee, String deliveryfee, String uploadpayfee, String agentCodes, String stockqrcode, String tradeOrder, String sessionID) {
        int price = unitprice * unit;
        String freightKind = "2";
        String stockDesc;
        String clearingCycle;
        if (laterpaystate.equals("0")) {
            stockDesc = "现金";
            clearingCycle = "0";
        } else {
            stockDesc = "账期";
            clearingCycle = "1";
        }
        String stockType = "2";
        String haulageoperatorstate = "1";
        String haulageoperatorname = "";
        String haulageoperatorcode = "";
        String openable;
        if (agentCodes != null && agentCodes.length() > 0) {
            openable = "false";
        } else {
            openable = "true";
        }
        //地址
        JSONArray addressData = this.sjbAllService.companyAddressQueryList1((String) null, sessionID).getJSONArray("zones");
        int size = addressData.size();
        JSONObject fahuo = addressData.getJSONObject(size - 1);
        JSONObject shouhuo = addressData.getJSONObject(size - 2);

        String oilMoney = Integer.parseInt(loadpayfee) + Integer.parseInt(uploadpayfee) + "";
        JSONObject response = this.sjbFinanceService.oilcardMoneyQuery1(oilMoney, String.valueOf(price * 10000), loadpayEtcFee, "1", "0", sessionID);


        //收单规则查询
        String ruleCode = this.sjbStockOrderService.stockCoalruleQuery1(shouhuo.getString("contastTel"), sessionID).getJSONArray("rules").getJSONObject(0).getString("ruleCode");
        //企业收货货物单价查询
        JSONObject response2 = this.sjbStockOrderService.stockCompanycoalQuery1(sessionID).getJSONArray("list").getJSONObject(0);
        String freightname = response2.getString("freightname");
        int freightPrice = response2.getInteger("price");
        //企业配置查询
        JSONObject configData = this.sjbFinanceService.accountConfigQuery1(sessionID);
        haulageoperatorcode = configData.getJSONObject("response").getString("companycode");
        haulageoperatorname = configData.getJSONObject("response").getString("companyname");
        //发货
        String freightRates = String.valueOf(price * 10000);
        String offlinepay = "false";
        JSONObject response3 = new JSONObject();
        if (unitprice == 0) {
            haulageoperatorstate = "0";
            freightPrice = 0;
            freightRates = String.valueOf(unit * freightPrice);
            clearingCycle = "0";
            laterpaystate = null;
            stockDesc = "线下";
            offlinepay = "true";
            response3 = this.sjbStockOrderService.stockPublish2("0", "false", (String) null, (String) null, "false", (String) null, (String) null, (String) null, stockDesc, stockType, stockKind, shouhuo.getString("regionCode"), shouhuo.getString("regionName"), fahuo.getString("regionCode"), fahuo.getString("regionName"), "0", "0", "0", "0", "0", openable, "0.00", (String) null, "0.00", "0.0", "0.0", (String) null, fahuo.getString("lon"), fahuo.getString("lat"), (String) null, String.valueOf(price), unitprice + "元/吨", unit + "吨", (String) null, (String) null, (String) null, (String) null, "false", "false", "false", "true", (String) null, "0", "0", shouhuo.getString("zoneCode"), fahuo.getString("zoneCode"), (String) null, tradeOrder, "3", "2147483647", clearingCycle, (String) null, freightRates, freightKind, "0", "0", "0", loadpayfee, "0", loadpayMoneyFee, "0", loadpayEtcFee, "0", deliveryfee, "0", uploadpayfee, haulageoperatorstate, haulageoperatorname, haulageoperatorcode, response.getString("rateamount"), laterpaystate, "", agentCodes, autoUpdate, autoCheck, workStock, (String) null, (String) null, (String) null, System.currentTimeMillis() + "", ruleCode, freightname, freightPrice + "", (String) null, "false", offlinepay, stockqrcode, "25", sessionID);

        } else {

            response3 = this.sjbStockOrderService.stockPublish2("0", "false", (String) null, (String) null, "false", (String) null, (String) null, (String) null, stockDesc, stockType, stockKind, shouhuo.getString("regionCode"), shouhuo.getString("regionName"), fahuo.getString("regionCode"), fahuo.getString("regionName"), "0", "0", "0", "0", "0", openable, "0.00", (String) null, "0.00", "0.0", "0.0", (String) null, fahuo.getString("lon"), fahuo.getString("lat"), (String) null, String.valueOf(price), unitprice + "元/吨", unit + "吨", (String) null, (String) null, (String) null, (String) null, "false", "false", "false", "true", (String) null, "0", "0", shouhuo.getString("zoneCode"), fahuo.getString("zoneCode"), (String) null, tradeOrder, "3", "2147483647", clearingCycle, (String) null, freightRates, freightKind, "0", "0", "0", loadpayfee, "0", loadpayMoneyFee, "0", loadpayEtcFee, "0", deliveryfee, "0", uploadpayfee, haulageoperatorstate, haulageoperatorname, haulageoperatorcode, response.getString("rateamount"), laterpaystate, "", agentCodes, autoUpdate, autoCheck, workStock, (String) null, (String) null, (String) null, System.currentTimeMillis() + "", ruleCode, freightname, freightPrice + "", (String) null, "false", offlinepay, stockqrcode, null, sessionID);
        }
        JSONObject res = new JSONObject();
        if (response3.getBoolean("state")) {
            JSONObject stockObject = this.sjbStockOrderService.stockQueryGroupPublish1((String) null, "true", (String) null, (String) null, "0", "10", sessionID).getJSONArray("runningStocks").getJSONObject(0);
            String stockCode = stockObject.getJSONObject("goodsInfo").getString("stockcode");
            res.put("stockCode", stockCode);
        } else {
            res = response3;
        }

        return res;
    }


    @Step("经纪人发货")
    public String agentUpdateStock(String stockCode, String agentMode, String agentUnitPrice, String agentMoney, String informationfess, String vehiclefee, String advanceexpenditured, String advancePercent, String advanceMoney, String advanceType, String checkForFee, String allowLossUnit, String unitPrice, String offlineServerfee, String allowUpUnit, String unitUpPrice, String sessionID4) {
        JSONArray list = this.sjbToolService.stockagentStockQuery1("0", "0", "10", sessionID4).getJSONArray("list");
        Iterator it = list.iterator();
        String stockagentcode = null;

        while (it.hasNext()) {
            JSONObject temp = (JSONObject) it.next();
            if (temp.getJSONObject("agentstockdto").getString("stockcode").equals(stockCode)) {
                stockagentcode = temp.getString("stockagentcode");
                break;
            }
        }

        if (stockagentcode == null) {
            System.out.println("未找到");
        }

        this.sjbToolService.stockagentStockUpdate1(stockagentcode, agentMode, agentUnitPrice, agentMoney, informationfess, vehiclefee, advanceexpenditured, advancePercent, advanceMoney, advanceType, "0", "0", (String) null, "", checkForFee, (String) null, allowLossUnit, unitPrice, offlineServerfee, allowUpUnit, unitUpPrice, sessionID4);
        return stockagentcode;
    }

    @Step("经纪人发货封装")
    public String agentPublish(String stockCode, String agentMode, String money, String agentSession) {
        String agentCode = "";
        byte var7 = -1;
        switch (agentMode.hashCode()) {
            case 48:
                if (agentMode.equals("0")) {
                    var7 = 0;
                }
                break;
            case 49:
                if (agentMode.equals("1")) {
                    var7 = 1;
                }
                break;
            case 50:
                if (agentMode.equals("2")) {
                    var7 = 2;
                }
        }

        switch (var7) {
            case 0:
                agentCode = this.agentUpdateStock(stockCode, agentMode, "0", "0", "0", "0", "0", (String) null, (String) null, (String) null, "0", "0.00", "0.00", "0", "0.00", "0.00", agentSession);
                break;
            case 1:
                JSONObject response = this.sjbToolService.stockagentStockAgentcalculate1(stockCode, agentMode, money, agentSession);
                agentCode = this.agentUpdateStock(stockCode, agentMode, "0", response.getString("agentmoney"), response.getString("informationfees"), response.getString("vehiclefee"), "0", (String) null, (String) null, (String) null, "0", "0.00", "0.00", "0", "0.00", "0.00", agentSession);
                break;
            case 2:
                JSONObject response2 = this.sjbToolService.stockagentStockAgentcalculate1(stockCode, agentMode, money, agentSession);
                agentCode = this.agentUpdateStock(stockCode, agentMode, money, response2.getString("agentmoney"), response2.getString("informationfees"), response2.getString("vehiclefee"), "0", (String) null, (String) null, (String) null, "0", "0.00", "0.00", "0", "0.00", "0.00", agentSession);
        }

        return agentCode;
    }

    @Step("接单2")
    public JSONObject assureorderCreate(String stockCode, String agentCode, String sessionID2) {
        JSONObject driverData = this.sjbAllService.driverQueryVehiclelist1(sessionID2).getJSONArray("list").getJSONObject(0);
        JSONObject accountData = this.sjbAllService.driverQueryfordriver1((String) null, sessionID2);
        String phone = accountData.getJSONObject("userInfo").getString("userMobile");
        String userCode = driverData.getString("usercode");
        String id = driverData.getString("id");
        String contractType = null;
        if (com.ruoyi.common.utils.StringUtils.isEmpty(agentCode)) {
            contractType = "0";
        }
        JSONObject response = this.sjbStockOrderService.assureorderCreate3(stockCode, userCode, phone, id, null, contractType, null, agentCode, sessionID2);
        return response;
    }

    @Step("检查订单状态")
    public boolean checkOrderState(String orderNumber, String session) {
        JSONObject response = this.sjbStockOrderService.assureorderQueryDetail1(orderNumber, session);
        response.getJSONObject("assureOrderDTO").getString("ordersimplestate");
        return this.isLaterPay = response.getJSONObject("assureOrderDTO").getBoolean("islaterpay");
    }

    public boolean checkOrderState(String orderNo, String expect, String sessionID1, String sessionID2) throws InterruptedException {
        for (int i = 0; i < 5; ++i) {
            Thread.sleep(3000L);
            String memo = this.sjbAllService.orderSchedule(orderNo, sessionID2).getJSONObject("data").getJSONArray("assureOrderScheduleDtos").getJSONObject(0).getString("memo");
            log.info(String.format("checkOrderState预期状态:%s,实际状态%s", expect, memo));
            if (memo.equals(expect)) {
                return true;
            }
            if (memo.equals("提交评价，运单完成")) {
                return false;
            }
        }
        return false;
    }

    @Step("确认司机")
    public void confirmDriver(String stockCode, String orderNumber, String sessionID1) {
        JSONObject response1 = this.sjbStockOrderService.stockQueryDetail2((String) null, stockCode, (String) null, (String) null, (String) null, (String) null, sessionID1);
        if (!response1.getJSONObject("goodsInfo").getBoolean("autoCheck")) {
            if (this.isLaterPay) {
                this.sjbFinanceService.tradeOrderBatchCreateLaterpay1(orderNumber, (String) null, "1", sessionID1);
            } else {
                JSONObject response = this.sjbFinanceService.tradeOrderBatchPre1(orderNumber, "1", sessionID1);
                int favorable = response.getInteger("totalintermediaryfavorable");
                int payMoney = response.getInteger("totalpay");
                int poundage = response.getInteger("totalintermediarypoundage");
                int pounType = response.getInteger("paytype");
                JSONObject accountDetail = this.sjbFinanceService.accountDetailQuery1(sessionID1);
                String passwordalias = this.sjbFinanceService.accountPasswordaliasQuery1("123456", sessionID1).getString("passwordalias");
                String data = "{\"list\":[{\"ordernumber\":\"" + orderNumber + "\",\"favorable\":" + favorable + ",\"paymoney\":" + payMoney + ",\"poundage\":" + poundage + "}]}";
                this.sjbFinanceService.tradeOrderBatchCreateNew1(data, payMoney + "", pounType + "", (String) null, accountDetail.getJSONObject("walletaccount").getString("walletaccountid"), (String) null, passwordalias, "http://www.baidu.com", (String) null, accountDetail.getJSONObject("walletaccount").getString("moneybalance"), sessionID1);
            }
        } else {
            System.out.println("该订单自动确认司机");
        }

    }

    @Step("确认司机")
    public JSONObject confirmDriver(String stockCode, String orderNumber, String sessionID1, String pay_password) {
        JSONObject response1 = this.sjbStockOrderService.stockQueryDetail2((String) null, stockCode, (String) null, (String) null, (String) null, (String) null, sessionID1);
        this.checkOrderState(orderNumber, sessionID1);
        if (!response1.getJSONObject("goodsInfo").getBoolean("autoCheck")) {
            if (this.isLaterPay) {
                //账期
                log.info("账期订单:" + orderNumber);
                return this.sjbFinanceService.tradeOrderBatchCreateLaterpay1(orderNumber, (String) null, "1", sessionID1);
            } else {
                //现金
                log.info("现金订单:" + orderNumber);
                JSONObject response = this.sjbFinanceService.tradeOrderBatchPre1(orderNumber, "1", sessionID1);

                int favorable = response.getInteger("totalintermediaryfavorable");
                int payMoney = response.getInteger("totalpay");
                int poundage = response.getInteger("totalintermediarypoundage");
                int pounType = response.getInteger("paytype");
                JSONObject accountDetail = this.sjbFinanceService.accountDetailQuery1(sessionID1);
                String passwordalias = this.sjbFinanceService.accountPasswordaliasQuery1(pay_password, sessionID1).getString("passwordalias");
                String data = "{\"list\":[{\"ordernumber\":\"" + orderNumber + "\",\"favorable\":" + favorable + ",\"paymoney\":" + payMoney + ",\"poundage\":" + poundage + "}]}";
                return this.sjbFinanceService.tradeOrderBatchCreateNew1(data, payMoney + "", pounType + "", (String) null, accountDetail.getJSONObject("walletaccount").getString("walletaccountid"), (String) null, passwordalias, "http://www.baidu.com", (String) null, accountDetail.getJSONObject("walletaccount").getString("moneybalance"), sessionID1);
            }
        } else {
            System.out.println("该订单自动确认司机");
        }

        return response1;
    }

    @Step("完成装货")
    public JSONObject confirmLoading(String orderNumber, String payPassword, String session) {
        log.info("完成装货付款");
        return this.sjbStockOrderService.assureorderSubmitLoadingComplete2(orderNumber, payPassword, session);
    }

    @Step("卸货签到")
    public JSONObject unloadingSign(String orderNumber, String sessionID2) {
        JSONObject orderDetail = this.sjbStockOrderService.assureorderQueryDetail1(orderNumber, sessionID2);
        JSONObject targetAddresses = orderDetail.getJSONObject("stockRspDTO").getJSONArray("targetaddresses").getJSONObject(0);
        return this.sjbStockOrderService.assureorderSigninCreateUploading1(orderNumber, "/wyyt-image/2018/12/27/5169833204861753928.jpg", targetAddresses.getString("address"), targetAddresses.getString("zoneCode"), targetAddresses.getString("lon"), targetAddresses.getString("lat"), "2", "0", "0", sessionID2);
    }


    @Step("收单员签收")
    public JSONObject signIn(String orderNumber, double unit, String unitPrice, String sessionID3) {
        log.info("开始签收运单:" + orderNumber);
        JSONObject response1 = this.sjbToolService.webbusinessQuerySettingDetail1(orderNumber, (String) null, sessionID3);
        String ruleCode = response1.getJSONArray("lineRules").getJSONObject(0).getString("ruleCode");
        JSONObject response2 = this.sjbToolService.webbusinessQueryAssureorderDetailSigninpart1(orderNumber, (String) null, sessionID3);
        //String stockUnit = response2.getString("stockunit");
        double stockUnitNum = response2.getDouble("stockunitnum");
        if (StringUtils.isBlank(unitPrice)) {
            unitPrice = response2.getString("unitprice");
        }

        String stockKindMemo = response2.getString("stockkindmemo");
        int stockCost = response2.getInteger("stockcost");
        JSONObject data3 = new JSONObject();
        data3.put("originalunit", stockUnitNum);
        data3.put("actualunit", stockUnitNum + unit);
        data3.put("otherdeductions", 0);
        data3.put("unitprice", stockKindMemo + "," + Integer.parseInt(StringUtils.getNumFromStr(unitPrice)) * 10000);
        log.info("这里啊");
        JSONObject result = this.sjbToolService.webbusinessConsultCalculateResult1(orderNumber, ruleCode, data3.toString(), stockCost / 10000 + "", stockUnitNum + "", unitPrice, sessionID3);
        String cashMoney = result.getString("resideneedpay");
        JSONObject response = this.sjbToolService.webbusinessLanuchAssureorderConsult1(orderNumber, (String) null, "现场协商一致", "", "", "/wyyt-image/2018/12/27/5169833204861753928.jpg", data3.toString(), ruleCode, stockCost / 10000 + "", stockUnitNum + "", unitPrice, "0", "0", cashMoney, "1", sessionID3);
        log.info("运单签收完毕:" + orderNumber);
        return response;
    }

    @Step("企业复核")
    public JSONObject companyOrderCheck2(String orderNumber, boolean passOrNo, String password, String sessionID1) {
        return passOrNo ? this.sjbStockOrderService.assureorderOrdercheckBatchPass1(orderNumber, password, sessionID1) : this.sjbStockOrderService.assureorderOrdercheckBatchNotpass1(orderNumber, "企业审核不让你通过啊", sessionID1);
    }

    @Step("取消订单")
    public JSONObject cancelStockOrder(String orderNumber, String sessionID1, String sessionID2) throws InterruptedException {
        Thread.sleep(2000L);
        try {

            JSONObject response = this.sjbStockOrderService.assureorderCancelQueryDetail2(orderNumber, sessionID1);
            this.sjbStockOrderService.assureorderCancelSubmit2(orderNumber, response.getString("maxRefundMoney"), "车辆故障，无法抵达", "", "0", (String) null, sessionID1);
            response = this.sjbStockOrderService.assureorderCancelQueryDetail1(orderNumber, sessionID2);
            response = this.sjbStockOrderService.assureorderCancelDeal1(response.getString("cancelAssureOrderCode"), "3", orderNumber, sessionID2);
            return response;
        } catch (Exception e) {
            JSONObject res = new JSONObject();
            res.put("errMsg", e.getMessage());
            return res;
        }
    }

    @Step("取消订单")
    public void cancelStockOrder(String orderNumber, String money, String sessionID1, String sessionID2) throws InterruptedException {
        Thread.sleep(2000L);
        JSONObject response = this.sjbStockOrderService.assureorderCancelQueryDetail2(orderNumber, sessionID1);
        this.sjbStockOrderService.assureorderCancelSubmit2(orderNumber, response.getString("maxRefundMoney"), "车辆故障，无法抵达", "", money, (String) null, sessionID1);
        Thread.sleep(2000L);
        JSONObject response3 = this.sjbStockOrderService.assureorderConsultQuery2(orderNumber, sessionID2);
        if (response3.getString("data") == null) {
            JSONObject response2 = this.sjbStockOrderService.assureorderCancelQueryDetail1(orderNumber, sessionID2);
            this.sjbStockOrderService.assureorderCancelDeal1(response2.getString("cancelAssureOrderCode"), "3", orderNumber, sessionID2);
        }

    }

    public JSONObject kouKuanXs(String orderNumber, String sessionID2) {
        JSONObject response3 = this.sjbStockOrderService.assureorderConsultQuery2(orderNumber, sessionID2);
        String oilmoney = response3.getJSONObject("incomeResultDto").getString("oilmoney");
        String cashmoney = response3.getJSONObject("incomeResultDto").getString("cashmoney");
        String etcmoney = response3.getJSONObject("incomeResultDto").getString("etcmoney");
        String consultRecordCode = response3.getString("consultRecordCode");
        this.sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "1", "3", "0", (String) null, orderNumber, sessionID2);
        JSONObject res = this.sjbFinanceService.supplyPaysolutionContract1(orderNumber, (String) null, cashmoney, etcmoney, oilmoney, sessionID2);
        String contractnum = res.getString("contractnum");
        String html = res.getString("html");
        try {
            Jsoup.connect(html).get();
        } catch (IOException var12) {
            var12.printStackTrace();
        }
        return this.sjbStockOrderService.assureorderConsultUpdatestate1(consultRecordCode, "1", "3", "1", contractnum, orderNumber, sessionID2);
    }

    @Step("账期还款单条")
    public JSONObject huankuan(String phone, String password, String orderNo, String payPasssword) {
        String sessionID1 = this.accountService.accountCompanyLogin1(phone, password, "2", "true", "").getJSONObject("user").getString("sessionID");
        JSONObject response = this.sjbFinanceService.accPeriodPaySubmit2(orderNo, payPasssword, sessionID1);
        return response;
    }

    public JSONObject order2(String stockCode, String agentCode, String password, double deficit, String unitPrice, String sessionID1, String sessionID2, String sessionID3) throws InterruptedException {
        String orderNo = "";
        JSONObject res = new JSONObject();
        Boolean status = false;
        String eMsg = "";

        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sessionID2);
            if (response.toJSONString().contains("业务逻辑出错")) {
                eMsg = (String) JsonPath.parse(response).read("$.subErrors[0].message");
                throw new Exception(eMsg);
            }
            orderNo = response.getString("orderNumber");
            Thread.sleep(5000L);
            if (this.checkOrderState(orderNo, "调度完成装货付款", sessionID1, sessionID2)) {
                //确认司机
                this.confirmDriver(stockCode, orderNo, sessionID1, password);
                //装货签到
                this.confirmLoading(orderNo, password, sessionID1);
            }

            if (this.checkOrderState(orderNo, "调度付款", sessionID1, sessionID2)) {
                this.confirmDriver(stockCode, orderNo, sessionID1, password);
                this.confirmLoading(orderNo, password, sessionID1);
            }

            if (this.checkOrderState(orderNo, "卸货地签到", sessionID1, sessionID2)) {
                this.unloadingSign(orderNo, sessionID2);
            }

            if (this.checkOrderState(orderNo, "客户签收", sessionID1, sessionID2)) {
                response = this.signIn(orderNo, deficit, unitPrice, sessionID3);
                if (response.toJSONString().contains("业务逻辑出错")) {
                    eMsg = (String) JsonPath.parse(response).read("$.subErrors[0].message");
                    throw new Exception(eMsg);
                }
            }

            if (this.checkOrderState(orderNo, "等待处理协商扣款", sessionID1, sessionID2)) {
                this.kouKuanXs(orderNo, sessionID2);
            }

            if (this.checkOrderState(orderNo, "企业复核", sessionID1, sessionID2)) {
                response = this.companyOrderCheck2(orderNo, true, password, sessionID1);
                if (response.toJSONString().contains("业务逻辑出错")) {
                    eMsg = (String) JsonPath.parse(response).read("$.subErrors[0].message");
                    throw new Exception(eMsg);
                }
            }

            status = true;
        } catch (Exception var15) {
            eMsg = var15.getMessage();
        }

        res.put("errorMsg", eMsg);
        res.put("orderNo", orderNo);
        res.put("status", status);
        return res;
    }


    /**
     * 取消订单
     *
     * @param orders
     */
    public JSONObject cancelOrder(String orders) {
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
        JSONObject data = new JSONObject();
        data.put("orderNo", orders);
        return new BaseCall("http://192.168.0.187:5012/sjb/cancelOrder", "POST").addHeaders(headers).setData(data.toJSONString()).callService().close().getReturnJsonObject();

    }

    public JSONObject createOrder(String stockCode, String agentCode, String sj_s) {
        String eMsg = "", orderNo = "";
        JSONObject res = new JSONObject();

        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sj_s);
            if (response.toJSONString().contains("业务逻辑出错")) {
                eMsg = JsonPath.parse(response).read("$.subErrors[0].message");
                if (eMsg.contains("在途单未处理完毕")) {
                    //取消运单
                    String tempOrder = eMsg.split(":")[1];
                    log.info("开始取消运单:" + tempOrder);
                    cancelOrder(tempOrder);
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(5000);
                        response = this.assureorderCreate(stockCode, agentCode, sj_s);
                        if (response.containsKey("stockcode")) {
                            break;
                        }
                    }
                } else if (eMsg.contains("抢单之前请先结束任务单")) {
                    String somethingcode = eMsg.split("任务单")[1].split("还未完结")[0];
                    sjbStockOrderService.assureorderOrderscheduleFinishOrderSchedule(somethingcode, sj_s);
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(5000);
                        response = this.assureorderCreate(stockCode, agentCode, sj_s);
                        if (response.containsKey("stockcode")) {
                            break;
                        }
                    }

                } else {
                    Thread.sleep(1000 * 10);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                }
            } else if (response.toJSONString().contains("服务异常")) {
                Thread.sleep(1000 * 30);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(5000);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                    if (response.containsKey("stockcode")) {
                        break;
                    }
                }
            }
            orderNo = response.getString("orderNumber");
            res.put("orderNo", orderNo);
        } catch (Exception e) {
            eMsg = e.getMessage();
            log.info(e.getMessage());
            res.put("errorMsg", eMsg);
        }
        return res;
    }

    public String createOrder2(String stockCode, String agentCode, String sj_s) {
        String eMsg = "", orderNo = "";

        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sj_s);
            if (response.toJSONString().contains("业务逻辑出错")) {
                eMsg = JsonPath.parse(response).read("$.subErrors[0].message");
                if (eMsg.contains("在途单未处理完毕")) {
                    //取消运单
                    String tempOrder = eMsg.split(":")[1];
                    log.info("开始取消运单:" + tempOrder);
                    cancelOrder(tempOrder);
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(5000);
                        response = this.assureorderCreate(stockCode, agentCode, sj_s);
                        if (response.containsKey("stockcode")) {
                            break;
                        }
                    }
                } else {
                    Thread.sleep(1000 * 10);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                }
            } else if (response.toJSONString().contains("服务异常")) {
                Thread.sleep(1000 * 30);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(5000);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                    if (response.containsKey("stockcode")) {
                        break;
                    }
                }
            }
            return response.getString("orderNumber");
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return null;
    }

    public JSONObject order4(String stockCode, String agentCode, double deficit, String unitPrice, String driverPhone, String step) {
        String password = "sjb123456", payPwd = "142536";
        //司机登录
        JSONObject response_sj = this.accountService.accountLogin1(driverPhone, password, "1", "true", "");
        String sj_s = JsonPath.parse(response_sj).read("$.sessionID");
        //司机从详情获取企业手机号
        JSONObject response_xq = this.sjbStockOrderService.stockQueryDetail2((String) null, stockCode, (String) null, (String) null, (String) null, (String) null, sj_s);
        String companyPhone = response_xq.getJSONObject("cmpnyInfo").getString("companyPhone");

        //企业登录
        //String sdyPhone = response_xq.getJSONObject("goodsInfo").getJSONArray("targetaddresses").getJSONObject(0).getString("contastTel");
        JSONObject response_qy = this.accountService.accountCompanyLogin1(companyPhone, password, "2", "true", "");
        String qy_s = JsonPath.parse(response_qy).read("$.user.sessionID");

        //企业从详情获取收单员手机号
        JSONObject response_xq2 = this.sjbStockOrderService.stockQueryDetail2((String) null, stockCode, (String) null, (String) null, (String) null, (String) null, qy_s);
        String sdyPhone = response_xq2.getJSONObject("goodsInfo").getJSONArray("targetaddresses").getJSONObject(0).getString("contastTel");
        //收单员登录
        JSONObject response3 = this.sjbToolService.webMobileLoginPassword1(sdyPhone, password, "", "");
        String sdy_s = JsonPath.parse(response3).read("$.session");
        String orderNo = "";
        JSONObject res = new JSONObject();
        Boolean status = false;
        String eMsg = "";
        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sj_s);
            if (response.toJSONString().contains("业务逻辑出错")) {
                eMsg = (String) JsonPath.parse(response).read("$.subErrors[0].message");
                if (eMsg.contains("在途单未处理完毕")) {
                    //取消运单
                    String tempOrder = eMsg.split(":")[1];
                    log.info("开始取消运单:" + tempOrder);
                    cancelOrder(tempOrder);
                    Thread.sleep(5000);
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(5000);
                        response = this.assureorderCreate(stockCode, agentCode, sj_s);
                        if (response.containsKey("stockcode")) {
                            break;
                        }
                    }
                } else {
                    Thread.sleep(1000 * 10);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                }
            } else if (response.toJSONString().contains("服务异常")) {
                Thread.sleep(1000 * 30);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000 * 5);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                    if (response.containsKey("stockcode")) {
                        break;
                    }
                }
            }
            orderNo = response.getString("orderNumber");
            res.put("orderNo", orderNo);
            status = true;
        } catch (Exception e) {
            res.put("errorMsg", eMsg);
            res.put("status", status);
            return res;
        }
        try {
            if (com.ruoyi.common.utils.StringUtils.isEmpty(step)) {
                oderFlow(stockCode, orderNo, deficit, unitPrice, payPwd, qy_s, sj_s, sdy_s);
            } else {
                log.info("指定运单状态为:" + step);
                oderFlow(stockCode, orderNo, deficit, unitPrice, payPwd, qy_s, sj_s, sdy_s, step);
            }
            status = true;
        } catch (Exception e) {
            eMsg = e.getMessage();
            log.info(e.getMessage());
            res.put("errorMsg", eMsg);
            res.put("status", status);
            return res;
        }
        res.put("status", true);
        return res;
    }

    public JSONObject order3(String stockCode, String agentCode, double deficit, String sessionID1, String sessionID2, String sessionID3) throws InterruptedException {
        String orderNo = "";
        JSONObject res = new JSONObject();
        Boolean status = false;
        String eMsg = "";

        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sessionID2);
            orderNo = response.getString("orderNumber");
            if (orderNo.length() == 0) {
                return res;
            }

            this.checkOrderState(orderNo, "卸货地签到", sessionID1, sessionID2);
            this.unloadingSign(orderNo, sessionID2);
            status = true;
        } catch (Exception var13) {
            eMsg = var13.getMessage();
        }

        res.put("errorMsg", eMsg);
        res.put("orderNo", orderNo);
        res.put("status", status);
        return res;
    }

    public void qianshou(String orderNo, String sessionID3) {
        Boolean status = false;
        JSONObject res = new JSONObject();

        try {
            this.signIn(orderNo, 0.0D, "", sessionID3);
            status = true;
        } catch (Exception var6) {
            res.put("errorMsg", var6.getMessage());
        }

        res.put("orderNo", orderNo);
        res.put("status", status);
    }

    public void fuhe(String orderNo, String password, String sessionID1) {
        Boolean status = false;
        JSONObject res = new JSONObject();

        try {
            this.companyOrderCheck2(orderNo, true, password, sessionID1);
            status = true;
        } catch (Exception var7) {
            res.put("errorMsg", var7.getMessage());
        }

        res.put("orderNo", orderNo);
        res.put("status", status);
    }

    @Step("异常单处理")
    public void unNormalOrder(String phone, String password) {
        JSONObject object = this.accountService.accountLogin1(phone, password, "2", "true", "");
        String sessionID1 = (String) JsonPath.parse(object).read("$.sessionID");
        JSONObject response = this.sjbStockOrderService.waybillOrderAbnormalListQuery1("1", "0", "0", (String) null, (String) null, (String) null, (String) null, "1", "0", "0", "500", sessionID1);
        JSONArray list = (JSONArray) JsonPath.parse(response).read("$.list");
        HashMap<String, Object> headers_txt = new HashMap();
        headers_txt.put("Content-Type", "application/x-www-form-urlencoded");
        headers_txt.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        headers_txt.put("certification", sessionID1);
        HashMap data = new HashMap();
        data.put("urls", "/wyyt-image/2019/06/27/7612925461137143792.png");
        data.put("urlmemo", "自动化处理异常单");
        Iterator var9 = list.iterator();

        while (var9.hasNext()) {
            Object o = var9.next();
            JSONObject temp = JSON.parseObject(o.toString());
            int id = temp.getInteger("id");
            data.put("id", id + "");
            (new BaseCall("http://web.sijibao.co/WEBproject/Companyservice/Wallet/ordersAddurl", "POST")).addHeaders(headers_txt).setData(data).callService();
        }

    }

    public JSONObject xhqd(String phone) {
        JSONObject response2 = this.accountService.accountLogin1(phone, "sjb123456", "1", "true", "");
        String sj_s = (String) JsonPath.parse(response2).read("$.sessionID");
        JSONObject res = this.sjbStockOrderService.assureorderDriverqueryList2("1", "1572537600000", "1583833599999", "0", "100", (String) null, (String) null, sj_s);
        Integer ordersimplestate = res.getJSONArray("assureOrders").getJSONObject(0).getJSONObject("assureOrderDTO").getInteger("ordersimplestate");
        if (ordersimplestate == 6) {
            String orderNo = res.getJSONArray("assureOrders").getJSONObject(0).getJSONObject("assureOrderDTO").getString("orderNumber");
            return this.unloadingSign(orderNo, sj_s);
        } else {
            return new JSONObject();
        }
    }

    public String querySdyPhoneByStockNo(String stockCode, String sessionID1) {
        JSONObject detail = this.sjbStockOrderService.stockQueryDetail2((String) null, stockCode, (String) null, (String) null, (String) null, (String) null, sessionID1);
        return detail.getJSONObject("goodsInfo").getJSONArray("targetaddresses").getJSONObject(0).getString("contastTel");
    }

    public void data1(int num) {
        String stockCode = "5703cc881b9b431b8cd922bac52bcb85_330";

        try {
            JSONObject response = this.accountService.accountCompanyLogin1("17600007617", "123456", "2", "true", "");
            String qy_s = (String) JsonPath.parse(response).read("$.user.sessionID");
            JSONObject response2 = this.accountService.accountLogin1("13506894378", "123456", "1", "true", "");
            String sj_s = (String) JsonPath.parse(response2).read("$.sessionID");
            JSONObject response3 = this.sjbToolService.webMobileLoginPassword1("17600000602", "123456", "", "");
            String sd_s = (String) JsonPath.parse(response3).read("$.session");

            for (int i = 0; i < num; ++i) {
                this.order2(stockCode, "", "123456", 0.0D, "11", qy_s, sj_s, sd_s);
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }
    }

    private String message = "";

    public boolean isJSONObjectContainKV(JSONObject jsonObject, String key_value) {
        boolean flag = false;

        try {
            if (jsonObject == null) {
                new NullPointerException("The argument {" + jsonObject + "} is null, please check this!");

                return flag;
            }

            // assert key_value : null, empty, whitespace
            if (StringUtils.isBlank(key_value) || !"2".equals(String.valueOf(key_value.split(":").length)) ||
                    StringUtils.isBlank(key_value.split(":")[0]) || StringUtils.isBlank(key_value.split(":")[1])) {
                this.message = "The argument {" + key_value + "} is invalid, please check this!";
                System.out.println(this.message);
                return flag;
            }

            String act = jsonObject.get(key_value.split(":")[0]).toString();
            String exp = key_value.split(":")[1];

            // assert the actual value is expected or not
            if (exp.equals(act)) {
                flag = true;
            }
        } catch (JSONException je) {
            this.message = je.getMessage();
            System.out.println(this.message);

            return flag;
        }

        return flag;
    }

    @Step("确认司机")
    public JSONObject confirmDriver2(String stockCode, String orderNumber, String qy_s, String payPwd) {
        //查询货源详情
        JSONObject response = sjbStockOrderService.stockQueryDetail2(null, stockCode, null, null, null, null, qy_s);
        JSONArray freightDataDTO = response.getJSONObject("goodsInfo").getJSONArray("freightDataDTO");
        boolean haszhk = false;
        a:
        for (int i = 0; i < freightDataDTO.size(); i++) {
            if (isJSONObjectContainKV(freightDataDTO.getJSONObject(i), "payNode:1") && freightDataDTO.getJSONObject(i).getInteger("payFee") > 0) {
                haszhk = true;
                break a;
            }
        }
        System.out.println("haszhk:" + haszhk);
        if (!response.getJSONObject("goodsInfo").getBoolean("autoCheck")) {
            //订单没有开启自动确认司机情况
            log.info("订单没有开启自动确认司机:" + orderNumber);
            response = goConfirmDriver(orderNumber, qy_s, payPwd);
        } /*else if (haszhk) {
            //订单开启自动确认司机，但是有装货款或者装货油
            log.info("订单开启自动确认司机，但是有装货款或者装货油:" + orderNumber);
            response = goConfirmDriver(orderNumber, qy_s, payPwd);
        }*/ else {
            log.info("$s,该订单自动确认司机", orderNumber);
            response.clear();
            response.put("msg", "订单自动确认司机");
        }
        return response;
    }

    /**
     * 确认司机操作
     *
     * @param orderNumber
     * @param qy_s
     * @param payPwd
     * @return
     */
    public JSONObject goConfirmDriver(String orderNumber, String qy_s, String payPwd) {
        if (isLaterPay) {
            //账期确认司机
            return sjbFinanceService.tradeOrderBatchCreateLaterpay1(orderNumber, null, "1", qy_s);
        } else {
            //现金确认司机
            JSONObject response = sjbFinanceService.tradeOrderBatchPre1(orderNumber, "1", qy_s);
            int favorable = response.getInteger("totalintermediaryfavorable");
            int payMoney = response.getInteger("totalpay");
            int poundage = response.getInteger("totalintermediarypoundage");
            int pounType = response.getInteger("paytype");
            //查询账户详情
            JSONObject accountDetail = sjbFinanceService.accountDetailQuery1(qy_s);
            //验证密码
            String passwordalias = sjbFinanceService.accountPasswordaliasQuery1(payPwd, qy_s).getString("passwordalias");
            //支付给承运公司
            String data = "{\"list\":[{\"ordernumber\":\"" + orderNumber + "\",\"favorable\":" + favorable + ",\"paymoney\":" + payMoney + ",\"poundage\":" + poundage + "}]}";
            return sjbFinanceService.tradeOrderBatchCreateNew1(data, payMoney + "", pounType + "", null, accountDetail.getJSONObject("walletaccount").getString("walletaccountid"), null, passwordalias, "http://www.baidu.com", null, accountDetail.getJSONObject("walletaccount").getString("moneybalance"), qy_s);
        }
    }

    /**
     * 获取运单状态
     *
     * @param orderNo
     * @param qy_s
     * @return
     */
    public String getOrderStatus(String orderNo, String qy_s) {
        JSONObject response = sjbStockOrderService.assureorderQueryDetail2(orderNo, qy_s);
        String ordersimplememo = response.getJSONObject("assureOrderDTO").getString("ordersimplememo");
        System.out.println(ordersimplememo);
        return ordersimplememo;
    }

    /**
     * 对外服务 _判断企业订单状态
     *
     * @param stockCode 货源编号
     * @param agentCode
     * @param password  支付密码
     * @param deficit   亏吨
     * @param unitPrice 货物单价
     * @param qy_s      企业session
     * @param sj_s      司机session
     * @param sdy_s     收单员session
     * @throws InterruptedException
     */
    public JSONObject order3(String stockCode, String agentCode, String password, double deficit, String unitPrice, String qy_s, String sj_s, String sdy_s) {
        //接单
        String orderNo = "";
        JSONObject res = new JSONObject();
        Boolean status = false;
        String eMsg = "";
        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sj_s);

            if (response.toJSONString().contains("业务逻辑出错")) {
                eMsg = JsonPath.parse(response).read("$.subErrors[0].message");
                if (eMsg.contains("在途单未处理完毕")) {
                    //取消运单
                    String tempOrder = eMsg.split(":")[1];
                    cancelOrder(tempOrder);
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(5000);
                        response = this.assureorderCreate(stockCode, agentCode, sj_s);
                        if (response.containsKey("stockcode")) {
                            break;
                        }
                    }
                } else {
                    Thread.sleep(1000 * 10);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                }
            } else if (response.toJSONString().contains("服务异常")) {
                Thread.sleep(1000 * 30);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000 * 5);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                    if (response.containsKey("stockcode")) {
                        break;
                    }
                }
            }
            orderNo = response.getString("orderNumber");
            //根据订单状态出来
            oderFlow(stockCode, orderNo, deficit, unitPrice, password, qy_s, sj_s, sdy_s);
            status = true;
        } catch (Exception e) {
            eMsg = e.getMessage();
        }
        res.put("errorMsg", eMsg);
        res.put("orderNo", orderNo);
        res.put("status", status);
        return res;
    }

    public JSONObject order3(String stockCode, String agentCode, String password, double deficit, String unitPrice, String qy_s, String sj_s, String sdy_s, String step) {
        //接单
        String orderNo = "";
        JSONObject res = new JSONObject();
        Boolean status = false;
        String eMsg = "";
        try {
            JSONObject response = this.assureorderCreate(stockCode, agentCode, sj_s);

            if (response.toJSONString().contains("业务逻辑出错")) {
                eMsg = JsonPath.parse(response).read("$.subErrors[0].message");
                if (eMsg.contains("在途单未处理完毕")) {
                    //取消运单
                    String tempOrder = eMsg.split(":")[1];
                    cancelOrder(tempOrder);
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(5000);
                        response = this.assureorderCreate(stockCode, agentCode, sj_s);
                        if (response.containsKey("stockcode")) {
                            break;
                        }
                    }
                } else {
                    Thread.sleep(1000 * 10);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                }
            } else if (response.toJSONString().contains("服务异常")) {
                Thread.sleep(1000 * 30);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000 * 5);
                    response = this.assureorderCreate(stockCode, agentCode, sj_s);
                    if (response.containsKey("stockcode")) {
                        break;
                    }
                }
            }
            orderNo = response.getString("orderNumber");
            //根据订单状态出来
            oderFlow(stockCode, orderNo, deficit, unitPrice, password, qy_s, sj_s, sdy_s, step);
            status = true;
        } catch (Exception e) {
            eMsg = e.getMessage();
        }
        res.put("errorMsg", eMsg);
        res.put("orderNo", orderNo);
        res.put("status", status);
        return res;
    }

    /**
     * 订单流程
     *
     * @param stockCode
     * @param orderNo
     * @param deficit
     * @param unitPrice
     * @param payPwd
     * @param qy_s
     * @param sj_s
     * @param sdy_s
     * @return
     */
    public String oderFlow(String stockCode, String orderNo, double deficit, String unitPrice, String payPwd, String qy_s, String sj_s, String sdy_s) {
        String memo = "", errMsg;
        JSONObject response = new JSONObject();

        JSONObject response2 = sjbStockOrderService.stockQueryDetail2(null, stockCode, null, null, null, null, qy_s);

        int maxRun = 20, i = 0;
        while (i < maxRun) {
            i = i + 1;
            if (i > maxRun) {
                break;
            }
            memo = getOrderStatus(orderNo, qy_s);
            if (memo.endsWith("等待企业确认运单")) {
                confirmDriver2(stockCode, orderNo, qy_s, payPwd);
            }
            if (memo.endsWith("等待企业装货确认")) {
                confirmLoading(orderNo, payPwd, qy_s);
            }
            if (memo.endsWith("需卸货签到")) {
                unloadingSign(orderNo, sj_s);
            }
            if (memo.endsWith("等待企业签收")) {
                response = signIn(orderNo, deficit, unitPrice, sdy_s);
                if (response.toJSONString().contains("业务逻辑出错")) {
                    errMsg = JsonPath.parse(response).read("$.subErrors[0].message");
                    break;
                }
            }
            if (memo.endsWith("运单协商中")) {
                kouKuanXs(orderNo, sj_s);
            }

            if (memo.endsWith("企业复核")) {
                response = companyOrderCheck2(orderNo, true, payPwd, qy_s);
                if (response.toJSONString().contains("业务逻辑出错")) {
                    errMsg = JsonPath.parse(response).read("$.subErrors[0].message");
                    break;
                }
            }
            if (memo.endsWith("运单已完成")) {
                i = 100;
            }
        }
        return memo;
    }

    /**
     * 订单流程
     *
     * @param stockCode
     * @param orderNo
     * @param deficit
     * @param unitPrice
     * @param payPwd
     * @param qy_s
     * @param sj_s
     * @param sdy_s
     * @param step
     * @return
     */
    public String oderFlow(String stockCode, String orderNo, double deficit, String unitPrice, String payPwd, String qy_s, String sj_s, String sdy_s, String step) {
        String memo = "";
        JSONObject response = new JSONObject();
        int maxRun = 20, i = 0;
        while (i < maxRun) {
            i = i + 1;
            if (i > maxRun) {
                break;
            }
            memo = getOrderStatus(orderNo, qy_s);
            if (memo.contains(step)) {
                log.info("订单到达指定状态:" + step + ",订单实际状态:" + memo);
                break;
            }
            if (memo.endsWith("等待企业确认运单")) {
                confirmDriver2(stockCode, orderNo, qy_s, payPwd);
            }
            if (memo.endsWith("等待企业装货确认")) {
                confirmLoading(orderNo, payPwd, qy_s);
            }
            if (memo.endsWith("需卸货签到")) {
                unloadingSign(orderNo, sj_s);
            }
            if (memo.endsWith("等待企业签收")) {
                response = signIn(orderNo, deficit, unitPrice, sdy_s);
                if (response.toJSONString().contains("业务逻辑出错")) {
                    return JsonPath.parse(response).read("$.subErrors[0].message");
                }
            }
            if (memo.endsWith("运单协商中")) {
                kouKuanXs(orderNo, sj_s);
            }

            if (memo.endsWith("企业复核")) {
                response = companyOrderCheck2(orderNo, true, payPwd, qy_s);
                if (response.toJSONString().contains("业务逻辑出错")) {
                    return JsonPath.parse(response).read("$.subErrors[0].message");
                }
            }
            if (memo.endsWith("运单已完成")) {
                i = 100;
            }
        }
        return memo;
    }

    /**
     * 煤炭任务单
     *
     * @return
     */
    public JSONObject jobOrder(String stockCode, int orderNum, double deficit, String unitPrice, String payPwd, String qy_s, String sj_s, String sdy_s) {
        JSONObject response = new JSONObject();
        //接单
        JSONObject data = createOrder(stockCode, null, sj_s);
        String workordercode = "";
        try {
            String orderNo = data.getString("orderNo");
            JSONObject orderDeatil = sjbStockOrderService.assureorderQueryDetail1(orderNo, sj_s);
            workordercode = orderDeatil.getJSONObject("assureOrderDTO").getString("workordercode");

            String lon1 = orderDeatil.getJSONObject("stockRspDTO").getJSONArray("sourceaddresses").getJSONObject(0).getString("lon");
            String lat1 = orderDeatil.getJSONObject("stockRspDTO").getJSONArray("sourceaddresses").getJSONObject(0).getString("lat");

            String lon2 = orderDeatil.getJSONObject("stockRspDTO").getJSONArray("targetaddresses").getJSONObject(0).getString("lon");
            String lat2 = orderDeatil.getJSONObject("stockRspDTO").getJSONArray("targetaddresses").getJSONObject(0).getString("lat");
            String address2 = orderDeatil.getJSONObject("stockRspDTO").getJSONArray("targetaddresses").getJSONObject(0).getString("address");
            String addressCode2 = orderDeatil.getJSONObject("stockRspDTO").getJSONArray("targetaddresses").getJSONObject(0).getString("zoneCode");

            for (int i = 0; i < orderNum; i++) {
                if (i > 0) {
                    //装货签到
                    Thread.sleep(2000);
                    response = sjbStockOrderService.assureorderOrderscheduleGoonCoal(workordercode, lon1, lat1, null, sj_s);
                }
                Thread.sleep(2000);
                response = sjbStockOrderService.assureorderQueryOrderscheduleOntheway(workordercode, sj_s);
                JSONObject orderDeatil2 = sjbStockOrderService.assureorderQueryOrderscheduleDetailCoal(workordercode, sj_s);

                if (i > 0) {
                    addressCode2 = orderDeatil2.getString("preUnloadAddressCode");
                    orderNo = orderDeatil2.getString("orderNumber");
                }
                //卸货签到
                response = sjbStockOrderService.assureorderSigninCreateUploadingCoal(orderNo, address2, addressCode2, lon2, lat2, "0", "0", "2", sj_s);
                Thread.sleep(2000);
                //签收
                response = signIn(orderNo, deficit, unitPrice, sdy_s);
                //复核
                response = companyOrderCheck2(orderNo, true, payPwd, qy_s);
            }
        } catch (Exception e) {
            log.info(e.getMessage());
            response.put("errMsg", e.getMessage());
        } finally {
            if (StringUtils.isNotBlank(workordercode)) {
                //结束任务单
                response = sjbStockOrderService.assureorderOrderscheduleFinishOrderSchedule(workordercode, sj_s);
            }
        }
        return response;
    }

    public JSONObject jobOrder2(String phone, String passwd, String driverCode, String billNo, String concreateNo, String lat, String lng, int runNum) {
        //100000009046
        //114.416351
        //30.49349
        String biilUrl = "/wyyt-image/2020/05/27/2262148804921465392.png";
        JSONObject response = new JSONObject();
        //调度员登录
        String session = sjbToolService.mobileLoginPassPounder(phone, DigestUtils.sha1Hex(passwd), "").getString("session");
        for (int i = 0; i < runNum; i++) {
            log.info("任务单第:" + (i + 1) + "单");
            response = sjbToolService.poundOrderInformationQueryBuild("", driverCode, session);
            String orderNumber = response.getString("orderNumber");
            String orderScheduleCode = response.getString("orderScheduleCode");
            JSONObject response2 = sjbToolService.poundOrderInformationSaveBuild(orderNumber, biilUrl, billNo, concreateNo, session);
            response2.getBoolean("state");

            response = sjbToolService.poundOrderInformationAgainBuild(orderNumber, orderScheduleCode, lat, lng, null, session);
            response.getBoolean("state");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return response;
    }


    public static void main(String[] args) {
        new CommonService2();
    }
}
