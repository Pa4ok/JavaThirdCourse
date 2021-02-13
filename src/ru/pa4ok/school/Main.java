package ru.pa4ok.school;

public class Main
{
    /*
    если класс наследуется кем либо - все поля protected
    если класс НЕ наследуется - все поля private
    ко всем классам геттеры и сеттеры + toString()

    enum GenderEnum
    - MALE
    - FEMALE

    Human
    - String firstname
    - String surname
    - String patronymic
    - GenderEnum gender
    - int age
    - public void nexYear() //age++

    Teacher extends Human
    - String subject
    - int exp
    - public void nexYear() //сначала вызывать родительскую реализацию, потом exp++

    Student extends Human
    - int level
    - public void nexYear() //сначала вызывать родительскую реализацию, потом level++

    Building
    - String address
    - int floorCount

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
        если после вызова метода у преподавателя возраст > 65, то его нужно заменить на null
        и вывести информацию о том, что он вышел на пенсию
        возвращаемым значением функции будет количество ушедших людей из школы
     */

    public static void main(String[] args)
    {
        School school = new School(
                "spb",
                5,
                33,
                "reolgregjre",
                new Teacher[] {
                        new Teacher("a", "b", "c", GenderEnum.FEMALE, 64, "reegrg", 20),
                        null
                },
                new Student[] {
                        new Student("gh", "f", "l", GenderEnum.MALE, 23, 5)
                }
        );

        System.out.println(school);
        System.out.println(school.nextYearAll());
        System.out.println(school.nextYearAll());
        System.out.println(school);
    }

    public static void incrementAge(Human human)
    {
        human.age++;
    }
}
