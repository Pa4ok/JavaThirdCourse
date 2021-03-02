package ru.pa4ok;

public enum WeekDayEnum
{
    MONDAY("пн"),
    TUESDAY("вт"),
    WEDNESDAY("ср"),
    THURSDAY("чт"),
    FRIDAY("пт"),
    SATURDAY("сб"),
    SUNDAY("вс");

    private final String rus;

    WeekDayEnum(String rus) {
        this.rus = rus;
    }

    /*@Override
    public String toString() {
        return "WeekDayEnum{" +
                "rus='" + rus + '\'' +
                '}';
    }*/

    public String getRus() {
        return rus;
    }
}
