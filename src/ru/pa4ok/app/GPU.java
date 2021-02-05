package ru.pa4ok.app;

public class GPU
{
    private String title;
    private float memory;
    private boolean rtx;

    public GPU(String title, float memory, boolean rtx) {
        this.title = title;
        this.memory = memory;
        this.rtx = rtx;
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

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public boolean isRtx() {
        return rtx;
    }

    public void setRtx(boolean rtx) {
        this.rtx = rtx;
    }
}
