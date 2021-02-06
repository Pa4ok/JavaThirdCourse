package ru.pa4ok.app;

public class NewMain
{
    public static void main(String[] args)
    {
        /*WeekDayEnum day = WeekDayEnum.MONDAY;
        System.out.println(day);
        System.out.println(day.getRus());*/

        /*String s = "MONDAY";
        WeekDayEnum day = WeekDayEnum.valueOf(s);
        System.out.println(day + " : " + day.getRus());*/

        for(WeekDayEnum day : WeekDayEnum.values())
        {
            System.out.println(day.ordinal() + " : " + day + " : " + day.getRus());
        }
    }
}
