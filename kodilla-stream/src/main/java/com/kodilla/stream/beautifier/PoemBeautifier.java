package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify (String textToBeautify, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(textToBeautify);
        System.out.println("Result equals: "+result);
        return result;
    }
}
