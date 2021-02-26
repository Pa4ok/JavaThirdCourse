package ru.pa4ok.app;

public class PostmanProfession extends AbstractProfession
{
    public PostmanProfession() {
        super("Почтальон", 25000);
    }

    @Override
    public void work() {
        System.out.println("разносит почту");
    }
}
