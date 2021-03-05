package ru.pa4ok.app;

public class LinkedEntity
{
    private static int idCounter = 0;

    public final int id = ++idCounter;
    public LinkedEntity child;

    public void add(LinkedEntity entity)
    {
        if(child != null) {
            child.add(entity);
        } else {
            child = entity;
        }
    }

    public void delete(int id)
    {
         if(child != null)
         {
             if(child.id != id) {
                 child.delete(id);
             } else {
                 child = child.child;
             }
         }
    }

    public boolean contains_a(int id)
    {
        if(this.id == id) {
            return true;
        }
        else
        {
            if(child != null) {
                return child.contains_a(id);
            } else {
                return false;
            }
        }
    }

    public boolean contains_b(int id)
    {
        LinkedEntity temp = this;

        while(temp != null)
        {
            if(temp.id == id) {
                return true;
            } else {
                temp = temp.child;
            }
        }

        return false;
    }

    public int size()
    {
        int counter = 0;

        for(LinkedEntity e = this; e != null; e = e.child) {
            counter++;
        }

        return counter;
    }

    @Override
    public String toString() {
        return "LinkedEntity{" +
                "id=" + id +
                ", child=" + child +
                '}';
    }
}
