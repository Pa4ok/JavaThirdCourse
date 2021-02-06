package ru.pa4ok.app;

public class QuadraticEquationRoot
{
    private double x1;
    private double x2;
    private int rootCount;

    public QuadraticEquationRoot(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.rootCount = 2;
    }

    public QuadraticEquationRoot(double x1) {
        this.x1 = x1;
        this.rootCount = 1;
    }

    public QuadraticEquationRoot() {
    }

    @Override
    public String toString() {
        return "QuadraticEquationRoot{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", rootCount=" + rootCount +
                '}';
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public int getRootCount() {
        return rootCount;
    }

    public void setRootCount(int rootCount) {
        this.rootCount = rootCount;
    }
}
