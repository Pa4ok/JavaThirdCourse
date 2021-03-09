package ru.pa4ok;

import java.util.*;

public class NewMain
{
     /*
    Book
    - private static int idCounter = 0
    - final int id = ++idCounter
    - String title
    - String author
    - int pages

    Library
    - String title
    - String address
    - List<Book> books //список со всеми книгами
    - Map<String, Integer> booksCache //ключ - название кники, объект - количество книг

    - public boolean hasBook(String title)
    - public Book takeBook(String title)
    - public void addBook(Book book)
    - public int bookCount(String title)

    у вас есть список со всеми книгами и кеш к ним
    при вызове hasBook вы проверяете есть ключ в кеше
    при добавлении в кеше нет такого ключа вы его добавлете
    при взятии книги если их не осталось - удалить запись из кеша
     */

    public static void main(String[] args)
    {
        //сеты тоже самое что и листы, но не хранят повторяющеся элементы
        /*List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("1");
        list.add("1");
        list.add("1");
        list.add("3");
        list.add("5");

        set.add("1");
        set.add("1");
        set.add("1");
        set.add("3");
        set.add("5");

        System.out.println(list);
        System.out.println(set);*/



        /*
            коллекция, которая хранит связки
            ключ-значение
            порядок не оригинальный
         */
        Map<String, TestObject> map = new HashMap<>();

        TestObject t1 = new TestObject("t1");
        TestObject t2 = new TestObject("t2");
        TestObject t3 = new TestObject("t3");
        TestObject t4 = new TestObject("t4");
        TestObject t5 = new TestObject("t5");
        TestObject t6 = new TestObject("t6");

        map.put(t1.title, t1);
        map.put(t2.title, t2);
        map.put(t3.title, t3);

        /*map.remove("t2");
        map.clear();
        map.size();
        map.isEmpty();
        map.containsKey("t9");
        TestObject t = map.get("t3");*/

        System.out.println(map);

        //перебор всех связок ключ-значение
        /*for(Map.Entry<String, TestObject> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }*/

        //перебор всех ключей
        /*for(String key : map.keySet()) {
            System.out.print(key + " | ");
        }
        System.out.println();*/

        //получение всех объектов
        /*List<TestObject> list = new ArrayList<>(map.values());
        System.out.println(list);*/
    }
}

class TestObject
{
    public String title;
    public int value = new Random().nextInt(1000);

    public TestObject(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "title='" + title + '\'' +
                ", value=" + value +
                '}';
    }
}
