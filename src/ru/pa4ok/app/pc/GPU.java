package ru.pa4ok.app.pc;

import java.util.Scanner;

public class GPU
{
    private final String title;
    private final double memory;
    private final boolean rtx;

    public GPU(String title, double memory, boolean rtx) {
        this.title = title;
        this.memory = memory;
        this.rtx = rtx;
    }

    public GPU copy()
    {
        return new GPU(title, memory, rtx);
    }

    public static GPU getFromKeyBoard(Scanner scanner)
    {
        System.out.print("Введите название видеркарты: ");
        String title = scanner.nextLine();

        System.out.print("Введите количество видеопамяти: ");
        double memory = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите есть ли rtx: ");
        boolean rtx = Boolean.parseBoolean(scanner.nextLine());

        return new GPU(title, memory, rtx);
    }

    @Override
    public String toString() {
        return "GPU{" +
                "title='" + title + '\'' +
                ", memory=" + memory +
                ", rtx=" + rtx +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getMemory() {
        return memory;
    }

    public boolean isRtx() {
        return rtx;
    }
}
