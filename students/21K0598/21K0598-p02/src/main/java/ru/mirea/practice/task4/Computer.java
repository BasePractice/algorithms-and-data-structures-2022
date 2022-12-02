package ru.mirea.practice.task4;

public class Computer {
    private String computerName;
    private String videoCardName;
    private String processorName;
    private int memory;
    private int ram;

    public Computer(String computerName, String videoCardName, String processorName, int memory, int ram) {
        this.computerName = computerName;
        this.videoCardName = videoCardName;
        this.processorName = processorName;
        this.memory = memory;
        this.ram = ram;
    }

    public String getVideoCardName() {
        return videoCardName;
    }

    public void setVideoCardName(String videoCardName) {
        this.videoCardName = videoCardName;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @Override
    public String toString() {
        return  "Имя компьютера: " + computerName + '\n'
                + "Имя видеокарты: " + videoCardName + '\n'
                + "Имя процессора: " + processorName + '\n'
                + "Объём памяти: " + memory + "G" + '\n'
                + "Объём оперативной памяти: " + ram + "G";
    }
}
