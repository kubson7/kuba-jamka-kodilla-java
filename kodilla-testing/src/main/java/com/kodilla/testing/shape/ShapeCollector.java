package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private final List<Shape> shapeList;

    public ShapeCollector() {
        shapeList = new ArrayList<>();

    }

    public ShapeCollector(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        return shapeList.remove(shape);
    }

    public Shape getFigure(int n){

            return shapeList.get(n);
    }

    public void showFigures(){
        
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}

