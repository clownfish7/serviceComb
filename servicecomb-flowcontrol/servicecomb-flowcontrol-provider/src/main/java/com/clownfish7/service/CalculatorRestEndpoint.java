package com.clownfish7.service;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yzy
 * @classname CalculatorServiceImpl
 * @description TODO
 * @create 2019-09-20 14:15
 */
@RestSchema(schemaId = "calculatorRestEndpoint")
@RequestMapping("/")
public class CalculatorRestEndpoint implements CalculatorService {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorRestEndpoint(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Override
    @GetMapping("/bmi")
    public double calculate(double height, double weight) {
        return calculatorService.calculate(height, weight);
    }
}


