package ru.pa4ok;

public class LinkedEntity
{
    private static int idCounter = 0;

    private final int id = ++idCounter;
    private LinkedEntity child;

    public LinkedEntity(LinkedEntity child) {
        this.child = child;
    }

    public LinkedEntity() {
    }

    public void add(LinkedEntity entity)
    {
        if(child != null) {
            child.add(entity);
        } else {
            child = entity;
        }
    }

    public boolean delete(int id)
    {
        if(child != null) {
            if(child.id == id) {
                child = child.child;
                return true;
            } else {
                child.delete(id);
            }
        } else {
            return false;
        }

        return false;
    }

    public int size_A()
    {
        if(child == null) {
            return 1;
        } else {
            return 1 + child.size_A();
        }
    }

    public int size_B()
    {
        int size = 1;
        for(LinkedEntity l = this; l.child != null; l = l.child) size++;
        return size;
    }

    public boolean contains(int id)
    {
        LinkedEntity temp = this;
        while (true) {
            if (temp.id == id) {
                return true;
            } else {
                if (temp.child != null) {
                    temp = temp.child;
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "LinkedEntity{" +
                "id=" + id +
                ", child=" + child +
                '}';
    }

    public int getId() {
        return id;
    }

    public LinkedEntity getChild() {
        return child;
    }

    public void setChild(LinkedEntity child) {
        this.child = child;
    }
}
