package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.*;

import java.util.List;

/**
 * The interface describes a set of methods
 * for creating a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Generator {

    /**
     * Creates and returns a list of a geometric figures.
     *
     * @param number a figures number.
     * @return a list of a geometric figures.
     */
    List<Figure> createFigures(int number);

    /**
     * Creates and returns a Circle geometric figure.
     *
     * @return a Circle geometric figure.
     */
    Circle createCircle();

    /**
     * Creates and returns a Point geometric figure.
     *
     * @return a Point geometric figure.
     */
    Point createPoint();

    /**
     * Creates and returns a Rectangle geometric figure.
     *
     * @return a Rectangle geometric figure.
     */
    Rectangle createRectangle();

    /**
     * Creates and returns a Triangle geometric figure.
     *
     * @return a Triangle geometric figure.
     */
    Triangle createTriangle();
}
