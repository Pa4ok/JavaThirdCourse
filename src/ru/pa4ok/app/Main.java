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

    public static final boolean COMPILE_SOME_STUFF = false;

    public static void main(String[] args)
    {
        System.out.println("mark1");

        if(COMPILE_SOME_STUFF) {
            System.out.println("mark2");
        }

        System.out.println("mark3");
    }
}

//final переменная должна быть объявлена обязательно

//1 способ - сразу в поле класса
class Test
{
    public final String test = "efihoef";

    public void test()
    {
        //изменить после объявления нельзя
        //test = "34324";
    }
}

class Test2
{
    public final String test;

    //2 способ - в конструкторе
    public Test2(String test) {
        this.test = test;
    }
}

class Test3
{
    public final String test;
    public int i;

    public Test3(String test, int i) {
        this.test = test;
        this.i = i;
    }

    //final переменная должны быть реализована во всех возможных
    //способах инициплизации объекта класса
    public Test3(int i) {
        this.i = i;
        this.test = null;
        //this(null, i);
    }
}

class Test4
{
    //если переменная статичная также 2 варианта реализации
    //сразу в поле
    public static final String test = "43434343";
}

class Test5
{
    public static final String TEST_STRING;

    //либо же в статик блоке
    static {
        TEST_STRING = "43434343";
    }
}


