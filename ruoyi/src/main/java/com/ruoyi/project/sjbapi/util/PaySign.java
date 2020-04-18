package com.ruoyi.project.sjbapi.util;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaySign {
    private static final Logger log = LoggerFactory.getLogger(PaySign.class);

    private static final String url_prefix = "http://payapitest.sijibao.com";

    private static final String privateKey = "3F028E5B8A0978C94737D7FD16D21EB5";

    private static final String getsubmittoken_reqUrl = "http://payapitest.sijibao.com/paytrade/getsubmittoken";

    public static String getSubmitToken(String merchantNo, String signType) {
        JSONObject data = new JSONObject();
        data.put("merchantNo", merchantNo);
        data.put("signType", signType);
        data.put("sign", PaySignUtils.genSignByJson(signType, privateKey, data));
        String res = HttpUtil.post(getsubmittoken_reqUrl, data.toJSONString());
        return JSONObject.parseObject(res).getString("data");
    }

    public static String signByJson(JSONObject req) {
        try{
            JSONArray paramValues = req.getJSONArray("paramValues");
            JSONObject param = paramValues.getJSONObject(0);
            String token = getSubmitToken(param.getString("merchantNo"), param.getString("signType").toUpperCase());
            param.put("token", token);
            param.put("sign", PaySignUtils.genSignByJson(param.getString("signType").toUpperCase(), privateKey, param));
            paramValues.fluentClear().add(0, param);
            req.replace("paramValues", paramValues);
        }catch (Exception e){
            String token = getSubmitToken(req.getString("merchantNo"), req.getString("signType").toUpperCase());
            req.put("token", token);
            req.put("sign", PaySignUtils.genSignByJson(req.getString("signType").toUpperCase(), privateKey, req));
        }
        return req.toString();
    }

    public static String signByBean(JSONObject req) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        JSONArray paramValues = req.getJSONArray("paramValues");
        JSONObject param = paramValues.getJSONObject(0);

        String beanPath = req.getJSONArray("paramTypes").getString(0);
        String token = getSubmitToken(param.getString("merchantNo"), param.getString("signType").toUpperCase());

        param.put("token", token);
        Object bean = BeanUtil.fillBeanWithMapIgnoreCase(param, Class.forName(beanPath).newInstance(), false);
        param.put("sign", PaySignUtils.genSignByBean(param.getString("signType").toUpperCase(), privateKey, bean));

        paramValues.fluentClear().add(0, param);
        req.replace("paramValues", paramValues);
        return req.toString();
    }

    public static String signByJsonNoToken(JSONObject req) {
        req.put("sign", PaySignUtils.genSignByJson(req.getString("signType").toUpperCase(), privateKey, req));
        return req.toJSONString();
    }

    public static String test() {
        return "2";
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        /*String token = getSubmitToken("60881632108545", "MD5");
        ReceiptRequest receiptRequest = new ReceiptRequest();
        receiptRequest.setOrderNo(System.currentTimeMillis()+"");
        receiptRequest.setZipName("1232455");
        receiptRequest.setMerchantNo("60881632108545");
        receiptRequest.setSignType("MD5");
        List<ReceiptModel> list = new ArrayList<>();
        ReceiptModel receiptModel = new ReceiptModel();
        List<String> m = new ArrayList<>();
        m.add("123");
        receiptModel.setList(m);
        receiptModel.setPayType(1);
        receiptModel.setParentUrl("zhangsan");
        list.add(receiptModel);
        receiptRequest.setList(list);
        receiptRequest.setToken(token);
        receiptRequest.setSign(PaySignUtils.genSignByJson(receiptRequest.getSignType(), privateKey, receiptRequest));
        //String res = HttpUtil.post(getsubmittoken_reqUrl, receiptRequest.toString());
        String url = "http://192.168.0.196:8000/sijibao-userplatform-service/com.sijibao.pay.api.ReceiptApi?version=0.0.1";
        System.out.println("bean签名:"+JSON.toJSONString(receiptRequest));
        //String res = HttpUtil.post(url, req.toJSONString());
        //System.out.println(res);*/
        String data = "{\"orderNo\":\"1583551885972\",\"zipName\":\"1232455\",\"signType\":\"MD5\",\"list\":[{\"parentUrl\":\"zhangsan\",\"payType\":1,\"list\":[\"123\"]}],\"merchantNo\":\"60881632108545\"}";
        JSONObject data2 = JSONObject.parseObject(data);
        //System.out.println(data2);
        //System.out.println("json签名:"+sign(data2));

        //BeanUtil.fillBeanWithMapIgnoreCase(data2, Class.forName("com.sijibao.pay.request.ReceiptRequest").newInstance(), false);

        //System.out.println(signByBean(data2, "com.mangosteen.demo.ReceiptRequest"));

    }
}
