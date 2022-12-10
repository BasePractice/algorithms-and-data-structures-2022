package ru.mirea.practice.task4;

public class Processor {
    private final Marks name;
    private final String typeOfCpu;
    private final double frequency;
    private final int cntCores;

    public Processor(Marks name, String typeOfCpu, double frequency, int cntCores){
        this.name = name;
        this.typeOfCpu = typeOfCpu;
        this.frequency = frequency;
        this.cntCores = cntCores;
    }
    public String toString() {
        return "Тип процессора компьютера " + name + "\t: " + typeOfCpu +
        "." + "Тактовая частота: " + frequency + "." + "Кол-во ядер: " + cntCores;
    }
}
