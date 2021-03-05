package ru.pa4ok.app;

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
        return 50;
    }

    @Override
    public String getSound() {
        return "курлык";
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
