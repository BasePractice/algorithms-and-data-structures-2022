package ru.mirea.practice.work11;

public class Convertion implements Convertable {
    private double value;

    Convertion(double value) {
        this.value = value;
    }

    @Override
    public void convert(double value, boolean marker) {
        if (marker) {
            System.out.print("\nТемпература в Фарингейтах = ");
            System.out.print(value *= 33.8);
        } else {
            System.out.print("\nТемпература в Кельвинах = ");
            System.out.print(value *= 274.15);
        }
    }
}
