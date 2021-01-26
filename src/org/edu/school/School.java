package org.edu.school;

import java.util.Arrays;

public class School
{
    private int index;
    private String title;
    private Teacher[] teachers;// = new Teacher[2];
    private Student[] students;// = new Student[2];


    public School(int index, String title, Teacher[] teachers, Student[] students) {
        this.index = index;
        this.title = title;
        this.teachers = teachers;
        this.students = students;
    }

    public School(int index, String title) {
        this(index, title, new Teacher[2], new Student[2]);
    }

    public void nextYearAll()
    {
        for(Teacher t : teachers) {
            t.nextYear();
        }

        for(Student s : students) {
            s.nextYear();
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "index=" + index +
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
