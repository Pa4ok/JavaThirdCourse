package ru.pa4ok.app.pc;

import java.util.Scanner;

public class Memory
{
    private final double memory;
    private double frequency;

    public Memory(double memory, double frequency) {
        this.memory = memory;
        this.frequency = frequency;
    }

    public Memory copy()
    {
        return new Memory(memory, frequency);
    }

    public static Memory getFromKeyboard(Scanner scanner)
    {
        System.out.print("Введите количество оперативной памяти: ");
        double memory = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите частота оперативной памяти: ");
        double frequency = Double.parseDouble(scanner.nextLine());

        return new Memory(memory, frequency);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memory=" + memory +
                ", frequency=" + frequency +
                '}';
    }

    public double getMemory() {
        return memory;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
