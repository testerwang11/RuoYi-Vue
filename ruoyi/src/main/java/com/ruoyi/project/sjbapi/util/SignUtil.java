package com.ruoyi.project.sjbapi.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.Map.Entry;

public class SignUtil {

    public final static String SHA1 = "SHA1";
    public final static int SHA1_LEN = 40;
    private static final String UTF_8 = "UTF-8";
    private static String env = System.getProperty("env", "test");
    static HashMap<String, String> secrets = new HashMap<>();

    static {
        secrets.put("100002", "2dddc367e1f2452f853d15c43bbd8078");//司机
        secrets.put("100004", "827acf2a001248bc8ae419aedb3045e6");
        secrets.put("100093", "c0e348969156477b82a70ad217b022ad");
        secrets.put("100094", "d5d907738f444eccb9e26c1e9f9bf295");
        secrets.put("200111", "3463e12aba3e4cb886f8ba917c1a8269");
        secrets.put("86600476", "d735df9a21148c8c4cb3db75e764ed8f");
        secrets.put("200102", "bfa4dcbe196f402a9c2349b4c30dfffd");
        secrets.put("100031", "30d24cf0c0ac4871b2da6e1e15a77267");
        secrets.put("100060", "d745ef6aec74432cab719bf704e3f39a");//企业
        secrets.put("200337", "7d9ceb596ab64c5691eef844579dd2be");//收单员
        secrets.put("200340", "7d9ceb596ab64c5691eef844579dd2be");//开票员
        secrets.put("200344", "fb32f8d59c934d86af90e7dc9a8dde85");//经纪人
    }


    public static String getSign(Map<String, String> paramMap, List<String> paramList, String paramString) {
        StringBuilder localStringBuilder = new StringBuilder();
        Object localObject = new ArrayList(paramMap.size());
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext()) {
            Map.Entry localEntry = (Map.Entry) localIterator.next();
            if (localEntry.getValue() != null) {
                ((List) localObject).add(localEntry.getKey());
            }
        }
        if (paramList != null) {

            Iterator<String> it = paramList.iterator();
            while (it.hasNext()) {
                ((List) localObject).remove((String) it.next());
            }
        }
        Collections.sort((List) localObject);
        localStringBuilder.append(paramString);
        Iterator<String> it = ((List) localObject).iterator();
        while (it.hasNext()) {
            String a = (String) it.next();
            if (paramMap.get(a) != null) {
                localStringBuilder.append(a);
                localStringBuilder.append((String) paramMap.get(paramList));
            }
        }
        localStringBuilder.append(paramString);
        return getHexString(Digest(localStringBuilder.toString())).toUpperCase();
    }

    public static String getSign(HashMap<String, String> paramValues, List<String> ignoreParamNames, String appcode) {
        StringBuilder sb = new StringBuilder();
        List<String> paramNames = new ArrayList<String>(paramValues.size());
        Iterator<Entry<String, String>> iterator = paramValues.entrySet().iterator();
        Entry<String, String> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (entry.getValue() != null)
                paramNames.add(entry.getKey());
        }
        if (ignoreParamNames != null) {
            for (String ignoreParamName : ignoreParamNames) {
                paramNames.remove(ignoreParamName);
            }
        }
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
            MessageDigest md = MessageDigest.getInstance(SHA1);
            return md.digest(data.getBytes(UTF_8));
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
            ret.append(Character.forDigit((bytes[i] >> 4) & 0xf, 16));
            ret.append(Character.forDigit(bytes[i] & 0xf, 16));
        }
        return ret.toString();
    }

    public static String signByString(String data, String appcode) {
        //data = "orderNumbers=1812261013280004&v=1.0&session=1c0e38d83d574d938c99dbd3ac6cd92b&appcode=100094&method=assureorder.ordercheck.batch.pass&payPassword=123456&format=json&";
        String[] tempData = data.split("&");
        HashMap<String, String> tempMap = new HashMap<>();
        String tempStr;
        for (int i = 0; i < tempData.length; i++) {
            tempStr = tempData[i];
            if (tempStr.length() > 0) {
                tempMap.put(tempStr.split("=")[0], tempStr.split("=")[1]);
            }
        }
        System.out.println(tempMap.toString());
        List<String> ignoreParamNames = new ArrayList<>();
        ignoreParamNames.add("password");
        return getSign(tempMap, ignoreParamNames, appcode);
    }

    //appcode=100060&method=account.login&format=xml&v=1.0&account=1354133412&password=123456&userType=1&deviceNum=123&force=true&sign=456
    public static void main(String[] args) {
        System.out.println(1);
    }

}

