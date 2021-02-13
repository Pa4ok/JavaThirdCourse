package ru.pa4ok.school;

import java.util.Arrays;

public class School extends Building
{
    private int index;
    private String title;
    private Teacher[] teachers;
    private Student[] students;

    public School(String address, int floorCount, int index, String title, Teacher[] teachers, Student[] students)
    {
        super(address, floorCount);
        this.index = index;
        this.title = title;
        this.teachers = teachers;
        this.students = students;
    }

    public boolean addEntity(Human human)
    {
        if(human instanceof Teacher)
        {
            for(int i=0; i<teachers.length; i++)
            {
                if(teachers[i] == null) {
                    teachers[i] = (Teacher) human;
                    System.out.println("Преподаватель добавлен");
                    return true;
                }
            }
            System.out.println("Нет места для преподавателя");
            return false;
        }
        else if(human instanceof Student)
        {
            for(int i=0; i<students.length; i++)
            {
                if(students[i] == null) {
                    students[i] = (Student) human;
                    System.out.println("Студент добавлен");
                    return true;
                }
            }
            System.out.println("Нет места для стундета");
            return false;
        }
        else
        {
            System.out.println("Он лишний: " + human);
            return false;
        }
    }

    public int nextYearAll()
    {
        int counter = 0;

        for(int i=0; i<teachers.length; i++)
        {
            if(teachers[i] != null) {
                teachers[i].nextYear();
                if(teachers[i].getAge() > 65) {
                    System.out.println("ушел на пенсию: " + teachers[i]);
                    teachers[i] = null;
                    counter++;
                }
            }
        }

        for(int i=0; i<students.length; i++)
        {
            if(students[i] != null) {
                students[i].nextYear();
                if(students[i].getLevel() > 5) {
                    System.out.println("выпустился: " + students[i]);
                    students[i] = null;
                    counter++;
                }
            }
        }

        return counter;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", floorCount=" + floorCount +
                ", index=" + index +
                ", title='" + title + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
