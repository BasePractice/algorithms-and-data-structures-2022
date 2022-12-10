package ru.mirea.practice.taskfrom1to3;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String tp; //Type of animal
    private String nm; //Name of animal

    public Animal(String tp, String nm) {
        this.tp = tp;
        this.nm = nm;
    }

    public String getTp() {
        return tp;
    }

    public String getNm() {
        return nm;
    }

    public void sound() {
        System.out.print("Sound!");
    }

    @Override
    public String toString() {
        return "Animal {" + "type is " + tp + ", name is " + nm + '}';
    }
}
