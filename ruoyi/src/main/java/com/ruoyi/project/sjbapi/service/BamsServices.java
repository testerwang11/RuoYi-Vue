package com.ruoyi.project.sjbapi.service;

import com.jcraft.jsch.JSchException;
import com.ruoyi.project.sjbapi.core.BaseCall;
import com.ruoyi.project.sjbapi.util.StringUtils;
import io.qameta.allure.Step;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BamsServices {
    private static String host = "http://running.sijibao.co";
    private static String uri;
    private static List<String> cookies;
    private static List<String> cookies2;
    private static BamsServices bamsServices;

    public static BamsServices getInstance() {
        if (bamsServices == null) {
            synchronized (BamsServices.class) {
                if (bamsServices == null) {
                    bamsServices = new BamsServices();
                    bamsServices.bamsLogin("admin", "admin");
                    cookies2 = bamsServices.newBamsLogin();
                }
            }
        }
        return bamsServices;
    }

    public void checkCookieIsVaild() {
        uri = "/bams/a/sys/user/info";
        String response = new BaseCall(host, uri, "GET").setCookies(cookies).addDefHeader().callService().close().getReturnData();
        if(!Jsoup.parse(response).title().equals("个人信息")){
            bamsLogin("admin", "admin");
        }else {
            return;
        }
    }

    /**
     * 运营后台登录
     *
     * @param userName
     * @param password
     * @throws Exception
     */
    @Step("运营后台登录")
    public void bamsLogin(String userName, String password) {
        String url0 = "http://running.sijibao.co/bams/a";
        BaseCall call0 = new BaseCall(url0, "GET");
        HashMap headers = new HashMap();
        headers.put("Upgrade-Insecure-Requests","1");
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0");
        headers.put("Upgrade-Insecure-Requests","1");
        call0.addHeaders(headers);
        call0.callService();
        call0.close();
        String response = call0.getReturnData();
        String execution = Jsoup.parse(response).select("#fm1 > input[type=hidden]:nth-child(5)").val();
        String url1 = "http://cas.sijibao.co/cas/login?service=http://running.sijibao.co/bams/a/cas";
        BaseCall call = new BaseCall(url1, "POST");
        call.addHeader("Content-Type", "application/x-www-form-urlencoded");
        call.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        call.addHeader("Cookie", call0.getCookies().get(0));
        call.setData(String.format("username=%s&password=%s&execution=%s&_eventId=submit", userName, password, execution));
        try {
            call.callService();
        } catch (Exception e) {
            call.callService();
        }
        call.close();
        cookies = call.getCookies();
    }

    @Step("运营后台登录")
    public void bamsLoginOld(String userName, String password) {
        String uri = "/bams/a/login";
        BaseCall call = new BaseCall(host, uri, "POST");
        String data = String.format("username=%s&password=%s", userName, password);
        call.addHeader("Content-Type", "application/x-www-form-urlencoded");
        call.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        call.setData(data).addDefHeader();
        try{
            call.callService();
        }catch (Exception e){
            call.callService();
        }
        call.close();
        cookies = call.getCookies();
    }

    public List<String> newBamsLogin() {
        uri = "/bams-web/a/certification/driver/driverDatumStorage/list";
        BaseCall call = new BaseCall(host, uri, "POST");
        String data = "loginUserName=系统管理员&loginUserId=1&tabPageId=jerichotabiframe_0";
        call.addHeader("Content-Type", "application/x-www-form-urlencoded");
        call.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        call.setData(data).setCookies(cookies).addDefHeader().callService().close();
        return  call.getCookies();
    }

    @Step("根据手机号查询验证码")
    public String queryMsgCodeByPhone(String phone) {
        checkCookieIsVaild();
        uri = "/bams/a/pres/qsug/queryRecords/search";
        String data = String.format("id=&comment=&toPhones=%s", phone);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String code = "";
        Document doc = null;
        int i = 0;
        while (StringUtils.isBlank(code)) {
            String response = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
            doc = Jsoup.parse(response);
            code = doc.getElementById("content").text();
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i > 5) {
                break;
            }
        }
        String msgCode;

        if (code.startsWith("验证码为")) {
            msgCode = code.split("验证码为")[1].split("，")[0];
        } else if (code.startsWith("注册验证码为")) {
            msgCode = code.split("注册验证码为")[1].split("，")[0];
        } else {
            msgCode = StringUtils.getNumFromStr(code);
        }

        return msgCode;
    }

    public void reviewlist(String orderNumber) {
        String data = String.format("pageNo=1&pageSize=30&review=1&exc=&eh=&quyYcpzName=&quyDef=1&orderBy=&holderCode=&orderCompany=&orderNumber=%s&carPerson=&carNumber=&quyAgentName=&quyOrderStatus=&orderKind=&driverMark=&quyIsPayBill=&quyPayBillStatus=&_quyYcpzStatus=1&quyStartStockCreateTime=&quyEndStockCreateTime=&quyStartSignUploadTime=&quyEndSignUploadTime=&quyStartReviewUpdateTime=&quyEndReviewUpdateTime=&quyStartClientCheckTime=&quyEndClientCheckTime=&quyStartCompanyCheckTime=&quyEndCompanyCheckTime=&quyStartCompanyCheckReceiptTime=&quyEndCompanyCheckReceiptTime=&abnormalState=&quyUploadImg=&quyExcType=&_quyExcs=1&quyOrderPayStatus=&isOverrule=", orderNumber);
        uri = "/bams/a/stock/review/stockInformation/reviewlist";
        new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close();
    }

    /**
     * 审单详情
     *
     * @param orderNumber
     * @throws Exception
     */
    public String reviewDetail(String orderNumber) {
        checkCookieIsVaild();
        String data = String.format("sjbStockNo=%s&review=1&exc=&tabPageId=jerichotabiframe_3", orderNumber);
        uri = "/bams/a/stock/review/flow/reviewdetail";
        String response = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        String regEx = "labId:'(.*?)'";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(response);
        // 查找字符串中是否有匹配正则表达式的字符/字符串
        boolean rs = matcher.find();
        if (rs) {
            return matcher.group(1);
        } else {
            return "";
        }
    }

    /**
     * 提交审单
     *
     * @param labId
     * @throws Exception
     */
    public void reviewSubmit(String labId) {
        String data = String.format("labId=%s", labId);
        uri = "/bams/a/stock/review/flow/reviewsubmit";
        new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close();
    }

    /**
     * 审单通过
     *
     * @param labId
     * @throws Exception
     */
    public void reviewOver(String labId) {
        String data = String.format("labId=%s", labId);
        uri = "/bams/a/stock/review/flow/reviewover";
        new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close();
    }

    /**
     * 提交开票处理
     *
     * @param orderNumber
     * @throws Exception
     */
    public void reviewSubBill(String orderNumber) {
        uri = "/bams/a/stock/review/flow/review_sub_bill";
        //httpsUtils.get(host + uri, headers, "orderNumber=" + orderNumber);
        new BaseCall(host, uri, "GET").setData("orderNumber=" + orderNumber).setCookies(cookies).addDefHeader().callService().close();

    }

    /**
     * 开票财务审核
     *
     * @param checkPointMsg  2:提交审核；3:审核通过
     * @param orderNumber    运单号
     * @param checkResultMsg 1 提交审核  2 退回待处理 3 提交异常单
     * @throws Exception
     */
    public void checkWaitOpenBillInfo(String checkPointMsg, String orderNumber, String checkResultMsg) {
        //String id = DBHelper.db_bams.execSqlQuery(String.format("SELECT * FROM bams_tax_wait_open_bill_info where sjb_stock_no = '%s'", orderNumber), "id").get(0).toString();
        //String data = "checkPointMsg=" + checkPointMsg + "&id=" + id + "&sjbStockNo=" + orderNumber + "&exceptoinLabId=&checkResultMsg=" + checkResultMsg + "&checkOpinionMsg=%E6%B5%8B%E8%AF%95";
        //uri = "/bams/a/finance/tax/waitOpenBillInfo/checkWaitOpenBillInfo";
        //httpsUtils.post(host + uri, headers, data);
        //new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close();
    }

    @Step("手机号添加黑名单")
    public void addPhoneTo(String phone) {
        String data = "id=&mobile=" + phone + "&remark=%E7%85%A4%E8%81%94%E7%A4%BE%E8%B4%A6%E5%8F%B7%E9%BB%91%E5%90%8D%E5%8D%95";
        uri = "/bams/a/pres/blacklist/smsMobileBlacklist/save";
        new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close();
    }

    @Step("跟单审单")
    public void openBill(String orderNumber) {
        //根据订单号查询labId
        String labId = reviewDetail(orderNumber);
        //跟单提交审核
        reviewSubmit(labId);
        //跟单审核通过
        reviewOver(labId);
        //跟单提交开票
        reviewSubBill(orderNumber);
        //财务提交审核
        //checkWaitOpenBillInfo("2", orderNumber, "1");
        //财务审核通过
        //checkWaitOpenBillInfo("3", orderNumber, "1");
        //运费提交分票

        //运费待分票

        //调度费提交分票

        //调度费分票

        //技术服务费提交分票

        //技术服务费分票

        //分票复核

    }

    /**
     * 道路许可证更新
     *
     * @param id
     * @param userCode
     */
    @Step("道路许可证审核")
    public void certifyVehicleCertifySave(String id, String userCode) {
        String data = "id=" + id + "&userCode=" + userCode + "&vehicleType=&vehicleOwner=&address=&useCharacter=&brandModel=&vehicleIdentificationNumber=&engineNumber=&registerTime=&issueTime=&curbWeight=0&gabariteLong=0&gabariteWide=0&gabariteHigh=0&tractionMass=0&fuelType=&file=&img_vehicleImage1=&file=&img_vehicleImage2=&photoCertifyMemo=&phoLabelTpl1=&phoLabelTpl2=&phoRemarks=&file=&img_roadLicenceUrl=&file=&img_roadAnnualCheckUrl=&roadLicence=&roadLicenceExpiretime=&roadLicenceState=5&roadCertifyMemo=&highwayLabelTpl1=&highwayRemarks=";
        uri = "/bams/a/pres/certify/vehicleCertify/save";
        new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close();
    }

    @Step("获取企业服务信息")
    public String servicesCompanyDetaile(String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/serviceinfo/finServiceInfo/form";
        String data = "certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode;
        String result = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("配置企业服务信息")
    public String servicesCompanyAdd(String certifyCode, String companyCode, String holderCode, HashMap map) {
        //921000000021 湖北物易通物流科技有限公司
        //930000000010 凤凰
        uri = "/bams/a/config/serviceinfo/finServiceInfo/save";
        String data = "id=&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode +
                "&signChannelType=0&taxConnRelation=930000000010&templateNo=TEST0001&firstTaxConnRelation=&firstTemplateNo=&isSeperate=1&joveCode=HZ00000000001&" + map.toString().replace(",", "&").replaceAll(" ", "");

        String result = new BaseCall(host, uri, "POST").setData(data.replace("{", "").replace("}", "")).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("获取企业账期信息")
    public String accountInformationDetaile(String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/payment/acCustInfo/form";
        String data = "certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode;
        String result = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("配置企业账期信息")
    public String accountInformationAdd(String certifyCode, String companyCode, String holderCode, String isPaymentDays, String paymentDays, String paymentLimit, String paymentDaysAutoRepay, String isChangeOilEle, String isDianrPaymentDays, String dianrPaymentDays) {
        uri = "/bams/a/config/payment/acCustInfo/save";
        String data = "id=&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode +
                "&isPaymentDays=" + isPaymentDays + "&paymentDays=" + paymentDays + "&paymentLimit=" + paymentLimit + "&paymentDaysAutoRepay=" + paymentDaysAutoRepay + "&isChangeOilEle=" + isChangeOilEle + "&isDianrPaymentDays=" + isDianrPaymentDays + "&dianrPaymentDays=" + dianrPaymentDays;

        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("获取企业签约信息")
    public String subscriptionInformationDetaile(String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/sign/finOpenEbankApply/form";
        String data = "certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode;
        String result = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("配置企业签约信息")
    public String subscriptionInformationAdd(String certifyCode, String companyCode, String holderCode, String entcertType, String entcertCode,
                                             String entcertValidDate, String legalName, String legalCertCode, String legalCertValidDate, String legalTel, String legalMobile, String email, String legalAddress, String clearBankShortName, String clearBankName, String clearAcctName, String clearAcct) {
        uri = "/bams/a/config/sign/finOpenEbankApply/save";
        String data = "id=&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode + "&entcertType=" + entcertType + "&entcertCode=" + entcertCode + "&entcertValidDate=" + entcertValidDate +
                "&legalName=" + legalName + "&legalCertCode=" + legalCertCode + "&legalCertValidDate=" + legalCertValidDate + "&legalTel=" + legalTel + "&legalMobile=" + legalMobile +
                "&email=" + email + "&legalAddress=" + legalAddress + "&clearBankShortName=" + clearBankShortName + "&clearBankName=" + clearBankName + "&clearAcctName=" + clearAcctName + "&clearAcct=" + clearAcct;

        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("获取企业业务模式信息")
    public String businessInformationDetaile(String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/pattern/companyPatternConfig/form";
        String data = "certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode;
        String result = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("配置企业业务模式信息")
    public String businessInformationAdd(String certifyCode, String companyCode, String holderCode, String enterpriseNature, String stockCostLimit, String realMoneyIncreaseAstrict,
                                         String realUnitMoneyIncreaseAstrict, String supportDdStockPub, String supportInStockPub, String supportAgentStockPub, String supportTaskOrder, String checkType, String supportDeliveryPricing,
                                         String signInRadius, String oilLimit, String etcLimit, String isGetFraction, String isGetCheckforfee, String companyControlFlag1, String companyControlFlag2, String withholdingRatio, String companyControlFlag3, String companyControlFlag4, String companyControlFlag5) {
        uri = "/bams/a/config/pattern/companyPatternConfig/save";
        String data = "id=&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode + "&enterpriseNature=" + enterpriseNature + "&stockCostLimit=" + stockCostLimit +
                "&realMoneyIncreaseAstrict=" + realMoneyIncreaseAstrict + "&realUnitMoneyIncreaseAstrict=" + realUnitMoneyIncreaseAstrict + "&supportDdStockPub=" + supportDdStockPub + "&supportInStockPub=" + supportInStockPub + "&supportAgentStockPub=" + supportAgentStockPub +
                "&supportTaskOrder=" + supportTaskOrder + "&checkType=" + checkType + "&supportDeliveryPricing=" + supportDeliveryPricing + "&signInRadius=" + signInRadius + "&oilLimit=" + oilLimit + "&etcLimit=" + etcLimit +
                "&isGetFraction=" + isGetFraction + "&isGetCheckforfee=" + isGetCheckforfee + "&companyControlFlag1=" + companyControlFlag1 + "&companyControlFlag2=" + companyControlFlag2 + "&withholdingRatio=" + withholdingRatio + "&companyControlFlag3=" + companyControlFlag3 + "&companyControlFlag4=" + companyControlFlag4 + "&companyControlFlag5=" + companyControlFlag5;

        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("获取企业公式关联信息")
    public String formulaInformationDetaile(String companyCode, String companyName) {
        uri = "/bams/a/config/orderformula/companyFormula/form";
        String data = "companyCode=" + companyCode + "&companyName=" + companyName;
        String result = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("配置企业公式关联信息")
    public String formulaInformationAdd(String companyCode, String companyName, String isReview, String formulaName, String formulaCompanyName,
                                        String formulaCompanyCode, String remarks, String className, String memo, String status, String remark, String strSql) {
        uri = "/bams/a/config/orderformula/companyFormula/save";
        String data = "id=&companyCode=" + companyCode + "&companyName=" + companyName + "&isReview=" + isReview + "&formulaName=" + formulaName +
                "&formulaCompanyName=" + formulaCompanyName + "&formulaCompanyCode=" + formulaCompanyCode + "&remarks=" + remarks + "&className=" + className + "&memo=" + memo +
                "&status=" + status + "&remark=" + remark + "&" + strSql;
        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("审核企业服务信息")
    public String ToExamineservicesCompanyAdd(String id, String certifyCode, String companyCode, String holderCode, HashMap map) {
        uri = "/bams/a/config/serviceinfo/finServiceInfo/reviewSave";
        String data = "id=" + id + "&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode + "&status=2&remark=&" + map.toString();
        String result = new BaseCall(host, uri, "POST").setData(data.replace("{", "").replace("}", "")).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("审核企业账期信息")
    public String ToExamineaccountInformationAdd(String id, String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/payment/acCustInfo/reviewSave";
        String data = "id=" + id + "&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode + "&status=2&remark=";
        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("审核企业签约信息")
    public String ToExaminesubscriptionInformationAdd(String id, String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/sign/finOpenEbankApply/reviewSave";
        String data = "id=" + id + "&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode + "&status=2&remark=";
        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("审核企业业务模式信息")
    public String ToExaminebusinessInformationAdd(String id, String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/pattern/companyPatternConfig/reviewSave";
        String data = "id=" + id + "&certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode + "&status=2&remark=";

        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();

        return result;
    }

    @Step("审核企业公式关联信息")
    public String ToExamineformulaInformationAdd(String id, String companyCode, String companyName) {
        uri = "/bams/a/config/orderformula/companyFormula/save";
        String data = "id=" + id + "&companyCode=" + companyCode + "&companyName=" + companyName + "&constantParam=&variableParam=&resultParam=&isReview=1&formulaName=公式十六&formulaCompanyName=提出公式企业未记录&" +
                "formulaCompanyCode=1111&remarks=20170712创建&className=com.sijibao.computational.formula.sixteenfunction.impl.SixteenFunction&memo=其他扣款&status=2&remark=";

        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("完成审核企业相关信息上线")
    public String configReviewInfoonline(String certifyCode, String companyCode, String holderCode) {
        uri = "/bams/a/config/review/configReviewInfo/online";
        String data = "certifyCode=" + certifyCode + "&companyCode=" + companyCode + "&holderCode=" + holderCode;

        String result = new BaseCall(host, uri, "GET").setData(data).setCookies(cookies).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("审核司机")
    public String certificationDriver(String certifyCode, String userCode) {
        uri = "/bams-web/a/certification/driver/driverCertify/saveWithAjax";
        String data = "certifyCode=" + certifyCode + "&userCode=" + userCode + "&idCardExpireTime=&driverCertifyStateEnum.state=4&driverCertifyMemo=&idCardFrontPhotoTag.tagOption.key=1&idCardPhotoTag.tagKey=1&idCardPhotoTag.tagId=&idCardPhotoTag.tagChoose=1&idCardPhotoTag.secondTagKey=1&idCardPhotoTag.tagMemo=&idCardFrontPhotoTag.tagOption.key=3&driverLicencePhotoTag.tagKey=3&driverLicencePhotoTag.tagId=&driverLicencePhotoTag.tagChoose=1&driverLicencePhotoTag.tagMemo=&idCardPhotoTag.tagRemark=";
        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies2).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("审核车辆")
    public String certificationCar(String vehicleId) {
        uri = "/bams-web/a/certification/vehicleCertifyAudite/save";
        String data = "vehicleId=" + vehicleId + "&id=" + vehicleId + "&hisTagId=&runLicenceOperate.state=4&runLicenceCertifyMemo=&runLicenceTag.tagKey=4&runLicenceTag.tagId=&runLicenceTag.tagChoose=1&runLicenceTag.tagMemo=&runLicenceTag.tagRemark=";
        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies2).addDefHeader().callService().close().getReturnData();
        return result;
    }


    @Step("注销司机")
    public String driverLogout(String userCode) {
        checkCookieIsVaild();
        uri = "/bams-web/a/certification/driver/driverCertify/driverLogout";
        String data = "cancelReason=不想用了&userCode=" + userCode;

        String result = new BaseCall(host, uri, "POST").setData(data).setCookies(cookies2).addDefHeader().callService().close().getReturnData();
        return result;
    }

    @Step("关闭")
    public void close() throws JSchException {
        //dbHelper.close();
    }


    public static void main(String[] args) throws JSchException, IOException {
        //List<String> list = FileUtils.readLines(new File("D:\\download\\zll.txt"));
        BamsServices bamsServices = BamsServices.getInstance();
        bamsServices.queryMsgCodeByPhone("17700001051");
        /*for(String orderNum:list){
            bamsServices.openBill(orderNum);
        }
        bamsServices.close();*/
        //String orderNumber = "1901091013280001";
        //BamsServices bamsServices = new BamsServices();
        //bamsServices.bamsLogin("admin", "admin");
        //bamsServices.queryMsgCodeByPhone("17612169056");
        //bamsServices.reviewlist("1901091013280001");
        //根据订单号查询labId
        //String labId = bamsServices.reviewDetail(orderNumber);
        //跟单提交审核
        //bamsServices.reviewSubmit(labId);
        //跟单审核通过
        //bamsServices.reviewOver(labId);
        //跟单提交开票
        //bamsServices.reviewSubBill(orderNumber);
        //财务提交审核
        //bamsServices.checkWaitOpenBillInfo("2",orderNumber,"1");
        //财务审核通过
        //bamsServices.checkWaitOpenBillInfo("3",orderNumber,"1");
        /*for(int i=30;i<60;i++){
            bamsServices.addPhoneTo("133100050"+i);
        }*/
/*        try {
            String path = "C:\\Users\\Administrator\\Desktop\\todo\\OrderData.xlsx";
            File f = new File(path);
            InputStream in = new FileInputStream(f);
            List<DataBean> list = ExcelUtils.read(in, DataBean.class);

            bamsServices.queryMsgCodeByPhone("17100000201");
            //bamsServices.deleteDriverUser("100000289278");
            for(DataBean dataBean:list){
                if(dataBean.getLaterpaystate().equals("账期")){
                    bamsServices.openBill(dataBean.getOrderNo1());
                }
            }
            bamsServices.openBill(dataBean.getOrderNo1());

        } catch (Exception e) {
        } finally {
            bamsServices.close();
        }*/
    }
}