package ru.pa4ok.school;

import java.util.ArrayList;
import java.util.List;

public class School extends Building
{
    protected int index;
    protected String title;
    protected List<Teacher> teachers = new ArrayList<>();
    protected List<Student> students = new ArrayList<>();

    public School(String address, int floorCount, int index, String title) {
        super(address, floorCount);
        this.index = index;
        this.title = title;
    }

    public boolean addEntity(Human human)
    {
        if(human instanceof Teacher)
        {
            teachers.add((Teacher) human);
            return true;
        }
        else if(human instanceof Student)
        {
            students.add((Student) human);
            return true;
        }
        else
        {
            System.out.println("not a school entity " + human);
            return false;
        }
    }

    public int nextYearAll()
    {
        int k = 0;

        //вариант 1, развернуть перебор задом наперед
        for(int i=teachers.size()-1; i>=0; i--)
        {
            Teacher teacher = teachers.get(i);
            teacher.nextYear();
            if(teacher.getAge() > 65) {
                System.out.println(teacher + " ушел на пенсию");
                teachers.remove(i);
                k++;
            }
        }

        //вариант 2, временная коллекция и removeAll
        List<Student> studentsToRemove = new ArrayList<>();
        for(Student s : students)
        {
            s.nextYear();
            if(s.getLevel() > 5) {
                System.out.println(s + " выпустился в армию");
                studentsToRemove.add(s);
                k++;
            }
        }
        students.removeAll(studentsToRemove);

        //вариант 3, removeIf
        /*for(Student s : students)
        {
            s.nextYear();
            if(s.getLevel() > 5) {
                System.out.println(s + " выпустился в армию");
                k++;
            }
        }
        students.removeIf(student -> student.getLevel() > 5);*/

        return k;
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

