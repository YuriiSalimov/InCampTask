package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.Figure;

import java.util.List;

/**
 * The class implements a set of methods
 * for analyzing an incoming figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureAnalyzer implements Analyzer {

    /**
     * Returns a figure with a maximum area.
     *
     * @param figures the figure list to analyze.
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
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return a figure with a maximum area.
     */
    @Override
    public Figure getWithMaxArea(Figure first, Figure second) {
        return areaAnalyzer(first, second) ? first : second;
    }

    /**
     * Returns a figure with a minimum area.
     *
     * @param figures the figure list to analyze.
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
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return a figure with a minimum area.
     */
    @Override
    public Figure getWithMinArea(Figure first, Figure second) {
        return areaAnalyzer(first, second) ? second : first;
    }

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figures the figure list to analyze.
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
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return a figure with a maximum perimeter.
     */
    @Override
    public Figure getWithMaxPerimeter(Figure first, Figure second) {
        return perimeterAnalyzer(first, second) ? first : second;
    }

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figures the figure list to analyze.
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
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return a figure with a minimum perimeter.
     */
    @Override
    public Figure getWithMinPerimeter(Figure first, Figure second) {
        return perimeterAnalyzer(first, second) ? second : first;
    }

    /**
     * Analyzes a incoming geometric figures by area.
     *
     * @param more the geometric figure with more area.
     * @param less the geometric figure with less area.
     * @return true if area of a "more" figure is more
     * of area of a "less" figure, false otherwise.
     */
    private static boolean areaAnalyzer(Figure more, Figure less) {
        return (more.getArea() > less.getArea());
    }

    /**
     * Analyzes a incoming geometric figures by perimeter.
     *
     * @param more the geometric figure with more perimeter.
     * @param less the geometric figure with less perimeter.
     * @return true if perimeter of a "more" figure is more
     * of perimeter of a "less" figure, false otherwise.
     */
    private static boolean perimeterAnalyzer(Figure more, Figure less) {
        return (more.getPerimeter() > less.getPerimeter());
    }
}
