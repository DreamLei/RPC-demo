package com.dream.rpcdemo.caller.app;

import com.dream.rpcdemo.callee.service.service.Calculator;
import com.dream.rpcdemo.caller.service.CalculatorRemoteImpl;

/**
 * Created by tanglei14 on 13/2/2019.
 */
public class CallerApp {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorRemoteImpl();
        int result = calculator.add(3, 3);
        System.out.println(result);
    }
}
