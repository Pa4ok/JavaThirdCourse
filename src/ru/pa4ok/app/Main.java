package ru.pa4ok.app;

import ru.pa4ok.test.Student;

import java.util.Arrays;

public class Main
{
    /*
    сделать класс учителя с пакетом org.edu.school
    все поля приватные + геттеры и сеттеры
    переопределить вывод

    Teacher
    - String name
    - int age
    - String subject
    - int exp
    - String[] groups //длина либо, получаете длину в конструкторе и инициализируете с ней

    - public boolean hasGroup(String group)
        проверка есть ли группа в массииве
    - public void addGroup(String group)
        добавление группы в массив если ее там нет
    - public void removeGroup(String group)
        уставновка null вместо группы, если она существует

    создать объект класса и вывести в консоль
     */

    public static void main(String[] args)
    {
        /*String s1 = "13221223232";
        String s2 = "13221223232";

        if(s1.equals(s2)) { //если s1 будет null - вы словите NullPointerException

        }*/

        /*int i = 12412432;
        boolean b = true;
        float f = 444.44545F;
        double d = 443343.455453D;
        char c = 'd';

        Integer integer_value = null;
        Boolean boolean_value;
        Float float_value;
        Double double_value;
        Character character_value;

        int i1 = Integer.parseInt("333333");

        String s; //null
        s = "jefoeiwewfw3434";

        char[] charArr = s.toCharArray();

        if (1 == i1) {
            //...
        }

        String s1 = "2323223";
        String s2 = "2323223";

        //сложные объекты нельзя сравнивать через ==
        if(s1 == s2) {
            //....
        }

        if(s1.equals(s2)) {
            //...
        }*/

        /*int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = new Integer[10];
        System.out.println(Arrays.toString(arr1));*/

        /*for(int i=0; i<arr.length; i++)
        {
            arr[i] = i;
        }

        for(int i : arr)
        {
            System.out.printf(i + " | ");
        }
        System.out.println();*/

        //Integer integer = 4;
        //String s11 = String.valueOf(4);

        /*arr = new int[30];
        System.out.println(Arrays.toString(arr));*/

        /*Book book = new Book("math");
        System.out.println(book);*/

        Student student = new Student("Vasya", 15, 5);
        System.out.println(student);

        /*student.setMark(0, 4);
        student.setMark(5, 5);
        System.out.println(student);
        */

        student.setMark(0, 4);
        System.out.println(student.getMark(0));
        System.out.println(student.getMark(-1));
    }
}
