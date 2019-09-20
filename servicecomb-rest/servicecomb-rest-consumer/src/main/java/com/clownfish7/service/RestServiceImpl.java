package com.clownfish7.service;

import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yzy
 * @classname RestServiceImpl
 * @description RestService消费者
 * @create 2019-09-19 16:49
 */
@Service
public class RestServiceImpl implements RestSevice {

    @Autowired
    private final RestTemplate restTemplate = RestTemplateBuilder.create();

    @Override
    public String sayRest(String name) {
        String providerName = "HelloServiceComb-flowControl";
        return restTemplate.getForObject("cse://"+providerName+"/hola?name=a", String.class);
    }
}
