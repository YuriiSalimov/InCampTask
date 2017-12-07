package com.salimov.yurii.incamp.figure.rectangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class RectangleBuilderTest {

    private RectangleBuilder builder;

    @Before
    public void beforeTests() {
        this.builder = new RectangleBuilder();
    }

    @Test
    public void whenBuildThenReturnValidRectangle() {
        final Rectangle rectangle = this.builder.build();
        assertTrue(rectangle.getWidth() == 0);
        assertTrue(rectangle.getHeight() == 0);
    }

    @Test
    public void whenAddWidthThenBuildWithIt() {
        Rectangle rectangle;
        for (int i = 1; i <= 5; i++) {
            this.builder.addWidth(i);
            rectangle = this.builder.build();
            assertTrue(rectangle.getWidth() == i);
        }
    }

    @Test
    public void whenAddNegativeWidthThenBuildWithZero() {
        this.builder.addWidth(-5);
        final Rectangle rectangle = this.builder.build();
        assertTrue(rectangle.getWidth() == 0);
    }

    @Test
    public void whenAddHeightThenBuildWithIt() {
        Rectangle rectangle;
        for (int i = 1; i <= 5; i++) {
            this.builder.addHeight(i);
            rectangle = this.builder.build();
            assertTrue(rectangle.getHeight() == i);
        }
    }

    @Test
    public void whenAddNegativeHeightThenBuildWithZero() {
        this.builder.addHeight(-5);
        final Rectangle rectangle = this.builder.build();
        assertTrue(rectangle.getHeight() == 0);
    }
}