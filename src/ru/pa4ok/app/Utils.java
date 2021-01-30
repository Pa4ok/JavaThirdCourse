package ru.pa4ok.app;

import java.util.Random;

public class Utils
{
    private static Random rand = new Random();

    public static int getRandIntWithBounds(int min, int max)
    {
        return min + rand.nextInt(max - min + 1);
    }

    //быстрая реализация
    public static String revertSting(String s)
    {
        char[] arr = s.toCharArray();
        char[] newArr = new char[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            newArr[arr.length-i-1] = arr[i];
        }

        return new String(newArr);
    }

    //медленный вариант, потому что сложение строк работает медленно
    /*public static String revertSting(String s)
    {
        char[] arr = s.toCharArray();
        String newString = "";

        for(int i= arr.length-1; i>=0; i--) {
            newString += arr[i];
        }

        return newString;
    }*/
}
