package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        // Testing Calculator class
        Calculator calculator = new Calculator();
        int addResult = calculator.add(180, 19);
        int subResult = calculator.subtract(200, 150);
        if ((addResult == 199) && (subResult == 50)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
