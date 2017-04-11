package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class PointImplTest extends AbstractFigureTest {

    @Test
    public void toStringTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        String pointToString = "Point: perimeter = " + 0.0 +
                ", area = " + 0.0 +
                ", abscissa = " + abscissa +
                ", ordinate = " + ordinate;
        Point point = new PointImpl(abscissa, ordinate);
        Assert.assertEquals(point.toString(), pointToString);
    }

    @Test
    public void equalsTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        Point point1 = new PointImpl(abscissa, ordinate);
        Point point2 = new PointImpl(abscissa, ordinate);
        Point point3 = new PointImpl(abscissa, ordinate);
        equalsTest(point1, point2, point3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        Point point1 = new PointImpl(abscissa, 2 * ordinate);
        Point point2 = new PointImpl(2 * abscissa, ordinate);
        equalsDifferentFiguresTest(point1, point2);

        point1 = new PointImpl(abscissa, ordinate);
        point2 = new PointImpl(abscissa, 2 * ordinate);
        equalsDifferentFiguresTest(point1, point2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        Point point = new PointImpl(abscissa, ordinate);
        hashCodeTest(point);
    }

    @Test
    public void getAreaTest() throws Exception {
        Point point = new PointImpl();
        Assert.assertTrue(point.getArea() == 0);
    }

    @Test
    public void getPerimeterTest() throws Exception {
        Point point = new PointImpl();
        Assert.assertTrue(point.getArea() == 0);
    }

    @Test
    public void getAbscissaTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        Point point = new PointImpl(abscissa, ordinate);
        Assert.assertTrue(point.getAbscissa() == abscissa);
    }

    @Test
    public void setAbscissaTest() throws Exception {
        double abscissa = 10;
        Point point = new PointImpl();
        point.setAbscissa(abscissa);
        Assert.assertTrue(point.getAbscissa() == abscissa);
    }

    @Test
    public void getOrdinateTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        Point point = new PointImpl(abscissa, ordinate);
        Assert.assertTrue(point.getOrdinate() == ordinate);
    }

    @Test
    public void setOrdinateTest() throws Exception {
        double ordinate = 15;
        Point point = new PointImpl();
        point.setOrdinate(ordinate);
        Assert.assertTrue(point.getOrdinate() == ordinate);
    }

    @Test
    public void drawTest() throws Exception {
        Point point = new PointImpl();
        point.draw();
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Point";
        Point point = new PointImpl();
        Assert.assertEquals(point.getName(), name);
    }

    @Test
    public void getMinAbscissaTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        int number = 5;
        List<Point> points = getPoints(abscissa, ordinate, number);
        double minAbscissa = PointImpl.getMinAbscissa(points);
        Assert.assertTrue(minAbscissa == abscissa);
    }

    @Test
    public void getMaxAbscissaTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        int number = 5;
        List<Point> points = getPoints(abscissa, ordinate, number);
        double maxAbscissa = PointImpl.getMaxAbscissa(points);
        Assert.assertTrue(maxAbscissa == (abscissa * number));
    }

    @Test
    public void getMinOrdinateTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        int number = 5;
        List<Point> points = getPoints(abscissa, ordinate, number);
        double minOrdinate = PointImpl.getMinOrdinate(points);
        Assert.assertTrue(minOrdinate == ordinate);
    }

    @Test
    public void getMaxOrdinateTest() throws Exception {
        double abscissa = 10;
        double ordinate = 15;
        int number = 5;
        List<Point> points = getPoints(abscissa, ordinate, number);
        double maxOrdinate = PointImpl.getMaxOrdinate(points);
        Assert.assertTrue(maxOrdinate == (ordinate * number));
    }

    private static List<Point> getPoints(double abscissa, double ordinate, int number) {
        Set<Point> points = new HashSet<>();
        for (int i = 1; i < number + 1; i++) {
            points.add(new PointImpl(i * abscissa, i * ordinate));
        }
        return new ArrayList<>(points);
    }
}
