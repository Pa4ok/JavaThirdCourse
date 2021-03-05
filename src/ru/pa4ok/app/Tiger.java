package ru.pa4ok.app;

public class Tiger extends EntityLiving implements IPredator, ISoundEntity
{
    public Tiger()
    {
        super("тигр", "млекопитающее");
    }

    @Override
    public String getSound() {
        return "рррррр";
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
