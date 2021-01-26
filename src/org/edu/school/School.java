package org.edu.school;

public class School
{
    private int index;
    private String title;
    private Teacher teacher;
    private Student student;

    public School(int index, String title, Teacher teacher, Student student) {
        this.index = index;
        this.title = title;
        this.teacher = teacher;
        this.student = student;
    }

    public void work()
    {
        System.out.println(
                teacher.getHumanInfo().getShortNames()
                        + " учит " + student.getHumanInfo().getShortNames()
                        + " на предмете " + teacher.getSubject()
        );
    }

    @Override
    public String toString() {
        return "School{" +
                "index=" + index +
                ", title='" + title + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
