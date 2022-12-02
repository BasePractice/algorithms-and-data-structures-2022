package ru.mirea.practice.task4;

public class Computer {
    private String ComputerName;
    private String VideoCardName;
    private String ProcessorName;
    private int Memory;
    private int RAM;

    public Computer(String computerName, String videoCardName, String processorName, int memory, int RAM) {
        ComputerName = computerName;
        VideoCardName = videoCardName;
        ProcessorName = processorName;
        Memory = memory;
        this.RAM = RAM;
    }

    public String getVideoCardName() {
        return VideoCardName;
    }

    public void setVideoCardName(String videoCardName) {
        VideoCardName = videoCardName;
    }

    public String getProcessorName() {
        return ProcessorName;
    }

    public void setProcessorName(String processorName) {
        ProcessorName = processorName;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getComputerName() {
        return ComputerName;
    }

    public void setComputerName(String ComputerName) {
        this.ComputerName = ComputerName;
    }

    @Override
    public String toString() {
        return  "Имя компьютера: " + ComputerName + '\n' +
                "Имя видеокарты: " + VideoCardName + '\n' +
                "Имя процессора: " + ProcessorName + '\n' +
                "Объём памяти: " + Memory + "G" + '\n' +
                "Объём оперативной памяти: " + RAM + "G";
    }
}
