package ru.mirea.practice.task4;


public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.monitor = monitor;
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
    }

    public Computer(Brand brand) {
        this.brand = brand;
        switch (brand) {
            case HP:
                processor = new Processor(14, 6000);
                memory = new Memory(8, 512, 2048);
                monitor = new Monitor(28, 120);
                break;
            case LENOVO:
                processor = new Processor(10, 5000);
                memory = new Memory(4, 128, 512);
                monitor = new Monitor(20, 60);
                break;
            case SAMSUNG:
                processor = new Processor(12, 7500);
                memory = new Memory(16, 256, 512);
                monitor = new Monitor(18, 60);
                break;
            case ACER:
                processor = new Processor(18, 8000);
                memory = new Memory(16, 512, 0);
                monitor = new Monitor(32, 120);
                break;
            case DELL:
                processor = new Processor(10, 4000);
                memory = new Memory(12, 256, 512);
                monitor = new Monitor(20, 60);
                break;
            case ASUS:
                processor = new Processor(50, 10000);
                memory = new Memory(24, 1024, 4096);
                monitor = new Monitor(40, 240);
                break;
            default:
                System.out.println("ERROR!!!");
                break;

        }
    }

    @Override
    public String toString() {
        return "Computer{" + "processor=" + processor + ", memory=" + memory + ", monitor=" + monitor + ", brand=" + brand + '}';
    }
}
