package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(20));
        //Then
        Assert.assertEquals(1,shapeCollector.getShapeList().size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        List<Shape> shapes = new ArrayList<>();
        Shape shape = new Circle(20);
        shapes.add(shape);
        ShapeCollector shapeCollector = new ShapeCollector(shapes);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(shapeCollector.getShapeList().isEmpty());
    }
    @Test
    public void testGetFigure(){
        //Given
        List<Shape> shapes = new ArrayList<>();
        Shape shape = new Circle(20);
        Shape shape2 = new Square(4);
        Shape shape3 = new Circle(6);

        shapes.add(shape);
        shapes.add(shape2);
        shapes.add(shape3);

        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape retrivedShape = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(shape2,retrivedShape);
    }

}
