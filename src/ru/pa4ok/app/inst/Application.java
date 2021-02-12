package ru.pa4ok.app.inst;

public class Application
{
    //static

    //статичное поле с объектом нашего приложения
    private static Application instance;

    public static void main(String[] args)
    {
        //в методе main мы создаем объект нашего приложения
        new Application();
    }

    public static Application getInstance() {
        return instance;
    }
    //

    //далее все что нужно по типу конфигов
    //соединений с бд и тд
    //вы можете размещать в обычных полях
    //доступ к которым можно получить черещ
    //объект в статичном поле
    private final String config;

    //конструктор приватный, чтобы можно было создать только 1 экземпляр приложения
    private Application()
    {
        //1 действием - мы сохраняем объект в статичное поле
        instance = this;

        this.config = "ewgoipuuwehguioewf";
    }

    public String getConfig() {
        return config;
    }
}
