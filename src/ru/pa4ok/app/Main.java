package ru.pa4ok.app;

public class Main
{
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
