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

    CarManufacturer
    - String title
    - int startYear
    - String[] carTypes

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
        /*TestClass test = new TestClass(
                1,
                new String[] {
                    "one",
                    "two",
                    "wwdwqdwq"
                }
        );

        TestClass test1 = new TestClass(2, 5);

        System.out.println(test);
        System.out.println(test1);

        test1.getComponents()[3] = "new component";
        System.out.println(test1);*/

        String[] arr = { "test" , null };
        String test = "ejfhgowfee";

        for(String s : arr)
        {
            /*if(test == s) {
                //некоректно
            }*/

            /*//s может быть null поэтому можно либо поменять местами, либо сделать проверку
            if(s.equalsIgnoreCase(test)) {
                //...
            }*/


            //2 рабочих варианта
            if(test.equalsIgnoreCase(s)) {
                //...
            }

            if(s != null && s.equalsIgnoreCase(test)) {
                //...
            }
        }
    }
}
