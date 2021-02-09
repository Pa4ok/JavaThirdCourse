package ru.pa4ok.app.pc;

import java.util.Arrays;
import java.util.Scanner;

public class Computer
{
    private CPU cpu;
    private GPU gpu;
    private Memory[] memoriesBlocks;

    public Computer(CPU cpu, GPU gpu, Memory[] memoriesBlocks) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoriesBlocks = memoriesBlocks;
    }

    public double getRating()
    {
        return cpu.getMaxFrequency() * 0.95 * cpu.getCores() + gpu.getMemory() * 0.2 + (gpu.isRtx() ? 1 : 0);
    }

    public Computer copy()
    {
        Computer newPc = new Computer(
                this.cpu.copy(),
                this.gpu.copy(),
                new Memory[getMemoriesBlocks().length]
        );

        for(int i=0; i< memoriesBlocks.length; i++) {
            newPc.getMemoriesBlocks()[i] = this.memoriesBlocks[i].copy();
        }

        return newPc;
    }

    public static Computer getFromKeyboard(Scanner scanner)
    {
        CPU cpu = CPU.getFromKeyBoard(scanner);
        GPU gpu = GPU.getFromKeyBoard(scanner);
        Memory memory = Memory.getFromKeyboard(scanner);

        return new Computer(cpu, gpu, new Memory[] { memory });
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", memoriesBlocks=" + Arrays.toString(memoriesBlocks) +
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

    public Memory[] getMemoriesBlocks() {
        return memoriesBlocks;
    }

    public void setMemoriesBlocks(Memory[] memoriesBlocks) {
        this.memoriesBlocks = memoriesBlocks;
    }
}
