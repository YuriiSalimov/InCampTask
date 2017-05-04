package com.salimov.yurii.incamp.service;

import com.salimov.yurii.incamp.figure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The class implements a set of methods
 * for creating a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureGenerator implements Generator {

    /**
     * An instance of Random class to generate
     * a stream of pseudorandom numbers.
     */
    private final static Random RANDOM = new Random();

    /**
     * Maximum coordinate of a geometric figures.
     */
    private int maxCoordinate;

    /**
     * Default constructor.
     * Initializes a random maximum coordinate
     * of a geometric figures.
     */
    public FigureGenerator() {
        this(Math.abs(RANDOM.nextInt()));
    }

    /**
     * Constructor.
     *
     * @param maxCoordinate the maximum coordinate of
     *                      a geometric figures.
     */
    public FigureGenerator(int maxCoordinate) {
        setMaxCoordinate(maxCoordinate);
    }

    /**
     * Creates and returns a list of a random geometric figures.
     *
     * @param number the figures number.
     * @return a list of a random geometric figures.
     */
    @Override
    public List<Figure> getFigures(int number) {
        List<Figure> figures = new ArrayList<>();
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                Figure figure = getFigure(getNextInt());
                figures.add(figure);
            }
        }
        return figures;
    }

    /**
     * Creates and returns a Circle geometric figure
     * with random fields.
     *
     * @return a Circle geometric figure.
     */
    @Override
    public Circle getCircle() {
        int radius = getNextInt();
        return new CircleImpl(radius);
    }

    /**
     * Creates and returns a Point geometric figure
     * with random fields.
     *
     * @return a Point geometric figure.
     */
    @Override
    public Point getPoint() {
        int abscissa = getNextInt();
        int ordinate = getNextInt();
        return new PointImpl(abscissa, ordinate);
    }

    /**
     * Creates and returns a Rectangle geometric figure
     * with random fields.
     *
     * @return a Rectangle geometric figure.
     */
    @Override
    public Rectangle getRectangle() {
        int width = getNextInt();
        int height = getNextInt();
        return new RectangleImpl(width, height);
    }

    /**
     * Creates and returns a Triangle geometric figure
     * with random fields.
     *
     * @return a Triangle geometric figure.
     */
    @Override
    public Triangle getTriangle() {
        Triangle triangle;
        do {
            int sideA = getNextInt();
            int sideB = getNextInt();
            int sideC = getNextInt();
            triangle = new TriangleImpl(sideA, sideB, sideC);
        } while (!triangle.isTriangle());
        return triangle;
    }

    /**
     * Returns a maximum coordinate of a geometric figures.
     *
     * @return a maximum coordinate of a geometric figures.
     */
    public int getMaxCoordinate() {
        return this.maxCoordinate;
    }

    /**
     * Sets a new maximum coordinate of a geometric figures.
     * If input maximum coordinate is negative, then sets zero.
     *
     * @param maxCoordinate the new maximum coordinate of a geometric figures.
     */
    public void setMaxCoordinate(int maxCoordinate) {
        this.maxCoordinate = (maxCoordinate > 0) ? maxCoordinate : 0;
    }

    /**
     * Creates and returns a geometric figure
     * with random fields by the number:
     * 0 - Circle, 1 - Point, 2 - Rectangle, 3 - Triangle
     *
     * @param number the figure number.
     * @return a geometric figure.
     */
    private Figure getFigure(int number) {
        Figure figure;
        switch (number) {
        case 0:
            figure = getCircle();
            break;
        case 1:
            figure = getPoint();
            break;
        case 2:
            figure = getRectangle();
            break;
        case 3:
            figure = getTriangle();
            break;
        default:
            figure = getFigure(number % 4);
        }
        return figure;
    }

    /**
     * Returns a random number in diapason
     * from maxCoordinate to 2 * maxCoordinate.
     *
     * @return a random number.
     */
    private int getNextInt() {
        return RANDOM.nextInt(getMaxCoordinate()) + getMaxCoordinate();
    }
}
