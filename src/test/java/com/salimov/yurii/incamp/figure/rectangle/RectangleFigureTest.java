package com.salimov.yurii.incamp.figure.rectangle;

import com.salimov.yurii.incamp.figure.AbstractFigureTest;
import com.salimov.yurii.incamp.figure.Builder;
import com.salimov.yurii.incamp.figure.circle.Circle;
import com.salimov.yurii.incamp.figure.point.Point;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class RectangleFigureTest extends AbstractFigureTest {

    private final static String NAME = "Rectangle";
    private final static double WIDTH = 5;
    private final static double HEIGHT = 10;

    private static RectangleFigure rectangle;

    @BeforeClass
    public static void beforeClass() {
        rectangle = new RectangleFigure(WIDTH, HEIGHT);
    }

    @Test
    public void whenGetAreaThenReturnValidValue() {
        final double actualArea = WIDTH * HEIGHT;
        final double expectedArea = rectangle.getArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    public void whenGetPerimeterThenReturnValidValue() {
        final double actualPerimeter = 2 * (WIDTH + HEIGHT);
        final double expectedPerimeter = rectangle.getPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }

    @Test
    public void toStringTest() {
        final String actualString = NAME +
                ": perimeter = " + rectangle.getPerimeter() +
                ", area = " + rectangle.getArea() +
                ", width = " + rectangle.getWidth() +
                ", height = " + rectangle.getHeight();
        assertEquals(rectangle.toString(), actualString);
    }

    @Test
    public void whenGetWidthThenReturnValidValue() {
        final double expectedWidth = rectangle.getWidth();
        assertTrue(expectedWidth == WIDTH);
    }

    @Test
    public void whenGetHeightThenReturnValidValue() {
        final double expectedHeight = rectangle.getHeight();
        assertTrue(expectedHeight == HEIGHT);
    }

    @Test
    public void whenGetPointAThenReturnValidValue() {
        final Point actualPoint = createPoint(0, 0);
        final Point expectedPoint = rectangle.getPointA();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenGetPointBThenReturnValidValue() {
        final Point actualPoint = createPoint(0, WIDTH);
        final Point expectedPoint = rectangle.getPointB();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenGetPointCThenReturnValidValue() {
        final Point actualPoint = createPoint(HEIGHT, WIDTH);
        final Point expectedPoint = rectangle.getPointC();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenGetPointDThenReturnValidValue() {
        final Point actualPoint = createPoint(HEIGHT, 0);
        final Point expectedPoint = rectangle.getPointD();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenGetBuilderThenReturnNotNull() {
        final Builder<Rectangle> builder = Rectangle.getBuilder();
        assertNotNull(builder);
    }

    @Override
    protected String getName() {
        return NAME;
    }

    @Override
    protected RectangleFigure getFigure() {
        return rectangle;
    }
}