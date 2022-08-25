package com.calculatorcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome(){
        return "<b> Welcome to the calculator </b>";
    }
    public int plus(Integer num1, Integer num2){

        return  num1 + num2;
    }

    public int minus(Integer num1, Integer num2){

        return  num1 - num2;
    }
    public int multiply(Integer num1, Integer num2){

        return  num1 * num2;
    }
    public int divide(Integer num1, Integer num2){
        if (num2 == 0){
            throw new ByZeroExaption();
        }
        return  num1 / num2;
    }

}
