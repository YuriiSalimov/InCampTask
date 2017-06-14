package com.salimov.yurii.incamp;

import com.salimov.yurii.incamp.figure.Figure;
import com.salimov.yurii.incamp.service.*;

import java.util.List;

/**
 * Main class.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    /**
     * The figures number.
     */
    private final static int FIGURES_NUMBER = 10;

    /**
     * The maximum coordinate of a geometric figures.
     */
    private final static int MAX_COORDINATE = 25;

    public static void main(String[] args) {
        Generator generator = getGenerator();
        List<Figure> figures = generator.generateFigures(FIGURES_NUMBER);

        Printer printer = getPrinter();
        printer.printlnAll(figures);
        printer.printlnWithMaxArea(figures);
        printer.printlnWithMinArea(figures);
        printer.printlnWithMaxPerimeter(figures);
        printer.printlnWithMinPerimeter(figures);
        printer.printAndDrawAll(figures);
    }

    /**
     * Creates and returns a new Generator instance
     * for creating a geometric figures.
     *
     * @return the new Generator.
     */
    private static Generator getGenerator() {
        return new FigureGenerator(MAX_COORDINATE);
    }

    /**
     * Creates and returns a new Printer instance
     * for printing a geometric figures in the console.
     *
     * @return the new Printer.
     */
    private static Printer getPrinter() {
        Analyzer analyzer = getAnalyzer();
        return new FigurePrinter(analyzer);
    }

    /**
     * Creates and returns a new Printer instance
     * for analyzing an incoming figures.
     *
     * @return the new Analyzer.
     */
    private static Analyzer getAnalyzer() {
        return new FigureAnalyzer();
    }
}
