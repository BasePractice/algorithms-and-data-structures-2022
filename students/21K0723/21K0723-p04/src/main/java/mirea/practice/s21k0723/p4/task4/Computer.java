package mirea.practice.s21k0723.p4.task4;

public class Computer {
    Mark mark;
    int price;
    Memory memory;
    Monitor monitor;
    Proccecor processor;

    Computer(Mark mark, int price, Monitor monitor, Memory memory, Proccecor proc) {
        this.mark = mark;
        this.price = price;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = proc;
    }

    @Override
    public String toString() {
        return "Marks: " + mark + "\nPrice " + price + "\nMemory : \n"
                + memory + "\nMonitor : \n" + monitor + "\nProcessor : \n" + processor;
    }
}