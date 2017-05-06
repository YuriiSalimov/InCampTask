package com.salimov.yurii.incamp.figure;

import java.util.ArrayList;
import java.util.List;

/**
 * The class implements a set of methods
 * for working with a Triangle geometric figure.
 * <pre>
 *                    a
 *    A |←---------------------------→|  B
 *    -- * * * * * * * * * * * * * * * *
 *    ↑  * > alpha * * * * beta < *    \
 *    |  * * * * * * * * * * * *     /
 *    |  * * * * * * * * * *      /
 *  b |  * * * * * * * *      /
 *    |  * gamma* * *     /
 *    |  * ^ *  *     /    c
 *    ↓  * *     /
 *    -- *\   /
 *      C  \
 * </pre>
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
     * The length of a first side (A) of a triangle.
     * The side between the B and C points.
     */
    private final double sideA;

    /**
     * The length of a second side (B) of a triangle.
     * The side between the A and C points .
     */
    private final double sideB;

    /**
     * The length of a third side (C) of a triangle.
     * The side between the A and B points.
     */
    private final double sideC;

    /**
     * Constructor.
     *
     * @param sideA the length of a first side for a new rectangle.
     * @param sideB the length of a second side for a new rectangle.
     * @param sideC the length of a third side for a new rectangle.
     */
    public TriangleImpl(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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
     * Returns a length of the first triangle side (A).
     *
     * @return the first side length.
     */
    @Override
    public double getSideA() {
        return (this.sideA > 0) ? this.sideA : 0;
    }

    /**
     * Returns a length of a second triangle side (B).
     *
     * @return the second side length.
     */
    @Override
    public double getSideB() {
        return (this.sideB > 0) ? this.sideB : 0;
    }

    /**
     * Returns the length of a third triangle side (C).
     *
     * @return the third side length.
     */
    @Override
    public double getSideC() {
        return (this.sideC > 0) ? this.sideC : 0;
    }

    /**
     * Calculates and returns a triangle Alpha angle.
     * The angle between the B and C sides.
     *
     * @return the triangle Alpha angle.
     */
    @Override
    public double getAngleAlpha() {
        return getAngle(getSideA(), getSideB(), getSideC());
    }

    /**
     * Calculates and returns a triangle Beta angle.
     * This is the angle between the A and C sides.
     *
     * @return the triangle Beta angle.
     */
    @Override
    public double getAngleBeta() {
        return getAngle(getSideB(), getSideA(), getSideC());
    }

    /**
     * Calculates and returns a triangle Gamma angle.
     * This is the angle between the A and B sides.
     *
     * @return the triangle Gamma angle.
     */
    @Override
    public double getAngleGamma() {
        return getAngle(getSideC(), getSideB(), getSideA());
    }

    /**
     * Calculates and returns a A point of a triangle.
     * This is the point of intersection of sides B and C.
     *
     * @return the A point.
     */
    @Override
    public Point getPointA() {
        return new PointImpl(0, 0);
    }

    /**
     * Calculates and returns a B point of a triangle.
     * This is the point of intersection of A and C sides.
     *
     * @return the B point.
     */
    @Override
    public Point getPointB() {
        return new PointImpl(0, getSideA());
    }

    /**
     * Calculates and returns a C point of a triangle.
     * This is the point of intersection of A and B sides.
     *
     * @return the C point.
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
     * Draws this triangle in the console.
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
     * @return thr points of a triangle.
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
