package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Drawable;
import com.salimov.yurii.incamp.figure.Figure;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigurePrinterTest {

    private final static int FIGURE_NUMBER = 10;
    private final static int MAX_COORDINATE = 10;

    private static FigurePrinter printer;
    private static List<Figure> figures;

    @BeforeClass
    public static void beforeClass() {
        final Generator generator = new FigureGenerator(MAX_COORDINATE);
        figures = generator.generateFigures(FIGURE_NUMBER);
        final Analyzer analyzer = new FigureAnalyzer();
        printer = new FigurePrinter(analyzer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSetNullAnalyzerInConstructorThenThrowIllegalArgumentException() {
        new FigurePrinter(null);
    }

    @Test
    public void whenPrintlnAllThenDoIt() {
        printer.printlnAll(figures);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnAllNullListThenThrownIllegalArgumentException() {
        printer.printlnAll(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnAllEmptyListThenThrownIllegalArgumentException() {
        printer.printlnAll(new ArrayList<>());
    }

    @Test
    public void whenPrintlnThenDoIt() {
        for (Figure figure : figures) {
            printer.println(figure);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnNullFigureThenThrownIllegalArgumentException() {
        printer.println(null);
    }

    @Test
    public void whenPrintlnWithMaxAreaThenDoIt() {
        printer.printlnWithMaxArea(figures);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnNullFiguresWithMaxAreaThenThrownIllegalArgumentException() {
        printer.printlnWithMaxArea(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnEmptyFiguresWithMaxAreaThenThrownIllegalArgumentException() {
        printer.printlnWithMaxArea(new ArrayList<>());
    }

    @Test
    public void whenPrintlnWithMinAreaThenDoIt() {
        printer.printlnWithMinArea(figures);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnNullFiguresWithMinAreaThenThrownIllegalArgumentException() {
        printer.printlnWithMinArea(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnEmptyFiguresWithMinAreaThenThrownIllegalArgumentException() {
        printer.printlnWithMinArea(new ArrayList<>());
    }

    @Test
    public void whenPrintlnWithMaxPerimeterThenDoIt() {
        printer.printlnWithMaxPerimeter(figures);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnNullFiguresWithMaxPerimeterThenThrownIllegalArgumentException() {
        printer.printlnWithMaxPerimeter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnEmptyFiguresWithMaxPerimeterThenThrownIllegalArgumentException() {
        printer.printlnWithMaxPerimeter(new ArrayList<>());
    }

    @Test
    public void whenPrintlnWithMinPerimeterThenDoIt() {
        printer.printlnWithMinPerimeter(figures);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnNullFiguresWithMinPerimeterThenThrownIllegalArgumentException() {
        printer.printlnWithMinPerimeter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintlnEmptyFiguresWithMinPerimeterThenThrownIllegalArgumentException() {
        printer.printlnWithMinPerimeter(new ArrayList<>());
    }

    @Test
    public void whenDrawAllThenDoIt() {
        final List<Drawable> drawables = new ArrayList<>(figures);
        printer.drawAll(drawables);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenDrawAllNullListThenThrownIllegalArgumentException() {
        printer.drawAll(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenDrawAllEmptyListThenThrownIllegalArgumentException() {
        printer.drawAll(new ArrayList<>());
    }

    @Test
    public void whenDrawThenDoIt() {
        for (Drawable drawable : figures) {
            printer.draw(drawable);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenDrawNullThenThrownIllegalArgumentException() {
        printer.draw(null);
    }

    @Test
    public void whenPrintAndDrawAllThenDoIt() {
        printer.printAndDrawAll(figures);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintAndDrawAllNullListThenThrownIllegalArgumentException() {
        printer.printAndDrawAll(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintAndDrawAllEmptyListThenThrownIllegalArgumentException() {
        printer.printAndDrawAll(new ArrayList<>());
    }

    @Test
    public void whenPrintAndDrawThenDoIt() {
        for (Figure figure : figures) {
            printer.printAndDraw(figure);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPrintAndDrawNullThenThrownIllegalArgumentException() {
        printer.printAndDraw(null);
    }
}
