package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;

import java.util.List;

/**
 * The interface describes a set of methods
 * for analyzing a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Analyzer {

    /**
     * Returns a figure with a maximum area.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a maximum area.
     */
    Figure getWithMaxArea(List<Figure> figures);

    /**
     * Returns a figure with a maximum area.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a maximum area.
     */
    Figure getWithMaxArea(Figure figure1, Figure figure2);

    /**
     * Returns a figure with a minimum area.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a minimum area.
     */
    Figure getWithMinArea(List<Figure> figures);

    /**
     * Returns a figure with a minimum area.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a minimum area.
     */
    Figure getWithMinArea(Figure figure1, Figure figure2);

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a maximum perimeter.
     */
    Figure getWithMaxPerimeter(List<Figure> figures);

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a maximum perimeter.
     */
    Figure getWithMaxPerimeter(Figure figure1, Figure figure2);

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a maximum perimeter.
     */
    Figure getWithMinPerimeter(List<Figure> figures);

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a minimum perimeter.
     */
    Figure getWithMinPerimeter(Figure figure1, Figure figure2);
}
