package ru.mirea.practice.taskfrom1to3;

public class Chicken extends Animal {

    public Chicken(String tp, String nm) {
        super(tp, nm);
    }

    @Override
    public void sound() {
        System.out.print("Pock-pock-pock!!!");
    }
}
