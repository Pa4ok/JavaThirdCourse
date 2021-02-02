package org.edu.school.comp;

import java.util.Arrays;

public class Computer
{
    private CPU cpu;
    private GPU gpu;
    private Memory[] memories;

    public Computer(CPU cpu, GPU gpu, Memory[] memories) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memories = memories;
    }

    public Computer(CPU cpu, GPU gpu, int memoryCount) {
        this(cpu, gpu, new Memory[memoryCount]);
    }

    public double getRating()
    {
        return cpu.getMaxFrequency() * 0.95 * cpu.getCores() + getGpu().getMemory() * 0.2 + (gpu.isRtx() ? 1 : 0);
    }

    public Computer copy()
    {
        Computer newComputer = new Computer(cpu.copy(), gpu.copy(), memories.length);

        for(int i=0; i<memories.length; i++) {
            newComputer.getMemories()[i] = memories[i].copy();
        }

        return newComputer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", memories=" + Arrays.toString(memories) +
                '}';
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Memory[] getMemories() {
        return memories;
    }

    public void setMemories(Memory[] memories) {
        this.memories = memories;
    }
}
