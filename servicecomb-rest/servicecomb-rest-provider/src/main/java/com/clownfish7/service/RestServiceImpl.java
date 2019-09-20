package com.clownfish7.service;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yzy
 * @classname RestServiceImpl
 * @description TODO
 * @create 2019-09-19 16:01
 */
@RestSchema(schemaId = "hello") // 注册微服务到服务中心
@RequestMapping("/")
public class RestServiceImpl implements RestSevice {
    @Override
    @GetMapping("/hello")
    public String sayRest(String name) {
        System.out.println("provider 2");
        return "Helo " + name;
    }
}
