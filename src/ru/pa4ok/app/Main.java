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

    - public void addGroup(Group group)
        добавление группы в массив если ее там нет

    - public void removeGroup(String groupTitle)
        уставновка null вместо группы, если она существует

    создать объект класса и протестировать все методы
     */

    public static void main(String[] args)
    {
        Teacher teacher = new Teacher(
                "vasiliy",
                30,
                "pp",
                10,
                new String[] {
                        "234",
                        "235",
                        null
                }
        );

        System.out.println(teacher);
        System.out.println(teacher.hasGroup("235"));
        System.out.println(teacher.hasGroup("jrehguhrg"));
        teacher.addGroup("236");
        teacher.addGroup("237");
        System.out.println(teacher);
        teacher.removeGroup("234");
        teacher.removeGroup("g4rf4343");
        System.out.println(teacher);

        /*
        for(Group g : this.groups)
        {
            if(g != null && g.getTitle().equals(...) {
                //...
            }
        }
         */
    }
}
