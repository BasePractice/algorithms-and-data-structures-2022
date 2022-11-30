package ru.mirea.workthree.mathrandom.task3;

abstract class Arr {
    private static int arr(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        final int min = 10;
        final int max = 99;
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            final int arr = arr(min, max);
            a[i] = arr;
            System.out.print(a[i] + " ");
        }
        int z = 0;
        for (int i = 0; i <= 2; ) {
            for (int j = i + 1; j <= 3; ) {
                if (a[i] <= a[j]) {
                    if (j == 3) {
                        z = 1;
                        break;
                    } else {
                        i++;
                        j++;
                    }
                } else {
                    z = 1;
                    break;
                }
            }
            if (z == 1) {
                break;
            }
        }
    }
}
