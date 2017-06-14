package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.*;
import com.salimov.yurii.incamp.figure.circle.Circle;
import com.salimov.yurii.incamp.figure.point.Point;
import com.salimov.yurii.incamp.figure.rectangle.Rectangle;
import com.salimov.yurii.incamp.figure.triangle.Triangle;

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
     * @return the list of a geometric figures.
     */
    List<Figure> generateFigures(int number);

    /**
     * Creates and returns a Circle geometric figure.
     *
     * @return the Circle geometric figure.
     */
    Circle generateCircle();

    /**
     * Creates and returns a Point geometric figure.
     *
     * @return the Point geometric figure.
     */
    Point generatePoint();

    /**
     * Creates and returns a Rectangle geometric figure.
     *
     * @return the Rectangle geometric figure.
     */
    Rectangle generateRectangle();

    /**
     * Creates and returns a Triangle geometric figure.
     *
     * @return the Triangle geometric figure.
     */
    Triangle generateTriangle();
}
