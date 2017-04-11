package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Drawable;
import com.salimov.yurii.incamp.figure.Figure;

import java.util.List;

/**
 * The class implements a set of methods
 * for analyzing a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigurePrinter implements Printer {

    /**
     * Analyzer instance for analyzing a geometric figures.
     */
    private Analyzer analyzer;

    /**
     * Constructor.
     *
     * @param analyzer a Analyzer instance for analyzing a geometric figures.
     */
    public FigurePrinter(Analyzer analyzer) {
        this.analyzer = analyzer;
    }

    /**
     * Prints a incoming geometric figures in the console.
     *
     * @param figures a figure list to print.
     */
    @Override
    public void printlnAll(List<Figure> figures) {
        System.out.println("\nAll Figures:");
        figures.forEach(this::println);
    }

    /**
     * Prints a incoming geometric figure in the console.
     *
     * @param figure a figure to print.
     */
    @Override
    public void println(Figure figure) {
        System.out.println(figure);
    }

    /**
     * Prints a geometric figures with a maximum area.
     *
     * @param figures a figure list to analyze.
     */
    @Override
    public void printlnWithMaxArea(List<Figure> figures) {
        System.out.println("\nFigure with max area:");
        Figure figureWithMaxArea = analyzer.getWithMaxArea(figures);
        System.out.println(figureWithMaxArea);
    }

    /**
     * Prints a geometric figures with a minimum area.
     *
     * @param figures a figure list to analyze.
     */
    @Override
    public void printlnWithMinArea(List<Figure> figures) {
        System.out.println("\nFigure with min area:");
        Figure figureWithMinArea = analyzer.getWithMinArea(figures);
        System.out.println(figureWithMinArea);
    }

    /**
     * Prints a geometric figures with a maximum perimeter.
     *
     * @param figures a figure list to analyze.
     */
    @Override
    public void printlnWithMaxPerimeter(List<Figure> figures) {
        System.out.println("\nFigure with max perimeter:");
        Figure figureWithMaxPerimeter = analyzer.getWithMaxPerimeter(figures);
        System.out.println(figureWithMaxPerimeter);
    }

    /**
     * Prints a geometric figures with a minimum perimeter.
     *
     * @param figures a figure list to analyze.
     */
    @Override
    public void printlnWithMinPerimeter(List<Figure> figures) {
        System.out.println("\nFigure with min perimeter:");
        Figure figureWithMinPerimeter = analyzer.getWithMinPerimeter(figures);
        System.out.println(figureWithMinPerimeter);
    }

    /**
     * Draws a incoming geometric figures in the console.
     *
     * @param figures a figure list to draw.
     */
    @Override
    public void drawAll(List<Drawable> figures) {
        System.out.println("\nAll Figures:");
        figures.forEach(this::draw);
    }

    /**
     * Draws a incoming geometric figure in the console.
     *
     * @param figure a figure to draw.
     */
    @Override
    public void draw(Drawable figure) {
        figure.draw();
    }

    /**
     * Prints and draws a incoming geometric figures in the console.
     *
     * @param figures a figure list to print and draw.
     */
    @Override
    public void printAndDrawAll(List<Figure> figures) {
        System.out.println("\nAll Figures:");
        figures.forEach(this::printAndDraw);
    }

    /**
     * Prints and draws a incoming geometric figure in the console.
     *
     * @param figure a figure to print and draw.
     */
    @Override
    public void printAndDraw(Figure figure) {
        println(figure);
        draw(figure);
        System.out.println();
    }
}
