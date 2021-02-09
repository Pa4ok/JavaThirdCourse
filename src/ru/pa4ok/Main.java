package ru.pa4ok;

import javax.swing.event.HyperlinkEvent;

public class Main
{
    /*

    все поля protected + геттеры и сеттеры + toString()

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
        Student student = new Student("a", "b", "c", 15, 3);
        //System.out.println(student);

        Teacher teacher = new Teacher("d", "e", "f", 30, "pp", 5);
        //System.out.println(teacher);

        /*Human human = new Student("fe", "refew", "fewefgr", 20, 5);
        System.out.println(human);

        Human human1 = new Teacher("dfwef", "efwwfe", "ffwef", 30, "pp", 5);
        System.out.println(human);*/

        Human human = new Human("fe", "refew", "fewefgr", 20);
        //System.out.println();

        /*nextIncrementAge(student);
        nextIncrementAge(teacher);
        nextIncrementAge(human);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(human);*/

        /*nextStudentLevel(student);
        System.out.println(student);

        if(human instanceof Student) {
            Student s = (Student)human;
            nextStudentLevel(s);
            System.out.println(human);
        }

        if(human1 instanceof Student) {
            Student s = (Student)human1;
            nextStudentLevel(s);
            System.out.println(human1);
        }*/

        //teacher.test();
        //student.test();

        School school = new School(
                "spb", 5,
                34, "34 gimnaziya", 3, 3
        );
        System.out.println(school);

        System.out.println(school.addEntity(teacher));
        System.out.println(school.addEntity(student));
        System.out.println(school.addEntity(human));

        System.out.println();
        System.out.println(school);
    }

    public static void nextIncrementAge(Human human)
    {
        human.age++;
    }

    public static void nextStudentLevel(Student student)
    {
        student.level++;
    }
}
