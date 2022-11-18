package ru.mirea.practice.task4;

public class Computer {
    private String computername;

    public Computer(String computername) {
        this.computername = computername;
    }

    public String getComputername() {
        return computername;
    }

    public void setComputername(String computername) {
        this.computername = computername;
    }

    @Override
    public String toString() {
        return "Computer{" + "computername='" + computername + '\'' + '}';
    }
}
