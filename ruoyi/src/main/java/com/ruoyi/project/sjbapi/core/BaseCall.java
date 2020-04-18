package com.ruoyi.project.sjbapi.core;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/************************************************************************************
 * 基础Call类，实现HttpClient发送请求基础功能
 *
 * @File name : BaseCall.java
 ************************************************************************************/
public class BaseCall {
    public static Logger log = LoggerFactory.getLogger(BaseCall.class);

    protected CallClient client = null;

    /**
     * 新增用于记录cookie 的变量 cookie
     */
    protected String cookie = "";

    protected String url = null;

    protected String entityString = "";

    protected HttpEntity entity;

    protected String mode;


    /*public BaseCall() {

    }*/

    /**
     * 初始化接口
     *
     * @param modeType GET or POST or FILE or Delete or Put
     */
    public BaseCall(String host, String uri, String modeType) {
        this.mode = modeType;
        this.url = host + uri;
        if (client == null) {
            client = new CallClient(url, this.mode);
        }
    }

    public BaseCall(String url, String modeType) {
        this.mode = modeType;
        this.url = url;
        if (client == null) {
            client = new CallClient(url, this.mode);
        }
    }

    public BaseCall getNewCall() {
        client = new CallClient(url, this.mode);
        return this;
    }

    /**
     * 设置参数 请求String
     *
     * @param s String
     */
    public BaseCall setData(String s) {
        StringEntity se = new StringEntity(s, HTTP.UTF_8);
        this.entityString = s;
        this.entity = se;
        return this;
    }

    public BaseCall setData(Map<String, String> s) {
        List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();

        for (String key : s.keySet()) {
            if(s.get(key)!=null){
                nameValuePairList.add(new BasicNameValuePair(key, s.get(key)));
            }
        }
        UrlEncodedFormEntity formEntity = null;

        try {
            formEntity = new UrlEncodedFormEntity(nameValuePairList, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.entity = formEntity;
        return this;
    }

    /**
     * 发送请求
     *
     * @throws IOException
     * @throws ClientProtocolException
     */
    public BaseCall callService() {
        //client.setEntity(entityString);
        client.setEntity(entity);
        try {
            client.sendRequest();
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return this;
    }

    /**
     * 获取返回报文
     *
     * @return 返回报文
     */
    public String getReturnData() {
        return client.getResponseString();
    }

    /**
     * 获取返回的jsonobject
     *
     * @return
     */
    public JSONObject getReturnJsonObject() {
        return JSONObject.parseObject(client.getResponseString());
    }

    /**
     * 获取返回的jsonarray
     *
     * @return
     */
    public JSONArray getReturnJsonArray() {
        return JSONArray.parseArray(client.getResponseString());
    }

    /**
     * 获取请求消耗时间
     *
     * @return 时间 秒
     */
    public double getResponseTime() {
        return client.getDuration();
    }

    /**
     * 获取http请求状态码
     *
     * @return http请求状态码
     */
    public int getStatusCode() {
        return client.getStatusCode();
    }

    /**
     * 用于登陆后获取headcookie
     *
     * @return cookie
     */
    public List<String> getCookies() {
        return client.getCookies();
    }

    /**
     * 用于设置cookie
     *
     * @param cookie 登陆后获取到的cookie
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    /**
     * 用于使用List<String>设置cookie,该值可从getCookies获取
     *
     * @param cookies list格式的一串数据
     */
    public BaseCall setCookies(List<String> cookies) {
        for (String s : cookies) {
            this.cookie += s + ";";
        }
        return this;
    }

    /**
     * 默认添加header信息PC
     */
    public BaseCall addDefHeader() {
        // client.addHeader("Accept","text/xml,text/javascript,text/html,application/json");
        // 每个系统默认头信息都不同
        client.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8;");
        client.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
        //client.addHeader("User-Agent","Dalvik/2.1.0 (Linux; U; Android 5.0.2; Redmi Note 2 MIUI/8.4.26)");
        client.addHeader("WX-SJB" , "sjb");
        client.addHeader("Cookie", cookie);
        return this;
    }

    public List<String> getAllHeader() {
        return client.getAllHeader();
    }

    /**
     * addHeader 添加header
     *
     * @param key   header key
     * @param value header value
     */
    public BaseCall addHeader(String key, String value) {
        client.addHeader(key, value);
        return this;
    }

    public BaseCall addHeaders(HashMap<String, Object> headers) {
        for(String key:headers.keySet()){
            //System.out.println(key+":"+headers.get(key));
            client.addHeader(key, headers.get(key).toString());
        }
        return this;
    }


    /**
     * 获取发送报文
     *
     * @return 发送报文内容
     */
    public String getEntityString() {
        return entityString;
    }

    /**
     * 获取返回格式为Json报文格式的对象中key对应的value
     *
     * @param key JsonKey
     * @return String value
     */
    public String getJsonValue(String key) {
        String value = null;
        try {
            JSONObject jo = JSONObject.parseObject((getReturnData()));
            value = jo.get(key).toString();
        } catch (NullPointerException e) {
        }
        return value;
    }

    /**
     * 设置url 调用这个方法可以强制设置Call的URL
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
        client.close();
        client = new CallClient(url, mode);
    }

    /**
     * 添加文件，用于文件上传
     *
     * @param name     参数名
     * @param fliename 文件全路径
     */
    public void addPart(String name, String fliename) {
        client.addPart(name, fliename);
    }

    /**
     * @see CallClient#setConnectionTimeout(int)
     */
    public void setConnectionTimeout(int timeout) {
        client.setConnectionTimeout(timeout);
    }

    /**
     * @see CallClient#setSoTimeout(int)
     */
    public void setSoTimeout(int timeout) {
        client.setSoTimeout(timeout);
    }

    /**
     * @see CallClient#removeAllHeader()
     */
    public void removeAllHeader() {
        client.removeAllHeader();
    }

    public BaseCall close() {
        client.close();
        return this;
    }
}
