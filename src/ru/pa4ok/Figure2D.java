package ru.pa4ok;

import java.util.Arrays;

public class Figure2D
{
    protected String title;
    protected Point2D[] points;

    public Figure2D(String title, Point2D[] points) {
        this.title = title;
        this.points = points;
    }

    public Figure2D(String title, int pointCount) {
        this(title, new Point2D[pointCount]);
    }

    public double getSquare() {
        return -1;
    }

    @Override
    public String toString() {
        return "Figure2D{" +
                "title='" + title + '\'' +
                ", points=" + Arrays.toString(points) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Point2D[] getPoints() {
        return points;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPoints(Point2D[] points) {
        this.points = points;
    }
}
