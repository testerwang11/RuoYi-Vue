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
public class ROPService extends BaseService {

    private static String url = "http://rop-service.sijibao.co/ropservice/router";
    private static String appcode = "100094";

    /**
     * 1.0OrderScheduleGoon
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject activityCreate1(String imageurl, String linkurl, String index, String memo, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("imageurl", imageurl);//
        map.put("linkurl", linkurl);//
        map.put("index", index);//
        map.put("memo", memo);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "activity.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject activityDelete1(String code, String start, String limit, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "activity.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject activityQuery1(String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "activity.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject activityUpdate1(String activitycode, String imageurl, String linkurl, String index, String memo, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("activitycode", activitycode);//
        map.put("imageurl", imageurl);//
        map.put("linkurl", linkurl);//
        map.put("index", index);//
        map.put("memo", memo);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "activity.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressCreate1(String lon, String lat, String addressname, String addresstype, String regioncode, String regionname, String companycode, String companyname, String contactsname, String contactstel, String addressdetail, String geotype, String addressmemo, String addressmapimage, String locationcode, String province, String provincecode, String city, String citycode, String street, String streetno, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("addressname", addressname);//
        map.put("addresstype", addresstype);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("contactsname", contactsname);//
        map.put("contactstel", contactstel);//
        map.put("addressdetail", addressdetail);//
        map.put("lon", lon);//
        map.put("lat", lat);//
        map.put("geotype", geotype);//
        map.put("addressmemo", addressmemo);//
        map.put("addressmapimage", addressmapimage);//
        map.put("locationcode", locationcode);//
        map.put("province", province);//
        map.put("provincecode", provincecode);//
        map.put("city", city);//
        map.put("citycode", citycode);//
        map.put("street", street);//
        map.put("streetno", streetno);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressDelete1(String addresscode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("addresscode", addresscode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressQuery1(String addresscode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("addresscode", addresscode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressQuerybatch1(String addresscodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("addresscodes", addresscodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.querybatch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressQuerybyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressUpdate1(String addresscode, String addressname, String addresstype, String regioncode, String regionname, String companycode, String companyname, String contactsname, String contactstel, String addressdetail, String geotype, String addressmemo, String addressmapimage, String locationcode, String province, String provincecode, String city, String citycode, String street, String streetno) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("addresscode", addresscode);//
        map.put("addressname", addressname);//
        map.put("addresstype", addresstype);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("contactsname", contactsname);//
        map.put("contactstel", contactstel);//
        map.put("addressdetail", addressdetail);//
        map.put("lon", "114.429231");//
        map.put("lat", "30.460185");//
        map.put("geotype", geotype);//
        map.put("addressmemo", addressmemo);//
        map.put("addressmapimage", addressmapimage);//
        map.put("locationcode", locationcode);//
        map.put("province", province);//
        map.put("provincecode", provincecode);//
        map.put("city", city);//
        map.put("citycode", citycode);//
        map.put("street", street);//
        map.put("streetno", streetno);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appAdvertCreate1(String oappcode, String oappname, String advcode, String advname, String fileurl, String displaytime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("oappname", oappname);//
        map.put("advcode", advcode);//
        map.put("advname", advname);//
        map.put("fileurl", fileurl);//
        map.put("displaytime", displaytime);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.advert.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appAdvertDelete1(String oappcode, String advcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("advcode", advcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.advert.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appAdvertQueryall1(String oappcode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.advert.queryall");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appAdvertQuerylast1(String oappcode, String advcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("advcode", advcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.advert.querylast");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appApproval1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.approval");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appCommentCreate1(String commentcontent, String usercode, String oappcode, String type, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcontent", commentcontent);//
        map.put("usercode", usercode);//
        map.put("oappcode", oappcode);//
        map.put("type", type);//
        map.put("url", url);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.comment.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appCommentDelete1(String appcommentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcommentcode", appcommentcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.comment.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appCommentQuerybatch1(String usercode, String oappcode, String starttime, String endtime, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("oappcode", oappcode);//
        map.put("starttime", starttime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.comment.querybatch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appCommentQuerybytime1(String begindate, String enddate, String type, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("type", type);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.comment.querybytime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appCommentUpdate1(String appcommentcode, String commentcontent, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcommentcode", appcommentcode);//
        map.put("commentcontent", commentcontent);//
        map.put("url", url);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.comment.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appCreate1(String usercode, String oappname, String oappdesc, String oapptype, String oappkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("oappname", oappname);//
        map.put("oappdesc", oappdesc);//
        map.put("oapptype", oapptype);//
        map.put("oappkind", oappkind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appDelete1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appModuleCreate1(String oappcode, String oaccessurl, String osyncurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("oaccessurl", oaccessurl);//
        map.put("osyncurl", osyncurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.module.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appModuleDelete1(String oappcode, String modulecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("modulecode", modulecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.module.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appModuleInsert1(String oappcode, String modulecode, String modulename, String moduleurl, String moduletype, String modulekind, String moduleorder, String modulelogourl, String parentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("modulecode", modulecode);//
        map.put("modulename", modulename);//
        map.put("moduleurl", moduleurl);//
        map.put("moduletype", moduletype);//
        map.put("modulekind", modulekind);//
        map.put("moduleorder", moduleorder);//
        map.put("modulelogourl", modulelogourl);//
        map.put("parentcode", parentcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.module.insert");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appModuleQuery1(String oappcode, String modulecode, String modulekind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("modulecode", modulecode);//
        map.put("modulekind", modulekind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.module.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appModuleQuerybyparentcode1(String oappcode, String parentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("parentcode", parentcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.module.querybyparentcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appModuleUpdate1(String oappcode, String modulecode, String modulename, String moduleurl, String moduletype, String modulekind, String moduleorder, String modulelogourl, String parentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("modulecode", modulecode);//
        map.put("modulename", modulename);//
        map.put("moduleurl", moduleurl);//
        map.put("moduletype", moduletype);//
        map.put("modulekind", modulekind);//
        map.put("moduleorder", moduleorder);//
        map.put("modulelogourl", modulelogourl);//
        map.put("parentcode", parentcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.module.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appQuery1(String oappcode, String appkind, String start, String limit, String usercode, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("appkind", appkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appQuerybyuser1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.querybyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appQuerynew1(String oappcode, String appkind, String start, String limit, String usercode, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("appkind", appkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.querynew");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appQuerynew21(String oappcode, String appkind, String start, String limit, String usercode, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("appkind", appkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.querynew2");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appServiceApproval1(String oappcode, String servicecode, String servicestate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("servicecode", servicecode);//
        map.put("servicestate", servicestate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.service.approval");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appServiceCreate1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.service.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appServiceDelete1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.service.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appServiceQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.service.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appSuspend1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.suspend");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appUpdateinfo1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.updateinfo");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appVersionCreate1(String oappcode, String oappname, String vercode, String vername, String verdesc, String verdesc2, String verpolicy, String fileurl, String filesize) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("oappname", oappname);//
        map.put("vercode", vercode);//
        map.put("vername", vername);//
        map.put("verdesc", verdesc);//
        map.put("verdesc2", verdesc2);//
        map.put("verpolicy", verpolicy);//
        map.put("fileurl", fileurl);//
        map.put("filesize", filesize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.version.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appVersionDelete1(String oappcode, String vercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("vercode", vercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.version.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appVersionQuery1(String oappcode, String vercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("vercode", vercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.version.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appVersionQuerylast1(String oappcode, String vercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("vercode", vercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.version.querylast");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject appVersionUpdate1(String oappcode, String oappname, String vercode, String vername, String verdesc, String verdesc2, String verpolicy, String fileurl, String filesize) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("oappname", oappname);//
        map.put("vercode", vercode);//
        map.put("vername", vername);//
        map.put("verdesc", verdesc);//
        map.put("verdesc2", verdesc2);//
        map.put("verpolicy", verpolicy);//
        map.put("fileurl", fileurl);//
        map.put("filesize", filesize);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.version.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersAddCompanyextraurl1(String ordernumber, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("url", url);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.add.companyextraurl");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersAddordersignreceived1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.addordersignreceived");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersAddorderstock1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.addorderstock");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersAdminrefuse1(String ordernumber, String reason, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("reason", reason);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.adminrefuse");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersApprovalcount1(String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.approvalcount");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersApprovalremove1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.approvalremove");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersAssigneddriver1(String ordernumber, String userleaderdrivercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("userleaderdrivercode", userleaderdrivercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.assigneddriver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCanclePay1(String ordernumbers, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.cancle.pay");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCanclebatch1(String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.canclebatch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCommentupdate1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.commentupdate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreate1(String stockcode, String driver, String driverphone, String channelstockcode, String vehicleid, String leaderdriver, String lan, String agentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("driver", driver);//
        map.put("driverphone", driverphone);//
        map.put("channelstockcode", channelstockcode);//
        map.put("vehicleid", vehicleid);//车辆id
        map.put("leaderdriver", leaderdriver);//车队长编码
        map.put("lon", "114.429231");//经度
        map.put("lan", lan);//纬度
        map.put("agentcode", agentcode);//经纪人编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditAddpicture1(String ordernumber, String url, String addresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("url", url);//
        map.put("addresscode", addresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.addpicture");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditClientfinish1(String ordernumber, String phonenumber, String identifyingcode, String isdamage, String damagetype, String damageexplain, String damagepicture, String money, String addresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("phonenumber", phonenumber);//
        map.put("identifyingcode", identifyingcode);//
        map.put("isdamage", isdamage);//
        map.put("damagetype", damagetype);//
        map.put("damageexplain", damageexplain);//
        map.put("damagepicture", damagepicture);//
        map.put("money", money);//
        map.put("addresscode", addresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.clientfinish");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditDamagequery1(String ordernumber, String url, String addresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("url", url);//
        map.put("addresscode", addresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.damagequery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditDamagequeryone1(String addresscode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("addresscode", addresscode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.damagequeryone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditDriversubmit1(String ordernumber, String submitkind, String no, String logisticscompany) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("submitkind", submitkind);//
        map.put("no", no);//
        map.put("logisticscompany", logisticscompany);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.driversubmit");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditFirstfinish1(String ordernumber, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.firstfinish");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditFirstfinishContainpwd1(String ordernumber, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.firstfinish.containpwd");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditH5Firstfinish1(String ordernumebr, String identicode, String phone, String originalunit, String actualunit, String unitprice) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumebr", ordernumebr);//
        map.put("identicode", identicode);//
        map.put("phone", phone);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.h5.firstfinish");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditSecondfinish1(String ordernumber, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.secondfinish");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditSecondfinishContainpwd1(String ordernumber, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.secondfinish.containpwd");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersCreditSmssend1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.credit.smssend");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 当前运单司机收入1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("当前运单司机收入1.0")
    public JSONObject assureordersDriverincomeQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.driverincome.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长运单查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车队长运单查询1.0")
    public JSONObject assureordersDriverstockorderQuery1(String leaderdriver, String stockcode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("leaderdriver", leaderdriver);//车队长编码
        map.put("stockcode", stockcode);//货源编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.driverstockorder.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单复核etc充值付款1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核etc充值付款1.0")
    public JSONObject assureordersEtcOrdercheckToolpay1(String ordernumber, String token, String clienttype, String password, String usercode, String paytime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("token", token);//token 验证
        map.put("clienttype", clienttype);//请求来源 获取请求设备系统 1pc 2移动客户端 3微信客户端
        map.put("password", password);//支付密码
        map.put("usercode", usercode);//支付人用户编码
        map.put("paytime", paytime);//充值节点 1 装货 2交货 3 尾款
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.etc.ordercheck.toolpay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * etc充值付款1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("etc充值付款1.0")
    public JSONObject assureordersEtcPay1(String ordernumber, String token, String clienttype, String password, String usercode, String paytime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("token", token);//token 验证
        map.put("clienttype", clienttype);//请求来源 获取请求设备系统 1pc 2移动客户端 3微信客户端
        map.put("password", password);//支付密码
        map.put("usercode", usercode);//支付人用户编码
        map.put("paytime", paytime);//充值节点 1 装货 2交货 3 尾款
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.etc.pay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * etc充值付款1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("etc充值付款1.0")
    public JSONObject assureordersEtcToolpay1(String ordernumber, String token, String clienttype, String password, String usercode, String paytime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("token", token);//token 验证
        map.put("clienttype", clienttype);//请求来源 获取请求设备系统 1pc 2移动客户端 3微信客户端
        map.put("password", password);//支付密码
        map.put("usercode", usercode);//支付人用户编码
        map.put("paytime", paytime);//充值节点 1 装货 2交货 3 尾款
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.etc.toolpay");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersFalsedelete1(String ordernumbers, String ret) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//
        map.put("ret", ret);//0成功 1处理失败
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.falsedelete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersFalsepay1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.falsepay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject assureordersFalsepay2(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.falsepay");//接口路径
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
     * 金融通知etc充值成功1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("金融通知etc充值成功1.0")
    public JSONObject assureordersFinanceNoticeEtcpay1(String ordernumber, String ret, String paytime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ret", ret);//0成功1失败
        map.put("paytime", paytime);//etc支付节点 1装货 2交货 3尾款
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.finance.notice.etcpay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 金融通知etc充值成功1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("金融通知etc充值成功1.0")
    public JSONObject assureordersFinanceNoticeEtctoolpay1(String ordernumber, String ret, String paytime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ret", ret);//0成功1失败
        map.put("paytime", paytime);//etc支付节点 1装货 2交货 3尾款
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.finance.notice.etctoolpay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 金融通知运单结清1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("金融通知运单结清1.0")
    public JSONObject assureordersFinanceNoticeOrderover1(String ordernumbers, String ret) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//
        map.put("ret", ret);//0成功 1处理失败
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.finance.notice.orderover");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersFinish1(String ordernumber, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.finish");//接口路径
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
     * 地址修改记录变更判定1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("地址修改记录变更判定1.0")
    public JSONObject assureordersLoadchangeValidate1(String ordernumber, String addresscode, String addresstype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单编码
        map.put("addresscode", addresscode);//地址编码
        map.put("addresstype", addresstype);//地址类型 1装 2卸
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.loadchange.validate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOilcardpay1(String holdercode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.oilcardpay");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOilcardpayContainpassword1(String holdercode, String ordernumber, String paypassword, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("ordernumber", ordernumber);//
        map.put("paypassword", paypassword);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.oilcardpay.containpassword");//接口路径
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
     * 批量复核未通过1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("批量复核未通过1.0")
    public JSONObject assureordersOrderBatchChecknotpass1(String ordernumbers, String checkmemo, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//多个运单号，逗号隔开
        map.put("checkmemo", checkmemo);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.batch.checknotpass");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("批量复核通过1.0")
    public JSONObject assureordersOrderBatchCheckpass1(String ordernumbers, String usercode, String paypassword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//多个运单号，逗号隔开
        map.put("usercode", usercode);//
        map.put("paypassword", paypassword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.batch.checkpass");//接口路径
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
     * 复核未通过1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("复核未通过1.0")
    public JSONObject assureordersOrderChecknotpass1(String ordernumber, String checkmemo, String usercode, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("checkmemo", checkmemo);//
        map.put("usercode", usercode);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.checknotpass");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("复核通过1.0")
    public JSONObject assureordersOrderCheckpass1(String ordernumber, String usercode, String paypassword, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("usercode", usercode);//
        map.put("paypassword", paypassword);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.checkpass");//接口路径
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
     * 运单复核查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核查询1.0")
    public JSONObject assureordersOrderCheckquerylatest1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.checkquerylatest");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 标注复核运单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("标注复核运单1.0")
    public JSONObject assureordersOrderChecktag1(String ordernumber, String tag) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("tag", tag);//标签 1标注 2取消标注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.checktag");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单补票1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单补票1.0")
    public JSONObject assureordersOrderOpenticket1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.openticket");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 付款失败重试1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("付款失败重试1.0")
    public JSONObject assureordersOrderPayagain1(String ordernumber, String usercode, String devicetype, String devicecode, String appkey) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("usercode", usercode);//
        map.put("devicetype", devicetype);//
        map.put("devicecode", devicecode);//
        map.put("appkey", appkey);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.payagain");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 标注运单通过1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("标注运单通过1.0")
    public JSONObject assureordersOrderTagCheckpass1(String usercode, String paypassword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("paypassword", paypassword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.order.tag.checkpass");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrderabnormalQuerylist1(String ordernumber, String targetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("targetcode", targetcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderabnormal.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 装卸货地地址修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("装卸货地地址修改1.0")
    public JSONObject assureordersOrderaddressUpdate1(String ordernumber, String originaladdresscode, String targetaddresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("originaladdresscode", originaladdresscode);//原始地址编码
        map.put("targetaddresscode", targetaddresscode);//目标地址编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderaddress.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 补签合同记录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("补签合同记录1.0")
    public JSONObject assureordersOrdercontractRecord1(String ordernumber, String contractno, String contractkind, String signtargetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("contractno", contractno);//合同号
        map.put("contractkind", contractkind);//合同种类 1卸货地改变补签合同 2非承运变承运补签合同
        map.put("signtargetcode", signtargetcode);//签合同用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.ordercontract.record");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrderdataDeal1(String orderdatatype, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderdatatype", orderdatatype);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderdata.deal");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrderdateAdd1(String ordernumber, String type, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("type", type);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderdate.add");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrderdriverQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderdriver.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrderdrivermessage1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderdrivermessage");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单支付失败重试2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单支付失败重试2.0")
    public JSONObject assureordersOrderfaliuePayagain2(String ordernumbers, String ordertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号，逗号隔开
        map.put("ordertype", ordertype);//支付业务类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderfaliue.payagain");//接口路径
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
     * 运单支付失败重试1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单支付失败重试1.0")
    public JSONObject assureordersOrderfaliuePayagain1(String ordernumbers, String ordertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//运单号，逗号隔开
        map.put("ordertype", ordertype);//支付业务类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderfaliue.payagain");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrdermutliCheckstateUpdate1(String usercode, String ordertype, String pass, String batch, String ordernumbers, String memo, String paypassword, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("ordertype", ordertype);//
        map.put("pass", pass);//
        map.put("batch", batch);//
        map.put("ordernumbers", ordernumbers);//
        map.put("memo", memo);//
        map.put("paypassword", paypassword);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.ordermutli.checkstate.update");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersOrderpayNotice1(String ordernumber, String tradeseq, String ret, String memomessage) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//支付唯一串
        map.put("tradeseq", tradeseq);//支付串
        map.put("ret", ret);//返回结果 0 支付成功 1实付失败
        map.put("memomessage", memomessage);//返回失败结果原因
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderpay.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 签收统计数据维护1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("签收统计数据维护1.0")
    public JSONObject assureordersOrderreceiverstaticsAdddate1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderreceiverstatics.adddate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 签收统计里程数据维护1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("签收统计里程数据维护1.0")
    public JSONObject assureordersOrderreceiverstaticsmileageAdddate1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderreceiverstaticsmileage.adddate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * orderstock数据维护1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("orderstock数据维护1.0")
    public JSONObject assureordersOrderstockAdddate1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderstock.adddate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 根据运单查询货源1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("根据运单查询货源1.0")
    public JSONObject assureordersOrderstockQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.orderstock.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersPlateformSelfcancle1(String ordernumber, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.plateform.selfcancle");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单预抢接口1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单预抢接口1.0")
    public JSONObject assureordersPreCreate1(String usercode, String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("stockcode", stockcode);//货源编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.pre.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersPrefinish1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.prefinish");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersPrepay1(String ordernumber, String usertype, String usercode, String accountid, String paymoney, String loanamount, String poundage, String favorable, String clientsrc, String paytype, String returnurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("usertype", usertype);//
        map.put("usercode", usercode);//
        map.put("accountid", accountid);//
        map.put("paymoney", paymoney);//
        map.put("loanamount", loanamount);//
        map.put("poundage", poundage);//
        map.put("favorable", favorable);//
        map.put("clientsrc", clientsrc);//
        map.put("paytype", paytype);//
        map.put("returnurl", returnurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.prepay");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersPrepayBatch1(String data, String usercode, String paymoney, String clientsrc, String returnurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//
        map.put("usercode", usercode);//
        map.put("paymoney", paymoney);//
        map.put("clientsrc", clientsrc);//
        map.put("returnurl", returnurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.prepay.batch");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单明细查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单明细查询1.0")
    public JSONObject assureordersQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQueryBodycancle1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//查询起始时间，时间戳格式
        map.put("enddate", enddate);//查询截至时间，时间戳格式
        map.put("start", start);//分页起始数
        map.put("limit", limit);//分页限制数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.query.bodycancle");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQueryOrderabnormal1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.query.orderabnormal");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQueryOrderstock1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.query.orderstock");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQueryStockanddriver1(String stockcode, String drivercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("drivercode", drivercode);//
        map.put("start", start);//分页起始数
        map.put("limit", limit);//分页限制数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.query.stockanddriver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQueryapprovalByholdercode1(String holdercode, String companycode, String kind, String begindate, String enddate, String start, String limit, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("companycode", companycode);//
        map.put("kind", kind);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.queryapproval.byholdercode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQueryapprovalByordernumber1(String ordernumber, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.queryapproval.byordernumber");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybathdetail1(String credit, String starttime, String endtime, String searchkey, String searchval, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("credit", credit);//
        map.put("starttime", starttime);//
        map.put("endtime", endtime);//
        map.put("searchkey", searchkey);//
        map.put("searchval", searchval);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybathdetail");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybathdetailNew1(String ordertype, String starttime, String endtime, String searchkey, String searchval, String start, String limit, String isdeal, String sort) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordertype", ordertype);//
        map.put("starttime", starttime);//
        map.put("endtime", endtime);//
        map.put("searchkey", searchkey);//
        map.put("searchval", searchval);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("isdeal", isdeal);//
        map.put("sort", sort);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybathdetail.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybathdetailWeb1(String holdercode, String begindate, String enddate, String drivercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("drivercode", drivercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybathdetail.web");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybychannelcode1(String usercode, String begindate, String enddate, String start, String limit, String kind, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("kind", kind);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybychannelcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybyclientphone1(String phone, String querytype, String begindate, String enddate, String start, String limit, String sorttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//
        map.put("querytype", querytype);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sorttype", sorttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybyclientphone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybycode1(String usercode, String begindate, String enddate, String start, String limit, String kind, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("kind", kind);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybycompanycode1(String companycode, String begindate, String enddate, String start, String limit, String kind, String ordernumber, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("kind", kind);//
        map.put("ordernumber", ordernumber);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybycompanycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybycompanycodeCount1(String companycode, String begindate, String enddate, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybycompanycode.count");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybyholdercode1(String usercode, String begindate, String enddate, String start, String limit, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybyholdercode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybykefu1(String isdeal, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("isdeal", isdeal);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybykefu");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybyordernumberortime1(String ordernumber, String dynamicstates, String staticstate, String begindate, String enddate, String start, String limit, String issigned) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("dynamicstates", dynamicstates);//
        map.put("staticstate", staticstate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("issigned", issigned);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybyordernumberortime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybyordernumbers1(String ordernumbers, String ret) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//
        map.put("ret", ret);//0成功 1处理失败
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybyordernumbers");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybystate1(String drivername, String intermediaryname, String consultstate, String complainstate, String suggeststate, String dealstate, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("drivername", drivername);//
        map.put("intermediaryname", intermediaryname);//
        map.put("consultstate", consultstate);//
        map.put("complainstate", complainstate);//
        map.put("suggeststate", suggeststate);//
        map.put("dealstate", dealstate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybystate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybystockcode1(String stockcode, String dynamicstates, String begindate, String enddate, String start, String limit, String staticstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("dynamicstates", dynamicstates);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("staticstate", staticstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybystockcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersQuerybyusercode1(String usercode, String stockcode, String dynamicstates, String staticstate, String begindate, String enddate, String start, String limit, String issigned) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("stockcode", stockcode);//
        map.put("dynamicstates", dynamicstates);//
        map.put("staticstate", staticstate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("issigned", issigned);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.querybyusercode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersRecharge1(String order_no, String ret, String msg, String sjb_order_number, String user_code) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("order_no", order_no);//
        map.put("ret", ret);//
        map.put("msg", msg);//
        map.put("sjb_order_number", sjb_order_number);//
        map.put("user_code", user_code);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.recharge");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersRefundquery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.refundquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersRunningassureordersQueryfordriver1(String usercode, String begindate, String enddate, String start, String limit, String kind, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("kind", kind);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.runningassureorders.queryfordriver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersSaveEcn1(String ordernumber, String electroniccontractno) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("electroniccontractno", electroniccontractno);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.save.ecn");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersSaveEcnbatch1(String data) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.save.ecnbatch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersSaveSimcard1(String ordernumber, String phonenum, String devicecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("phonenum", phonenum);//
        map.put("devicecode", devicecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.save.simcard");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("收单凭证查询1.0")
    public JSONObject assureordersSignproofQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.signproof.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersStockcostquery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.stockcostquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersSubmitadmin1(String ordernumber, String stockcode, String usercode, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("stockcode", stockcode);//
        map.put("usercode", usercode);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.submitadmin");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersTrackquery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.trackquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersTradedetailquery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.tradedetailquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUpdateSelfcancle1(String ordernumber, String dynamicstate, String signinstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("dynamicstate", dynamicstate);//
        map.put("signinstate", signinstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.update.selfcancle");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUpdateinformations1(String ordernumber, String informations) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("informations", informations);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.updateinformations");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUpdateorderdriver1(String ordernumber, String userleaderdrivercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("userleaderdrivercode", userleaderdrivercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.updateorderdriver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUpdateschedulefee1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.updateschedulefee");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUpdatestate1(String ordernumber, String dynamicstate, String signinstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("dynamicstate", dynamicstate);//
        map.put("signinstate", signinstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUpdatetime1(String ordernumber, String signloadtime, String signuploadtime, String clientchecktime, String companychecktime, String companycheckreceipttime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("signloadtime", signloadtime);//
        map.put("signuploadtime", signuploadtime);//
        map.put("clientchecktime", clientchecktime);//
        map.put("companychecktime", companychecktime);//
        map.put("companycheckreceipttime", companycheckreceipttime);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.updatetime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject assureordersUserlocationQuerybyordernumber1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.userlocation.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 根据运单号查询车辆信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("根据运单号查询车辆信息1.0")
    public JSONObject assureordersVehicleinformationQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "assureorders.vehicleinformation.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basecompanyCreate1(String companyname, String city, String source, String level, String introduction, String operationscope, String details, String createtime, String tel, String contact, String status, String statustime, String statusperson, String sijibao, String provincecode, String citycode, String updatetime, String iscontact, String levleattr, String address) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//
        map.put("city", city);//
        map.put("source", source);//
        map.put("level", level);//
        map.put("introduction", introduction);//
        map.put("operationscope", operationscope);//
        map.put("details", details);//
        map.put("createtime", createtime);//
        map.put("tel", tel);//
        map.put("contact", contact);//
        map.put("status", status);//
        map.put("statustime", statustime);//
        map.put("statusperson", statusperson);//
        map.put("sijibao", sijibao);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("updatetime", updatetime);//
        map.put("iscontact", iscontact);//
        map.put("levleattr", levleattr);//
        map.put("address", address);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basecompany.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basecompanyDelete1(String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basecompany.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basecompanyQuerybytel1(String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basecompany.querybytel");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basecompanyQuerybytels1(String tels, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tels", tels);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basecompany.querybytels");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basecompanyUpdate1(String companyname, String city, String source, String level, String introduction, String operationscope, String details, String tel, String contact, String status, String statustime, String statusperson, String sijibao, String provincecode, String citycode, String iscontact, String levleattr, String address) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//
        map.put("city", city);//
        map.put("source", source);//
        map.put("level", level);//
        map.put("introduction", introduction);//
        map.put("operationscope", operationscope);//
        map.put("details", details);//
        map.put("tel", tel);//
        map.put("contact", contact);//
        map.put("status", status);//
        map.put("statustime", statustime);//
        map.put("statusperson", statusperson);//
        map.put("sijibao", sijibao);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("iscontact", iscontact);//
        map.put("levleattr", levleattr);//
        map.put("address", address);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basecompany.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basedriverCreate1(String tel, String name, String city, String plateno, String source, String credibility, String memo, String details, String createtime, String vehicletype, String vehiclelength, String line, String ceitified, String sijibao, String provincecode, String citycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("name", name);//
        map.put("city", city);//
        map.put("plateno", plateno);//
        map.put("source", source);//
        map.put("credibility", credibility);//
        map.put("memo", memo);//
        map.put("details", details);//
        map.put("createtime", createtime);//
        map.put("vehicletype", vehicletype);//
        map.put("vehiclelength", vehiclelength);//
        map.put("line", line);//
        map.put("ceitified", ceitified);//
        map.put("sijibao", sijibao);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basedriver.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basedriverDelete1(String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basedriver.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basedriverQuerybytel1(String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basedriver.querybytel");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject basedriverUpdate1(String tel, String plateno, String source, String credibility, String memo, String details, String vehicletype, String vehiclelength, String line, String ceitified, String sijibao) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("plateno", plateno);//
        map.put("source", source);//
        map.put("credibility", credibility);//
        map.put("memo", memo);//
        map.put("details", details);//
        map.put("vehicletype", vehicletype);//
        map.put("vehiclelength", vehiclelength);//
        map.put("line", line);//
        map.put("ceitified", ceitified);//
        map.put("sijibao", sijibao);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "basedriver.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject billCreate1(String fromcode, String tocode, String billtype, String msgcode, String imagepath, String geotype, String address) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcode", fromcode);//
        map.put("tocode", tocode);//
        map.put("billtype", billtype);//
        map.put("msgcode", msgcode);//
        map.put("imagepath", imagepath);//
        map.put("lat", "30.460185");//
        map.put("lon", "114.429231");//
        map.put("geotype", geotype);//
        map.put("address", address);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bill.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject billQuery1(String fromcode, String tocode, String begintime, String endtime, String billtypes, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcode", fromcode);//
        map.put("tocode", tocode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("billtypes", billtypes);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "bill.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardCreate1(String usercode, String cards, String cargotype, String state, String button) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("cards", cards);//
        map.put("cargotype", cargotype);//
        map.put("state", state);//
        map.put("button", button);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardExpectlineAdd1(String usercode, String sourcecode, String targetcode, String linetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("linetype", linetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.expectline.add");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardExpectlineRemove1(String usercode, String linecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("linecode", linecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.expectline.remove");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardExpectlineUpdate1(String usercode, String linecode, String linetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("linecode", linecode);//
        map.put("linetype", linetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.expectline.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardQuery1(String card, String cargotype, String state, String begintime, String endtime, String usertype, String linetype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("card", card);//
        map.put("cargotype", cargotype);//
        map.put("state", state);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("usertype", usertype);//
        map.put("linetype", linetype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardQueryAll1(String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//分页起始数
        map.put("limit", limit);//分页限制数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.query.all");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardQuerybyupdatedate1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.querybyupdatedate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardQuerybyuser1(String usercode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.querybyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardUpdate1(String usercode, String cargotype, String state, String button) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("cargotype", cargotype);//
        map.put("state", state);//
        map.put("button", button);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardValiddetailquery1(String state, String valid, String start, String limit, String button) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//
        map.put("valid", valid);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("button", button);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.validdetailquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cargocardValidquery1(String state, String valid, String start, String limit, String button) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//
        map.put("valid", valid);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("button", button);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cargocard.validquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataCreate1(String holdercode, String companyname, String linker, String idurl, String licenceurl, String otherurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("companyname", companyname);//
        map.put("linker", linker);//
        map.put("idurl", idurl);//
        map.put("licenceurl", licenceurl);//
        map.put("otherurl", otherurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataCreateNew1(String holdercode, String companyname, String linker, String idurl, String licenceurl, String otherurl, String otheridurl, String idcode, String businesslicensecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("companyname", companyname);//
        map.put("linker", linker);//
        map.put("idurl", idurl);//
        map.put("licenceurl", licenceurl);//
        map.put("otherurl", otherurl);//
        map.put("otheridurl", otheridurl);//
        map.put("idcode", idcode);//
        map.put("businesslicensecode", businesslicensecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.create.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataQuery1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataQueryblankblc1(String begindate, String enddate, String start, String limit, String certifystate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("certifystate", certifystate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.queryblankblc");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataQuerybycodes1(String holdercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercodes", holdercodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataQuerybytime1(String begindate, String enddate, String kind, String keyword, String start, String limit, String certifystate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("kind", kind);//
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("certifystate", certifystate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.querybytime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataUpdate1(String certifycode, String companyname, String linker, String idurl, String licenceurl, String otherurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("companyname", companyname);//
        map.put("linker", linker);//
        map.put("idurl", idurl);//
        map.put("licenceurl", licenceurl);//
        map.put("otherurl", otherurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataUpdateBusinesslicensecode1(String certifycode, String businesslicensecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("businesslicensecode", businesslicensecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.update.businesslicensecode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataUpdateNew1(String certifycode, String companyname, String linker, String idurl, String licenceurl, String otherurl, String otheridurl, String idcode, String businesslicensecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("companyname", companyname);//
        map.put("linker", linker);//
        map.put("idurl", idurl);//
        map.put("licenceurl", licenceurl);//
        map.put("otherurl", otherurl);//
        map.put("otheridurl", otheridurl);//
        map.put("idcode", idcode);//
        map.put("businesslicensecode", businesslicensecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.update.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataUpdatestate1(String holdercode, String state, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("state", state);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifydataUpdateurl1(String certifycode, String companyname, String linker, String idurl, String licenceurl, String otherurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("companyname", companyname);//
        map.put("linker", linker);//
        map.put("idurl", idurl);//
        map.put("licenceurl", licenceurl);//
        map.put("otherurl", otherurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifydata.updateurl");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifylogQuery1(String flowid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifylog.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifylogQuerybyholder1(String certifytype, String holdercode, String requeststate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifytype", certifytype);//
        map.put("holdercode", holdercode);//
        map.put("requeststate", requeststate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifylog.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifylogQuerybyholdercertifier1(String certifytype, String holdercode, String certifiercode, String requeststate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifytype", certifytype);//
        map.put("holdercode", holdercode);//
        map.put("certifiercode", certifiercode);//
        map.put("requeststate", requeststate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifylog.querybyholdercertifier");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifylogQuerybyholdercertifiers1(String certifytype, String holdercodes, String certifiercodes, String requeststate, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifytype", certifytype);//
        map.put("holdercodes", holdercodes);//
        map.put("certifiercodes", certifiercodes);//
        map.put("requeststate", requeststate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifylog.querybyholdercertifiers");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifylogQuerybyholderres1(String certifytype, String holdercode, String requeststate, String responsestate, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifytype", certifytype);//
        map.put("holdercode", holdercode);//
        map.put("requeststate", requeststate);//
        map.put("responsestate", responsestate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifylog.querybyholderres");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject certifylogQuerybytype1(String certifytype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifytype", certifytype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "certifylog.querybytype");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject channelStatisticsSurereceiptcount1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "channel.statistics.surereceiptcount");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 文件访问的前缀查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("文件访问的前缀查询1.0")
    public JSONObject cloadfileSiteurl1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadfile.siteurl");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油付款成功通知1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油付款成功通知1.0")
    public JSONObject cloadfileStationPayNotice1(String msg, String tocodes, String paydriver, String drivermsg) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("msg", msg);//
        map.put("tocodes", tocodes);//
        map.put("paydriver", paydriver);//
        map.put("drivermsg", drivermsg);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadfile.station.pay.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * base64文件上传1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("base64文件上传1.0")
    public JSONObject cloadfileUpload1(String usercode, String filepath, String filename, String filepara, String filesize, String filezip, String filedata) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户code
        map.put("filepath", filepath);//上传路径,如：/test/photo
        map.put("filename", filename);//文件名称,如： photo.png
        map.put("filepara", filepara);//文件扩展参数
        map.put("filesize", filesize);//文件大小，数据长度校验
        map.put("filezip", filezip);//是否zip文件
        map.put("filedata", filedata);//文件数据
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadfile.upload");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsChooseregionfromlocation1(String longitude, String latitude, String geotype, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.chooseregionfromlocation");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsDistancebypoints1(String longitude1, String latitude1, String longitude2, String latitude2, String geotype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude1", longitude1);//
        map.put("latitude1", latitude1);//
        map.put("longitude2", longitude2);//
        map.put("latitude2", latitude2);//
        map.put("geotype", geotype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.distancebypoints");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsGeotypeconvert1(String longitude, String latitude, String from, String to) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("from", from);//
        map.put("to", to);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.geotypeconvert");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocatebypoint1(String longitude, String latitude, String geotype, String category, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("category", category);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locatebypoint");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocatebysquare1(String longitude, String latitude, String geotype, String category, String max) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("category", category);//
        map.put("max", max);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locatebysquare");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocatewithinbox1(String longitude1, String latitude1, String longitude2, String latitude2, String geotype, String category, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude1", longitude1);//
        map.put("latitude1", latitude1);//
        map.put("longitude2", longitude2);//
        map.put("latitude2", latitude2);//
        map.put("geotype", geotype);//
        map.put("category", category);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locatewithinbox");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocatewithincenter1(String longitude, String latitude, String radius, String geotype, String category, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("radius", radius);//
        map.put("geotype", geotype);//
        map.put("category", category);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locatewithincenter");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocationfromregion1(String regioncode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locationfromregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocationfromregioncode1(String regioncode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locationfromregioncode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocationfromregionname1(String regionname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regionname", regionname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locationfromregionname");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsLocationfromusercodes1(String usercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.locationfromusercodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsParserlocation1(String longitude, String latitude, String geotype, String kind, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("kind", kind);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.parserlocation");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsPointcreate1(String longitude, String latitude, String altitude, String geotype, String locate, String locatecode, String category, String timestamp) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("altitude", altitude);//
        map.put("geotype", geotype);//
        map.put("locate", locate);//
        map.put("locatecode", locatecode);//
        map.put("category", category);//
        map.put("timestamp", timestamp);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.pointcreate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsPointdestroy1(String locatecode, String category) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("locatecode", locatecode);//
        map.put("category", category);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.pointdestroy");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsRegionfromlocation1(String longitude, String latitude, String geotype, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.regionfromlocation");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsSearchinterests1(String regioncode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.searchinterests");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsUserHislocation1(String usercode, String begindate, String enddate, String precisiongrade, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("precisiongrade", precisiongrade);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.user.hislocation");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsUserHislocationQuery1(String usercode, String begindate, String enddate, String precisiongrade, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("precisiongrade", precisiongrade);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.user.hislocation.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsWeatherfromregion1(String regioncode, String regionname, String offset) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("offset", offset);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.weatherfromregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsWeatherfromregioncode1(String regioncode, String regionname, String offset) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("offset", offset);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.weatherfromregioncode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadlbsWeatherfromregioncodes1(String regioncodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncodes", regioncodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlbs.weatherfromregioncodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadluceneIndex1(String catalog, String identity, String urler, String title, String content, String modified) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("catalog", catalog);//
        map.put("identity", identity);//
        map.put("urler", urler);//
        map.put("title", title);//
        map.put("content", content);//
        map.put("modified", modified);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlucene.index");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadluceneSearch1(String catalog, String keyword, String top, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("catalog", catalog);//
        map.put("keyword", keyword);//
        map.put("top", top);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadlucene.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadmailSend1(String mailto, String subject, String content, String html) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mailto", mailto);//
        map.put("subject", subject);//
        map.put("content", content);//
        map.put("html", html);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadmail.send");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpayAlipayGetpaystate1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpay.alipay.getpaystate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpayAlipayGetprepayinfo1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpay.alipay.getprepayinfo");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushAgentstockmessageWeixinsend1(String fromusercode, String usercodes, String stockagentcode, String agentname, String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromusercode", fromusercode);//
        map.put("usercodes", usercodes);//
        map.put("stockagentcode", stockagentcode);//
        map.put("agentname", agentname);//
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.agentstockmessage.weixinsend");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgApplierQuerybyucode1(String usercode, String category, String begindate, String enddate, String keyword, String appliertype, String start, String limit, String send, String readed) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("category", category);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("appliertype", appliertype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("send", send);//
        map.put("readed", readed);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.applier.querybyucode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgApplierUpdatestate1(String cardmsgcode, String usercode, String state, String origincode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardmsgcode", cardmsgcode);//
        map.put("usercode", usercode);//
        map.put("state", state);//
        map.put("origincode", origincode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.applier.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgDelete1(String cardmsgcodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardmsgcodes", cardmsgcodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgQueryapplier1(String cardmsgcode, String begindate, String enddate, String start, String limit, String send, String readed, String appliertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardmsgcode", cardmsgcode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("send", send);//
        map.put("readed", readed);//
        map.put("appliertype", appliertype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.queryapplier");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgQuerybycode1(String cardmsgcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardmsgcode", cardmsgcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.querybycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgQuerybycodes1(String cardmsgcodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardmsgcodes", cardmsgcodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgQuerybyholder1(String holdercode, String begindate, String enddate, String category, String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("category", category);//
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgReadcardmsg1(String msgcode, String usercode, String origincode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("msgcode", msgcode);//
        map.put("usercode", usercode);//
        map.put("origincode", origincode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.readcardmsg");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgSent1(String targetcodes, String cardmsgcode, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("targetcodes", targetcodes);//
        map.put("cardmsgcode", cardmsgcode);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.sent");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgSent_batch1(String toappcode, String groupcode, String rostercodes, String membertype, String cardmsgcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("toappcode", toappcode);//
        map.put("groupcode", groupcode);//
        map.put("rostercodes", rostercodes);//
        map.put("membertype", membertype);//
        map.put("cardmsgcode", cardmsgcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.sent_batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgSent_syn1(String targetcodes, String cardmsgcode, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("targetcodes", targetcodes);//
        map.put("cardmsgcode", cardmsgcode);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.sent_syn");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgSimplecreate1(String usercode, String title, String imageurl, String audiourl, String videourl, String content, String linkurl, String linktype, String category, String tel, String name, String sourceurl, String fathercode, String tarnsmittimes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("title", title);//
        map.put("imageurl", imageurl);//
        map.put("audiourl", audiourl);//
        map.put("videourl", videourl);//
        map.put("content", content);//
        map.put("linkurl", linkurl);//
        map.put("linktype", linktype);//
        map.put("category", category);//
        map.put("tel", tel);//
        map.put("name", name);//
        map.put("sourceurl", sourceurl);//
        map.put("fathercode", fathercode);//
        map.put("tarnsmittimes", tarnsmittimes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.simplecreate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushCardmsgUpdatestate1(String cardmsgcodes, String usercode, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("cardmsgcodes", cardmsgcodes);//
        map.put("usercode", usercode);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.cardmsg.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushGroupmessage1(String toappcode, String groupcode, String type, String subtype, String message, String extra, String rostercodes, String membertype, String noticecontent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("toappcode", toappcode);//
        map.put("groupcode", groupcode);//
        map.put("type", type);//
        map.put("subtype", subtype);//
        map.put("message", message);//
        map.put("extra", extra);//
        map.put("rostercodes", rostercodes);//
        map.put("membertype", membertype);//
        map.put("noticecontent", noticecontent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.groupmessage");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushQuerybyholder1(String holdercode1, String holdercode2, String types, String date, String enddate, String start, String limit, String basal) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode1", holdercode1);//
        map.put("holdercode2", holdercode2);//
        map.put("types", types);//
        map.put("date", date);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("basal", basal);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushQuerybyid1(String flowid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.querybyid");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushQuerybyuser1(String fromcode, String tocode, String type, String date, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcode", fromcode);//
        map.put("tocode", tocode);//
        map.put("type", type);//
        map.put("date", date);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.querybyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushSessionmessageQuery1(String keyword, String holdercode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("holdercode", holdercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.sessionmessage.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushTypeusersmessage1(String fromusercode, String usertype, String type, String message, String extra, String noticecontent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromusercode", fromusercode);//
        map.put("usertype", usertype);//
        map.put("type", type);//
        map.put("message", message);//
        map.put("extra", extra);//
        map.put("noticecontent", noticecontent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.typeusersmessage");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushUpdatereaded1(String flowid, String readed) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//
        map.put("readed", readed);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.updatereaded");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushUsermessage1(String fromusercode, String toappcode, String usercode, String type, String subtype, String message, String extra, String noticecontent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromusercode", fromusercode);//
        map.put("toappcode", toappcode);//
        map.put("usercode", usercode);//
        map.put("type", type);//
        map.put("subtype", subtype);//
        map.put("message", message);//
        map.put("extra", extra);//
        map.put("noticecontent", noticecontent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.usermessage");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushUsersmessage1(String fromusercode, String toappcode, String usercodes, String type, String subtype, String message, String extra, String noticecontent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromusercode", fromusercode);//
        map.put("toappcode", toappcode);//
        map.put("usercodes", usercodes);//
        map.put("type", type);//
        map.put("subtype", subtype);//
        map.put("message", message);//
        map.put("extra", extra);//
        map.put("noticecontent", noticecontent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.usersmessage");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadpushUsersmessageSyn1(String fromusercode, String toappcode, String usercodes, String type, String subtype, String message, String extra, String noticecontent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromusercode", fromusercode);//
        map.put("toappcode", toappcode);//
        map.put("usercodes", usercodes);//
        map.put("type", type);//
        map.put("subtype", subtype);//
        map.put("message", message);//
        map.put("extra", extra);//
        map.put("noticecontent", noticecontent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadpush.usersmessage.syn");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadsmsIdenticode1(String phone, String kind, String keeptime, String createtime, String smstype, String applicationtype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//
        map.put("kind", kind);//
        map.put("keeptime", keeptime);//
        map.put("createtime", createtime);//
        map.put("smstype", smstype);//
        map.put("applicationtype", applicationtype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadsms.identicode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadsmsIdenticodecheck1(String tel, String identicode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("identicode", identicode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadsms.identicodecheck");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject cloadsmsSend2(String mobile, String content, String stype, String verifycode, String validsecond, String attenuator, String norepeatsecond, String norepeattimes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("content", content);//
        map.put("stype", stype);//
        map.put("verifycode", verifycode);//
        map.put("validsecond", validsecond);//
        map.put("attenuator", attenuator);//
        map.put("norepeatsecond", norepeatsecond);//
        map.put("norepeattimes", norepeattimes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadsms.send");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadsmsSend1(String mobile, String content, String smstype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("content", content);//
        map.put("smstype", smstype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadsms.send");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 3.0
     *
     * @return response
     * @throws Exception
     */
    @Step("3.0")
    public JSONObject cloadsmsSend3(String mobile, String content, String stype, String verifycode, String validsecond, String attenuator, String norepeatsecond, String norepeattimes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("content", content);//
        map.put("stype", stype);//
        map.put("verifycode", verifycode);//
        map.put("validsecond", validsecond);//
        map.put("attenuator", attenuator);//
        map.put("norepeatsecond", norepeatsecond);//
        map.put("norepeattimes", norepeattimes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadsms.send");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadsmsVerify1(String mobile, String verifycode, String stype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("verifycode", verifycode);//
        map.put("stype", stype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadsms.verify");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadtaskCreate1(String name) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", name);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadtask.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadtaskDelete1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadtask.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadtaskQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadtask.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadtaskSubmit1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadtask.submit");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cloadtaskSuspend1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cloadtask.suspend");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cmpnydriverinfoCreate1(String data, String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cmpnydriverinfo.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cmpnydriverinfoDelete1(String holdercode, String usermobiles) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("usermobiles", usermobiles);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cmpnydriverinfo.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cmpnydriverinfoQuerybymobile1(String usermobile, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usermobile", usermobile);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cmpnydriverinfo.querybymobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cmpnydriverinfoSearch1(String kind, String holdercode, String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("kind", kind);//
        map.put("holdercode", holdercode);//
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cmpnydriverinfo.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject cmpnydriverinfoUpdate1(String holdercode, String usermobile, String idcard, String username, String construct, String length, String platecode, String invited) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("usermobile", usermobile);//
        map.put("idcard", idcard);//
        map.put("username", username);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("platecode", platecode);//
        map.put("invited", invited);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "cmpnydriverinfo.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject coalCreate1(String companycode, String coalname, String price) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("coalname", coalname);//
        map.put("price", price);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject coalDelete1(String code, String start, String limit, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject coalQuery1(String code, String start, String limit, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject coalQuerybycompany1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject coalUpdate1(String coalcode, String coalname, String price) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("coalcode", coalcode);//
        map.put("coalname", coalname);//
        map.put("price", price);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "coal.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentCreate1(String fromcode, String targetcode, String commenttype, String grade, String images, String wordcontent, String commenttime, String commentcode, String itskind, String commentitscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcode", fromcode);//
        map.put("targetcode", targetcode);//
        map.put("commenttype", commenttype);//
        map.put("grade", grade);//
        map.put("images", images);//
        map.put("wordcontent", wordcontent);//
        map.put("commenttime", commenttime);//
        map.put("commentcode", commentcode);//
        map.put("itskind", itskind);//
        map.put("commentitscode", commentitscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentDelete1(String commentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentGradeTargetcode1(String targetcode, String commentkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("targetcode", targetcode);//
        map.put("commentkind", commentkind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.grade.targetcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentGradeTargetcodes1(String codes, String commentkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("codes", codes);//
        map.put("commentkind", commentkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.grade.targetcodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentQuerybycommentcode1(String commentcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.querybycommentcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentQuerybyfromandtarget1(String fromcode, String targetcode, String commenttype, String commentkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcode", fromcode);//
        map.put("targetcode", targetcode);//
        map.put("commenttype", commenttype);//
        map.put("commentkind", commentkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.querybyfromandtarget");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentQuerybyits1(String commentitscode, String itskind, String start, String limit, String fromcode, String targetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentitscode", commentitscode);//
        map.put("itskind", itskind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("fromcode", fromcode);//
        map.put("targetcode", targetcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.querybyits");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentQuerybytarget1(String fromcode, String targetcode, String commenttype, String commentkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcode", fromcode);//
        map.put("targetcode", targetcode);//
        map.put("commenttype", commenttype);//
        map.put("commentkind", commentkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.querybytarget");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentReplyCreate1(String commentcode, String replycode, String wordcontent, String replyimages, String fathercode, String replytime, String commentreplycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//
        map.put("replycode", replycode);//
        map.put("wordcontent", wordcontent);//
        map.put("replyimages", replyimages);//
        map.put("fathercode", fathercode);//
        map.put("replytime", replytime);//
        map.put("commentreplycode", commentreplycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.reply.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentReplyDelete1(String commentcode, String commentreplycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//
        map.put("commentreplycode", commentreplycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.reply.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentReplyUpdate1(String commentcode, String commentreplycode, String wordcontent, String replyimages) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//
        map.put("commentreplycode", commentreplycode);//
        map.put("wordcontent", wordcontent);//
        map.put("replyimages", replyimages);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.reply.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commentUpdate1(String commentcode, String grade, String wordcontent, String images) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//
        map.put("grade", grade);//
        map.put("wordcontent", wordcontent);//
        map.put("images", images);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonClientinfoCreate1(String system, String systemversion, String version, String screen, String model, String phone, String channel, String devicecode, String usercode, String oappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("system", system);//
        map.put("systemversion", systemversion);//
        map.put("version", version);//
        map.put("screen", screen);//
        map.put("model", model);//
        map.put("phone", phone);//
        map.put("channel", channel);//
        map.put("devicecode", devicecode);//
        map.put("usercode", usercode);//
        map.put("oappcode", oappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.clientinfo.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonClientinfoQuery1(String oappcode, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oappcode", oappcode);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.clientinfo.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonClientinfoUpdate1(String system, String systemversion, String version, String screen, String model, String phone, String channel, String devicecode, String usercode, String oappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("system", system);//
        map.put("systemversion", systemversion);//
        map.put("version", version);//
        map.put("screen", screen);//
        map.put("model", model);//
        map.put("phone", phone);//
        map.put("channel", channel);//
        map.put("devicecode", devicecode);//
        map.put("usercode", usercode);//
        map.put("oappcode", oappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.clientinfo.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDateLunar2solar1(String year, String month, String day) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("year", year);//
        map.put("month", month);//
        map.put("day", day);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.date.lunar2solar");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDateSolar2lunar1(String year, String month, String day) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("year", year);//
        map.put("month", month);//
        map.put("day", day);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.date.solar2lunar");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDictitemCreate1(String typecode, String dictcode, String dictname, String sortindex) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("dictcode", dictcode);//
        map.put("dictname", dictname);//
        map.put("sortindex", sortindex);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDictitemDelete1(String typecode, String dictcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("dictcode", dictcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDictitemQuery1(String typecode, String dictcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("dictcode", dictcode);//
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDictitemQuerybytype1(String typecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.querybytype");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDictitemQuerybytypes1(String typecodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecodes", typecodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.querybytypes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDictitemUpdate1(String typecode, String dictcode, String dictname, String sortindex) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("dictcode", dictcode);//
        map.put("dictname", dictname);//
        map.put("sortindex", sortindex);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dictitem.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDicttypeCreate1(String typecode, String typename, String standard, String writable, String version) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("typename", typename);//
        map.put("standard", standard);//
        map.put("writable", writable);//
        map.put("version", version);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dicttype.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDicttypeDelete1(String typecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dicttype.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDicttypePager1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dicttype.pager");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDicttypeQuery1(String typecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dicttype.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonDicttypeUpdate1(String typecode, String typename, String standard, String writable, String version) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("typecode", typecode);//
        map.put("typename", typename);//
        map.put("standard", standard);//
        map.put("writable", writable);//
        map.put("version", version);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.dicttype.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonGetshorturl1(String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("url", url);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.getshorturl");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonIdcodeQuery1(String idcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("idcode", idcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.idcode.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonLogCreate1(String code, String name, String type, String desc, String para1, String para2, String para3) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("name", name);//
        map.put("type", type);//
        map.put("desc", desc);//
        map.put("para1", para1);//
        map.put("para2", para2);//
        map.put("para3", para3);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.log.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonLogisticscodequery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.logisticscodequery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonLogisticsquery1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.logisticsquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonLogisticsquerybynumber1(String no, String logisticscompany) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("no", no);//
        map.put("logisticscompany", logisticscompany);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.logisticsquerybynumber");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonLogisticsupdate1(String ordernumber, String no, String logisticscompany) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("no", no);//
        map.put("logisticscompany", logisticscompany);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.logisticsupdate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonLongToShort1(String longurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longurl", longurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.long.to.short");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonNoticeSchedule1(String currenttime, String type, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("currenttime", currenttime);//
        map.put("type", type);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.notice.schedule");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonQueueReset1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.queue.reset");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonRegionCreate1(String regioncode, String regionname, String regionlevel, String parentcode, String parentname, String regionarea, String regionpopulation, String regionpostcode, String regionphonecode, String regionmemo, String longitude, String latitude, String sortindex, String nickname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("regionlevel", regionlevel);//
        map.put("parentcode", parentcode);//
        map.put("parentname", parentname);//
        map.put("regionarea", regionarea);//
        map.put("regionpopulation", regionpopulation);//
        map.put("regionpostcode", regionpostcode);//
        map.put("regionphonecode", regionphonecode);//
        map.put("regionmemo", regionmemo);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("sortindex", sortindex);//
        map.put("nickname", nickname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonRegionDelete1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonRegionQuery1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonRegionQuerybynames1(String regionnames, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regionnames", regionnames);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.querybynames");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonRegionQuerybyparent1(String parentcode, String regionlevel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("parentcode", parentcode);//
        map.put("regionlevel", regionlevel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.querybyparent");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonRegionUpdate1(String regioncode, String regionname, String regionlevel, String parentcode, String parentname, String regionarea, String regionpopulation, String regionpostcode, String regionphonecode, String regionmemo, String longitude, String latitude, String sortindex, String nickname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("regionlevel", regionlevel);//
        map.put("parentcode", parentcode);//
        map.put("parentname", parentname);//
        map.put("regionarea", regionarea);//
        map.put("regionpopulation", regionpopulation);//
        map.put("regionpostcode", regionpostcode);//
        map.put("regionphonecode", regionphonecode);//
        map.put("regionmemo", regionmemo);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("sortindex", sortindex);//
        map.put("nickname", nickname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.region.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject commonSetShortbutton1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "common.set.shortbutton");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyBizcityAdd1(String regioncodes, String companycode, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncodes", regioncodes);//
        map.put("companycode", companycode);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.bizcity.add");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyBizcityRemove1(String regioncodes, String companycode, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncodes", regioncodes);//
        map.put("companycode", companycode);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.bizcity.remove");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCertifyQuery1(String begindate, String enddate, String start, String limit, String certifystate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("certifystate", certifystate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.certify.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCommonconfigQuery1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.commonconfig.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCommonconfigUpdate1(String companycode, String stockcostlimit, String enterprisenature, String companyreportflag, String oillimit, String etclimit, String isGetCheckForFee, String isGetFraction) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("stockcostlimit", stockcostlimit);//
        map.put("enterprisenature", enterprisenature);//
        map.put("companyreportflag", companyreportflag);//
        map.put("oillimit", oillimit);//
        map.put("etclimit", etclimit);//
        map.put("isGetCheckForFee", isGetCheckForFee);//
        map.put("isGetFraction", isGetFraction);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.commonconfig.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCommonfigQuery1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.commonfig.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCommonfigQuerylist1(String companycodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycodes", companycodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.commonfig.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCompanycertifyQuery1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.companycertify.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCompanycertifyUpdate1(String certifycode, String companyname, String linker, String idcode, String idcardfrontphoto, String idcardbackphoto, String licenceurl, String otherurl, String licensecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("companyname", companyname);//
        map.put("linker", linker);//
        map.put("idcode", idcode);//
        map.put("idcardfrontphoto", idcardfrontphoto);//
        map.put("idcardbackphoto", idcardbackphoto);//
        map.put("licenceurl", licenceurl);//
        map.put("otherurl", otherurl);//
        map.put("licensecode", licensecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.companycertify.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyCreate1(String companyname, String companydesc, String companyscope, String companyaddr, String companylinker, String companyphone, String companylogourl, String regioncode, String regionname, String parentcode, String parentname, String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyname", companyname);//
        map.put("companydesc", companydesc);//
        map.put("companyscope", companyscope);//
        map.put("companyaddr", companyaddr);//
        map.put("companylinker", companylinker);//
        map.put("companyphone", companyphone);//
        map.put("companylogourl", companylogourl);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("parentcode", parentcode);//
        map.put("parentname", parentname);//
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyDriverFriendsQuerylist1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.driver.friends.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyLinkerCreate1(String companycode, String name, String tel, String type, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("name", name);//
        map.put("tel", tel);//
        map.put("type", type);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.linker.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyLinkerDelete1(String companylinkercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companylinkercode", companylinkercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.linker.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyLinkerQuery1(String companycode, String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.linker.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyLinkerQuerybycode1(String companylinkercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companylinkercode", companylinkercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.linker.querybycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyLinkerUpdate1(String companylinkercode, String type, String name, String tel, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companylinkercode", companylinkercode);//
        map.put("type", type);//
        map.put("name", name);//
        map.put("tel", tel);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.linker.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberChgpass1(String oldpass, String newpass, String membercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldpass", oldpass);//
        map.put("newpass", newpass);//
        map.put("membercode", membercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.chgpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("oldpass");
        ignoreParamNames.add("newpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberCreate1(String companyCode, String companyName, String memberMobile, String memberName, String memberPassword, String memberCode, String memberMemo, String memberState, String memberType) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//
        map.put("companyName", companyName);//
        map.put("memberMobile", memberMobile);//
        map.put("memberName", memberName);//
        map.put("memberPassword", memberPassword);//
        map.put("memberCode", memberCode);//
        map.put("memberMemo", memberMemo);//
        map.put("memberState", memberState);//
        map.put("memberType", memberType);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberPager1(String companycode, String memberStates, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("memberStates", memberStates);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.pager");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberQueryBycode1(String companyMemberCode, String companyCode, String memberMobile, String memberCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//
        map.put("companyCode", companyCode);//
        map.put("memberMobile", memberMobile);//
        map.put("memberCode", memberCode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.bycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberQueryBymember1(String companyMemberCode, String companyCode, String memberMobile, String memberCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//
        map.put("companyCode", companyCode);//
        map.put("memberMobile", memberMobile);//
        map.put("memberCode", memberCode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.bymember");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberQueryBymobile1(String companyMemberCode, String companyCode, String memberMobile, String memberCode, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//
        map.put("companyCode", companyCode);//
        map.put("memberMobile", memberMobile);//
        map.put("memberCode", memberCode);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.bymobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberQueryList1(String companycode, String memberStates, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("memberStates", memberStates);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.query.list");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberResetpass1(String membercode, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.resetpass");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberUpdate1(String companyMemberCode, String companyCode, String companyName, String memberMobile, String newMobile, String memberName, String memberCode, String memberMemo, String memberState, String memberType) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//
        map.put("companyCode", companyCode);//
        map.put("companyName", companyName);//
        map.put("memberMobile", memberMobile);//
        map.put("newMobile", newMobile);//
        map.put("memberName", memberName);//
        map.put("memberCode", memberCode);//
        map.put("memberMemo", memberMemo);//
        map.put("memberState", memberState);//
        map.put("memberType", memberType);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberUpdatePaypermissions1(String companymembercode, String canconfirmdriverpay, String canloadingplacepay, String cansignforpay, String canreceiptbackpay, String closepay, String isspecial) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companymembercode", companymembercode);//
        map.put("canconfirmdriverpay", canconfirmdriverpay);//
        map.put("canloadingplacepay", canloadingplacepay);//
        map.put("cansignforpay", cansignforpay);//
        map.put("canreceiptbackpay", canreceiptbackpay);//
        map.put("closepay", closepay);//
        map.put("isspecial", isspecial);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.update.paypermissions");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberUpdateState1(String companyMemberCode, String companyCode, String memberMobile, String memberState) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyMemberCode", companyMemberCode);//
        map.put("companyCode", companyCode);//
        map.put("memberMobile", memberMobile);//
        map.put("memberState", memberState);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.update.state");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyMemberValidatepass1(String membercode, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.member.validatepass");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuery1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybycodes1(String codes, String commentkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("codes", codes);//
        map.put("commentkind", commentkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyholder1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyholderFirst1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyholder.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyholdernewFirst1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyholdernew.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyholdersFirst1(String codes, String commentkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("codes", codes);//
        map.put("commentkind", commentkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyholders.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyjoiner1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyjoiner");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybykeyword1(String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybykeyword");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybylocation1(String longitude, String latitude, String geotype, String certified, String memberstates, String start, String limit, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("certified", certified);//
        map.put("memberstates", memberstates);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybylocation");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybylocation11(String longitude, String latitude, String geotype, String certified, String memberstates, String start, String limit, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("certified", certified);//
        map.put("memberstates", memberstates);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybylocation1");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybymember1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybymember");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyparent1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyparent");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyQuerybystock1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.querybystock");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companySearch1(String keyword, String begintime, String endtime, String certified, String accounttype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("certified", certified);//
        map.put("accounttype", accounttype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyUpdate1(String companycode, String companyname, String companydesc, String companyscope, String companyaddr, String companylinker, String companyphone, String companylogourl, String regioncode, String regionname, String parentcode, String parentname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("companydesc", companydesc);//
        map.put("companyscope", companyscope);//
        map.put("companyaddr", companyaddr);//
        map.put("companylinker", companylinker);//
        map.put("companyphone", companyphone);//
        map.put("companylogourl", companylogourl);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("parentcode", parentcode);//
        map.put("parentname", parentname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyUpdateholder1(String companycode, String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.updateholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject companyUpdatelocation1(String companycode, String longitude, String latitude, String geotype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.updatelocation");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordAddevindence1(String complainrecordcode, String evindenceurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("complainrecordcode", complainrecordcode);//
        map.put("evindenceurl", evindenceurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.addevindence");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordCreate1(String ordernumber, String complainrecordreason, String complainrecordothersreason, String complainrecordevindence, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("complainrecordreason", complainrecordreason);//
        map.put("complainrecordothersreason", complainrecordothersreason);//
        map.put("complainrecordevindence", complainrecordevindence);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordDealcreate1(String ordernumber, String beneficiary, String income, String pay, String compensator, String driverjudgment, String intermediaryjudgment, String judgmentpicture, String drivertopaybasis1, String drivertopaybasis2, String drivertopaybasis3, String intermediarytopaybasis1, String intermediarytopaybasis2, String intermediarytopaybasis3, String kind, String kefupassword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("beneficiary", beneficiary);//
        map.put("income", income);//
        map.put("pay", pay);//
        map.put("compensator", compensator);//
        map.put("driverjudgment", driverjudgment);//
        map.put("intermediaryjudgment", intermediaryjudgment);//
        map.put("judgmentpicture", judgmentpicture);//
        map.put("drivertopaybasis1", drivertopaybasis1);//
        map.put("drivertopaybasis2", drivertopaybasis2);//
        map.put("drivertopaybasis3", drivertopaybasis3);//
        map.put("intermediarytopaybasis1", intermediarytopaybasis1);//
        map.put("intermediarytopaybasis2", intermediarytopaybasis2);//
        map.put("intermediarytopaybasis3", intermediarytopaybasis3);//
        map.put("kind", kind);//
        map.put("kefupassword", kefupassword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.dealcreate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordDealquerybycode1(String complaindealrecordcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("complaindealrecordcode", complaindealrecordcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.dealquerybycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordDealquerybyordernumber1(String ordernumber, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.dealquerybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordQuerybycode1(String complainrecordcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("complainrecordcode", complainrecordcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.querybycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordQuerybykefu1(String complainpeople, String complaininvolves, String kind, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("complainpeople", complainpeople);//
        map.put("complaininvolves", complaininvolves);//
        map.put("kind", kind);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.querybykefu");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordQuerybyordernumber1(String ordernumber, String complainresult, String kind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("complainresult", complainresult);//
        map.put("kind", kind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordUpdateidea1(String complaindealrecordcode, String idea, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("complaindealrecordcode", complaindealrecordcode);//
        map.put("idea", idea);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.updateidea");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject complainrecordUpdateresult1(String complainrecordcode, String complainresult, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("complainrecordcode", complainrecordcode);//
        map.put("complainresult", complainresult);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "complainrecord.updateresult");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordCreate1(String ordernumber, String paymoeny, String incomemoeny, String usercode, String consultobject, String consultreason, String consultothersreason, String settlementnum, String consultevidenceurl, String accountid, String password, String consulttype, String phone, String identicode, String originalunit, String actualunit, String unitprice, String ish5, String coalcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paymoeny", paymoeny);//
        map.put("incomemoeny", incomemoeny);//
        map.put("usercode", usercode);//
        map.put("consultobject", consultobject);//
        map.put("consultreason", consultreason);//
        map.put("consultothersreason", consultothersreason);//
        map.put("settlementnum", settlementnum);//
        map.put("consultevidenceurl", consultevidenceurl);//
        map.put("accountid", accountid);//
        map.put("password", password);//
        map.put("consulttype", consulttype);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("ish5", ish5);//
        map.put("coalcode", coalcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordCreateAddmemo1(String consultrecordcode, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.create.addmemo");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordCreditCreate1(String ordernumber, String paymoeny, String incomemoeny, String usercode, String consultobject, String consultreason, String consultothersreason, String settlementnum, String consultevidenceurl, String accountid, String password, String consulttype, String phone, String identicode, String originalunit, String actualunit, String unitprice, String ish5, String coalcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paymoeny", paymoeny);//
        map.put("incomemoeny", incomemoeny);//
        map.put("usercode", usercode);//
        map.put("consultobject", consultobject);//
        map.put("consultreason", consultreason);//
        map.put("consultothersreason", consultothersreason);//
        map.put("settlementnum", settlementnum);//
        map.put("consultevidenceurl", consultevidenceurl);//
        map.put("accountid", accountid);//
        map.put("password", password);//
        map.put("consulttype", consulttype);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("ish5", ish5);//
        map.put("coalcode", coalcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.credit.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordCreditH5Create1(String ordernumber, String paymoeny, String incomemoeny, String usercode, String consultobject, String consultreason, String consultothersreason, String settlementnum, String consultevidenceurl, String accountid, String password, String consulttype, String phone, String identicode, String originalunit, String actualunit, String unitprice, String ish5, String coalcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paymoeny", paymoeny);//
        map.put("incomemoeny", incomemoeny);//
        map.put("usercode", usercode);//
        map.put("consultobject", consultobject);//
        map.put("consultreason", consultreason);//
        map.put("consultothersreason", consultothersreason);//
        map.put("settlementnum", settlementnum);//
        map.put("consultevidenceurl", consultevidenceurl);//
        map.put("accountid", accountid);//
        map.put("password", password);//
        map.put("consulttype", consulttype);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("ish5", ish5);//
        map.put("coalcode", coalcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.credit.h5.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordCreditH5Updatestate1(String consultrecordcode, String consultresult, String agreecontract, String phone, String identicode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("consultresult", consultresult);//
        map.put("agreecontract", agreecontract);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.credit.h5.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordCreditUpdatestate1(String consultrecordcode, String consultresult, String agreecontract, String phone, String identicode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("consultresult", consultresult);//
        map.put("agreecontract", agreecontract);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.credit.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordGetcalcuteresult1(String stockcost, String unit, String stockunitprice, String variableparamjson, String rulecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcost", stockcost);//
        map.put("unit", unit);//
        map.put("stockunitprice", stockunitprice);//
        map.put("variableparamjson", variableparamjson);//
        map.put("rulecode", rulecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.getcalcuteresult");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordGetfunctionConstantparam1(String functioncode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("functioncode", functioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.getfunction.constantparam");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordGetfunctionResultparam1(String functioncode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("functioncode", functioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.getfunction.resultparam");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordGetfunctionVariableparam1(String functioncode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("functioncode", functioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.getfunction.variableparam");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordQuery1(String consultrecordcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject consultrecordQuerylatest2(String ordernumber, String consultResult) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("consultResult", consultResult);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.querylatest");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordQuerylatest1(String ordernumber, String consultResult) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("consultResult", consultResult);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.querylatest");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordUpdatestate1(String consultrecordcode, String consultresult, String agreecontract, String phone, String identicode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("consultresult", consultresult);//
        map.put("agreecontract", agreecontract);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject consultrecordUpdateurl1(String consultrecordcode, String evidenceurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("evidenceurl", evidenceurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "consultrecord.updateurl");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactContacttypeupdate1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.contacttypeupdate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactCreate1(String contactcode, String contactname, String contactmobile, String contactmemo, String holdercode, String holdername, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("contactcode", contactcode);//
        map.put("contactname", contactname);//
        map.put("contactmobile", contactmobile);//
        map.put("contactmemo", contactmemo);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactCreatebatch1(String data, String holdercode, String holdername) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.createbatch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactDelete1(String holdercode, String contactmobile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("contactmobile", contactmobile);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactQuery1(String holdercode, String contactmobile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("contactmobile", contactmobile);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactQuerybyholder1(String holdercode, String contacttypes, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("contacttypes", contacttypes);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactQuerybymobile1(String contactmobile, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("contactmobile", contactmobile);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.querybymobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactQuerybysearch1(String search, String scop, String holdercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("search", search);//
        map.put("scop", scop);//
        map.put("holdercode", holdercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.querybysearch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactQuerybyupdate1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.querybyupdate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject contactUpdate1(String flowid, String contactcode, String contactname, String contactmobile, String contactmemo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//
        map.put("contactcode", contactcode);//
        map.put("contactname", contactname);//
        map.put("contactmobile", contactmobile);//
        map.put("contactmemo", contactmemo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "contact.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceBindvehicle1(String devicecode, String vehiclecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("vehiclecode", vehiclecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.bindvehicle");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceBindzone1(String devicecode, String zonecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("zonecode", zonecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.bindzone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceCreate1(String devicecode, String emulatecode, String devicename, String devicetype, String companycode, String companyname, String deviceinfo, String vendorinfo, String systeminfo, String screeninfo, String netcardmac, String netcardip, String phonenumber, String platvercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("emulatecode", emulatecode);//
        map.put("devicename", devicename);//
        map.put("devicetype", devicetype);//
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("deviceinfo", deviceinfo);//
        map.put("vendorinfo", vendorinfo);//
        map.put("systeminfo", systeminfo);//
        map.put("screeninfo", screeninfo);//
        map.put("netcardmac", netcardmac);//
        map.put("netcardip", netcardip);//
        map.put("phonenumber", phonenumber);//
        map.put("platvercode", platvercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceQuery1(String devicecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceQuerybinded1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.querybinded");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceQuerybyvehicle1(String vehiclecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.querybyvehicle");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceQuerybyzone1(String zonecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("zonecode", zonecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.querybyzone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceUnbindvehicle1(String devicecode, String vehiclecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("vehiclecode", vehiclecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.unbindvehicle");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceUpdate1(String devicecode, String emulatecode, String devicename, String devicetype, String companycode, String companyname, String deviceinfo, String vendorinfo, String systeminfo, String screeninfo, String netcardmac, String netcardip, String phonenumber, String platvercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("emulatecode", emulatecode);//
        map.put("devicename", devicename);//
        map.put("devicetype", devicetype);//
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("deviceinfo", deviceinfo);//
        map.put("vendorinfo", vendorinfo);//
        map.put("systeminfo", systeminfo);//
        map.put("screeninfo", screeninfo);//
        map.put("netcardmac", netcardmac);//
        map.put("netcardip", netcardip);//
        map.put("phonenumber", phonenumber);//
        map.put("platvercode", platvercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject deviceUpdatealertrule1(String devicecode, String alertenable, String alertrule) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("alertenable", alertenable);//
        map.put("alertrule", alertrule);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "device.updatealertrule");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject devicelogCreate1(String devicecode, String devicetype, String objectcode, String timestamp, String longitude, String latitude, String altitude, String geotype, String valume, String temperature) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("devicetype", devicetype);//
        map.put("objectcode", objectcode);//
        map.put("timestamp", timestamp);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("altitude", altitude);//
        map.put("geotype", geotype);//
        map.put("valume", valume);//
        map.put("temperature", temperature);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "devicelog.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject devicelogQuery1(String flowid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "devicelog.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject devicelogQuerybydevice1(String devicecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "devicelog.querybydevice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject devicelogQuerybyobject1(String devicetype, String objectcode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicetype", devicetype);//
        map.put("objectcode", objectcode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "devicelog.querybyobject");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject devicelogQuerybyvehicle1(String vehiclecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "devicelog.querybyvehicle");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject devicelogQuerybyzone1(String zonecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("zonecode", zonecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "devicelog.querybyzone");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 点融数据接口获取详细信息(运单，车辆，企业信息)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("点融数据接口获取详细信息(运单，车辆，企业信息)1.0")
    public JSONObject dianrongGetdetailinfo1(String ordernumber) throws Exception {
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
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 点融数据接口获取司机历史运单信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("点融数据接口获取司机历史运单信息1.0")
    public JSONObject dianrongGetorderinfohis1(String usercode, String begintime, String endtime, String startindex, String limit) throws Exception {
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
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 点融数据接口获取图片资料1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("点融数据接口获取图片资料1.0")
    public JSONObject dianrongGetpicture1(String usercode) throws Exception {
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
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverCreate1(String usercode, String regioncode, String regionname, String licensenum, String licensedate, String driverdesc, String idcode, String platecode, String birthday, String sexcode, String nationcode, String bloodcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("licensenum", licensenum);//
        map.put("licensedate", licensedate);//
        map.put("driverdesc", driverdesc);//
        map.put("idcode", idcode);//
        map.put("platecode", platecode);//
        map.put("birthday", birthday);//
        map.put("sexcode", sexcode);//
        map.put("nationcode", nationcode);//
        map.put("bloodcode", bloodcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverDrivercertifyQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverDrivercertifyQuerybykeyword1(String keyword, String begindate, String enddate, String start, String limit, String certifystate, String idcodestate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("certifystate", certifystate);//
        map.put("idcodestate", idcodestate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.querybykeyword");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverDrivercertifyUpdate1(String certifycode, String username, String idcode, String drivinglicence, String runlicence, String otherurl, String platenumbers, String headportrait, String idcardfrontphoto, String idcardbackphoto) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("username", username);//
        map.put("idcode", idcode);//
        map.put("drivinglicence", drivinglicence);//
        map.put("runlicence", runlicence);//
        map.put("otherurl", otherurl);//
        map.put("platenumbers", platenumbers);//
        map.put("headportrait", headportrait);//
        map.put("idcardfrontphoto", idcardfrontphoto);//
        map.put("idcardbackphoto", idcardbackphoto);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.drivercertify.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerybyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerybystockapplier1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybystockapplier");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerybystockholder1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybystockholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerybyusercodes1(String usercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//用户编码，多个逗号隔开
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybyusercodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerybyvehicleholder1(String vehiclecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybyvehicleholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverQuerylist1(String keyword, String regioncode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("regioncode", regioncode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverSearch1(String keyword, String certified, String begintime, String endtime, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("certified", certified);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverUpdate1(String usercode, String regioncode, String regionname, String licensenum, String licensedate, String driverdesc, String idcode, String platecode, String birthday, String sexcode, String nationcode, String bloodcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("licensenum", licensenum);//
        map.put("licensedate", licensedate);//
        map.put("driverdesc", driverdesc);//
        map.put("idcode", idcode);//
        map.put("platecode", platecode);//
        map.put("birthday", birthday);//
        map.put("sexcode", sexcode);//
        map.put("nationcode", nationcode);//
        map.put("bloodcode", bloodcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverUserleaderCreate1(String holdercode, String drivername, String drivermobile, String vehicletrucknum) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("drivername", drivername);//
        map.put("drivermobile", drivermobile);//
        map.put("vehicletrucknum", vehicletrucknum);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.userleader.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverUserleaderDelete1(String userleaderdrivercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("userleaderdrivercode", userleaderdrivercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.userleader.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverUserleaderQueryList1(String usercode, String start, String limit, String begindata, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindata", begindata);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.userleader.query.list");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driverUserleaderUpdate1(String userleaderdrivercode, String drivername, String drivermobile, String vehicletrucknum) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("userleaderdrivercode", userleaderdrivercode);//
        map.put("drivername", drivername);//
        map.put("drivermobile", drivermobile);//
        map.put("vehicletrucknum", vehicletrucknum);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.userleader.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driver_openQuery1(String open_id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_id", open_id);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver_open.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driver_openQueryBatch1(String open_ids) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_ids", open_ids);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver_open.query.batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject driver_openQuerybyphone1(String phone) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone", phone);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver_open.querybyphone");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 管理员取消个人认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("管理员取消个人认证1.0")
    public JSONObject drivercertificationCancel1(String certifycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//个人认证编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过用户编码判断个人是否认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过用户编码判断个人是否认证1.0")
    public JSONObject drivercertificationIscertifiedbyusercode1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.iscertifiedbyusercode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机认证状态更新是否自主更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机认证状态更新是否自主更新1.0")
    public JSONObject drivercertificationLastupdatestateValidate1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.lastupdatestate.validate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过认证编码查询个人认证信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过认证编码查询个人认证信息1.0")
    public JSONObject drivercertificationQuerybycertifycode1(String certifycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//个人认证编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.querybycertifycode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过用户编码查询个人认证信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过用户编码查询个人认证信息1.0")
    public JSONObject drivercertificationQuerybyusercode1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.querybyusercode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过用户编码查询个人认证信息2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过用户编码查询个人认证信息2.0")
    public JSONObject drivercertificationQuerybyusercode2(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.querybyusercode");//接口路径
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
     * 修改个人认证资料2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改个人认证资料2.0")
    public JSONObject drivercertificationUpdate2(String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcode, String username) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//otherurl
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcode", idcode);//身份证号码
        map.put("username", username);//姓名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.update");//接口路径
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
     * 修改个人认证资料1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改个人认证资料1.0")
    public JSONObject drivercertificationUpdate1(String certifycode, String drivinglicence, String otherurl, String headportrait, String idcardfrontphoto, String idcardbackphoto, String idcode, String username) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("drivinglicence", drivinglicence);//驾驶证照片地址
        map.put("otherurl", otherurl);//otherurl
        map.put("headportrait", headportrait);//司机用户头像
        map.put("idcardfrontphoto", idcardfrontphoto);//身份证正面照
        map.put("idcardbackphoto", idcardbackphoto);//身份证反面照
        map.put("idcode", idcode);//身份证号码
        map.put("username", username);//姓名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "drivercertification.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长特定抢单货源查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车队长特定抢单货源查询1.0")
    public JSONObject driverstockCancel1(String driverstockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("driverstockcode", driverstockcode);//车队长运单主键
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driverstock.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长司机抢单货源创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车队长司机抢单货源创建1.0")
    public JSONObject driverstockCreate1(String driver, String stockcode, String contractno, String stockchannelcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//司机编码
        map.put("stockcode", stockcode);//或原编码
        map.put("contractno", contractno);//合同编码
        map.put("stockchannelcode", stockchannelcode);//渠道货源编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driverstock.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长特定抢单货源查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车队长特定抢单货源查询1.0")
    public JSONObject driverstockQueryBychannelstockcode1(String driverstockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("driverstockcode", driverstockcode);//车队长运单主键
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driverstock.query.bychannelstockcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("车队长抢单货源查询1.0")
    public JSONObject driverstockQueryBydriver1(String driver, String driverstockstate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//司机编码
        map.put("driverstockstate", driverstockstate);//车队长货源状态 1发布中 2已关闭
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driverstock.query.bydriver");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车队长特定抢单货源查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车队长特定抢单货源查询1.0")
    public JSONObject driverstockQueryBydriverandstockcode1(String driver, String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("driver", driver);//司机编码
        map.put("stockcode", stockcode);//货源编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driverstock.query.bydriverandstockcode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询etc网点1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询etc网点1.0")
    public JSONObject etcBusinessSiteQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.business.site.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 用户查询etc卡列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("用户查询etc卡列表1.0")
    public JSONObject etcCardQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.card.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 已处理充值订单查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("已处理充值订单查询1.0")
    public JSONObject etcEtcorderQuery1(String account, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.etcorder.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 充值工具登陆1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("充值工具登陆1.0")
    public JSONObject etcEtcrechargeLogon1(String etcprocessaccount, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("etcprocessaccount", etcprocessaccount);//etc充值处理账号
        map.put("password", password);//密码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.etcrecharge.logon");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 充值订单查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("充值订单查询1.0")
    public JSONObject etcEtcrechargeQuery1(String etcprocessaccount, String password, String count) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("etcprocessaccount", etcprocessaccount);//etc充值处理账号
        map.put("password", password);//密码
        map.put("count", count);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.etcrecharge.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加etc挂失1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("添加etc挂失1.0")
    public JSONObject etcLossRecordInsert1(String usercode, String etccardnum, String platenum) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("etccardnum", etccardnum);//
        map.put("platenum", platenum);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.loss.record.insert");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * ETC车辆添加1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("ETC车辆添加1.0")
    public JSONObject etcVehicleInsert1(String etccardnum, String platenum, String etclogo, String etccompany) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("etccardnum", etccardnum);//
        map.put("platenum", platenum);//
        map.put("etclogo", etclogo);//
        map.put("etccompany", etccompany);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.vehicle.insert");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过运单号司机信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过运单号司机信息查询1.0")
    public JSONObject finaceDriverinformationQuerybyordernumber1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.driverinformation.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过usercode司机信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过usercode司机信息查询1.0")
    public JSONObject finaceDriverinformationQuerybyusercode1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.driverinformation.querybyusercode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过运单号查询司机支付宝信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过运单号查询司机支付宝信息1.0")
    public JSONObject finaceDriverzfbinfoQuerybyordernumber1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.driverzfbinfo.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 账期运单计时生效1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("账期运单计时生效1.0")
    public JSONObject finaceLaterorderNotice1(String ordernumber, String repaymenttime, String repaymentmoney, String freightrates, String lastschdulefee, String favourablefee, String checkforfee, String zerofee, String receivedtime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("repaymenttime", repaymenttime);//还款时间
        map.put("repaymentmoney", repaymentmoney);//还款金额
        map.put("freightrates", freightrates);//运费
        map.put("lastschdulefee", lastschdulefee);//调度费
        map.put("favourablefee", favourablefee);//服务费
        map.put("checkforfee", checkforfee);//代收对账费
        map.put("zerofee", zerofee);//代收抹零
        map.put("receivedtime", receivedtime);//收单时间
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.laterorder.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 账期运单还款结果通知1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("账期运单还款结果通知1.0")
    public JSONObject finaceLaterorderPayresultNotice1(String ordernumber, String ret) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ret", ret);//还款结果 0默认成功 1还款失败
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.laterorder.payresult.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油单各项通知1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油单各项通知1.0")
    public JSONObject finaceOilorderChangeNotice1(String oilordernumber, String type, String result, String refundAccountType, String refundTime, String refundAmt) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oilordernumber", oilordernumber);//油单单号
        map.put("type", type);//类型 1退款 2暂时未知
        map.put("result", result);//1成功 2失败 3处理中
        map.put("refundAccountType", refundAccountType);//退款去向 1油卡 2钱包
        map.put("refundTime", refundTime);//退款时间
        map.put("refundAmt", refundAmt);//退款金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.oilorder.change.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单网贷贷款结果通知1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单网贷贷款结果通知1.0")
    public JSONObject finaceOrderLendingchannelNotice1(String ordernumber, String result) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("result", result);//1成功 2失败
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.order.lendingchannel.notice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 点融账期转普通运单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("点融账期转普通运单1.0")
    public JSONObject finacePayDrchangetoplateformcreait1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.pay.drchangetoplateformcreait");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过运单号查询贸易单号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过运单号查询贸易单号1.0")
    public JSONObject finaceStockorderQuerybyordernumbers1(String ordernumbers) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumbers", ordernumbers);//多个运单号，逗号隔开
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.stockorder.querybyordernumbers");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 用户信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("用户信息查询1.0")
    public JSONObject finaceUserQuery1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.user.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 用户详细信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("用户详细信息查询1.0")
    public JSONObject finaceUserdetailQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.userdetail.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包不足短信通知1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("钱包不足短信通知1.0")
    public JSONObject finaceWalletrechargeMsgnotice1(String usercode, String smscontent, String smstype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("smscontent", smscontent);//短信内容
        map.put("smstype", smstype);//短信业务类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "finace.walletrecharge.msgnotice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject freightCreate1(String companycode, String freightname, String price) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("freightname", freightname);//
        map.put("price", price);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "freight.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject freightDelete1(String code, String start, String limit, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "freight.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject freightQuery1(String code, String start, String limit, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "freight.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject freightQuerybycompany1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "freight.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject freightUpdate1(String freightcode, String freightname, String price) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("freightcode", freightcode);//
        map.put("freightname", freightname);//
        map.put("price", price);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "freight.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject functionCreate1(String funcitonname, String classname, String memo, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("funcitonname", funcitonname);//
        map.put("classname", classname);//
        map.put("memo", memo);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "function.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject functionQuery1(String functioncode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("functioncode", functioncode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "function.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject functionQuerybycompanycode1(String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "function.querybycompanycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgappcode1(String groupcode, String oappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("oappcode", oappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgappcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgcertmemo1(String groupcode, String certifymemo, String certifyfile, String certifystate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("certifymemo", certifymemo);//
        map.put("certifyfile", certifyfile);//
        map.put("certifystate", certifystate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgcertmemo");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgcertstate1(String groupcode, String certified, String certifylogid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("certified", certified);//
        map.put("certifylogid", certifylogid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgcertstate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgcredit1(String groupcode, String groupcredit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("groupcredit", groupcredit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgcredit");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgneedconfirm1(String groupcode, String needconfirm) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("needconfirm", needconfirm);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgneedconfirm");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgpower1(String groupcode, String power) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("power", power);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgpower");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgrank1(String groupcode, String grouprank) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("grouprank", grouprank);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgrank");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupChgvitality1(String groupcode, String groupvitality) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("groupvitality", groupvitality);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.chgvitality");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupCreate1(String groupname, String groupdesc, String grouplogourl, String groupmessage, String regioncode, String regionname, String companycode, String holdercode, String oappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupname", groupname);//
        map.put("groupdesc", groupdesc);//
        map.put("grouplogourl", grouplogourl);//
        map.put("groupmessage", groupmessage);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("oappcode", oappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupCreatedialog1(String groupname, String groupdesc, String grouplogourl, String regioncode, String regionname, String companycode, String holdercode, String joinercodes, String oappcode, String companymember) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupname", groupname);//
        map.put("groupdesc", groupdesc);//
        map.put("grouplogourl", grouplogourl);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("joinercodes", joinercodes);//
        map.put("oappcode", oappcode);//
        map.put("companymember", companymember);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.createdialog");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberCheck1(String groupcode, String useruids) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("useruids", useruids);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.check");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberCreate1(String groupcode, String membercode, String memberstate, String memberroster, String memebermemo, String starttype, String memo, String companymember) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("membercode", membercode);//
        map.put("memberstate", memberstate);//
        map.put("memberroster", memberroster);//
        map.put("memebermemo", memebermemo);//
        map.put("starttype", starttype);//
        map.put("memo", memo);//
        map.put("companymember", companymember);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberPager1(String groupcode, String memberstates, String membertype, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("memberstates", memberstates);//
        map.put("membertype", membertype);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.pager");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberQuery1(String groupcode, String membercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("membercode", membercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberQuerybymember1(String membercode, String memberstates, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//
        map.put("memberstates", memberstates);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.querybymember");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberQuerybyregion1(String groupcode, String regioncode, String membertype, String begintime, String endtime, String lengthcodes, String constructcodes, String targetcodes, String certifystate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("regioncode", regioncode);//
        map.put("membertype", membertype);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("lengthcodes", lengthcodes);//
        map.put("constructcodes", constructcodes);//
        map.put("targetcodes", targetcodes);//
        map.put("certifystate", certifystate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberQuerybyroster1(String groupcode, String memberstates, String membertype, String memberroster, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("memberstates", memberstates);//
        map.put("membertype", membertype);//
        map.put("memberroster", memberroster);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.querybyroster");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberRecommend1(String usercodes, String groupcode, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("groupcode", groupcode);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.recommend");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberSearch1(String keyword, String groupcode, String memberstates, String membertype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("groupcode", groupcode);//
        map.put("memberstates", memberstates);//
        map.put("membertype", membertype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.search");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.1
     *
     * @return response
     * @throws Exception
     */
    @Step("1.1")
    public JSONObject groupMemberSearch11(String groupcode, String rostercode, String keyword, String cargocard, String cargotypes, String memberstates, String construct, String length, String start, String limit, String membertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostercode", rostercode);//
        map.put("keyword", keyword);//
        map.put("cargocard", cargocard);//
        map.put("cargotypes", cargotypes);//
        map.put("memberstates", memberstates);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("membertype", membertype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.search");//接口路径
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberSearchbyroster1(String keyword, String groupcode, String memberstates, String membertype, String memberroster, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("groupcode", groupcode);//
        map.put("memberstates", memberstates);//
        map.put("membertype", membertype);//
        map.put("memberroster", memberroster);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.searchbyroster");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberSearchforcmpny1(String groupcode, String rostercode, String keyword, String cargocard, String cargotypes, String memberstates, String bizcitycode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostercode", rostercode);//
        map.put("keyword", keyword);//
        map.put("cargocard", cargocard);//
        map.put("cargotypes", cargotypes);//
        map.put("memberstates", memberstates);//
        map.put("bizcitycode", bizcitycode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.searchforcmpny");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberSortbyspell1(String keyword, String groupcode, String memberstate, String membertype, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("groupcode", groupcode);//
        map.put("memberstate", memberstate);//
        map.put("membertype", membertype);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.sortbyspell");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberUpdate1(String groupcode, String membercode, String memberstate, String membermemo, String certifylogid, String starttype, String memo, String companymember) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("membercode", membercode);//
        map.put("memberstate", memberstate);//
        map.put("membermemo", membermemo);//
        map.put("certifylogid", certifylogid);//
        map.put("starttype", starttype);//
        map.put("memo", memo);//
        map.put("companymember", companymember);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberUpdatememo1(String groupcode, String membercode, String membermemo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("membercode", membercode);//
        map.put("membermemo", membermemo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.updatememo");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupMemberUpdateroster1(String groupcode, String membercode, String memberroster) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("membercode", membercode);//
        map.put("memberroster", memberroster);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.updateroster");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuery1(String groupcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerySimple1(String groupcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.query.simple");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybycodes1(String codes, String commentkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("codes", codes);//
        map.put("commentkind", commentkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybycompanycodes1(String companycodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycodes", companycodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybycompanycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybycompanymemberFirst1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybycompanymember.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybycompanyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybycompanyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybyholder1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybyholderFirst1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybyholder.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybyholdersFirst1(String usercodes, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybyholders.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybyjoiner1(String membercode, String memberstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("membercode", membercode);//
        map.put("memberstate", memberstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybyjoiner");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerybyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerygroupbycompanycode1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querygroupbycompanycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupQuerylist1(String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupRosterCreate1(String groupcode, String rostername, String rosterlogourl, String rostertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostername", rostername);//
        map.put("rosterlogourl", rosterlogourl);//
        map.put("rostertype", rostertype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupRosterDelete1(String groupcode, String rostercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostercode", rostercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupRosterPager1(String groupcode, String rostertype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostertype", rostertype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.pager");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupRosterQuery1(String groupcode, String rostercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostercode", rostercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupRosterUpdate1(String groupcode, String rostercode, String rostername, String rosterlogourl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("rostercode", rostercode);//
        map.put("rostername", rostername);//
        map.put("rosterlogourl", rosterlogourl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject groupUpdate1(String groupcode, String groupname, String groupdesc, String grouplogourl, String groupmessage, String regioncode, String regionname, String companycode, String holdercode, String oappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("groupname", groupname);//
        map.put("groupdesc", groupdesc);//
        map.put("grouplogourl", grouplogourl);//
        map.put("groupmessage", groupmessage);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("oappcode", oappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject group_openGroup_memberQuery1(String member_type, String member_state, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("member_type", member_type);//
        map.put("member_state", member_state);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group_open.group_member.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject h5htmlQuery1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "h5html.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject h5htmlUpload1(String ordernumber, String contactstel, String filepath, String filename, String filepara, String filesize, String filezip, String filedata, String addresscode, String usekind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("contactstel", contactstel);//
        map.put("filepath", filepath);//
        map.put("filename", filename);//
        map.put("filepara", filepara);//
        map.put("filesize", filesize);//
        map.put("filezip", filezip);//
        map.put("filedata", filedata);//
        map.put("addresscode", addresscode);//
        map.put("usekind", usekind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "h5html.upload");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject invitelatentuserClick1(String createtime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("createtime", createtime);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "invitelatentuser.click");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject invitelatentuserCreate1(String data, String toappcode, String tousercode, String smsContent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//
        map.put("toappcode", toappcode);//
        map.put("tousercode", tousercode);//
        map.put("smsContent", smsContent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "invitelatentuser.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject invitelatentuserFeedback1(String invitecodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("invitecodes", invitecodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "invitelatentuser.feedback");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject itsaddressQuery1(String itscode, String addresstype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("itscode", itscode);//
        map.put("addresstype", addresstype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "itsaddress.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加液宝数据接口获取货源信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加液宝数据接口获取货源信息1.0")
    public JSONObject jiayebaoGetstockinfo1(String srcLocalCode, String destLocalCode, String goodType, String pageNo, String pageSize) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("srcLocalCode", srcLocalCode);//出发地区域编码
        map.put("destLocalCode", destLocalCode);//目的地区域编码
        map.put("goodType", goodType);//货物类型
        map.put("pageNo", pageNo);//从第几页开始
        map.put("pageSize", pageSize);//每页包含数据数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "jiayebao.getstockinfo");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加液宝数据接口获取货源状态信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加液宝数据接口获取货源状态信息1.0")
    public JSONObject jiayebaoGetstockstate1(String stockCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockCode", stockCode);//货源编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "jiayebao.getstockstate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject logisticsworkerCreate1(String tel, String createtime, String city, String provincecode, String citycode, String source, String details) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("createtime", createtime);//
        map.put("city", city);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("source", source);//
        map.put("details", details);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "logisticsworker.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject logisticsworkerDelete1(String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "logisticsworker.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject logisticsworkerQuerybytel1(String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "logisticsworker.querybytel");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject logisticsworkerQuerybytels1(String tels, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tels", tels);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "logisticsworker.querybytels");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject logisticsworkerUpdate1(String tel, String city, String provincecode, String citycode, String source, String details) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("city", city);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("source", source);//
        map.put("details", details);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "logisticsworker.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject mailingaddressCreate1(String holdercode, String linkname, String phone, String address, String addressdetail, String level, String provincecode, String citycode, String countycode, String province, String city, String county) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("linkname", linkname);//
        map.put("phone", phone);//
        map.put("address", address);//
        map.put("addressdetail", addressdetail);//
        map.put("level", level);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("countycode", countycode);//
        map.put("province", province);//
        map.put("city", city);//
        map.put("county", county);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mailingaddress.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject mailingaddressDelete1(String mailingaddresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mailingaddresscode", mailingaddresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mailingaddress.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject mailingaddressQuery1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mailingaddress.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject mailingaddressQuerylatest1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mailingaddress.querylatest");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject mailingaddressQueryone1(String mailingaddresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mailingaddresscode", mailingaddresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mailingaddress.queryone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject mailingaddressUpdate1(String mailingaddresscode, String linkname, String phone, String address, String addressdetail, String level, String provincecode, String citycode, String countycode, String province, String city, String county) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mailingaddresscode", mailingaddresscode);//
        map.put("linkname", linkname);//
        map.put("phone", phone);//
        map.put("address", address);//
        map.put("addressdetail", addressdetail);//
        map.put("level", level);//
        map.put("provincecode", provincecode);//
        map.put("citycode", citycode);//
        map.put("countycode", countycode);//
        map.put("province", province);//
        map.put("city", city);//
        map.put("county", county);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "mailingaddress.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject message_openCardmsgSent_syn1(String open_ids, String cardmsgcode, String toappcode, String usertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_ids", open_ids);//
        map.put("cardmsgcode", cardmsgcode);//
        map.put("toappcode", toappcode);//
        map.put("usertype", usertype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message_open.cardmsg.sent_syn");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject message_openCardmsgSimplecreate1(String title, String imageurl, String audiourl, String videourl, String content, String linkurl, String linktype, String category, String tel, String name, String sourceurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("title", title);//
        map.put("imageurl", imageurl);//
        map.put("audiourl", audiourl);//
        map.put("videourl", videourl);//
        map.put("content", content);//
        map.put("linkurl", linkurl);//
        map.put("linktype", linktype);//
        map.put("category", category);//
        map.put("tel", tel);//
        map.put("name", name);//
        map.put("sourceurl", sourceurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message_open.cardmsg.simplecreate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject message_openMessageSent_syn1(String open_ids, String type, String subtype, String message, String extra, String noticecontent) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_ids", open_ids);//
        map.put("type", type);//
        map.put("subtype", subtype);//
        map.put("message", message);//
        map.put("extra", extra);//
        map.put("noticecontent", noticecontent);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "message_open.message.sent_syn");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject newuserCompanySearch1(String groupcode, String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "newuser.company.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject newuserCreate1(String data) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", data);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "newuser.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject newuserDriverSearch1(String groupcode, String keyword, String cargocard, String cargotypes, String construct, String length, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("keyword", keyword);//
        map.put("cargocard", cargocard);//
        map.put("cargotypes", cargotypes);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "newuser.driver.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject newuserStatistics1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "newuser.statistics");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建运单业务报表记录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("创建运单业务报表记录1.0")
    public JSONObject orderReportformCreate1(String companycode, String month, String day) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("month", month);//
        map.put("day", day);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.reportform.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建运单业务报表记录通过运单号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("创建运单业务报表记录通过运单号1.0")
    public JSONObject orderReportformCreateByordernumber1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.reportform.create.byordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建运单业务报表记录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("创建运单业务报表记录1.0")
    public JSONObject orderReportformDelete1(String companycode, String month, String day) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("month", month);//
        map.put("day", day);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.reportform.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除运单业务报表记录通过运单号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("删除运单业务报表记录通过运单号1.0")
    public JSONObject orderReportformDeleteByordernumber1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.reportform.delete.byordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 按照司机收款时间查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("按照司机收款时间查询1.0")
    public JSONObject orderReportformQueryBycreatetime1(String keyword, String companycode, String sourcecode, String targetcode, String loadaddresscode, String uploadaddresscode, String begintime, String endtime, String start, String limit, String loadname, String unloadname, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("companycode", companycode);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("loadaddresscode", loadaddresscode);//
        map.put("uploadaddresscode", uploadaddresscode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址名称
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.reportform.query.bycreatetime");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 按照起运时间查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("按照起运时间查询1.0")
    public JSONObject orderReportformQueryByintermediarypaytime1(String keyword, String companycode, String sourcecode, String targetcode, String loadaddresscode, String uploadaddresscode, String begintime, String endtime, String start, String limit, String loadname, String unloadname, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("companycode", companycode);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("loadaddresscode", loadaddresscode);//
        map.put("uploadaddresscode", uploadaddresscode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址名称
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "order.reportform.query.byintermediarypaytime");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 新的运单取消创建2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("新的运单取消创建2.0")
    public JSONObject ordercancleCreate2(String ordernumber, String cancelreason, String cashmoney, String cashtotal, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单
        map.put("cancelreason", cancelreason);//取消理由
        map.put("cashmoney", cashmoney);//退款金额
        map.put("cashtotal", cashtotal);//最大可赔偿金额
        map.put("url", url);//图片证据
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.create");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleCreate1(String ordernumber, String cancelreason, String oilmoney, String oiltotal, String cashmoney, String cashtotal, String bailmoney, String bailtotal, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("cancelreason", cancelreason);//
        map.put("oilmoney", oilmoney);//
        map.put("oiltotal", oiltotal);//
        map.put("cashmoney", cashmoney);//
        map.put("cashtotal", cashtotal);//
        map.put("bailmoney", bailmoney);//
        map.put("bailtotal", bailtotal);//
        map.put("url", url);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleFeeQuery1(String ordernumber, String paymoney) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单
        map.put("paymoney", paymoney);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.fee.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleQuery1(String ordercanclerecordcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordercanclerecordcode", ordercanclerecordcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleQueryLatest1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.query.latest");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleRemainingmoneryQuery1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.remainingmonery.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleServicequery1(String begindate, String enddate, String start, String limit, String searchkey, String searchval) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("searchkey", searchkey);//
        map.put("searchval", searchval);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.servicequery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单取消方案修改2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单取消方案修改2.0")
    public JSONObject ordercancleUpdate2(String ordercanclerecordcode, String cancelreason, String cashmoney, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordercanclerecordcode", ordercanclerecordcode);//取消详情主键编码
        map.put("cancelreason", cancelreason);//取消理由
        map.put("cashmoney", cashmoney);//退款现金金额
        map.put("url", url);//运单取消证据图片地址
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.update");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleUpdate1(String ordercanclerecordcode, String cancelreason, String oilmoney, String cashmoney, String bailmoney, String url) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordercanclerecordcode", ordercanclerecordcode);//
        map.put("cancelreason", cancelreason);//
        map.put("oilmoney", oilmoney);//
        map.put("cashmoney", cashmoney);//
        map.put("bailmoney", bailmoney);//
        map.put("url", url);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ordercancleUpdatestate1(String ordercanclerecordcode, String resulttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordercanclerecordcode", ordercanclerecordcode);//
        map.put("resulttype", resulttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ordercancle.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单支付明细查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单支付明细查询1.0")
    public JSONObject orderpaystatusQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderpaystatus.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleFinish1(String orderschedulecode, String ordernumber, String signinImage, String addressName) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderschedulecode", orderschedulecode);//
        map.put("lon", "114.429231");//
        map.put("lat", "30.460185");//
        map.put("ordernumber", ordernumber);//
        map.put("signinImage", signinImage);//签到图片地址
        map.put("addressName", addressName);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.finish");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleGoon1(String orderschedulecode, String ordernumber, String signinImage, String addressName) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderschedulecode", orderschedulecode);//
        map.put("lon", "114.429231");//
        map.put("lat", "30.460185");//
        map.put("ordernumber", ordernumber);//
        map.put("signinImage", signinImage);//签到图片地址
        map.put("addressName", addressName);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.goon");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 计数宝驱动物流对接接口3.0
     *
     * @return response
     * @throws Exception
     */
    @Step("计数宝驱动物流对接接口3.0")
    public JSONObject orderscheduleGoon3(String platenumber, String lon, String lat) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lon", lon);//经度
        map.put("lat", lat);//纬度
        map.put("platenumber", platenumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.goon");//接口路径
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
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject orderscheduleGoon2(String orderschedulecode, String ordernumber, String signinImage, String addressName, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderschedulecode", orderschedulecode);//
        map.put("lon", "114.429231");//
        map.put("lat", "30.460185");//
        map.put("ordernumber", ordernumber);//
        map.put("signinImage", signinImage);//签到图片地址
        map.put("addressName", addressName);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.goon");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleIsfinished_driver1(String orderschedulecode, String ordernumber, String signinImage, String addressName) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderschedulecode", orderschedulecode);//
        map.put("lon", "114.429231");//
        map.put("lat", "30.460185");//
        map.put("ordernumber", ordernumber);//
        map.put("signinImage", signinImage);//签到图片地址
        map.put("addressName", addressName);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.isfinished_driver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleQueryBystockcode1(String stockcode, String leaderdrivercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("leaderdrivercode", leaderdrivercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.query.bystockcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleQueryCompany1(String companycode, String holdercode, String loadcode, String uploadcode, String keyword, String begindate, String enddate, String start, String limit, String orderschedulestate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("loadcode", loadcode);//
        map.put("uploadcode", uploadcode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderschedulestate", orderschedulestate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.query.company");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleQueryCompanyWeb1(String companycode, String holdercode, String loadcode, String uploadcode, String keyword, String begindate, String enddate, String start, String limit, String orderschedulestate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("loadcode", loadcode);//
        map.put("uploadcode", uploadcode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderschedulestate", orderschedulestate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.query.company.web");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleQueryDetail1(String orderschedulecode, String ordernumber, String signinImage, String addressName) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderschedulecode", orderschedulecode);//
        map.put("lon", "114.429231");//
        map.put("lat", "30.460185");//
        map.put("ordernumber", ordernumber);//
        map.put("signinImage", signinImage);//签到图片地址
        map.put("addressName", addressName);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.query.detail");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleQueryDriver1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.query.driver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderscheduleQueryOrderByOrderschedule1(String code, String start, String limit, String begindate, String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("code", code);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderschedule.query.order.by.orderschedule");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 经纪人运单查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("经纪人运单查询1.0")
    public JSONObject orderviewAgentQuery1(String ordernumber, String ordercontractkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ordercontractkind", ordercontractkind);//运单合同类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.agent.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewBusinessQuery1(String keyword, String begintime, String endtime, String start, String limit) throws Exception {
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
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewCheckingQuery1(String keyword, String begintime, String endtime, String start, String limit) throws Exception {
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
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 承运信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("承运信息查询1.0")
    public JSONObject orderviewHaulageQuery1(String ordernumber, String level) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("level", level);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.haulage.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 经纪人运单查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("经纪人运单查询1.0")
    public JSONObject orderviewOrderagentQuery1(String agentcode, String begindate, String enddate, String start, String limit, String orderstate, String querytype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentcode", agentcode);//经纪人编码
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderstate", orderstate);//运单状态 querytype1（1待确认 2待装货 3待卸货） querytype2（1已完结 2已取消） 0 全部
        map.put("querytype", querytype);//查询类别 1 进行中 2 已完结
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.orderagent.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单复核详情查询简约版(app端)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核详情查询简约版(app端)1.0")
    public JSONObject orderviewOrdercheckAddQueryApp1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.add.query.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单复核详情查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核详情查询1.0")
    public JSONObject orderviewOrdercheckQuery1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单复核详情查询(app端)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核详情查询(app端)1.0")
    public JSONObject orderviewOrdercheckQueryApp1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.query.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单待复核列表查询3.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单待复核列表查询3.0")
    public JSONObject orderviewOrdercheckQuerylist3(String begindate, String enddate, String start, String limit, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String companycode, String ordercheckbegintime, String ordercheckendtime, String loadname, String unloadname, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//签收时间起始
        map.put("enddate", enddate);//签收时间截至
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sourcecode", sourcecode);//装货地
        map.put("targetcode", targetcode);//目的地
        map.put("keyword", keyword);//关键词
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过 5.支付中
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("companycode", companycode);//
        map.put("ordercheckbegintime", ordercheckbegintime);//复核起始时间
        map.put("ordercheckendtime", ordercheckendtime);//复核截至时间
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地址名称
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.querylist");//接口路径
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
     * 运单复核列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核列表查询1.0")
    public JSONObject orderviewOrdercheckQuerylist1(String begindate, String enddate, String start, String limit, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String companycode, String beginintermediarypaytime, String endintermediarypaytime, String orderstatetag) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sourcecode", sourcecode);//装货地
        map.put("targetcode", targetcode);//目的地
        map.put("keyword", keyword);//关键词
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("companycode", companycode);//
        map.put("beginintermediarypaytime", beginintermediarypaytime);//下单时间过滤起始时间
        map.put("endintermediarypaytime", endintermediarypaytime);//下单时间过滤结束时间
        map.put("orderstatetag", orderstatetag);//运单选择标签 0 所有 1已标注 2 未标注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单复核列表查询,已复核列表2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核列表查询,已复核列表2.0")
    public JSONObject orderviewOrdercheckQuerylist2(String begindate, String enddate, String start, String limit, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String companycode, String ordercheckbegintime, String ordercheckendtime, String loadname, String unloadname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//签收时间起始
        map.put("enddate", enddate);//签收时间截至
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sourcecode", sourcecode);//装货地
        map.put("targetcode", targetcode);//目的地
        map.put("keyword", keyword);//关键词
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过 5.支付中
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("companycode", companycode);//
        map.put("ordercheckbegintime", ordercheckbegintime);//复核起始时间
        map.put("ordercheckendtime", ordercheckendtime);//复核截至时间
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地址名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.querylist");//接口路径
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
     * 运单复核列表查询(app端)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单复核列表查询(app端)1.0")
    public JSONObject orderviewOrdercheckQuerylistApp1(String begindate, String enddate, String start, String limit, String checkstate, String signpeoplemobile, String keyword, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("keyword", keyword);//关键字 车牌号或者手机号
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercheck.querylist.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单合同查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单合同查询1.0")
    public JSONObject orderviewOrdercontactQuery1(String ordernumber, String ordercontractkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ordercontractkind", ordercontractkind);//运单合同类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercontact.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单创建相关信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单创建相关信息查询1.0")
    public JSONObject orderviewOrdercreateQuery1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordercreate.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 复核运单支付失败列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("复核运单支付失败列表查询1.0")
    public JSONObject orderviewOrderpayfailedQuerylist1(String begindate, String enddate, String start, String limit, String sourcecode, String targetcode, String keyword, String checkstate, String signpeoplemobile, String companycode, String ordercheckbegintime, String ordercheckendtime, String loadname, String unloadname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//签收时间起始
        map.put("enddate", enddate);//签收时间截至
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("sourcecode", sourcecode);//装货地
        map.put("targetcode", targetcode);//目的地
        map.put("keyword", keyword);//关键词
        map.put("checkstate", checkstate);//0 所有 2待复核 3拒绝付款 4复核通过 5.支付中
        map.put("signpeoplemobile", signpeoplemobile);//收单员电话
        map.put("companycode", companycode);//
        map.put("ordercheckbegintime", ordercheckbegintime);//复核起始时间
        map.put("ordercheckendtime", ordercheckendtime);//复核截至时间
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地址名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.orderpayfailed.querylist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单签相关收信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单签相关收信息查询1.0")
    public JSONObject orderviewOrdersignQuery1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordersign.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单签收结果查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单签收结果查询1.0")
    public JSONObject orderviewOrdersignreceivedQuery1(String ordernumber, String ordercontractkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("ordercontractkind", ordercontractkind);//运单合同类型
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.ordersignreceived.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewQueryOvertimeorder1(String orderstate, String span, String companyname, String start, String limit) throws Exception {
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
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewQueryZhongjiBiz1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.query.zhongji.biz");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewQuerybydriver1(String usercode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.querybydriver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewQuerybysignpeoplemobile1(String signpeoplemobile, String keyword, String start, String limit, String orderstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplemobile", signpeoplemobile);//
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderstate", orderstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.querybysignpeoplemobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewReportformQuery1(String keyword, String companycode, String sourcecode, String targetcode, String loadaddresscode, String uploadaddresscode, String begintime, String endtime, String start, String limit, String loadname, String unloadname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("companycode", companycode);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("loadaddresscode", loadaddresscode);//
        map.put("uploadaddresscode", uploadaddresscode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.reportform.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewReportformQueryByshiptime1(String keyword, String companycode, String sourcecode, String targetcode, String loadaddresscode, String uploadaddresscode, String begintime, String endtime, String start, String limit, String loadname, String unloadname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("companycode", companycode);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("loadaddresscode", loadaddresscode);//
        map.put("uploadaddresscode", uploadaddresscode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("loadname", loadname);//装货地址名称
        map.put("unloadname", unloadname);//卸货地地址名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.reportform.query.byshiptime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject orderviewSearchForclient1(String keyword, String begintime, String endtime, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.search.forclient");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("关键字搜索订单1.0")
    public JSONObject orderviewSearchForweb1(String companycode, String keyword, String begintime, String endtime, String start, String limit, String kind, String intermediary, String sourcecode, String targetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//用户编码
        map.put("keyword", keyword);//关键字：订单号，接单人姓名，电话，车牌
        map.put("begintime", begintime);//起始日期
        map.put("endtime", endtime);//截止日期
        map.put("start", start);//分页起始数
        map.put("limit", limit);//数量
        map.put("kind", kind);//类型:1历史2协商中3待处理4待装货5配送中6待评价
        map.put("intermediary", intermediary);//下单人code
        map.put("sourcecode", sourcecode);//装货地城市编码
        map.put("targetcode", targetcode);//卸货地城市编码
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
     * 关键字搜索订单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("关键字搜索订单1.0")
    public JSONObject orderviewSearchForwebNew1(String companycode, String keyword, String begintime, String endtime, String start, String limit, String kind, String intermediary, String sourcecode, String targetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//用户编码
        map.put("keyword", keyword);//关键字：订单号，接单人姓名，电话，车牌
        map.put("begintime", begintime);//起始日期
        map.put("endtime", endtime);//截止日期
        map.put("start", start);//分页起始数
        map.put("limit", limit);//数量
        map.put("kind", kind);//类型:1历史2协商中3待处理4待装货5配送中6待评价
        map.put("intermediary", intermediary);//下单人code
        map.put("sourcecode", sourcecode);//装货地地址编码
        map.put("targetcode", targetcode);//卸货地地址编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.search.forweb.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("支付失败运单列表查询1.0")
    public JSONObject orderviewSignorderFailed1(String companycode, String signmobile, String begindate, String enddate, String keyword, String orderstate, String start, String limit, String orderbycreatetime, String orderbysigntime, String createbeginDate, String createendDate, String querytype, String sorttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("signmobile", signmobile);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("orderstate", orderstate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderbycreatetime", orderbycreatetime);//
        map.put("orderbysigntime", orderbysigntime);//
        map.put("createbeginDate", createbeginDate);//
        map.put("createendDate", createendDate);//
        map.put("querytype", querytype);//
        map.put("sorttype", sorttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.signorder.failed");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 在途运单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("在途运单列表查询1.0")
    public JSONObject orderviewSignorderOntheway1(String companycode, String signmobile, String begindate, String enddate, String keyword, String orderstate, String start, String limit, String orderbycreatetime, String orderbysigntime, String createbeginDate, String createendDate, String querytype, String sorttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("signmobile", signmobile);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("orderstate", orderstate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderbycreatetime", orderbycreatetime);//
        map.put("orderbysigntime", orderbysigntime);//
        map.put("createbeginDate", createbeginDate);//
        map.put("createendDate", createendDate);//
        map.put("querytype", querytype);//
        map.put("sorttype", sorttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.signorder.ontheway");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 异常运单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("异常运单列表查询1.0")
    public JSONObject orderviewSignorderOrderabnormal1(String companycode, String signmobile, String begindate, String enddate, String keyword, String orderstate, String start, String limit, String orderbycreatetime, String orderbysigntime, String createbeginDate, String createendDate, String querytype, String sorttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("signmobile", signmobile);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("orderstate", orderstate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderbycreatetime", orderbycreatetime);//
        map.put("orderbysigntime", orderbysigntime);//
        map.put("createbeginDate", createbeginDate);//
        map.put("createendDate", createendDate);//
        map.put("querytype", querytype);//
        map.put("sorttype", sorttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.signorder.orderabnormal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 已签收运单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("已签收运单列表查询1.0")
    public JSONObject orderviewSignorderOrdercompleted1(String companycode, String signmobile, String begindate, String enddate, String keyword, String orderstate, String start, String limit, String orderbycreatetime, String orderbysigntime, String createbeginDate, String createendDate, String querytype, String sorttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("signmobile", signmobile);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("orderstate", orderstate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderbycreatetime", orderbycreatetime);//
        map.put("orderbysigntime", orderbysigntime);//
        map.put("createbeginDate", createbeginDate);//
        map.put("createendDate", createendDate);//
        map.put("querytype", querytype);//
        map.put("sorttype", sorttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.signorder.ordercompleted");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 待签收运单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("待签收运单列表查询1.0")
    public JSONObject orderviewSignorderOrderwaiting1(String companycode, String signmobile, String begindate, String enddate, String keyword, String orderstate, String start, String limit, String orderbycreatetime, String orderbysigntime, String createbeginDate, String createendDate, String querytype, String sorttype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("signmobile", signmobile);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("orderstate", orderstate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("orderbycreatetime", orderbycreatetime);//
        map.put("orderbysigntime", orderbysigntime);//
        map.put("createbeginDate", createbeginDate);//
        map.put("createendDate", createendDate);//
        map.put("querytype", querytype);//
        map.put("sorttype", sorttype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.signorder.orderwaiting");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机宝权限创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机宝权限创建1.0")
    public JSONObject rolepowerPowercreate1(String powername, String powerdesc, String fathercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("powername", powername);//权限名称
        map.put("powerdesc", powerdesc);//权限描述
        map.put("fathercode", fathercode);//父类权限编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.powercreate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机宝全局权限查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机宝全局权限查询1.0")
    public JSONObject rolepowerPowerquery1(String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.powerquery");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过角色查询司机宝权限1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过角色查询司机宝权限1.0")
    public JSONObject rolepowerPowerqueryByrolecode1(String rolecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rolecode", rolecode);//角色编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.powerquery.byrolecode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过用户编码查询用户所拥有的权限1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过用户编码查询用户所拥有的权限1.0")
    public JSONObject rolepowerPowerqueryByusercode1(String usercode, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.powerquery.byusercode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过用户编码查询用户所拥有的权限1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过用户编码查询用户所拥有的权限1.0")
    public JSONObject rolepowerRolequeryByusercode1(String usercode, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("session", session);
        map.put("method", "rolepower.rolequery.byusercode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机宝角色创建1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机宝角色创建1.0")
    public JSONObject rolepowerRolecreate1(String companycode, String powercodes, String rolename, String roledesc, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编码
        map.put("powercodes", powercodes);//权限编码，多个逗号隔开
        map.put("rolename", rolename);//角色名称
        map.put("roledesc", roledesc);//角色描述
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.rolecreate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机宝角色权限更新1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机宝角色权限更新1.0")
    public JSONObject rolepowerRoleupdate1(String roleCode, String powercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("roleCode", roleCode);//角色编码
        map.put("powercodes", powercodes);//权限编码，多个逗号隔开
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.roleupdate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机宝角色权限判断1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机宝角色权限判断1.0")
    public JSONObject rolepowerSjbrolePowerQuery1(String rolecodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rolecodes", rolecodes);//角色编码 多个逗号隔开
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.sjbrole.power.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 给子成员赋予角色1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("给子成员赋予角色1.0")
    public JSONObject rolepowerUserAddrole1(String usercode, String companycode, String rolecodes, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("companycode", companycode);//企业名称编码
        map.put("rolecodes", rolecodes);//角色编码，多个逗号隔开
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.user.addrole");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 角色删除1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("角色删除1.0")
    public JSONObject rolepowerUserDeleterole1(String rolecode, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rolecode", rolecode);//角色编码
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.user.deleterole");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除子成员角色权限1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("删除子成员角色权限1.0")
    public JSONObject rolepowerUserRoleremove1(String usercode, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("companycode", companycode);//企业名称编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rolepower.user.roleremove");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单发起取消，司机三天未处理1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单发起取消，司机三天未处理1.0")
    public JSONObject ropschduleOrdercanceldealyDeal1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ropschdule.ordercanceldealy.deal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单24小时未确认，企业自动取消1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运单24小时未确认，企业自动取消1.0")
    public JSONObject ropschduleOrderdirectcancelDeal1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ropschdule.orderdirectcancel.deal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 数据上报邮件统计1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("数据上报邮件统计1.0")
    public JSONObject ropschduleOrdersendSendemail1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ropschdule.ordersend.sendemail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 渣土轨迹处理1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("渣土轨迹处理1.0")
    public JSONObject ropschduleOrdertrackZtdeal1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ropschdule.ordertrack.ztdeal");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 在途单超时不签到计划任务1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("在途单超时不签到计划任务1.0")
    public JSONObject ropschduleOrderuploaddelayDeal1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ropschdule.orderuploaddelay.deal");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleCreate1(String ruleName, String funcClassName, String functionCode, String companyCode, String constantParamJson) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleName", ruleName);//
        map.put("funcClassName", funcClassName);//
        map.put("functionCode", functionCode);//
        map.put("companyCode", companyCode);//
        map.put("constantParamJson", constantParamJson);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleDelete1(String ruleCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleCode", ruleCode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject rulePeopleBound1(String rulecode, String signpeoplecode, String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecode", rulecode);//
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.people.bound");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject rulePeopleUnbound1(String rulecode, String signpeoplecode, String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecode", rulecode);//
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.people.unbound");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleQuery1(String ruleCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleCode", ruleCode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleQueryBycompany1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.query.bycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleQueryBymobile1(String mobile, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//电话号码
        map.put("companycode", companycode);//企业编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.query.bymobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleQueryBypeople1(String signpeoplecode, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("companycode", companycode);//企业编码 可选参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.query.bypeople");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleQueryBysite1(String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.query.bysite");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleRelQuery1(String ruleCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleCode", ruleCode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.rel.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleSiteBound1(String rulecode, String signpeoplecode, String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecode", rulecode);//
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.site.bound");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleSiteUnbound1(String rulecode, String signpeoplecode, String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("rulecode", rulecode);//
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.site.unbound");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject ruleUpdate1(String ruleName, String constantParamJson, String ruleCode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ruleName", ruleName);//
        map.put("constantParamJson", constantParamJson);//
        map.put("ruleCode", ruleCode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "rule.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 需要补图卸货地信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("需要补图卸货地信息查询1.0")
    public JSONObject signinorderAddurlorderQuery1(String mobile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//收单员电话
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.addurlorder.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderCreate1(String ordernumber, String address, String url, String signinkind, String longitude, String latitude, String geotype, String password, String addresscode, String identicode, String phone, String signtype, String signway) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("address", address);//
        map.put("url", url);//
        map.put("signinkind", signinkind);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("password", password);//
        map.put("addresscode", addresscode);//
        map.put("identicode", identicode);//
        map.put("phone", phone);//
        map.put("signtype", signtype);//
        map.put("signway", signway);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 解除装货地签到范围限制1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("解除装货地签到范围限制1.0")
    public JSONObject signinorderFree1(String ordernumber, String signinkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("signinkind", signinkind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.free");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderH5update1(String ordernumber, String address, String url, String signinkind, String longitude, String latitude, String geotype, String password, String addresscode, String identicode, String phone, String signtype, String signway) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("address", address);//
        map.put("url", url);//
        map.put("signinkind", signinkind);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("password", password);//
        map.put("addresscode", addresscode);//
        map.put("identicode", identicode);//
        map.put("phone", phone);//
        map.put("signtype", signtype);//
        map.put("signway", signway);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.h5update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderQuery1(String signinordercode, String url, String identitype, String signpeoplecode, String urlmemo, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signinordercode", signinordercode);//
        map.put("url", url);//
        map.put("identitype", identitype);//
        map.put("signpeoplecode", signpeoplecode);//收单员编码
        map.put("urlmemo", urlmemo);//添加图片备注
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderQuerybyordernumber1(String ordernumber, String signinkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("signinkind", signinkind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 签到补充照片1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("签到补充照片1.0")
    public JSONObject signinorderSignAddurl1(String signinordercode, String url, String identitype, String signpeoplecode, String urlmemo, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signinordercode", signinordercode);//
        map.put("url", url);//
        map.put("identitype", identitype);//
        map.put("signpeoplecode", signpeoplecode);//收单员编码
        map.put("urlmemo", urlmemo);//添加图片备注
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.sign.addurl");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderSignValidate1(String ordernumber, String signinkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("signinkind", signinkind);//签到类型 1，装货地签到 2卸货地签到
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.sign.validate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("装货地签到1.0")
    public JSONObject signinorderSignloadUpdate1(String ordernumber, String address, String url, String longitude, String latitude, String geotype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("address", address);//
        map.put("url", url);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.signload.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject signinorderUpdate2(String ordernumber, String address, String imgurl, String signinkind, String longitude, String latitude, String geotype, String password, String addresscode, String identicode, String phone, String signtype, String signway, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("address", address);//
        map.put("url", imgurl);//
        map.put("signinkind", signinkind);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("password", password);//
        map.put("addresscode", addresscode);//
        map.put("identicode", identicode);//
        map.put("phone", phone);//
        map.put("signtype", signtype);//
        map.put("signway", signway);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.update");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderUpdate1(String ordernumber, String address, String url, String signinkind, String longitude, String latitude, String geotype, String password, String addresscode, String identicode, String phone, String signtype, String signway) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("address", address);//
        map.put("url", url);//
        map.put("signinkind", signinkind);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("password", password);//
        map.put("addresscode", addresscode);//
        map.put("identicode", identicode);//
        map.put("phone", phone);//
        map.put("signtype", signtype);//
        map.put("signway", signway);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderUpdateurl1(String signinordercode, String url, String identitype, String signpeoplecode, String urlmemo, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signinordercode", signinordercode);//
        map.put("url", url);//
        map.put("identitype", identitype);//
        map.put("signpeoplecode", signpeoplecode);//收单员编码
        map.put("urlmemo", urlmemo);//添加图片备注
        map.put("ordernumber", ordernumber);//运单号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.updateurl");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signinorderUpdateurlnew1(String ordernumber, String addresscode, String url, String originalunit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//运单号
        map.put("addresscode", addresscode);//地址编码
        map.put("url", url);//图片地址
        map.put("originalunit", originalunit);//发货吨位
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signinorder.updateurlnew");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedCompanypeopleQuerybyPeoplecode1(String signpeoplecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.companypeople.queryby.peoplecode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleCreate1(String companycode, String signpeoplename, String peoplemobile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("peoplemobile", peoplemobile);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleDelete1(String signpeoplecode, String signsitecode, String signpeoplename, String signsitename, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("signsitename", signsitename);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleLogin1(String mobile, String loginpass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("loginpass", loginpass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.login");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("loginpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleQuerybyPeoplecode1(String signpeoplecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.queryby.peoplecode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询企业所有收单员列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询企业所有收单员列表1.0")
    public JSONObject signreceivedPeopleQuerybycompany1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleQuerybymobile1(String signpeoplemobile, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplemobile", signpeoplemobile);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.querybymobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleQuerybysignsite1(String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.querybysignsite");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleQueryisexist1(String signpeoplemobile, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplemobile", signpeoplemobile);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.queryisexist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleRsetpassword1(String mobile, String loginpass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("loginpass", loginpass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.rsetpassword");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("loginpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleUpdate1(String signpeoplecode, String signpeoplename) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedPeopleUpdatepassword1(String mobile, String loginpass, String newpass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);//
        map.put("loginpass", loginpass);//
        map.put("newpass", newpass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.people.updatepassword");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("loginpass");
        ignoreParamNames.add("newpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteCreate1(String companyCode, String companyMemberCode, String signSiteName, String addressMemo, String latitude, String longitude, String provinceName, String provinceCode, String cityName, String cityCode, String countyName, String countyCode, String street, String streetNo, String addressDetail, String geotype, String signPeopleCount, String freightPrecisionRule, String effectiveTonError, String checkForFee, String floatFee) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//
        map.put("companyMemberCode", companyMemberCode);//
        map.put("signSiteName", signSiteName);//
        map.put("addressMemo", addressMemo);//
        map.put("latitude", latitude);//
        map.put("longitude", longitude);//
        map.put("provinceName", provinceName);//
        map.put("provinceCode", provinceCode);//
        map.put("cityName", cityName);//
        map.put("cityCode", cityCode);//
        map.put("countyName", countyName);//
        map.put("countyCode", countyCode);//
        map.put("street", street);//
        map.put("streetNo", streetNo);//
        map.put("addressDetail", addressDetail);//
        map.put("geotype", geotype);//
        map.put("signPeopleCount", signPeopleCount);//
        map.put("freightPrecisionRule", freightPrecisionRule);//
        map.put("effectiveTonError", effectiveTonError);//
        map.put("checkForFee", checkForFee);//
        map.put("floatFee", floatFee);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.site.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteDelete1(String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signsitecode", signsitecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.site.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteQuerybycompany1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.site.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteQuerybysignpeople1(String signpeoplecode, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("companycode", companycode);//企业编码 可选参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.site.querybysignpeople");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteQuerybysignsitecode1(String signsitecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signsitecode", signsitecode);//站点编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.site.querybysignsitecode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteUpdate1(String signSiteCode, String signSiteName, String freightPrecisionRule, String effectiveTonError, String checkForFee, String floatFee) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signSiteCode", signSiteCode);//
        map.put("signSiteName", signSiteName);//
        map.put("freightPrecisionRule", freightPrecisionRule);//
        map.put("effectiveTonError", effectiveTonError);//
        map.put("checkForFee", checkForFee);//
        map.put("floatFee", floatFee);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.site.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSitepeopleBound1(String signpeoplecode, String signsitecode, String signpeoplename, String signsitename, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("signsitename", signsitename);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.sitepeople.bound");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSitepeopleDelete1(String signpeoplecode, String signsitecode, String signpeoplename, String signsitename, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("signsitename", signsitename);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.sitepeople.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSitepeopleInsert1(String signpeoplecode, String signsitecode, String signpeoplename, String signsitename, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("signsitename", signsitename);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.sitepeople.insert");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSitepeopleQuery1(String signpeoplecode, String signsitecode, String signpeoplename, String signsitename, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("signsitename", signsitename);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.sitepeople.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedSiteperopleUnbound1(String signpeoplecode, String signsitecode, String signpeoplename, String signsitename, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("signsitecode", signsitecode);//
        map.put("signpeoplename", signpeoplename);//
        map.put("signsitename", signsitename);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceived.siteperople.unbound");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedpeopleorderbydayCompanyStatisticsSurereceiptcount1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceivedpeopleorderbyday.company.statistics.surereceiptcount");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject signreceivedpeopleorderbydayPeopleStatisticsSurereceiptcount1(String signpeoplecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("signpeoplecode", signpeoplecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "signreceivedpeopleorderbyday.people.statistics.surereceiptcount");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject simCardBindingCreate1(String devicecode, String phonenum, String iccid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("phonenum", phonenum);//
        map.put("iccid", iccid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "sim.card.binding.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject simCardBindingQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "sim.card.binding.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject simCardBindingQuerybydevicecode1(String devicecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "sim.card.binding.querybydevicecode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject simCardBindingQuerybydevicecodes1(String devicecodes, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecodes", devicecodes);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "sim.card.binding.querybydevicecodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject staticlogStockqueryPagebyuser1(String usercode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "staticlog.stockquery.pagebyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject staticlogStockqueryTailbyuser1(String usercode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "staticlog.stockquery.tailbyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockActiveQuery1(String state, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.active.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockAddressQuery1(String stockcode, String ordernumber, String addresstype, String addresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("addresstype", addresstype);//
        map.put("addresscode", addresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.address.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockAddressQueryone1(String stockcode, String ordernumber, String addresstype, String addresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("addresstype", addresstype);//
        map.put("addresscode", addresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.address.queryone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockAddressUpdate1(String stockcode, String addresscode, String contactname, String tel) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("addresscode", addresscode);//
        map.put("contactname", contactname);//
        map.put("tel", tel);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.address.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 装卸货详细地址修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("装卸货详细地址修改1.0")
    public JSONObject stockAddressUpdateall1(String stockcode, String originaladdresscode, String targetaddresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//货源编码
        map.put("originaladdresscode", originaladdresscode);//原始地址编码
        map.put("targetaddresscode", targetaddresscode);//目标更改地址
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.address.updateall");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierCreate1(String usercodes, String stockcode, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("stockcode", stockcode);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierCreateBatch1(String toappcode, String groupcode, String rostercodes, String membertype, String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("toappcode", toappcode);//
        map.put("groupcode", groupcode);//
        map.put("rostercodes", rostercodes);//
        map.put("membertype", membertype);//
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.create.batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierCreateSyn1(String usercodes, String stockcode, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("stockcode", stockcode);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.create.syn");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierDeletebystock1(String usercode, String stokcodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("stokcodes", stokcodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.deletebystock");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierQuerybyapplier1(String usercode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.querybyapplier");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierQuerybystock1(String stockcode, String begindate, String enddate, String start, String limit, String read, String stockrank, String appliertype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("read", read);//
        map.put("stockrank", stockrank);//
        map.put("appliertype", appliertype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.querybystock");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierUpdatereaded1(String stockcode, String usercode, String readed, String origincode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("usercode", usercode);//
        map.put("readed", readed);//
        map.put("origincode", origincode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.updatereaded");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockApplierUpdatestate1(String stockcode, String usercode, String state, String origincode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("usercode", usercode);//
        map.put("state", state);//
        map.put("origincode", origincode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.applier.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockCreate1(String stockname, String stockdesc, String stocktype, String stockkind, String stockheft, String stockcost, String sourcecode, String sourceprovince, String sourcename, String sourcelon, String sourcelat, String sourcememo, String targetcode, String targetprovince, String targetname, String targetlon, String targetlat, String targetmemo, String holdercode, String holdername, String holderphone, String companylinkercode, String dispatchdate, String openable, String construct, String platecolor, String brandname, String length, String special, String companycode, String createdate, String activetime, String emptymargin, String informationfees, String grabed, String truckingordercode, String transportationtime, String carnumber, String stockkindname, String price, String unit, String sourceType, String fathercode, String tarnsmittimes, String srcaddresscode, String dstaddresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockname", stockname);//
        map.put("stockdesc", stockdesc);//
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("stockheft", stockheft);//
        map.put("stockcost", stockcost);//
        map.put("sourcecode", sourcecode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcename", sourcename);//
        map.put("sourcelon", sourcelon);//
        map.put("sourcelat", sourcelat);//
        map.put("sourcememo", sourcememo);//
        map.put("targetcode", targetcode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetname", targetname);//
        map.put("targetlon", targetlon);//
        map.put("targetlat", targetlat);//
        map.put("targetmemo", targetmemo);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("companylinkercode", companylinkercode);//
        map.put("dispatchdate", dispatchdate);//
        map.put("openable", openable);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("companycode", companycode);//
        map.put("createdate", createdate);//
        map.put("activetime", activetime);//
        map.put("emptymargin", emptymargin);//
        map.put("informationfees", informationfees);//
        map.put("grabed", grabed);//
        map.put("truckingordercode", truckingordercode);//
        map.put("transportationtime", transportationtime);//
        map.put("carnumber", carnumber);//
        map.put("stockkindname", stockkindname);//货源类型名称
        map.put("price", price);//
        map.put("unit", unit);//
        map.put("sourceType", sourceType);//
        map.put("fathercode", fathercode);//
        map.put("tarnsmittimes", tarnsmittimes);//
        map.put("srcaddresscode", srcaddresscode);//
        map.put("dstaddresscode", dstaddresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockCreateCredit1(String stockname, String stockdesc, String stocktype, String stockkind, String stockheft, String stockcost, String holdercode, String holdername, String holderphone, String fathercode, String companylinkercode, String dispatchdate, String openable, String construct, String platecolor, String brandname, String length, String special, String truckingordercode, String price, String unit, String activetime, String emptymargin, String informationfees, String grabed, String stockrank, String srcaddresscode, String dstaddresscode, String depositrates, String depositkind, String depositpercent, String stockorder, String freightrates, String createdate, String payway, String srcaddresscodes, String dstaddresscodes, String sourcecode, String sourceprovince, String sourcename, String sourcelon, String sourcelat, String sourcememo, String targetcode, String targetprovince, String targetname, String targetlon, String targetlat, String targetmemo, String transportationtime, String carnumber, String clearingcycle, String companycode, String stockkindname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockname", stockname);//
        map.put("stockdesc", stockdesc);//
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("stockheft", stockheft);//
        map.put("stockcost", stockcost);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("fathercode", fathercode);//
        map.put("companylinkercode", companylinkercode);//
        map.put("dispatchdate", dispatchdate);//
        map.put("openable", openable);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("truckingordercode", truckingordercode);//
        map.put("price", price);//
        map.put("unit", unit);//
        map.put("activetime", activetime);//
        map.put("emptymargin", emptymargin);//
        map.put("informationfees", informationfees);//
        map.put("grabed", grabed);//
        map.put("stockrank", stockrank);//
        map.put("srcaddresscode", srcaddresscode);//
        map.put("dstaddresscode", dstaddresscode);//
        map.put("depositrates", depositrates);//
        map.put("depositkind", depositkind);//
        map.put("depositpercent", depositpercent);//
        map.put("stockorder", stockorder);//
        map.put("freightrates", freightrates);//
        map.put("createdate", createdate);//
        map.put("payway", payway);//
        map.put("srcaddresscodes", srcaddresscodes);//
        map.put("dstaddresscodes", dstaddresscodes);//
        map.put("sourcecode", sourcecode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcename", sourcename);//
        map.put("sourcelon", sourcelon);//
        map.put("sourcelat", sourcelat);//
        map.put("sourcememo", sourcememo);//
        map.put("targetcode", targetcode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetname", targetname);//
        map.put("targetlon", targetlon);//
        map.put("targetlat", targetlat);//
        map.put("targetmemo", targetmemo);//
        map.put("transportationtime", transportationtime);//
        map.put("carnumber", carnumber);//
        map.put("clearingcycle", clearingcycle);//
        map.put("companycode", companycode);//
        map.put("stockkindname", stockkindname);//货源类型名称
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.create.credit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject stockLatestCreate2(String stockname, String stockdesc, String stocktype, String stockkind, String stockheft, String stockcost, String holdercode, String holdername, String holderphone, String fathercode, String companylinkercode, String dispatchdate, String openable, String construct, String platecolor, String brandname, String length, String special, String truckingordercode, String price, String unit, String activetime, String emptymargin, String informationfees, String stockrank, String stockorder, String freightrates, String createdate, String srcaddresscodes, String dstaddresscodes, String sourcecode, String sourceprovince, String sourcename, String sourcelon, String sourcelat, String sourcememo, String targetcode, String targetprovince, String targetname, String targetlon, String targetlat, String targetmemo, String transportationtime, String carnumber, String clearingcycle, String companycode, String paydata, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String stockunitprice, String paymenttype, String channelcodes, String autoupdate, String autocheck, String workstock, String stockkindname, String timeofappointment, String tradeorder, String agentcodes, String rulecode, String freightname, String freightprice, String appointmenttime, String appointmented, String stockqrcode, String fatherstockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockname", stockname);//
        map.put("stockdesc", stockdesc);//
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("stockheft", stockheft);//
        map.put("stockcost", stockcost);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("fathercode", fathercode);//
        map.put("companylinkercode", companylinkercode);//
        map.put("dispatchdate", dispatchdate);//
        map.put("openable", openable);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("truckingordercode", truckingordercode);//
        map.put("price", price);//
        map.put("unit", unit);//
        map.put("activetime", activetime);//
        map.put("emptymargin", emptymargin);//
        map.put("informationfees", informationfees);//
        map.put("stockrank", stockrank);//
        map.put("stockorder", stockorder);//
        map.put("freightrates", freightrates);//
        map.put("createdate", createdate);//
        map.put("srcaddresscodes", srcaddresscodes);//
        map.put("dstaddresscodes", dstaddresscodes);//
        map.put("sourcecode", sourcecode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcename", sourcename);//
        map.put("sourcelon", sourcelon);//
        map.put("sourcelat", sourcelat);//
        map.put("sourcememo", sourcememo);//
        map.put("targetcode", targetcode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetname", targetname);//
        map.put("targetlon", targetlon);//
        map.put("targetlat", targetlat);//
        map.put("targetmemo", targetmemo);//
        map.put("transportationtime", transportationtime);//
        map.put("carnumber", carnumber);//
        map.put("clearingcycle", clearingcycle);//
        map.put("companycode", companycode);//
        map.put("paydata", paydata);//
        map.put("haulageoperatorstate", haulageoperatorstate);//
        map.put("haulageoperatorname", haulageoperatorname);//
        map.put("haulageoperatorcode", haulageoperatorcode);//
        map.put("haulageoperatormoney", haulageoperatormoney);//
        map.put("stockunitprice", stockunitprice);//
        map.put("paymenttype", paymenttype);//运费支付方式：0常用2账期3线下
        map.put("channelcodes", channelcodes);//
        map.put("autoupdate", autoupdate);//自动更新
        map.put("autocheck", autocheck);//自动确认
        map.put("workstock", workstock);//是否任务货源
        map.put("stockkindname", stockkindname);//货源类型名称
        map.put("timeofappointment", timeofappointment);//预约时间
        map.put("tradeorder", tradeorder);//贸易单号
        map.put("agentcodes", agentcodes);//经纪人编码 多个逗号隔开
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("appointmenttime", appointmenttime);//预约生效时间
        map.put("appointmented", appointmented);//预约中
        map.put("stockqrcode", stockqrcode);//指定货源码货源
        map.put("fatherstockcode", fatherstockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.latest.create");//接口路径
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
     * 3.0
     *
     * @return response
     * @throws Exception
     */
    @Step("3.0")
    public JSONObject stockLatestCreate3(String stockname, String stockdesc, String stocktype, String stockkind, String stockheft, String stockcost, String holdercode, String holdername, String holderphone, String fathercode, String companylinkercode, String dispatchdate, String openable, String construct, String platecolor, String brandname, String length, String special, String truckingordercode, String price, String unit, String activetime, String emptymargin, String informationfees, String stockrank, String stockorder, String freightrates, String createdate, String srcaddresscodes, String dstaddresscodes, String sourcecode, String sourceprovince, String sourcename, String sourcelon, String sourcelat, String sourcememo, String targetcode, String targetprovince, String targetname, String targetlon, String targetlat, String targetmemo, String transportationtime, String carnumber, String clearingcycle, String companycode, String paydata, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String stockunitprice, String paymenttype, String channelcodes, String autoupdate, String autocheck, String workstock, String stockkindname, String timeofappointment, String tradeorder, String agentcodes, String rulecode, String freightname, String freightprice, String appointmenttime, String appointmented, String stockqrcode, String fatherstockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockname", stockname);//
        map.put("stockdesc", stockdesc);//
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("stockheft", stockheft);//
        map.put("stockcost", stockcost);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("fathercode", fathercode);//
        map.put("companylinkercode", companylinkercode);//
        map.put("dispatchdate", dispatchdate);//
        map.put("openable", openable);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("truckingordercode", truckingordercode);//
        map.put("price", price);//
        map.put("unit", unit);//
        map.put("activetime", activetime);//
        map.put("emptymargin", emptymargin);//
        map.put("informationfees", informationfees);//
        map.put("stockrank", stockrank);//
        map.put("stockorder", stockorder);//
        map.put("freightrates", freightrates);//
        map.put("createdate", createdate);//
        map.put("srcaddresscodes", srcaddresscodes);//
        map.put("dstaddresscodes", dstaddresscodes);//
        map.put("sourcecode", sourcecode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcename", sourcename);//
        map.put("sourcelon", sourcelon);//
        map.put("sourcelat", sourcelat);//
        map.put("sourcememo", sourcememo);//
        map.put("targetcode", targetcode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetname", targetname);//
        map.put("targetlon", targetlon);//
        map.put("targetlat", targetlat);//
        map.put("targetmemo", targetmemo);//
        map.put("transportationtime", transportationtime);//
        map.put("carnumber", carnumber);//
        map.put("clearingcycle", clearingcycle);//
        map.put("companycode", companycode);//
        map.put("paydata", paydata);//
        map.put("haulageoperatorstate", haulageoperatorstate);//
        map.put("haulageoperatorname", haulageoperatorname);//
        map.put("haulageoperatorcode", haulageoperatorcode);//
        map.put("haulageoperatormoney", haulageoperatormoney);//
        map.put("stockunitprice", stockunitprice);//
        map.put("paymenttype", paymenttype);//运费支付方式：0常用2账期3线下
        map.put("channelcodes", channelcodes);//
        map.put("autoupdate", autoupdate);//自动更新
        map.put("autocheck", autocheck);//自动确认
        map.put("workstock", workstock);//是否任务货源
        map.put("stockkindname", stockkindname);//货源类型名称
        map.put("timeofappointment", timeofappointment);//预约时间
        map.put("tradeorder", tradeorder);//贸易单号
        map.put("agentcodes", agentcodes);//经纪人编码 多个逗号隔开
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("appointmenttime", appointmenttime);//预约生效时间
        map.put("appointmented", appointmented);//预约中
        map.put("stockqrcode", stockqrcode);//指定货源码货源
        map.put("fatherstockcode", fatherstockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.latest.create");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockLatestCreate1(String stockname, String stockdesc, String stocktype, String stockkind, String stockheft, String stockcost, String holdercode, String holdername, String holderphone, String fathercode, String companylinkercode, String dispatchdate, String openable, String construct, String platecolor, String brandname, String length, String special, String truckingordercode, String price, String unit, String activetime, String emptymargin, String informationfees, String stockrank, String stockorder, String freightrates, String createdate, String srcaddresscodes, String dstaddresscodes, String sourcecode, String sourceprovince, String sourcename, String sourcelon, String sourcelat, String sourcememo, String targetcode, String targetprovince, String targetname, String targetlon, String targetlat, String targetmemo, String transportationtime, String carnumber, String clearingcycle, String companycode, String paydata, String haulageoperatorstate, String haulageoperatorname, String haulageoperatorcode, String haulageoperatormoney, String stockunitprice, String paymenttype, String channelcodes, String autoupdate, String autocheck, String workstock, String stockkindname, String timeofappointment, String tradeorder, String agentcodes, String rulecode, String freightname, String freightprice, String appointmenttime, String appointmented, String stockqrcode, String fatherstockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockname", stockname);//
        map.put("stockdesc", stockdesc);//
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("stockheft", stockheft);//
        map.put("stockcost", stockcost);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("fathercode", fathercode);//
        map.put("companylinkercode", companylinkercode);//
        map.put("dispatchdate", dispatchdate);//
        map.put("openable", openable);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("truckingordercode", truckingordercode);//
        map.put("price", price);//
        map.put("unit", unit);//
        map.put("activetime", activetime);//
        map.put("emptymargin", emptymargin);//
        map.put("informationfees", informationfees);//
        map.put("stockrank", stockrank);//
        map.put("stockorder", stockorder);//
        map.put("freightrates", freightrates);//
        map.put("createdate", createdate);//
        map.put("srcaddresscodes", srcaddresscodes);//
        map.put("dstaddresscodes", dstaddresscodes);//
        map.put("sourcecode", sourcecode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcename", sourcename);//
        map.put("sourcelon", sourcelon);//
        map.put("sourcelat", sourcelat);//
        map.put("sourcememo", sourcememo);//
        map.put("targetcode", targetcode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetname", targetname);//
        map.put("targetlon", targetlon);//
        map.put("targetlat", targetlat);//
        map.put("targetmemo", targetmemo);//
        map.put("transportationtime", transportationtime);//
        map.put("carnumber", carnumber);//
        map.put("clearingcycle", clearingcycle);//
        map.put("companycode", companycode);//
        map.put("paydata", paydata);//
        map.put("haulageoperatorstate", haulageoperatorstate);//
        map.put("haulageoperatorname", haulageoperatorname);//
        map.put("haulageoperatorcode", haulageoperatorcode);//
        map.put("haulageoperatormoney", haulageoperatormoney);//
        map.put("stockunitprice", stockunitprice);//
        map.put("paymenttype", paymenttype);//运费支付方式：0常用2账期3线下
        map.put("channelcodes", channelcodes);//
        map.put("autoupdate", autoupdate);//自动更新
        map.put("autocheck", autocheck);//自动确认
        map.put("workstock", workstock);//是否任务货源
        map.put("stockkindname", stockkindname);//货源类型名称
        map.put("timeofappointment", timeofappointment);//预约时间
        map.put("tradeorder", tradeorder);//贸易单号
        map.put("agentcodes", agentcodes);//经纪人编码 多个逗号隔开
        map.put("rulecode", rulecode);//规则编码
        map.put("freightname", freightname);//物品名称
        map.put("freightprice", freightprice);//物品单价
        map.put("appointmenttime", appointmenttime);//预约生效时间
        map.put("appointmented", appointmented);//预约中
        map.put("stockqrcode", stockqrcode);//指定货源码货源
        map.put("fatherstockcode", fatherstockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.latest.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockMywatchingstockDelete1(String watchingStockCodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("watchingStockCodes", watchingStockCodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.mywatchingstock.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockMywatchingstockQuery1(String usercode, String begintime, String endtime, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.mywatchingstock.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockNewstockQuery1(String tel, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tel", tel);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.newstock.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockOilcardQuery1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.oilcard.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPaywayQuery1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.payway.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPriQuery1(String flowid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("flowid", flowid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.pri.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPriqueryfix1(String begindate, String enddate, String sourcecode, String targetcode, String sourceprovince, String targetprovince, String start, String limit, String holderphone) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("targetprovince", targetprovince);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("holderphone", holderphone);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.priqueryfix");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPristatics1(String begindate, String enddate, String start, String limit, String searchkey, String searchval, String publishtype, String haulageoperatorstate, String sort) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("searchkey", searchkey);//
        map.put("searchval", searchval);//
        map.put("publishtype", publishtype);//
        map.put("haulageoperatorstate", haulageoperatorstate);//
        map.put("sort", sort);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.pristatics");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPrivateQuerybycompanycode1(String companycode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.private.querybycompanycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPrivateQuerybydate1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.private.querybydate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockPrivateQuerybyholder1(String usercode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.private.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockQuery1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockQueryBytruckingordercode1(String truckingordercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("truckingordercode", truckingordercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.bytruckingordercode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockQueryStocklater1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.query.stocklater");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockQuerybycodes1(String stockcodes, String stockkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcodes", stockcodes);//
        map.put("stockkind", stockkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockQueryfix1(String sourcecode, String targetcode, String sourceprovince, String targetprovince, String begindate, String enddate, String start, String limit, String stocktype, String stockkind, String construct, String platecolor, String brandname, String length, String special, String openable) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("targetprovince", targetprovince);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("openable", openable);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.queryfix");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockQueryfixNew1(String sourcecode, String targetcode, String sourceprovince, String targetprovince, String begindate, String enddate, String start, String limit, String stocktype, String stockkinds, String constructs, String platecolor, String brandname, String lengths, String special, String openable, String certifystate, String creditstate, String emptymarginstate, String holderphone) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("targetprovince", targetprovince);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("stocktype", stocktype);//
        map.put("stockkinds", stockkinds);//
        map.put("constructs", constructs);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("lengths", lengths);//
        map.put("special", special);//
        map.put("openable", openable);//
        map.put("certifystate", certifystate);//
        map.put("creditstate", creditstate);//
        map.put("emptymarginstate", emptymarginstate);//
        map.put("holderphone", holderphone);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.queryfix.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockReport1(String usercode, String stockcode, String linktel, String cmpnyname, String cmpnycode, String type, String grade, String memo) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("stockcode", stockcode);//
        map.put("linktel", linktel);//
        map.put("cmpnyname", cmpnyname);//
        map.put("cmpnycode", cmpnycode);//
        map.put("type", type);//
        map.put("grade", grade);//
        map.put("memo", memo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.report");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockReportQuerybystockcodeBatch1(String usercode, String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.report.querybystockcode.batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockReportQuerybytime1(String begindate, String enddate, String grade, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("grade", grade);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.report.querybytime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockReportQuerybyuser1(String usercode, String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.report.querybyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockReportQuerybyuserBatch1(String usercode, String stockcodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("stockcodes", stockcodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.report.querybyuser.batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockSearch1(String stocktype, String stockkind, String sourcecode, String targetcode, String construct, String platecolor, String brandname, String length, String special, String openable, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stocktype", stocktype);//
        map.put("stockkind", stockkind);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("special", special);//
        map.put("openable", openable);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockSearchNew1(String stocktype, String stockkinds, String sourcecode, String targetcode, String constructs, String platecolor, String brandname, String lengths, String special, String openable, String certifystate, String creditstate, String emptymarginstate, String begindate, String enddate, String start, String limit, String holderphone) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stocktype", stocktype);//
        map.put("stockkinds", stockkinds);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("constructs", constructs);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("lengths", lengths);//
        map.put("special", special);//
        map.put("openable", openable);//
        map.put("certifystate", certifystate);//
        map.put("creditstate", creditstate);//
        map.put("emptymarginstate", emptymarginstate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("holderphone", holderphone);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.search.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockcallhisCreate1(String stockcode, String usercode, String moduletype, String pathway, String keeptime) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("usercode", usercode);//
        map.put("moduletype", moduletype);//
        map.put("pathway", pathway);//
        map.put("keeptime", keeptime);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockcallhis.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockorderClose1(String stockorder) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockorder", stockorder);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockorder.close");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockpushhisCreate1(String stockcode, String usercodes, String fromusercode, String fromappcode, String toappcode, String targettype, String company) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("usercodes", usercodes);//
        map.put("fromusercode", fromusercode);//
        map.put("fromappcode", fromappcode);//
        map.put("toappcode", toappcode);//
        map.put("targettype", targettype);//
        map.put("company", company);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockpushhis.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockpushhisQuerybystock1(String stockcode, String begintime, String endtime, String usertype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("usertype", usertype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockpushhis.querybystock");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockpushhisQuerybyuser1(String usercode, String keyword, String begintime, String endtime, String sourcecode, String targetcode, String sourceprovice, String targetprovince, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("sourcecode", sourcecode);//
        map.put("targetcode", targetcode);//
        map.put("sourceprovice", sourceprovice);//
        map.put("targetprovince", targetprovince);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockpushhis.querybyuser");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockpushhisTodaydata1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockpushhis.todaydata");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockpushhisTodaydatatest1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockpushhis.todaydatatest");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockStockpushhisUpdatestate1(String stockpushhiscode, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockpushhiscode", stockpushhiscode);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.stockpushhis.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockUpdatecreatedate1(String stockcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.updatecreatedate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockUpdatestate1(String stockcodes, String state, String grabed) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcodes", stockcodes);//
        map.put("state", state);//
        map.put("grabed", grabed);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stock.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockmodelCreate1(String holdercode, String stockmodelname, String stockmodelmemo, String stockmodeldata) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("stockmodelname", stockmodelname);//
        map.put("stockmodelmemo", stockmodelmemo);//
        map.put("stockmodeldata", stockmodeldata);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockmodel.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockmodelQueryByholdercode1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockmodel.query.byholdercode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockmodelQueryone1(String stockmodelcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockmodelcode", stockmodelcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockmodel.queryone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockmodelRemove1(String stockmodelcodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockmodelcodes", stockmodelcodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockmodel.remove");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject stockmodelUpdate1(String stockmodelcode, String stockmodelname, String stockmodelmemo, String stockmodeldata) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockmodelcode", stockmodelcode);//
        map.put("stockmodelname", stockmodelname);//
        map.put("stockmodelmemo", stockmodelmemo);//
        map.put("stockmodeldata", stockmodeldata);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "stockmodel.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAddSpecialcompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.add.specialcompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersCreditH5Firstfinish1(String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.credit.h5.firstfinish");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 银行托管运单判定1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("银行托管运单判定1.0")
    public JSONObject superAssureordersIsebank1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.isebank");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersOrderdriverQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.orderdriver.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersOrderdrivermessage1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.orderdrivermessage");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersQuery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersQuerybathdetailWeb1(String companycode, String holdercode, String begindate, String enddate, String start, String limit, String drivercode, String sourceprovince, String sourcecity, String sourcecode, String targetprovince, String targetcity, String targetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("drivercode", drivercode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcecity", sourcecity);//
        map.put("sourcecode", sourcecode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetcity", targetcity);//
        map.put("targetcode", targetcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.querybathdetail.web");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersQueryfinishWeb1(String companycode, String holdercode, String begindate, String enddate, String start, String limit, String drivercode, String sourceprovince, String sourcecity, String sourcecode, String targetprovince, String targetcity, String targetcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("holdercode", holdercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("drivercode", drivercode);//
        map.put("sourceprovince", sourceprovince);//
        map.put("sourcecity", sourcecity);//
        map.put("sourcecode", sourcecode);//
        map.put("targetprovince", targetprovince);//
        map.put("targetcity", targetcity);//
        map.put("targetcode", targetcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.queryfinish.web");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superAssureordersTrackquery1(String ordernumber, String index) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("index", index);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.assureorders.trackquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCargocardQuerybyusers1(String usercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.cargocard.querybyusers");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyCompanycertifyAudit1(String certifycode, String memo, String pass, String companyalias) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("memo", memo);//
        map.put("pass", pass);//
        map.put("companyalias", companyalias);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.companycertify.audit");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyCompanycertifyCancel1(String certifycode, String memo, String pass, String companyalias) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("memo", memo);//
        map.put("pass", pass);//
        map.put("companyalias", companyalias);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.companycertify.cancel");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyCompanycertifyIdcard1(String companycode, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.companycertify.idcard");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyCompanycertifyQuery1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//查询起始时间，时间戳格式
        map.put("enddate", enddate);//查询截至时间，时间戳格式
        map.put("start", start);//分页起始数
        map.put("limit", limit);//分页限制数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.companycertify.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyCompanycertifyQuerybytime1(String begindate, String enddate, String keyword, String certifystate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("keyword", keyword);//
        map.put("certifystate", certifystate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.companycertify.querybytime");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyPagerdata1(String companycode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.pagerdata");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyPagertag1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.pagertag");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyQuerybyholderFirst1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.querybyholder.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superCompanyQuerybyholdersFirst1(String holdercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercodes", holdercodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.company.querybyholders.first");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运费支付方案调整1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运费支付方案调整1.0")
    public JSONObject superConsultrecordCreditFreightChanged1(String ordernumber, String paynode, String etcmoney, String cashmoney, String oilmoney) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paynode", paynode);//
        map.put("etcmoney", etcmoney);//
        map.put("cashmoney", cashmoney);//
        map.put("oilmoney", oilmoney);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.freight.changed");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运费支付方案调整查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运费支付方案调整查询1.0")
    public JSONObject superConsultrecordCreditFreightChangedQuery1(String ordernumber, String paynode, String recordstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paynode", paynode);//
        map.put("recordstate", recordstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.freight.changed.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运费支付方案调整标准参考查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("运费支付方案调整标准参考查询1.0")
    public JSONObject superConsultrecordCreditFreightChangedStandredQuery1(String ordernumber, String paynode, String actualcost) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paynode", paynode);//
        map.put("actualcost", actualcost);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.freight.changed.standred.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superConsultrecordCreditH5Create1(String ordernumber, String paymoeny, String incomemoeny, String usercode, String consultobject, String consultreason, String consultothersreason, String settlementnum, String consultevidenceurl, String accountid, String password, String consulttype, String phone, String identicode, String originalunit, String actualunit, String unitprice, String ish5, String coalcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paymoeny", paymoeny);//
        map.put("incomemoeny", incomemoeny);//
        map.put("usercode", usercode);//
        map.put("consultobject", consultobject);//
        map.put("consultreason", consultreason);//
        map.put("consultothersreason", consultothersreason);//
        map.put("settlementnum", settlementnum);//
        map.put("consultevidenceurl", consultevidenceurl);//
        map.put("accountid", accountid);//
        map.put("password", password);//
        map.put("consulttype", consulttype);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("originalunit", originalunit);//
        map.put("actualunit", actualunit);//
        map.put("unitprice", unitprice);//
        map.put("ish5", ish5);//
        map.put("coalcode", coalcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.h5.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superConsultrecordCreditH5Updatestate1(String consultrecordcode, String consultresult, String agreecontract, String phone, String identicode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("consultrecordcode", consultrecordcode);//
        map.put("consultresult", consultresult);//
        map.put("agreecontract", agreecontract);//
        map.put("phone", phone);//
        map.put("identicode", identicode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.h5.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superConsultrecordCreditToolCreate1(String ordernumber, String paymoney, String consultreason, String consultothersreason, String settlementnum, String consultevidenceurl, String variableparamjson, String rulecode, String stockcost, String unit, String clientphone, String stockunitprice, String freightchanged, String change, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paymoney", paymoney);//
        map.put("consultreason", consultreason);//
        map.put("consultothersreason", consultothersreason);//
        map.put("settlementnum", settlementnum);//
        map.put("consultevidenceurl", consultevidenceurl);//
        map.put("variableparamjson", variableparamjson);//
        map.put("rulecode", rulecode);//
        map.put("stockcost", stockcost);//
        map.put("unit", unit);//
        map.put("clientphone", clientphone);//
        map.put("stockunitprice", stockunitprice);//
        map.put("freightchanged", freightchanged);//0，运费方案不改变1运费方案改变
        map.put("change", change);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.tool.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("2.0")
    public JSONObject superConsultrecordCreditToolCreate2(String ordernumber, String paymoney, String consultreason, String consultothersreason, String settlementnum, String consultevidenceurl, String variableparamjson, String rulecode, String stockcost, String unit, String clientphone, String stockunitprice, String freightchanged, String change) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("paymoney", paymoney);//
        map.put("consultreason", consultreason);//
        map.put("consultothersreason", consultothersreason);//
        map.put("settlementnum", settlementnum);//
        map.put("consultevidenceurl", consultevidenceurl);//
        map.put("variableparamjson", variableparamjson);//
        map.put("rulecode", rulecode);//
        map.put("stockcost", stockcost);//
        map.put("unit", unit);//
        map.put("clientphone", clientphone);//
        map.put("stockunitprice", stockunitprice);//
        map.put("freightchanged", freightchanged);//0，运费方案不改变1运费方案改变
        map.put("change", change);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.consultrecord.credit.tool.create");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDeviceConnectlist1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.device.connectlist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDevicePagerdata1(String devicecode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.device.pagerdata");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDevicePagertag1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.device.pagertag");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyAudit1(String certifycode, String memo, String pass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("memo", memo);//
        map.put("pass", pass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.audit");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyCancel1(String certifycode, String memo, String pass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("memo", memo);//
        map.put("pass", pass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.cancel");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyIdcard1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.idcard");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyQuery1(String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//查询起始时间，时间戳格式
        map.put("enddate", enddate);//查询截至时间，时间戳格式
        map.put("start", start);//分页起始数
        map.put("limit", limit);//分页限制数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyQuerybykeyword1(String keyword, String begindate, String enddate, String start, String limit, String certifystate, String idcodestate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("certifystate", certifystate);//
        map.put("idcodestate", idcodestate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.querybykeyword");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyRepeated1(String username, String idcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", username);//
        map.put("idcode", idcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.repeated");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyUpdate1(String certifycode, String username, String idcode, String drivinglicence, String runlicence, String otherurl, String platenumbers, String headportrait, String idcardfrontphoto, String idcardbackphoto) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("username", username);//
        map.put("idcode", idcode);//
        map.put("drivinglicence", drivinglicence);//
        map.put("runlicence", runlicence);//
        map.put("otherurl", otherurl);//
        map.put("platenumbers", platenumbers);//
        map.put("headportrait", headportrait);//
        map.put("idcardfrontphoto", idcardfrontphoto);//
        map.put("idcardbackphoto", idcardbackphoto);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverDrivercertifyWeixinquery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.drivercertify.weixinquery");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverPagerdata1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.pagerdata");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superDriverVehicleInformation1(String usermobile, String platenumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usermobile", usermobile);//司机手机号
        map.put("platenumber", platenumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.driver.vehicle.information");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 管理员认证个人信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("管理员认证个人信息1.0")
    public JSONObject superDrivercertificationAudit1(String certifycode, String memo, String pass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证信息的唯一标识
        map.put("memo", memo);//状态变更备注
        map.put("pass", pass);//认证状态
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.drivercertification.audit");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机撤销认证2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机撤销认证2.0")
    public JSONObject superDrivercertificationCancel2(String certifycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证唯一编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.drivercertification.cancel");//接口路径
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
     * 司机撤销认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机撤销认证1.0")
    public JSONObject superDrivercertificationCancel1(String certifycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证唯一编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.drivercertification.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机认证过期时间查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机认证过期时间查询1.0")
    public JSONObject superDrivercertificationOverdueQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.drivercertification.overdue.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 合并认证信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("合并认证信息查询1.0")
    public JSONObject superDrivercertificationQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.drivercertification.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 合并修改认证资料1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("合并修改认证资料1.0")
    public JSONObject superDrivercertificationUpdate1(String certifycode, String username, String idcode, String drivinglicence, String runlicence, String otherurl, String platenumbers, String headportrait, String idcardfrontphoto, String idcardbackphoto, String construct, String length, String vp1, String vp2, String vp3, String vp4, String roadlicence, String roadlicenceurl, String roadlicenceannualcheckurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//
        map.put("username", username);//
        map.put("idcode", idcode);//
        map.put("drivinglicence", drivinglicence);//
        map.put("runlicence", runlicence);//
        map.put("otherurl", otherurl);//
        map.put("platenumbers", platenumbers);//
        map.put("headportrait", headportrait);//
        map.put("idcardfrontphoto", idcardfrontphoto);//
        map.put("idcardbackphoto", idcardbackphoto);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("vp1", vp1);//车辆照片1
        map.put("vp2", vp2);//车辆照片2
        map.put("vp3", vp3);//车辆照片3
        map.put("vp4", vp4);//车辆照片4
        map.put("roadlicence", roadlicence);//道路许可证证件编码
        map.put("roadlicenceurl", roadlicenceurl);//道路许可证照片
        map.put("roadlicenceannualcheckurl", roadlicenceannualcheckurl);//道路许可证年审照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.drivercertification.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superGroupQuerybyholderFirst1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.group.querybyholder.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superMessageTest1(String ordernumber, String dynamicstates, String staticstate, String begindate, String enddate, String start, String limit, String issigned) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("dynamicstates", dynamicstates);//
        map.put("staticstate", staticstate);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("issigned", issigned);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.message.test");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superPristockQuery1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.pristock.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superPristockQuerybycodes1(String stockcodes, String stockkind, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcodes", stockcodes);//
        map.put("stockkind", stockkind);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.pristock.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superRemoveSpecialcompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.remove.specialcompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superSessionQuerybydevice1(String devicecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.session.querybydevice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superSigninorderQuerybyordernumber1(String ordernumber, String signinkind) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("ordernumber", ordernumber);//
        map.put("signinkind", signinkind);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.signinorder.querybyordernumber");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superStockAddressQuery1(String stockcode, String ordernumber, String addresstype, String addresscode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("addresstype", addresstype);//
        map.put("addresscode", addresscode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.stock.address.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superStockTradepayrecordQuery1(String stockcode, String ordernumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("stockcode", stockcode);//
        map.put("ordernumber", ordernumber);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.stock.tradepayrecord.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserCertifynotice1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.certifynotice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserLogon1(String account, String password, String force, String devicecode, String vpnscode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//
        map.put("password", password);//
        map.put("force", force);//
        map.put("devicecode", devicecode);//
        map.put("vpnscode", vpnscode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.logon");//接口路径
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
     * 司机积分等级信息初始化1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机积分等级信息初始化1.0")
    public JSONObject superUserMembershipInit1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.membership.init");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserPagerdata1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.pagerdata");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserPagertag1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.pagertag");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuerybycodes1(String usercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuerybygroup1(String groupcode, String usertype, String longitude, String latitude, String cargocard, String cargotypes, String carcode, String construct, String length, String begintime, String endtime, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//
        map.put("usertype", usertype);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("cargocard", cargocard);//
        map.put("cargotypes", cargotypes);//
        map.put("carcode", carcode);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.querybygroup");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuerybymobiles1(String mobiles) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobiles", mobiles);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.querybymobiles");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuerybyregion1(String regioncode, String usertype, String begintime, String endtime, String lengthcodes, String constructcodes, String targetcodes, String certifystate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("usertype", usertype);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("lengthcodes", lengthcodes);//
        map.put("constructcodes", constructcodes);//
        map.put("targetcodes", targetcodes);//
        map.put("certifystate", certifystate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuerybyuids1(String useruids) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useruids", useruids);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.querybyuids");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserQuerylist1(String begindate, String enddate, String usertype, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("usertype", usertype);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserRecommend1(String groupcodes, String usercode, String toappcode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcodes", groupcodes);//
        map.put("usercode", usercode);//
        map.put("toappcode", toappcode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.recommend");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserSessionlist1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.sessionlist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUserUpdate1(String usercode, String usermobile, String useremail, String username, String usernick, String usersign, String userlogourl, String idcard, String forward) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("usermobile", usermobile);//
        map.put("useremail", useremail);//
        map.put("username", username);//
        map.put("usernick", usernick);//
        map.put("usersign", usersign);//
        map.put("userlogourl", userlogourl);//
        map.put("idcard", idcard);//
        map.put("forward", forward);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.user.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 用户详细信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("用户详细信息查询1.0")
    public JSONObject superUserdetailQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.userdetail.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superUsersessionQuery1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.usersession.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superVehiclePagerdata1(String vehiclecode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.vehicle.pagerdata");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superVehiclePagertag1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.vehicle.pagertag");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superVehicleQuerybyholderFirst1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.vehicle.querybyholder.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superVehicleQuerybyholdercodes1(String usercodes, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.vehicle.querybyholdercodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superVehicleQuerybyholdersFirst1(String usercodes, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.vehicle.querybyholders.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject superWalletChangenotice1(String usercode, String jsondata, String msgtype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("jsondata", jsondata);//
        map.put("msgtype", msgtype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "super.wallet.changenotice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject tradeamountbydayQuerytoday1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "tradeamountbyday.querytoday");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderCreate1(String order, String holdercode, String holdername, String holderphone, String price, String construct, String length, String stockkind, String dispatchdate, String transportationtime, String unit, String memo, String tocompanycode, String fromcompanyname, String fromcompanycode, String sourcecode, String sourcename, String targetcode, String targetname, String srcaddresscodes, String dstaddresscodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("order", order);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("price", price);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("stockkind", stockkind);//
        map.put("dispatchdate", dispatchdate);//
        map.put("transportationtime", transportationtime);//
        map.put("unit", unit);//
        map.put("memo", memo);//
        map.put("tocompanycode", tocompanycode);//
        map.put("fromcompanyname", fromcompanyname);//
        map.put("fromcompanycode", fromcompanycode);//
        map.put("sourcecode", sourcecode);//
        map.put("sourcename", sourcename);//
        map.put("targetcode", targetcode);//
        map.put("targetname", targetname);//
        map.put("srcaddresscodes", srcaddresscodes);//
        map.put("dstaddresscodes", dstaddresscodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderQuery1(String fromcompanycode, String tocompanycode, String holdercode, String begindate, String enddate, String start, String limit, String state, String truckingstate, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromcompanycode", fromcompanycode);//
        map.put("tocompanycode", tocompanycode);//
        map.put("holdercode", holdercode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("state", state);//
        map.put("truckingstate", truckingstate);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderQuerybytocompanycode1(String tocompanycode, String begindate, String enddate, String start, String limit, String state, String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("tocompanycode", tocompanycode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("state", state);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.querybytocompanycode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderQuerydetail1(String truckingordercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("truckingordercode", truckingordercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.querydetail");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderQuerytrack1(String truckingordercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("truckingordercode", truckingordercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.querytrack");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderUpdate1(String truckingordercode, String order, String holdercode, String holdername, String holderphone, String price, String construct, String length, String stockkind, String dispatchdate, String transportationtime, String unit, String memo, String tocompanycode, String fromcompanyname, String fromcompanycode, String sourcecode, String sourcename, String targetcode, String targetname, String srcaddresscodes, String dstaddresscodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("truckingordercode", truckingordercode);//
        map.put("order", order);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("holderphone", holderphone);//
        map.put("price", price);//
        map.put("construct", construct);//
        map.put("length", length);//
        map.put("stockkind", stockkind);//
        map.put("dispatchdate", dispatchdate);//
        map.put("transportationtime", transportationtime);//
        map.put("unit", unit);//
        map.put("memo", memo);//
        map.put("tocompanycode", tocompanycode);//
        map.put("fromcompanyname", fromcompanyname);//
        map.put("fromcompanycode", fromcompanycode);//
        map.put("sourcecode", sourcecode);//
        map.put("sourcename", sourcename);//
        map.put("targetcode", targetcode);//
        map.put("targetname", targetname);//
        map.put("srcaddresscodes", srcaddresscodes);//
        map.put("dstaddresscodes", dstaddresscodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderUpdateprice1(String truckingordercode, String price) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("truckingordercode", truckingordercode);//
        map.put("price", price);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.updateprice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderUpdatestate1(String state, String truckingordercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//
        map.put("truckingordercode", truckingordercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.updatestate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject truckingorderUpdatetostate1(String state, String truckingordercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("state", state);//
        map.put("truckingordercode", truckingordercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "truckingorder.updatetostate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userAgentmemberCreate1(String memberphone, String membername, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("memberphone", memberphone);//
        map.put("membername", membername);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.agentmember.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userAlluserCount1(String enddate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("enddate", enddate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.alluser.count");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userCarrierChgpass1(String usercode, String oldpass, String newpass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("oldpass", oldpass);//
        map.put("newpass", newpass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.carrier.chgpass");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userCertifyQuery1(String begindate, String enddate, String start, String limit, String certified) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("certified", certified);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.certify.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgcertmemo1(String usercode, String certifymemo, String certifyfile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("certifymemo", certifymemo);//
        map.put("certifyfile", certifyfile);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgcertmemo");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgcertstate1(String usercode, String certified, String certifylogid, String logonurl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("certified", certified);//
        map.put("certifylogid", certifylogid);//
        map.put("logonurl", logonurl);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgcertstate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgcredit1(String usercode, String usercredit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("usercredit", usercredit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgcredit");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgneedconfirm1(String usercode, String needconfirm) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("needconfirm", needconfirm);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgneedconfirm");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgpass1(String oldpass, String newpass, String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldpass", oldpass);//
        map.put("newpass", newpass);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("oldpass");
        ignoreParamNames.add("newpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgrank1(String usercode, String userrank) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("userrank", userrank);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgrank");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgstate1(String usercode, String userstate) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("userstate", userstate);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgstate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userChgvitality1(String usercode, String uservitality) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("uservitality", uservitality);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.chgvitality");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机配置信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机配置信息查询1.0")
    public JSONObject userCommonconfigQuery1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.commonconfig.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userCompanymemberCreate1(String memberphone, String membername, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("memberphone", memberphone);//
        map.put("membername", membername);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.companymember.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userContain1(String useruid, String usermobile, String useremail) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useruid", useruid);//
        map.put("usermobile", usermobile);//
        map.put("useremail", useremail);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.contain");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userIdentikonw1(String uid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("uid", uid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.identikonw");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userKeepalive1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.keepalive");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userLogon1(String account, String password, String force, String devicecode, String vpnscode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//
        map.put("password", password);//
        map.put("force", force);//
        map.put("devicecode", devicecode);//
        map.put("vpnscode", vpnscode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.logon");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userLogonByAuthcode1(String account, String force, String devicecode, String vpnscode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//
        map.put("force", force);//
        map.put("devicecode", devicecode);//
        map.put("vpnscode", vpnscode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.logon.by.authcode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userLogout1(String sessionid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("sessionid", sessionid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.logout");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userMatch1(String useruid, String usermobile, String useremail) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useruid", useruid);//
        map.put("usermobile", usermobile);//
        map.put("useremail", useremail);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.match");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userMemberupdate1(String oldmobile, String newmobile, String newname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("oldmobile", oldmobile);//
        map.put("newmobile", newmobile);//
        map.put("newname", newname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.memberupdate");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userPasswordauthentification1(String xcsession, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("xcsession", xcsession);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.passwordauthentification");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userPasswordcheck1(String usercode, String password) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("password", password);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.passwordcheck");//接口路径
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
     * 获取当前登录人信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuery1(String session) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过关键字姓名，电话搜索司机信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过关键字姓名，电话搜索司机信息1.0")
    public JSONObject userQueryBynameormobile1(String keyword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.query.bynameormobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybycodes1(String usercodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybydev1(String updatedev) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("updatedev", updatedev);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybydev");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybyemail1(String useremail) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useremail", useremail);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybyemail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过关键字车牌号，姓名，电话搜索司机信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过关键字车牌号，姓名，电话搜索司机信息1.0")
    public JSONObject userQuerybykerwordNew1(String keyword, String type) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字
        map.put("type", type);//1,电话 ;2,车牌号;3,司机姓名
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybykerword.new");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybymobile1(String usermobile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usermobile", usermobile);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybymobile");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybymobiles1(String mobiles) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobiles", mobiles);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybymobiles");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybyregion1(String regioncode, String usertype, String begintime, String endtime, String lengthcodes, String constructcodes, String targetcodes, String certifystate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("usertype", usertype);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("lengthcodes", lengthcodes);//
        map.put("constructcodes", constructcodes);//
        map.put("targetcodes", targetcodes);//
        map.put("certifystate", certifystate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybyuid1(String useruid) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useruid", useruid);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybyuid");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerybyuids1(String useruids) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useruids", useruids);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querybyuids");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userQuerynew1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.querynew");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userRegister1(String useruid, String userpass, String usermobile, String useremail, String usertype, String userstate, String username, String usernick, String usersign, String userlogourl, String invitecode, String regioncode, String longitude, String latitude, String geotype, String forward) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("useruid", useruid);//
        map.put("userpass", userpass);//
        map.put("usermobile", usermobile);//
        map.put("useremail", useremail);//
        map.put("usertype", usertype);//
        map.put("userstate", userstate);//
        map.put("username", username);//
        map.put("usernick", usernick);//
        map.put("usersign", usersign);//
        map.put("userlogourl", userlogourl);//
        map.put("invitecode", invitecode);//
        map.put("regioncode", regioncode);//
        map.put("longitude", longitude);//
        map.put("latitude", latitude);//
        map.put("geotype", geotype);//
        map.put("forward", forward);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.register");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("userpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 紧急移除session1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("紧急移除session1.0")
    public JSONObject userRemoveSession1(String usercode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.remove.session");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userResetpass1(String account, String newpass) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);//
        map.put("newpass", newpass);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.resetpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpass");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSearch1(String keyword, String certified, String usertype, String begintime, String endtime, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("certified", certified);//
        map.put("usertype", usertype);//
        map.put("begintime", begintime);//
        map.put("endtime", endtime);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSessionCreate1(String devicecode, String usercode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("usercode", usercode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.session.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSessionDestroy1(String devicecode, String usercode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("usercode", usercode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.session.destroy");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSessionQuery1(String devicecode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.session.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSoncompanymemberChgpass1(String usercode, String newpasword, String oldpassword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("newpasword", newpasword);//
        map.put("oldpassword", oldpassword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.soncompanymember.chgpass");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("newpasword");
        ignoreParamNames.add("oldpassword");
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSoncompanymemberCreate1(String usercode, String paypassword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("paypassword", paypassword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.soncompanymember.create");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSoncompanymemberQuery1(String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.soncompanymember.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSoncompanymemberValidate1(String usercode, String paypassword) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("paypassword", paypassword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.soncompanymember.validate");//接口路径
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
     * 1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userSsoXcclone1(String xcsession, String devicecode, String devicetype) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("xcsession", xcsession);//
        map.put("devicecode", devicecode);//
        map.put("devicetype", devicetype);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.sso.xcclone");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userUpdate1(String usercode, String usermobile, String useremail, String username, String usernick, String usersign, String userlogourl, String idcard, String forward) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("usermobile", usermobile);//
        map.put("useremail", useremail);//
        map.put("username", username);//
        map.put("usernick", usernick);//
        map.put("usersign", usersign);//
        map.put("userlogourl", userlogourl);//
        map.put("idcard", idcard);//
        map.put("forward", forward);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userUpdateradarswitch1(String usercode, String radarswitch) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("radarswitch", radarswitch);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.updateradarswitch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject userVitality1() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.vitality");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject user_openQuery1(String open_id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_id", open_id);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user_open.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject user_openQueryBatch1(String open_ids) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_ids", open_ids);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user_open.query.batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject user_openQueryLocation1(String open_id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_id", open_id);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user_open.query.location");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject user_openQueryLocation_his1(String open_id, String begindate, String enddate, String start, String limit, String precisiongrade) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_id", open_id);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("precisiongrade", precisiongrade);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user_open.query.location_his");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject user_openQuery_xcsession1(String xcssession) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("xcssession", xcssession);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user_open.query_xcsession");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleCarcodeQuerybycarnumbers1(String id, String carnumber, String city, String regioncode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//
        map.put("carnumber", carnumber);//
        map.put("city", city);//
        map.put("regioncode", regioncode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.carcode.querybycarnumbers");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleCarcodeQuerybyregioncode1(String id, String carnumber, String city, String regioncode, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//
        map.put("carnumber", carnumber);//
        map.put("city", city);//
        map.put("regioncode", regioncode);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.carcode.querybyregioncode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleCreate1(String vehiclecode, String vehiclename, String platecode, String licensenum, String licensedate, String vehicletype, String regioncode, String regionname, String holdercode, String holdername, String construct, String platecolor, String brandname, String length, String tonnage, String special, String axle) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("vehiclename", vehiclename);//
        map.put("platecode", platecode);//
        map.put("licensenum", licensenum);//
        map.put("licensedate", licensedate);//
        map.put("vehicletype", vehicletype);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("tonnage", tonnage);//
        map.put("special", special);//
        map.put("axle", axle);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleDelete1(String vehiclecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehiclePlateUpdate1(String vehiclecode, String platecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("platecode", platecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.plate.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuery1(String vehiclecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybycodes1(String vehiclecodes) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecodes", vehiclecodes);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybycodes");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybydevice1(String devicecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("devicecode", devicecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybydevice");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybyholder1(String usercode, String keyword, String begindate, String enddate, String start, String limit, String appliertype, String origincode, String openable, String grabed, String countstate, String state) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//
        map.put("keyword", keyword);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appliertype", appliertype);//
        map.put("origincode", origincode);//
        map.put("openable", openable);//
        map.put("grabed", grabed);//
        map.put("countstate", countstate);//
        map.put("state", state);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybyholder");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybyholderFirst1(String holdercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybyholder.first");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybyplatecode1(String platecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("platecode", platecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybyplatecode");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybyproperties1(String construct, String platecolor, String brandname, String length, String tonnage, String special, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("tonnage", tonnage);//
        map.put("special", special);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybyproperties");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerybyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleQuerylist1(String keyword, String construct, String platecolor, String brandname, String length, String tonnage, String special, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("tonnage", tonnage);//
        map.put("special", special);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.querylist");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleSearch1(String keyword, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.search");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleUpdate1(String vehiclecode, String vehiclename, String platecode, String licensenum, String licensedate, String vehicletype, String regioncode, String regionname, String holdercode, String holdername, String construct, String platecolor, String brandname, String length, String tonnage, String special, String axle) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("vehiclename", vehiclename);//
        map.put("platecode", platecode);//
        map.put("licensenum", licensenum);//
        map.put("licensedate", licensedate);//
        map.put("vehicletype", vehicletype);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("holdercode", holdercode);//
        map.put("holdername", holdername);//
        map.put("construct", construct);//
        map.put("platecolor", platecolor);//
        map.put("brandname", brandname);//
        map.put("length", length);//
        map.put("tonnage", tonnage);//
        map.put("special", special);//
        map.put("axle", axle);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.update");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleUpdatecompany1(String vehiclecode, String companycode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("companycode", companycode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.updatecompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleUpdatedriver1(String vehiclecode, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("usercode", usercode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.updatedriver");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicleUpdateimage1(String vehiclecode, String vehicleimage1, String vehicleimage2, String vehicleimage3, String vehicleimage4) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehiclecode", vehiclecode);//
        map.put("vehicleimage1", vehicleimage1);//
        map.put("vehicleimage2", vehicleimage2);//
        map.put("vehicleimage3", vehicleimage3);//
        map.put("vehicleimage4", vehicleimage4);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle.updateimage");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicle_openQuery1(String open_id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_id", open_id);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle_open.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicle_openQueryBatch1(String open_ids) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("open_ids", open_ids);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle_open.query.batch");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject vehicle_openQuerybyplatecode1(String platecode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("platecode", platecode);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicle_open.querybyplatecode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 撤销删除车辆信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("撤销删除车辆信息1.0")
    public JSONObject vehicleinformationDeleteFromtmp1(String id, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一标识
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.delete.fromtmp");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加车辆1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("添加车辆1.0")
    public JSONObject vehicleinformationInsertTotmp1(String platenumber, String runlicence, String memo, String vehicleimage1, String vehicleimage2, String vehicleimage3, String vehicleimage4, String construct, String length, String usercode, String common, String roadlicence, String roadlicenceUrl) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("platenumber", platenumber);//车牌号
        map.put("runlicence", runlicence);//行驶证照片
        map.put("memo", memo);//审批说明
        map.put("vehicleimage1", vehicleimage1);//车辆照片1
        map.put("vehicleimage2", vehicleimage2);//车辆照片2
        map.put("vehicleimage3", vehicleimage3);//车辆照片3
        map.put("vehicleimage4", vehicleimage4);//车辆照片4
        map.put("construct", construct);//货箱结构
        map.put("length", length);//车长
        map.put("usercode", usercode);//用户编码
        map.put("common", common);//是否设置为常用
        map.put("roadlicence", roadlicence);//道路许可证
        map.put("roadlicenceUrl", roadlicenceUrl);//道路许可证照片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.insert.totmp");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询车辆是否通过审核1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询车辆是否通过审核1.0")
    public JSONObject vehicleinformationIscertified1(String id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.iscertified");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 更改车辆信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("更改车辆信息1.0")
    public JSONObject vehicleinformationModifyFromtmp1(String id, String runlicence, String construct, String length, String platenumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一标识
        map.put("runlicence", runlicence);//行驶证照片
        map.put("construct", construct);//货箱结构
        map.put("length", length);//车长
        map.put("platenumber", platenumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.modify.fromtmp");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 更改四张图片1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("更改四张图片1.0")
    public JSONObject vehicleinformationModifyImage1(String vehicleimage1, String vehicleimage2, String vehicleimage3, String vehicleimage4, String id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehicleimage1", vehicleimage1);//图片1
        map.put("vehicleimage2", vehicleimage2);//图片2
        map.put("vehicleimage3", vehicleimage3);//图片3
        map.put("vehicleimage4", vehicleimage4);//图片4
        map.put("id", id);//唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.modify.image");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加更改道路许可证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("添加更改道路许可证1.0")
    public JSONObject vehicleinformationModifyRoadlicence1(String roadlicence, String roadlicenceurl, String roadlicenceannualcheckurl, String id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("roadlicence", roadlicence);//道路许可证
        map.put("roadlicenceurl", roadlicenceurl);//道路许可证照片
        map.put("roadlicenceannualcheckurl", roadlicenceannualcheckurl);//道路许可证年审页照片
        map.put("id", id);//唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.modify.roadlicence");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询该用户下所有的车1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询该用户下所有的车1.0")
    public JSONObject vehicleinformationQuery1(String id, String usercode, String isall) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一标识
        map.put("usercode", usercode);//用户编码
        map.put("isall", isall);//不传查所有,传1查已经添加的
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过id查询车辆信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过id查询车辆信息1.0")
    public JSONObject vehicleinformationQueryByid1(String id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.query.byid");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过id查询车辆信息2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过id查询车辆信息2.0")
    public JSONObject vehicleinformationQueryByid2(String id) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.query.byid");//接口路径
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
     * 通过车牌号查询车辆信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过车牌号查询车辆信息1.0")
    public JSONObject vehicleinformationQueryByplatenumber1(String usercode, String platenumber) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("platenumber", platenumber);//车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.query.byplatenumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 更改常用车辆1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("更改常用车辆1.0")
    public JSONObject vehicleinformationUpdateCommonFromtmp1(String id, String usercode) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//唯一标识
        map.put("usercode", usercode);//用户编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "vehicleinformation.update.common.fromtmp");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject zoneCreate1(String zonename, String zonetype, String zonekind, String zonedata, String regioncode, String regionname, String companycode, String companyname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("zonename", zonename);//
        map.put("zonetype", zonetype);//
        map.put("zonekind", zonekind);//
        map.put("zonedata", zonedata);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "zone.create");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject zoneDelete1(String zonecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("zonecode", zonecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "zone.delete");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject zoneQuery1(String zonecode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("zonecode", zonecode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "zone.query");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject zoneQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "zone.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject zoneQuerybyregion1(String regioncode, String begindate, String enddate, String start, String limit) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "zone.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
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
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject zoneUpdate1(String zonecode, String zonename, String zonetype, String zonekind, String zonedata, String regioncode, String regionname, String companycode, String companyname) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("zonecode", zonecode);//
        map.put("zonename", zonename);//
        map.put("zonetype", zonetype);//
        map.put("zonekind", zonekind);//
        map.put("zonedata", zonedata);//
        map.put("regioncode", regioncode);//
        map.put("regionname", regionname);//
        map.put("companycode", companycode);//
        map.put("companyname", companyname);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "zone.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 地址支持模糊查询 1.0
     * 20190613 0215765
     *
     * @return response
     * @throws Exception
     */
    @Step("1.0")
    public JSONObject addressQuerybycompany1(String companycode, String regioncode, String begindate, String enddate, String start, String limit, String keyword) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//
        map.put("regioncode", regioncode);//
        map.put("begindate", begindate);//
        map.put("enddate", enddate);//
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("keyword", keyword);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "address.querybycompany");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机运单按照线路分组统计查询1.0
     * 20190613 021861
     *
     * @return response
     * @throws Exception
     */
    @Step("司机运单按照线路分组统计查询1.0")
    public JSONObject orderviewDriverorderGroupbyroutes1(String usercode, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//司机用户编码
        map.put("start", start);//分页起始数
        map.put("limit", limit);//分页页面个数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "orderview.driverorder.groupbyroutes");//接口路径
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
