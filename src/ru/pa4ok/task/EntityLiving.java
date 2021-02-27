package ru.pa4ok.task;

public abstract class EntityLiving
{
    private static int idCounter;

    protected final int id = ++idCounter;
    protected String title;
    protected String type;

    public EntityLiving(String title, String type) {
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "EntityLiving{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }
}
