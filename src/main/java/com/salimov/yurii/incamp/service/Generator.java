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
     * @param number the figures number.
     * @return a list of a geometric figures.
     */
    List<Figure> getFigures(int number);

    /**
     * Creates and returns a Circle geometric figure.
     *
     * @return a Circle geometric figure.
     */
    Circle getCircle();

    /**
     * Creates and returns a Point geometric figure.
     *
     * @return a Point geometric figure.
     */
    Point getPoint();

    /**
     * Creates and returns a Rectangle geometric figure.
     *
     * @return a Rectangle geometric figure.
     */
    Rectangle getRectangle();

    /**
     * Creates and returns a Triangle geometric figure.
     *
     * @return a Triangle geometric figure.
     */
    Triangle getTriangle();
}
