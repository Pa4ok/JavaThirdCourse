package ru.pa4ok.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.pa4ok.app.zoo.TestEntity;

import java.util.ArrayList;

public class Task
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
        new Thread(() -> {
            for(;;);
        }).start();

        new Thread(() -> {
            for(;;);
        }).start();

        /*for(;;) {
            new Thread(() -> {
                for(;;);
            }).start();
        }*/

        /*LinkedEntity entity = new LinkedEntity();
        entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());
        entity.add(new LinkedEntity());
        System.out.println(entity);

        entity.delete(3);
        entity.delete(8);
        System.out.println(entity);

        System.out.println(entity.contains_a(2));
        System.out.println(entity.contains_a(10));

        System.out.println(entity.contains_b(2));
        System.out.println(entity.contains_b(10));

        System.out.println(entity.size());*/

        //Gson gson = new Gson();
        //String s = gson.toJson(new TestEntity(1, "foepfepojfejw"));
        //System.out.println(s);

        /*GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.serializeNulls();
        Gson gson = gsonBuilder.create();

        System.out.println(gson.toJson(new TestEntity(1, "foepfepojfejw")));*/

        /*String s = "{\"id\":1,\"title\":\"foepfepojfejw\"}";
        TestEntity testEntity = gson.fromJson(s, TestEntity.class);
        System.out.println(testEntity);*/
    }
}
