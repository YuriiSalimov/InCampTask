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
     * @param sideA a side A for a new rectangle.
     * @param sideB a side B for a new rectangle.
     * @param sideC a side C for a new rectangle.
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
     * @return a triangle area.
     */
    @Override
    public double getArea() {
        double semiperimeter = getPerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) *
                (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    /**
     * Calculates and returns a triangle perimeter.
     * triangle perimeter = sideA + sideB + sideC
     *
     * @return a triangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", sideA = " + sideA +
                ", sideB = " + sideB +
                ", sideC = " + sideC +
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
            result = (this.sideA == other.getSideA()) &&
                    (this.sideB == other.getSideB()) &&
                    (this.sideC == other.getSideC());
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
        long temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Returns a side A of a triangle.
     *
     * @return a side A of a triangle.
     */
    @Override
    public double getSideA() {
        return sideA;
    }

    /**
     * Sets a new side A for a triangle.
     * If input side A is negative, then sets zero.
     *
     * @param sideA a new side A for a triangle
     */
    @Override
    public void setSideA(double sideA) {
        this.sideA = (sideA > 0) ? sideA : 0;
    }

    /**
     * Returns a side B of a triangle.
     *
     * @return a side B of a triangle.
     */
    @Override
    public double getSideB() {
        return sideB;
    }

    /**
     * Sets a new side B for a triangle.
     * If input side B is negative, then sets zero.
     *
     * @param sideB a new side B for a triangle
     */
    @Override
    public void setSideB(double sideB) {
        this.sideB = (sideB > 0) ? sideB : 0;
    }

    /**
     * Returns a side C of a triangle.
     *
     * @return a side C of a triangle.
     */
    @Override
    public double getSideC() {
        return sideC;
    }

    /**
     * Sets a new side C for a triangle.
     * If input side C is negative, then sets zero.
     *
     * @param sideC a new side C for a triangle
     */
    @Override
    public void setSideC(double sideC) {
        this.sideC = (sideC > 0) ? sideC : 0;
    }

    /**
     * Calculates and returns a triangle angle Alpha.
     *
     * @return a triangle angle Alpha.
     */
    @Override
    public double getAngleAlpha() {
        return getAngle(sideA, sideB, sideC);
    }

    /**
     * Calculates and returns a triangle angle Beta.
     *
     * @return a triangle angle Beta.
     */
    @Override
    public double getAngleBeta() {
        return getAngle(sideB, sideA, sideC);
    }

    /**
     * Calculates and returns a triangle angle Gamma.
     *
     * @return a triangle angle Gamma.
     */
    @Override
    public double getAngleGamma() {
        return getAngle(sideC, sideB, sideA);
    }

    /**
     * Calculates and returns a point A of a triangle.
     *
     * @return a point A of a triangle.
     */
    @Override
    public Point getPointA() {
        return new PointImpl(0, 0);
    }

    /**
     * Calculates and returns a point B of a triangle.
     *
     * @return a point B of a triangle.
     */
    @Override
    public Point getPointB() {
        return new PointImpl(0, sideA);
    }

    /**
     * Calculates and returns a point C of a triangle.
     *
     * @return a point C of a triangle.
     */
    @Override
    public Point getPointC() {
        return new PointImpl(
                Math.abs(sideC * Math.cos(getAngleAlpha())),
                Math.abs(sideC * Math.cos(getAngleBeta()))
        );
    }

    /**
     * Returns a triangle name.
     *
     * @return a triangle name
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
        return isSideOk(sideA, sideB, sideC) &&
                isSideOk(sideB, sideC, sideA) &&
                isSideOk(sideC, sideA, sideB);
    }

    /**
     * Checks a incoming sides.
     *
     * @param sideA a side A to check.
     * @param sideB a side B to check.
     * @param sideC a side C to check.
     * @return true if side A + side B is more than side C,
     * false otherwise.
     */
    private static boolean isSideOk(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC);
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
     * @param point a point to check.
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
     * @param pointA       a point A of a side.
     * @param pointB       a point B of a side.
     * @param pointToCheck a point to check.
     * @return a normal value.
     */
    private static double getNormal(Point pointA, Point pointB, Point pointToCheck) {
        return (pointA.getAbscissa() - pointToCheck.getAbscissa()) *
                (pointB.getOrdinate() - pointA.getOrdinate()) -
                (pointB.getAbscissa() - pointA.getAbscissa()) *
                        (pointA.getOrdinate() - pointToCheck.getOrdinate());
    }

    /**
     * Checks a normals of a triangle.
     *
     * @param normalA a normal A of a triangle.
     * @param normalB a normal B of a triangle.
     * @param normalC a normal C of a triangle.
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
     * @param sideA a side A of a triangle.
     * @param sideB a side B of a triangle.
     * @param sideC a side C of a triangle.
     * @return a angle.
     */
    private static double getAngle(double sideA, double sideB, double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
    }
}
