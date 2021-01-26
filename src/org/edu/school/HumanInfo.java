package org.edu.school;

public class HumanInfo
{
    private String firstname;
    private String surname;
    private String patronymic;
    private boolean isWoman;
    private int age;

    public HumanInfo(String firstname, String surname, String patronymic, boolean isWoman, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.isWoman = isWoman;
        this.age = age;
    }

    public HumanInfo(String firstname, String surname, boolean isWoman, int age) {
        this(firstname, surname, null, isWoman, age);
    }

    public String getFullNames()
    {
        /*String s = surname + " " + firstname;
        if(patronymic != null) {
            s += " ";
            s += patronymic;
        }
        return s;*/

        // true/false ? return smtng if true : return smtng if false
        return surname + " " + firstname + (patronymic == null ? "" : (" " + patronymic));
    }

    @Override
    public String toString() {
        return "HumanInfo{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", isWoman=" + isWoman +
                ", age=" + age +
                '}';
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
