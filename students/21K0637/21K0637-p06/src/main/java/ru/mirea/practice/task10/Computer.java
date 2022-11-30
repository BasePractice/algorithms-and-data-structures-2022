package ru.mirea.practice.task10;

import java.util.Objects;

public class Computer {
    private final Brand brand;
    private Memory memory;
    private Processor processor;
    private Monitor monitor;

    public Computer(Brand brand, Memory memory, Processor processor, Monitor monitor) {
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
        this.brand = brand;
    }

    public Computer(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Computer)) {
            return false;
        }
        Computer computer = (Computer) o;
        return Objects.equals(memory, computer.memory)
            && Objects.equals(processor, computer.processor)
            && Objects.equals(monitor, computer.monitor) && brand == computer.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory, processor, monitor, brand);
    }

    @Override
    public String toString() {
        return brand + " {" + memory + processor + monitor + '}';
    }

    public enum Brand {
        Acer,
        DELL,
        HP,
        MSI,
        Lenovo,
    }
}
