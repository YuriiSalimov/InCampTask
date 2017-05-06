package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class TriangleImplTest extends AbstractFigureTest {

    private final static double DEFAULT_SIDE_A = 9;
    private final static double DEFAULT_SIDE_B = 12;
    private final static double DEFAULT_SIDE_C = 15;

    @Test
    public void getAreaTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        double calcArea = calculateTriangleArea(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C);
        Assert.assertTrue(triangle.getArea() == calcArea);
    }

    @Test
    public void getPerimeterTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        double calcPerimeter = calculateTrianglePerimeter(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C);
        Assert.assertTrue(triangle.getPerimeter() == calcPerimeter);
    }

    @Test
    public void toStringTest() throws Exception {
        String triangleToString = "Triangle: perimeter = " +
                calculateTrianglePerimeter(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C) +
                ", area = " +
                calculateTriangleArea(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C) +
                ", sideA = " + DEFAULT_SIDE_A +
                ", sideB = " + DEFAULT_SIDE_B +
                ", sideC = " + DEFAULT_SIDE_C +
                ", angleAlpha = " + calculateAngle(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C) +
                ", angleBeta = " + calculateAngle(DEFAULT_SIDE_B, DEFAULT_SIDE_A, DEFAULT_SIDE_C) +
                ", angleGamma = " + calculateAngle(DEFAULT_SIDE_C, DEFAULT_SIDE_B, DEFAULT_SIDE_A);
        Triangle triangle = createDefaultTriangle();
        Assert.assertEquals(triangle.toString(), triangleToString);
    }

    @Test
    public void equalsSimilarFiguresTest() throws Exception {
        Triangle triangle1 = createDefaultTriangle();
        Triangle triangle2 = createDefaultTriangle();
        Triangle triangle3 = createDefaultTriangle();
        equalsTest(triangle1, triangle2, triangle3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        Triangle triangle1 = new TriangleImpl(2 * DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C);
        Triangle triangle2 = createDefaultTriangle();
        equalsDifferentFiguresTest(triangle1, triangle2);

        triangle1 = createDefaultTriangle();
        triangle2 = createTriangle(DEFAULT_SIDE_A, 2 * DEFAULT_SIDE_B, DEFAULT_SIDE_C);
        equalsDifferentFiguresTest(triangle1, triangle2);

        triangle1 = new TriangleImpl(DEFAULT_SIDE_A, DEFAULT_SIDE_B, 2 * DEFAULT_SIDE_C);
        triangle2 = createDefaultTriangle();
        equalsDifferentFiguresTest(triangle1, triangle2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        hashCodeTest(triangle);
    }

    @Test
    public void getSideATest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Assert.assertTrue(triangle.getSideA() == DEFAULT_SIDE_A);
    }

    @Test
    public void getSideBTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Assert.assertTrue(triangle.getSideB() == DEFAULT_SIDE_B);
    }

    @Test
    public void getSideCTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Assert.assertTrue(triangle.getSideC() == DEFAULT_SIDE_C);
    }

    @Test
    public void whenSetNegativeSideThenGetZero() throws Exception {
        Triangle triangle = createTriangle(-DEFAULT_SIDE_A, -DEFAULT_SIDE_B, -DEFAULT_SIDE_C);
        Assert.assertTrue(triangle.getSideA() == 0);
        Assert.assertTrue(triangle.getSideB() == 0);
        Assert.assertTrue(triangle.getSideC() == 0);
    }

    @Test
    public void getAngleAlphaTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        double alphaAngle = calculateDefaultAlphaAngle();
        Assert.assertTrue(triangle.getAngleAlpha() == alphaAngle);
    }

    @Test
    public void getAngleBetaTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        double betaAngle = calculateDefaultBetaAngle();
        Assert.assertTrue(triangle.getAngleBeta() == betaAngle);
    }

    @Test
    public void getAngleGammaTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        double gammaAngle = calculateDefaultGammaAngle();
        Assert.assertTrue(triangle.getAngleGamma() == gammaAngle);
    }

    @Test
    public void getPointATest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Point pointA = new PointImpl(0, 0);
        Assert.assertEquals(triangle.getPointA(), pointA);
    }

    @Test
    public void getPointBTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Point pointB = new PointImpl(0, DEFAULT_SIDE_A);
        Assert.assertEquals(triangle.getPointB(), pointB);
    }

    @Test
    public void getPointCTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Point pointC = new PointImpl(
                Math.abs(DEFAULT_SIDE_C * Math.cos(calculateDefaultAlphaAngle())),
                Math.abs(DEFAULT_SIDE_C * Math.cos(calculateDefaultBetaAngle()))
        );
        Assert.assertEquals(triangle.getPointC(), pointC);
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Triangle";
        Triangle triangle = createDefaultTriangle();
        Assert.assertEquals(triangle.getName(), name);
    }

    @Test
    public void drawTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        triangle.draw();
    }

    @Test
    public void isTriangleTest() throws Exception {
        Triangle triangle = createDefaultTriangle();
        Assert.assertTrue(triangle.isTriangle());

        triangle = createTriangle(4 * DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C);
        Assert.assertFalse(triangle.isTriangle());

        triangle = createTriangle(DEFAULT_SIDE_A, 2 * DEFAULT_SIDE_B, DEFAULT_SIDE_C);
        Assert.assertFalse(triangle.isTriangle());

        triangle = createTriangle(DEFAULT_SIDE_A, DEFAULT_SIDE_B, 2 * DEFAULT_SIDE_C);
        Assert.assertFalse(triangle.isTriangle());
    }

    private static Triangle createDefaultTriangle() {
        return new TriangleImpl(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C);
    }

    private static Triangle createTriangle(double sideA, double sideB, double sideC) {
        return new TriangleImpl(sideA, sideB, sideC);
    }

    private static double calculateTrianglePerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC);
    }

    private static double calculateTriangleSemiPerimeter(double sideA, double sideB, double sideC) {
        return calculateTrianglePerimeter(sideA, sideB, sideC) / 2;
    }

    private static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double semiperimeter = calculateTriangleSemiPerimeter(sideA, sideB, sideC);
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) *
                (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    private static double calculateAngle(double sideA, double sideB, double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
    }

    private static double calculateDefaultAlphaAngle() {
        return calculateAngle(DEFAULT_SIDE_A, DEFAULT_SIDE_B, DEFAULT_SIDE_C);
    }

    private static double calculateDefaultBetaAngle() {
        return calculateAngle(DEFAULT_SIDE_B, DEFAULT_SIDE_A, DEFAULT_SIDE_C);
    }

    private static double calculateDefaultGammaAngle() {
        return calculateAngle(DEFAULT_SIDE_C, DEFAULT_SIDE_B, DEFAULT_SIDE_A);
    }
}
