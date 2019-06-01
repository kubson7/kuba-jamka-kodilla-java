package com.kodilla.testing.collection;

import java.util.*;

import com.kodilla.testing.collection.OddNumberExterminator;

import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList <Integer> testList = new ArrayList<Integer>();
        OddNumberExterminator test = new OddNumberExterminator();
        //When
        test.exterminator(testList);
        boolean result = testList.isEmpty();
        //Then
        Assert.assertEquals(true,result);
    }


    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        Random generator = new Random();
        ArrayList <Integer> testList = new ArrayList<Integer>();
        for (int i=0; i<100; i++){
            testList.add(generator.nextInt(100));
        }
        OddNumberExterminator test2 = new OddNumberExterminator();
        //When
        test2.exterminator(testList);

        //Then
        for (int oddNumbers : testList){
            if (oddNumbers%2 !=0){
                System.out.println("Nieparzyste elementy:" + oddNumbers );
            }
        }

    }
}
