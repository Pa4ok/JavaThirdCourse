package ru.pa4ok.task;

public class Pigeon extends EntityLiving implements ISoundEntity, IFlyEntity
{
    public Pigeon() {
        super("голубь", "птица");
    }

    @Override
    public double getMaxFlyHeight() {
        return 50;
    }

    @Override
    public double getMaxFlyTime() {
        return 600;
    }

    @Override
    public String getSound() {
        return "курлык";
    }
}
