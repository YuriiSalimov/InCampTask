package com.salimov.yurii.incamp.figure;

/**
 * The class implements a set of methods
 * for working with a Rectangle geometric figure.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class RectangleImpl extends AbstractFigure implements Rectangle {

    /**
     * Rectangle name.
     */
    private final static String NAME = "Rectangle";

    /**
     * Rectangle width.
     */
    private double width;

    /**
     * Rectangle height.
     */
    private double height;

    /**
     * Default constructor.
     */
    public RectangleImpl() {
    }

    /**
     * Constructor.
     *
     * @param width  the width for a new rectangle.
     * @param height the height for a new rectangle.
     */
    public RectangleImpl(double width, double height) {
        this();
        setWidth(width);
        setHeight(height);
    }

    /**
     * Calculates and returns a rectangle area.
     * rectangle area = width * height
     *
     * @return the rectangle area.
     */
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    /**
     * Calculates and returns a rectangle perimeter.
     * rectangle perimeter = 2 * (width + height)
     *
     * @return the rectangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", width = " + getWidth() +
                ", height = " + this.getHeight();
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
            Rectangle other = (Rectangle) object;
            result = (this.getWidth() == other.getWidth()) &&
                    (this.getHeight() == other.getHeight());
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
        long temp = Double.doubleToLongBits(getWidth());
        int result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Returns a rectangle width.
     *
     * @return the rectangle width.
     */
    @Override
    public double getWidth() {
        return this.width;
    }

    /**
     * Sets a new width for a rectangle.
     * If input width is negative, then sets zero.
     * <pre>
     *     setWidth(10) - sets 10
     *     setWidth(-10) - sets 0
     * </pre>
     *
     * @param width the new rectangle width.
     */
    @Override
    public void setWidth(double width) {
        this.width = (width > 0) ? width : 0;
    }

    /**
     * Returns a rectangle height.
     *
     * @return the rectangle height.
     */
    @Override
    public double getHeight() {
        return this.height;
    }

    /**
     * Sets a new height for a rectangle.
     * If input height is negative, then sets zero.
     * <pre>
     *     setHeight(10) - sets 10
     *     setHeight(-10) - sets 0
     * </pre>
     *
     * @param height the new rectangle height.
     */
    @Override
    public void setHeight(double height) {
        this.height = (height > 0) ? height : 0;
    }

    /**
     * Calculates and returns a point A of a rectangle.
     * The coordinates of the point A is (0, 0).
     *
     * @return the point A of a rectangle.
     */
    @Override
    public Point getPointA() {
        return new PointImpl(0, 0);
    }

    /**
     * Calculates and returns a point B of a rectangle.
     * The coordinates of the point B is (0, rectangle width).
     *
     * @return the point B of a rectangle.
     */
    @Override
    public Point getPointB() {
        return new PointImpl(0, getWidth());
    }

    /**
     * Calculates and returns a point C of a rectangle.
     * The coordinates of the point C is (rectangle height, rectangle width).
     *
     * @return the point C of a rectangle.
     */
    @Override
    public Point getPointC() {
        return new PointImpl(getHeight(), getWidth());
    }

    /**
     * Calculates and returns a point D of a rectangle.
     * The coordinates of the point D is (rectangle height, 0).
     *
     * @return the point D of a rectangle.
     */
    @Override
    public Point getPointD() {
        return new PointImpl(getHeight(), 0);
    }

    /**
     * Draws a rectangle in the console.
     */
    @Override
    public void draw() {
        Point point = new PointImpl();
        for (int abscissa = 0; abscissa <= getWidth(); abscissa++) {
            for (int ordinate = 0; ordinate <= getHeight(); ordinate++) {
                point.draw();
            }
            System.out.println();
        }
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
}
