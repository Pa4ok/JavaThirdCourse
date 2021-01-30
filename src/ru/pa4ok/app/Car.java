package ru.pa4ok.app;

public class Car
{
    private String manufacturer;
    private String mark;
    private int weight;
    private String color;
    private String number;

    public Car(String manufacturer, String mark, int weight, String color, String number)
    {
        this.manufacturer = manufacturer;
        this.mark = mark;
        this.weight = weight;
        this.color = color;
        this.number = number;
    }

    public Car(String manufacturer, String mark, int weight)
    {
        this(manufacturer, mark, weight, "черный", null);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", mark='" + mark + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
