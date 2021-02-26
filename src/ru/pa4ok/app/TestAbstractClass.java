package ru.pa4ok.app;

public abstract class TestAbstractClass
{
    private int i;

    public TestAbstractClass(int i) {
        this.i = i;
    }

    public TestAbstractClass() {
    }

    //абстрактная функция без тела
    //"заготовка под функцию"
    //при наследовании абстрактные функции не могут содержаться в обычных классах
    //они должны быть либо реализованы, либо унаследованы абстрактными классами
    public abstract String getTEstString();

    @Override
    public String toString() {
        return "TestAbstractClass{" +
                "i=" + i +
                '}';
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
