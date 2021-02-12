package ru.pa4ok.app;

public class Main
{
    /*
    если класс наследуется кем либо - все поля protected
    если класс НЕ наследуется - все поля private
    ко всем классам геттеры и сеттеры + toString()

    GenderEnum
    - FEMALE
    - MALE

    Human
    - String firstname;
    - String surname;
    - String patronymic;
    - GenderEnum gender
    - int age;
    - public void nextYear() //age++

    Teacher extends Human
    - String subject
    - int exp
    - public void nextYear() //вызывает родителькую реализацию, после чего exp++

    Student extends Human
    - int level
    - public void nextYear() //вызывает родительскую реализацию, после чего level++

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
        /*Human human = new Human("a", "b", "c", 15);
        System.out.println(human);
        human.test();

        System.out.println();

        Teacher teacher = new Teacher("a1", "b1", "c1", 40, "rgkr", 5);
        System.out.println(teacher);
        teacher.test();*/

        Human human0 = new Teacher("a1", "b1", "c1", 40, "rgkr", 5);;
        System.out.println(human0);

        Human human1 = new Student("a2", "b2", "c2", 20, 3);
        System.out.println(human1);

        System.out.println();

        incrementYear(human0);
        incrementYear(human1);
        System.out.println(human0);
        System.out.println(human1);

        //принадлежит ли класс объекта human0 классу Teacher
        if(human0 instanceof Teacher) {
            Teacher t = (Teacher) human0;
            System.out.println("mark t0 " + t);
        }

        if(human1 instanceof Teacher) {
            Teacher t = (Teacher) human1;
            System.out.println("mark t1 " + t);
        }

    }

    public static void incrementYear(Human human)
    {
        human.setAge(human.getAge() + 1);
    }
}
