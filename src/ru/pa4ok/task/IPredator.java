package ru.pa4ok.task;

public interface IPredator
{
    public default void hunt(EntityLiving entity)
    {
        if(entity instanceof ISoundEntity) {
            System.out.println(this + " съел " + entity + " со звуком " + ((ISoundEntity)entity).getSound());
        } else {
            System.out.println(this + " съел " + entity);
        }
    }
}
