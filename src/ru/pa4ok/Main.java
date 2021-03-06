package ru.pa4ok;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<TestEntity> list = new ArrayList<>();
        for(int i=0; i<50; i++) {
            list.add(new TestEntity());
        }
        System.out.println(list);

        Collections.sort(list, new Comparator<TestEntity>() {
            @Override
            public int compare(TestEntity o1, TestEntity o2) {
                /*if(o1.value < o2.value) {
                    return -1;
                } else if(o1.value > o2.value) {
                    return 1;
                } else {
                    return 0;
                }*/
                return Integer.compare(o1.value, o2.value);
            }
        });

        //вариант 2, ему необходим интрейфес Comparable у класса хранящегося в списке
        //Collections.sort(list);
        
        System.out.println(list);
    }
}

class TestEntity implements Comparable<TestEntity>
{
    public int value = new Random().nextInt(1000);

    @Override
    public String toString() {
        return "TestEntity{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(TestEntity other)
    {
        return Integer.compare(this.value, other.value);
    }
}


