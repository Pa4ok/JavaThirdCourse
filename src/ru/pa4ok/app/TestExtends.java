package ru.pa4ok.app;

//при наследовании абстрактного класса обычным
//мы обязаны реализовать все его абстрактные функции
public class TestExtends extends TestAbstractClass
{
    public TestExtends(int i) {
        super(i);
    }

    @Override
    public String getTEstString() {
        return "iughieuerigg";
    }
}
