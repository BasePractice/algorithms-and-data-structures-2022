package ru.mirea.practice5.s21k0647;

import java.util.ArrayList;
import java.util.List;

public final class Dogkennel {
    private Dogkennel() {

    }

    public static void main(String[] args) {
        Dog a1 = new Dog("Jerry", 10);
        List<Dog> kennel = new ArrayList<>();
        kennel.add(a1);
        Dog a2 = new Dog("Pat", 4);
        kennel.add(a2);
        System.out.println(kennel.get(1).manAlt());
        for (Dog x: kennel) {
            System.out.println(x.toString());
        }
    }
}
