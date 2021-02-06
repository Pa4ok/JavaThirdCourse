package ru.pa4ok.app;

import java.util.Arrays;

public class City
{
    private String title;
    private CityTypeEnum type;
    private int population;
    private Building[] buildings;

    public City(String title, CityTypeEnum type, int population, Building[] buildings) {
        this.title = title;
        this.type = type;
        this.population = population;
        this.buildings = buildings;
    }

    public boolean hasBuildingByAddress(Address address)
    {
        for(Building b : buildings)
        {
            /*if(b.getAddress().getIndex() == address.getIndex() &&
                b.getAddress().getSubIndex() == address.getSubIndex() &&
                b.getAddress().getStreet().equals(address.getStreet()))
            {
                return true;
            }*/

            if(b.getAddress().equals(address)) {
                return true;
            }
        }
        return false;
    }

    public Building getBuildingByAddress(Address address)
    {
        for(Building b : buildings)
        {
            if(b.getAddress().equals(address)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", population=" + population +
                ", buildings=" + Arrays.toString(buildings) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CityTypeEnum getType() {
        return type;
    }

    public void setType(CityTypeEnum type) {
        this.type = type;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }
}
