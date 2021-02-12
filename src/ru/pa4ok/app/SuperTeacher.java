package ru.pa4ok.app;

public class SuperTeacher extends Teacher
{
    private int superi;

    public SuperTeacher(String firstname, String surname, String patronymic, int age, String subject, int exp, int superi) {
        super(firstname, surname, patronymic, age, subject, exp);
        this.superi = superi;
    }
}
