package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a Circle geometric figures.
 * <pre>
 *           *
 *     * * d ↑ * * *
 *   * * * i | * * * *
 *   * * * a | radius *
 * * * * * m *←------→ *
 *   * * * e | ↖ * * *
 *   * * * t | * \ * *
 *     * * r ↓ * * \
 *           *      centre
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Circle extends Figure {

    /**
     * Returns a circle radius.
     *
     * @return the circle radius.
     */
    double getRadius();

    /**
     * Calculates and returns a circle diameter.
     *
     * @return the circle diameter.
     */
    double getDiameter();

    /**
     * Calculates and returns a circle center point.
     *
     * @return the circle center point.
     */
    Point getCentre();
}
