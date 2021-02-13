package ru.pa4ok;

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
        /*Human human = new Human("a", "b", "c", 15);
        Teacher teacher = new Teacher("a1", "b1", "c1", 55, "irkeghoruiegh", 20);

        System.out.println(human);
        System.out.println(teacher);

        System.out.println();

        human.test();
        System.out.println("===================");
        teacher.test();*/

        /*Human human = new Human("a", "b", "c", 15);
        Human teacher = new Teacher("a1", "b1", "c1", 55, "irkeghoruiegh", 20);

        System.out.println(human);
        System.out.println(teacher);

        incrementAge(human);
        incrementAge(teacher);
        System.out.println();

        System.out.println(human);
        System.out.println(teacher);*/

        //instanceof проверяет класс объекта на принадлежность к другому классу
        /*System.out.println(human instanceof Teacher);
        System.out.println(human instanceof Student);
        System.out.println(human instanceof Human);

        System.out.println();

        System.out.println(teacher instanceof Teacher);
        System.out.println(teacher instanceof Student);
        System.out.println(teacher instanceof Human);*/

        Human h = new Teacher("a1", "b1", "c1", 55, "irkeghoruiegh", 20);
        if(h instanceof Teacher) {
            //приведение типов "от меньшего к большему возможно только после проверки"
            Teacher teacher = (Teacher) h;
        }

    }

    public static void incrementAge(Human human)
    {
        human.age++;
    }
}
