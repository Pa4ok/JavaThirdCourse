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
        /*Human human = new Human("g", "g", "g", 64);
        Teacher teacher = new Teacher("a", "b", "c", 65, "greg", 45);

        System.out.println(human);
        System.out.println(teacher);

        System.out.println();

        human.test();
        teacher.test();

        System.out.println();

        System.out.println(human.testInt());
        System.out.println(teacher.testInt());*/

        /*Human h1 = new Human("g", "g", "g", 64);
        Human h2 = new Teacher("a", "b", "c", 65, "greg", 45);
        Human h3 = new Student("g", "jm", "uk", 20, 5);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println(h2 instanceof Teacher);
        System.out.println(h2 instanceof Student);
        System.out.println(h2 instanceof Human);

        if(h2 instanceof Teacher) {
            Teacher t = (Teacher) h2;
            t.testTeacher();
        }

        if(h3 instanceof Teacher) {
            Teacher t = (Teacher) h3;
            t.testTeacher();
        }*/

        Human h = new Human("g", "g", "g", 64);
        Teacher t = new Teacher("a", "b", "c", 65, "greg", 45);
        Student s = new Student("g", "jm", "uk", 20, 5);

        System.out.println(h);
        System.out.println(t);
        System.out.println(s);

        incrementYear(h);
        incrementYear(t);
        incrementYear(s);

        System.out.println();

        System.out.println(h);
        System.out.println(t);
        System.out.println(s);
    }

    private static void incrementYear(Human h)
    {
        h.age++;
    }
}
