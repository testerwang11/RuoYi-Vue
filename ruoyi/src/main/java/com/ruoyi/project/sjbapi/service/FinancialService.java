package com.ruoyi.project.sjbapi.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.RandomUtils;
import io.qameta.allure.Step;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialService {

    private static String host = "http://finance.sijibao.co";

    private static String uri;
    private static List<String> cookies;

    private static FinancialService financialService;

    public static FinancialService getInstance() {
        if (financialService == null) {
            synchronized (FinancialService.class) {
                if (financialService == null) {
                    financialService = new FinancialService();
                    financialService.financialLogin("admin", "admin");
                }
            }
        }
        return financialService;
    }

    /**
     * 检查cookie是否过期，过期重新刷新
     */
    public void checkCookieIsVaild() {
        uri = "/SCFS-WEB/a/sys/user/info";
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
    @Step("司机宝金融服务管理平台后台登录")
    public void financialLogin(String userName, String password) {
        uri = "/SCFS-WEB/a/login";
        BaseCall call = new BaseCall(host, uri, "POST");
        call.addHeader("Content-Type", "application/x-www-form-urlencoded");
        call.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");

        call.setData(String.format("username=%s&password=%s&rememberMe=on", userName, password));
        call.callService();
        call.close();
        try {
            cookies = call.getCookies();
        } catch (Exception e) {
            call.callService();
            call.close();
            cookies = call.getCookies();
        }
    }

    @Step("获取账户签约信息")
    public String formOpenEbank(String code, String acctNo, String acctId) {
        checkCookieIsVaild();
        uri = "/SCFS-WEB/a/acct/openebank/formOpenEbank";
        String data = String.format("code=%s&agentType=2&acctNo=%s&acctId=%s", code, acctNo, acctId);
        String response = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return response;
    }

    @Step("根据手机号查询账户信息")
    public JSONObject findCustInfo(String phone, String userType) {
        checkCookieIsVaild();
        uri = "/SCFS-WEB/a/report/maintain/findCustInfo";
        String data = String.format("boundPhone=%s&userType=%s", phone, userType);
        return new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnJsonObject();
    }

    @Step("查询签约编号")
    public String queryEbank(String userCode) {
        checkCookieIsVaild();
        uri = "/SCFS-WEB/a/acct/openebank/list/";
        String data = String.format("pageNo=1&pageSize=30&code=%s&acctNo=&agentId=&clearAcct=&isSjbUser=", userCode);
        String response = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        //return Jsoup.parse(response).select("//td/input[@name='box']").get(0).attr("agentid");
        return Jsoup.parse(response).select("//*[@id='contentTable']/tbody/tr/td[4]").get(0).attr("agentid");

    }

    @Step("账户签约")
    public String openEbank(String id, String acctId, String status, String code, String agentType, String isSjbUser,
                            String agentId, String tradeType, String email, String isOutBank, String payBankCode, String clearAcctType,
                            String agentCode, String agentName, String acctNo, String chlType, String entcertType, String entcertCode,
                            String entcertValidDate, String legalName, String legalCertCode, String legalCertValidDate, String legalTel, String legalMobile,
                            String legalAddress, String clearBankShortName, String clearBankName, String clearAcctName, String clearAcct, String eacctNo,
                            String eacctName, String payBankName) {
        checkCookieIsVaild();
        uri = "/SCFS-WEB/a/acct/openebank/openEbank";
        String data = String.format("id=%s&acctId=%s&status=%s&code=%s&agentType=%s&isSjbUser=%s&agentId=%s&tradeType=%s&email=%s\n" +
                        "&isOutBank=%s&payBankCode=%s&clearAcctType=%s&agentCode=%s&agentName=%s&acctNo=%s&chlType=%s\n" +
                        "&entcertType=%s&entcertCode=%s&entcertValidDate=%s&legalName=%s&legalCertCode=%s\n" +
                        "&legalCertValidDate=%s&legalTel=%s&legalMobile=%s&legalAddress=%s&clearBankShortName=%s\n" +
                        "&clearBankName=%s&clearAcctName=%s&clearAcct=%s&eacctNo=%s&eacctName=%s&payBankName=%s",
                id, acctId, status, code, agentType, isSjbUser, agentId, tradeType, email, isOutBank, payBankCode, clearAcctType,
                agentCode, agentName, acctNo, chlType, entcertType, entcertCode, entcertValidDate, legalName, legalCertCode, legalCertValidDate, legalTel,
                legalMobile, legalAddress, clearBankShortName, clearBankName, clearAcctName, clearAcct, eacctNo, eacctName, payBankName);
        String response = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return response;
    }

    @Step("交易数据维护")
    public String maintain(String phone, String userType, String amount) {
        checkCookieIsVaild();
        try {
            JSONObject infoData = findCustInfo(phone, userType);
            uri = "/SCFS-WEB/a/report/maintain/save";
            String data = "id=&userCode=" + infoData.getString("userCode") + "&maintainType=1&userType=" + userType + "&transAmt=" + amount + "&maintainDesc=自动化测试&flowCode=" + RandomUtils.generate() + "&bankNo=6215590000000001&bankName=whyzh2&boundPhone=" + phone + "&realName=" + infoData.getString("realName") + "&accNo=" + infoData.getString("accNo") + "&createDate=2019-08-15 10:23:34&remark=测试";
            String response = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
            String checkIds = Jsoup.parse(response).select("input[name='box']").get(0).val();
            //经办
            uri = "/SCFS-WEB/a/report/maintain/firstapprove";
            String data2 = "checkIds=" + checkIds + "&status=2";
            String data3 = "checkIds=" + checkIds + "&status=0";
            String response2 = new BaseCall(host, uri, "POST").setData(data2).setCookies(cookies).addDefHeader().callService().close().getReturnData();
            //复核
            uri = "/SCFS-WEB/a/report/maintain/approve";
            String response3 = new BaseCall(host, uri, "POST").setData(data3).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        }catch (Exception e){

        }
        return "充值成功";
    }

    public void synRepayment(String orderNo) {
        checkCookieIsVaild();
        uri = "/SCFS-WEB/a/pay/paymentDaysInfo/list";
        String data = "pageNo=1&pageSize=30&payType=&orderNo=&userType=&holdCode=&sjbStockNo=" + orderNo + "&payStatus=&paymentDaysType=&isHandle=&changePlatReason=&" +
                "quyStartChangePlatTime=&quyEndChangePlatTime=&quyStartOrderTime=&quyEndOrderTime=&quyStartRepaymentTime=&quyEndRepaymentTime=&startPayTime=&endPayTime=&quyStartExpireTime=&quyEndExpireTime=&isBroker=";
        String response = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        String checkIds = Jsoup.parse(response).select("input[name='box'][curusertype='2']").get(0).val();
        uri = "/SCFS-WEB/a/pay/paymentDaysInfo/synRepayment";
        String data1 = "checkIds=" + checkIds;
        String response2 = new BaseCall(host, uri, "POST").setData(data1).setCookies(cookies).addDefHeader().callService().close().getReturnData();
    }

    public static void main(String[] args) {
        FinancialService financialService = FinancialService.getInstance();
        //交易数据维护
        financialService.maintain("17600000067", "2", "1000000");
    }

}
