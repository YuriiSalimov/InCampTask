package com.salimov.yurii.incamp.figure.triangle;

import com.salimov.yurii.incamp.figure.AbstractFigureTest;
import com.salimov.yurii.incamp.figure.Builder;
import com.salimov.yurii.incamp.figure.point.Point;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class TriangleFigureTest extends AbstractFigureTest {

    private final static String NAME = "Triangle";
    private final static double SIDE_A = 3;
    private final static double SIDE_B = 4;
    private final static double SIDE_C = 5;

    private static TriangleFigure triangle;

    @BeforeClass
    public static void beforeClass() {
        triangle = new TriangleFigure(SIDE_A, SIDE_B, SIDE_C);
    }

    @Test
    public void whenGetAreaThenReturnValidValue() {
        final double semiperimeter = getPerimeter() / 2;
        final double actualArea = Math.sqrt(semiperimeter * (semiperimeter - SIDE_A) *
                (semiperimeter - SIDE_B) * (semiperimeter - SIDE_C));
        final double expectedArea = triangle.getArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    public void whenGetPerimeterThenReturnValidValue() {
        final double actualPerimeter = getPerimeter();
        final double expectedPerimeter = triangle.getPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }

    @Test
    public void toStringTest() {
        final String actualString = NAME +
                ": perimeter = " + triangle.getPerimeter() +
                ", area = " + triangle.getArea() +
                ", sideA = " + triangle.getSideA() +
                ", sideB = " + triangle.getSideB() +
                ", sideC = " + triangle.getSideC() +
                ", angleAlpha = " + triangle.getAngleAlpha() +
                ", angleBeta = " + triangle.getAngleBeta() +
                ", angleGamma = " + triangle.getAngleGamma();
        final String expectedString = triangle.toString();
        assertEquals(expectedString, actualString);
    }

    @Test
    public void whenGetSideAThenReturnValidValue() {
        final double expectedSideA = triangle.getSideA();
        assertTrue(expectedSideA == SIDE_A);
    }

    @Test
    public void whenGetSideBThenReturnValidValue() {
        final double expectedSideB = triangle.getSideB();
        assertTrue(expectedSideB == SIDE_B);
    }

    @Test
    public void whenGetSideCThenReturnValidValue() {
        final double expectedSideC = triangle.getSideC();
        assertTrue(expectedSideC == SIDE_C);
    }

    @Test
    public void whenAngleAlphaThenReturnValidValue() {
        final double actualAngleAlpha = getAngle(SIDE_A, SIDE_B, SIDE_C);
        final double expectedAngleAlpha = triangle.getAngleAlpha();
        assertTrue(expectedAngleAlpha == actualAngleAlpha);
    }

    @Test
    public void whenAngleBetaThenReturnValidValue() {
        final double actualAngleBeta = getAngle(SIDE_B, SIDE_A, SIDE_C);
        final double expectedAngleBeta = triangle.getAngleBeta();
        assertTrue(expectedAngleBeta == actualAngleBeta);
    }

    @Test
    public void whenAngleGammaThenReturnValidValue() {
        final double actualAngleGamma = getAngle(SIDE_C, SIDE_B, SIDE_A);
        final double expectedAngleGamma = triangle.getAngleGamma();
        assertTrue(expectedAngleGamma == actualAngleGamma);
    }

    @Test
    public void whenPointAThenReturnValidValue() {
        final Point actualPoint = createPoint(0, 0);
        final Point expectedPoint = triangle.getPointA();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenPointBThenReturnValidValue() {
        final Point actualPoint = createPoint(0, SIDE_A);
        final Point expectedPoint = triangle.getPointB();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenPointCThenReturnValidValue() {
        final double angleAlpha = getAngle(SIDE_A, SIDE_B, SIDE_C);
        final double angleBeta = getAngle(SIDE_B, SIDE_A, SIDE_C);
        final double abscissa = Math.abs(SIDE_C * Math.cos(angleAlpha));
        final double ordinate = Math.abs(SIDE_C * Math.cos(angleBeta));
        final Point actualPoint = createPoint(abscissa, ordinate);
        final Point expectedPoint = triangle.getPointC();
        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void whenCallIsTriangleMethodThenReturnTrue() {
        assertTrue(triangle.isTriangle());
    }

    @Test
    public void whenGetBuilderThenReturnNotNull() {
        final Builder<Triangle> builder = Triangle.getBuilder();
        assertNotNull(builder);
    }

    @Override
    protected String getName() {
        return NAME;
    }

    @Override
    protected TriangleFigure getFigure() {
        return triangle;
    }

    private double getPerimeter() {
        return SIDE_A + SIDE_B + SIDE_C;
    }

    private double getAngle(final double sideA, final double sideB, final double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
    }
}