package com.ruoyi.project.sjbapi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.sjbapi.util.MlsSign;
import com.ruoyi.project.sjbapi.util.PaySign;
import com.ruoyi.project.sjbapi.util.SignUtil;
import com.ruoyi.project.sjbapi.util.SjbNoCarSign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@RestController
@RequestMapping("/sign")
public class SignController {
    private static final Logger log = LoggerFactory.getLogger(SignController.class);

    /**
     * 忽略passwd
     * @param request
     * @return
     */
    @PostMapping({"/nocar"})
    @ResponseBody
    public String nocar(@RequestBody String request) {
        return SjbNoCarSign.signByString(request);
    }

    /**
     * 不忽略password
     * @param request
     * @return
     */
    @PostMapping({"/nocar2"})
    @ResponseBody
    public String nocar2(@RequestBody String request) {
        return SjbNoCarSign.signByString2(request);
    }

    /**
     * 自定义忽略字段
     * @param request
     * @return
     */
    @PostMapping({"/nocar3"})
    @ResponseBody
    public String nocar3(@RequestBody JSONObject request) {
        return SjbNoCarSign.signByString3(request.getString("data"), request.getJSONArray("ignoreParamNames"));
    }

    /**
     * 无车网关签名
     * @param request
     * @return
     */
    @PostMapping({"/nocarapi"})
    @ResponseBody
    public AjaxResult nocarapi(@RequestBody JSONObject request) {
        log.info("请求参数:"+ request.toJSONString());
        String sign = SignUtil.getSignString(request.getLong("timeStamp"), request.getString("secretKey"), request.getString("path"), request.getString("version"));
        return AjaxResult.success("ok", sign);

    }

    /**
     * 网关签名 token+sign
     * @param request
     * @return
     */
    @PostMapping({"/pay"})
    @ResponseBody
    public String pay(@RequestBody JSONObject request) {
        return PaySign.signByJson(request);
    }

    /**
     * 网关签名 token+sign 保持传入得顺序
     * @param request
     * @return
     */
    @PostMapping({"/pay/byorder"})
    @ResponseBody
    public String pay(@RequestBody String request) {
        JSONObject retObj = new JSONObject(true);
        retObj = JSON.parseObject(request, Feature.OrderedField);
        return PaySign.signByJson(retObj);
    }


    /**
     * 网关签名 sign
     * @param request
     * @return
     */
    @PostMapping({"/pay2"})
    @ResponseBody
    public String pay2(@RequestBody JSONObject request) {
        return PaySign.signByJsonNoToken(request);
    }


    /**
     * 网关签名 sign
     * @param request
     * @return
     */
    @PostMapping({"/pay3"})
    @ResponseBody
    public String pay3(@RequestBody JSONObject request)  {
        try{
            return PaySign.signByBean(request);
        }catch (Exception e){
            log.error(e.getMessage());
            return PaySign.signByJson(request);
        }
    }


    /**
     * 煤联社加密
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping({"/mls"})
    @ResponseBody
    public String mls(@RequestBody String request) throws Exception {
        return MlsSign.encryptionByPublicKey(request);
    }

}
