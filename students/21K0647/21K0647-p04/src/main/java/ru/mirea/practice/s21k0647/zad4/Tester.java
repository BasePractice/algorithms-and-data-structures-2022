package ru.mirea.practice.s21k0647.zad4;

public final class Tester {
    Tester() {

    }
    public static void main(String[] args) {
        Computer computer1 = new Computer(Stamp.HP, 55000,
                new Memory(1024, 64, 12),
                new Monitor(23, 250, 144),
                new Processor(6, 3000, 117));
        System.out.println(computer1.toString());
    }
}
