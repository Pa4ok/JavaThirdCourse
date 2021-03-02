package ru.pa4ok.task;

import java.util.Arrays;

public class Zoo
{
    private String title;
    private EntityLiving[] animals;

    public Zoo(String title, EntityLiving[] animals) {
        this.title = title;
        this.animals = animals;
    }

    public int getFlyEntityCount() {
        int counter = 0;
        for(EntityLiving e : animals) {
            if(e instanceof IFlyEntity) {
                counter++;
            }
        }
        return counter;
    }

    public int getPredatorEntityCount() {
        int counter = 0;
        for(EntityLiving e : animals) {
            if(e instanceof IPredator) {
                counter++;
            }
        }
        return counter;
    }

    public int getSoundEntityCount() {
        int counter = 0;
        for(EntityLiving e : animals) {
            if(e instanceof ISoundEntity) {
                counter++;
            }
        }
        return counter;
    }

    public void feedPredators(EntityLiving entity) {
        if(entity instanceof IPredator) {
            System.out.println("волк не есть волка");
        } else {
            for(EntityLiving e : animals) {
                if(e instanceof IPredator) {
                    ((IPredator)e).hunt(entity);
                }
            }
        }
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
