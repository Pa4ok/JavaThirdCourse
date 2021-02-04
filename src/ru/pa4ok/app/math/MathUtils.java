package ru.pa4ok.app.math;

public class MathUtils
{
    public static SquareEquationRoot calculateQuadraticEquation(SquareEquation squareEquation)
    {
        double d = Math.pow(squareEquation.getB(), 2) - 4 * squareEquation.getA() * squareEquation.getC();

        if(d < 0) {
            return new SquareEquationRoot();
        }

        double sqrtD = Math.sqrt(d);

        return new SquareEquationRoot(
                (-1 * squareEquation.getB() + sqrtD) / (2 * squareEquation.getA()),
                (-1 * squareEquation.getB() - sqrtD) / (2 * squareEquation.getA())
        );
    }
}
