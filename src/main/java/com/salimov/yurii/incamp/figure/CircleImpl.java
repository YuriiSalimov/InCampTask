package com.salimov.yurii.incamp.figure;

/**
 * The class implements a set of methods
 * for working with a Circle geometric figure.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class CircleImpl extends AbstractFigure implements Circle {

    /**
     * Circle name.
     */
    private final static String NAME = "Circle";

    /**
     * Circle radius.
     */
    private double radius;

    /**
     * Default constructor.
     */
    public CircleImpl() {
    }

    /**
     * Constructor.
     *
     * @param radius a radius for a new circle.
     */
    public CircleImpl(double radius) {
        this();
        setRadius(radius);
    }

    /**
     * Calculates and returns a circle area.
     * circle area = PI * radius ^ 2
     *
     * @return a circle area.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates and returns a circle perimeter.
     * circle perimeter = 2 * PI * radius = PI * diameter
     *
     * @return a circle perimeter.
     */
    @Override
    public double getPerimeter() {
        return Math.PI * getDiameter();
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + radius +
                ", diameter = " + getDiameter();
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
            Circle other = (Circle) object;
            result = (this.radius == other.getRadius());
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
        long temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Returns a circle radius.
     *
     * @return a circle radius.
     */
    @Override
    public double getRadius() {
        return radius;
    }

    /**
     * Sets a new radius for a circle.
     * If input radius is negative, then sets zero.
     *
     * @param radius a new circle radius.
     */
    @Override
    public void setRadius(double radius) {
        this.radius = (radius > 0) ? radius : 0;
    }

    /**
     * Calculates and returns a circle diameter.
     *
     * @return a circle diameter.
     */
    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Sets a new diameter for a circle.
     * In method calculates and sets a circle radius:
     * radius = diameter / 2
     *
     * @param diameter a new circle diameter.
     */
    @Override
    public void setDiameter(double diameter) {
        setRadius(diameter / 2);
    }

    /**
     * Calculates and returns a circle center point.
     *
     * @return a circle center point.
     */
    @Override
    public Point getCentre() {
        return new PointImpl(radius, radius);
    }

    /**
     * Returns a circle name.
     *
     * @return a circle name
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Draws a circle in the console.
     * Draws a point if this point is in the circle,
     * otherwise draws empty symbols "  ".
     */
    @Override
    public void draw() {
        double diameter = getDiameter();
        Point point;
        for (int abscissa = 0; abscissa <= diameter; abscissa++) {
            for (int ordinate = 0; ordinate <= diameter; ordinate++) {
                point = new PointImpl(abscissa, ordinate);
                if (isPointInCircle(point)) {
                    point.draw();
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Checks if a point is in the circle.
     *
     * @param point a point to check.
     * @return true if incoming point is in a circle,
     * false otherwise.
     */
    private boolean isPointInCircle(Point point) {
        return calculateLengthToCentre(point) <= radius;
    }

    /**
     * Calculates and returns a length from incoming point to circle centre.
     *
     * @param point a point to check.
     * @return a length from incoming point to circle centre.
     */
    private double calculateLengthToCentre(Point point) {
        Point centre = getCentre();
        double toAxisX = centre.getAbscissa() - point.getAbscissa();
        double toAxisY = centre.getOrdinate() - point.getOrdinate();
        return Math.sqrt(toAxisX * toAxisX + toAxisY * toAxisY);
    }
}
