package ru.pa4ok;

public class Teacher extends Human
{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patronymic, GenderEnum gender, int age, String subject, int exp)
    {
        //вызов родительского конструктора может быть только на 1 месте в конструторе наследника
        super(firstname, surname, patronymic, gender, age);

        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public void nextYear()
    {
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
