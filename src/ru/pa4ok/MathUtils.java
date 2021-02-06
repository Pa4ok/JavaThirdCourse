package ru.pa4ok;

public class MathUtils
{
    public static QuadraticEquationRoot calculateQuadraticEquation(QuadraticEquation equation)
    {
        double d = Math.pow(equation.getB(), 2) - 4 * equation.getA() * equation.getC();

        if(d > 0)
        {
            double sqrtD = Math.sqrt(d);

            return new QuadraticEquationRoot(
                    (-1 * equation.getB() + sqrtD) / (2 * equation.getA()),
                    (-1 * equation.getB() - sqrtD) / (2 * equation.getA())
            );

        }
        else if(d == 0)
        {
            return new QuadraticEquationRoot(-1 * equation.getB() / (2 * equation.getA()));
        }
        else
        {
            return new QuadraticEquationRoot();
        }
    }
}
