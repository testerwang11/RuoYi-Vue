package com.ruoyi.project.sjbapi.service;

import com.alibaba.fastjson.JSONArray;
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
public class SJBAllService {

    /*private static String url = Config.getYml().getUrl("sjbAll");
    private static String appcode = Config.getYml().getAppCode("sjbAll");*/

    private static String url =  "http://sjb-service.sijibao.co/sjbAll/router";

    private static String appcode = "100094";

    /**
     * 广告统计1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("广告统计1.0")
    public JSONObject adStatistics1(String id, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//广告id
        map.put("deviceType", "4");//设备类型
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "ad.statistics");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询app活动列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询app活动列表1.0")
    public JSONObject appActivityQueryList1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.activity.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 新广告查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("新广告查询1.0")
    public JSONObject appAdQuery1(String advcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("advcode", advcode);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "app.ad.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过holdercode查询星级1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过holdercode查询星级1.0")
    public JSONObject commentGradeQuery1(String holdercode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//被评论对象的编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.grade.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建评论回复1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("创建评论回复1.0")
    public JSONObject commentReplyCreate1(String commentcode, String replycode, String wordcontent, String replyimages, String fathercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//评论编码
        map.put("replycode", replycode);//评论人的编码
        map.put("wordcontent", wordcontent);//评论内容
        map.put("replyimages", replyimages);//回复的图像
        map.put("fathercode", fathercode);//此回复针对的对象编码,如果针对的是某条评论,则fathercode=commentcode
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.reply.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改评论回复1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改评论回复1.0")
    public JSONObject commentReplyUpdate1(String commentcode, String commentreplycode, String wordcontent, String replyimages) {
        HashMap<String, String> map = new HashMap<>();
        map.put("commentcode", commentcode);//评论编码
        map.put("commentreplycode", commentreplycode);//评论回复的编码
        map.put("wordcontent", wordcontent);//评论内容
        map.put("replyimages", replyimages);//回复的图片
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "comment.reply.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建公司的常用地址1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("创建公司的常用地址1.0")
    public JSONObject companyAddressCreate1(String geoType, String zoneName, String zoneMemo, String address, String addressImage, String contastName, String contastTel, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("geoType", geoType);//坐标系统
        map.put("lat", "30.460185");//纬度
        map.put("lon", "114.429231");//经度
        map.put("zoneName", zoneName);//区域名称
        map.put("zoneMemo", zoneMemo);//地址备注
        map.put("address", address);//详细地址
        map.put("addressImage", addressImage);//地址地图快照
        map.put("contastName", contastName);//地址联系人
        map.put("contastTel", contastTel);//地址联系电话
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.address.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改公司的常用地址1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改公司的常用地址1.0")
    public JSONObject companyAddressModify1(String zoneCode, String geoType, String zoneName, String zoneMemo, String address, String addressImage, String contastName, String contastTel) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zoneCode", zoneCode);//地区编码
        map.put("geoType", geoType);//坐标系统
        map.put("lat", "30.460185");//纬度
        map.put("lon", "114.429231");//经度
        map.put("zoneName", zoneName);//区域名称
        map.put("zoneMemo", zoneMemo);//地址备注,最大140
        map.put("address", address);//详细地址
        map.put("addressImage", addressImage);//地址地图快照
        map.put("contastName", contastName);//地址联系人
        map.put("contastTel", contastTel);//地址联系电话
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.address.modify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询公司的常用地址1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询公司的常用地址1.0")
    public JSONObject companyAddressQueryList1(String regioncode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//地区编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.address.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().close().getReturnJsonObject();
    }

    /**
     * 删除公司常用地址1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("删除公司常用地址1.0")
    public JSONObject companyAddressRemove1(String zoneCodes, String addresscodes) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zoneCodes", zoneCodes);//
        map.put("addresscodes", addresscodes);//批量删除的地址编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.address.remove");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询公司绑定的经纪人列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询公司绑定的经纪人列表1.0")
    public JSONObject companyAgentList1(String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.agent.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加企业业务城市1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("添加企业业务城市1.0")
    public JSONObject companyBizcityAdd1(String regioncodes, String memo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncodes", regioncodes);//批量地区编码
        map.put("memo", memo);//备注
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.bizcity.add");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除企业业务城市1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("删除企业业务城市1.0")
    public JSONObject companyBizcityRemove1(String companycode, String regioncodes, String memo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编码
        map.put("regioncodes", regioncodes);//批量地区编码
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

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业请求认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业请求认证1.0")
    public JSONObject companyCertify1(String companyCode, String companyName, String companyLicenseCode, String companyManName, String companyManIdcard, String companyLicenseImage, String companyManImage, String companyManImageBack, String companyOtherImage, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companyCode", companyCode);//公司编码
        map.put("companyName", companyName);//公司名称
        map.put("companyLicenseCode", companyLicenseCode);//公司营业执照编码
        map.put("companyManName", companyManName);//公司法人姓名
        map.put("companyManIdcard", companyManIdcard);//公司法人身份证号码
        map.put("companyLicenseImage", companyLicenseImage);//公司营业执照图片
        map.put("companyManImage", companyManImage);//公司法人身份证正面照片
        map.put("companyManImageBack", companyManImageBack);//公司法人身份证背面照片
        map.put("companyOtherImage", companyOtherImage);//其他图片
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.certify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询公司常用地址1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询公司常用地址1.0")
    public JSONObject companyCommonAddressQueryList1(String querykey, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("querykey", querykey);//搜索关键字，地址或联系人
        map.put("start", start);//分页起始，最小值 0
        map.put("limit", limit);//分页每页数量,最大值1000,最小值1
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.common.address.query.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 公司查询司机好友列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("公司查询司机好友列表1.0")
    public JSONObject companyFriendsDriverList1(String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.friends.driver.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 企业信息查询接口1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("企业信息查询接口1.0")
    public JSONObject companyQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过企业编码查询企业信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过企业编码查询企业信息1.0")
    public JSONObject companyQueryBycompanycode1(String companycode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("companycode", companycode);//企业编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.query.bycompanycode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 根据groupcode查询企业信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("根据groupcode查询企业信息1.0")
    public JSONObject companyQueryBygroupcode1(String groupcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupcode", groupcode);//组编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.query.bygroupcode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过usercode查询企业信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过usercode查询企业信息1.0")
    public JSONObject companyQueryByusercode1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "company.query.byusercode");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机处理经纪人好友邀请关系1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机处理经纪人好友邀请关系1.0")
    public JSONObject driverAgentFriendAction1(String agentcode, String action, String memo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentcode", agentcode);//经纪人编码
        map.put("action", action);//处理动作 1同意 2拒绝
        map.put("memo", memo);//备注
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.agent.friend.action");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机绑定经纪人1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机绑定经纪人1.0")
    public JSONObject driverBindAgent1(String agentMobile, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentMobile", agentMobile);//经纪人手机号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.bind.agent");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机删除绑定的经纪人1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机删除绑定的经纪人1.0")
    public JSONObject driverBindAgentDelete1(String agentMobile, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentMobile", agentMobile);//经纪人手机号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.bind.agent.delete");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询绑定经纪人的手机号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机查询绑定经纪人的手机号1.0")
    public JSONObject driverBindAgentQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.bind.agent.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机修改绑定经纪人的手机号1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机修改绑定经纪人的手机号1.0")
    public JSONObject driverBindAgentUpdate1(String agentMobile, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("agentMobile", agentMobile);//经纪人手机号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.bind.agent.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机发送认证请求,包括司机个人认证和车辆认证2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机发送认证请求,包括司机个人认证和车辆认证2.0")
    public JSONObject driverCertify2(String certifycode, String headportrait, String username, String idcode, String idcardFrontPhoto, String idcardBackPhoto, String drivinglicence, String otherurl, String platenumbers, String runlicence, String construct, String length, String vp1, String vp2, String roadlicence, String roadlicenceurl, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证编码
        map.put("headportrait", headportrait);//头像
        map.put("username", username);//用户名称
        map.put("idcode", idcode);//身份证号
        map.put("idcardFrontPhoto", idcardFrontPhoto);//身份证正面照
        map.put("idcardBackPhoto", idcardBackPhoto);//身份证号反面照
        map.put("drivinglicence", drivinglicence);//驾驶证
        map.put("otherurl", otherurl);//其他文件
        map.put("platenumbers", platenumbers);//车牌号
        map.put("runlicence", runlicence);//行驶证
        map.put("construct", construct);//货源结构
        map.put("length", length);//长度
        map.put("vp1", vp1);//车辆照片1车头照
        map.put("vp2", vp2);//车辆照片2车尾照
        map.put("roadlicence", roadlicence);//道路许可证证件编码
        map.put("roadlicenceurl", roadlicenceurl);//道路许可证照片
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机发送认证请求,包括司机个人认证和车辆认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机发送认证请求,包括司机个人认证和车辆认证1.0")
    public JSONObject driverCertify1(String certifycode, String headportrait, String username, String idcode, String idcardFrontPhoto, String idcardBackPhoto, String drivinglicence, String otherurl, String platenumbers, String runlicence, String construct, String length, String vp1, String vp2, String roadlicence, String roadlicenceurl, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证编码
        map.put("headportrait", headportrait);//头像
        map.put("username", username);//用户名称
        map.put("idcode", idcode);//身份证号
        map.put("idcardFrontPhoto", idcardFrontPhoto);//身份证正面照
        map.put("idcardBackPhoto", idcardBackPhoto);//身份证号反面照
        map.put("drivinglicence", drivinglicence);//驾驶证
        map.put("otherurl", otherurl);//其他文件
        map.put("platenumbers", platenumbers);//车牌号
        map.put("runlicence", runlicence);//行驶证
        map.put("construct", construct);//货源结构
        map.put("length", length);//长度
        map.put("vp1", vp1);//车辆照片1车头照
        map.put("vp2", vp2);//车辆照片2车尾照
        map.put("roadlicence", roadlicence);//道路许可证证件编码
        map.put("roadlicenceurl", roadlicenceurl);//道路许可证照片
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 取消认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("取消认证1.0")
    public JSONObject driverCertifyCancel1(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 取消认证2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("取消认证2.0")
    public JSONObject driverCertifyCancel2(String somethingcode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("somethingcode", somethingcode);//某种code，通用字段
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机个人认证版本2.02.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机个人认证版本2.02.0")
    public JSONObject driverCertifyUser2(String certifycode, String headportrait, String username, String idcode, String idcardFrontPhoto, String idcardBackPhoto, String drivinglicence, String otherurl, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证编码
        map.put("headportrait", headportrait);//头像
        map.put("username", username);//用户姓名
        map.put("idcode", idcode);//身份证号
        map.put("idcardFrontPhoto", idcardFrontPhoto);//身份证正面照
        map.put("idcardBackPhoto", idcardBackPhoto);//身份证背面照
        map.put("drivinglicence", drivinglicence);//驾驶证
        map.put("otherurl", otherurl);//其他文件
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.user");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机个人认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机个人认证1.0")
    public JSONObject driverCertifyUser1(String certifycode, String headportrait, String username, String idcode, String idcardFrontPhoto, String idcardBackPhoto, String drivinglicence, String otherurl, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("certifycode", certifycode);//认证编码
        map.put("headportrait", headportrait);//头像
        map.put("username", username);//用户姓名
        map.put("idcode", idcode);//身份证号
        map.put("idcardFrontPhoto", idcardFrontPhoto);//身份证正面照
        map.put("idcardBackPhoto", idcardBackPhoto);//身份证背面照
        map.put("drivinglicence", drivinglicence);//驾驶证
        map.put("otherurl", otherurl);//其他文件
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.user");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 添加车辆认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("添加车辆认证1.0")
    public JSONObject driverCertifyVehicle1(String plateNumber, String length, String construct, String runLincence, String common, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("plateNumber", plateNumber);//车牌号
        map.put("length", length);//车长
        map.put("construct", construct);//货箱结构
        map.put("runLincence", runLincence);//行驶证
        map.put("common", common);//是否常用
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.certify.vehicle");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除车辆信息1.0
     *
     * @return response
     */
    @Step("删除车辆信息1.0")
    public JSONObject driverDeleteVehicle1(String id, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.delete.vehicle");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机首次快速认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机首次快速认证1.0")
    public JSONObject driverFirstFastCertify1(String headportrait, String username, String idcode, String idcardFrontPhoto, String idcardBackPhoto, String drivinglicence, String plateNumber, String runLincence, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("headportrait", headportrait);//头像
        map.put("username", username);//用户姓名
        map.put("idcode", idcode);//身份证号
        map.put("idcardFrontPhoto", idcardFrontPhoto);//身份证正面照
        map.put("idcardBackPhoto", idcardBackPhoto);//身份证背面照
        map.put("drivinglicence", drivinglicence);//驾驶证
        map.put("plateNumber", plateNumber);//车牌号
        map.put("runLincence", runLincence);//行驶证
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.first.fast.certify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 想车队中添加成员1.0
     *
     * @return response
     */
    @Step("想车队中添加成员1.0")
    public JSONObject driverFleetAdd1(String drivermobile, String drivername, String vehicletrucknum) {
        HashMap<String, String> map = new HashMap<>();
        map.put("drivermobile", drivermobile);//车队成员手机号
        map.put("drivername", drivername);//车队成员名称
        map.put("vehicletrucknum", vehicletrucknum);//车队成员车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.fleet.add");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询车队中成员列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询车队中成员列表1.0")
    public JSONObject driverFleetQuery1(String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.fleet.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除车队中成员1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("删除车队中成员1.0")
    public JSONObject driverFleetRemove1(String primarykey) {
        HashMap<String, String> map = new HashMap<>();
        map.put("primarykey", primarykey);//唯一标识
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.fleet.remove");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 更新车队成员信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("更新车队成员信息1.0")
    public JSONObject driverFleetUpdate1(String userleaderdrivercode, String drivername, String vehicletrucknum) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userleaderdrivercode", userleaderdrivercode);//用户车队长编码
        map.put("drivername", drivername);//车队成员名称
        map.put("vehicletrucknum", vehicletrucknum);//车队成员车牌号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.fleet.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车头车尾照片添加和修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车头车尾照片添加和修改1.0")
    public JSONObject driverImageUpdate1(String id, String vp1, String vp2, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆唯一标识
        map.put("vp1", vp1);//车头照
        map.put("vp2", vp2);//车尾照
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.image.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 许可证添加和修改1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("许可证添加和修改1.0")
    public JSONObject driverLicenceUpdate1(String id, String roadLicenceCode, String roadLicenceUrl, String roadLicenceAnnualCheckUrl, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆主键
        map.put("roadLicenceCode", roadLicenceCode);//许可证编码
        map.put("roadLicenceUrl", roadLicenceUrl);//许可证图片
        map.put("roadLicenceAnnualCheckUrl", roadLicenceAnnualCheckUrl);//许可证年审图片
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.licence.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机上传地理位置信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机上传地理位置信息1.0")
    public JSONObject driverLocationUpload1(String userLocationMessage, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userLocationMessage", userLocationMessage);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.location.upload");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过司机用户编码查询司机信息,此接口仅限企业使用1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过司机用户编码查询司机信息,此接口仅限企业使用1.0")
    public JSONObject driverQuery1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过关键字查询司机信息(姓名，手机号，车牌号)1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过关键字查询司机信息(姓名，手机号，车牌号)1.0")
    public JSONObject driverQueryBykeyword1(String keyWord, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyWord", keyWord);//关键字
        map.put("start", start);//从哪一页开始
        map.put("limit", limit);//一页包含的信息数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.bykeyword");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询认证信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询认证信息1.0")
    public JSONObject driverQueryCertify1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.certify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().close().getReturnJsonObject();
    }

    /**
     * 查询认证信息版本2.02.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询认证信息版本2.02.0")
    public JSONObject driverQueryCertify2(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.certify");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 认证信息判断查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("认证信息判断查询1.0")
    public JSONObject driverQueryCertifyValidate1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.certify.validate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询企业认证和车辆列表2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询企业认证和车辆列表2.0")
    public JSONObject driverQueryCertifyVehiclelist2(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.certify.vehiclelist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询企业认证和车辆列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询企业认证和车辆列表1.0")
    public JSONObject driverQueryCertifyVehiclelist1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.certify.vehiclelist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询车辆列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询车辆列表1.0")
    public JSONObject driverQueryVehiclelist1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.query.vehiclelist");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 根据地区查找司机1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("根据地区查找司机1.0")
    public JSONObject driverQuerybyregion1(String regioncode, String usertype, String begintime, String endtime, String lengthcodes, String constructcodes, String targetcodes, String certifystate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("regioncode", regioncode);//地区编码
        map.put("usertype", usertype);//用户类型
        map.put("begintime", begintime);//开始时间
        map.put("endtime", endtime);//结束时间
        map.put("lengthcodes", lengthcodes);//长度编码
        map.put("constructcodes", constructcodes);//货箱结构编码
        map.put("targetcodes", targetcodes);//目标编码
        map.put("certifystate", certifystate);//认证状态
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机查询司机信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机查询司机信息1.0")
    public JSONObject driverQueryfordriver1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.queryfordriver");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改车辆认证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改车辆认证1.0")
    public JSONObject driverUpdateCertifyVehicle1(String id, String plateNumber, String length, String construct, String runLincence, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆id,唯一标识,添加车辆的时候不传,更改车辆信息的时候要传
        map.put("plateNumber", plateNumber);//车牌号
        map.put("length", length);//车长
        map.put("construct", construct);//货箱结构
        map.put("runLincence", runLincence);//行驶证
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.update.certify.vehicle");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改常用车辆，以及四张图片1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改常用车辆，以及四张图片1.0")
    public JSONObject driverUpdateVehicle1(String id, String common, String image1, String image2, String image3, String image4, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);//车辆唯一标识
        map.put("common", common);//根据此字段来判断是否进行更改常用车辆,传true或者false都可以
        map.put("image1", image1);//第一张图片
        map.put("image2", image2);//第二张图片
        map.put("image3", image3);//第三张图片
        map.put("image4", image4);//第四张图片
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.update.vehicle");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 车辆信息查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("车辆信息查询1.0")
    public JSONObject driverVehicleQuery1(String vehicleid, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("vehicleid", vehicleid);//车辆id
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 通过车牌号查询车辆信息1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("通过车牌号查询车辆信息1.0")
    public JSONObject driverVehicleQueryByplatenumber1(String platenumber, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("platenumber", platenumber);//车牌号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "driver.vehicle.query.byplatenumber");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询企ETC网点列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询企ETC网点列表1.0")
    public JSONObject etcBusinessSiteQuery1(String longitude, String latitude, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页显示多少数据
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.business.site.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * ETC挂失申请1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("ETC挂失申请1.0")
    public JSONObject etcLossApply1(String etcCardNum, String plateNum, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("etcCardNum", etcCardNum);//ETC卡号
        map.put("plateNum", plateNum);//车牌号
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.loss.apply");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 用户etc车辆列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("用户etc车辆列表1.0")
    public JSONObject etcVehicleQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "etc.vehicle.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油站站点查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油站站点查询1.0")
    public JSONObject gasStationSiteQuery1(String longitude, String latitude, String start, String limit, String gasstationtype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页显示多少数据
        map.put("gasstationtype", gasstationtype);//站点类型 1 加油站 2 加气站
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "gas.station.site.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 群组成员筛选接口1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("群组成员筛选接口1.0")
    public JSONObject groupMemberQuerybyregion1(String regioncode, String usertype, String begintime, String endtime, String lengthcodes, String constructcodes, String targetcodes, String certifystate, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//地区编码
        map.put("usertype", usertype);//用户类型
        map.put("begintime", begintime);//开始时间
        map.put("endtime", endtime);//结束时间
        map.put("lengthcodes", lengthcodes);//长度编码
        map.put("constructcodes", constructcodes);//货箱结构编码
        map.put("targetcodes", targetcodes);//目标编码
        map.put("certifystate", certifystate);//认证状态
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.querybyregion");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 联系人查询列表接口1.0
     * 20190528 100298
     *
     * @return response
     * @throws Exception
     */
    @Step("联系人查询列表接口1.0")
    public JSONObject groupMemberQuery1(String keyWord, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyWord", keyWord);//关键字
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 群组成员查询接口1.0
     * 20190528 0954892
     *
     * @return response
     * @throws Exception
     */
    @Step("群组成员查询接口1.0")
    public JSONObject groupRosterMemberQuery1(String rosterCode, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rosterCode", rosterCode);//群组编码
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.member.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机圈子查询接口1.0
     * 20190528 1004222
     *
     * @return response
     * @throws Exception
     */
    @Step("司机圈子查询接口1.0")
    public JSONObject groupJoinerQuery1(String keyWord, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyWord", keyWord);//关键字
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.joiner.query");//接口路径
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
     * 添加群组分组成员1.0
     * 20190528 0955237
     *
     * @return response
     * @throws Exception
     */
    @Step("添加群组分组成员1.0")
    public JSONObject groupRosterMemberAdd1(String fromRosterCode, String userCodes, String rosterCodes, String memo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromRosterCode", fromRosterCode);//上级群组名称
        map.put("userCodes", userCodes);//用户编码
        map.put("rosterCodes", rosterCodes);//群组编码
        map.put("memo", memo);//备注
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.member.add");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 删除群组分组成员1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("删除群组分组成员1.0")
    public JSONObject groupRosterMemberRemove1(String usercodes, String rostercodes, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercodes", usercodes);//用户编码
        map.put("rostercodes", rostercodes);//群组编码
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.member.remove");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询车队列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询车队列表1.0")
    public JSONObject groupRosterQuery1(String rostertype, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rostertype", rostertype);//群组类型
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 修改群组分组1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("修改群组分组1.0")
    public JSONObject groupRosterUpdate1(String rostercode, String rostername, String rosterlogo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rostercode", rostercode);//群组编码
        map.put("rostername", rostername);//群组名称
        map.put("rosterlogo", rosterlogo);//群组图标
        map.put("session", session);
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.update");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度通过关键字搜索周边配货圈1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("调度通过关键字搜索周边配货圈1.0")
    public JSONObject groupSearch4ddbykeyword1(String keyword, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.search.4DDbykeyword");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 调度通过经纬度搜索周边配货圈1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("调度通过经纬度搜索周边配货圈1.0")
    public JSONObject groupSearch4ddbyloc1(String longitude, String latitude, String geoType, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("geoType", geoType);//地理类型
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.search.4DDbyloc");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机通过关键字搜索周边配货圈1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机通过关键字搜索周边配货圈1.0")
    public JSONObject groupSearch4sjbykeyword1(String keyword, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyword", keyword);//关键字
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.search.4SJbykeyword");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 司机通过经纬度搜索周边配货圈1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("司机通过经纬度搜索周边配货圈1.0")
    public JSONObject groupSearch4sjbyloc1(String longitude, String latitude, String geoType, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("longitude", longitude);//经度
        map.put("latitude", latitude);//纬度
        map.put("geoType", geoType);//地理类型
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.search.4SJbyloc");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油费计算——先确定金额，再加油1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("油费计算——先确定金额，再加油1.0")
    public JSONObject oilgasCalculateOilaftermoney1(String money, String goodsSkuId, String storeId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//金额,单位元，精度两位小数，例如，12.45
        map.put("goodsSkuId", goodsSkuId);//商品SKU的id
        map.put("storeId", storeId);//站点id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.calculate.oilaftermoney");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 油费计算——先加油，后确定金额1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("油费计算——先加油，后确定金额1.0")
    public JSONObject oilgasCalculateOilbeforemoney1(String money, String goodsSkuId, String storeId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("money", money);//金额,单位元，精度两位小数，例如，12.45
        map.put("goodsSkuId", goodsSkuId);//商品SKU的id
        map.put("storeId", storeId);//站点id
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.calculate.oilbeforemoney");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111司机消费计算2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111司机消费计算2.0")
    public JSONObject oilgasDrverbuyCalcute2(String storeid, String goodscode, String paymoney, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//session
        map.put("storeid", storeid);//站点id
        map.put("goodscode", goodscode);//商品编码
        map.put("paymoney", paymoney);//支付金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.drverbuy.calcute");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111司机消费计算1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111司机消费计算1.0")
    public JSONObject oilgasDrverbuyCalcute1(String storeid, String goodscode, String paymoney, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//session
        map.put("storeid", storeid);//站点id
        map.put("goodscode", goodscode);//商品编码
        map.put("paymoney", paymoney);//支付金额
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.drverbuy.calcute");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111获取油气品类列表及司机最后加油类型1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111获取油气品类列表及司机最后加油类型1.0")
    public JSONObject oilgasGoodsSimpleQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.goods.simple.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111司机获取该加油站最近消费油品及油品列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111司机获取该加油站最近消费油品及油品列表1.0")
    public JSONObject oilgasLatestGoodsQuery1(String storeId, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//店铺id
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.latest.goods.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111司机获取最近加油车辆1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111司机获取最近加油车辆1.0")
    public JSONObject oilgasLatestVehilceQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.latest.vehilce.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111地图加油站点列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111地图加油站点列表查询1.0")
    public JSONObject oilgasMapStoreQuery1(String lan, String goodscode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lon", "114.429231");//经度
        map.put("lan", lan);//纬度
        map.put("goodscode", goodscode);//商品编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.map.store.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油订单取消功能1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油订单取消功能1.0")
    public JSONObject oilgasOrderCancel1(String orderNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.cancel");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 创建加油订单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("创建加油订单1.0")
    public JSONObject oilgasOrderCreate1(String storeId, String goodsSkuId, String payMoney, String storePayType, String vehicleid, String paltenumber, String workerid, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//店铺id
        map.put("goodsSkuId", goodsSkuId);//商品SKU的id
        map.put("payMoney", payMoney);//付款输入值，可以是金额也可以是数量,金额需扩大1万倍
        map.put("storePayType", storePayType);//付款类型，0：金额，1：数量
        map.put("vehicleid", vehicleid);//车辆id
        map.put("paltenumber", paltenumber);//车牌号
        map.put("workerid", workerid);//站点工作人员唯一编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.create");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油订单删除功能1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油订单删除功能1.0")
    public JSONObject oilgasOrderDel1(String orderNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.del");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111订单详情2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111订单详情2.0")
    public JSONObject oilgasOrderDetail2(String orderNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111订单详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111订单详情1.0")
    public JSONObject oilgasOrderDetail1(String orderNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.detail");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油订单列表查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油订单列表查询1.0")
    public JSONObject oilgasOrderListQuery1(String queryTime, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("queryTime", queryTime);//查询时间, 若不传入该参数，则按当月查询。格式“yyyyMM”，比如“201806”
        map.put("start", start);//查询起始位置
        map.put("limit", limit);//查询限制
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111支付买油1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111支付买油1.0")
    public JSONObject oilgasOrderPay1(String storeId, String goodsSkuId, String payToken, String payWay, String payMoney, String payMentString, String openid, String bankNo, String vehicleid, String paltenumber, String redirectUrl, String workerid) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//店铺id
        map.put("goodsSkuId", goodsSkuId);//商品SKU的id
        map.put("payToken", payToken);//支付token
        map.put("payWay", payWay);//支付方式，1：油卡，2：余额，3：支付宝，4：微信，5：微信h5, 6银联（易宝） 8 燃油白条
        map.put("payMoney", payMoney);//付款金额
        map.put("payMentString", payMentString);//支付计算返回串
        map.put("openid", openid);//微信openid 微信h5使用
        map.put("bankNo", bankNo);//易宝支付银行卡号
        map.put("vehicleid", vehicleid);//车辆id
        map.put("paltenumber", paltenumber);//车牌号
        map.put("redirectUrl", redirectUrl);//
        map.put("workerid", workerid);//站点工作人员唯一编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.pay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油订单支付2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油订单支付2.0")
    public JSONObject oilgasOrderPay2(String payToken, String payWay, String payMentString, String openid, String bankNo, String redirectUrl, String orderNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("payToken", payToken);//支付token
        map.put("payWay", payWay);//支付方式，1：油卡，2：余额，3：支付宝，4：微信，5：微信h5, 6银联（易宝） 8 燃油白条
        map.put("payMentString", payMentString);//支付计算返回串
        map.put("openid", openid);//微信openid 微信h5使用
        map.put("bankNo", bankNo);//易宝支付银行卡号
        map.put("redirectUrl", redirectUrl);//
        map.put("orderNo", orderNo);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.pay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 支付买油结果通知1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("支付买油结果通知1.0")
    public JSONObject oilgasOrderPaynotice1(String payNo, String sjbStockOrder, String ret) {
        HashMap<String, String> map = new HashMap<>();
        map.put("payNo", payNo);//金融单号
        map.put("sjbStockOrder", sjbStockOrder);//司机宝订单号
        map.put("ret", ret);//0 失败 1成功
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.paynotice");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 钱包支付密码验证1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("钱包支付密码验证1.0")
    public JSONObject oilgasOrderPaypasswordValidate1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//session
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.paypassword.validate");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油订单进支付页面1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油订单进支付页面1.0")
    public JSONObject oilgasOrderToDopay1(String orderNo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);//订单编号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.order.to.dopay");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111二维码类型识别1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111二维码类型识别1.0")
    public JSONObject oilgasQrkonwByqrstr1(String qrStr, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qrStr", qrStr);//二维码字符串
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.qrkonw.byqrstr");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油(气)站详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油(气)站详情1.0")
    public JSONObject oilgasStationDetailbyqrstr1(String qrStr, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qrStr", qrStr);//二维码字符串
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.station.detailbyqrstr");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111新版加油(气)站详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111新版加油(气)站详情1.0")
    public JSONObject oilgasStationDetailbyqrstrNew1(String qrStr, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qrStr", qrStr);//二维码字符串
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.station.detailbyqrstr.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111新版加油(气)站详情2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111新版加油(气)站详情2.0")
    public JSONObject oilgasStationDetailbyqrstrNew2(String qrStr, String biztype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qrStr", qrStr);//二维码字符串
        map.put("biztype", biztype);//二维码类型 1站点 2站点工作人员
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.station.detailbyqrstr.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油(气)站详情1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油(气)站详情1.0")
    public JSONObject oilgasStationDetailbystoreid1(String storeId, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//店铺id
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.station.detailbystoreid");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111新版加油(气)站详情查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111新版加油(气)站详情查询1.0")
    public JSONObject oilgasStationDetailbystoreidNew1(String storeId, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("storeId", storeId);//店铺id
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.station.detailbystoreid.new");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 加油(气)站列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("加油(气)站列表1.0")
    public JSONObject oilgasStationList1(String serviceType, String start, String limit) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lon", "114.429231");//经度
        map.put("lat", "30.460185");//纬度
        map.put("serviceType", serviceType);//服务类型 1:油 2:气 3:油和气
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.station.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 20180111获取加油站列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("20180111获取加油站列表1.0")
    public JSONObject oilgasStoreListQuery1(String lan, String goodscode, String sorttype, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lon", "114.429231");//经度
        map.put("lan", lan);//纬度
        map.put("goodscode", goodscode);//商品代号
        map.put("sorttype", sorttype);//排序类型 1按距离 2按价格
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "oilgas.store.list.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询中奖结果,app1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询中奖结果,app1.0")
    public JSONObject promotionAwardQueryForApp1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.award.query.for.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询中奖结果,h51.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询中奖结果,h51.0")
    public JSONObject promotionAwardQueryForH51(String userMobile) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userMobile", userMobile);//手机号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.award.query.for.h5");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 获取用户数据1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("获取用户数据1.0")
    public JSONObject promotionQueryForApp1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.query.for.app");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 获取用户数据,h51.0
     *
     * @return response
     * @throws Exception
     */
    @Step("获取用户数据,h51.0")
    public JSONObject promotionQueryForH51(String userMobile) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userMobile", userMobile);//手机号
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "promotion.query.for.h5");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 启动页广告1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("启动页广告1.0")
    public JSONObject queryAd1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.ad");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 横幅查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("横幅查询1.0")
    public JSONObject queryBanner1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.banner");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询企业货源二维码1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询企业货源二维码1.0")
    public JSONObject queryCompanyStockQr1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.company.stock.qr");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        map.put("session", session);//系统框架参数

        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        System.out.println(map.toString());
        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，删除记录1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，删除记录1.0")
    public JSONObject queryHisMobileDel1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.his.mobile.del");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，记录列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，记录列表1.0")
    public JSONObject queryHisMobileList1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.his.mobile.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，加油订单列表1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，加油订单列表1.0")
    public JSONObject queryOrderList1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "query.order.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询图片前缀1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询图片前缀1.0")
    public JSONObject siteUrlQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "site.url.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 移动端，店铺列表2.0
     *
     * @return response
     * @throws Exception
     */
    @Step("移动端，店铺列表2.0")
    public JSONObject storeMobileList2(String lan, String goodscode, String sorttype, String start, String limit, String storeName, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lon", "114.429231");//经度
        map.put("lan", lan);//纬度
        map.put("goodscode", goodscode);//商品代号
        map.put("sorttype", sorttype);//排序类型 1按距离 2按价格
        map.put("start", start);//
        map.put("limit", limit);//
        map.put("storeName", storeName);//店铺名称关键字
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "store.mobile.list");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "2.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 更新账单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("更新账单1.0")
    public JSONObject userBillUpload1(String holdercode, String geoType, String address, String billType, String memo, String path, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("holdercode", holdercode);//对方管理员或者成员的usercode
        map.put("lat", "30.460185");//纬度
        map.put("lon", "114.429231");//经度
        map.put("geoType", geoType);//经纬度坐标值
        map.put("address", address);//地址
        map.put("billType", billType);//账单类型
        map.put("memo", memo);//单据备注
        map.put("path", path);//来源
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.bill.upload");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查詢我发给司机的账单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查詢我发给司机的账单1.0")
    public JSONObject userBillsQueryfromme1(String groupCode, String beginTime, String endTime, String billType, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupCode", groupCode);//群组编码
        map.put("beginTime", beginTime);//开始时间
        map.put("endTime", endTime);//结束时间
        map.put("billType", billType);//账单类型
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.bills.queryfromme");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询调度发给我的账单1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询调度发给我的账单1.0")
    public JSONObject userBillsQuerytome1(String fromCode, String beginTime, String endTime, String billType, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromCode", fromCode);//司机的用户编码
        map.put("beginTime", beginTime);//开始时间
        map.put("endTime", endTime);//结束时间
        map.put("billType", billType);//账单类型
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.bills.querytome");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 查询用户各种数字1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("查询用户各种数字1.0")
    public JSONObject userInformationQuery1(String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.information.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 未知用户的查询1.0
     *
     * @return response
     * @throws Exception
     */
    @Step("未知用户的查询1.0")
    public JSONObject userQuery1(String usercode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("usercode", usercode);//用户编码
        map.put("session", session);//系统框架参数
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "user.query");//接口路径
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);

        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 运单评论
     *
     * @param wordcontent
     * @param commenttype
     * @param grade
     * @param targetcode
     * @param commentitscode
     * @param session
     * @return
     */
    public JSONObject commentCreate1(String wordcontent, String itskind, String imageUrl, String commenttype, String grade, String targetcode, String commentitscode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("session", session);
        map.put("appcode", appcode);
        map.put("v", "1.0");
        map.put("images", imageUrl);
        map.put("wordcontent", wordcontent);//评论内容
        map.put("itskind", itskind);//这条评论的类型
        map.put("method", "comment.create");
        map.put("commenttype", commenttype);//评论类型
        map.put("grade", grade);//星级
        map.put("commentitscode", commentitscode);//运单ID
        map.put("targetcode", targetcode);//运单ID
        map.put("format", "json");
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        //签名
        String signValue = SignUtil.getSign(map, ignoreParamNames, appcode);
        map.put("sign", signValue);
        return new BaseCall(url, "GET").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }

    /**
     * 触发任务
     * @param orderNumber
     * @param sessionID2
     * @return
     */
    public JSONObject orderSchedule(String orderNumber, String sessionID2) {
        //执行调度服务确认司机
        String data = String.format("{\"orderNumber\":\"%s\",\"appcode\":\"%s\",\"session\":\"%s\"}", orderNumber, appcode, sessionID2);
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=utf-8");
        headers.put("deviceCode", "AND-8e27483b0c1d26e3");
        headers.put("model", "Redmi Note 2");
        headers.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 5.0.2; Redmi Note 2 MIUI/7.9.21)");
        headers.put("system", "android");
        headers.put("latitude", "30454796");
        headers.put("longitude", "114420930");
        headers.put("screen", "1080*1920");
        headers.put("version", "44900");
        return new BaseCall("http://sjb-servicetest.sijibao.com/sjbServer2/assureOrder/orderSchedule", "POST").addHeaders(headers).setData(data).callService().close().getReturnJsonObject();
    }

    /**
     * 货运单点评
     *
     * @param cmpnyCode
     * @param cmpnyName
     * @param stockCode
     * @param session
     * @return
     */
    public JSONObject info_report(String cmpnyCode, String cmpnyName, String stockCode, String session) {
        JSONObject data = new JSONObject();
        data.fluentPut("cmpnyCode", cmpnyCode).fluentPut("cmpnyName", cmpnyName).fluentPut("memo", "非常棒的货源").fluentPut("reasonMemos", "货源信息属实,未来还想合作").fluentPut("reasonTypes", "0,3").fluentPut("stockCode", stockCode).fluentPut("grade", "0").fluentPut("stockGrade", "5").fluentPut("appcode", "100004").fluentPut("session", session);

        return new BaseCall("http://sjb-servicetest.sijibao.com/sjbServer2/goodsInfo/info_report", "POST").addHeaders(getHeaders()).setData(data.toString()).callService().close().getReturnJsonObject();
    }

    private HashMap<String, Object> getHeaders() {
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=utf-8");
        headers.put("deviceCode", "AND-8e27483b0c1d26e3");
        headers.put("model", "Redmi Note 2");
        headers.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 5.0.2; Redmi Note 2 MIUI/7.9.21)");
        headers.put("system", "android");
        headers.put("latitude", "30454796");
        headers.put("longitude", "114420930");
        headers.put("screen", "1080*1920");
        headers.put("version", "44900");
        return headers;
    }

    /**
     * 货源状态修改
     *
     * @param stockcodes 以,分割
     * @param operate    0关闭 1删除
     * @param session
     * @return
     */
    public JSONObject delStock(JSONArray stockcodes, String operate, String session) {
        HashMap<String, String> data = new HashMap<>();
        data.put("stockcodes", stockcodes.toString());
        data.put("operate", operate);//0 关闭 ，1 删除
        data.put("appcode", "100094");
        data.put("session", session);

        return new BaseCall("http://sjb-servicetest.sijibao.com/sjbServer2/goodsInfo/info_goodsOperateBatch", "POST").addHeaders(getHeaders()).setData(data.toString()).callService().close().getReturnJsonObject();
    }

    /**
     * 创建群组分组1.0
     * 20190528 0937859
     *
     * @return response
     * @throws Exception
     */
    @Step("创建群组分组1.0")
    public JSONObject groupRosterCreate1(String rosterName, String rosterLogo, String rostertype, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rosterName", rosterName);//群组名称
        map.put("rosterLogo", rosterLogo);//群组图标
        map.put("groupCode", rostertype);//群组类型
        map.put("appcode", appcode);//应用程序编码
        map.put("session", session);
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
     * 删除群组分组1.0
     * 20190528 0939118
     *
     * @return response
     * @throws Exception
     */
    @Step("删除群组分组1.0")
    public JSONObject groupRosterDelete1(String rosterCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rosterCode", rosterCode);//群组编码
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.roster.delete");//接口路径
        map.put("session", session);
        map.put("format", "json");//数据交互格式
        map.put("v", "1.0");//接口版本
        //忽略签名的字段
        List<String> ignoreParamNames = new ArrayList<>();
        return new BaseCall(url, "POST").setData(map).addDefHeader().callService().close().getReturnJsonObject();
    }


    public static void main(String[] args) {
        String data = "{\"orderNumber\":\"1901041013280010\",\"appcode\":\"100004\",\"session\":\"de991b7353a14fcb899472c6b3bd8c0a\"}";
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=utf-8");
        headers.put("deviceCode", "AND-8e27483b0c1d26e3");
        headers.put("model", "Redmi Note 2");
        headers.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 5.0.2; Redmi Note 2 MIUI/7.9.21)");
        headers.put("system", "android");
        headers.put("latitude", "30454796");
        headers.put("longitude", "114420930");
        headers.put("screen", "1080*1920");
        headers.put("version", "44900");

        //new HttpsUtils().post("http://sjb-servicetest.sijibao.com/sjbServer2/assureOrder/orderSchedule", headers, data).getResponseAsJsonObject();
    }


    /**
     * 添加/修改/删除成员接口1.0
     * 20190529 1043381
     *
     * @return response
     * @throws Exception
     */
    @Step("添加/修改/删除成员接口1.0")
    public JSONObject groupUpdateMember1(String groupCode, String groupCodes, String userCode, String memberNameSpell, String operationType, String memberState, String memberMemo, String holderCode, String companyCode, String memo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupCode", groupCode);//群组编号
        map.put("groupCodes", groupCodes);//群组编号
        map.put("userCode", userCode);//用户编码
        map.put("memberNameSpell", memberNameSpell);//用户拼音
        map.put("operationType", operationType);//操作类型 1.添加 2.修改 3.删除
        map.put("memberState", memberState);//好友状态 1.同意 2.拒绝
        map.put("memberMemo", memberMemo);//好友备注
        map.put("holderCode", holderCode);//holderCode
        map.put("companyCode", companyCode);//companyCode
        map.put("memo", memo);//验证消息
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.update.member");//接口路径
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
     * 联系人状态查询1.0
     * 20190529 1115917
     *
     * @return response
     * @throws Exception
     */
    @Step("联系人状态查询1.0")
    public JSONObject groupMemberStatequery1(String groupCode, String userCode, String companyCode, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupCode", groupCode);//群组编号
        map.put("userCode", userCode);//用户编码
        map.put("companyCode", companyCode);//companyCode
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.member.stateQuery");//接口路径
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
     * 通过/拒绝申请接口1.0
     * 20190529 1157162
     *
     * @return response
     * @throws Exception
     */
    @Step("通过/拒绝申请接口1.0")
    public JSONObject memberUpdateGroup1(String groupCode, String groupCodes, String userCode, String memberNameSpell, String operationType, String memberState, String memberMemo, String holderCode, String companyCode, String memo, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupCode", groupCode);//群组编号
        map.put("groupCodes", groupCodes);//群组编号
        map.put("userCode", userCode);//用户编码
        map.put("memberNameSpell", memberNameSpell);//用户拼音
        map.put("operationType", operationType);//操作类型 1.添加 2.修改 3.删除
        map.put("memberState", memberState);//好友状态 1.同意 2.拒绝
        map.put("memberMemo", memberMemo);//好友备注
        map.put("holderCode", holderCode);//holderCode
        map.put("companyCode", companyCode);//companyCode
        map.put("memo", memo);//验证消息
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "member.update.group");//接口路径
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
     * 待审核好友申请记录1.0
     * 20190529 1159935
     *
     * @return response
     * @throws Exception
     */
    @Step("待审核好友申请记录1.0")
    public JSONObject groupAuditedList1(String regioncode, String usertype, String begintime, String endtime, String lengthcodes, String constructcodes, String targetcodes, String certifystate, String start, String limit, String session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("regioncode", regioncode);//地区编码
        map.put("usertype", usertype);//用户类型
        map.put("begintime", begintime);//开始时间
        map.put("endtime", endtime);//结束时间
        map.put("lengthcodes", lengthcodes);//长度编码
        map.put("constructcodes", constructcodes);//货箱结构编码
        map.put("targetcodes", targetcodes);//目标编码
        map.put("certifystate", certifystate);//认证状态
        map.put("start", start);//从第几页开始
        map.put("limit", limit);//每页包含的数据数量
        map.put("appcode", appcode);//应用程序编码
        map.put("method", "group.audited.list");//接口路径
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
}
