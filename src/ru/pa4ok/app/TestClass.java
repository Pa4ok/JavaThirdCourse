package ru.pa4ok.app;

public class TestClass
{
    public static void main(String[] args)
    {
       /* WeekDayEnum day = WeekDayEnum.SATURDAY;
        System.out.println(day);
        System.out.println(day.getRus());

        System.out.println();

        ActionDateTime actionDateTime = new ActionDateTime(
                WeekDayEnum.WEDNESDAY, 13, 55
        );
        System.out.println(actionDateTime);
        System.out.println(actionDateTime.getWeekDay() == WeekDayEnum.WEDNESDAY);
        System.out.println(actionDateTime.getWeekDay() == WeekDayEnum.SATURDAY);*/

        /*for(WeekDayEnum d : WeekDayEnum.values())
        {
            System.out.println(d.ordinal() + " : " + d + " : " + d.getRus());
        }

        System.out.println();

        String s = "WEDNESDAY";
        WeekDayEnum day = WeekDayEnum.valueOf(s);
        System.out.println(day.ordinal() + " : " + day + " : " + day.getRus());

        switch (day)
        {
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
            case SUNDAY:
                break;
        }*/

        //System.out.println(WeekDayEnum.FRIDAY);

        int ordinal = 4;
        WeekDayEnum day = WeekDayEnum.values()[4];
        System.out.println(day);
    }
}

class ActionDateTime
{
    private WeekDayEnum weekDay;
    private int hour;
    private int minute;

    public ActionDateTime(WeekDayEnum weekDay, int hour, int minute) {
        this.weekDay = weekDay;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "ActionDateTime{" +
                "weekDay=" + weekDay +
                ", hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public WeekDayEnum getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDayEnum weekDay) {
        this.weekDay = weekDay;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
