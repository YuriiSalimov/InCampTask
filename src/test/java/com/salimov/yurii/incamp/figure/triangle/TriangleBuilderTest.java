package com.salimov.yurii.incamp.figure.triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class TriangleBuilderTest {

    private TriangleBuilder builder;

    @Before
    public void beforeTests() {
        builder = new TriangleBuilder();
    }
    @Test
    public void whenBuildThenReturnNotNull() {
        assertNotNull(this.builder.build());
    }

    @Test
    public void whenBuildThenReturnValidCircle() {
        final Triangle triangle = this.builder.build();
        assertTrue(triangle.getSideA() == 0);
        assertTrue(triangle.getSideB() == 0);
        assertTrue(triangle.getSideC() == 0);
    }

    @Test
    public void whenAddSideAThenBuildWithIt() {
        Triangle triangle;
        for (int i = 1; i <= 5; i++) {
            this.builder.addSideA(i);
            triangle = this.builder.build();
            assertTrue(triangle.getSideA() == i);
        }
    }

    @Test
    public void whenAddNegativeSideAThenBuildWithZero() {
        this.builder.addSideA(-5);
        final Triangle triangle = this.builder.build();
        assertTrue(triangle.getSideA() == 0);
    }

    @Test
    public void whenAddSideBThenBuildWithIt() {
        Triangle triangle;
        for (int i = 1; i <= 5; i++) {
            this.builder.addSideB(i);
            triangle = this.builder.build();
            assertTrue(triangle.getSideB() == i);
        }
    }

    @Test
    public void whenAddNegativeSideBThenBuildWithZero() {
        this.builder.addSideB(-5);
        final Triangle triangle = this.builder.build();
        assertTrue(triangle.getSideB() == 0);
    }

    @Test
    public void whenAddSideCThenBuildWithIt() {
        Triangle triangle;
        for (int i = 1; i <= 5; i++) {
            this.builder.addSideC(i);
            triangle = this.builder.build();
            assertTrue(triangle.getSideC() == i);
        }
    }

    @Test
    public void whenAddNegativeSideCThenBuildWithZero() {
        this.builder.addSideC(-5);
        final Triangle triangle = this.builder.build();
        assertTrue(triangle.getSideC() == 0);
    }
}