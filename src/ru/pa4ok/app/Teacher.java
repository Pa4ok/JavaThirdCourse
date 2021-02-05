package ru.pa4ok.app;

import java.nio.file.Paths;
import java.util.Arrays;

public class Teacher
{
    private String name;
    private String subject;
    private int exp;
    private String[] groups;

    public Teacher(String name, String subject, int exp, String[] groups)
    {
        this.name = name;
        this.subject = subject;
        this.exp = exp;
        this.groups = groups;
    }

    public Teacher(String name, String subject, int exp, int groupsSize)
    {
        this(name, subject, exp, new String[groupsSize]);
    }

    public boolean hasGroup(String g)
    {
        for(String s : groups)
        {
            if(g.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean addGroup(String g)
    {
        for(int i=0; i<groups.length; i++)
        {
            if(groups[i] == null) {
                groups[i] = g;
                return true;
            } else if(groups[i].equals(g)) {
                return false;
            }
        }
        return false;
    }

    public boolean removeGroup(String g)
    {
        for(int i=0; i<groups.length; i++) {
            if(g.equals(groups[i])) {
                groups[i] = null;
                return true;
            }
        }
        return false;
    }

    /*
     if(g.equals(groups[i]))

     if(groups[i] != null && groups[i].equals(g))
     */

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
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
