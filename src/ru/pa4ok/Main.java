package ru.pa4ok;

public class Main
{
    /*
    class LinkedEntity
    - private static int idCounter = 0;

    - final int id = ++idCounter;
    - LinkedEntity child

    - public void add(LinkedEntity entity)
            дойти до такого child элемента
            у которого его child будет null
            и поставить entity на его место
    - public boolean delete(int id)
            дойти до такого child элемента
            у которого будет нужный id
            и удалить его, но при этом поставить на его место
            его child объет
    - public boolean contains(int id)
            проверка на то есть ли такой объект в списке
    - public int size()
            итоговое количество объетов

    задача реализовать свой связанный список
     */

    public static void main(String[] args)
    {
        LinkedEntity entity = new LinkedEntity();
        /*entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());

        System.out.println(entity);
        System.out.println(entity.size());
        System.out.println(entity.contains(10));
        System.out.println(entity.contains(3));
        System.out.println(entity.delete(2));
        System.out.println(entity);*/

        for(int i=0; i<100000; i++) {
            System.out.println(i);
            entity.add(new LinkedEntity());
        }

    }
}
