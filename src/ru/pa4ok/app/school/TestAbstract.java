package ru.pa4ok.app.school;

public abstract class TestAbstract
{
    protected int i;
    protected String s;

    public TestAbstract(int i, String s) {
        this.i = i;
        this.s = s;
    }

    //абстрактная функция, без тела, те без реализации
    //такие функции могут быть только в абстрактном классе
    public abstract void test();

    @Override
    public String toString() {
        return "TestAbstract{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
