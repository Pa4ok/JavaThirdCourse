package org.edu.school;

import java.util.Arrays;

public class Teacher
{
    private String name;
    private int age;
    private String subject;
    private int exp;
    private String[] warnings = new String[3];

    public Teacher(String name, int age, String subject, int exp)
    {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.exp = exp;
    }

    public void addWarn(String warn)
    {
        for(int i=0; i< warnings.length; i++)
        {
            if(warnings[i] == null) {
                warnings[i] = warn;
                return;
            }
        }
        System.out.println("Бан ему: " + this);
    }

    public boolean hasWarn(String warn)
    {
        for(String s : warnings)
        {
            if(warn.equals(s))
            {
                return true;
            }
        }
        return false;
    }

    public void delWarn(String warn)
    {
        for(int i=0; i< warnings.length; i++)
        {
            if(warn.equals(warnings[i]))
            {
                warnings[i] = null;
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
                ", warnings=" + Arrays.toString(warnings) +
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

    public String[] getWarnings() {
        return warnings;
    }

    public void setWarnings(String[] warnings) {
        this.warnings = warnings;
    }
}
