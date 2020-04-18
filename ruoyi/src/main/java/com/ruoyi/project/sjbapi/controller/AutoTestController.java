package com.ruoyi.project.sjbapi.controller;

import com.alibaba.fastjson.JSONObject;
import com.jayway.jsonpath.JsonPath;
import com.ruoyi.common.utils.GetRequestJsonUtils;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.sjbapi.service.CommonService;
import com.ruoyi.project.sjbapi.service.CommonService2;
import com.ruoyi.project.sjbapi.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sjb")
public class AutoTestController {

    @Autowired
    public CommonService commonService;

    @Autowired
    public CommonService2 commonService2;

    @Autowired
    public FinancialService financialService;

    @GetMapping("/test")
    public String test() {
        return "test123";
    }

    /**
     * 注册企业
     *
     * @param request
     * @return
     */
    @PostMapping("/regCompany")
    public AjaxResult regCompany(@RequestBody JSONObject request) {
        //JSONObject req = GetRequestJsonUtils.getRequestJsonObject(request);
        try {
            JSONObject data = commonService.registerCompany(request.getString("enterpriseNature"), request.getString("controlFlag"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 注册司机
     *
     * @param request
     * @return
     */
    @PostMapping("/regDriver")
    public AjaxResult regDriver(@RequestBody JSONObject request) {
        //JSONObject req = GetRequestJsonUtils.getRequestJsonObject(request);
        try {
            JSONObject data = commonService.driverRegister(request.getString("phone"), request.getString("name"), request.getString("idCode"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 充值
     *
     * @param request
     * @return
     */
    @PostMapping("/recharge")
    public AjaxResult recharge(@RequestBody JSONObject request) {
        //JSONObject req = GetRequestJsonUtils.getRequestJsonObject(request);
        try {
            String data = financialService.maintain(request.getString("phone"), request.getString("userType"), request.getString("amount"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 取消订单
     *
     * @param request
     * @return
     */
    @PostMapping("/cancelOrder")
    public AjaxResult cancelOrder(@RequestBody JSONObject request) {
        //JSONObject req = GetRequestJsonUtils.getRequestJsonObject(request);
        try {
            String sql = String.format("UPDATE assure_orders set dynamic_state = '12' WHERE order_number = '%s'", request.getString("orderNo"));
            commonService.dbHelper.plateform_test.execute(sql);
            return AjaxResult.success("订单取消成功!" + request.getString("orderNo"));
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 取消订单(正常流程取消)
     *
     * @param request
     * @return
     */
    @PostMapping("/cancelOrder2")
    public AjaxResult cancelOrder2(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.cancelStockOrder(request.getString("orderNo"), request.getString("qy_s"), request.getString("sj_s"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 跑运单
     *
     * @param request
     * @return
     */
    @PostMapping("/makeOrder")
    public AjaxResult order(@RequestBody JSONObject request) {
        //JSONObject req = GetRequestJsonUtils.getRequestJsonObject(request);
        try {
            JSONObject data = commonService2.order4(request.getString("stockCode"), request.getString("agentCode"), request.getDouble("deficit"), request.getString("unitPrice"), request.getString("driverPhone"), request.getString("step"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 跑运单
     *
     * @param request
     * @return
     */
    @PostMapping("/makeOrder2")
    public AjaxResult order2(@RequestBody JSONObject request) {
        try {
            //企业登录
            JSONObject data1 = commonService2.accountService.accountCompanyLogin1(request.getString("company_phone"), request.getString("company_pwd"), "2", "true", "");
            String qy_s = JsonPath.parse(data1).read("$.user.sessionID");
            //司机登录
            JSONObject data2 = commonService2.accountService.accountLogin1(request.getString("driver_phone"), request.getString("driver_pwd"), "1", "true", "");
            String sj_s = JsonPath.parse(data2).read("$.sessionID");
            //收单员登录
            JSONObject data3 = commonService2.sjbToolService.webMobileLoginPassword1(request.getString("sdy_phone"), request.getString("sdy_pwd"), "", "");
            String sdy_s = JsonPath.parse(data3).read("$.session");
            JSONObject data = commonService2.order3(request.getString("stockCode"), request.getString("agentCode"), request.getString("payPwd"), request.getDouble("deficit"), request.getString("unitPrice"), qy_s, sj_s, sdy_s);
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 接单
     *
     * @param request
     * @return
     */
    @PostMapping("/createOrder")
    public AjaxResult createOrder(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.createOrder(request.getString("stockCode"), request.getString("agentCode"), request.getString("sj_s"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 确认司机
     *
     * @param request
     * @return
     */
    @PostMapping("/confirmDriver")
    public AjaxResult confirmDriver(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.confirmDriver(request.getString("stockCode"), request.getString("orderNo"), request.getString("qy_s"), request.getString("payPassword"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 装货签到
     *
     * @param request
     * @return
     */
    @PostMapping("/confirmLoading")
    public AjaxResult confirmLoading(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.confirmLoading(request.getString("orderNo"), request.getString("payPassword"), request.getString("qy_s"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 卸货签到
     *
     * @param request
     * @return
     */
    @PostMapping("/unloadingSign")
    public AjaxResult unloadingSign(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.unloadingSign(request.getString("orderNo"), request.getString("sj_s"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 签收
     *
     * @param request
     * @return
     */
    @PostMapping("/signIn")
    public AjaxResult signIn(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.signIn(request.getString("orderNo"), request.getDouble("unit"), request.getString("unitPrice"), request.getString("sdy_s"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }


    /**
     * 企业复核
     *
     * @param request
     * @return
     */
    @PostMapping("/companyOrderCheck")
    public AjaxResult companyOrderCheck(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.companyOrderCheck2(request.getString("orderNo"), request.getBoolean("passOrNo"), request.getString("payPassword"), request.getString("qy_s"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 企业还款
     *
     * @param request
     * @return
     */
    @PostMapping("/huankuan")
    public AjaxResult huankuan(@RequestBody JSONObject request) {
        try {
            JSONObject data = commonService2.huankuan(request.getString("phone"), request.getString("password"), request.getString("orderNo"), request.getString("payPassword"));
            return AjaxResult.success(data);
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    @PostMapping("/companyLogin")
    public AjaxResult companyLogin(@RequestBody JSONObject request) {
        JSONObject data = commonService2.accountService.accountCompanyLogin1(request.getString("phone"), request.getString("password"), "2", "true", "");
        return AjaxResult.success(data);
    }

    @PostMapping("/driverLogin")
    public AjaxResult driverLogin(@RequestBody JSONObject request) {
        JSONObject data = commonService2.accountService.accountLogin1(request.getString("phone"), request.getString("password"), "1", "true", "");
        return AjaxResult.success(data);
    }

    @PostMapping("/sdyLogin")
    public AjaxResult sdyLogin(@RequestBody JSONObject request) {
        JSONObject data = commonService2.sjbToolService.webMobileLoginPassword1(request.getString("phone"), request.getString("password"), "", "");
        return AjaxResult.success(data);
    }

}
