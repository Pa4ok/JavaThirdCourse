package ru.pa4ok;

import java.util.ArrayList;
import java.util.List;

public class School extends Building
{
    private int index;
    private String title;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public School(String address, int floorCount, int index, String title) {
        super(address, floorCount);
        this.index = index;
        this.title = title;
    }

    public boolean addEntity(Human human)
    {
        if(human instanceof Teacher) {
            return teachers.add((Teacher) human);
        }
        else if(human instanceof Student) {
            return students.add((Student) human);
        } else {
            System.out.println("Он лишний: " + human);
            return false;
        }
    }

    public int nextYearAll()
    {
        int counter = 0;

        //чтобы избежать ошибки при удалении элемента из списка при его переборе есть несколько вариантов

        //вариант 1, перебирать обычным циклом с конца
        /*for(int i=teachers.size()-1; i>=0; i--) {
            Teacher t = teachers.get(i);
            if(t.getAge() > 65) {
                System.out.println("ушел на пенсию: " + t);
                teachers.remove(i);
                counter++;
            }
        }*/

        //вариант 2, список для удаления
        /*List<Teacher> toRemove = new ArrayList<>();
        for(Teacher t : teachers) {
            t.nextYear();
            if(t.getAge() > 65) {
                System.out.println("ушел на пенсию: " + t);
                toRemove.add(t);
                counter++;
            }
        }
        teachers.removeAll(toRemove);*/

        //вариант 3
        /*for(Teacher t : teachers) {
            t.nextYear();
            if(t.getAge() > 65) {
                System.out.println("ушел на пенсию: " + t);
                counter++;
            }
        }
        teachers.removeIf(teacher -> teacher.getAge() > 65);*/

        /*for(int i=0; i<students.length; i++)
        {
            if(students[i] != null) {
                students[i].nextYear();
                if(students[i].getLevel() > 5) {
                    System.out.println("выпустился: " + students[i]);
                    students[i] = null;
                    counter++;
                }
            }
        }*/

        return counter;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", floorCount=" + floorCount +
                ", index=" + index +
                ", title='" + title + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
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

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
