package ru.pa4ok.app;

public enum BuildingTypeEnum
{
    SOCIAL("социальная"),
    LIVING("жилая"),
    INDUSTRIAL("заводская");

    private final String rus;

    BuildingTypeEnum(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }
}
