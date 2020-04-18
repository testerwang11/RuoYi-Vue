package com.ruoyi.project.sjbapi.service;


import com.ruoyi.project.sjbapi.util.DBHelper;

import java.util.HashMap;

public class BaseService {

    public static HashMap<String, Object> headers_txt = new HashMap<>();

    public static HashMap<String, Object> headers_json = new HashMap<>();
    public static DBHelper dbHelper = DBHelper.getInstance();

    public BaseService() {
        headers_txt.put("Content-Type", "application/x-www-form-urlencoded");
        headers_txt.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        //headers_txt.put("Authorization", globalData.get("gyl.yy1.account"));

        headers_json.put("Content-Type", "application/json;charset=UTF-8");
        headers_json.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        //headers_json.put("Authorization", globalData.get("gyl.yy1.account"));

    }

}
