package ru.pa4ok;

public class Teacher extends Human
{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patronymic, int age, String subject, int exp)
    {
        //вызов родительского конструктора может быть только на 1 месте в конструторе наследника
        super(firstname, surname, patronymic, age);

        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public void test()
    {
        //вызов родительской реализации функции
        super.test();
        System.out.println("test from teacher");
    }

    @Override
    public int testInt()
    {
        int parent = super.testInt();
        if(parent > 10) {
            parent = 10;
        }
        return parent;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
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
