package ru.mirea.practice.s21k0706;

public final class Number14 {
    private  Number14() {

    }

    public static void main(String[] args) {
        System.out.println("The first 10 numbers of the harmonic series: ");
        for (double i = 0; i < 10; i++) {
            System.out.printf("%.2f%n", 1 / (i + 1));
        }
    }
}
