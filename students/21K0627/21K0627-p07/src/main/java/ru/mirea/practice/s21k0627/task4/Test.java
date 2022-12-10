package ru.mirea.practice.s21k0627.task4;

public abstract class Test {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc(3, 4);
        System.out.println(mc);
        System.out.println(mc.absComplex());
        mc.powComplex(2);
        System.out.println(mc);
        System.out.println(mc.lengthCircle());
    }
}
