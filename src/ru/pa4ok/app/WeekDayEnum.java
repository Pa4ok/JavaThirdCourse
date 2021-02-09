package ru.pa4ok.app;

//вы можете разместить любые методы и поля
//запросить их же в конструторе
public enum WeekDayEnum
{
    MONDAY("ПОНЕДЕЛЬНИК"),
    TUESDAY("ВТОРНИК"),
    WEDNESDAY("СРЕДА"),
    THURSDAY("ЧЕТВЕРГ"),
    FRIDAY("ПЯТНИЦА"),
    SATURDAY("СУББОТА"),
    SUNDAY("ВОСКРЕСЕНЬЕ");

    private final String rus;

    //конструктор либо private либо без модификатора
    WeekDayEnum(String rus)
    {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }

    /*@Override
    public String toString() {
        return rus;
    }*/
}
