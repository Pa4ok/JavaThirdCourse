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
    все поля приватные + геттеры и сеттеры + toString()

    Computer
    - CPU cpu
    - GPU gpu
    - Memory[] memoriesBlocks
    public double getRating()
        должен расчитать рейтинг производительноти
        по формуле cpu.maxFrequency * 0.95 * cpu.cores + gpu.memory * 0.2 + 1 (если есть rtx)
    public Computer copy()
        должна скопировать объеът и все его вложенные объекты

    CPU //процессор
    - String title
    - int cores
    - double minFrequency
    - double maxFrequency
    public CPU copy()

    GPU //видеокарта
    - String title
    - double memory
    - boolean rtx
    public GPU copy()

    Memory
    - double memory
    - double frequency
    public Memory copy()

     */

    public static void main(String[] args)
    {
        Book book1 = new Book(1, "первая книга");
        Book book2 = new Book(2, "вторая книга");

        Library lib = new Library(
                "библиотека 1",
                new Book[]{
                        book1.copy(), book2.copy()
                }
        );

        /*System.out.println(lib);
        book1.setId(123);
        book2.setTitle("543grtegt5345");
        System.out.println(lib);*/

        Library lib2 = lib.copy();

        lib.getBooks()[0].setTitle("0485hgbkhg5");
        System.out.println(lib);
        System.out.println(lib2);
    }
}
