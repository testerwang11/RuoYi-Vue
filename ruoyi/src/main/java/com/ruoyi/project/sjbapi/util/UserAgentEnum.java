package com.ruoyi.project.sjbapi.util;

public enum UserAgentEnum {

    WeiXin_XCX("Mozilla/5.0 (Linux; Android 7.1.1; MI 6 Build/NMF26X; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/57.0.2987.132 MQQBrowser/6.2 TBS/043807 Mobile Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/4G Language/zh_CN MicroMessenger/6.6.1.1220(0x26060135) NetType/4G Language/zh_CN miniProgram"),
    WeiXin_Android("Mozilla/5.0 (Linux; Android 5.1; HUAWEI TAG-AL00 Build/HUAWEITAG-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043622 Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/4G Language/zh_CN"),
    WeiXin_IOS("Mozilla/5.0 (iphone x Build/MXB48T; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043632 Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN");
    private final String value;

    private UserAgentEnum(String value) {
        this.value = value;
    }
/*    public static void printDay(int i){
        switch(i){
            case 1: System.out.println(WeekDay.Mon); break;
            case 2: System.out.println(WeekDay.Tue);break;
            case 3: System.out.println(WeekDay.Wed);break;
            case 4: System.out.println(WeekDay.Thu);break;
            case 5: System.out.println(WeekDay.Fri);break;
            case 6: System.out.println(WeekDay.Sat);break;
            case 7: System.out.println(WeekDay.Sun);break;
            default:System.out.println("wrong number!");
        }
    }*/
    public String getUserAgent() {
        return value;
    }

    }
