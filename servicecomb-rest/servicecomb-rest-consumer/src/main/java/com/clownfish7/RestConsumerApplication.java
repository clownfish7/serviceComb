package com.clownfish7;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yzy
 * @classname RestApplication
 * @description TODO
 * @create 2019-09-19 16:04
 */

@EnableServiceComb
@SpringBootApplication
public class RestConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestConsumerApplication.class, args);
    }
}


