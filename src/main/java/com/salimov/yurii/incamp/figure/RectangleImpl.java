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
     * @param width  a width for a new rectangle.
     * @param height a height for a new rectangle.
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
     * @return a rectangle area.
     */
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Calculates and returns a rectangle perimeter.
     * rectangle perimeter = 2 * (width + height)
     *
     * @return a rectangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", width = " + this.width +
                ", height = " + this.height;
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
            result = (this.width == other.getWidth()) &&
                    (this.height == other.getHeight());
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
        long temp = Double.doubleToLongBits(this.width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(this.height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Returns a rectangle width.
     *
     * @return a rectangle width.
     */
    @Override
    public double getWidth() {
        return this.width;
    }

    /**
     * Sets a new width for a rectangle.
     * If input width is negative, then sets zero.
     *
     * @param width a new rectangle width.
     */
    @Override
    public void setWidth(double width) {
        this.width = (width > 0) ? width : 0;
    }

    /**
     * Returns a rectangle height.
     *
     * @return a rectangle height.
     */
    @Override
    public double getHeight() {
        return this.height;
    }

    /**
     * Sets a new height for a rectangle.
     * If input height is negative, then sets zero.
     *
     * @param height a new rectangle height.
     */
    @Override
    public void setHeight(double height) {
        this.height = (height > 0) ? height : 0;
    }

    /**
     * Calculates and returns a point A of a rectangle.
     * The coordinates of the point A is (0, 0).
     *
     * @return a point A of a rectangle.
     */
    @Override
    public Point getPointA() {
        return new PointImpl(0, 0);
    }

    /**
     * Calculates and returns a point B of a rectangle.
     * The coordinates of the point B is (0, rectangle width).
     *
     * @return a point B of a rectangle.
     */
    @Override
    public Point getPointB() {
        return new PointImpl(0, width);
    }

    /**
     * Calculates and returns a point C of a rectangle.
     * The coordinates of the point C is (rectangle height, rectangle width).
     *
     * @return a point C of a rectangle.
     */
    @Override
    public Point getPointC() {
        return new PointImpl(height, width);
    }

    /**
     * Calculates and returns a point D of a rectangle.
     * The coordinates of the point D is (rectangle height, 0).
     *
     * @return a point D of a rectangle.
     */
    @Override
    public Point getPointD() {
        return new PointImpl(height, 0);
    }

    /**
     * Draws a rectangle in the console.
     */
    @Override
    public void draw() {
        Point point = new PointImpl();
        for (int abscissa = 0; abscissa <= width; abscissa++) {
            for (int ordinate = 0; ordinate <= height; ordinate++) {
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
