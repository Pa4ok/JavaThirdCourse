package ru.pa4ok;

public class Second extends TestAbstract
{
    public Second() {
        super("second");
    }

    @Override
    public void test() {
        System.out.println("test from Second");
    }
}
