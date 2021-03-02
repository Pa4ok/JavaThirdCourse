package ru.pa4ok.task;

public class Tiger extends EntityLiving implements ISoundEntity, IPredator
{
    public Tiger()
    {
        super("тигр", "млекопитающее");
    }

    @Override
    public String getSound() {
        return "рррррр";
    }
}
