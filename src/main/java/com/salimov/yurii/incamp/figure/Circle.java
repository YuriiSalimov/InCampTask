package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a Circle geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Circle extends Figure {

    /**
     * Returns a circle radius.
     *
     * @return a circle radius.
     */
    double getRadius();

    /**
     * Sets a new radius for a circle.
     *
     * @param radius a new circle radius.
     */
    void setRadius(double radius);

    /**
     * Calculates and returns a circle diameter.
     *
     * @return a circle diameter.
     */
    double getDiameter();

    /**
     * Sets a new diameter for a circle.
     *
     * @param diameter a new circle diameter.
     */
    void setDiameter(double diameter);

    /**
     * Calculates and returns a circle center point.
     *
     * @return a circle center point.
     */
    Point getCentre();
}
