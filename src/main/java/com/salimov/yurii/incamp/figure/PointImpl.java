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
    private double abscissa;

    /**
     * Ordinate coordinate of a point.
     */
    private double ordinate;

    /**
     * Default constructor.
     */
    public PointImpl() {
    }

    /**
     * Constructor.
     *
     * @param abscissa a abscissa for a new point.
     * @param ordinate a ordinate for a new point.
     */
    public PointImpl(double abscissa, double ordinate) {
        this();
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
                ", abscissa = " + abscissa +
                ", ordinate = " + ordinate;
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
            result = (this.abscissa == other.getAbscissa()) &&
                    (this.ordinate == other.getOrdinate());
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
        int result = super.hashCode();
        long temp = Double.doubleToLongBits(abscissa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ordinate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Calculates and returns a point area.
     * Material point is a geometric figure,
     * the dimensions that can be neglected.
     * And a point area is 0.
     *
     * @return a point area.
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
     * @return a point perimeter.
     */
    @Override
    public double getPerimeter() {
        return 0;
    }

    /**
     * Returns an abscissa coordinate of a point.
     *
     * @return an abscissa coordinate of a point.
     */
    @Override
    public double getAbscissa() {
        return abscissa;
    }

    /**
     * Sets a new abscissa coordinate for a point.
     *
     * @param abscissa a new abscissa coordinate.
     */
    @Override
    public void setAbscissa(double abscissa) {
        this.abscissa = abscissa;
    }

    /**
     * Returns a point ordinate.
     *
     * @return a point ordinate.
     */
    @Override
    public double getOrdinate() {
        return ordinate;
    }

    /**
     * Sets a new ordinate coordinate for a point.
     *
     * @param ordinate a new ordinate coordinate.
     */
    @Override
    public void setOrdinate(double ordinate) {
        this.ordinate = ordinate;
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
     * @param points a point list to check.
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
     * @param points a point list to check.
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
     * @param points a point list to check.
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
     * @param points a point list to check.
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
     * @param value1 a first value to check.
     * @param value2 a second value to check.
     * @return a minimum value.
     */
    private static double getMin(double value1, double value2) {
        return (value1 < value2) ? value1 : value2;
    }

    /**
     * Returns a maximum of two values.
     *
     * @param value1 a first value to check.
     * @param value2 a second value to check.
     * @return a maximum value.
     */
    private static double getMax(double value1, double value2) {
        return (value1 > value2) ? value1 : value2;
    }
}
