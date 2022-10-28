package ru.mirea.practice.task4;

public class Computer {
    private String graphicCard;
    private String cpu;
    private String number;
    private String ram;

    public Computer() {
        graphicCard = " ";
        cpu = " ";
        ram = " ";
        number = " ";
    }

    public Computer(String pgraphiccard, String pcpu, String pram, String pnumber) {
        graphicCard = pgraphiccard;
        cpu = pcpu;
        ram = pram;
        number = pnumber;
    }

    public String getNumber() {
        return number;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;

    }

    public void print() {
        System.out.println("GPU: " + this.getGraphicCard() + " CPU: " + this.getCpu() + " RAM: " + this.getRam() + "\n");
    }

}

