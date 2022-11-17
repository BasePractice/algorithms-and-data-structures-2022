package ru.mirea.practice.s21K0703.lab2.t4;

public class Computer {
    String model;
    String processor;
    String memory;
    String battery;
    public Computer(String model, String processor, String memory, String battery){
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.battery = battery;
    }

    public String getModel(){ return model;}

    public void setModel(String model){ this.model = model;}

    public String getProcessor(){ return processor;}

    public void setProcessor(String processor){ this.processor = processor;}

    public String getMemory(){ return memory;}

    public void setMemory(String memory){ this.memory = memory;}

    public String getBattery(){ return battery;}

    public void setBattery(String battery){ this.battery = battery;}


}

