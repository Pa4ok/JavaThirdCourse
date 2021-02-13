package ru.pa4ok;

public class Point2D
{
    private double x;
    private double z;

    public Point2D(double x, double z) {
        this.x = x;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", z=" + z +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
