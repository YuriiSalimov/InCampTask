package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureGeneratorTest {

    private final static int MAX_COORDINATE = 10;
    private final static int FIGURE_NUMBER = 100;

    private static FigureGenerator generator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        generator = new FigureGenerator(MAX_COORDINATE);
        Assert.assertNotNull(generator);
    }

    @Test
    public void createFigures() throws Exception {
        List<Figure> figures = generator.createFigures(FIGURE_NUMBER);
        Assert.assertTrue(figures.size() == FIGURE_NUMBER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createFiguresWithNegativeNumber() throws Exception {
        generator.createFigures(-FIGURE_NUMBER);
    }

    @Test
    public void createCircle() throws Exception {
        Circle circle = generator.createCircle();
        Assert.assertNotNull(circle);
    }

    @Test
    public void createPoint() throws Exception {
        Point point = generator.createPoint();
        Assert.assertNotNull(point);
    }

    @Test
    public void createRectangle() throws Exception {
        Rectangle rectangle = generator.createRectangle();
        Assert.assertNotNull(rectangle);
    }

    @Test
    public void createTriangle() throws Exception {
        Triangle triangle;
        for (int i = 0; i < FIGURE_NUMBER; i++) {
            triangle = generator.createTriangle();
            Assert.assertNotNull(triangle);
            Assert.assertTrue(triangle.isTriangle());
        }
    }

    @Test
    public void getMaxCoordinate() throws Exception {
        Assert.assertTrue(generator.getMaxCoordinate() >= 0);
    }

    @Test
    public void setMaxCoordinate() throws Exception {
        generator.setMaxCoordinate(MAX_COORDINATE);
        Assert.assertTrue(generator.getMaxCoordinate() == MAX_COORDINATE);
    }

    @Test
    public void whenSetNegativeMaxCoordinateThenGetZero() throws Exception {
        generator.setMaxCoordinate(-MAX_COORDINATE);
        Assert.assertTrue(generator.getMaxCoordinate() == 0);
        generator.setMaxCoordinate(MAX_COORDINATE);
    }

    @Test
    public void defaultConstructor() throws Exception {
        Generator generator = new FigureGenerator();
        Assert.assertNotNull(generator);
    }
}
