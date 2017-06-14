package com.salimov.yurii.incamp.figure;

import com.salimov.yurii.incamp.figure.point.Point;
import com.salimov.yurii.incamp.figure.point.PointBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public abstract class AbstractFigureTest {

    @Test
    public void equalsWithNull() throws Exception {
        final AbstractFigure figure = getFigure();
        assertFalse(figure.equals(null));
    }

    @Test
    public void equalsWithObjectOfTheAnotherClass() throws Exception {
        final AbstractFigure figure = getFigure();
        final String string = "Hello World!";
        assertFalse(figure.equals(string));
    }

    @Test
    public void equalsTwoObjects() throws Exception {
        final AbstractFigure first = getFigure();
        final AbstractFigure second = first.clone();
        for (int i = 0; i < 5; i++) {
            assertTrue(first.equals(second));
            assertTrue(second.equals(first));
        }
    }

    @Test
    public void equalsThreeObjects() throws Exception {
        final AbstractFigure first = getFigure();
        final AbstractFigure second = first.clone();
        final AbstractFigure third = second.clone();
        for (int i = 0; i < 5; i++) {
            assertTrue(first.equals(second));
            assertTrue(second.equals(third));
            assertTrue(third.equals(first));
        }
    }

    @Test
    public void hashCodeTest() throws Exception {
        final AbstractFigure figure = getFigure();
        int hashCode = figure.hashCode();
        for (int i = 0; i < 5; i++) {
            int temp = figure.hashCode();
            assertEquals(temp, hashCode);
            hashCode = temp;
        }
    }

    @Test
    public void cloneTest() throws Exception {
        final AbstractFigure figure = getFigure();
        final AbstractFigure clone = figure.clone();
        assertTrue(figure != clone);
        assertEquals(figure, clone);
    }

    @Test
    public void whenGetNameThenReturnValidValue() {
        final AbstractFigure figure = getFigure();
        final String actualName = getName();
        final String expectedName = figure.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void whenDrawFigureThenDoIt() {
        final AbstractFigure figure = getFigure();
        figure.draw();
    }

    @Test
    public void whenGetNameThenReturnNotNull() {
        final String name = getName();
        assertNotNull(name);
    }

    @Test
    public void whenGetFigureThenReturnNotNull() {
        final AbstractFigure figure = getFigure();
        assertNotNull(figure);
    }

    protected Point createPoint(final double abscissa, final double ordinate) {
        final PointBuilder builder = Point.getBuilder();
        builder.addAbscissa(abscissa).addOrdinate(ordinate);
        return builder.build();
    }

    protected abstract String getName();

    protected abstract AbstractFigure getFigure();
}