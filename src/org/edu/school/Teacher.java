package org.edu.school;

import java.util.Arrays;

public class Teacher
{
    private HumanInfo humanInfo;
    private Subject subject;
    private int exp;
    private String[] warnings = new String[3];

    public Teacher(HumanInfo humanInfo, Subject subject, int exp)
    {
        this.humanInfo = humanInfo;
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

    public boolean hasBanned()
    {
        for(String s : warnings)
        {
            if(s == null) {
                return false;
            }
        }
        return true;
    }

    public String getTeacherInfo()
    {
        return humanInfo.getShortNames() + " ban:" + hasBanned() + " subject:" + subject.getTitle();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "humanInfo=" + humanInfo +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
                ", warnings=" + Arrays.toString(warnings) +
                '}';
    }

    public HumanInfo getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanInfo humanInfo) {
        this.humanInfo = humanInfo;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
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
