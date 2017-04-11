package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;

import java.util.List;

/**
 * The class implements a set of methods
 * for printing a geometric figures in the console.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureAnalyzer implements Analyzer {

    /**
     * Returns a figure with a maximum area.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a maximum area.
     */
    @Override
    public Figure getWithMaxArea(List<Figure> figures) {
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMaxArea(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a maximum area.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a maximum area.
     */
    @Override
    public Figure getWithMaxArea(Figure figure1, Figure figure2) {
        return areaAnalyzer(figure1, figure2) ? figure1 : figure2;
    }

    /**
     * Returns a figure with a minimum area.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a minimum area.
     */
    @Override
    public Figure getWithMinArea(List<Figure> figures) {
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMinArea(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a minimum area.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a minimum area.
     */
    @Override
    public Figure getWithMinArea(Figure figure1, Figure figure2) {
        return areaAnalyzer(figure1, figure2) ? figure2 : figure1;
    }

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a maximum perimeter.
     */
    @Override
    public Figure getWithMaxPerimeter(List<Figure> figures) {
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMaxPerimeter(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a maximum perimeter.
     */
    @Override
    public Figure getWithMaxPerimeter(Figure figure1, Figure figure2) {
        return perimeterAnalyzer(figure1, figure2) ? figure1 : figure2;
    }

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figures a figure list to analyze.
     * @return a figure with a maximum perimeter.
     */
    public Figure getWithMinPerimeter(List<Figure> figures) {
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMinPerimeter(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figure1 a first figure to analyze.
     * @param figure2 a second figure to analyze.
     * @return a figure with a minimum perimeter.
     */
    @Override
    public Figure getWithMinPerimeter(Figure figure1, Figure figure2) {
        return perimeterAnalyzer(figure1, figure2) ? figure2 : figure1;
    }

    /**
     * Analyzes a incoming geometric figures by area.
     *
     * @param more a geometric figure with more area.
     * @param less a geometric figure with less area.
     * @return true if area of a "more" figure is more
     * of area of a "less" figure, false otherwise.
     */
    private static boolean areaAnalyzer(Figure more, Figure less) {
        return (more.getArea() > less.getArea());
    }

    /**
     * Analyzes a incoming geometric figures by perimeter.
     *
     * @param more a geometric figure with more perimeter.
     * @param less a geometric figure with less perimeter.
     * @return true if perimeter of a "more" figure is more
     * of perimeter of a "less" figure, false otherwise.
     */
    private static boolean perimeterAnalyzer(Figure more, Figure less) {
        return (more.getPerimeter() > less.getPerimeter());
    }
}
