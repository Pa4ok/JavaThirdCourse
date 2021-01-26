package ru.pa4ok.test;

import java.util.Arrays;

public class Student
{
    private String name;
    private int age;
    private int level;
    private int[] marks;

    public Student(String name, int age, int level, int marksCount) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.marks = new int[marksCount];
    }

    public Student(String name, int age, int marksCount) {
        this(name, age, 1, marksCount);
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

    public void setMark(int index, int mark)
    {
        if(index < 0 || index >= marks.length) {
            System.out.println("Неверный номер семестра: " + index);
            return;
        }

        if(mark < 2 || mark > 5) {
            System.out.println("Неверная оценка: " + mark);
            return;
        }

        marks[index] = mark;
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

    public int[] getMarks() {
        return marks;
    }
}
