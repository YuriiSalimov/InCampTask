package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class CircleImplTest extends AbstractFigureTest {

    private final static double DEFAULT_RADIUS = 10;

    @Test
    public void getAreaTest() throws Exception {
        Circle circle = createDefaultCircle();
        Assert.assertTrue(circle.getArea() == calculateCircleArea(DEFAULT_RADIUS));
    }

    @Test
    public void getPerimeterTest() throws Exception {
        Circle circle = createDefaultCircle();
        Assert.assertTrue(circle.getPerimeter() == calculateCirclePerimeter(DEFAULT_RADIUS));
    }

    @Test
    public void toStringTest() throws Exception {
        String circleToString = "Circle: perimeter = " + calculateCirclePerimeter(DEFAULT_RADIUS) +
                ", area = " + calculateCircleArea(DEFAULT_RADIUS) +
                ", radius = " + DEFAULT_RADIUS +
                ", diameter = " + calculateCircleDiameter(DEFAULT_RADIUS);
        Circle circle = createDefaultCircle();
        Assert.assertEquals(circle.toString(), circleToString);
    }

    @Test
    public void equalsSimilarFiguresTest() throws Exception {
        Circle circle1 = createDefaultCircle();
        Circle circle2 = createDefaultCircle();
        Circle circle3 = createDefaultCircle();
        equalsTest(circle1, circle2, circle3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        Circle circle1 = createDefaultCircle();
        Circle circle2 = createCircle(2 * DEFAULT_RADIUS);
        equalsDifferentFiguresTest(circle1, circle2);
        equalsDifferentFiguresTest(circle1, new PointImpl(DEFAULT_RADIUS, DEFAULT_RADIUS));
    }

    @Test
    public void hashCodeTest() throws Exception {
        Circle circle = createDefaultCircle();
        hashCodeTest(circle);
    }

    @Test
    public void getRadiusTest() throws Exception {
        Circle circle = createDefaultCircle();
        Assert.assertTrue(circle.getRadius() == DEFAULT_RADIUS);
    }

    @Test
    public void whenSetNegativeRadiusThenGetZero() throws Exception {
        Circle circle = createCircle(-DEFAULT_RADIUS);
        Assert.assertTrue(circle.getRadius() == 0);
    }

    @Test
    public void getDiameterTest() throws Exception {
        Circle circle = createDefaultCircle();
        Assert.assertTrue(circle.getDiameter() == calculateCircleDiameter(DEFAULT_RADIUS));
    }

    @Test
    public void getCentreTest() throws Exception {
        Point center = new PointImpl(DEFAULT_RADIUS, DEFAULT_RADIUS);
        Circle circle = createDefaultCircle();
        Assert.assertEquals(circle.getCentre(), center);
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Circle";
        Circle circle = createDefaultCircle();
        Assert.assertEquals(circle.getName(), name);
    }

    @Test
    public void drawTest() throws Exception {
        Circle circle = createDefaultCircle();
        circle.draw();
    }

    private static Circle createDefaultCircle() {
        return new CircleImpl(DEFAULT_RADIUS);
    }

    private static Circle createCircle(double radius) {
        return new CircleImpl(radius);
    }

    private static double calculateCircleDiameter(double radius) {
        return 2 * radius;
    }

    private static double calculateCirclePerimeter(double radius) {
        return Math.PI * calculateCircleDiameter(radius);
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
