package ru.pa4ok.app.zoo;

public class Ant extends EntityLiving
{
    public Ant() {
        super("муравей", "насекомое");
    }

    @Override
    public String toString() {
        return "Ant{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
