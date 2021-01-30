package ru.pa4ok.app;

import java.util.Arrays;

public class TestClass
{
    private int id;
    private String[] components; //= new String[5];

    public TestClass(int id, String[] components) {
        this.id = id;
        this.components = components;
    }

    public TestClass(int id, int componentsLength) {
        this(id, new String[componentsLength]);
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "id=" + id +
                ", components=" + Arrays.toString(components) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }
}
