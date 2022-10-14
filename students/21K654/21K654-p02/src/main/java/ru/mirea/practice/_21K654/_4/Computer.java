package ru.mirea.practice._21K654._4;

public class Computer {
    private String CPU;
    private String Motherboard;
    private String HDD;
    private String RAM;
    private String VideoCard;
    private String name;
    public Computer(String name,String CPU, String Motherboard,String HDD,String RAM,String VideoCard){
        this.name=name; this.CPU=CPU; this.Motherboard=Motherboard; this.HDD=HDD; this.RAM=RAM; this.VideoCard=VideoCard;
    }
    public Computer(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setMotherboard(String motherboard) {
        Motherboard = motherboard;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setVideoCard(String videoCard) {
        VideoCard = videoCard;
    }

    public String getVideoCard() {
        return VideoCard;
    }

    @Override
    public String toString(){
        return this.name+" "+this.CPU+" "+this.Motherboard+" "+this.RAM+" "+this.VideoCard+" "+this.HDD;
    }
}
