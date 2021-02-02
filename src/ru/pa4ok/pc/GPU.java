package ru.pa4ok.pc;

public class GPU
{
    private String title;
    private double memory;
    private boolean rtx;

    public GPU(String title, double memory, boolean rtx) {
        this.title = title;
        this.memory = memory;
        this.rtx = rtx;
    }

    public GPU copy()
    {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public boolean isRtx() {
        return rtx;
    }

    public void setRtx(boolean rtx) {
        this.rtx = rtx;
    }
}
