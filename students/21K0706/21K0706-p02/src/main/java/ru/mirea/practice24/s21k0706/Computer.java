package ru.mirea.practice24.s21k0706;

public class Computer {
    private String brand;
    private String model;
    private String memory;
    private String processor;

    public Computer(String brand, String model, String memory, String processor) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

}
