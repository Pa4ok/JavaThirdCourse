package ru.pa4ok.app;

//extends Human - унаследование класса Human
//множественно наследования в java нет
public class Teacher extends Human
{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patronymic, int age, String subject, int exp)
    {
        super(firstname, surname, patronymic, age);
        /*
        вызов родительского конструктора через super(...) обязателен
        и должен быть первым действием в конструкоре наследника
         */
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
    public String getTestStr()
    {
        String s = super.getTestStr();
        s += "reghreg";
        return s;
    }

    //переопределение метода toString() из класса Human
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
