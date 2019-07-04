package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continets = new ArrayList<>();
        continets.add(new Europe());
        continets.add(new Asia());
        continets.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent : continets){
            totalSand = totalSand.add(continent.getSandBeansQuantity());

         //Then
            BigDecimal expectedSand = new BigDecimal("211111110903703703670");
            Assert.assertEquals(expectedSand, totalSand);
        }
    }
    @Test
    public void testGetSandBeansQuanttywithReduce() {
        //Given
        List<SandStorage> continets = new ArrayList<>();
        continets.add(new Europe());
        continets.add(new Asia());
        continets.add(new Africa());

        //When
        BigDecimal totalSand = continets.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand,totalSand);
    }
}
