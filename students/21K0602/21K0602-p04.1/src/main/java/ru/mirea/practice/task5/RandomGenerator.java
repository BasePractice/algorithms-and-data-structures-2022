package ru.mirea.practice.task5;

public abstract class RandomGenerator {
    public static String phoneNumber() {
        StringBuilder builder = new StringBuilder();
        builder.append("8");
        builder.append((Integer) (random(900, 999))).toString();
        builder.append(((Integer) (random(1000000, 9999999))).toString());
        return builder.toString();
    }

    public static int random(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}

