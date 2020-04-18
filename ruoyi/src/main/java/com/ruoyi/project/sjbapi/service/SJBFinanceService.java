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
public class SJBFinanceService {

    private static String url = "http://sjb-service.sijibao.co/sjbFinance/router";
    private static String appcode = "100094";
    //private static String url =  Config.getYml().getUrl("sjbFinance");
    //private static String appcode = Config.getYml().getAppCode("sjbFinance");

    /**
     * 账期还款支付1.0
     *
     * @return response
     * @
     */
    @Step("账期还款支付1.0")
    public JSONObject accPeriodPaySubmit1(String ordernumbers, String paypassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号，多个以逗号分隔
        map.put("paypassword", paypassword);//支付密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "acc.period.pay.submit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("paypassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 账期还款支付2.0
     *
     * @return response
     * @
     */
    @Step("账期还款支付2.0")
    public JSONObject accPeriodPaySubmit2(String ordernumbers, String paypassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号，多个以逗号分隔
        map.put("paypassword", paypassword);//支付密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "acc.period.pay.submit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        map.put("session", session);//系统框架参数
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //ignoreParamNames.add("paypassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 账期待还款明细列表导出1.0
     *
     * @return response
     * @
     */
    @Step("账期待还款明细列表导出1.0")
    public JSONObject accPeriodPayWaitingListExport1(String overdue, String begindate, String enddate, String loadaddressname, String unloadaddressname, String platecode, String agentcode, String keyword, String querytype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("overdue", overdue);//是否逾期，0-全部，1-已逾期，2-未逾期
        map.put("begindate", begindate);//开始时间的时间戳
        map.put("enddate", enddate);//结束时间的时间戳
        map.put("loadaddressname", loadaddressname);//装货地址
        map.put("unloadaddressname", unloadaddressname);//卸货地址
        map.put("platecode", platecode);//车牌号
        map.put("agentcode", agentcode);//经纪人Code
        map.put("keyword", keyword);//关键字
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "acc.period.pay.waiting.list.export");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("querytype", querytype);
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包资金单日详情明细2.0
     *
     * @return response
     * @
     */
    @Step("钱包资金单日详情明细2.0")
    public JSONObject accountCapitalDetailQuery2(String startTime, String endTime, String expenseType, String tradeType, String pageNo, String pageSize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//交易结束时间 yyyy-MM-dd hh:mm:ss
        map.put("expenseType", expenseType);//收支类型 1收 2支
        map.put("tradeType", tradeType);//1下单-余额冻结 2线下充值 3支付调度费 4支付司机运费 5余额解冻
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.capital.detail.query");//接口路径
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
     * 钱包资金单日详情明细1.0
     *
     * @return response
     * @
     */
    @Step("钱包资金单日详情明细1.0")
    public JSONObject accountCapitalDetailQuery1(String startTime, String endTime, String expenseType, String tradeType, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//交易结束时间 yyyy-MM-dd hh:mm:ss
        map.put("expenseType", expenseType);//收支类型 1收 2支
        map.put("tradeType", tradeType);//1下单-余额冻结 2线下充值 3支付调度费 4支付司机运费 5余额解冻
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.capital.detail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包资金冻结明细1.0
     *
     * @return response
     * @
     */
    @Step("钱包资金冻结明细1.0")
    public JSONObject accountCapitalFreezeQuery1(String startTime, String endTime, String pageNo, String pageSize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//交易结束时间 yyyy-MM-dd hh:mm:ss
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.capital.freeze.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包资金单日汇总1.0
     *
     * @return response
     * @
     */
    @Step("钱包资金单日汇总1.0")
    public JSONObject accountCapitalGatherQuery1(String startTime, String endTime, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//交易结束时间 yyyy-MM-dd hh:mm:ss
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.capital.gather.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询账户明细1.0
     *
     * @return response
     * @
     */
    @Step("查询账户明细1.0")
    public JSONObject accountChangeQuerylist1(String starttime, String endtime, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("starttime", starttime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("endtime", endtime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.change.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 用户配置信息查询1.0
     *
     * @return response
     * @
     */
    @Step("用户配置信息查询1.0")
    public JSONObject accountConfigQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("session", session);//系统框架参数

        map.put("method", "account.config.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询账户详情1.0
     *
     * @return response
     * @
     */
    @Step("查询账户详情1.0")
    public JSONObject accountDetailQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("session", session);//系统框架参数

        map.put("method", "account.detail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询手续费等1.0
     *
     * @return response
     * @
     */
    @Step("查询手续费等1.0")
    public JSONObject accountHandlingchargeQuery1(String money, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//交易金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.handlingcharge.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询每一条明细对应记录201801121.0
     *
     * @return response
     * @
     */
    @Step("查询每一条明细对应记录201801121.0")
    public JSONObject accountMoneychangeDetailQuery1(String tradeid, String querydate, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("tradeid", tradeid);//交易id
        map.put("querydate", querydate);//查询时间 格式yyyyMM，比如201806
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.moneychange.detail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询钱包账户明细列表(三合一)201801121.0
     *
     * @return response
     * @
     */
    @Step("查询钱包账户明细列表(三合一)201801121.0")
    public JSONObject accountMoneychangeQuerylist1(String querytype, String tradetime, String tradetimeday, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//列表类型 1钱包 2油卡 3提现(已作废)
        map.put("tradetime", tradetime);//交易时间 若不传入该参数，则按当月查询。格式“yyyyMM”，比如“201806”
        map.put("tradetimeday", tradetimeday);//交易时间式 按日查询 “yyyyMMdd”，比如“20180607”
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.moneychange.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 验证支付密码1.0
     *
     * @return response
     * @
     */
    @Step("验证支付密码1.0")
    public JSONObject accountPasswordCheck1(String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("password", password);//密码,不参与签名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改支付密码1.0
     *
     * @return response
     * @
     */
    @Step("修改支付密码1.0")
    public JSONObject accountPasswordModify1(String oldPassword, String newPassword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldPassword", oldPassword);//原始密码,不参与签名
        map.put("newPassword", newPassword);//新密码，不参与签名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.modify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("oldPassword");
        ignoreParamNames.add("newPassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 支付密码初始化、重置1.0
     *
     * @return response
     * @
     */
    @Step("支付密码初始化、重置1.0")
    public JSONObject accountPasswordReset1(String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("password", password);//密码,不参与签名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.password.reset");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询支付口令1.0
     *
     * @return response
     * @
     */
    @Step("查询支付口令1.0")
    public JSONObject accountPasswordaliasQuery1(String password, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("password", password);//密码,不参与签名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.passwordalias.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//用户标识


        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 日报明细表下载管理1.0
     *
     * @return response
     * @
     */
    @Step("日报明细表下载管理1.0")
    public JSONObject accountReceiptBathDownload1(String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始位置
        map.put("limit", limit);//分页每页数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.receipt.bath.download");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 回单打包1.0
     *
     * @return response
     * @
     */
    @Step("回单打包1.0")
    public JSONObject accountReceiptPackage1(String startTime, String endTime, String expenseType, String tradeType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//交易开始时间 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//交易结束时间 yyyy-MM-dd hh:mm:ss
        map.put("expenseType", expenseType);//收支类型 1收 2支
        map.put("tradeType", tradeType);//1下单-余额冻结 2线下充值 3支付调度费 4支付司机运费 5余额解冻
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.receipt.package");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 电子回单查看1.0
     *
     * @return response
     * @
     */
    @Step("电子回单查看1.0")
    public JSONObject accountReceiptUrl1(String thirdCode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("thirdCode", thirdCode);//第三方流水
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.receipt.url");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 校验短信验证码1.0
     *
     * @return response
     * @
     */
    @Step("校验短信验证码1.0")
    public JSONObject accountSmsCheck1(String testNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("testNum", testNum);//验证码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 忘记支付密码,发送短信验证码1.0
     *
     * @return response
     * @
     */
    @Step("忘记支付密码,发送短信验证码1.0")
    public JSONObject accountSmsSend1(String phoneNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phoneNum", phoneNum);//手机号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.sms.send");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包账户和油卡账户查询1.0
     *
     * @return response
     * @
     */
    @Step("钱包账户和油卡账户查询1.0")
    public JSONObject accountWallet_oilcardQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "account.wallet_oilcard.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 余额，账期提醒发送短信1.0
     *
     * @return response
     * @
     */
    @Step("余额，账期提醒发送短信1.0")
    public JSONObject balanceAlert1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "balance.alert");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 提醒列表1.0
     *
     * @return response
     * @
     */
    @Step("提醒列表1.0")
    public JSONObject balanceAlertList1(String type, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);//0:所有1:余额 2:账期
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "balance.alert.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加更新列表,添加更新金额1.0
     *
     * @return response
     * @
     */
    @Step("添加更新列表,添加更新金额1.0")
    public JSONObject balanceAlertUpsert1(String money, String alertRuleType, String people, String isOpen) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//金额阈值
        map.put("alertRuleType", alertRuleType);//1, 钱包余额 2, 账期余额
        map.put("people", people);//json字符串 [{'alertpeoplename':'AA','alertpeoplemobile':'123456'},{'alertpeoplename':'BB','alertpeoplemobile':'654321'}]
        map.put("isOpen", isOpen);//是否开启1 开启 0关闭
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "balance.alert.upsert");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 绑定银行卡1.0
     *
     * @return response
     * @
     */
    @Step("绑定银行卡1.0")
    public JSONObject bankcardBind1(String testNum, String cardNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("testNum", testNum);//验证码
        map.put("cardNum", cardNum);//卡号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.bind");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询绑定的银行卡1.0
     *
     * @return response
     * @
     */
    @Step("查询绑定的银行卡1.0")
    public JSONObject bankcardBoundQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.bound.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 校验卡号、姓名、身份证1.0
     *
     * @return response
     * @
     */
    @Step("校验卡号、姓名、身份证1.0")
    public JSONObject bankcardCheckMatch1(String realName, String cardidNum, String cardNum, String cardPhone, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("realName", realName);//真实姓名
        map.put("cardidNum", cardidNum);//身份证
        map.put("cardNum", cardNum);//银行卡号
        map.put("cardPhone", cardPhone);//银行预留手机号码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.check.match");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 解除绑定1.0
     *
     * @return response
     * @
     */
    @Step("解除绑定1.0")
    public JSONObject bankcardRemove1(String cardNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardNum", cardNum);//卡号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.remove");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 绑定银行卡时发送短信1.0
     *
     * @return response
     * @
     */
    @Step("绑定银行卡时发送短信1.0")
    public JSONObject bankcardSmsSend1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.sms.send");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 支持绑定银行卡列表1.0
     *
     * @return response
     * @
     */
    @Step("支持绑定银行卡列表1.0")
    public JSONObject bankcardSupportlistQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.supportlist.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询支持的银行卡列表(返回url)1.0
     *
     * @return response
     * @
     */
    @Step("查询支持的银行卡列表(返回url)1.0")
    public String bankcardSupportlistQueryUrl1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bankcard.supportlist.query.url");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnData();
    }

    /**
     * 调度时批量查看合同(不需要过滤)1.0
     *
     * @return response
     * @
     */
    @Step("调度时批量查看合同(不需要过滤)1.0")
    public JSONObject contractBatchfindbydd1(String orderNums, String contractType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNums", orderNums);//批量查询合同模板的ordernums
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.batchfindByDD");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度时批量查看合同(不需要过滤，拼装字段给web)1.0
     *
     * @return response
     * @
     */
    @Step("调度时批量查看合同(不需要过滤，拼装字段给web)1.0")
    public JSONObject contractBatchfindbyddNew1(String orderNums, String contractType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNums", orderNums);//批量查询合同模板的ordernums
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.batchfindByDD.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量签署合同(其实是预签署，正式签署归金融处理)1.0
     *
     * @return response
     * @
     */
    @Step("批量签署合同(其实是预签署，正式签署归金融处理)1.0")
    public JSONObject contractBatchpresign1(String orderNums, String contractNums, String contractType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNums", orderNums);//批量预签署的运单号,批量用逗号隔开
        map.put("contractNums", contractNums);//批量预签署的合同编号
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.batchpresign");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度时批量查看合同(需要过滤)1.0
     *
     * @return response
     * @
     */
    @Step("调度时批量查看合同(需要过滤)1.0")
    public JSONObject contractFiltbatchfindbydd1(String orderNums, String contractType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNums", orderNums);//批量查询合同模板的ordernums
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.filtbatchfindByDD");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度时批量查看合同(需要过滤,拼装字段给web)1.0
     *
     * @return response
     * @
     */
    @Step("调度时批量查看合同(需要过滤,拼装字段给web)1.0")
    public JSONObject contractFiltbatchfindbyddNew1(String orderNums, String contractType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNums", orderNums);//批量查询合同模板的ordernums
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.filtbatchfindByDD.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 绑卡时查看合同模板1.0
     *
     * @return response
     * @
     */
    @Step("绑卡时查看合同模板1.0")
    public JSONObject contractFindCard1(String cardNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardNum", cardNum);//卡号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.find.card");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单时调度查看合同模板1.0
     *
     * @return response
     * @
     */
    @Step("运单时调度查看合同模板1.0")
    public JSONObject contractFindbydd1(String orderNum, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单编号
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.findByDD");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单时调度查看合同模板(拼装字段给web)1.0
     *
     * @return response
     * @
     */
    @Step("运单时调度查看合同模板(拼装字段给web)1.0")
    public JSONObject contractFindbyddNew1(String orderNum, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单编号
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.findByDD.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机抢单之前查看合同1.0
     *
     * @return response
     * @
     */
    @Step("司机抢单之前查看合同1.0")
    public JSONObject contractFindbydriver1(String stockcode, String leaderdrivercode, String agentcode, String contacttype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("leaderdrivercode", leaderdrivercode);//车队长编码
        map.put("agentcode", agentcode);//经纪人编码
        map.put("contacttype", contacttype);//合同类型 1 运输合同 2经纪人合同 3保证金合同
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.findbydriver");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长抢单查看合同模板1.0
     *
     * @return response
     * @
     */
    @Step("车队长抢单查看合同模板1.0")
    public JSONObject contractFindbyleaderdriver1(String stockcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.findbyleaderdriver");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 察看是否签署合同1.0
     *
     * @return response
     * @
     */
    @Step("察看是否签署合同1.0")
    public JSONObject contractIssign1(String contractNum, String clientType, String ordernumber, String isHidden) {
        HashMap<String, String> map = new HashMap<>();
        map.put("contractNum", contractNum);//合同编号
        map.put("clientType", clientType);//客户端类型 0web 1APP
        map.put("ordernumber", ordernumber);//运单号
        map.put("isHidden", isHidden);//是否隐藏合同现金部分 0 不隐藏 1 隐藏
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.isSign");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长抢单签署合同1.0
     *
     * @return response
     * @
     */
    @Step("车队长抢单签署合同1.0")
    public JSONObject contractLeaderPresigncontract1(String contractNo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("contractNo", contractNo);//合同号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.leader.presigncontract");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查看正式合同1.0
     *
     * @return response
     * @
     */
    @Step("查看正式合同1.0")
    public JSONObject contractOfffind1(String contractNum, String clientType, String ordernumber, String isHidden) {
        HashMap<String, String> map = new HashMap<>();
        map.put("contractNum", contractNum);//合同编号
        map.put("clientType", clientType);//客户端类型 0web 1APP
        map.put("ordernumber", ordernumber);//运单号
        map.put("isHidden", isHidden);//是否隐藏合同现金部分 0 不隐藏 1 隐藏
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.offfind");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 签署合同(其实是预签署，正式签署归金融处理)1.0
     *
     * @return response
     * @
     */
    @Step("签署合同(其实是预签署，正式签署归金融处理)1.0")
    public JSONObject contractPresign1(String orderNum, String contractNum, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("contractNum", contractNum);//合同编号
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同,4:非委托变成委托协议 5卸货地修改协议
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.presign");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查看自动签署属性1.0
     *
     * @return response
     * @
     */
    @Step("查看自动签署属性1.0")
    public JSONObject contractSetfind1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.setfind");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查看自动签署属性(转账)1.0
     *
     * @return response
     * @
     */
    @Step("查看自动签署属性(转账)1.0")
    public JSONObject contractSetfindBytrans1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.setfind.byTrans");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改合同是否自动签署属性1.0
     *
     * @return response
     * @
     */
    @Step("修改合同是否自动签署属性1.0")
    public JSONObject contractSetupdate1(String isAuto) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isAuto", isAuto);//是否自动签署 0否, 1是
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.setupdate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改合同是否自动签署属性(转账)1.0
     *
     * @return response
     * @
     */
    @Step("修改合同是否自动签署属性(转账)1.0")
    public JSONObject contractSetupdateBytrans1(String isAuto) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isAuto", isAuto);//是否自动签署 0否, 1是
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contract.setupdate.byTrans");//接口路径
        map.put("format", "json");//数据交互格式
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
    @Step("1.0")
    public JSONObject creditBorrowingagreementPreview1(String money) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//借款金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.borrowingagreement.preview");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 借款协议预览1.1
     *
     * @return response
     * @
     */
    @Step("借款协议预览1.1")
    public JSONObject creditBorrowingagreementPreview11(String money) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//借款金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.borrowingagreement.preview");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.1");//接口版本
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
    @Step("1.0")
    public JSONObject creditBorrowingagreementQuery1(String loanNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("loanNo", loanNo);//借款编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.borrowingagreement.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询借款协议1.1
     *
     * @return response
     * @
     */
    @Step("查询借款协议1.1")
    public JSONObject creditBorrowingagreementQuery11(String loanNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("loanNo", loanNo);//借款编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.borrowingagreement.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.1");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 信用账户明细变动查询1.0
     *
     * @return response
     * @
     */
    @Step("信用账户明细变动查询1.0")
    public JSONObject creditChangedetailQuerylist1(String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.changedetail.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 信用账单头信息1.0
     *
     * @return response
     * @
     */
    @Step("信用账单头信息1.0")
    public JSONObject creditCreditbillOverview1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.creditbill.overview");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 信用账单列表查询1.0
     *
     * @return response
     * @
     */
    @Step("信用账单列表查询1.0")
    public JSONObject creditCreditbillQuerylist1(String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.creditbill.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
    @Step("1.0")
    public JSONObject creditCreditdetailQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.creditdetail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 信用借款账单明细1.0
     *
     * @return response
     * @
     */
    @Step("信用借款账单明细1.0")
    public JSONObject creditLoanDetail1(String orderNum, String beginTime, String endTime, String state, String allState, String pageNo, String pageSize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("beginTime", beginTime);//借款开始时间
        map.put("endTime", endTime);//借款结束时间
        map.put("state", state);//状态 0待发标, 1招标中, 2放款中, 3还款中, 4已还款, 5 已逾期 , 6 已回收, 7已坏账, 8待审核, 9提前还
        map.put("allState", allState);//是否全选 0:代表根据状态来查询 1:代表查询所有状态的数据
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.loan.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 信用账户基本信息查询1.0
     *
     * @return response
     * @
     */
    @Step("信用账户基本信息查询1.0")
    public JSONObject creditQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 确认提前还款1.0
     *
     * @return response
     * @
     */
    @Step("确认提前还款1.0")
    public JSONObject creditRepaymentConfirm1(String repayNo, String prePaymentMoney) {
        HashMap<String, String> map = new HashMap<>();
        map.put("repayNo", repayNo);//还款单号
        map.put("prePaymentMoney", prePaymentMoney);//准备还款的金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.repayment.confirm");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 提前还款申请1.0
     *
     * @return response
     * @
     */
    @Step("提前还款申请1.0")
    public JSONObject creditRepaymentPreapply1(String prePaymentMoney) {
        HashMap<String, String> map = new HashMap<>();
        map.put("prePaymentMoney", prePaymentMoney);//提前还款金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.repayment.preapply");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 还款记录列表查询1.0
     *
     * @return response
     * @
     */
    @Step("还款记录列表查询1.0")
    public JSONObject creditRepaymentQuerylist1(String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "credit.repayment.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * etc充值明细列表查询1.0
     *
     * @return response
     * @
     */
    @Step("etc充值明细列表查询1.0")
    public JSONObject etcDetailQuery1(String userCode, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userCode", userCode);//用户编码
        map.put("pageNo", pageNo);//页数
        map.put("pageSize", pageSize);//页数大小
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.detail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * etc充值1.0
     *
     * @return response
     * @
     */
    @Step("etc充值1.0")
    public JSONObject etcRecharge1(String etcNum, String transAmount) {
        HashMap<String, String> map = new HashMap<>();
        map.put("etcNum", etcNum);//ETC卡号
        map.put("transAmount", transAmount);//充值金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.recharge");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 账期还款详情1.0
     *
     * @return response
     * @
     */
    @Step("账期还款详情1.0")
    public JSONObject getAccPeriodPayDetail1(String ordernumbers, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号，多个以逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "get.acc.period.pay.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询账期账户详情1.0
     *
     * @return response
     * @
     */
    @Step("查询账期账户详情1.0")
    public JSONObject laterpayAccountDetail1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.account.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询收款明细1.0
     *
     * @return response
     * @
     */
    @Step("查询收款明细1.0")
    public JSONObject laterpayDetailList1(String querytype, String querydate, String pagenum) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//查询类型 0应收款 1已收款
        map.put("querydate", querydate);//时间。格式yyyyMM 比如201806。若不传则查询当月
        map.put("pagenum", pagenum);//页码 从1开始
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.detail.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180424經紀人按天查询已收款列表1.0
     *
     * @return response
     * @
     */
    @Step("20180424經紀人按天查询已收款列表1.0")
    public JSONObject laterpayDetailQueryAgentDayList1(String begindate, String enddate, String start, String limit, String querytype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//起始時間
        map.put("enddate", enddate);//截止時間
        map.put("start", start);//起始頁分頁
        map.put("limit", limit);//分頁參數 limit
        map.put("querytype", querytype);//查詢類型 1已收 2待付
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.detail.query.agent.day.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180424經紀人查询已收款列表(按天排序分列)1.0
     *
     * @return response
     * @
     */
    @Step("20180424經紀人查询已收款列表(按天排序分列)1.0")
    public JSONObject laterpayDetailQueryAgentEarningList1(String querytype) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//查詢類型 1 已收 2待付
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.detail.query.agent.earning.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业查询待支付的账期详情列表1.0
     *
     * @return response
     * @
     */
    @Step("企业查询待支付的账期详情列表1.0")
    public JSONObject laterpayDetailQueryCompanyExpendList1(String startTime, String endTime) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//开始时间查询 时间戳
        map.put("endTime", endTime);//结束时间查询时间戳
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.detail.query.company.expend.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询待收入的账期列表1.0
     *
     * @return response
     * @
     */
    @Step("司机查询待收入的账期列表1.0")
    public JSONObject laterpayDetailQueryDriverEarningList1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.detail.query.driver.earning.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询已收款列表1.0
     *
     * @return response
     * @
     */
    @Step("司机查询已收款列表1.0")
    public JSONObject laterpayDetailQueryDriverEarningListPayed1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.detail.query.driver.earning.list.payed");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询指定时间的明细详情1.0
     *
     * @return response
     * @
     */
    @Step("查询指定时间的明细详情1.0")
    public JSONObject laterpayQueryOrderDetail1(String querytype, String pagenum, String pagesize, String querydate) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querytype", querytype);//查询类型 0应收款 1已收款
        map.put("pagenum", pagenum);//页码 从1开始
        map.put("pagesize", pagesize);//页记录数
        map.put("querydate", querydate);//查询时间
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.query.order.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过orderNumber的集合查询相关运单信息1.0
     *
     * @return response
     * @
     */
    @Step("通过orderNumber的集合查询相关运单信息1.0")
    public JSONObject laterpayQueryStocklist1(String ordernumbers, String pagenum, String pagesize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号的集合，用“,”隔开
        map.put("pagenum", pagenum);//页码 从1开始
        map.put("pagesize", pagesize);//一页显示的记录条数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.query.stocklist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业查询待支付的账单列表1.0
     *
     * @return response
     * @
     */
    @Step("企业查询待支付的账单列表1.0")
    public JSONObject laterpayResultQueryCompanyExpendList1(String startTime, String endTime) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//开始时间 yyyy-MM-dd HH:mm:ss
        map.put("endTime", endTime);//结束时间 yyyy-MM-dd HH:mm:ss
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.result.query.company.expend.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业查询冻结待账单列表1.0
     *
     * @return response
     * @
     */
    @Step("企业查询冻结待账单列表1.0")
    public JSONObject laterpayResultQueryCompanyForzeList1(String querydate) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querydate", querydate);//查询时间，传入月份即可，格式yyyyDD 比如201806
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.result.query.company.forze.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询账户是否开启账期，以及账期状态1.0
     *
     * @return response
     * @
     */
    @Step("查询账户是否开启账期，以及账期状态1.0")
    public JSONObject laterpayStater1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "laterpay.stater");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡绑定1.0
     *
     * @return response
     * @
     */
    @Step("油卡绑定1.0")
    public JSONObject oilcardBind1(String cardNum, String nickName, String clientType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardNum", cardNum);//卡号
        map.put("nickName", nickName);//卡号别名
        map.put("clientType", clientType);//客户端端类型：0Web,1App
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.bind");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询绑定的油卡列表1.0
     *
     * @return response
     * @
     */
    @Step("查询绑定的油卡列表1.0")
    public JSONObject oilcardBoundlistQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.boundlist.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票公司查询1.0
     *
     * @return response
     * @
     */
    @Step("开票公司查询1.0")
    public JSONObject oilcardCompanyQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.company.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡账户明细列表1.0
     *
     * @return response
     * @
     */
    @Step("油卡账户明细列表1.0")
    public JSONObject oilcardDetaillistQuery1(String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.detaillist.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡挂失申请1.0
     *
     * @return response
     * @
     */
    @Step("油卡挂失申请1.0")
    public JSONObject oilcardLossReport1(String cardNum) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardNum", cardNum);//卡号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.loss.report");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改油卡账户信息1.0
     *
     * @return response
     * @
     */
    @Step("修改油卡账户信息1.0")
    public JSONObject oilcardModify1(String cardNum, String nickName) {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardNum", cardNum);//卡号
        map.put("nickName", nickName);//油卡别名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.modify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡调度费查询(通过油卡运输金额)1.0
     *
     * @return response
     * @
     */
    @Step("油卡调度费查询(通过油卡运输金额)1.0")
    public JSONObject oilcardMoneyQuery1(String oilMoney, String transAmount, String etcMoney, String rateType, String stocknature, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oilMoney", oilMoney);//油卡运输金额
        map.put("transAmount", transAmount);//总运费 交易发起方是非物易云通时产生
        map.put("etcMoney", etcMoney);//etc费用
        map.put("rateType", rateType);//类型 1理论调度费 2实收调度费
        map.put("stocknature", stocknature);//货源性质 0承运 1非承运
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.money.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 新的调度费查询1.0
     *
     * @return response
     * @
     */
    @Step("新的调度费查询1.0")
    public JSONObject oilcardMoneyQueryAll1(String orderNum, String oilMoney, String transAmount, String etcMoney, String rateType, String stocknature) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("oilMoney", oilMoney);//油卡运输金额
        map.put("transAmount", transAmount);//总运费 交易发起方是非物易云通时产生
        map.put("etcMoney", etcMoney);//etc费用
        map.put("rateType", rateType);//类型 1理论调度费 2实收调度费
        map.put("stocknature", stocknature);//货源性质 0承运 1非承运
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.money.query.all");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡账户查询1.0
     *
     * @return response
     * @
     */
    @Step("油卡账户查询1.0")
    public JSONObject oilcardQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡调度费查询(通过油卡比例)1.0
     *
     * @return response
     * @
     */
    @Step("油卡调度费查询(通过油卡比例)1.0")
    public JSONObject oilcardRateQuery1(String oilScale, String transAmount, String rateType) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oilScale", oilScale);//油卡比例，例如比例是12% 就传12
        map.put("transAmount", transAmount);//总运费 交易发起方是非物易云通时产生
        map.put("rateType", rateType);//类型 1理论调度费 2实收调度费
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.rate.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡查看自动签署属性1.0
     *
     * @return response
     * @
     */
    @Step("油卡查看自动签署属性1.0")
    public JSONObject oilcardSetfind1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.setfind");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改油卡合同是否自动签署属性1.0
     *
     * @return response
     * @
     */
    @Step("修改油卡合同是否自动签署属性1.0")
    public JSONObject oilcardSetupdate1(String isAuto) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isAuto", isAuto);//是否自动签署 0否, 1是
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.setupdate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 将油卡账户中的部分金额转入油卡(提现)1.0
     *
     * @return response
     * @
     */
    @Step("将油卡账户中的部分金额转入油卡(提现)1.0")
    public JSONObject oilcardWithdraw1(String oilMoney, String cardNum) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oilMoney", oilMoney);//提现金额
        map.put("cardNum", cardNum);//卡号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilcard.withdraw");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询加油枪信息1.0
     *
     * @return response
     * @
     */
    @Step("查询加油枪信息1.0")
    public JSONObject oilmanQuery1(String url, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("url", url);//二维码地址
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilman.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 燃料供应单查询详情1.0
     *
     * @return response
     * @
     */
    @Step("燃料供应单查询详情1.0")
    public JSONObject oilpreconsumeQueryDetail1(String oiltradeid, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oiltradeid", oiltradeid);//燃料交易id
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilpreconsume.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询燃料供应单明细1.0
     *
     * @return response
     * @
     */
    @Step("查询燃料供应单明细1.0")
    public JSONObject oilpreconsumeQueryList1(String querydate, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querydate", querydate);//查询日期 比如201807。默认当月
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilpreconsume.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询账期还款批次列表1.0
     *
     * @return response
     * @
     */
    @Step("查询账期还款批次列表1.0")
    public JSONObject queryAccPeriodPayBatchList1(String batchnumber, String handlestatus, String begindate, String enddate, String clientdate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("batchnumber", batchnumber);//批次号，供web端使用
        map.put("handlestatus", handlestatus);//处理状态，0-全部，1-处理中，2-已完成，供web端使用
        map.put("begindate", begindate);//开始时间的时间戳，供web端使用
        map.put("enddate", enddate);//结束时间的时间戳，供web端使用
        map.put("clientdate", clientdate);//批次查询时间，如201811，供APP端使用
        map.put("start", start);//分页起始值
        map.put("limit", limit);//分页数量
        map.put("appcode", appcode);//应用程序编码
        map.put("session", session);//
        map.put("method", "query.acc.period.pay.batch.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 根据批次ID查询账期还款明细列表1.0
     *
     * @return response
     * @
     */
    @Step("根据批次ID查询账期还款明细列表1.0")
    public JSONObject queryAccPeriodPayDetailListByBatchid1(String batchid, String keyword, String handlestatus, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("batchid", batchid);//批次ID
        map.put("keyword", keyword);//关键字，供web端使用
        map.put("handlestatus", handlestatus);//处理状态，0-全部，1-还款成功，2-处理中，3-还款失败，供web端使用
        map.put("start", start);//分页起始值
        map.put("limit", limit);//分页数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.acc.period.pay.detail.list.by.batchid");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//接口版本

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询选中的运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询选中的运单列表1.0")
    public JSONObject queryAccPeriodPaySelectedList1(String ordernumbers) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号，多个以逗号分隔
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.acc.period.pay.selected.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询账期待还款明细列表1.0
     *
     * @return response
     * @
     */
    @Step("查询账期待还款明细列表1.0")
    public JSONObject queryAccPeriodPayWaitingList1(String overdue, String start, String limit, String begindate, String enddate, String loadaddressname, String unloadaddressname, String platecode, String agentcode, String keyword, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("overdue", overdue);//是否逾期，0-全部，1-已逾期，2-未逾期
        map.put("start", start);//分页起始值
        map.put("limit", limit);//分页数量
        map.put("begindate", begindate);//开始时间的时间戳
        map.put("enddate", enddate);//结束时间的时间戳
        map.put("loadaddressname", loadaddressname);//装货地址
        map.put("unloadaddressname", unloadaddressname);//卸货地址
        map.put("platecode", platecode);//车牌号
        map.put("agentcode", agentcode);//经纪人Code
        map.put("keyword", keyword);//关键字，web端查询需要
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.acc.period.pay.waiting.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("session", session);//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 签约信息1.0
     *
     * @return response
     * @
     */
    @Step("签约信息1.0")
    public JSONObject signInformation1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "sign.information");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改卸货地补充协议1.0
     *
     * @return response
     * @
     */
    @Step("修改卸货地补充协议1.0")
    public JSONObject supplyAddressContract1(String orderNum, String targetCode, String userCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("targetCode", targetCode);//修改后的卸货地地址code
        map.put("userCode", userCode);//用户编码,微信推送消息用,没有session时候传
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "supply.address.contract");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 补充运输协议,非委托补签1.0
     *
     * @return response
     * @
     */
    @Step("补充运输协议,非委托补签1.0")
    public JSONObject supplyContract1(String orderNum, String userCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("userCode", userCode);//没有session传userCode
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "supply.contract");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改运费方案补充协议1.0
     *
     * @return response
     * @
     */
    @Step("修改运费方案补充协议1.0")
    public JSONObject supplyPaysolutionContract1(String orderNum, String userCode, String cashMoney, String etcMoney, String oilMoney, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("userCode", userCode);//用户编码,微信推送消息用,没有session时候传
        map.put("cashMoney", cashMoney);//现金金额
        map.put("etcMoney", etcMoney);//etc金额
        map.put("oilMoney", oilMoney);//油金额
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "supply.paysolution.contract");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票记录金额1.0
     *
     * @return response
     * @
     */
    @Step("开票记录金额1.0")
    public JSONObject taxbillAmountQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.amount.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 申请开票1.0
     *
     * @return response
     * @
     */
    @Step("申请开票1.0")
    public JSONObject taxbillApply1(String taxAmount, String recipients, String phone, String area, String address, String taxBillId, String provinceCode, String province, String cityCode, String city, String countryCode, String country) {
        HashMap<String, String> map = new HashMap<>();
        map.put("taxAmount", taxAmount);//开票金额
        map.put("recipients", recipients);//收件人
        map.put("phone", phone);//联系电话
        map.put("area", area);//所在地区
        map.put("address", address);//详细地址
        map.put("taxBillId", taxBillId);//待开票ID集合
        map.put("provinceCode", provinceCode);//省code
        map.put("province", province);//省名称
        map.put("cityCode", cityCode);//市code
        map.put("city", city);//市名称
        map.put("countryCode", countryCode);//区code
        map.put("country", country);//区名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.apply");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 撤销开票申请1.0
     *
     * @return response
     * @
     */
    @Step("撤销开票申请1.0")
    public JSONObject taxbillCancel1(String applyId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("applyId", applyId);//申请开票id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 快递查询1.0
     *
     * @return response
     * @
     */
    @Step("快递查询1.0")
    public JSONObject taxbillExpressQuery1(String expressNum, String expressType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("expressNum", expressNum);//快递单号
        map.put("expressType", expressType);//快递类型
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.express.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询不可开票列表1.0
     *
     * @return response
     * @
     */
    @Step("查询不可开票列表1.0")
    public JSONObject taxbillFailListQuery1(String startTime, String endTime, String state, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//开始时间查询 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//结束时间查询 yyyy-MM-dd hh:mm:ss
        map.put("state", state);//状态 不传查询所有,1待开票 4 审核失败 5审核中
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.fail.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 申请开票查询1.0
     *
     * @return response
     * @
     */
    @Step("申请开票查询1.0")
    public JSONObject taxbillFindQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.find.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询可开票列表1.0
     *
     * @return response
     * @
     */
    @Step("查询可开票列表1.0")
    public JSONObject taxbillListQuery1(String startTime, String endTime, String state, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//开始时间查询 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//结束时间查询 yyyy-MM-dd hh:mm:ss
        map.put("state", state);//状态 不传查询所有,1待开票 4 审核失败 5审核中
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询开票列表(包含不能开票)1.0
     *
     * @return response
     * @
     */
    @Step("查询开票列表(包含不能开票)1.0")
    public JSONObject taxbillListQueryAll1(String startTime, String endTime, String state, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("startTime", startTime);//开始时间查询 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//结束时间查询 yyyy-MM-dd hh:mm:ss
        map.put("state", state);//状态 不传查询所有,1待开票 4 审核失败 5审核中
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.list.query.all");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询所含运单列表1.0
     *
     * @return response
     * @
     */
    @Step("查询所含运单列表1.0")
    public JSONObject taxbillListQuerybyid1(String applyId, String startTime, String endTime, String state, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("applyId", applyId);//申请开票id
        map.put("startTime", startTime);//开始时间查询 yyyy-MM-dd hh:mm:ss
        map.put("endTime", endTime);//结束时间查询 yyyy-MM-dd hh:mm:ss
        map.put("state", state);//状态 不传查询所有,1待开票 4 审核失败
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.list.querybyid");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票补齐信息通知接口1.0
     *
     * @return response
     * @
     */
    @Step("开票补齐信息通知接口1.0")
    public JSONObject taxbillNotice1(String applyId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("applyId", applyId);//申请开票id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 开票历史记录1.0
     *
     * @return response
     * @
     */
    @Step("开票历史记录1.0")
    public JSONObject taxbillTradelistQuery1(String status, String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", status);//状态 1待开票 2受理中 3已寄出 4已签收 5已撤消
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.tradelist.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 补充开票资料1.0
     *
     * @return response
     * @
     */
    @Step("补充开票资料1.0")
    public JSONObject taxbillUpdate1(String applyId, String orderNum, String url) {
        HashMap<String, String> map = new HashMap<>();
        map.put("applyId", applyId);//申请开票id
        map.put("orderNum", orderNum);//运单号
        map.put("url", url);//补充资料链接
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "taxbill.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量创建订单支付1.0
     * payType
     * 1：余额支付
     * 2：信用支付
     * 3：支付宝支付
     * 4：微信
     * 5：易宝
     * 12：余额+信用
     * 13：余额+支付宝
     * 14：余额+微信
     * 15：余额+易宝
     *
     * @return response
     * @
     */
    @Step("批量创建订单支付1.0")
    public JSONObject tradeOrderBatchCreate1(String data, String totleMoney, String payType, String cardNum, String accountId, String isQRCode, String passwordalias, String paytypereturnurl, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//请求json串
        map.put("totleMoney", totleMoney);//总共支付费用
        map.put("payType", payType);//支付方式
        map.put("cardNum", cardNum);//卡号或者信用号
        map.put("accountId", accountId);//钱包账号id
        map.put("isQRCode", isQRCode);//是否使用二维码
        map.put("passwordalias", passwordalias);//支付口令
        map.put("paytypereturnurl", paytypereturnurl);//回调url
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.batch.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量创建订单账期支付1.0
     *
     * @return response
     * @
     */
    @Step("批量创建订单账期支付1.0")
    public JSONObject tradeOrderBatchCreateLaterpay1(String orderNums, String contractNums, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNums", orderNums);//批量预签署的运单号,批量用逗号隔开
        map.put("contractNums", contractNums);//批量预签署的合同编号
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.batch.create.laterpay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 批量创建订单支付(增加签署合同逻辑)1.0
     * 1：余额支付
     * 2：信用支付
     * 3：支付宝支付
     * 4：微信
     * 5：易宝
     * 12：余额+信用
     * 13：余额+支付宝
     * 14：余额+微信
     * 15：余额+易宝
     *
     * @return response
     * @
     */
    @Step("批量创建订单支付(增加签署合同逻辑)1.0")
    public JSONObject tradeOrderBatchCreateNew1(String data, String totleMoney, String payType, String cardNum, String accountId, String isQRCode, String passwordalias, String paytypereturnurl, String contractType, String balance, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//请求json串
        map.put("totleMoney", totleMoney);//总共支付费用
        map.put("payType", payType);//支付方式
        map.put("cardNum", cardNum);//卡号或者信用号
        map.put("accountId", accountId);//钱包账号id
        map.put("isQRCode", isQRCode);//是否使用二维码
        map.put("balance", balance);//是否使用二维码

        map.put("passwordalias", passwordalias);//支付口令
        map.put("paytypereturnurl", paytypereturnurl);//回调url
        map.put("contractType", contractType);//合同类型, 0:web运单合同,1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.batch.create.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("system", "android");
        headers.put("channel", "sijibao");
        headers.put("screen", "1080*2190");
        headers.put("model", "COL-AL10");
        headers.put("deviceCode", "869378037085040");
        headers.put("systemVersion", "9");
        headers.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 9; COL-AL10 Build/HUAWEICOL-AL10)");

        return new BaseCall(url, "POST").setData(map).addHeaders(headers).callService().close().getReturnJsonObject();
    }

    /**
     * 订单支付查询1.0
     * 1：余额支付
     * 2：信用支付
     * 3：支付宝支付
     * 4：微信
     * 5：易宝
     * 12：余额+信用
     * 13：余额+支付宝
     * 14：余额+微信
     * 15：余额+易宝
     *
     * @return response
     * @
     */
    @Step("订单支付查询1.0")
    public JSONObject tradeOrderBatchPre1(String ordernumbers, String paytype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//批量运单号,用逗号隔开
        map.put("paytype", paytype);//支付方式
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.batch.pre");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建订单支付1.0
     * 1：余额支付
     * 2：信用支付
     * 3：支付宝支付
     * 4：微信
     * 5：易宝
     * 12：余额+信用
     * 13：余额+支付宝
     * 14：余额+微信
     * 15：余额+易宝
     *
     * @return response
     * @
     */
    @Step("创建订单支付1.0")
    public JSONObject tradeOrderCreate1(String orderNum, String money, String payType, String cardNum, String balance, String charge, String reduce, String accountId, String isQRCode, String passwordalias, String paytypereturnurl, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("money", money);//总共支付费用
        map.put("payType", payType);//支付方式
        map.put("cardNum", cardNum);//卡号或者信用号
        map.put("balance", balance);//
        map.put("charge", charge);//手续费
        map.put("reduce", reduce);//优惠金额
        map.put("accountId", accountId);//钱包账号id
        map.put("isQRCode", isQRCode);//是否使用二维码
        map.put("passwordalias", passwordalias);//支付口令 信用和余额支付需要验证
        map.put("paytypereturnurl", paytypereturnurl);//回调url
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建订单支付(增加签署合同逻辑)1.0
     * 1：余额支付
     * 2：信用支付
     * 3：支付宝支付
     * 4：微信
     * 5：易宝
     * 12：余额+信用
     * 13：余额+支付宝
     * 14：余额+微信
     * 15：余额+易宝
     *
     * @return response
     * @
     */
    @Step("创建订单支付(增加签署合同逻辑)1.0")
    public JSONObject tradeOrderCreateNew1(String orderNum, String money, String payType, String cardNum, String balance, String charge, String reduce, String accountId, String isQRCode, String passwordalias, String paytypereturnurl, String contractType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNum", orderNum);//运单号
        map.put("money", money);//总共支付费用
        map.put("payType", payType);//支付方式
        map.put("cardNum", cardNum);//卡号或者信用号
        map.put("balance", balance);//
        map.put("charge", charge);//手续费
        map.put("reduce", reduce);//优惠金额
        map.put("accountId", accountId);//钱包账号id
        map.put("isQRCode", isQRCode);//是否使用二维码
        map.put("passwordalias", passwordalias);//支付口令 信用和余额支付需要验证
        map.put("paytypereturnurl", paytypereturnurl);//回调url
        map.put("contractType", contractType);//合同类型 0:web运单合同，1:app运单合同
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.create.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 订单相关文案查询1.0
     * 1：余额支付
     * 2：信用支付
     * 3：支付宝支付
     * 4：微信
     * 5：易宝
     * 12：余额+信用
     * 13：余额+支付宝
     * 14：余额+微信
     * 15：余额+易宝
     *
     * @return response
     * @
     */
    @Step("订单相关文案查询1.0")
    public JSONObject tradeOrderDocQuery1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.order.doc.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建充值1.0
     *
     * @return response
     * @
     */
    @Step("创建充值1.0")
    public JSONObject tradeRechargeCreate1(String money, String payType, String cardNum, String isQRCode, String paytypereturnurl, String openid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//充值金额
        map.put("payType", payType);//支付类型 1余额支付 2信用支付 3支付宝 4微信 5易宝 12余额+信用 13余额+支付宝 14余额+微信 15余额+易宝
        map.put("cardNum", cardNum);//银行卡号，只有使用银行卡充时才使用，不能获取银行卡号时，取银行卡编号
        map.put("isQRCode", isQRCode);//是否使用二维码
        map.put("paytypereturnurl", paytypereturnurl);//回调url
        map.put("openid", openid);//微信openid
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.recharge.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建提现1.0
     *
     * @return response
     * @
     */
    @Step("创建提现1.0")
    public JSONObject tradeWithdrawCreate1(String money, String cardNum, String passwordalias, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//提现金额
        map.put("cardNum", cardNum);//银行卡号
        map.put("passwordalias", passwordalias);//支付口令
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.withdraw.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询提现记录列表1.0
     *
     * @return response
     * @
     */
    @Step("查询提现记录列表1.0")
    public JSONObject tradeWithdreaQueryList1(String pageNo, String pageSize) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.withdrea.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询提现记录列表1.0
     *
     * @return response
     * @
     */
    @Step("查询提现记录列表1.0")
    public JSONObject tradeWithdreaQueryListNew1(String beginDate, String endDate, String pageNo, String pageSize, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageNo", pageNo);//
        map.put("pageSize", pageSize);//
        map.put("beginDate", beginDate);//开始时间
        map.put("endDate",endDate);//结束时间
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "trade.withdrea.query.list.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加转账银行卡信息1.0
     *
     * @return response
     * @
     */
    @Step("添加转账银行卡信息1.0")
    public JSONObject transferAddBank1(String bankCardNumber, String holderName, String passwordalias, String bankName, String idCard, String checkNum, String phoneNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("holderName", holderName);//银行卡持有人姓名
        map.put("passwordalias", passwordalias);//支付口令
        map.put("bankName", bankName);//银行卡名称
        map.put("idCard", idCard);//身份证号
        map.put("checkNum", checkNum);//验证码
        map.put("phoneNum", phoneNum);//用户电话
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.add.bank");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 验证添加转账银行卡信息1.0
     *
     * @return response
     * @
     */
    @Step("验证添加转账银行卡信息1.0")
    public JSONObject transferAddBankCheck1(String bankCardNumber, String holderName, String passwordalias, String bankName, String idCard, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("holderName", holderName);//银行卡持有人姓名
        map.put("passwordalias", passwordalias);//支付口令
        map.put("bankName", bankName);//银行卡名称
        map.put("idCard", idCard);//身份证号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.add.bank.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 转账到银行卡，并且正式签署合同,有验证码则检验验证码1.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡，并且正式签署合同,有验证码则检验验证码1.0")
    public JSONObject transferBankcard1(String bankCardNumber, String holderName, String transferAmount, String passwordalias, String bankName, String idCard, String checkNum, String phoneNum, String clientType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("holderName", holderName);//银行卡持有人姓名
        map.put("transferAmount", transferAmount);//转账金额
        map.put("passwordalias", passwordalias);//支付口令
        map.put("bankName", bankName);//银行卡名称
        map.put("idCard", idCard);//身份证号
        map.put("checkNum", checkNum);//验证码
        map.put("phoneNum", phoneNum);//用户电话号码
        map.put("clientType", clientType);//客户端端类型：0Web,1App
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.bankcard");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 转账到银行卡前验证银行卡号1.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡前验证银行卡号1.0")
    public JSONObject transferBankcardCheck1(String bankCardNumber) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.bankcard.check");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 转账到银行卡，查询需要签署的合同1.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡，查询需要签署的合同1.0")
    public JSONObject transferBankcardContractQuery1(String bankCardNumber, String holderName, String transferAmount, String bankName, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("holderName", holderName);//银行卡持有人姓名
        map.put("transferAmount", transferAmount);//转账金额
        map.put("bankName", bankName);//银行卡名称
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.bankcard.contract.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 转账到银行卡，正式合同签署接口，有验证码则检验验证码(完成自动签署)1.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡，正式合同签署接口，有验证码则检验验证码(完成自动签署)1.0")
    public JSONObject transferBankcardContractSign1(String autoSign, String contractNo, String bankCardNumber, String holderName, String transferAmount, String passwordalias, String bankName, String idCard, String checkNum, String phoneNum, String clientType, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("autoSign", autoSign);//是否自动签署合同
        map.put("contractNo", contractNo);//合同编号
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("holderName", holderName);//银行卡持有人姓名
        map.put("transferAmount", transferAmount);//转账金额
        map.put("passwordalias", passwordalias);//支付口令
        map.put("bankName", bankName);//银行卡名称
        map.put("idCard", idCard);//身份证号
        map.put("checkNum", checkNum);//验证码
        map.put("phoneNum", phoneNum);//用户电话号码
        map.put("clientType", clientType);//客户端端类型：0Web,1App
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.bankcard.contract.sign");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 转账到银行卡通讯记录1.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡通讯记录1.0")
    public JSONObject transferBankcardHis1(String bankCardNumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.bankcard.his");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除转账通讯记录1.0
     *
     * @return response
     * @
     */
    @Step("删除转账通讯记录1.0")
    public JSONObject transferBankcardHisDelete1(String bankCards, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCards", bankCards);//需要删除记录的银行卡号，批量用逗号隔开
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.bankcard.his.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 验证账户信息,判断是否给这个用户转过账,查询是否自动签署1.0
     *
     * @return response
     * @
     */
    @Step("验证账户信息,判断是否给这个用户转过账,查询是否自动签署1.0")
    public JSONObject transferCheckAccount1(String bankCardNumber, String holderName, String transferAmount, String passwordalias, String bankName, String idCard, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bankCardNumber", bankCardNumber);//银行卡号
        map.put("holderName", holderName);//银行卡持有人姓名
        map.put("transferAmount", transferAmount);//转账金额
        map.put("passwordalias", passwordalias);//支付口令
        map.put("bankName", bankName);//银行卡名称
        map.put("idCard", idCard);//身份证号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.check.account");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 最近转账记录列表查询1.0
     *
     * @return response
     * @
     */
    @Step("最近转账记录列表查询1.0")
    public JSONObject transferLatestQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.latest.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油卡转账1.0
     *
     * @return response
     * @
     */
    @Step("油卡转账1.0")
    public JSONObject transferOilAccount1(String transAmount, String clientType, String passwordalias, String oilEquipmentCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("transAmount", transAmount);//交易金额
        map.put("clientType", clientType);//请求来源 获取请求设备系统 1pc 2移动客户端 3微信客户端
        map.put("passwordalias", passwordalias);//支付口令
        map.put("oilEquipmentCode", oilEquipmentCode);//加油枪编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.oil.account");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 转账到银行卡发送验证码2.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡发送验证码2.0")
    public JSONObject transferSendSms2(String phoneNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phoneNum", phoneNum);//用户电话
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.send.sms");//接口路径
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
     * 转账到银行卡发送验证码1.0
     *
     * @return response
     * @
     */
    @Step("转账到银行卡发送验证码1.0")
    public JSONObject transferSendSms1(String phoneNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phoneNum", phoneNum);//用户电话
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.send.sms");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 设置自动余额付款1.0
     *
     * @return response
     * @
     */
    @Step("设置自动余额付款1.0")
    public JSONObject updateAotu1(String isAuto) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isAuto", isAuto);//设置自动签署。Y：自动签署 N：非自动
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.aotu");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 设置自动余额付款2.0
     *
     * @return response
     * @
     */
    @Step("设置自动余额付款1.0")
    public JSONObject updateAotu2(String isAuto, String payPassWord, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isAuto", isAuto);//设置自动签署。Y：自动签署 N：非自动
        map.put("payPassWord", payPassWord);//支付密码
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "update.aotu");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("payPassWord");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包基本信息查询1.0
     *
     * @return response
     * @
     */
    @Step("钱包基本信息查询1.0")
    public JSONObject walletQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "wallet.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /*==========================20190307开发计划=================================================================*/

    /**
     * 转账手续费查询1.0
     *
     * @return response
     * @
     */
    @Step("转账手续费查询1.0")
    public JSONObject transferHandingcodeQuery1(String queryType, String transferMoney, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("queryType", queryType);//查询类型 0 默认 1 按金额
        map.put("transferMoney", transferMoney);//转账金额
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "transfer.handingcode.query");//接口路径
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
