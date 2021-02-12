package ru.pa4ok.app;

import java.util.Arrays;

public class School extends Building
{
    private int id;
    private String title;
    private Teacher[] teachers;
    private Student[] students;

    public School(String address, int floorCount, int id, String title, Teacher[] teachers, Student[] students) {
        super(address, floorCount);
        this.id = id;
        this.title = title;
        this.teachers = teachers;
        this.students = students;
    }

    public School(String address, int floorCount, int id, String title, int teachersLength, int studentsLength) {
        this(address, floorCount, id, title, new Teacher[teachersLength], new Student[studentsLength]);
    }

    public boolean addEntity(Human human)
    {
        if(human instanceof Teacher)
        {
            for(int i=0; i<teachers.length; i++) {
                if(teachers[i] == null) {
                    teachers[i] = (Teacher) human;
                    return true;
                }
            }
            return false;
        }
        else if(human instanceof Student)
        {
            for(int i=0; i<students.length; i++) {
                if(students[i] == null) {
                    students[i] = (Student) human;
                    return true;
                }
            }
            return false;
        }
        else {
            System.out.println("not a school entity: " + human);
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
                    System.out.println("вышел на пенсию: " + teachers[i]);
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
                ", id=" + id +
                ", title='" + title + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
