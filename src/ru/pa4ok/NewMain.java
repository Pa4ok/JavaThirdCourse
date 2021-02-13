package ru.pa4ok;

public class NewMain
{
    /*
        если класс наследуется кем либо - все поля protected
        если класс НЕ наследуется - все поля private
        ко всем классам геттеры и сеттеры + toString()

        Point2D
        - double x
        - double z

        Figure2D
        - String title
        - Point[] points
        - public double getSquare() //в данном классе функция будет возвращать всегда -1

        Triangle extends Figure2D
        //предоставляет фиксированный конструтор для создания треугольника
        - public double getSquare() //переопределяет функцию getSquare(), чтобы она уже возвращала площадь
        - public boolean isIsosceles() //является ли треугольник равнобедренным
        - public boolean isRectangular() //является ли треугольник прямоугольным

        Rectangle extends Figure2D
        //предоставляет фиксированный конструтор для создания прямоугольника
        - public double getSquare() //переопределяет функцию getSquare(), чтобы она уже возвращала площадь
        - public boolean isSquare() //проверяет является ли прямоугольник квадратом

        разметить классы, создать объекты Triangle и Rectangle, протестировать методы
     */

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(
                "треугоауц",
                new Point2D(-3, 0),
                new Point2D(0, 4),
                new Point2D(3, 0)
        );

        System.out.println(triangle.getSquare());

    }
}
