package ru.pa4ok.school;

public class Main
{
    /*

    все поля protected + геттеры и сеттеры + toString()

    Human
    - String firstname;
    - String surname;
    - String patronymic;
    - int age;
    - public void nextYear() //age++

    Teacher extends Human
    - String subject
    - int exp
    - public void nextYear() //вызывать родительскую реализацию и exp++

    Student extends Human
    - int level
    - public void nextYear() //вызывать родительскую реализацию и level++

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
                344,
                "top school"
        );
        school.getTeachers().add(new Teacher("a", "b", "c", 64, "pp", 30));
        school.getStudents().add(new Student("grg", "grgr", "fgrfre", 23, 5));

        System.out.println(school);
        System.out.println(school.nextYearAll());
        System.out.println(school);
        System.out.println(school.nextYearAll());
        System.out.println(school);
    }
}
