package ru.pa4ok;

import java.nio.file.Paths;

public class Teacher extends Human
{
    protected String subject;
    protected int exp;

    public Teacher(String firstname, String surname, String patronymic, int age, String subject, int exp)
    {
        super(firstname, surname, patronymic, age); //вызов родительского конструктора должен быть 1 действием в конструкторе наследника
        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public void test()
    {
        System.out.println("test from teacher");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", exp=" + exp +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
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
