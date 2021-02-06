package ru.pa4ok.app;

public enum CityTypeEnum
{
    VILLAGE("деревня"),
    URBAN_VILLAGE("пос. гор. типа"),
    TOWN("город"),
    METROPOLIS("мегаполис");

    private final String rus;

    CityTypeEnum(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }
}
