package ru.mirea.practice.task4;

public class Computer {
    private Memory memory;
    private Processor processor;
    private VideoCard videoCard;
    private Brands brand;

    public Computer(String mem, String proc, String vc, int n, String id) {
        this.memory = new Memory(mem, id);
        this.processor = new Processor(proc, id);
        this.videoCard = new VideoCard(vc, id);
        this.brand = Brands.valueOf(String.valueOf(n));
    }

    @Override
    public String toString() {
        return memory + " " + processor + " " + videoCard + " " + this.memory.getId() + this.brand.name();
    }

    public static void main(String[] args) {
        Computer computer = new Computer("qwerty", "ytrewq", "zxcvbn", 3, "1234567890");
        System.out.println(computer.toString());
    }
}
