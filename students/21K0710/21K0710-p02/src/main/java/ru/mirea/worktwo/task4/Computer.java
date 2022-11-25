package ru.mirea.worktwo.task4;

import java.util.Objects;

public class Computer {
    private int vcardClass;
    private double frequency;
    private int ram;
    private int hdd;

    public Computer(int vcardClass, double frequency, int ram, int hdd) {
        this.vcardClass = vcardClass;
        this.frequency = frequency;
        this.ram = ram;
        this.hdd = hdd;
    }

    public int getVcardClass() {
        return vcardClass;
    }

    public void setVcardClass(int vcardClass) {
        this.vcardClass = vcardClass;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" + "vcardClass=" + vcardClass + ", frequency=" + frequency + ", RAM=" + ram + ", HDD=" + hdd + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Computer comp = (Computer) obj;
        return this.vcardClass == comp.vcardClass
                && this.frequency == comp.frequency
                && this.ram == comp.ram
                && this.hdd == comp.hdd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcardClass, frequency, ram, hdd);
    }
}
