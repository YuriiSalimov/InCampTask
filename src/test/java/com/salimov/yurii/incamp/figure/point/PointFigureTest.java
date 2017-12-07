package com.salimov.yurii.incamp.figure.point;

import com.salimov.yurii.incamp.figure.AbstractFigureTest;
import com.salimov.yurii.incamp.figure.Builder;
import com.salimov.yurii.incamp.figure.circle.Circle;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class PointFigureTest extends AbstractFigureTest {

    private final static String NAME = "Point";
    private final static double ABSCISSA = 10;
    private final static double ORDINATE = 10;

    private static PointFigure point;

    @BeforeClass
    public static void beforeClass() {
        point = new PointFigure(ABSCISSA, ORDINATE);
    }

    @Test
    public void toStringTest() {
        final String actualString = NAME +
                ": perimeter = " + point.getPerimeter() +
                ", area = " + point.getArea() +
                ", abscissa = " + point.getAbscissa() +
                ", ordinate = " + point.getOrdinate();
        assertEquals(point.toString(), actualString);
    }

    @Test
    public void whenGetAreaThenReturnZero() {
        final double actualArea = 0;
        final double expectedArea = point.getArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    public void whenGetPerimeterThenReturnZero() {
        final double actualPerimeter = 0;
        final double expectedPerimeter = point.getPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }

    @Test
    public void whenGetAbscissaThenReturnValidValue() {
        final double expectedAbscissa = point.getAbscissa();
        assertTrue(expectedAbscissa == ABSCISSA);
    }

    @Test
    public void whenGetOrdinateThenReturnValidValue() {
        final double expectedOrdinate = point.getOrdinate();
        assertTrue(expectedOrdinate == ORDINATE);
    }

    @Test
    public void whenGetBuilderThenReturnNotNull() {
        final Builder<Point> builder = Point.getBuilder();
        assertNotNull(builder);
    }

    @Override
    protected String getName() {
        return NAME;
    }

    @Override
    protected PointFigure getFigure() {
        return point;
    }
}