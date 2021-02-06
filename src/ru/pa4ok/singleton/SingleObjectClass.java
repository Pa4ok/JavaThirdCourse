package ru.pa4ok.singleton;

/*
суть патерна синглтон в том, что у вас на всю программу только 1 обьект класса
 */
public class SingleObjectClass
{
    //статичное поле в которое мы сохраняем единственный экземпляр класса
    private static SingleObjectClass instance;

    //приватный конструтор, чтобы нельзя было создать новые объекты
    private SingleObjectClass()
    {

    }

    public void test()
    {
        System.out.println("test");
    }

    /*
    статичная фунция получения объекта сохраненного в статичном поле
     */
    public static SingleObjectClass getInstance() {
        if(instance == null) {
            instance = new SingleObjectClass();
        }
        return instance;
    }
}
