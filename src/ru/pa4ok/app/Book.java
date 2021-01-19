package ru.pa4ok.app;

public class Book
{
    String title; //из этого класса и 1 пакета
    private String privateString; //только из этого класса
    protected String protectedString; //из всех классов наследников и 1 пакета
    public String publicString; //везде

    public Book(String title)
    {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
