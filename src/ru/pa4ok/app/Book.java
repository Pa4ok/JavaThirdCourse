package ru.pa4ok.app;

public class Book
{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book()
    {
        this("test title", "test author", 228);
    }

    public String toString()
    {
        return title + " " + author + " " + year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
    остальные геттеры и сеттеры
     */
}
