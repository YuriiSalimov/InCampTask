package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class CircleImplTest extends AbstractFigureTest {

    @Test
    public void getAreaTest() throws Exception {
        int radius = 10;
        Circle circle = new CircleImpl(radius);
        Assert.assertTrue(circle.getArea() == getCircleArea(radius));
    }

    @Test
    public void getPerimeterTest() throws Exception {
        int radius = 10;
        Circle circle = new CircleImpl(radius);
        Assert.assertTrue(circle.getPerimeter() == getCirclePerimeter(radius));
    }

    @Test
    public void toStringTest() throws Exception {
        double radius = 10;
        String circleToString = "Circle: perimeter = " + getCirclePerimeter(radius) +
                ", area = " + getCircleArea(radius) +
                ", radius = " + radius +
                ", diameter = " + getCircleDiameter(radius);
        Circle circle = new CircleImpl(radius);
        Assert.assertEquals(circle.toString(), circleToString);
    }

    @Test
    public void equalsSimilarFiguresTest() throws Exception {
        double radius = 10;
        Circle circle1 = new CircleImpl(radius);
        Circle circle2 = new CircleImpl(radius);
        Circle circle3 = new CircleImpl(radius);
        equalsTest(circle1, circle2, circle3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        double radius = 10;
        Circle circle1 = new CircleImpl(radius);
        Circle circle2 = new CircleImpl(2 * radius);
        equalsDifferentFiguresTest(circle1, circle2);
        equalsDifferentFiguresTest(circle1, new PointImpl());
    }

    @Test
    public void hashCodeTest() throws Exception {
        int radius = 10;
        Circle circle = new CircleImpl(radius);
        hashCodeTest(circle);
    }

    @Test
    public void getRadiusTest() throws Exception {
        int radius = 10;
        Circle circle = new CircleImpl(radius);
        Assert.assertTrue(circle.getRadius() == radius);
    }

    @Test
    public void setRadiusTest() throws Exception {
        int radius = 10;
        Circle circle = new CircleImpl();
        circle.setRadius(radius);
        Assert.assertTrue(circle.getRadius() == radius);
    }

    @Test
    public void whenSetNegativeRadiusThenGetZero() throws Exception {
        int radius = -10;
        Circle circle = new CircleImpl();
        circle.setRadius(radius);
        Assert.assertTrue(circle.getRadius() == 0);
    }

    @Test
    public void getDiameterTest() throws Exception {
        int radius = 10;
        int diameter = 2 * radius;
        Circle circle = new CircleImpl(radius);
        Assert.assertTrue(circle.getDiameter() == diameter);
    }

    @Test
    public void setDiameterTest() throws Exception {
        int radius = 10;
        int diameter = 2 * radius;
        Circle circle = new CircleImpl();
        circle.setDiameter(diameter);
        Assert.assertTrue(circle.getDiameter() == diameter);
    }

    @Test
    public void whenSetNegativeDiameterThenGetZero() throws Exception {
        int radius = -10;
        Circle circle = new CircleImpl();
        circle.setDiameter(radius);
        Assert.assertTrue(circle.getDiameter() == 0);
    }

    @Test
    public void getCentreTest() throws Exception {
        int radius = 10;
        Point center = new PointImpl(radius, radius);
        Circle circle = new CircleImpl(radius);
        Assert.assertEquals(circle.getCentre(), center);
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Circle";
        Circle circle = new CircleImpl();
        Assert.assertEquals(circle.getName(), name);
    }

    @Test
    public void drawTest() throws Exception {
        int radius = 10;
        Circle circle = new CircleImpl(radius);
        circle.draw();
    }

    private static double getCircleDiameter(double radius) {
        return 2 * radius;
    }

    private static double getCirclePerimeter(double radius) {
        return Math.PI * getCircleDiameter(radius);
    }

    private static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
