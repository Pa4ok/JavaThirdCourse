package ru.pa4ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    /*
    если класс наследуется кем либо - все поля protected
    если класс НЕ наследуется - все поля private
    ко всем классам геттеры и сеттеры + toString()

    enum GenderEnum
    - MALE
    - FEMALE

    Human
    - String firstname
    - String surname
    - String patronymic
    - GenderEnum gender
    - int age
    - public void nexYear() //age++

    Teacher extends Human
    - String subject
    - int exp
    - public void nexYear() //сначала вызывать родительскую реализацию, потом exp++

    Student extends Human
    - int level
    - public void nexYear() //сначала вызывать родительскую реализацию, потом level++

    Building
    - String address
    - int floorCount

    School extends Building
    - int index
    - String title
    - List<Teacher> teachers
    - List<Student> students
    - public boolean addEntity(Human human)
            если класс объекта human принадлежит классу Teacher
            то нужно добавить его в teachers и вернуть true
            если класс объекта human принадлежит классу Student
            то нужно добавить его в students и вернуть true
            если и не то и не то - вывести в консоль аля not a school entity + human
            и вернуть false
    - public int nextYearAll()
        перебирает всех студентов и преподавателей и вызывает у них nextYear()
        если после вызова метода у стундента курс > 5, то его нужно удалить из списка
        и вывести информацию о том, что он закончил вуз
        если после вызова метода у преподавателя возраст > 65, то его нужно удалить из списка
        и вывести информацию о том, что он вышел на пенсию
        возвращаемым значением функции будет количество ушедших людей из школы
     */

    public static void main(String[] args)
    {
        /*List<String> list = new ArrayList<>();

        list.add("oirgoheorg");
        list.add("yukyukyukyuk");
        list.add("657567657");
        list.add("ytjth6oirgo");

        //System.out.println(list.size());
        //System.out.println(list.isEmpty());

        System.out.println(list.contains("oirgoheorg"));
        list.remove(2);
        list.remove("oirgoheorg");
        System.out.println(list.contains("oirgoheorg"));*/

        //List<String> list2 = new ArrayList<>();
        //list2.addAll(list);
        //
        //List<String> list2 = new ArrayList<>(list);

        //более правильный способ перебора листов
        /*for(String s : list) {
            //...
        }

        for(int i=0; i<list.size(); i++) {
            String s = list.get(i);
            //...
        }*/

        //System.out.println(list);

        //java 9+
        //List<String> l = List.of("eijfe", "rgrgrg", "rgeggre");

        //java 8
        //List<String> l = Arrays.asList("eijfe", "rgrgrg", "rgeggre");
        //строка ниже вызывает ошибку, так как в возвращаемой релизации
        //нет метода add
        //l.add("rthytjjyjy");
        //вариант ниже - самый простой фикс
        //List<String> l = new ArrayList<>(Arrays.asList("eijfe", "rgrgrg", "rgeggre"));

        //в листах нельзя хранить примитивы
        //List<int> list333 = new ArrayList<>();
        //List<Integer> list333 = new ArrayList<>();
    }
}

class TestClass1
{
    private List<String> list;

    public TestClass1(List<String> list) {
        this.list = list;
    }
}

class TestClass2
{
    private List<String> list = new ArrayList<>();

    public TestClass2() {
    }
}

class TestClass3
{
    private List<String> list;

    public TestClass3(String... strings) {
        list = new ArrayList<>(Arrays.asList(strings));
    }
}