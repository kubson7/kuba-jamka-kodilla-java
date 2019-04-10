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

        int add = calculate.Add(10,1);
        int subtract = calculate.Subtrack(5,5);

        if ((add == 11)&&(subtract == 0)) {
            System.out.println("OK");
        } else {
            System.out.println("Error !!");
        }
    }
}
