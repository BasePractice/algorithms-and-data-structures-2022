package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static void main(String[] args) {
        List<Clothes> arr = new ArrayList<Clothes>();
        arr.add(new Skirt());
        arr.add(new Pants());
        arr.add(new Tie());
        arr.add(new TShirt());
        arr.get(0).colour = "pink";
        arr.get(2).colour = "blue";

        Atelier at = new Atelier();
        at.dressMan(arr);
        System.out.println("\n");
        at.dressWomen(arr);
    }


}
