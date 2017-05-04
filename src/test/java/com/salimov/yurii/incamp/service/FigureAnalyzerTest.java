package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureAnalyzerTest {

    private static List<Figure> figures;
    private static Analyzer analyzer;

    @BeforeClass
    public static void beforeClass() throws Exception {
        int maxCoordinate = 10;
        int figureNumber = 1000;
        Generator generator = new FigureGenerator(maxCoordinate);
        figures = generator.getFigures(figureNumber);
        analyzer = new FigureAnalyzer();
    }

    @Test
    public void getWithMaxArea() throws Exception {
        Figure figure = analyzer.getWithMaxArea(figures);
        Assert.assertTrue(figure != null);
    }

    @Test
    public void getWithMaxArea1() throws Exception {
        Figure figure0 = getRandomFigure();
        Figure figure1 = getRandomFigure();
        Figure figure = analyzer.getWithMaxArea(figure0, figure1);
        Assert.assertTrue(figure != null);
        Assert.assertTrue(figure.equals(figure0) || figure.equals(figure1));
    }

    @Test
    public void getWithMinArea() throws Exception {
        Figure figure = analyzer.getWithMinArea(figures);
        Assert.assertTrue(figure != null);
    }

    @Test
    public void getWithMinArea1() throws Exception {
        Figure figure0 = getRandomFigure();
        Figure figure1 = getRandomFigure();
        Figure figure = analyzer.getWithMinArea(figure0, figure1);
        Assert.assertTrue(figure != null);
        Assert.assertTrue(figure.equals(figure0) || figure.equals(figure1));
    }

    @Test
    public void getWithMaxPerimeter() throws Exception {
        Figure figure = analyzer.getWithMaxPerimeter(figures);
        Assert.assertTrue(figure != null);
    }

    @Test
    public void getWithMaxPerimeter1() throws Exception {
        Figure figure0 = getRandomFigure();
        Figure figure1 = getRandomFigure();
        Figure figure = analyzer.getWithMaxPerimeter(figure0, figure1);
        Assert.assertTrue(figure != null);
        Assert.assertTrue(figure.equals(figure0) || figure.equals(figure1));
    }

    @Test
    public void getWithMinPerimeter() throws Exception {
        Figure figure = analyzer.getWithMinPerimeter(figures);
        Assert.assertTrue(figure != null);
    }

    @Test
    public void getWithMinPerimeter1() throws Exception {
        Figure figure0 = getRandomFigure();
        Figure figure1 = getRandomFigure();
        Figure figure = analyzer.getWithMinPerimeter(figure0, figure1);
        Assert.assertTrue(figure != null);
        Assert.assertTrue(figure.equals(figure0) || figure.equals(figure1));
    }


    private Figure getRandomFigure() {
        Random random = new Random();
        return figures.get(random.nextInt(figures.size()));
    }
}