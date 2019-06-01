package com.kodilla.testing.shape;

import org.junit.*;

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
        shapeCollector.addFigure(new Circle("circle",20));
        //Then
        Assert.assertEquals(1,shapeCollector.shapeList.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle",20);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);

        Assert.assertEquals(true, shapeCollector.shapeList.isEmpty());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle",20);
        shapeCollector.addFigure(circle);
        //When
        Shape retrivedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle,retrivedShape);

    }

}
