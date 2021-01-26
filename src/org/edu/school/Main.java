package org.edu.school;


public class Main
{
    /*
    сделать класс учителя с пакетом org.edu.school
    все поля приватные + геттеры и сеттеры
    переопределить вывод

    HumanInfo
    - String firstname
    - String surname
    - String patronymic
    - boolean isWoman
    - int age

    Subject
    - String title
    - int startLevel //семестр когда предмет начинается
    - int duration //длительность в семестрах
    - boolean exam //есть ли экзамен

    Teacher
    - HumanInfo humanInfo
    - Subject subject
    - int exp (стаж)

    - public String getTeacherInfo()
        метод должен вернуть фио преподавателя и названиие предмета который он ведет

    создать объект класса и протестировать функции
     */

    public static void main(String[] args)
    {
        /*HumanInfo info1 = new HumanInfo("Vasiliy", "Petrov", false, 50);
        Teacher teacher1 = new Teacher(info1, "pp", 30);*/

        Teacher teacher1 = new Teacher(
                new HumanInfo(
                        "Vasiliy",
                        "Petrov",
                        "Grigorevi4",
                        false,
                        50
                ),
                "pp",
                30
        );

        System.out.println(teacher1);
        System.out.println(teacher1.getHumanInfo().getFullNames());
    }
}
