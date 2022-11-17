package Practice3;

import java.util.Random;

public class P3_N3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = {random.nextInt(10, 99),random.nextInt(10, 99),random.nextInt(10, 99),random.nextInt(10, 99)};
        boolean p = true;
        System.out.print(a[0] + " ");
        for (int i = 1; i < 4; i++) {
            System.out.print(a[i] + " ");
            if (a[i] <= a[i-1]) p = false;
        }
        if (p) System.out.println("\nСтрого возрастающая последовательность");
        else System.out.println("\nНе cтрого возрастающая последовательность");
    }
}
