package ru.pa4ok.app.pc;

import java.util.Scanner;

public class CPU
{
    private final String title;
    private final int cores;
    private double minFrequency;
    private double maxFrequency;

    public CPU(String title, int cores, double minFrequency, double maxFrequency) {
        this.title = title;
        this.cores = cores;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    public CPU copy()
    {
        return new CPU(title, cores, minFrequency, maxFrequency);
    }

    public static CPU getFromKeyBoard(Scanner scanner)
    {
        System.out.print("Введите название процессора: ");
        String title = scanner.nextLine();

        System.out.print("Введите количество ядер: ");
        int cores = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите минимальную частотму: ");
        double minFrequency = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите максимальную частоту: ");
        double maxFrequency = Double.parseDouble(scanner.nextLine());

        return new CPU(title, cores, minFrequency, maxFrequency);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "title='" + title + '\'' +
                ", cores=" + cores +
                ", minFrequency=" + minFrequency +
                ", maxFrequency=" + maxFrequency +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getCores() {
        return cores;
    }

    public double getMinFrequency() {
        return minFrequency;
    }

    public void setMinFrequency(double minFrequency) {
        this.minFrequency = minFrequency;
    }

    public double getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(double maxFrequency) {
        this.maxFrequency = maxFrequency;
    }
}
