package ru.pa4ok.task;

public class Pigeon extends EntityLiving implements ISoundEntity, IFlyEntity
{
    public Pigeon()
    {
        super("голубь", "птица");
    }

    @Override
    public double getMaxFlyHeight() {
        return 100;
    }

    @Override
    public double getMaxFlyTime() {
        return 60;
    }

    @Override
    public String getSound() {
        return "курлык-курлык";
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
