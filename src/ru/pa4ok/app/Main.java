package ru.pa4ok.app;

public class Main
{
    /*
    SHIFT + F10 - быстрый запуск выбранной конфигурации (справа сверху)
    ALT + ENTER - контектное меню исправления ошибки
    ALT + INSERT - вызов меню генерации
     */

    /*
    все поля приватные + геттеры и сеттеры
    переопределенный метод toString

    CarType
    - String title
    - int power
    - int weight

    CarManufacturer
    - String title
    - int startYear
    - CarType[] carTypes

    2 конструктора
        1 - все поля
        2 - title, startYear + переменная с размерностью массива

    public boolean hasType(String type)
        проверить есть ли type в массиве carTypes

    public void addType(String type)
        если в массиве carTypes есть null элемент
        заменить его на type
        если таковых нет, то уведомить об этои

    public void deleteType(String type)
        если в массиве carTypes есть type
        то замеенить его на null элемент

    создать объет класса и протестировать методы
     */

    public static void main(String[] args)
    {
        /*CarManufacturer carManufacturer = new CarManufacturer(
                "manufacturer",
                2000,
                new String[] {
                        "one",
                        null,
                        "two",
                        null
                }
        );

        System.out.println(carManufacturer);
        System.out.println(carManufacturer.hasType("two"));
        System.out.println(carManufacturer.hasType("qowipfqfq"));
        carManufacturer.addType("4");
        carManufacturer.addType("5");
        carManufacturer.addType("6");
        System.out.println(carManufacturer);
        carManufacturer.deleteType("5");
        carManufacturer.deleteType("fefeeffe");
        System.out.println(carManufacturer);*/

        for(CarManufacturer c : new CarManufacturer[5])
        {
            if(c != null && c.getTitle().equals("4444")) {
                //...
            }
        }
    }
}
