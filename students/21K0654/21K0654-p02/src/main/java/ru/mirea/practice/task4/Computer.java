package ru.mirea.practice.task4;

public class Computer {
    private String cpu;

    private String motherboard;

    private String hdd;

    private String ram;

    private String vcard;

    private String name;

    public Computer(String name, String cpu, String motherboard, String hdd, String ram, String vcard) {
        this.name = name;

        this.cpu = cpu;

        this.motherboard = motherboard;

        this.hdd = hdd;

        this.ram = ram;

        this.vcard = vcard;
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setVideoCard(String vcard) {
        this.vcard = vcard;
    }

    public String getVideoCard() {
        return vcard;
    }

    @Override
    public String toString() {
        return this.name + " " + this.cpu + " " + this.motherboard + " " + this.ram + " " + this.vcard + " " + this.hdd;
    }
}
