package com.clownfish7.controller;

import com.clownfish7.service.RestSevice;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @classname RestConsumerController
 * @description TODO
 * @create 2019-09-19 16:54
 */
@RestSchema(schemaId = "test") // 注册微服务到服务中心
@RestController
public class RestConsumerController {
    @Autowired
    private RestSevice restSevice;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return restSevice.sayRest(name);
    }
}
