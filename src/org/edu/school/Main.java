package org.edu.school;


public class Main
{
    /*
    сделать класс учителя с пакетом org.edu.school
    все поля приватные + геттеры и сеттеры
    переопределить вывод

    Teacher
    - String name
    - int age
    - String subject
    - int exp (стаж)
    - String[] warnings //длина 3

    - public void addWarn(String warn)
         если в массиве warnings есть null элемент заменяет его на warn
         если нет, то вывод в консоль "бан + информация по преподавателю"

    - public boolean hasWarn(String warn)
        проверяет есть ли такая жалоба на преподавателя
        !строки стравниваются через equals
        !вы не сможете вызвать метод equals из null объекта

    - public void delWarn(String warn)
        если в массиве есть такая жалоба - заменить ее на null


    создать объект класса и протестировать функции
     */

    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("Oshurok", 30, "pp", 10);
        System.out.println(teacher);
        
        teacher.addWarn("one");
        teacher.addWarn("two");
        System.out.println(teacher.hasWarn("three"));
        if(teacher.hasWarn("one")) {
            teacher.delWarn("one");
        }
        teacher.addWarn("4");
        teacher.addWarn("5");
        teacher.addWarn("6");

        System.out.println(teacher);
    }
}
