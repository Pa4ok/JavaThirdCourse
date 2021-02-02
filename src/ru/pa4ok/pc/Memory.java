package ru.pa4ok.pc;

public class Memory
{
    private double memory;
    private double frequency;

    public Memory(double memory, double frequency) {
        this.memory = memory;
        this.frequency = frequency;
    }

    public Memory copy()
    {
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

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
