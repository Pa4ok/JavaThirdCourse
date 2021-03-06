package ru.pa4ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
            то нужно добавить его на пустое месте в массиве teachers и вернуть true
            если класс объекта human принадлежит классу Student
            то нужно добавить его на пустое месте в массиве students и вернуть true
            если и не то и не то - вывести в консоль аля not a school entity + human
            если пустого места нет или у нас "not a school entity" то вернуть false
    - public int nextYearAll()
        перебирает всех студентов и преподавателей и вызывает у них nextYear()
        если после вызова метода у стундента курс > 5, то его нужно заменить на null
        и вывести информацию о том, что он закончил вуз
        если после вызова метода у преподавателя возраст > 65, то его нужно заменить на null
        и вывести информацию о том, что он вышел на пенсию
        возвращаемым значением функции будет количество ушедших людей из школы
     */

    public static void main(String[] args)
    {
        /*List<String> list = new ArrayList<>();

        list.add("ewkfewfwe");
        list.add("524545dff");
        list.add("fewfewf445");

        System.out.println(list);

        System.out.println(list.contains("fewfewf445"));
        list.remove(0);
        list.remove("524545dff");
        System.out.println(list);

        list.clear();
        list.isEmpty();
        list.size();

        for(int i=0; i<list.size(); i++) {
            String s = list.get(i);
        }

        for (String s : list) {
        }*/

        //java 9+
        //List<?> list = List.of(...);

        //java 8+
        //List<String> list2 = Arrays.asList("ghgh", "yjuyj", "rfwe");
        //при данной реализации вернется лист в который нельзя добавлять/удалять элементы
        //list2.add("fefeef"); <-- тут вылетает исключение
        List<String> list = new ArrayList<>(Arrays.asList("ghgh", "yjuyj", "rfwe"));
        list.add("efefe");
        System.out.println(list);
    }
}

class Test2
{
    private List<String> list = new ArrayList<>();

    public Test2(List<String> list) {
        this.list = list;
    }
}


class Test
{
    int i = new Random().nextInt(1000);

    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                '}';
    }
}