package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureAnalyzerTest {

    private final static Random RANDOM = new Random();
    private final static int MAX_COORDINATE = 10;
    private final static int FIGURE_NUMBER = 10;

    private static List<Figure> figures;
    private static Analyzer analyzer;

    @BeforeClass
    public static void beforeClass() throws Exception {
        final Generator generator = new FigureGenerator(MAX_COORDINATE);
        figures = generator.generateFigures(FIGURE_NUMBER);
        analyzer = new FigureAnalyzer();
    }

    @Test
    public void whenGetWithMaxAreaThenReturnNotNull() throws Exception {
        final Figure figure = analyzer.getWithMaxArea(figures);
        assertNotNull(figure);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxAreaFromNullCollectionThenThrowIllegalArgumentException() throws Exception {
        analyzer.getWithMaxArea(null);
    }

    @Test
    public void whenGetWithMaxAreaFromTwoFigureThenReturnNotNull() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMaxArea = analyzer.getWithMaxArea(first, second);
        assertTrue(withMaxArea != null);
    }

    @Test
    public void whenGetWithMaxAreaFromTwoFigureThenReturnValidFigure() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMaxArea = analyzer.getWithMaxArea(first, second);
        assertTrue(withMaxArea.equals(first) || withMaxArea.equals(second));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxAreaFromNullFirstFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMaxArea(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxAreaFromNullSecondFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMaxArea(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxAreaFromNullFiguresThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = null;
        analyzer.getWithMaxArea(first, second);
    }

    @Test
    public void whenGetWithMinAreaThenReturnNotNull() throws Exception {
        final Figure figure = analyzer.getWithMinArea(figures);
        assertNotNull(figure);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinAreaFromNullCollectionThenThrowIllegalArgumentException() throws Exception {
        analyzer.getWithMinArea(null);
    }

    @Test
    public void whenGetWithMinAreaFromTwoFigureThenReturnNotNull() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMinArea = analyzer.getWithMinArea(first, second);
        assertNotNull(withMinArea);
    }

    @Test
    public void whenGetWithMinAreaFromTwoFigureThenReturnValidFigure() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMinArea = analyzer.getWithMaxArea(first, second);
        assertTrue(withMinArea.equals(first) || withMinArea.equals(second));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinAreaFromNullFirstFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMinArea(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinAreaFromNullSecondFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMinArea(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinAreaFromNullFiguresThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = null;
        analyzer.getWithMinArea(first, second);
    }

    @Test
    public void whenGetWithMaxPerimeterThenReturnNotNull() throws Exception {
        final Figure figure = analyzer.getWithMaxPerimeter(figures);
        assertNotNull(figure);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxPerimeterFromNullCollectionThenThrowIllegalArgumentException() throws Exception {
        analyzer.getWithMaxPerimeter(null);
    }

    @Test
    public void whenGetWithMaxPerimeterFromTwoFigureThenReturnNotNull() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMaxPerimeter = analyzer.getWithMaxPerimeter(first, second);
        assertNotNull(withMaxPerimeter);
    }

    @Test
    public void whenGetWithMaxPerimeterFromTwoFigureThenReturnValidFigure() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMaxPerimeter = analyzer.getWithMaxPerimeter(first, second);
        assertTrue(withMaxPerimeter.equals(first) || withMaxPerimeter.equals(second));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxPerimeterFromNullFirstFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMaxPerimeter(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxPerimeterFromNullSecondFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMaxPerimeter(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMaxPerimeterFromNullFiguresThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = null;
        analyzer.getWithMaxPerimeter(first, second);
    }

    @Test
    public void whenGetWithMinPerimeterThenReturnNotNull() throws Exception {
        final Figure figure = analyzer.getWithMinPerimeter(figures);
        assertNotNull(figure);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinPerimeterFromNullCollectionThenThrowIllegalArgumentException() throws Exception {
        analyzer.getWithMinPerimeter(null);
    }

    @Test
    public void whenGetWithMinPerimeterFromTwoFigureThenReturnNotNull() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMinPerimeter = analyzer.getWithMinPerimeter(first, second);
        assertNotNull(withMinPerimeter);
    }

    @Test
    public void whenGetWithMinPerimeterFromTwoFigureThenReturnValidFigure() throws Exception {
        final Figure first = getRandomFigure();
        final Figure second = getRandomFigure();
        final Figure withMinPerimeter = analyzer.getWithMinPerimeter(first, second);
        assertTrue(withMinPerimeter.equals(first) || withMinPerimeter.equals(second));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinPerimeterFromNullFirstFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMinPerimeter(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinPerimeterFromNullSecondFigureThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = getRandomFigure();
        analyzer.getWithMinPerimeter(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGetWithMinPerimeterFromNullFiguresThenThrowIllegalArgumentException() throws Exception {
        final Figure first = null;
        final Figure second = null;
        analyzer.getWithMinPerimeter(first, second);
    }

    private Figure getRandomFigure() {
        final int index = RANDOM.nextInt(figures.size());
        return figures.get(index);
    }
}