package ru.pa4ok;

public class Main
{
    /*

    все поля protected + геттеры и сеттеры + toString()

    abstract Human
    - String firstname;
    - String surname;
    - String patronymic;
    - int age;
    - public void nextYear() //age++
    - public abstract void work()

    Teacher extends Human
    - String subject
    - int exp
    - public void nextYear() //вызывать родительскую реализацию и exp++
    - public void work()
        //переопределение абстрактной функции
        //вывод в консоль "учит студентов"

    Student extends Human
    - int level
    - public void nextYear() //вызывать родительскую реализацию и level++
    - public void work()
        //переопределение абстрактной функции
        //вывод в консоль "делает лабы"

    abstract Building
    - String address
    - int floorCount
    - public abstract String getBuildingType()
        //абстрактная функция
        //возвращает тип здания (жилое, социальное, промышленное)

    School extends Building
    - int index
    - String title
    - Teacher[] teachers
    - Student[] students
    - public boolean addEntity(Human human)
            если класс объекта human принадлежит классу Teacher
            то нужно добавить его на пустое месте в массиве teachers и вернуть true
            если класс объекта human принадлежит классу Student
            то нужно добавить его на пустое месте в массиве students и вернуть true
            если и не то и не то - вывести в консоль аля not a school entity + human
            если пустого места нет или у нас "not a school entity" то вернуть false
    - public int nextYearAll()
        перебирает всех студентов и преподавателей и вызывает у них nextYear()
        если после вызова метода у стундента курс > 5, то его нужно заменить на null
        и вывести информацию о том, что он закончил вуз
        если после вызова метода у преподавателя возраст > 65
        то его нужно заменить на null
        и вывести информацию о том, что он вышел на пенсию
        возвращаемым значением функции будет количество ушедших людей из школы
    - public String getBuildingType()
        //переопределение абстрактной функции
        //возвращает тип здания социальное



     */

    public static void main(String[] args)
    {
        //нельзя напрямую создать объект абстрактного класса
        //AbstractHuman human = new AbstractHuman();


        Student student = new Student(34);

        //анонимный класс
        //инициализация абстрактного класса "на ходу"
        AbstractHuman human = new AbstractHuman(55) {
            @Override
            public void testAbstract() {
                System.out.println(";wfjwke");
            }
        };

        human.testAbstract();
    }
}
