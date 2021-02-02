package org.edu.school;

import org.edu.school.comp.CPU;
import org.edu.school.comp.Computer;
import org.edu.school.comp.GPU;
import org.edu.school.comp.Memory;

public class NewMain
{
    /*
    все поля приватные + геттеры и сеттеры + toString()

    Computer
    - CPU cpu
    - GPU gpu
    - Memory[] memoriesBlocks
    public float getRating()
        должен расчитать рейтинг производительноти
        по формуле cpu.maxFrequency * 0.95 * cpu.cores + gpu.memory * 0.2 + 1 (если есть rtx)
    public Computer copy()
        должна скопировать объеът и все его вложенные объекты

    CPU //процессор
    - String title
    - int cores
    - float minFrequency
    - float maxFrequency
    public Computer copy()

    GPU //видеокарта
    - String title
    - float memory
    - boolean rtx
    public Computer copy()

    Memory
    - float memory
    - float frequency
    public Computer copy()

     */

    public static void main(String[] args)
    {
        Computer computer1 = new Computer(
                new CPU(
                        "i5",
                        8,
                        1.5,
                        3.3
                ),
                new GPU(
                        "1050ti",
                        4096,
                        true
                ),
                new Memory[] {
                        new Memory(2048, 1500),
                        new Memory(2048, 1500),
                        new Memory(2048, 1500),
                        new Memory(2048, 1500)
                }
        );

        Computer computer2 = computer1.copy();

        computer2.getCpu().setCores(6);
        computer2.getGpu().setRtx(false);
        computer2.getMemories()[0].setFrequency(3000);

        System.out.println(computer1);
        System.out.println(computer1.getRating());
        System.out.println();
        System.out.println(computer2);
        System.out.println(computer2.getRating());
    }
}
