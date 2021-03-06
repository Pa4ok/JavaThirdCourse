package ru.pa4ok;

import java.util.*;

public class Main
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
        //коллекция без повторяющихся элементов
        /*Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("abc");
        set.add("abc");
        set.add("abc");
        set.add("abcggrgre");
        System.out.println(set);*/

        /*TestClass t1 = new TestClass();
        TestClass t2 = new TestClass();
        TestClass t3 = new TestClass();
        TestClass t4 = new TestClass();
        TestClass t5 = new TestClass();

        Map<String, TestClass> map = new HashMap<>();
        map.put(t1.uuid, t1);
        map.put(t2.uuid, t2);
        map.put(t3.uuid, t3);
        map.put(t4.uuid, t4);
        map.put(t5.uuid, t5);*/
        //System.out.println(map);

        /*String key = t3.uuid;
        TestClass find = map.get(key);
        System.out.println(find);

        String key2 = "433444";
        TestClass find2 = map.get(key2);
        System.out.println(find2);*/

        //boolean b = map.containsKey("4445htr");
        //boolean b1 = map.containsValue(t4);

        //map.clear();
        //map.size();
        //map.isEmpty();

        //перебор связок ключ-значение
        /*for(Map.Entry<String, TestClass> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + " | " + mapEntry.getValue());
        }

        System.out.println();

        //получение всех ключей
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        System.out.println();

        //получение всех объектов
        List<TestClass> list = new ArrayList<>(map.values());
        System.out.println(list);*/

        Library lib = new Library("greegrgge", "gre[ogrgerg");
        lib.addBook(new Book("1b", "fferfefe", 44));
        lib.addBook(new Book("2b", "fferfefe", 33));
        lib.addBook(new Book("2b", "fferfefe", 33));
        lib.addBook(new Book("3b", "fferfefe", 55));
        lib.addBook(new Book("4b", "fferfefe", 354));
        lib.addBook(new Book("4b", "fferfefe", 354));
        lib.addBook(new Book("4b", "fferfefe", 354));
        System.out.println(lib);
        System.out.println();
        System.out.println(lib.getBook("1b"));
        System.out.println(lib.getBook("2b"));
        System.out.println();
        System.out.println(lib);
        System.out.println();
        System.out.println(lib.bookCount("1b"));
        System.out.println(lib.bookCount("4b"));
        System.out.println(lib.hasBook("2b"));


    }
}

class TestClass
{
    public String uuid = UUID.randomUUID().toString();
    public int i = new Random().nextInt(1000);

    public TestClass() {
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "uuid='" + uuid + '\'' +
                ", i=" + i +
                '}';
    }
}


