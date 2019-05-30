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
        int result1 = calculator.add(44,11);
        int result2 = calculator.subtract(44,11);
        if ((result1 == 55) && (result2 == 33)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
