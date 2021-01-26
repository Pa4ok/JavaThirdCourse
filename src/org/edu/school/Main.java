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
        Teacher teacher = new Teacher(
                new HumanInfo(
                        "Vasiliy",
                        "Grigorevich",
                        false,
                        50
                ),
                "pp",
                30
        );

        Student student = new Student(
                new HumanInfo(
                        "sergey",
                        "kovalenko",
                        false,
                        20
                ),
                7
        );

        School school = new School(
                23,
                "ГБУ им.Путина",
                teacher,
                student
        );

        System.out.println(school + "\n");
        school.work();
    }
}
