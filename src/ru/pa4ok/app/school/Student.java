package ru.pa4ok.app.school;

public class Student extends Human
{
    private int level;

    public Student(String firstname, String surname, String patronymic, GenderEnum gender, int age, int level) {
        super(firstname, surname, patronymic, gender, age);
        this.level = level;
    }

    @Override
    public void nextYear() {
        super.nextYear();
        this.level++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", level=" + level +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
