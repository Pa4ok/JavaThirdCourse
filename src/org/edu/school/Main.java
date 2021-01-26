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
    - public String getFullNames()
        выводит фио целиком
    - public String getShortNames()
        выводит фио сокращенно

    Teacher
    - HumanInfo humanInfo
    - String subject
    - int exp (стаж)
    - public String getTeacherInfo()
        метод должен вернуть фио преподавателя и названиие предмета который он ведет

    Student
    - HumanInfo humanInfo
    - int level

    School
    - int index
    - String title
    - Teacher teacher
    - Student student
    - public void work()
        вывести краткое имя преподавателя + учит + краткое имя студента + на предмете + предмет

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
                new Subject(
                        "predprofilnaya podgotovka",
                        1,
                        3,
                        false
                ),
                30
        );

        System.out.println(teacher1);
        System.out.println(teacher1.getTeacherInfo());
    }
}
