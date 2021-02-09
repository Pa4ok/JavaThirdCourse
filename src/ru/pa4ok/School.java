package ru.pa4ok;

import java.util.Arrays;

public class School extends Building
{
    protected int index;
    protected String title;
    protected Teacher[] teachers;
    protected Student[] students;

    public School(String address, int floorCount, int index, String title, Teacher[] teachers, Student[] students) {
        super(address, floorCount);
        this.index = index;
        this.title = title;
        this.teachers = teachers;
        this.students = students;
    }

    public School(String address, int floorCount, int index, String title, int teacherCount, int studentCount)
    {
        this(address, floorCount, index, title, new Teacher[teacherCount], new Student[studentCount]);
    }

    public boolean addEntity(Human human)
    {
        if(human instanceof Teacher)
        {
            for(int i=0; i<teachers.length; i++) {
                if(teachers[i] == null) {
                    teachers[i] = (Teacher)human;
                    return true;
                }
            }
        }
        else if(human instanceof Student)
        {
            for(int i=0; i<students.length; i++) {
                if(students[i] == null) {
                    students[i] = (Student)human;
                    return true;
                }
            }
        }
        else
        {
            System.out.println("not a school entity " + human);
        }

        return false;
    }

    @Override
    public String toString() {
        return "School{" +
                "index=" + index +
                ", title='" + title + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                ", address='" + address + '\'' +
                ", floorCount=" + floorCount +
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

