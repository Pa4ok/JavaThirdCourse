package ru.pa4ok;

public class Human
{
    protected String firstname;
    protected String surname;
    protected String patronymic;
    protected int age;

    public Human(String firstname, String surname, String patronymic, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public void test()
    {
        System.out.println("test from human");
    }

    public int testInt()
    {
        return 5;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
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
}
