package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> testingNumbers = new ArrayList<Integer>();
        OddNumbersExterminator test1 = new OddNumbersExterminator();
        test1.exterminate(testingNumbers);
        if (testingNumbers.isEmpty()){
            System.out.println("Kolekcja jest pusta");
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> testingNumbers = new ArrayList<Integer>();
        testingNumbers.add(7);
        testingNumbers.add(10);
        testingNumbers.add(23);

        OddNumbersExterminator test2 = new OddNumbersExterminator();
        test2.exterminate(testingNumbers);

        for (int oddNumbers : testingNumbers){
            if (oddNumbers%2 !=0){
                System.out.println("Nieparzyste elementy:" + oddNumbers );
            }
        }


    }

}
