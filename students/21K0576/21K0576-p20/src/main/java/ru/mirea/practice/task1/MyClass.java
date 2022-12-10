package ru.mirea.practice.task1;

import java.io.Serializable;

public class MyClass<T extends Comparable, V extends Serializable & Animal, K> {
    T t;
    V v;
    K k;

    MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    void printNames() {
        System.out.println("tvk: " + t.getClass().getName() + " " + v.getClass().getName() + " " + k.getClass().getName());
    }
}
