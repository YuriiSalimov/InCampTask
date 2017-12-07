package com.salimov.yurii.incamp.figure.point;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class PointAnalyzerTest {

    private static List<Point> points;
    private static Point min;
    private static Point max;

    private static PointAnalyzer analyzer;

    @BeforeClass
    public static void beforeClass() {
        points = new ArrayList<>();
        min = new PointFigure(0, 0);
        points.add(min);
        max = new PointFigure(10, 10);
        points.add(max);
        analyzer = new PointAnalyzer();
    }

    @Test
    public void whenGetMinAbscissaThenReturnMinValue() {
        final double actualMinAbscissa = analyzer.getMinAbscissa(points);
        final double expectedMinAbscissa = min.getAbscissa();
        assertTrue(expectedMinAbscissa == actualMinAbscissa);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMinAbscissaFromNullListThenReturnThrowIllegalArgumentException() {
        analyzer.getMinAbscissa(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMinAbscissaFromEmptyListThenReturnThrowIllegalArgumentException() {
        analyzer.getMinAbscissa(new ArrayList<>());
    }

    @Test
    public void whenGetMaxAbscissaThenReturnMinValue() {
        final double actualMaxAbscissa = analyzer.getMaxAbscissa(points);
        final double expectedMaxAbscissa = max.getAbscissa();
        assertTrue(expectedMaxAbscissa == actualMaxAbscissa);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMaxAbscissaFromNullListThenReturnThrowIllegalArgumentException() {
        analyzer.getMaxAbscissa(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMaxAbscissaFromEmptyListThenReturnThrowIllegalArgumentException() {
        analyzer.getMaxAbscissa(new ArrayList<>());
    }

    @Test
    public void whenGetMinOrdinateThenReturnMinValue() {
        final double actualMinOrdinate = analyzer.getMinOrdinate(points);
        final double expectedMinOrdinate = min.getOrdinate();
        assertTrue(expectedMinOrdinate == actualMinOrdinate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMinOrdinateFromNullListThenReturnThrowIllegalArgumentException() {
        analyzer.getMinOrdinate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMinOrdinateFromEmptyListThenReturnThrowIllegalArgumentException() {
        analyzer.getMinOrdinate(new ArrayList<>());
    }

    @Test
    public void whenGetMaxOrdinateThenReturnMinValue() {
        final double actualMaxOrdinate = analyzer.getMaxOrdinate(points);
        final double expectedMaxOrdinate = max.getOrdinate();
        assertTrue(expectedMaxOrdinate == actualMaxOrdinate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMaxOrdinateFromNullListThenReturnThrowIllegalArgumentException() {
        analyzer.getMaxOrdinate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetMaxOrdinateFromEmptyListThenReturnThrowIllegalArgumentException() {
        analyzer.getMaxOrdinate(new ArrayList<>());
    }
}