package com.kodilla.stream.beautifier;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTestSuite {

    @Test
    public void testPoemBeautifierClass(){
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //When
        String words1 = poemBeautifier.beautify("Ala ma kota",text -> text.toUpperCase());
        String words2 = poemBeautifier.beautify("Ala ma kota",text -> text.toLowerCase());
        String words3 = poemBeautifier.beautify("Ala ma kota",text -> "ABC "+text);
        //Then
        Assert.assertEquals("ALA MA KOTA",words1);
        Assert.assertEquals("ala ma kota",words2);
        Assert.assertEquals("ABC Ala ma kota",words3);

    }

}
