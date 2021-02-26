package ru.pa4ok.app.school;

public class Human
{
    private static int idCounter;
    private final int id;
    protected String firstname;
    protected String surname;
    protected String patronymic;
    protected GenderEnum gender;
    protected int age;

    public Human(String firstname, String surname, String patronymic, GenderEnum gender, int age) {
        this.id = ++idCounter;
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.age = age;
    }

    public void nextYear()
    {
        this.age++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}
