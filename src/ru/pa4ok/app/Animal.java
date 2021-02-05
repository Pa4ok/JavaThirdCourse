package ru.pa4ok.app;

public class Animal
{
    private String title;
    private String type;
    private int legCount;
    private int age;
    private boolean hunter;

    public Animal(String title, String type, int legCount, int age, boolean hunter)
    {
        this.title = title;
        this.type = type;
        this.legCount = legCount;
        this.age = age;
        this.hunter = hunter;
    }

    public Animal(String title, String type)
    {
        this(title, type, 4, 1, false);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", legCount=" + legCount +
                ", age=" + age +
                ", hunter=" + hunter +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHunter() {
        return hunter;
    }

    public void setHunter(boolean hunter) {
        this.hunter = hunter;
    }
}
