package ru.pa4ok.task;

import java.util.Arrays;

public class Zoo
{
    private String title;
    private EntityLiving[] animals;

    public Zoo(String title, EntityLiving[] animals)
    {
        this.title = title;
        this.animals = animals;
    }

    public int getFlyEntityCount()
    {
        int c = 0;

        for(EntityLiving e : animals) {
            if(e instanceof IFlyEntity) {
                c++;
            }
        }

        return c;
    }

    public int getPredatorEntityCount()
    {
        int c = 0;

        for(EntityLiving e : animals) {
            if(e instanceof IPredator) {
                c++;
            }
        }

        return c;
    }

    public int getSoundEntityCount()
    {
        int c = 0;

        for(EntityLiving e : animals) {
            if(e instanceof ISoundEntity) {
                c++;
            }
        }

        return c;
    }

    public void feedPredators(EntityLiving entity)
    {
        if(entity instanceof IPredator) {
            System.out.println("волк не есть волка");
            return;
        }

        for(EntityLiving e : animals) {
            if(e instanceof IPredator) {
                ((IPredator)e).hunt(entity);
            }
        }
    }

    public Zoo(String title, int animalsCount) {
        this(title, new EntityLiving[animalsCount]);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "title='" + title + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EntityLiving[] getAnimals() {
        return animals;
    }

    public void setAnimals(EntityLiving[] animals) {
        this.animals = animals;
    }
}
