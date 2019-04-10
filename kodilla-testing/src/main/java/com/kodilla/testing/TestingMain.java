package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error !");
        }
        // test Calculator
        Calculator calculate = new Calculator();

        System.out.println(calculate.Add(7,8));
        System.out.println(calculate.Subtrack(7,8));
    }
}
