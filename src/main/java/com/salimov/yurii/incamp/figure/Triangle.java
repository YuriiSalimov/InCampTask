package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a Triangle geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Triangle extends Figure {

    /**
     * Returns a side A of a triangle.
     *
     * @return a side A of a triangle.
     */
    double getSideA();

    /**
     * Sets a new side A for a triangle.
     *
     * @param sideA a new side A for a triangle
     */
    void setSideA(double sideA);

    /**
     * Returns a side B of a triangle.
     *
     * @return a side B of a triangle.
     */
    double getSideB();

    /**
     * Sets a new side B for a triangle.
     *
     * @param sideB a new side B for a triangle
     */
    void setSideB(double sideB);

    /**
     * Returns a side C of a triangle.
     *
     * @return a side C of a triangle.
     */
    double getSideC();

    /**
     * Sets a new side C for a triangle.
     *
     * @param sideC a new side C for a triangle
     */
    void setSideC(double sideC);

    /**
     * Calculates and returns a triangle angle Alpha.
     *
     * @return a triangle angle Alpha.
     */
    double getAngleAlpha();

    /**
     * Calculates and returns a triangle angle Beta.
     *
     * @return a triangle angle Beta.
     */
    double getAngleBeta();

    /**
     * Calculates and returns a triangle angle Gamma.
     *
     * @return a triangle angle Gamma.
     */
    double getAngleGamma();

    /**
     * Calculates and returns a point A of a triangle.
     *
     * @return a point A of a triangle.
     */
    Point getPointA();

    /**
     * Calculates and returns a point B of a triangle.
     *
     * @return a point B of a triangle.
     */
    Point getPointB();

    /**
     * Calculates and returns a point C of a triangle.
     *
     * @return a point C of a triangle.
     */
    Point getPointC();

    /**
     * Checks whether this geometric figure is a triangle.
     *
     * @return true if this geometric figure is a triangle,
     * false otherwise.
     */
    boolean isTriangle();
}
