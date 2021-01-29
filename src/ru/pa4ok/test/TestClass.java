package ru.pa4ok.test;

public class TestClass
{
    int i1 = 1; //доступен из этого класса и классов из одного пакета
    public int i2 = 2; //везде
    private int i3 = 3; //только из этого класса
    protected int i4 = 4; //доступен из этого класса, классов из одного пакета и классов наследников
}
