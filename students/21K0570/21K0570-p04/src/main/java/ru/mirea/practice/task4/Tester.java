package ru.mirea.practice.task4;

abstract class Tester {
    public static void main(String[] args) {
        Computer comp = new Computer(new Processor(Marks.INTEL, "i5",16, 6),
        new Memory(Marks.INTEL, 3200, 59), new Monitor(Marks.INTEL, 17.3));
        System.out.println(comp);
    }
}
