package com.salimov.yurii.incamp.figure.circle;

import com.salimov.yurii.incamp.figure.AbstractFigureTest;
import com.salimov.yurii.incamp.figure.Builder;
import com.salimov.yurii.incamp.figure.point.Point;
import com.salimov.yurii.incamp.figure.point.PointBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class CircleFigureTest extends AbstractFigureTest {

    private final static String NAME = "Circle";
    private final static double RADIUS = 10;

    private static CircleFigure circle;

    @BeforeClass
    public static void beforeClass() {
        circle = new CircleFigure(RADIUS);
    }

    @Test
    public void whenGetAreaThenReturnValidValue() {
        final double actualArea = Math.PI * RADIUS * RADIUS;
        final double expectedArea = circle.getArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    public void whenGetPerimeterThenReturnValidValue() {
        final double actualPerimeter = 2 * Math.PI * RADIUS;
        final double expectedPerimeter = circle.getPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }

    @Test
    public void toStringTest() {
        final String actualString = NAME +
                ": perimeter = " + circle.getPerimeter() +
                ", area = " + circle.getArea() +
                ", radius = " + circle.getRadius() +
                ", diameter = " + circle.getDiameter();
        assertEquals(circle.toString(), actualString);
    }

    @Test
    public void whenGetRadiusThenReturnValidValue() {
        final double expectedRadius = circle.getRadius();
        assertTrue(expectedRadius == RADIUS);
    }

    @Test
    public void whenGetDiameterThenReturnValidValue() {
        final double actualDiameter = 2 * RADIUS;
        final double expectedDiameter = circle.getDiameter();
        assertTrue(expectedDiameter == actualDiameter);
    }

    @Test
    public void whenGetCentrePointThenReturnValidValue() {
        final PointBuilder builder = Point.getBuilder();
        builder.addAbscissa(RADIUS).addOrdinate(RADIUS);
        final Point actualCentre = builder.build();
        final Point expectedCentre = circle.getCentre();
        assertEquals(actualCentre, expectedCentre);
    }

    @Test
    public void whenGetBuilderThenReturnNotNull() {
        final Builder<Circle> builder = Circle.getBuilder();
        assertNotNull(builder);
    }

    @Override
    protected String getName() {
        return NAME;
    }

    @Override
    protected CircleFigure getFigure() {
        return circle;
    }
}