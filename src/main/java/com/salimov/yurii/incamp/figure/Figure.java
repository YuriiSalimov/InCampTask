package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Figure extends Drawable {

    /**
     * Calculates and returns a figure area.
     *
     * @return the figure area.
     */
    double getArea();

    /**
     * Calculates and returns a figure perimeter.
     *
     * @return the figure perimeter.
     */
    double getPerimeter();

    /**
     * Returns a figure name.
     *
     * @return the figure name
     */
    String getName();
}
