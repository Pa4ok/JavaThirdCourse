package ru.pa4ok;

public class Student extends Human
{
    protected int level;

    public Student(String firstname, String surname, String patronymic, int age, int level)
    {
        super(firstname, surname, patronymic, age);
        this.level = level;
    }

    @Override
    public void test()
    {
        super.test();
        System.out.println("test from student");
    }

    @Override
    public boolean testBoolean()
    {
        boolean parentResult = super.testBoolean();
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
