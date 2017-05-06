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
     * Returns a point ordinate.
     *
     * @return the point ordinate.
     */
    double getOrdinate();
}
