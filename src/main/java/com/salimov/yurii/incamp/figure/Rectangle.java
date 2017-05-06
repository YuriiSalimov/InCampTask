package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a Rectangle geometric figures.
 * <pre>
 *               w i d t h
 *       A |←----------------→| B
 *      -- * * * * * * * * * * *
 *   h  ↑  * * * * * * * * * * *
 *   e  |  * * * * * * * * * * *
 *   i  |  * * * * * * * * * * *
 *   g  |  * * * * * * * * * * *
 *   h  |  * * * * * * * * * * *
 *   t  ↓  * * * * * * * * * * *
 *      -- * * * * * * * * * * *
 *       C                       D
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Rectangle extends Figure {

    /**
     * Returns a rectangle width.
     *
     * @return the rectangle width.
     */
    double getWidth();

    /**
     * Returns a rectangle height.
     *
     * @return the rectangle height.
     */
    double getHeight();

    /**
     * Calculates and returns a point A of a rectangle.
     *
     * @return the point A of a rectangle.
     */
    Point getPointA();

    /**
     * Calculates and returns a point B of a rectangle.
     *
     * @return the point B of a rectangle.
     */
    Point getPointB();

    /**
     * Calculates and returns a point C of a rectangle.
     *
     * @return the point C of a rectangle.
     */
    Point getPointC();

    /**
     * Calculates and returns a point D of a rectangle.
     *
     * @return the point D of a rectangle.
     */
    Point getPointD();
}
