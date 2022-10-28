package ru.mirea.workthree.mathrandom.task45;


abstract class SizeArr {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}