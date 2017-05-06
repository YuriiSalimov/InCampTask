package com.salimov.yurii.incamp.figure;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class PointImplTest extends AbstractFigureTest {

    private final static double DEFAULT_ABSCISSA = 10;
    private final static double DEFAULT_ORDINATE = 15;
    private final static int DEFAULT_POINT_NUMBER = 5;

    @Test
    public void toStringTest() throws Exception {
        String pointToString = "Point: perimeter = " + 0.0 +
                ", area = " + 0.0 +
                ", abscissa = " + DEFAULT_ABSCISSA +
                ", ordinate = " + DEFAULT_ORDINATE;
        Point point = createDefaultPoint();
        Assert.assertEquals(point.toString(), pointToString);
    }

    @Test
    public void equalsTest() throws Exception {
        Point point1 = createDefaultPoint();
        Point point2 = createDefaultPoint();
        Point point3 = createDefaultPoint();
        equalsTest(point1, point2, point3);
    }

    @Test
    public void equalsDifferentFiguresTest() throws Exception {
        Point point1 = createPoint(DEFAULT_ABSCISSA, 2 * DEFAULT_ORDINATE);
        Point point2 = createPoint(2 * DEFAULT_ABSCISSA, DEFAULT_ORDINATE);
        equalsDifferentFiguresTest(point1, point2);

        point2 = createDefaultPoint();
        equalsDifferentFiguresTest(point1, point2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        Point point = createDefaultPoint();
        hashCodeTest(point);
    }

    @Test
    public void getAreaTest() throws Exception {
        Point point = createDefaultPoint();
        Assert.assertTrue(point.getArea() == 0);
    }

    @Test
    public void getPerimeterTest() throws Exception {
        Point point = createDefaultPoint();
        Assert.assertTrue(point.getPerimeter() == 0);
    }

    @Test
    public void getAbscissaTest() throws Exception {
        Point point = createDefaultPoint();
        Assert.assertTrue(point.getAbscissa() == DEFAULT_ABSCISSA);
    }

    @Test
    public void getOrdinateTest() throws Exception {
        Point point = createDefaultPoint();
        Assert.assertTrue(point.getOrdinate() == DEFAULT_ORDINATE);
    }

    @Test
    public void drawTest() throws Exception {
        Point point = createDefaultPoint();
        point.draw();
    }

    @Test
    public void getNameTest() throws Exception {
        String name = "Point";
        Point point = createDefaultPoint();
        Assert.assertEquals(point.getName(), name);
    }

    @Test
    public void getMinAbscissaTest() throws Exception {
        List<Point> points = createDefaultPoints();
        double minAbscissa = PointImpl.getMinAbscissa(points);
        Assert.assertTrue(minAbscissa == DEFAULT_ABSCISSA);
    }

    @Test
    public void getMaxAbscissaTest() throws Exception {
        List<Point> points = createDefaultPoints();
        double maxAbscissa = PointImpl.getMaxAbscissa(points);
        Assert.assertTrue(maxAbscissa == (DEFAULT_ABSCISSA * DEFAULT_POINT_NUMBER));
    }

    @Test
    public void getMinOrdinateTest() throws Exception {
        List<Point> points = createDefaultPoints();
        double minOrdinate = PointImpl.getMinOrdinate(points);
        Assert.assertTrue(minOrdinate == DEFAULT_ORDINATE);
    }

    @Test
    public void getMaxOrdinateTest() throws Exception {
        List<Point> points = createDefaultPoints();
        double maxOrdinate = PointImpl.getMaxOrdinate(points);
        Assert.assertTrue(maxOrdinate == (DEFAULT_ORDINATE * DEFAULT_POINT_NUMBER));
    }

    private static List<Point> createDefaultPoints() {
        return createPoints(DEFAULT_ABSCISSA, DEFAULT_ORDINATE, DEFAULT_POINT_NUMBER);
    }

    private static List<Point> createPoints(double abscissa, double ordinate, int number) {
        Set<Point> points = new HashSet<>();
        for (int i = 1; i < number + 1; i++) {
            points.add(createPoint(i * abscissa, i * ordinate));
        }
        return new ArrayList<>(points);
    }
    
    private static Point createDefaultPoint() {
        return createPoint(DEFAULT_ABSCISSA, DEFAULT_ORDINATE);
    }
    
    private static Point createPoint(double abscissa, double ordinate) {
        return new PointImpl(abscissa, ordinate);
    }
}
