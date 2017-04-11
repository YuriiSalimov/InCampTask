package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class TriangleImplTest extends AbstractFigureTest {

    @Test
    public void getAreaTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getArea() == getTriangleArea(sideA, sideB, sideC));
    }

    @Test
    public void getPerimeterTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getPerimeter() == getTrianglePerimeter(sideA, sideB, sideC));
    }

    @Test
    public void toStringTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        String triangleToString = "Triangle: perimeter = " + getTrianglePerimeter(sideA, sideB, sideC) +
                ", area = " + getTriangleArea(sideA, sideB, sideC) +
                ", sideA = " + sideA +
                ", sideB = " + sideB +
                ", sideC = " + sideC +
                ", angleAlpha = " + getAngle(sideA, sideB, sideC) +
                ", angleBeta = " + getAngle(sideB, sideA, sideC) +
                ", angleGamma = " + getAngle(sideC, sideB, sideA);
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertEquals(triangle.toString(), triangleToString);
    }

    @Test
    public void equalsSimilarFiguresTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle1 = new TriangleImpl(sideA, sideB, sideC);
        Triangle triangle2 = new TriangleImpl(sideA, sideB, sideC);
        Triangle triangle3 = new TriangleImpl(sideA, sideB, sideC);
        equalsTest(triangle1, triangle2, triangle3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle1 = new TriangleImpl(2 * sideA, sideB, sideC);
        Triangle triangle2 = new TriangleImpl(sideA, sideB, sideC);
        equalsDifferentFiguresTest(triangle1, triangle2);

        triangle1 = new TriangleImpl(sideA, sideB, sideC);
        triangle2 = new TriangleImpl(sideA, 2 * sideB, sideC);
        equalsDifferentFiguresTest(triangle1, triangle2);

        triangle1 = new TriangleImpl(sideA, sideB, 2 * sideC);
        triangle2 = new TriangleImpl(sideA, sideB, sideC);
        equalsDifferentFiguresTest(triangle1, triangle2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        hashCodeTest(triangle);
    }

    @Test
    public void getSideATest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getSideA() == sideA);
    }

    @Test
    public void setSideATest() throws Exception {
        double sideA = 9;
        Triangle triangle = new TriangleImpl();
        triangle.setSideA(sideA);
        Assert.assertTrue(triangle.getSideA() == sideA);
    }

    @Test
    public void whenSetNegativeSideAThenGetZero() throws Exception {
        double sideA = -9;
        Triangle triangle = new TriangleImpl();
        triangle.setSideA(sideA);
        Assert.assertTrue(triangle.getSideA() == 0);
    }

    @Test
    public void getSideBTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getSideB() == sideB);
    }

    @Test
    public void setSideBTest() throws Exception {
        double sideB = 12;
        Triangle triangle = new TriangleImpl();
        triangle.setSideB(sideB);
        Assert.assertTrue(triangle.getSideB() == sideB);
    }

    @Test
    public void whenSetNegativeSideBThenGetZero() throws Exception {
        double sideB = -12;
        Triangle triangle = new TriangleImpl();
        triangle.setSideB(sideB);
        Assert.assertTrue(triangle.getSideB() == 0);
    }

    @Test
    public void getSideCTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getSideC() == sideC);
    }

    @Test
    public void setSideCTest() throws Exception {
        double sideC = 15;
        Triangle triangle = new TriangleImpl();
        triangle.setSideC(sideC);
        Assert.assertTrue(triangle.getSideC() == sideC);
    }

    @Test
    public void whenSetNegativeSideCThenGetZero() throws Exception {
        double sideC = -15;
        Triangle triangle = new TriangleImpl();
        triangle.setSideC(sideC);
        Assert.assertTrue(triangle.getSideC() == 0);
    }

    @Test
    public void getAngleAlphaTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getAngleAlpha() == getAngle(sideA, sideB, sideC));
    }

    @Test
    public void getAngleBetaTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getAngleBeta() == getAngle(sideB, sideA, sideC));
    }

    @Test
    public void getAngleGammaTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.getAngleGamma() == getAngle(sideC, sideB, sideA));
    }

    @Test
    public void getPointATest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Point pointA = new PointImpl(0, 0);
        Assert.assertEquals(triangle.getPointA(), pointA);
    }

    @Test
    public void getPointBTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Point pointB = new PointImpl(0, sideA);
        Assert.assertEquals(triangle.getPointB(), pointB);
    }

    @Test
    public void getPointCTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Point pointC = new PointImpl(
                Math.abs(sideC * Math.cos(getAngle(sideA, sideB, sideC))),
                Math.abs(sideC * Math.cos(getAngle(sideB, sideA, sideC)))
        );
        Assert.assertEquals(triangle.getPointC(), pointC);
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Triangle";
        Triangle triangle = new TriangleImpl();
        Assert.assertEquals(triangle.getName(), name);
    }

    @Test
    public void drawTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        triangle.draw();
    }

    @Test
    public void isTriangleTest() throws Exception {
        double sideA = 9;
        double sideB = 12;
        double sideC = 15;
        Triangle triangle = new TriangleImpl(sideA, sideB, sideC);
        Assert.assertTrue(triangle.isTriangle());

        triangle = new TriangleImpl(4 * sideA, sideB, sideC);
        Assert.assertFalse(triangle.isTriangle());

        triangle = new TriangleImpl(sideA, 2 * sideB, sideC);
        Assert.assertFalse(triangle.isTriangle());

        triangle = new TriangleImpl(sideA, sideB, 2 * sideC);
        Assert.assertFalse(triangle.isTriangle());
    }

    private static double getTrianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    private static double getTriangleArea(double sideA, double sideB, double sideC) {
        double semiperimeter = getTrianglePerimeter(sideA, sideB, sideC) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) *
                (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    private static double getAngle(double sideA, double sideB, double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
    }
}
