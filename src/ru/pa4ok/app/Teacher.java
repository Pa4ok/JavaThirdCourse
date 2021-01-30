package ru.pa4ok.app;

import java.util.Arrays;

public class Teacher
{
    private String name;
    private int age;
    private String subject;
    private int exp;
    private Group[] groups;

    public Teacher(String name, int age, String subject, int exp, Group[] groups)
    {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.exp = exp;
        this.groups = groups;
    }

    public Teacher(String name, int age, String subject, int exp, int groupsCount)
    {
        this(name, age, subject, exp, new Group[groupsCount]);
    }

    public boolean hasGroup(String group)
    {
        for(Group g : groups)
        {
            if(g != null && g.getTitle().equals(group)) {
                return true;
            }
        }
        return false;
    }

    public void addGroup(Group group)
    {
        for(int i=0; i<groups.length; i++)
        {
            if(groups[i] == null) {
                groups[i] = group;
                return;
            }
        }

        System.out.println("не хватило места для групы " + group);
    }

    public void removeGroup(String group)
    {
        for(int i=0; i<groups.length; i++)
        {
            if(groups[i] != null && groups[i].getTitle().equals(group)) {
                groups[i] = null;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
                ", groups=" + Arrays.toString(groups) +
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
