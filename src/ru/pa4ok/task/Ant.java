package ru.pa4ok.task;

public class Ant extends EntityLiving
{
    public Ant() {
        super("муравей", "насекомое");
    }

    @Override
    public String toString() {
        return "Ant{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
