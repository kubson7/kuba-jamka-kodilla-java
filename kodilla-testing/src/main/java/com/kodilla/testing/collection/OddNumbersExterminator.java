package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers){

        List<Integer> oddNumbersList = new ArrayList<Integer>();

        for (int oddNumbers : numbers) {
            if (oddNumbers%2 != 0){
                oddNumbersList.add(oddNumbers);
            }
        }
    }
}
