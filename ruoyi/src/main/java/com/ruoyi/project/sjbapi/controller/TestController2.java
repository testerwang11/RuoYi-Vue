package com.ruoyi.project.sjbapi.controller;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.web.domain.AjaxResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController2 {

    @PostMapping("/add")
    public AjaxResult regCompany(@RequestBody JSONObject request) {
        try {
            int data = request.getInteger("a") + request.getInteger("b");
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }
}
