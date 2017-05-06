package com.salimov.yurii.incamp.figure;

import java.util.List;

/**
 * The class implements a set of methods
 * for working with a Point geometric figure.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class PointImpl extends AbstractFigure implements Point {

    /**
     * Point name.
     */
    private final static String NAME = "Point";

    /**
     * The Point symbol to print.
     */
    private final static String POINT_SYMBOL = "* ";

    /**
     * Abscissa coordinate of a point.
     */
    private final double abscissa;

    /**
     * Ordinate coordinate of a point.
     */
    private final double ordinate;

    /**
     * Constructor.
     *
     * @param abscissa the abscissa for a new point.
     * @param ordinate the ordinate for a new point.
     */
    public PointImpl(double abscissa, double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", abscissa = " + getAbscissa() +
                ", ordinate = " + getOrdinate();
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
        boolean result = super.equals(object);
        if (result) {
            Point other = (Point) object;
            result = (this.getAbscissa() == other.getAbscissa()) &&
                    (this.getOrdinate() == other.getOrdinate());
        }
        return result;
    }

    /**
     * Returns a hash code value for the object.
     * This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getAbscissa());
        int result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getOrdinate());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Calculates and returns a point area.
     * Material point is a geometric figure,
     * the dimensions that can be neglected.
     * And a point area is 0.
     *
     * @return the point area.
     */
    @Override
    public double getArea() {
        return 0;
    }

    /**
     * Calculates and returns a point perimeter.
     * Material point is a geometric figure,
     * the dimensions that can be neglected.
     * And a point perimeter is 0.
     *
     * @return the point perimeter.
     */
    @Override
    public double getPerimeter() {
        return 0;
    }

    /**
     * Returns an abscissa coordinate of a point.
     *
     * @return the abscissa coordinate of a point.
     */
    @Override
    public double getAbscissa() {
        return this.abscissa;
    }

    /**
     * Returns a point ordinate.
     *
     * @return the point ordinate.
     */
    @Override
    public double getOrdinate() {
        return this.ordinate;
    }

    /**
     * Draws a point in the console.
     */
    @Override
    public void draw() {
        System.out.print(POINT_SYMBOL);
    }

    /**
     * Returns a figure name.
     *
     * @return a figure name
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Returns a minimum abscissa.
     *
     * @param points the point list to check.
     * @return a minimum abscissa.
     */
    public static double getMinAbscissa(List<Point> points) {
        double result = points.get(0).getAbscissa();
        for (Point point : points) {
            result = getMin(point.getAbscissa(), result);
        }
        return result;
    }

    /**
     * Returns a maximum abscissa.
     *
     * @param points the point list to check.
     * @return a maximum abscissa.
     */
    public static double getMaxAbscissa(List<Point> points) {
        double result = points.get(0).getAbscissa();
        for (Point point : points) {
            result = getMax(point.getAbscissa(), result);
        }
        return result;
    }

    /**
     * Returns a minimum ordinate.
     *
     * @param points the point list to check.
     * @return a minimum ordinate.
     */
    public static double getMinOrdinate(List<Point> points) {
        double result = points.get(0).getOrdinate();
        for (Point point : points) {
            result = getMin(point.getOrdinate(), result);
        }
        return result;
    }

    /**
     * Returns a maximum ordinate.
     *
     * @param points the point list to check.
     * @return a maximum ordinate.
     */
    public static double getMaxOrdinate(List<Point> points) {
        double result = points.get(0).getOrdinate();
        for (Point point : points) {
            result = getMax(point.getOrdinate(), result);
        }
        return result;
    }

    /**
     * Returns a minimum of two values.
     *
     * @param first the first value to check.
     * @param second the second value to check.
     * @return a minimum value.
     */
    private static double getMin(double first, double second) {
        return (first < second) ? first : second;
    }

    /**
     * Returns a maximum of two values.
     *
     * @param first the first value to check.
     * @param second the second value to check.
     * @return a maximum value.
     */
    private static double getMax(double first, double second) {
        return (first > second) ? first : second;
    }
}
