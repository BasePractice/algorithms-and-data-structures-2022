package ru.mirea.practice.taskfrom1to3;

import java.io.Serializable;

public class GenericBox<C extends Comparable, A extends Animal & Serializable, K> {
    private C c;
    private A a;
    private K k;

    public GenericBox(C c, A a, K k) {
        this.c = c;
        this.a = a;
        this.k = k;
    }

    public C getT() {
        return c;
    }

    public A getV() {
        return a;
    }

    public K getK() {
        return k;
    }

    public void names() {
        System.out.print("T: " + c.getClass().toString());
        System.out.print("\nV: " + a.getClass().toString());
        System.out.print("\nK: " + k.getClass().toString());
    }

    @Override
    public String toString() {
        return "GenericBox{" + "C is " + c + ", A is " + a + ", K is " + k + '}';
    }
}
