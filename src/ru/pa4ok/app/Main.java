package ru.pa4ok.app;

public class Main
{
    /*
        ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
        ALT-INSERT - вызов меню генерации

     */

    /*
    все поля приватные + геттеры и сеттеры + toString()

    Building
    - String type
    - Address address
    - Apartment[] apartments
    - public Building copy()
    - public boolean hasApartmentOwner(int index)
    - public String getApartmentOwner(int index)
    - public void setApartmentOwner(int index, String newOwner)

    Address
    - String country
    - String region
    - String city
    - String street
    - String index
    - public Address copy()

    Apartment
    - index
    - String owner
    - double square
    - int rooms
    - public Apartment copy()

     */

    public static void main(String[] args)
    {
        CPU cpu = new CPU("i9900k", 8, 3.6F, 5.0F);
        GPU gpu = new GPU("1080ti", 12, false);
        Memory memory1 = new Memory(8, 2666);
        Memory memory2 = new Memory(8, 2666);

        Computer pc1 = new Computer(
                cpu,
                gpu,
                new Memory[] {
                        memory1.copy(),
                        memory2.copy()
                }
        );

        System.out.println(pc1);
        cpu.setTitle("oiewhfowegfe");
        memory1.setMemory(155555);
        System.out.println(pc1);
    }
}
