package com.ruoyi.project.sjbapi.controller;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.sjbapi.util.MlsSign;
import com.ruoyi.project.sjbapi.util.PaySign;
import com.ruoyi.project.sjbapi.util.PaySignUtils;
import com.ruoyi.project.sjbapi.util.SjbNoCarSign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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
