package ru.pa4ok.enums;

/*
можно делать как с конструтором так и без
обращаться к ним можно по имени класса
 */
public enum WeekDayEnum
{
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота", "7 пар = чил"),
    SUNDAY("воскресенье");

    public final String rus;
    public final String lol;

    /*
    конструктор либо приватный либо с базовым модификатором доступа (без него)
     */
    WeekDayEnum(String rus, String lol)
    {
        this.rus = rus;
        this.lol = lol;
    }

    WeekDayEnum(String rus) {
        this(rus, null);
    }

    //можно пеопределить метод toString()
    /*@Override
    public String toString() {
        return "WeekDayEnum{" +
                "rus='" + rus + '\'' +
                ", lol='" + lol + '\'' +
                '}';
    }*/
}
