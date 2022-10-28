package ru.mirea.practice;

public final class Task4 {
    private Task4() {
    }

    public static int gsd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int harmonicNumerator = 1;
        int harmonicDenomerator = 1;
        System.out.println("1: " + harmonicNumerator + "/" + harmonicDenomerator);
        for (int i = 2; i <= 10; i++) {
            harmonicNumerator = harmonicNumerator * i + harmonicDenomerator;
            harmonicDenomerator *= i;

            int gsd = gsd(harmonicDenomerator, harmonicNumerator);
            harmonicNumerator = harmonicNumerator / gsd;
            harmonicDenomerator = harmonicDenomerator / gsd;

            System.out.println(i + ": " + harmonicNumerator + "/" + harmonicDenomerator);
        }
    }
}
