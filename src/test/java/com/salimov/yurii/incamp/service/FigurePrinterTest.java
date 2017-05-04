package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigurePrinterTest {

    private static Printer printer;
    private static List<Figure> figures;

    @BeforeClass
    public static void beforeClass() throws Exception {
        Analyzer analyzer = new FigureAnalyzer();
        printer = new FigurePrinter(analyzer);

        int maxCoordinate = 10;
        int figureNumber = 10;
        Generator generator = new FigureGenerator(maxCoordinate);
        figures = generator.getFigures(figureNumber);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullParameter() throws Exception {
        new FigurePrinter(null);
    }

    @Test
    public void printlnAll() throws Exception {
        printer.printlnAll(figures);
    }

    @Test
    public void println() throws Exception {
        Figure figure = getRandomFigure();
        printer.println(figure);
    }

    @Test
    public void printlnWithMaxArea() throws Exception {
        printer.printlnWithMaxArea(figures);
    }

    @Test
    public void printlnWithMinArea() throws Exception {
        printer.printlnWithMinArea(figures);
    }

    @Test
    public void printlnWithMaxPerimeter() throws Exception {
        printer.printlnWithMaxPerimeter(figures);
    }

    @Test
    public void printlnWithMinPerimeter() throws Exception {
        printer.printlnWithMinPerimeter(figures);
    }

    @Test
    public void drawAll() throws Exception {
        printer.drawAll(new ArrayList<>(figures));
    }

    @Test
    public void draw() throws Exception {
        Figure figure = getRandomFigure();
        printer.draw(figure);
    }

    @Test
    public void printAndDraw() throws Exception {
        Figure figure = getRandomFigure();
        printer.printAndDraw(figure);
    }

    @Test
    public void printAndDrawAll() throws Exception {
        printer.printAndDrawAll(figures);
    }

    private Figure getRandomFigure() {
        Random random = new Random();
        return figures.get(random.nextInt(figures.size()));
    }
}
