package ru.pa4ok.app.zoo;

public abstract class EntityLiving
{
    protected String title;
    protected String type;

    public EntityLiving(String title, String type) {
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "EntityLiving{" +
                "title='" + title + '\'' +
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
}
