package ru.mirea.practice.task4;

public enum Brands {
    MSI(1), ASUS(2), HP(3);

    private int num;

    Brands(int num) {
        System.out.println(num + " - " + this.name());
    }

    public int getNum() {
        return this.num;
    }
}
