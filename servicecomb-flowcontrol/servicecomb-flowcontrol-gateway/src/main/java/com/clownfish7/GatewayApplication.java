package com.clownfish7;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yzy
 * @classname GatewayApplication
 * @description TODO
 * @create 2019-09-20 13:55
 */
@SpringBootApplication
@EnableZuulProxy
@EnableServiceComb
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
