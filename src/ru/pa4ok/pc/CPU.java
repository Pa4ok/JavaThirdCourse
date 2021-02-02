package ru.pa4ok.pc;

public class CPU
{
    private String title;
    private int cores;
    private double minFrequency;
    private double maxFrequency;

    public CPU(String title, int cores, double minFrequency, double maxFrequency)
    {
        this.title = title;
        this.cores = cores;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    public CPU copy()
    {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
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
