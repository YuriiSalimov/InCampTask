package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a Point geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Point extends Figure {

    /**
     * Returns an abscissa coordinate of a point.
     *
     * @return the abscissa coordinate of a point.
     */
    double getAbscissa();

    /**
     * Sets a new abscissa coordinate for a point.
     *
     * @param abscissa the new abscissa coordinate.
     */
    void setAbscissa(double abscissa);

    /**
     * Returns a point ordinate.
     *
     * @return the point ordinate.
     */
    double getOrdinate();

    /**
     * Sets a new ordinate coordinate for a point.
     *
     * @param ordinate the new ordinate coordinate.
     */
    void setOrdinate(double ordinate);
}
