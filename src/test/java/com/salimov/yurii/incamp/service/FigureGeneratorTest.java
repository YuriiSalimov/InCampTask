package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;
import com.salimov.yurii.incamp.figure.circle.Circle;
import com.salimov.yurii.incamp.figure.point.Point;
import com.salimov.yurii.incamp.figure.rectangle.Rectangle;
import com.salimov.yurii.incamp.figure.triangle.Triangle;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureGeneratorTest {

    private final static int FIGURE_NUMBER = 10;
    private final static int MAX_COORDINATE = 10;

    private static FigureGenerator generator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        generator = new FigureGenerator(MAX_COORDINATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSetNegativeCoordinateInConstructorThenThrowIllegalArgumentException() {
        new FigureGenerator(-10);
    }

    @Test
    public void whenGenerateFiguresThenReturnNotEmptyList() {
        final List<Figure> figures  = generator.generateFigures(FIGURE_NUMBER);
        assertFalse(figures.isEmpty());
    }

    @Test
    public void whenGenerateFiguresThenReturnListWithNotNullFigures() {
        final List<Figure> figures  = generator.generateFigures(FIGURE_NUMBER);
        figures.forEach(Assert::assertNotNull);
    }

    @Test
    public void whenGenerateFiguresWithNegativeNumberThenReturnEmptyList() {
        final List<Figure> figures  = generator.generateFigures(-FIGURE_NUMBER);
        assertTrue(figures.isEmpty());
    }

    @Test
    public void whenGenerateCircleThenReturnNoNull() {
        final Circle circle = generator.generateCircle();
        assertNotNull(circle);
    }

    @Test
    public void whenGeneratePointThenReturnNoNull() {
        final Point point = generator.generatePoint();
        assertNotNull(point);
    }

    @Test
    public void whenGenerateRectangleThenReturnNoNull() {
        final Rectangle rectangle = generator.generateRectangle();
        assertNotNull(rectangle);
    }

    @Test
    public void whenGenerateTriangleThenReturnNoNull() {
        final Triangle triangle = generator.generateTriangle();
        assertNotNull(triangle);
    }

    @Test
    public void wnenCallDefaultConstructorThenReturnNewGenerator() {
        final Generator generator = new FigureGenerator();
        assertNotNull(generator);
    }
}
