package ru.pa4ok.app;

import ru.pa4ok.test.TestClass;

public class Main
{
    /*
        ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
        ALT-INSERT - вызов меню генерации

     */

    /*
    все поля приватные + геттеры и сеттеры
    +кастомный метод toString

    Teacher
    - String name
    - String subject
    - int exp //стаж
    - Group[] groups
    - 2 конструктрора
        1 принимает и инициализирует все переменные
        2 принимает и инициализирует все кроме массива
            +принимает длину массива и инициализирует его пустым
    - public boolean hasGroup(String g)
        метод должен проверить если в массиве groups группа с названием g
    - public boolean removeGroup(String g)
        метод должен заменить группу с названием g в массиве groups на null
        если замена произошла вернуть true
        если такого элемента не было false
    - public boolean addGroup(Group group)
        если в массиве groups есть null элемент
        он заменяется на g и возвращается true
        если такого нет возвращается false

     Group
     - String title
     - int studentCount


     если groups[i] будет равен null - мы словим ошибку
     if(groups[i].equals(g)) {
        //...
     }

     */

    public static void main(String[] args)
    {
        /*Student student1 = new Student(
                "petya",
                3,
                new int[] {
                        4, 5, 4, 3
                }
        );

        Student student2 = new Student(
                "vasya",
                2,
                3
        );
        student2.getMarks()[0] = 4;
        student2.getMarks()[1] = 3;
        student2.getMarks()[2] = 5;

        System.out.println(student1);
        System.out.println(student2);*/

        Teacher teacher = new Teacher(
                "jgrhgw",
                "krefghorghf",
                54,
                new Group[] {
                        new Group("23", 23),
                        new Group("55", 30),
                        null
                }
        );

        System.out.println(teacher.hasGroup("23"));
        System.out.println(teacher.hasGroup("5454534"));
        System.out.println(teacher.addGroup(new Group("44334534", 443)));
        System.out.println(teacher.addGroup(new Group("t55", 43)));
    }
}
