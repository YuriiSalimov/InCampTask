package com.salimov.yurii.incamp.figure;

/**
 * The abstract superclass implements a set of standard methods
 * for working with a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class AbstractFigure implements Figure {

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return getName() +
                ": perimeter = " + getPerimeter() +
                ", area = " + getArea();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param object The reference object with which to compare.
     * @return true if this object is the same as the object
     * argument, false otherwise otherwise.
     */
    @Override
    public boolean equals(Object object) {
        return (this == object) || (object != null) &&
                (getClass() == object.getClass());
    }

    /**
     * Returns a hash code value for the object.
     * This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this object.
     */
    @Override
    public abstract int hashCode();
}
