package ru.pa4ok.app;

public class Teacher extends Human
{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patronymic, int age, String subject, int exp)
    {
        //вызов родительского конструктора должен стоять на 1 месте
        super(firstname, surname, patronymic, age);
        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public void test()
    {
        super.test();
        System.out.println("test from teacher");
    }

    @Override
    public int testInt() {
        int a = super.testInt();
        a *= 5;
        a += 44;
        return a;
    }

    public void testTeacher()
    {
        System.out.println("erwghwie2fghoewf");
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
