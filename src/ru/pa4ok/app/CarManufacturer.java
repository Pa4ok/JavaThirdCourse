package ru.pa4ok.app;

import java.util.Arrays;

public class CarManufacturer
{
    private String title;
    private int startYear;
    private String[] carTypes;

    public CarManufacturer(String title, int startYear, String[] carTypes) {
        this.title = title;
        this.startYear = startYear;
        this.carTypes = carTypes;
    }

    public CarManufacturer(String title, int startYear, int length) {
        this(title, startYear, new String[length]);
    }

    public boolean hasType(String type)
    {
        for(String s : carTypes) {
            if(type.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void addType(String type)
    {
        for(int i=0; i< carTypes.length; i++)
        {
            if(carTypes[i] == null) {
                carTypes[i] = type;
                return;
            }
        }
        System.out.println("нет места");
    }

    public void deleteType(String type)
    {
        for(int i=0; i< carTypes.length; i++)
        {
            if(type.equals(carTypes[i])) {
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

    public String[] getCarTypes() {
        return carTypes;
    }

    public void setCarTypes(String[] carTypes) {
        this.carTypes = carTypes;
    }
}
