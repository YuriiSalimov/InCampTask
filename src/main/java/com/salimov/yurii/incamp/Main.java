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
     * Main method.
     *
     * @param args a incoming parameters.
     */
    public static void main(String[] args) {
        Generator generator = getGenerator();
        int figuresNumber = 10;
        List<Figure> figures = generator.getFigures(figuresNumber);

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
     * @return a new Generator.
     */
    private static Generator getGenerator() {
        int maxCoordinate = 10;
        return new FigureGenerator(maxCoordinate);
    }

    /**
     * Creates and returns a new Printer instance
     * for printing a geometric figures in the console.
     *
     * @return a new Printer.
     */
    private static Printer getPrinter() {
        Analyzer analyzer = getAnalyzer();
        return new FigurePrinter(analyzer);
    }

    /**
     * Creates and returns a new Printer instance
     * for analyzing an incoming figures.
     *
     * @return a new Analyzer.
     */
    private static Analyzer getAnalyzer() {
        return new FigureAnalyzer();
    }
}
