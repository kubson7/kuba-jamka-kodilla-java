package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // test pierwszy jest jednostkowy
        System.out.println("Test - pierwszy test jednostkowy");
        System.out.println("Test - drugi test jednostkowy prostego kalkulatora");

        Calculator calculator = new Calculator();
        int resume = calculator.add(44,11);
        System.out.println(resume);
        int resume2 = calculator.subtract(44,11);
        System.out.println(resume2);
    }
}
