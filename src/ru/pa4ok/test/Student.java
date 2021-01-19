package ru.pa4ok.test;

public class Student
{
    private String name;
    private int age;
    private int level;

    public Student(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public Student(String name, int age)
    {
        this(name, age, 1);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
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
