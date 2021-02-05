package ru.pa4ok.app;

public class Main
{
    /*
        ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
        ALT-INSERT - вызов меню генерации

     */

    /*
    все поля приватные + геттеры и сеттеры + toString()

    Computer
    - CPU cpu
    - GPU gpu
    - Memory[] memoriesBlocks
    public float getRating()
        должен расчитать рейтинг производительноти
        по формуле cpu.maxFrequency * 0.95 * cpu.cores + gpu.memory * 0.2 + 1 (если есть rtx)

    CPU //процессор
    - String title
    - int cores //4, 8, 16
    - float minFrequency //1.5, 2,6, 3,6
    - float maxFrequency //2,6, 4,1, 5,0

    GPU //видеокарта
    - String title
    - float memory //2, 4, 6, 12, 16
    - boolean rtx

    Memory
    - float memory //2, 4, 8, 16
    - float frequency //2400, 2666

     */

    public static void main(String[] args)
    {
        Computer pc1 = new Computer(
                new CPU(
                        "i9900k",
                        8,
                        3.6F,
                        5.0F
                ),
                new GPU(
                        "1080ti",
                        12,
                        false
                ),
                new Memory[] {
                        new Memory(8, 2666),
                        new Memory(8, 2666)
                }
        );

        System.out.println(pc1);
        System.out.println(pc1.getRating());
    }
}
