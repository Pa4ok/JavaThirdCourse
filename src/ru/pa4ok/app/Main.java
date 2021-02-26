package ru.pa4ok.app;

public class Main
{
    /*
    если класс наследуется кем либо - все поля protected
    если класс НЕ наследуется - все поля private
    ко всем классам геттеры и сеттеры + toString()

    Human
    - String firstname;
    - String surname;
    - String patronymic;
    - int age;

    Teacher extends Human
    - String subject
    - int exp

    Student extends Human
    - int level

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
     */

    public static void main(String[] args)
    {
        Human h = new Human("g", "g", "g", 64);
        Teacher t = new Teacher("a", "b", "c", 65, "greg", 45);
        Student s = new Student("g", "jm", "uk", 20, 5);

        School school = new School("4ff", 5, 1, "grgfeg", 2, 2);
        System.out.println(school);
        school.addEntity(t);
        school.addEntity(s);
        school.addEntity(h);
        System.out.println(school);
    }

    private static void incrementYear(Human h)
    {
        h.age++;
    }
}
