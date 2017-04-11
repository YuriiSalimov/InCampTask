package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class RectangleImplTest extends AbstractFigureTest {

    @Test
    public void getAreaTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertTrue(rectangle.getArea() == getRectangleArea(width, height));
    }

    @Test
    public void getPerimeterTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertTrue(rectangle.getPerimeter() == getRectanglePerimeter(width, height));
    }

    @Test
    public void toStringTest() throws Exception {
        double width = 3;
        double height = 2;
        String rectangleToString = "Rectangle: perimeter = " + getRectanglePerimeter(width, height) +
                ", area = " + getRectangleArea(width, height) +
                ", width = " + width + ", height = " + height;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertEquals(rectangle.toString(), rectangleToString);
    }

    @Test
    public void equalsSimilarFiguresTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle1 = new RectangleImpl(width, height);
        Rectangle rectangle2 = new RectangleImpl(width, height);
        Rectangle rectangle3 = new RectangleImpl(width, height);
        equalsTest(rectangle1, rectangle2, rectangle3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle1 = new RectangleImpl(2 * width, height);
        Rectangle rectangle2 = new RectangleImpl(width, 2 * height);
        equalsDifferentFiguresTest(rectangle1, rectangle2);

        rectangle1 = new RectangleImpl(width, 2 * height);
        rectangle2 = new RectangleImpl(width, height);
        equalsDifferentFiguresTest(rectangle1, rectangle2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        hashCodeTest(rectangle);
    }

    @Test
    public void getWidthTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertTrue(rectangle.getWidth() == width);
    }

    @Test
    public void setWidthTest() throws Exception {
        double width = 3;
        Rectangle rectangle = new RectangleImpl();
        rectangle.setWidth(width);
        Assert.assertTrue(rectangle.getWidth() == width);
    }

    @Test
    public void whenSetNegativeWidthThenGetZero() throws Exception {
        double width = -3;
        Rectangle rectangle = new RectangleImpl();
        rectangle.setWidth(width);
        Assert.assertTrue(rectangle.getWidth() == 0);
    }

    @Test
    public void getHeightTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertTrue(rectangle.getHeight() == height);
    }

    @Test
    public void setHeightTest() throws Exception {
        double height = 2;
        Rectangle rectangle = new RectangleImpl();
        rectangle.setHeight(height);
        Assert.assertTrue(rectangle.getHeight() == height);
    }

    @Test
    public void whenSetNegativeHeightThenGetZero() throws Exception {
        double height = -2;
        Rectangle rectangle = new RectangleImpl();
        rectangle.setHeight(height);
        Assert.assertTrue(rectangle.getHeight() == 0);
    }

    @Test
    public void getPointATest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertNotNull(rectangle.getPointA());
    }

    @Test
    public void getPointBTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertNotNull(rectangle.getPointB());
    }

    @Test
    public void getPointCTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertNotNull(rectangle.getPointC());
    }

    @Test
    public void getPointDTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        Assert.assertNotNull(rectangle.getPointD());
    }

    @Test
    public void drawTest() throws Exception {
        double width = 3;
        double height = 2;
        Rectangle rectangle = new RectangleImpl(width, height);
        rectangle.draw();
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Rectangle";
        Rectangle rectangle = new RectangleImpl();
        Assert.assertEquals(rectangle.getName(), name);
    }

    private static double getRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    private static double getRectangleArea(double width, double height) {
        return width * height;
    }
}
