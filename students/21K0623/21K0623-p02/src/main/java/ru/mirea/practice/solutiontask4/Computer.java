package ru.mirea.practice.solutiontask4;

public class Computer {
    private String cpu;
    private String videoCard;
    private String motherboard;
    private String memory;
    private String namePc;

    public Computer(String namePc, String cpu, String videoCard, String motherboard, String memory) {
        this.namePc = namePc;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.motherboard = motherboard;
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setNamePc(String namePc) {
        this.namePc = namePc;
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getMotherboard() {
        return this.motherboard;
    }

    public String getVideoCard() {
        return this.videoCard;
    }

    public String getMemory() {
        return this.memory;
    }

    public String getNamePc() {
        return this.namePc;
    }

    @Override
    public String toString() {
        return "Name: " + this.namePc + "\n Cpu: " + this.cpu
                + "\n Videocard: " + this.videoCard + "\n Motherboard" + this.motherboard
                + "\n Memory: " + this.memory;
    }
}
