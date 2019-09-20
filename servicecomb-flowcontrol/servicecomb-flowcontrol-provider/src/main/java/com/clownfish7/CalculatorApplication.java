package com.clownfish7;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yzy
 * @classname CalculatorApplication
 * @description TODO
 * @create 2019-09-20 14:28
 */
@SpringBootApplication
@EnableServiceComb
public class CalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }
}
