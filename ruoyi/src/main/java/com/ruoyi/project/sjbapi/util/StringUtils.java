package com.ruoyi.project.sjbapi.util;

public class StringUtils {
    public static String getNumFromStr(String str) {
        str=str.trim();
        String str2="";
        if(str != null && !"".equals(str)){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }
        }
        return str2;
    }

    public static boolean isBlank(String str) {
        if(str.isEmpty()||str.length()==0){
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String str) {
        if(str.isEmpty()||str.length()==0){
            return false;
        }
        return true;
    }
}
