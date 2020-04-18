package com.ruoyi.project.sjbapi.config;

public class EnvConfig {

    public EnvConfig() {
        System.getenv("env");
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("env", "test"));
    }
}
