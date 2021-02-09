package ru.pa4ok;

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
            то нужно добавить его на пустое месте в массиве teachers
            если класс объекта human принадлежит классу Student
            то нужно добавить его на пустое месте в массиве students
            если и не то и не то - вывести в консоль аля not a school entity + human



     */

    public static void main(String[] args)
    {
        Student student = new Student("a", "b", "c", 15, 3);
        System.out.println(student);

        Teacher teacher = new Teacher("d", "e", "f", 30, "pp", 5);
        System.out.println(teacher);

        Human human = new Student("fe", "refew", "fewefgr", 20, 5);
        System.out.println(human);

        Human human1 = new Teacher("dfwef", "efwwfe", "ffwef", 30, "pp", 5);
        System.out.println(human);


        System.out.println();

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
        student.test();
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
