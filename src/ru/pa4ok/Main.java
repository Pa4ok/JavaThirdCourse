package ru.pa4ok;

public class Main
{
    public static void main(String[] args)
    {
        Note note = new Note(
                "[roewgjperpr",
                WeekDayEnum.SUNDAY
        );

        System.out.println(note);
        System.out.println(note.getWeekDay() == WeekDayEnum.TUESDAY);
        System.out.println(note.getWeekDay().getRus());

        /*switch (note.getWeekDay())
        {
            case FRIDAY:
                break;
            case TUESDAY:
                break;
        }*/

        for(WeekDayEnum w : WeekDayEnum.values()) {
            System.out.println(w);
        }

        String s = "FRIDAY";
        WeekDayEnum fr = WeekDayEnum.valueOf(s);
        System.out.println(fr.getRus());
        System.out.println(fr.ordinal());
        int i = fr.ordinal();
        String s2 = fr.name();
    }
}
