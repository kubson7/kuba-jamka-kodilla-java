package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = {2, 4, 5, 6, 3, 4, 5, 2, 3, 6, 4, 5, 5, 5, 3, 3, 3, 5, 6, 4};
        //When

        //Then
        Assert.assertEquals(4.15, getAverage(numbers), 0.001);

    }

    @Override
    public double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
    }
}


