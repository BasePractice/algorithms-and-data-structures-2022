package ru.mirea.practice.math.random.ex3;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            double f = Math.random() / Math.nextDown(1.0);
            array[i] = (int) (10 * (1.0 - f) + 99 * f);
            System.out.print(array[i] + " ");
        }
        boolean increasing = true;
        for (int i = 0; i < 3; i++) {
            if (array[i] >= array[i + 1]) {
                increasing = false;
                break;
            }
        }
        System.out.println();
        System.out.println(increasing);
    }
}
