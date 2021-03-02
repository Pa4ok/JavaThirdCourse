package ru.pa4ok;

public class Note
{
    private String text;
    private WeekDayEnum weekDay;

    public Note(String text, WeekDayEnum weekDay) {
        this.text = text;
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", weekDay=" + weekDay +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WeekDayEnum getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDayEnum weekDay) {
        this.weekDay = weekDay;
    }
}
