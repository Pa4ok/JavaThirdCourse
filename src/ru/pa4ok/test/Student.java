package ru.pa4ok.test;

import java.util.Arrays;

public class Student
{
    private String name;
    private int age;
    private int level;
    private int[] marks;

    public Student(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.marks = new int[4];
    }

    public Student(String name, int age) {
        this(name, age, 1);
    }

    public void setMark(int level, int mark)
    {
        /*if(level < 0 || level >= marks.length) {
            System.out.println("Неверный курс студента!");
            return;
        }

        if(mark < 2 || mark > 5) {
            System.out.println("Неверная оценка!");
            return;
        }*/

        if(level >= 0 && level < marks.length && mark >=2 && mark <= 5)
        {
            //this.marks[level] = mark;
            marks[level] = mark;
        }
        else
        {
            System.out.println("Неверный курс или оценка");
        }
    }


    public int getMark(int level)
    {
        if(level < 0 || level >= marks.length) {
            System.out.println("Такой оценки не существует");
            return 0;
        }

        return marks[level];
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class TestInClass
{
    public int test;
}
