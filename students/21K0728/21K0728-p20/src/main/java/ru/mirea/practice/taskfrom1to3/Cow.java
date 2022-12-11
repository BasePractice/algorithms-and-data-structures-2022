package ru.mirea.practice.taskfrom1to3;

public class Cow extends Animal {

    public Cow(String tp, String nm) {
        super(tp, nm);
    }

    @Override
    public void sound() {
        System.out.print("Moo-moo!!!");
    }
}
