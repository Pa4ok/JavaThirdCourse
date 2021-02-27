package ru.pa4ok.task;

import java.util.Arrays;

public class School extends Building
{
    private int index;
    private String title;
    private Teacher[] teachers;
    private Student[] students;

    public School(String address, int floorCount, int index, String title, Teacher[] teachers, Student[] students) {
        super(address, floorCount);
        this.index = index;
        this.title = title;
        this.teachers = teachers;
        this.students = students;
    }

    public School(String address, int floorCount, int index, String title, int teacherCount, int studentCount) {
        this(address, floorCount, index, title, new Teacher[teacherCount], new Student[studentCount]);
    }

    public void workAll()
    {
        for(Teacher t : teachers) {
            if(t != null) {
                t.work();
            }
        }

        for(Student s : students) {
            if(s != null) {
                s.work();
            }
        }
    }

    @Override
    public BuildingTypeEnum getBuildingType() {
        return BuildingTypeEnum.SOCIAL;
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
