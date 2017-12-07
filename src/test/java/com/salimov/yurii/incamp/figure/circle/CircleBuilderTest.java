package com.salimov.yurii.incamp.figure.circle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class CircleBuilderTest {

    private CircleBuilder builder;

    @Before
    public void beforeTests() {
        this.builder = new CircleBuilder();
    }

    @Test
    public void whenBuildThenReturnNotNull() {
        assertNotNull(this.builder.build());
    }

    @Test
    public void whenBuildThenReturnValidCircle() {
        final Circle circle = this.builder.build();
        assertTrue(circle.getRadius() == 0);
    }

    @Test
    public void whenAddRadiusThenBuildWithIt() {
        Circle circle;
        for (int i = 1; i <= 5; i++) {
            this.builder.addRadius(i);
            circle = this.builder.build();
            assertTrue(circle.getRadius() == i);
        }
    }

    @Test
    public void whenAddNegativeRadiusThenBuildWithZero() {
        this.builder.addRadius(-5);
        final Circle circle = this.builder.build();
        assertTrue(circle.getRadius() == 0);
    }
}