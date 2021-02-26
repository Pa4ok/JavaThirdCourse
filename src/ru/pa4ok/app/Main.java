package ru.pa4ok.app;

import ru.pa4ok.app.school.GenderEnum;
import ru.pa4ok.app.school.Human;

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
        //напрямую создать объект абстрактного класса нельзя
        //TestAbstractClass test = new TestAbstractClass();

        TestAbstractClass test = new TestExtends(3);

        //анонимный класс
        //который существует в рамках одной переменной
        Action action1 = new Action() {
            @Override
            public void process() {
                System.out.println("action 1");
            }

            @Override
            public String getName() {
                return "pwjfpoiewfj";
            }
        };

        //таким образом можно переопределять не только абстрактные функции но и обычные функции у обычных классов
        Human human = new Human("g", "fgr", "fe", GenderEnum.FEMALE, 55) {
            @Override
            public void nextYear() {
                super.nextYear();
                //...
            }
        };
    }
}
