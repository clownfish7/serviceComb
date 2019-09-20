package com.clownfish7.service;

import org.springframework.stereotype.Service;

/**
 * @author yzy
 * @classname CalculatorServiceImpl
 * @description TODO
 * @create 2019-09-20 14:20
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double calculate(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Arguments must be above 0");
        }
        double heightInMeter = height / 100;
        return weight / (heightInMeter * heightInMeter);
    }
}
