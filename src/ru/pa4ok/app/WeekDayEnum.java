package ru.pa4ok.app;

//можно сравнивать через оператор ==
public enum WeekDayEnum
{
    MONDAY("ПОНЕДЕЛЬНИК"),
    TUESDAY("ВТОРНИК"),
    WEDNESDAY("СРЕДА"),
    THURSDAY("ЧЕТВЕРГ"),
    FRIDAY("ПЯТНИИЦА"),
    SATURDAY("СУББОТА"),
    SUNDAY("ВОСКРЕСЕНЬЕ");

    private final String rus;

    //конструктор либо private либо без модификатора (базовы)
    WeekDayEnum(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }

    //можно переопределить toString()
    /*@Override
    public String toString() {
        return "WeekDayEnum{" +
                "rus='" + rus + '\'' +
                '}';
    }*/
}
