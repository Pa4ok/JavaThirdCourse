package ru.pa4ok;

import ru.pa4ok.task.*;

public class NewMain
{
    /*
    abstract class EntityLiving
    - String title
    - String type (млекопитающее, птица...)

    interface IPredator
    - public default void hunt(EntityLiving entity) //выводит в консоль кто ест и кого его

    interface ISoundEntity
    - public String getSound()

    interface IFlyEntity
    - public double getMaxFlyHeight()
    - public double getMaxFlyTime()

    //
    сделать несколько 2-4 класса которые описывают конкретных животных
    они все наследуют EntityLiving и реализуют если нужно соответствующие интрейсы
    //

    Zoo
    - String title
    - EntityLiving[] animals
    - public int getFlyEntityCount()
    - public int getPredatorEntityCount()
    - public int getSoundEntityCount()
    - public void feedPredators(EntityLiving entity)
        //принимает какое то животное
        //если entity не является хищником перебрать всех хищиников и вызвать у них функцию hunt()
        //если entity является хищником вывести предупреждение и все

     */


    public static void main(String[] args)
    {
        /*Miner miner = new Miner("vasya");
        //test(miner);
        miner.work();
        miner.eat();*/

        Zoo zoo = new Zoo(
                "Zoo",
                new EntityLiving[] {
                        new Pigeon(),
                        new Pigeon(),
                        new Pigeon(),
                        new Tiger(),
                        new Ant(),
                        new Ant(),
                        new Tiger()
                }
        );

        System.out.println(zoo.getPredatorEntityCount());
        System.out.println(zoo.getFlyEntityCount());
        System.out.println(zoo.getSoundEntityCount());
        zoo.feedPredators(new Pigeon());
        zoo.feedPredators(new Ant());
        zoo.feedPredators(new Tiger());
    }

    //все правила проверок на принадлежность к типу данных работают также
    //можно делать приведение типов
    public static void test(Object obj)
    {
        if(obj instanceof IEatenEntity) {
            IEatenEntity iEatenEntity = (IEatenEntity) obj;
            iEatenEntity.eat();
        }

        if(obj instanceof IWorker) {
            ((IWorker)obj).work();
        }
    }
}
