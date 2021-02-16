package ru.pa4ok;

//при наследовании абстрактного класса обычным классом
//мы должны реализовать все его абстрактные функции
public class Student extends AbstractHuman
{
    public Student(int i) {
        super(i);
    }

    @Override
    public void testAbstract() {
        System.out.println("123");
    }
}
