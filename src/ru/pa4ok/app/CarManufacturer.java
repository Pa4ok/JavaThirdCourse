package ru.pa4ok.app;

import java.util.Arrays;

public class CarManufacturer
{
    private String title;
    private int startYear;
    private CarType[] carTypes;

    public CarManufacturer(String title, int startYear, CarType[] carTypes) {
        this.title = title;
        this.startYear = startYear;
        this.carTypes = carTypes;
    }

    public CarManufacturer(String title, int startYear, int length) {
        this(title, startYear, new CarType[length]);
    }

    public boolean hasType(String type)
    {
        for(CarType c : carTypes) {
            if(c != null && c.getTitle().equals(type)) {
                return true;
            }
        }
        return false;
    }

    public void addType(CarType carType)
    {
        for(int i=0; i< carTypes.length; i++)
        {
            if(carTypes[i] == null) {
                carTypes[i] = carType;
                return;
            }
        }
        System.out.println("нет места");
    }

    public void deleteType(String type)
    {
        for(int i=0; i< carTypes.length; i++)
        {
            if(carTypes[i] != null && carTypes[i].getTitle().equals(type)) {
                carTypes[i] = null;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "CarManufacturer{" +
                "title='" + title + '\'' +
                ", startYear=" + startYear +
                ", carTypes=" + Arrays.toString(carTypes) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public CarType[] getCarTypes() {
        return carTypes;
    }

    public void setCarTypes(CarType[] carTypes) {
        this.carTypes = carTypes;
    }
}
