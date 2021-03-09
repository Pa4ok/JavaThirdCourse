package ru.pa4ok.app.school;

public class Main
{
    /*
    если класс наследуется кем либо - все поля protected
    если класс НЕ наследуется - все поля private
    ко всем классам геттеры и сеттеры + toString()

    GenderEnum
    - FEMALE
    - MALE

    abstract Human
    - String firstname;
    - String surname;
    - String patronymic;
    - GenderEnum gender
    - int age;
    - public void nextYear() //age++
    - public abstract void work()

    Teacher extends Human
    - String subject
    - int exp
    - public void nextYear() //вызывает родителькую реализацию, после чего exp++
    - public void work() //выводить в консоль "учит студентов"

    Student extends Human
    - int level
    - public void nextYear() //вызывает родительскую реализацию, после чего level++
    - public void work() //выводить в консоль "делает лабы"

    BuildingTypeEnum
    - LIVING
    - SOCIAL
    - INDUSTRIAL

    abstract Building
    - String address
    - int floorCount
    - public abstract BuildingTypeEnum getBuildingType()

    School extends Building
    - int index
    - String title
    - Teacher[] teachers
    - Student[] students
    - public BuildingTypeEnum getBuildingType() //вернет тут SOCIAL
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
        /*Human h = new Human("g", "g", "g", 64);
        Teacher t = new Teacher("a", "b", "c", 65, "greg", 45);
        Student s = new Student("g", "jm", "uk", 20, 5);

        School school = new School("4ff", 5, 1, "grgfeg", 2, 2);
        System.out.println(school);
        school.addEntity(t);
        school.addEntity(s);
        school.addEntity(h);
        System.out.println(school);*/
    }

    private static void incrementYear(Human h)
    {
        h.age++;
    }
}
