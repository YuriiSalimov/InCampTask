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
     * @param radius the radius for a new circle.
     */
    public CircleImpl(double radius) {
        this();
        setRadius(radius);
    }

    /**
     * Calculates and returns a circle area.
     * circle area = PI * radius ^ 2
     *
     * @return the circle area.
     */
    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    /**
     * Calculates and returns a circle perimeter.
     * circle perimeter = 2 * PI * radius = PI * diameter
     *
     * @return the circle perimeter.
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
                ", radius = " + getRadius() +
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
            result = (this.getRadius() == other.getRadius());
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
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    /**
     * Returns a circle radius.
     *
     * @return the circle radius.
     */
    @Override
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets a new radius for a circle.
     * If input radius is negative, then sets zero.
     * <pre>
     *     setRadius(10) - sets 10
     *     setRadius(-10) - sets 0
     * </pre>
     *
     * @param radius the new circle radius.
     */
    @Override
    public void setRadius(double radius) {
        this.radius = (radius > 0) ? radius : 0;
    }

    /**
     * Calculates and returns a circle diameter.
     *
     * @return the circle diameter.
     */
    @Override
    public double getDiameter() {
        return 2 * getRadius();
    }

    /**
     * Sets a new diameter for a circle.
     * In method calculates and sets a circle radius:
     * radius = diameter / 2
     * <pre>
     *     setDiameter(10) - sets radius 5
     *     setDiameter(-10) - sets 0
     * </pre>
     *
     * @param diameter the new circle diameter.
     */
    @Override
    public void setDiameter(double diameter) {
        setRadius(diameter / 2);
    }

    /**
     * Calculates and returns a circle center point.
     *
     * @return the circle center point.
     */
    @Override
    public Point getCentre() {
        return new PointImpl(getRadius(), getRadius());
    }

    /**
     * Returns a circle name.
     *
     * @return the circle name
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
     * @param point the point to check.
     * @return true if the incoming point is in this circle,
     * false otherwise.
     */
    private boolean isPointInCircle(Point point) {
        return calculateLengthToCentre(point) <= getRadius();
    }

    /**
     * Calculates and returns a length from incoming point to circle centre.
     * Length to circle centre is
     * L = sqrt[X^2 + Y^2],
     * where X - length of a projection on the x-axis,
     * Y - length of a projection on the y-axis.
     *
     * @param point the point to check.
     * @return a length from incoming point to circle centre.
     */
    private double calculateLengthToCentre(Point point) {
        Point centre = getCentre();
        double toAxisX = centre.getAbscissa() - point.getAbscissa();
        double toAxisY = centre.getOrdinate() - point.getOrdinate();
        return Math.sqrt(toAxisX * toAxisX + toAxisY * toAxisY);
    }
}
