package ru.pa4ok;

public class Main
{
    /*

    все поля protected + геттеры и сеттеры + toString()

    abstract Human
    - String firstname;
    - String surname;
    - String patronymic;
    - int age;
    - public abstract void work()

    Teacher extends Human
    - String subject
    - int exp
    - public void work()
        //переопределение абстрактной функции
        //вывод в консоль "учит студентов"

    Student extends Human
    - int level
    - public void work()
        //переопределение абстрактной функции
        //вывод в консоль "делает лабы"

    enum BuildingTypeEnum
    - LIVING
    - SOCIAL
    - INDUSTRIAL

    abstract Building
    - String address
    - int floorCount
    - public abstract BuildingTypeEnum getBuildingType()
        //абстрактная функция
        //возвращает тип здания (жилое, социальное, промышленное)

    School extends Building
    - int index
    - String title
    - Teacher[] teachers
    - Student[] students
    - public boolean addEntity(Human human)
            если класс объекта human принадлежит классу Teacher
            то нужно добавить его на пустое месте в массиве teachers и вернуть true
            если класс объекта human принадлежит классу Student
            то нужно добавить его на пустое месте в массиве students и вернуть true
            если и не то и не то - вывести в консоль аля not a school entity + human
            если пустого места нет или у нас "not a school entity" то вернуть false
    - public BuildingTypeEnum getBuildingType()
        //переопределение абстрактной функции
        //возвращает тип здания социальное
    - public void workAll()
        //перебирать всех студентов и учителей и вызывать функцию work()




     */

    public static void main(String[] args)
    {
        //TestAbstract testAbstract = new TestAbstract();

        Second second = new Second();
        second.test();

        TestAbstract testAbstract = new TestAbstract("wgerg") {
            @Override
            public void test() {
                System.out.println("реализация абстрактной функции 'на ходу'");
            }
        };
        testAbstract.test();
    }
}
