package ru.pa4ok;

/*
пример инстанцирования
вы выносите всю логику из метода main в ваш класс
сохраняя его объект в статичое поле
к которму можно получить доступ из любой точки программы
 */
public class Application
{
    //static
    private static Application instance;

    public static void main(String[] args)
    {
        new Application();
    }

    public static Application getInstance() {
        return instance;
    }
    //

    private int someConfigValue = 10;
    private SomeWorker worker;

    public Application()
    {
        instance = this;

        this.worker = new SomeWorker();
        this.worker.work();

        while (true)
        {
            System.out.println(System.currentTimeMillis());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getSomeConfigValue() {
        return someConfigValue;
    }

    public void setSomeConfigValue(int someConfigValue) {
        this.someConfigValue = someConfigValue;
    }
}
