package ru.pa4ok.app;

public class Teacher extends Human
{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patronymic, GenderEnum gender, int age, String subject, int exp) {
        super(firstname, surname, patronymic, gender, age);
        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public void nextYear() {
        super.nextYear();
        this.exp++;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
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
