package ru.pa4ok;

public class LinkedEntity
{
    private static int idCounter;

    protected final int id = ++idCounter;
    protected LinkedEntity child;

    public void add(LinkedEntity entity)
    {
        if(this.child != null) {
            this.child.add(entity);
        } else {
            this.child = entity;
        }
    }

    public boolean delete(int id)
    {
        if(this.child != null)
        {
            if(this.child.id == id) {
                this.child = child.child;
                return true;
            } else {
                this.child.delete(id);
            }
        }
        else
        {
            return false;
        }

        return false;
    }

    public boolean contains(int id)
    {
        if(this.id == id) {
            return true;
        } else {
            if(this.child != null) {
                return this.child.contains(id);
            } else {
                return false;
            }
        }
    }

    public int size()
    {
        int c = 1;

        LinkedEntity child = this.child;
        while(child != null) {
            c++;
            child = child.child;
        }

        return c;
    }

    @Override
    public String toString() {
        return "LinkedEntity{" +
                "id=" + id +
                ", child=" + child +
                '}';
    }
}
