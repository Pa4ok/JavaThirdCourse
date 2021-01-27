package ru.pa4ok.app;

    /*
    ALT-INSERT - вызов меню генерации (можно через ПКМ)
    ALT-ENTER - вывов меню исправления ошибки (нужно перевести курсор на нее)
    CTRL-SPACE - вызов контекстного меню автопродолжения кода
    CTRL-ALT-L - форматирование кода (стиль)
     */

public class Main
{
    /*
    сделать класс учителя с пакетом org.edu.school
    все поля приватные + геттеры и сеттеры
    переопределить вывод

    Group
    - String title
    - int studentCount

    Teacher
    - String name
    - int age
    - String subject
    - int exp
    - Group[] groups

    - public boolean hasGroup(String groupTitle)
        проверка есть ли группа в массииве
    - public void addGroup(String groupTitle)
        добавление группы в массив если ее там нет
    - public void removeGroup(String groupTitle)
        уставновка null вместо группы, если она существует

    создать объект класса и вывести в консоль
     */

    public static void main(String[] args)
    {
        Teacher teacher = new Teacher(
                "Vasiliy Petrovi4",
                40,
                "math",
                20,
                new String[] {"223", "224", null, null, "448"}
        );

        /*Teacher[] teachers = new Teacher[] {
                    new Teacher(...),
                    new Teacher(...),
                    new Teacher(...),
                    new Teacher(...)
        };*/

        System.out.println(teacher);
        System.out.println(teacher.hasGroup("224"));
        System.out.println(teacher.hasGroup("22fewf4"));
        teacher.addGroup("445");
        teacher.addGroup("55555");
        teacher.addGroup("vrgfgre");
        System.out.println(teacher);
        teacher.removeGroup("fff");
        teacher.removeGroup("224");
        System.out.println(teacher);
    }
}
