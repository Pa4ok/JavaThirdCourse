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
    - public void nextYear()
        метод который увеличивает год на 1


    Teacher
    - HumanInfo humanInfo
    - String subject
    - int exp (стаж)
    - public String getTeacherInfo()
        метод должен вернуть фио преподавателя и названиие предмета который он ведет
    - public void nextYear()
        вызывать humanInfo.nextYear()
        увеличивать на 1 стаж exp++

    Student
    - HumanInfo humanInfo
    - int level
    - public void nextYear()
        вызывать humanInfo.nextYear()
        увеличивать на 1 курс level++

    School
    - int index
    - String title
    - Teacher[] teachers //3
    - Student[] students //3
    - public void nextYearAll()
        перебирать всех студентов и преподавателей
        и вызывать у них метод nextYear()

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
