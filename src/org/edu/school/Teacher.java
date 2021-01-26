package org.edu.school;

import java.util.Arrays;

public class Teacher
{
    private HumanInfo humanInfo;
    private String subject;
    private int exp;

    public Teacher(HumanInfo humanInfo, String subject, int exp)
    {
        this.humanInfo = humanInfo;
        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "humanInfo=" + humanInfo +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
                '}';
    }

    public HumanInfo getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanInfo humanInfo) {
        this.humanInfo = humanInfo;
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
}
