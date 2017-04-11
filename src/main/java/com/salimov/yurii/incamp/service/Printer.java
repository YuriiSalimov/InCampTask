package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Drawable;
import com.salimov.yurii.incamp.figure.Figure;

import java.util.List;

/**
 * The interface describes a set of methods
 * for printing a geometric figures in the console.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Printer {

    /**
     * Prints a incoming geometric figures in the console.
     *
     * @param figures a figure list to print.
     */
    void printlnAll(List<Figure> figures);

    /**
     * Prints a incoming geometric figure in the console.
     *
     * @param figure a figure to print.
     */
    void println(Figure figure);

    /**
     * Prints a geometric figures with a maximum area.
     *
     * @param figures a figure list to analyze.
     */
    void printlnWithMaxArea(List<Figure> figures);

    /**
     * Prints a geometric figures with a minimum area.
     *
     * @param figures a figure list to analyze.
     */
    void printlnWithMinArea(List<Figure> figures);

    /**
     * Prints a geometric figures with a maximum perimeter.
     *
     * @param figures a figure list to analyze.
     */
    void printlnWithMaxPerimeter(List<Figure> figures);

    /**
     * Prints a geometric figures with a minimum perimeter.
     *
     * @param figures a figure list to analyze.
     */
    void printlnWithMinPerimeter(List<Figure> figures);

    /**
     * Draws a incoming geometric figures in the console.
     *
     * @param figures a figure list to draw.
     */
    void drawAll(List<Drawable> figures);

    /**
     * Draws a incoming geometric figure in the console.
     *
     * @param figure a figure to draw.
     */
    void draw(Drawable figure);

    /**
     * Prints and draws a incoming geometric figures in the console.
     *
     * @param figures a figure list to print and draw.
     */
    void printAndDrawAll(List<Figure> figures);

    /**
     * Prints and draws a incoming geometric figure in the console.
     *
     * @param figure a figure to print and draw.
     */
    void printAndDraw(Figure figure);
}
