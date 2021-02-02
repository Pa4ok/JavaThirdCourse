package ru.pa4ok.pc;

import java.util.Arrays;

public class Computer
{
    private CPU cpu;
    private GPU gpu;
    private Memory[] memoryBlocks;

    public Computer(CPU cpu, GPU gpu, Memory[] memoryBlocks) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoryBlocks = memoryBlocks;
    }

    public Computer(CPU cpu, GPU gpu, int memoryBlockCount) {
        this(cpu, gpu, new Memory[memoryBlockCount]);
    }

    public Computer copy()
    {
        Computer newComputer = new Computer(cpu.copy(), gpu.copy(), memoryBlocks.length);

        for(int i=0; i<memoryBlocks.length; i++)
        {
            if(memoryBlocks[i] != null) {
                newComputer.getMemoryBlocks()[i] = memoryBlocks[i].copy();
            }
        }

        return newComputer;
    }

    public double getRating()
    {
        return cpu.getMaxFrequency() * 0.95 + gpu.getMemory() * 0.2 + (gpu.isRtx() ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", memoryBlocks=" + Arrays.toString(memoryBlocks) +
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

    public Memory[] getMemoryBlocks() {
        return memoryBlocks;
    }

    public void setMemoryBlocks(Memory[] memoryBlocks) {
        this.memoryBlocks = memoryBlocks;
    }
}
