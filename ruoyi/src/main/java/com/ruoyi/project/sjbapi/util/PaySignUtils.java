package com.ruoyi.project.sjbapi.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanMap;
import java.util.*;

public class PaySignUtils {

    private static final Logger log = LoggerFactory.getLogger(PaySignUtils.class);

    public static final String RSA = "RSA";

    public static final String MD5 = "MD5";

    /**
     * 验证签名
     * @param signType
     * @param signValue
     * @param req
     * @return
     */
    public static boolean verifySign(String signType, String signValue, Object req) {
        Map<String, Object> reqAllParamMap = beanToMd5MapString(req);
        String reqSign = String.valueOf(reqAllParamMap.get("sign"));
        if (StringUtils.isBlank(reqSign)) {
            return false;
        }
        if (signType.equalsIgnoreCase("md5")) {
            String newSign = genSignByBean(signType, signValue, req);
            if (newSign.equalsIgnoreCase(reqSign))
                return true;
        } else if (signType.equalsIgnoreCase("rsa")) {
            String data = genSourceWaitSignBean(signType, signValue, req);
            return RsaUtils.verify(data, signValue, reqSign);
        }
        return false;
    }

    /**
     *
     * @param signType
     * @param signValue
     * @param req
     * @return
     */
    public static String genSignByBean(String signType, String signValue, Object req) {
        log.info("req:" + req.toString());
        String waitSign = genSourceWaitSignBean(signType, signValue, req);
        log.info("waitSign:" + waitSign);
        System.out.println("waitSign:" + waitSign);
        if (!StringUtils.isBlank(waitSign))
            if (signType.equals(MD5)) {
                log.info("开始MD5加密");
                return SjbPayGwMd5.sign(waitSign, signValue, "UTF-8");
            } else if (signType.equals(RSA)) {
                log.info("开始RSA加密");
                return RsaUtils.sign(waitSign, signValue);
            } else {
                log.info("加密方式不支持");
            }
        return null;
    }

    public static String genSignByJson(String signType, String signValue, Object req) {
        log.info("req:" + req.toString());
        String waitSign = genSourceWaitSignJson(signType, signValue, req);
        log.info("waitSign:" + waitSign);
        System.out.println(" bean waitSign:" + waitSign);
        if (!StringUtils.isBlank(waitSign))
            if (signType.equals(MD5)) {
                log.info("开始MD5加密");
                return SjbPayGwMd5.sign(waitSign, signValue, "UTF-8");
            } else if (signType.equals(RSA)) {
                log.info("开始RSA加密");
                return RsaUtils.sign(waitSign, signValue);
            } else {
                log.info("加密方式不支持");
            }
        return null;
    }

    public static String genSourceWaitSignBean(String signType, String signValue, Object req) {
        if (null == req) {
            return null;
        }
        if (StringUtils.isBlank(signType) ||
                StringUtils.isBlank(signValue)) {
            return null;
        }
        Map<String, Object> reqAllParamMap = beanToMd5MapString(req);
        if (MD5.equals(signType) || RSA.equals(signType)) {
            Map<String, Object> waitSignMap = paraFilter(reqAllParamMap);
            String waitSign = createLinkString(waitSignMap);
            return waitSign;
        }
        return null;
    }

    public static String genSourceWaitSignJson(String signType, String signValue, Object req) {
        if (null == req) {
            return null;
        }
        if (StringUtils.isBlank(signType) ||
                StringUtils.isBlank(signValue)) {
            return null;
        }
        Map<String, Object> reqAllParamMap = beanToMd5MapStringJson(req);
        if (MD5.equals(signType) || RSA.equals(signType)) {
            Map<String, Object> waitSignMap = paraFilter(reqAllParamMap);
            String waitSign = createLinkString(waitSignMap);
            return waitSign;
        }
        return null;
    }

    public static <T> Map<String, Object> beanToMd5MapString(T bean) {
        Map<String, Object> map = new HashMap<>();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                if (null == beanMap.get(key))
                    continue;
                String value = String.valueOf(beanMap.get(key));
                if (value == null || value.trim().isEmpty())
                    continue;
                map.put(String.valueOf(key), value);
            }
        }
        return map;
    }

    /**
     * 将json对象转换为HashMap
     *
     * @param json
     * @return
     */
    public static Map<String, Object> parseJSON2Map(JSONObject json) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 最外层解析
        for (Object k : json.keySet()) {
            Object v = json.get(k);
            // 如果内层还是json数组的话，继续解析
            if (v instanceof JSONArray) {
                List list = new ArrayList<>();
                Iterator<Object> it = ((JSONArray) v).iterator();
                while (it.hasNext()) {
                    Object value = it.next();
                    if (value instanceof String) {
                        list.add(value);
                    } else {
                        list.add(parseJSON2Map((JSONObject) value));
                    }
                }
                map.put(k.toString(), list);
            } else if (v instanceof JSONObject) {
                // 如果内层是json对象的话，继续解析
                map.put(k.toString(), parseJSON2Map((JSONObject) v));
            } else {
                // 如果内层是普通对象的话，直接放入map中
                map.put(k.toString(), v);
            }
        }
        log.info("map:" + map);
        return map;
    }

    /**
     * 将json字符串转换为Map
     *
     * @param jsonStr
     * @return
     */
    public static Map<String, Object> parseJSONstr2Map(String jsonStr) {
        JSONObject json = JSONObject.parseObject(jsonStr);
        Map<String, Object> map = parseJSON2Map(json);
        return map;
    }

    public static <T> Map<String, Object> beanToMd5MapStringJson(T bean) {
        Map<String, Object> map = new HashMap<String, Object>();
        //map = (Map<String, Object>) JSON.parseObject(bean.toString(), HashMap.class);
        map = parseJSONstr2Map(bean.toString());
        return map;
    }

    private static Map<String, Object> paraFilter(Map<String, Object> sArray) {
        Map<String, Object> result = new HashMap<>();
        if (sArray == null || sArray.size() <= 0)
            return result;
        for (Map.Entry<String, Object> mapEntry : sArray.entrySet()) {
            Object value = mapEntry.getValue();
            String key = mapEntry.getKey();
            if (value == null || value.equals("") || key.equalsIgnoreCase("sign") || key
                    .equalsIgnoreCase("signType") || key.equalsIgnoreCase("mac")||key.equalsIgnoreCase("class"))
                continue;
            result.put(key, value);
        }
        return result;
    }

    private static String createLinkString(Map<String, Object> params) {
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = params.get(key);
            if (i == keys.size() - 1) {
                stringBuilder.append(key + "=" + value);
            } else {
                stringBuilder.append(key + "=" + value + "&");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
