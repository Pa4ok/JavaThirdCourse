package ru.pa4ok;

import java.util.Arrays;

public class Triangle extends Figure2D
{
    private double sideA;
    private double sideB;
    private double sideC;

    private double square;

    public Triangle(String title, Point2D a, Point2D b, Point2D c) {
        super(title, new Point2D[] {a, b, c});
        this.calculate();
    }

    private void calculate()
    {
        Point2D a = points[0];
        Point2D b = points[1];
        Point2D c = points[2];

        this.sideA = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getZ() - a.getZ(), 2));
        this.sideB = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getZ() - b.getZ(), 2));
        this.sideC = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getZ() - c.getZ(), 2));

        double p = (sideA + sideB + sideC) / 2;

        this.square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getSquare() {
        return this.square;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "title='" + title + '\'' +
                ", points=" + Arrays.toString(points) +
                '}';
    }
}
