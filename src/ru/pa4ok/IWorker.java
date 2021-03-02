package ru.pa4ok;

//в интрейфесах нельзя размещать переменные
//все функции по умолчанию асбтрактные
//чтобы добавить реализованную функцию нужен модификатор default
public interface IWorker
{
    //в интерфейсе можно разместить поля
    //но их никак нельзя будет изменить
    public static String s = "434334";
    public int i = 5;

    public void work();

    public default void test()
    {
        System.out.println("test");
    }
}
