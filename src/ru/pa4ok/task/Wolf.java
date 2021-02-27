package ru.pa4ok.task;

public class Wolf extends EntityLiving implements ISoundEntity, IPredator
{
    public Wolf()
    {
        super("волк", "млекопитающее");
    }

    @Override
    public String getSound() {
        return "ауф";
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
