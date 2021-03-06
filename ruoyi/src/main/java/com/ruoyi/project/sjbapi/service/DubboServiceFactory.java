/*
package com.ruoyi.project.sjbapi.service;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.beans.factory.annotation.Value;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class DubboServiceFactory implements Serializable {

    private ApplicationConfig application;

    private RegistryConfig registry;

    private static class SingletonHolder {
        private static DubboServiceFactory INSTANCE = new DubboServiceFactory();
    }

    private DubboServiceFactory() {
        Properties prop = new Properties();
        ClassLoader loader = DubboServiceFactory.class.getClassLoader();
        try {
            prop.load(loader.getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ApplicationConfig applicationConfig = new ApplicationConfig();
        //这里配置了dubbo的application信息，此3条信息是必须获取的基本信息
        applicationConfig.setName(prop.getProperty("dubbo.application.name"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(prop.getProperty("dubbo.registry.address"));
        registryConfig.setVersion(prop.getProperty("dubbo.provider.version"));
        this.application = applicationConfig;
        this.registry = registryConfig;

    }

    public static DubboServiceFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Object genericInvoke(String interfaceClass, String methodName, List<Map<String, Object>> parameters) {

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        //这个版本号也是必须设置的
        reference.setVersion(registry.getVersion());
        reference.setInterface(interfaceClass); // 接口名
        reference.setGeneric(true); // 声明为泛化接口
        */
/*ReferenceConfig实例很重，封装了与注册中心的连接以及与提供者的连接，
        需要缓存，否则重复生成ReferenceConfig可能造成性能问题并且会有内存和连接泄漏。
        API方式编程时，容易忽略此问题。
        这里使用dubbo内置的简单缓存工具类进行缓存*//*

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);
        // 用com.alibaba.dubbo.rpc.service.GenericService可以替代所有接口引用

        int len = parameters.size();
        String[] invokeParamTyeps = new String[len];
        Object[] invokeParams = new Object[len];
        for (int i = 0; i < len; i++) {
            invokeParamTyeps[i] = parameters.get(i).get("ParamType") + "";
            invokeParams[i] = parameters.get(i).get("Object");
        }
        return genericService.$invoke(methodName, invokeParamTyeps, invokeParams);
    }

    public static void main(String[] args) {
        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();
        List<Map<String, Object>> parameters = new ArrayList<>();
        Map map = new HashMap();
        map.put("java.lang.String","17612169056");
        parameters.add(map);
        Object object = dubbo.genericInvoke("com.sijibao.userplatform.api.facade.UserFacedService", "queryUserInfoByUserMobile", parameters);
        System.out.println(object.toString());
    }
}
*/
