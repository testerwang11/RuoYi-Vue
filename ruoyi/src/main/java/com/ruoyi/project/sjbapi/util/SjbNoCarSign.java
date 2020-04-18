package com.ruoyi.project.sjbapi.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SjbNoCarSign {
    public static final String SHA1 = "SHA1";

    public static final int SHA1_LEN = 40;

    private static final String UTF_8 = "UTF-8";

    static HashMap<String, String> secrets = new HashMap<>();

    static {
        secrets.put("100002", "2dddc367e1f2452f853d15c43bbd8078");
        secrets.put("100004", "827acf2a001248bc8ae419aedb3045e6");
        secrets.put("100093", "c0e348969156477b82a70ad217b022ad");
        secrets.put("100094", "d5d907738f444eccb9e26c1e9f9bf295");
        secrets.put("200111", "3463e12aba3e4cb886f8ba917c1a8269");
        secrets.put("86600476", "d735df9a21148c8c4cb3db75e764ed8f");
        secrets.put("200102", "bfa4dcbe196f402a9c2349b4c30dfffd");
        secrets.put("100031", "30d24cf0c0ac4871b2da6e1e15a77267");
        secrets.put("100060", "d745ef6aec74432cab719bf704e3f39a");
        secrets.put("200337", "7d9ceb596ab64c5691eef844579dd2be");
        secrets.put("200340", "7d9ceb596ab64c5691eef844579dd2be");
        secrets.put("200344", "fb32f8d59c934d86af90e7dc9a8dde85");
    }

    public static String getSign(Map<String, String> paramMap, List<String> paramList, String paramString) {
        StringBuilder localStringBuilder = new StringBuilder();
        Object localObject = new ArrayList(paramMap.size());
        Iterator<Map.Entry<String, String>> localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext()) {
            Map.Entry localEntry = localIterator.next();
            if (localEntry.getValue() != null)
                ((List)localObject).add(localEntry.getKey());
        }
        if (paramList != null) {
            Iterator<String> iterator = paramList.iterator();
            while (iterator.hasNext())
                ((List)localObject).remove(iterator.next());
        }
        Collections.sort((List<Comparable>)localObject);
        localStringBuilder.append(paramString);
        Iterator<String> it = ((List<String>)localObject).iterator();
        while (it.hasNext()) {
            String a = it.next();
            if (paramMap.get(a) != null) {
                localStringBuilder.append(a);
                localStringBuilder.append(paramMap.get(paramList));
            }
        }
        localStringBuilder.append(paramString);
        return getHexString(Digest(localStringBuilder.toString())).toUpperCase();
    }

    public static String getSign(HashMap<String, String> paramValues, List<String> ignoreParamNames, String appcode) {
        StringBuilder sb = new StringBuilder();
        List<String> paramNames = new ArrayList<>(paramValues.size());
        Iterator<Map.Entry<String, String>> iterator = paramValues.entrySet().iterator();
        Map.Entry<String, String> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (entry.getValue() != null)
                paramNames.add(entry.getKey());
        }
        if (ignoreParamNames != null)
            for (String ignoreParamName : ignoreParamNames)
                paramNames.remove(ignoreParamName);
        Collections.sort(paramNames);
        sb.append(secrets.get(appcode));
        for (String paramName : paramNames) {
            if (paramValues.get(paramName) != null)
                sb.append(paramName).append(paramValues.get(paramName));
        }
        sb.append(secrets.get(appcode));
        byte[] sha1Digest = Digest(sb.toString());
        return getHexString(sha1Digest).toUpperCase();
    }

    public static byte[] Digest(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            return md.digest(data.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getHexString(byte[] bytes) {
        StringBuilder ret = new StringBuilder(bytes.length << 1);
        for (int i = 0; i < bytes.length; i++) {
            ret.append(Character.forDigit(bytes[i] >> 4 & 0xF, 16));
            ret.append(Character.forDigit(bytes[i] & 0xF, 16));
        }
        return ret.toString();
    }

    public static String signByString(String data) {
        if (data.endsWith("&"))
            data = data.substring(0, data.length() - 1);
        String[] tempData = data.split("&");
        HashMap<String, String> tempMap = new HashMap<>();
        for (int i = 0; i < tempData.length; i++) {
            String tempStr = tempData[i];
            if (tempStr.length() > 0 && !tempStr.endsWith("="))
                tempMap.put(tempStr.split("=")[0], tempStr.split("=")[1]);
        }
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        return getSign(tempMap, ignoreParamNames, tempMap.get("appcode"));
    }

    public static String signByString2(String data) {
        if (data.endsWith("&"))
            data = data.substring(0, data.length() - 1);
        String[] tempData = data.split("&");
        HashMap<String, String> tempMap = new HashMap<>();
        for (int i = 0; i < tempData.length; i++) {
            String tempStr = tempData[i];
            if (tempStr.length() > 0 && !tempStr.endsWith("="))
                tempMap.put(tempStr.split("=")[0], tempStr.split("=")[1]);
        }
        List<String> ignoreParamNames = new ArrayList<>();
        return getSign(tempMap, ignoreParamNames, tempMap.get("appcode"));
    }

    public static String signByString3(String data, JSONArray ignoreParamNames) {
        if (data.endsWith("&"))
            data = data.substring(0, data.length() - 1);
        String[] tempData = data.split("&");
        HashMap<String, String> tempMap = new HashMap<>();
        for (int i = 0; i < tempData.length; i++) {
            String tempStr = tempData[i];
            if (tempStr.length() > 0 && !tempStr.endsWith("="))
                tempMap.put(tempStr.split("=")[0], tempStr.split("=")[1]);
        }
        List<String> temp = JSONObject.parseArray(ignoreParamNames.toJSONString(), String.class);
        return getSign(tempMap, temp, tempMap.get("appcode"));
    }

    public static String test() {
        return "1";
    }

    public static void main(String[] args) {
        String a = signByString("method=orderview.search.forweb&v=1.0&format=json&appcode=100094&session=c7f010b745f84fe894d7358567c6108c&start=0&limit=10&begintime=1567590005000&endtime=1575366005000&keyword=1911&kind=2&intermediary=");
        System.out.println(a);
    }
}
