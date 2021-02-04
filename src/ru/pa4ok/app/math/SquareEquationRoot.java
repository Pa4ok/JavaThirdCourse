package ru.pa4ok.app.math;

public class SquareEquationRoot
{
    private double x1;
    private double x2;
    private boolean noRoots;

    public SquareEquationRoot(double x1, double x2)
    {
        this.x1 = x1;
        this.x2 = x2;
    }

    public SquareEquationRoot()
    {
        noRoots = true;
    }

    @Override
    public String toString() {
        return "SquareEquationRoot{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", noRoots=" + noRoots +
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

    public boolean isNoRoots() {
        return noRoots;
    }

    public void setNoRoots(boolean noRoots) {
        this.noRoots = noRoots;
    }
}
