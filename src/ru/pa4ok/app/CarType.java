package ru.pa4ok.app;

public class CarType
{
    private String title;
    private int power;
    private int weight;

    public CarType(String title, int power, int weight) {
        this.title = title;
        this.power = power;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "title='" + title + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
