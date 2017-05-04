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
     * This is the side between the points B and C.
     *
     * @return the side A of a triangle.
     */
    double getSideA();

    /**
     * Sets a new side A for a triangle.
     * This is the side between the points B and C.
     *
     * @param sideA the new side A for a triangle
     */
    void setSideA(double sideA);

    /**
     * Returns a side B of a triangle.
     * This is the side between the points A and C.
     *
     * @return the side B of a triangle.
     */
    double getSideB();

    /**
     * Sets a new side B for a triangle.
     * This is the side between the points A and C.
     *
     * @param sideB the new side B for a triangle
     */
    void setSideB(double sideB);

    /**
     * Returns a side C of a triangle.
     * This is the side between the points A and B.
     *
     * @return the side C of a triangle.
     */
    double getSideC();

    /**
     * Sets a new side C for a triangle.
     * This is the side between the points A and B.
     *
     * @param sideC the new side C for a triangle
     */
    void setSideC(double sideC);

    /**
     * Calculates and returns a triangle angle Alpha.
     * This is the angle between the sides B and C.
     *
     * @return the triangle angle Alpha.
     */
    double getAngleAlpha();

    /**
     * Calculates and returns a triangle angle Beta.
     * This is the angle between the sides A and C.
     *
     * @return the triangle angle Beta.
     */
    double getAngleBeta();

    /**
     * Calculates and returns a triangle angle Gamma.
     * This is the angle between the sides A and B.
     *
     * @return the triangle angle Gamma.
     */
    double getAngleGamma();

    /**
     * Calculates and returns a point A of a triangle.
     * This is the point of intersection of sides B and C.
     *
     * @return the point A of a triangle.
     */
    Point getPointA();

    /**
     * Calculates and returns a point B of a triangle.
     * This is the point of intersection of sides A and C.
     *
     * @return the point B of a triangle.
     */
    Point getPointB();

    /**
     * Calculates and returns a point C of a triangle.
     * This is the point of intersection of sides A and B.
     *
     * @return the point C of a triangle.
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
