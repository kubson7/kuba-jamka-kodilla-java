package com.kodilla.testing.shape;

public class Triangle implements Shape {

    int a;

    public Triangle(int a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {

        return "triangle";
    }

    @Override
    public double getField() {
        return a*a;
    }

}
