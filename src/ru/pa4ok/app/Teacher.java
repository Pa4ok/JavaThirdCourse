package ru.pa4ok.app;

import java.util.Arrays;

public class Teacher
{
    private String name;
    private int age;
    private String subject;
    private int exp;
    private String[] groups;

    public Teacher(String name, int age, String subject, int exp, String[] groups)
    {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.exp = exp;
        this.groups = groups;
    }

    public Teacher(String name, int age, String subject, int exp, int groupsCount)
    {
        this(name, age, subject, exp, new String[groupsCount]);
    }

    public boolean hasGroup(String group)
    {
        for(String s : groups)
        {
            if(group.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void addGroup(String group)
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
            if(group.equals(groups[i])) {
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

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }
}
