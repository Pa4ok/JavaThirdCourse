package org.edu.school;

public class Subject
{
    private String title;
    private int startLevel;
    private int duration;
    private boolean exam;

    public Subject(String title, int startLevel, int duration, boolean exam) {
        this.title = title;
        this.startLevel = startLevel;
        this.duration = duration;
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", startLevel=" + startLevel +
                ", duration=" + duration +
                ", exam=" + exam +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(int startLevel) {
        this.startLevel = startLevel;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }
}
