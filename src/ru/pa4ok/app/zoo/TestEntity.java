package ru.pa4ok.app.zoo;

public class TestEntity
{
    private int id;
    private String title;

    public TestEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
