package com.salimov.yurii.incamp;

import com.salimov.yurii.incamp.figure.*;
import com.salimov.yurii.incamp.service.*;

import java.util.ArrayList;
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
        Generator generator = createGenerator();
        int figuresNumber = 10;
        List<Figure> figures = generator.createFigures(figuresNumber);
        
        Printer printer = createPrinter();
        printer.printlnAll(figures);
        printer.printlnWithMaxArea(figures);
        printer.printlnWithMinArea(figures);
        printer.printlnWithMaxPerimeter(figures);
        printer.printlnWithMinPerimeter(figures);
        printer.printAndDrawAll(new ArrayList<>(figures));
    }

    /**
     * Creates and returns a new Generator instance
     * for creating a geometric figures.
     *
     * @return a new Generator.
     */
    private static Generator createGenerator() {
        int maxCoordinate = 10;
        return new FigureGenerator(maxCoordinate);
    }

    /**
     * Creates and returns a new Printer instance
     * for printing a geometric figures in the console.
     *
     * @return a new Printer.
     */
    private static Printer createPrinter() {
        Analyzer analyzer = new FigureAnalyzer();
        return new FigurePrinter(analyzer);
    }
}
