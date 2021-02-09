package ru.pa4ok.app.pc;

    /*
    ALT-INSERT - вызов меню генерации (можно через ПКМ)
    ALT-ENTER - вывов меню исправления ошибки (нужно перевести курсор на нее)
    CTRL-SPACE - вызов контекстного меню автопродолжения кода
    CTRL-ALT-L - форматирование кода (стиль)
     */

import ru.pa4ok.app.pc.CPU;
import ru.pa4ok.app.pc.Computer;
import ru.pa4ok.app.pc.GPU;
import ru.pa4ok.app.pc.Memory;

import java.util.Scanner;

public class Main
{
    /*

    Computer
    - CPU cpu
    - GPU gpu
    - Memory[] memoriesBlocks //фиксированная длина 2
    public double getRating()
        должен расчитать рейтинг производительноти
        по формуле cpu.maxFrequency * 0.95 * cpu.cores + gpu.memory * 0.2 + 1 (если есть rtx)
    public Computer copy()
        должна скопировать объеът и все его вложенные объекты
    public static Computer getFromKeyboard(Scanner scanner)
        поочереди вызовет
        CPU.getFromKeyboard(scanner)
        GPU.getFromKeyboard(scanner)
        Memory.getFromKeyboard(scanner)

    enum CPU //пару процессоров закиньте как константы enum
    - final String title
    - final int cores
    - double minFrequency
    - double maxFrequency
    public CPU copy()
    public static CPU getFromKeyboard(Scanner scanner)

    enum GPU //пару видеокарт закиньте как константы enum
    - final String title
    - final double memory
    - final boolean rtx
    public GPU copy()
    public static GPU getFromKeyboard(Scanner scanner)

    enum Memory //пару плашек оперативной памятиы закиньте как константы enum
    - final double memory
    - double frequency
    public Memory copy()
    public static Memory getFromKeyboard(Scanner scanner)

     */

    public static void main(String[] args)
    {
        /*CPU cpu = new CPU("i9900k", 8, 3.6, 5.0);
        GPU gpu = new GPU("1080ti", 12, false);
        Memory[] memories = {
                new Memory(8, 2666),
                new Memory(8, 2666)
        };

        Computer pc1 = new Computer(cpu, gpu, memories);
        Computer pc2 = pc1.copy();

        pc1.getCpu().setCores(16);
        pc1.getGpu().setTitle("ewfhwef");
        pc1.getMemoriesBlocks()[0].setMemory(16);

        System.out.println(pc1);
        System.out.println(pc2);*/

        Computer pc = Computer.getFromKeyboard(new Scanner(System.in));
        System.out.println();
        System.out.println(pc);
    }
}
