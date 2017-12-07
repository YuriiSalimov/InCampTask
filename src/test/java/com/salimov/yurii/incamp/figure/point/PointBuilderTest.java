package com.salimov.yurii.incamp.figure.point;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class PointBuilderTest {

    private PointBuilder builder;

    @Before
    public void beforeTests() {
        this.builder = new PointBuilder();
    }

    @Test
    public void whenBuildThenReturnValidPoint() {
        final Point point = this.builder.build();
        assertTrue(point.getAbscissa() == 0);
        assertTrue(point.getOrdinate() == 0);
    }

    @Test
    public void whenAddAbscissaThenBuildWithIt() {
        Point point;
        for (int i = 0; i <= 5; i++) {
            this.builder.addAbscissa(i);
            point = this.builder.build();
            assertTrue(point.getAbscissa() == i);
        }
    }

    @Test
    public void whenAddNegativeAbscissaThenBuildWithIt() {
        Point point;
        for (int i = -5; i < 0; i++) {
            this.builder.addAbscissa(i);
            point = this.builder.build();
            assertTrue(point.getAbscissa() == i);
        }
    }

    @Test
    public void whenAddOrdinateThenBuildWithIt() {
        Point point;
        for (int i = 1; i <= 5; i++) {
            this.builder.addOrdinate(i);
            point = this.builder.build();
            assertTrue(point.getOrdinate() == i);
        }
    }

    @Test
    public void whenAddNegativeOrdinateThenBuildWithZero() {
        Point point;
        for (int i = -5; i < 0; i++) {
            this.builder.addOrdinate(i);
            point = this.builder.build();
            assertTrue(point.getOrdinate() == i);
        }
    }
}