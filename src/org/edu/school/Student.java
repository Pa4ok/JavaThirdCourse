package org.edu.school;

public class Student
{
    private HumanInfo humanInfo;
    private int level;

    public Student(HumanInfo humanInfo, int level) {
        this.humanInfo = humanInfo;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "humanInfo=" + humanInfo +
                ", level=" + level +
                '}';
    }

    public HumanInfo getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanInfo humanInfo) {
        this.humanInfo = humanInfo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
