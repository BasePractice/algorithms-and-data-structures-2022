package ru.mirea.practice.n4;

import java.util.ArrayList;

public class Shop {


    public ArrayList<String> katalog;

    public Shop(ArrayList<String> katalog) {
        this.katalog = katalog;
        this.katalog.add(0, "Список товаров:\n");
    }

    public Shop() {
        katalog = new ArrayList<String>();
        katalog.add(0, "Список товаров:\n");
    }

    public ArrayList<String> getKatalog() {
        return katalog;
    }

    public void setKatalog(ArrayList<String> katalog) {
        this.katalog = katalog;
    }

    public void autput() {
        System.out.println(katalog.get(0));
        for (int i = 1; i < katalog.size(); i++) {
            System.out.println(i + ". " + katalog.get(i) + "р\n");
        }
    }
}
