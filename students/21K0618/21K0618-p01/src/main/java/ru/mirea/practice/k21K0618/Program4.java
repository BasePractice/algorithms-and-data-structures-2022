package ru.mirea.practice.k21K0618;

public class Program4 {
    public static void main (String[] args) {
        float [] Garm = new float [10];
        for (int i = 0; i < 10; i++) {
            Garm [i] = (float) 1/(i+1);
        }
        System.out.printf("Первые 10 элементов гармонического ряда:%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f", Garm[0], Garm[1], Garm[2], Garm[3], Garm[4], Garm[5], Garm[6], Garm[7], Garm[8], Garm[9]);
    }
}
