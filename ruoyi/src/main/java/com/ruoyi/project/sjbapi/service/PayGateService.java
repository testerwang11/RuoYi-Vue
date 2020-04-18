package com.ruoyi.project.sjbapi.service;

import com.ruoyi.project.sjbapi.core.BaseCall;
import io.qameta.allure.Step;
import org.jsoup.Jsoup;

import java.util.List;

public class PayGateService {

    private static String host =  "http://pay.sijibao.co";

    private static String uri;


    private static List<String> cookies;
    private static PayGateService payGateService;

    public static PayGateService getInstance() {
        if (payGateService == null) {
            synchronized (PayGateService.class){
                if (payGateService==null){
                    payGateService = new PayGateService();
                    payGateService.financialLogin("admin", "admin");
                }
            }
        }
        return payGateService;
    }

    private FinancialService financialService = FinancialService.getInstance();
    /**
     * 检查cookie是否过期，过期重新刷新
     */
    public void checkCookieIsVaild() {
        uri = "/sjb-pay-gateway/a/sys/user/info";
        String response = new BaseCall(host, uri, "GET").setCookies(cookies).addDefHeader().callService().close().getReturnData();
        if(!Jsoup.parse(response).title().equals("个人信息")){
            financialLogin("admin", "admin");
        }else {
            return;
        }
    }

    /**
     * 司机宝金融服务管理平台登录
     *
     * @param userName
     * @param password
     * @throws Exception
     */
    @Step("支付网关登录")
    public void financialLogin(String userName, String password) {
        uri = "/sjb-pay-gateway/a/login";
        BaseCall call = new BaseCall(host, uri, "POST");
        call.addHeader("Content-Type", "application/x-www-form-urlencoded");
        call.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");

        call.setData(String.format("username=%s&password=%s&rememberMe=on", userName, password));
        call.callService();
        call.close();
        cookies = call.getCookies();
    }

    @Step("内部转账")
    public String confirmTransfer(String aAgentId, String bAgentId, String amount) {
        checkCookieIsVaild();
        uri = "/sjb-pay-gateway/a/account/accountInfo/confirmTransfer";
        String data = String.format("aAgentId=%s&bAgentId=%s&amount=%s&remark=接口测试转账", aAgentId, bAgentId, amount);
        String response = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return response;
    }

    /**
     * 转账并审核
     * @param phone
     * @param userType
     * @param amount
     * @return
     */
    @Step("转账并审核")
    public void transfer(String phone, String userType, String amount) {
        checkCookieIsVaild();
        String userCode = financialService.findCustInfo(phone, userType).getString("userCode");
        String agentId = financialService.queryEbank(userCode);
        confirmTransfer("HXD_500000001743", agentId, Integer.parseInt(amount) * 100 + "");
        financialService.maintain(phone, userType, amount);
    }

    public static void main(String[] args) {

        PayGateService payGateService = new PayGateService();
        FinancialService financialService = new FinancialService();
        String phone = "17100000003", userType="2", amount = "10";
        String userCode = financialService.findCustInfo(phone, userType).getString("userCode");
        String agentId = financialService.queryEbank(userCode);
        payGateService.confirmTransfer("HXD_500000001743", agentId, Integer.parseInt(amount) * 100 + "");
        financialService.maintain(phone, userType, amount);
    }
}
