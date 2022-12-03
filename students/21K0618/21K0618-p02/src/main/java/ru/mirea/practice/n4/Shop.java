package ru.mirea.practice.n4;

import java.util.List;

public class Shop {


    public List<String> katalog;

    public Shop(List<String> katalog) {
        this.katalog = katalog;
        this.katalog.add(0, "Список товаров:\n");
    }

    public Shop() {
        katalog.add(0, "Список товаров:\n");
    }

    public List<String> getKatalog() {
        return katalog;
    }

    public void setKatalog(List<String> katalog) {
        this.katalog = katalog;
    }

    public void autput() {
        System.out.println(katalog.get(0));
        for (int i = 1; i < katalog.size(); i++) {
            System.out.println(i + ". " + katalog.get(i) + "р\n");
        }
    }
}
