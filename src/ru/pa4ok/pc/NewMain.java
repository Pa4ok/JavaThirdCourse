package ru.pa4ok.pc;

public class NewMain
{
    /*
    все поля приватные + геттеры и сеттеры + toString()

    Computer
    - CPU cpu
    - GPU gpu
    - Memory[] memoriesBlocks
    - 2 конструктора
         1 - запрашивает все 3 поля
         2 - запрашивает cpu, gpu и количество объектов оперативной пати
    public double getRating()
        должен расчитать рейтинг производительноти
        по формуле cpu.maxFrequency * 0.95 * cpu.cores + gpu.memory * 0.2 + 1 (если есть rtx)

    CPU //процессор
    - String title
    - int cores
    - double minFrequency
    - double maxFrequency

    GPU //видеокарта
    - String title
    - double memory
    - boolean rtx

    Memory
    - double memory
    - double frequency

     */

    public static void main(String[] args)
    {
        CPU cpu = new CPU("i9900k", 8, 3.6, 5.0);
        GPU gpu = new GPU("3070", 8192, true);
        Memory memory1 = new Memory(4096, 2666);
        Memory memory2 = new Memory(4096, 2666);

        Computer computer1 = new Computer(
                cpu.copy(),
                gpu,
                new Memory[]{
                        memory1,
                        memory2
                }
        );

        Computer computer2 = computer1.copy();

        System.out.println(computer1);
        System.out.println(computer2);

        System.out.println();

        computer1.getGpu().setRtx(false);
        System.out.println(computer1);
        System.out.println(computer2);
    }
}

