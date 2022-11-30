package ru.mirea.practice.s21k0647.zad4;

public class Computer {
    Stamp log;
    int price;
    Memory memory;
    Monitor monitor;
    Processor processor;

    Computer(Stamp log, int price, Memory memory, Monitor monitor, Processor processor) {
        this.log = log;
        this.price = price;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Logo: " + log + "\nPrice " + price + "\nMempry : \n"
                + memory.toString() + "\nMonitor : \n" + monitor.toString() + "\nProcessor : \n" + processor.toString();
    }
}
