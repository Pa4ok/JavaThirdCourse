package ru.pa4ok.app;

public class CPU
{
    private String title;
    private int cores;
    private float minFrequency;
    private float maxFrequency;

    public CPU(String title, int cores, float minFrequency, float maxFrequency) {
        this.title = title;
        this.cores = cores;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
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

    public float getMinFrequency() {
        return minFrequency;
    }

    public void setMinFrequency(float minFrequency) {
        this.minFrequency = minFrequency;
    }

    public float getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(float maxFrequency) {
        this.maxFrequency = maxFrequency;
    }
}
