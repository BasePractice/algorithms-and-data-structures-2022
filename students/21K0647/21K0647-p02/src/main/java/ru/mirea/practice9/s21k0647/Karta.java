package ru.mirea.practice9.s21k0647;

public class Karta {
    String weight;
    String mast;

    public Karta() {
        weight = "";
        mast = "";
    }

    public Karta(String weight, String mast) {
        this.weight = weight;
        this.mast = mast;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }
}
