package com.clownfish7;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yzy
 * @classname RpcProviderApplication
 * @description TODO
 * @create 2019-09-19 19:25
 */
@SpringBootApplication
@EnableServiceComb
public class RpcConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RpcConsumerApplication.class, args);
    }
}
