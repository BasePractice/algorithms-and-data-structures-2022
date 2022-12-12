package ru.mirea.practice;

abstract class P3N1 {
    public static void main(String[] args) {
        double[] mm = new double[10];
        for (int i = 0; i < mm.length; i++) {
            mm[i] = Math.random();
            System.out.print(mm[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < mm.length; i++) {
            double current = mm[i];
            int j = i - 1;
            while (j >= 0 && current < mm[j]) {
                mm[j + 1] = mm[j];
                j--;
            }
            mm[j + 1] = current;
        }
        for (double v : mm) {
            System.out.print(v + " ");
        }

        System.out.println();
        System.out.println();

        double[] mr = new double[10];
        for (int i = 0; i < mr.length; i++) {
            mr[i] = Math.random() * (10 - 1) + 1;
            System.out.print(mr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < mr.length; i++) {
            double current = mr[i];
            int j = i - 1;
            while (j >= 0 && current < mr[j]) {
                mr[j + 1] = mr[j];
                j--;
            }
            mr[j + 1] = current;
        }
        for (double v : mr) {
            System.out.print(v + " ");
        }
    }
}
