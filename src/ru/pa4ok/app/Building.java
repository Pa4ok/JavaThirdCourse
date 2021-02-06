package ru.pa4ok.app;

public class Building
{
    private Address address;
    private BuildingTypeEnum type;
    private int floorCount;

    public Building(Address address, BuildingTypeEnum type, int floorCount) {
        this.address = address;
        this.type = type;
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address=" + address +
                ", type=" + type +
                ", floorCount=" + floorCount +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BuildingTypeEnum getType() {
        return type;
    }

    public void setType(BuildingTypeEnum type) {
        this.type = type;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
}
