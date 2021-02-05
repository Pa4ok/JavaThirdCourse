package ru.pa4ok.app;

import java.util.Arrays;

public class Student
{
    private String name;
    private int level;
    private int[] marks; //= new int[10];

    public Student(String name, int level, int[] marks)
    {
        this.name = name;
        this.level = level;
        this.marks = marks;
    }

    public Student(String name, int level, int marksCount) {
        this(name, level, new int[marksCount]);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
