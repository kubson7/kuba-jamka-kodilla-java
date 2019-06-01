package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

    public void exterminator(ArrayList<Integer> numbers){
        List <Integer> evenNumbers = new ArrayList<Integer>();

        for (int even : numbers) {
            if (even % 2 == 0){
                evenNumbers.add(even);
            }
        }
    }
}
