package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class RectangleImplTest extends AbstractFigureTest {

    private final static double DEFAULT_WIDTH = 3;
    private final static double DEFAULT_HEIGHT = 2;

    @Test
    public void getAreaTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertTrue(rectangle.getArea() == calculateRectangleArea(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    @Test
    public void getPerimeterTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertTrue(rectangle.getPerimeter() == calculateRectanglePerimeter(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    @Test
    public void toStringTest() throws Exception {
        String rectangleToString = "Rectangle: perimeter = " +
                calculateRectanglePerimeter(DEFAULT_WIDTH, DEFAULT_HEIGHT) +
                ", area = " + calculateRectangleArea(DEFAULT_WIDTH, DEFAULT_HEIGHT) +
                ", width = " + DEFAULT_WIDTH + ", height = " + DEFAULT_HEIGHT;
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertEquals(rectangle.toString(), rectangleToString);
    }

    @Test
    public void equalsSimilarFiguresTest() throws Exception {
        Rectangle rectangle1 = createDefaultRectangle();
        Rectangle rectangle2 = createDefaultRectangle();
        Rectangle rectangle3 = createDefaultRectangle();
        equalsTest(rectangle1, rectangle2, rectangle3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        Rectangle rectangle1 = createRectangle(2 * DEFAULT_WIDTH, DEFAULT_HEIGHT);
        Rectangle rectangle2 = createRectangle(DEFAULT_WIDTH, 2 * DEFAULT_HEIGHT);
        equalsDifferentFiguresTest(rectangle1, rectangle2);

        rectangle1 = createRectangle(DEFAULT_WIDTH, 2 * DEFAULT_HEIGHT);
        rectangle2 = createRectangle(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        equalsDifferentFiguresTest(rectangle1, rectangle2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        hashCodeTest(rectangle);
    }

    @Test
    public void getWidthTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertTrue(rectangle.getWidth() == DEFAULT_WIDTH);
    }

    @Test
    public void getHeightTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertTrue(rectangle.getHeight() == DEFAULT_HEIGHT);
    }


    @Test
    public void whenSetNegativeParametersThenGetZero() throws Exception {
        Rectangle rectangle = createRectangle(-DEFAULT_WIDTH, -DEFAULT_HEIGHT);
        Assert.assertTrue(rectangle.getWidth() == 0);
        Assert.assertTrue(rectangle.getHeight() == 0);
    }

    @Test
    public void getPointATest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertNotNull(rectangle.getPointA());
    }

    @Test
    public void getPointBTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertNotNull(rectangle.getPointB());
    }

    @Test
    public void getPointCTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertNotNull(rectangle.getPointC());
    }

    @Test
    public void getPointDTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertNotNull(rectangle.getPointD());
    }

    @Test
    public void drawTest() throws Exception {
        Rectangle rectangle = createDefaultRectangle();
        rectangle.draw();
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Rectangle";
        Rectangle rectangle = createDefaultRectangle();
        Assert.assertEquals(rectangle.getName(), name);
    }

    private static Rectangle createDefaultRectangle() {
        return createRectangle(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    private static Rectangle createRectangle(double width, double height) {
        return new RectangleImpl(width, height);
    }

    private static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    private static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}
