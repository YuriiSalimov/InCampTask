package com.salimov.yurii.incamp.figure;

import java.util.ArrayList;
import java.util.List;

/**
 * The class implements a set of methods
 * for working with a Triangle geometric figure.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class TriangleImpl extends AbstractFigure implements Triangle {

    /**
     * Triangle name.
     */
    private final static String NAME = "Triangle";

    /**
     * Side A of a triangle.
     */
    private double sideA;

    /**
     * Side B of a triangle.
     */
    private double sideB;

    /**
     * Side C of a triangle.
     */
    private double sideC;

    /**
     * Default constructor.
     */
    public TriangleImpl() {
    }

    /**
     * Constructor.
     *
     * @param sideA the side A for a new rectangle.
     * @param sideB the side B for a new rectangle.
     * @param sideC the side C for a new rectangle.
     */
    public TriangleImpl(double sideA, double sideB, double sideC) {
        this();
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    /**
     * Calculates and returns a triangle area.
     * triangle area = sqrt[SP * (SP - sideA) * (SP - sideB)* (SP - sideC)],
     * where SP is semiperimeter.
     *
     * @return the triangle area.
     */
    @Override
    public double getArea() {
        double semiperimeter = getPerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - getSideA()) *
                (semiperimeter - getSideB()) * (semiperimeter - getSideC()));
    }

    /**
     * Calculates and returns a triangle perimeter.
     * triangle perimeter = sideA + sideB + sideC
     *
     * @return the triangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return (getSideA() + getSideB() + getSideC());
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", sideA = " + getSideA() +
                ", sideB = " + getSideB() +
                ", sideC = " + getSideC() +
                ", angleAlpha = " + getAngleAlpha() +
                ", angleBeta = " + getAngleBeta() +
                ", angleGamma = " + getAngleGamma();
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
            Triangle other = (Triangle) object;
            result = (this.getSideA() == other.getSideA()) &&
                    (this.getSideB() == other.getSideB()) &&
                    (this.getSideC() == other.getSideC());
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
        long temp = Double.doubleToLongBits(getSideA());
        int result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSideB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSideC());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Returns a side A of a triangle.
     * This is the side between the points B and C.
     *
     * @return the side A of a triangle.
     */
    @Override
    public double getSideA() {
        return this.sideA;
    }

    /**
     * Sets a new side A for a triangle.
     * This is the side between the points B and C.
     * If input side A is negative, then sets zero.
     * <pre>
     *     setSideA(10) - sets 10
     *     setSideA(-10) - sets 0
     * </pre>
     *
     * @param sideA the new side A for a triangle
     */
    @Override
    public void setSideA(double sideA) {
        this.sideA = (sideA > 0) ? sideA : 0;
    }

    /**
     * Returns a side B of a triangle.
     * This is the side between the points A and C.
     *
     * @return the side B of a triangle.
     */
    @Override
    public double getSideB() {
        return this.sideB;
    }

    /**
     * Sets a new side B for a triangle.
     * This is the side between the points A and C.
     * If input side B is negative, then sets zero.
     * <pre>
     *     setSideB(10) - sets 10
     *     setSideB(-10) - sets 0
     * </pre>
     *
     * @param sideB a new side B for a triangle
     */
    @Override
    public void setSideB(double sideB) {
        this.sideB = (sideB > 0) ? sideB : 0;
    }

    /**
     * Returns a side C of a triangle.
     * This is the side between the points A and B.
     *
     * @return the side C of a triangle.
     */
    @Override
    public double getSideC() {
        return this.sideC;
    }

    /**
     * Sets a new side C for a triangle.
     * This is the side between the points A and B.
     * If input side C is negative, then sets zero.
     * <pre>
     *     setSideC(10) - sets 10
     *     setSideC(-10) - sets 0
     * </pre>
     *
     * @param sideC the new side C for a triangle
     */
    @Override
    public void setSideC(double sideC) {
        this.sideC = (sideC > 0) ? sideC : 0;
    }

    /**
     * Calculates and returns a triangle angle Alpha.
     * This is the angle between the sides B and C.
     *
     * @return the triangle angle Alpha.
     */
    @Override
    public double getAngleAlpha() {
        return getAngle(getSideA(), getSideB(), getSideC());
    }

    /**
     * Calculates and returns a triangle angle Beta.
     * This is the angle between the sides A and C.
     *
     * @return the triangle angle Beta.
     */
    @Override
    public double getAngleBeta() {
        return getAngle(getSideB(), getSideA(), getSideC());
    }

    /**
     * Calculates and returns a triangle angle Gamma.
     * This is the angle between the sides A and B.
     *
     * @return the triangle angle Gamma.
     */
    @Override
    public double getAngleGamma() {
        return getAngle(getSideC(), getSideB(), getSideA());
    }

    /**
     * Calculates and returns a point A of a triangle.
     * This is the point of intersection of sides B and C.
     *
     * @return the point A of a triangle.
     */
    @Override
    public Point getPointA() {
        return new PointImpl(0, 0);
    }

    /**
     * Calculates and returns a point B of a triangle.
     * This is the point of intersection of sides A and C.
     *
     * @return the point B of a triangle.
     */
    @Override
    public Point getPointB() {
        return new PointImpl(0, getSideA());
    }

    /**
     * Calculates and returns a point C of a triangle.
     * This is the point of intersection of sides A and B.
     *
     * @return the point C of a triangle.
     */
    @Override
    public Point getPointC() {
        return new PointImpl(
                Math.abs(getSideC() * Math.cos(getAngleAlpha())),
                Math.abs(getSideC() * Math.cos(getAngleBeta()))
        );
    }

    /**
     * Returns a triangle name.
     *
     * @return the triangle name
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Draws a triangle in the console.
     * Draws a point if this point is in the triangle,
     * otherwise draws empty symbols "  ".
     */
    @Override
    public void draw() {
        List<Point> points = getPoints();
        double maxAbscissa = PointImpl.getMaxAbscissa(points);
        double maxOrdinate = PointImpl.getMaxOrdinate(points);
        Point point;
        for (int abscissa = 0; abscissa < maxAbscissa; abscissa++) {
            for (int ordinate = 0; ordinate < maxOrdinate; ordinate++) {
                point = new PointImpl(abscissa, ordinate);
                if (isPointInTriangle(point)) {
                    point.draw();
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Checks whether this geometric figure is a triangle.
     * The sum of the two side must be more than the third side.
     *
     * @return true if this geometric figure is a triangle,
     * false otherwise.
     */
    @Override
    public boolean isTriangle() {
        return isSideOk(getSideA(), getSideB(), getSideC()) &&
                isSideOk(getSideB(), getSideC(), getSideA()) &&
                isSideOk(getSideC(), getSideA(), getSideB());
    }

    /**
     * Calculates and returns a points of a triangle.
     *
     * @return a points of a triangle.
     */
    private List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        points.add(getPointA());
        points.add(getPointB());
        points.add(getPointC());
        return points;
    }

    /**
     * Checks if a point is in the triangle.
     *
     * @param point the point to check.
     * @return true if incoming point is in a triangle,
     * false otherwise.
     */
    private boolean isPointInTriangle(Point point) {
        double normalA = getNormal(getPointB(), getPointC(), point);
        double normalB = getNormal(getPointC(), getPointA(), point);
        double normalC = getNormal(getPointA(), getPointB(), point);
        return checkNormal(normalA, normalB, normalC);
    }

    /**
     * Calculates and returns normal value.
     *
     * @param pointA       the point A of a side.
     * @param pointB       the point B of a side.
     * @param pointToCheck the point to check.
     * @return the normal value.
     */
    private static double getNormal(Point pointA, Point pointB, Point pointToCheck) {
        return (pointA.getAbscissa() - pointToCheck.getAbscissa()) *
                (pointB.getOrdinate() - pointA.getOrdinate()) -
                (pointB.getAbscissa() - pointA.getAbscissa()) *
                        (pointA.getOrdinate() - pointToCheck.getOrdinate());
    }

    /**
     * Checks a normals of a triangle.
     * Returns true if incoming normals are in similar diapason.
     * <pre>
     *     checkNormal(10, 2, 5) = true
     *     checkNormal(-10, -2, -5) = true
     *     checkNormal(-10, 2, -5) = false
     *     checkNormal(10, -2, 5) = false
     * </pre>
     *
     * @param normalA the normal A of a triangle.
     * @param normalB the normal B of a triangle.
     * @param normalC thea normal C of a triangle.
     * @return true if incoming normals are in similar diapason,
     * false otherwise.
     */
    private static boolean checkNormal(double normalA, double normalB, double normalC) {
        return (normalA >= 0 && normalB >= 0 && normalC >= 0) ||
                (normalA <= 0 && normalB <= 0 && normalC <= 0);
    }

    /**
     * Calculates and returns a triangle angle.
     * angle = arccos[(B^2 + C^2 - A^2) / (2 * B * C)]
     *
     * @param sideA the side A of a triangle.
     * @param sideB the side B of a triangle.
     * @param sideC the side C of a triangle.
     * @return a angle.
     */
    private static double getAngle(double sideA, double sideB, double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
    }

    /**
     * Checks a incoming sides.
     * <pre>
     *     isSideOk(1, 3, 2) = true
     *     isSideOk(3, 1, 2) = true
     *     isSideOk(1, 2, 3) = false
     *     isSideOk(2, 1, 3) = false
     * </pre>
     *
     * @param sideA the side A to check.
     * @param sideB the side B to check.
     * @param sideC the side C to check.
     * @return true if side A + side B is more than side C,
     * false otherwise.
     */
    private static boolean isSideOk(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC);
    }
}
