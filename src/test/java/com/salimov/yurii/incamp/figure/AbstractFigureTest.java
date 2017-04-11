package com.salimov.yurii.incamp.figure;

import org.junit.Assert;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class AbstractFigureTest {

    public void equalsTest(Figure figure1, Figure figure2, Figure figure3) throws Exception {
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(figure1.equals(figure1));

            Assert.assertTrue(figure1.equals(figure2));
            Assert.assertTrue(figure2.equals(figure1));

            Assert.assertTrue(figure1.equals(figure2));
            Assert.assertTrue(figure2.equals(figure3));
            Assert.assertTrue(figure1.equals(figure3));

            Assert.assertFalse(figure1.equals(null));
            Assert.assertFalse(figure2.equals(null));
            Assert.assertFalse(figure3.equals(null));
        }
    }

    public void equalsDifferentFiguresTest(Figure figure1, Figure figure2) throws Exception {
        for (int i = 0; i < 10; i++) {
            Assert.assertFalse(figure1.equals(figure2));
        }
    }

    public void hashCodeTest(Figure figure) throws Exception {
        int hashCode = figure.hashCode();
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(figure.hashCode() == hashCode);
        }
    }
}
