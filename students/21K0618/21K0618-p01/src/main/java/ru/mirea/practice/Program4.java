package ru.mirea.practice;

abstract class Program4 {
    public static void main(String[] args) {
        float[] garm = new float[10];
        for (int i = 0; i < 10; i++) {
            garm[i] = (float) 1 / (i + 1);
        }
        System.out.printf("Первые 10 элементов гармонического ряда:"
                + "%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f%n%.3f", garm[0], garm[1], garm[2], garm[3],
                garm[4], garm[5], garm[6], garm[7], garm[8], garm[9]);
    }
}
