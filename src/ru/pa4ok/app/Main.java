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
    - int exp (стаж)
    - String[] warnings //длина 3

    - public void addWarn(String warn)
         если в массиве warnings есть null элемент заменяет его на warn
         если нет, то вывод в консоль "бан + информация по преподавателю"

    - public boolean hasWarn(String warn)
        проверяет есть ли такая жалоба на преподавателя
        !строки стравниваются через equals
        !вы не сможете вызвать метод equals из null объекта

    - public void delWarn(String warn)
        если в массиве есть такая жалоба - заменить ее на null


    создать объект класса и протестировать функции
     */

    public static void main(String[] args)
    {
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
        System.out.println();

        //Integer integer = 4;
        //String s11 = String.valueOf(4);

        arr = new int[30];
        System.out.println(Arrays.toString(arr));

        Book book = new Book("math");
        System.out.println(book);

        Student s1 = new Student("Vasya", 20, 2);
        System.out.println(s1);*/

        Student student = new Student("Vasya", 20, 1, 8);
        System.out.println(student);

        student.setMark(3, 4);
        student.setMark(-3, 5);
        student.setMark(5, 7);

        System.out.println(student);
    }
}
