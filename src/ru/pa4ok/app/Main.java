package ru.pa4ok.app;

public class Main
{
    /*
    ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
    ALT-INSERT - вызов меню генерации

    к enum'ам добавить всложенные переменные с переводом на русский (как в примере)
    и переопредить у них toString() выводя туда русский перевод

    City
    - String title
    - CityTypeEnum type
    - int population
    - Building[] buildings
    - public boolean hasBuildingByAddress(Address address)
        возврашает ниличие здание по адресу
    - public Building getBuildingByAddress(Address address)
        возврашает объект строения по адресу
        если такого адреса нет - null

    enum CityTypeEnum
    - VILLAGE
    - URBAN_VILLAGE
    - TOWN
    - METROPOLIS

    Building
    - Address address
    - BuildingTypeEnum type
    - int floorCount

    enum BuildingTypeEnum
    - SOCIAL
    - LIVING
    - INDUSTRIAL

    Address
    - String street
    - int index //номер дома
    - int subIndex //номер корпуса

     */

    public static void main(String[] args)
    {
        City city = new City(
                "spb",
                CityTypeEnum.TOWN,
                60000000,
                new Building[] {
                        new Building(
                                new Address(
                                        "peso4naya",
                                        14,
                                        1
                                ),
                                BuildingTypeEnum.SOCIAL,
                                3
                        )
                }
        );

        System.out.println(city);

        System.out.println(city.hasBuildingByAddress(new Address("peso4naya", 14, 1)));
        System.out.println(city.getBuildingByAddress(new Address("peso4naya", 14, 1)));

        System.out.println(city.hasBuildingByAddress(new Address("reghrhe", 14, 1)));
        System.out.println(city.getBuildingByAddress(new Address("rherreg", 14, 1)));

    }
}
