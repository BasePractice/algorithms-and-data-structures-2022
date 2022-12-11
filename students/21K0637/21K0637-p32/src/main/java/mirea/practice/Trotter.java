package mirea.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public abstract class Trotter {
    private static int[] p;
    private static char[] d;

    public static void main(String[] args) {
        listGeneration(3);

        permutation();
    }

    public static void permutation() {
        while (true) {
            print();
            int id = -1;
            for (int i = 0; i < p.length; i++) {
                if (isMovable(i) && (id == -1 || p[i] > p[id])) {
                    id = i;
                }
            }
            if (id == -1) {
                break;
            }
            for (int i = 0; i < p.length; i++) {
                if (p[i] > p[id]) {
                    reverse(d[i], i);
                }
            }
            swap(id);
        }
    }

    private static boolean isMovable(int idx) {
        if (idx == 0) {
            return d[idx] == 'r' && p[idx + 1] < p[idx];
        }
        if (idx == p.length - 1) {
            return d[idx] == 'l' && p[idx - 1] < p[idx];
        }
        if (d[idx] == 'r') {
            return p[idx + 1] < p[idx];
        } else {
            return p[idx - 1] < p[idx];
        }
    }

    private static void reverse(char direction, int idx) {
        d[idx] = direction == 'r' ? 'l' : 'r';
    }

    private static void swap(int id) {
        int tmp1 = p[id];
        char tmp2 = d[id];
        if (d[id] == 'r') {
            p[id] = p[id + 1];
            p[id + 1] = tmp1;

            d[id] = d[id + 1];
            d[id + 1] = tmp2;
        } else {
            p[id] = p[id - 1];
            p[id - 1] = tmp1;

            d[id] = d[id - 1];
            d[id - 1] = tmp2;
        }
    }

    private static void listGeneration(int n) {
        p = IntStream
            .range(1, n + 1)
            .map(number -> number++)
            .toArray();
        d = new char[n];
        Arrays.fill(d, 'l');
    }

    public static void print() {
        System.out.print(Arrays.toString(p) + "\t");
        System.out.print(Arrays.toString(d) + "\n");
    }
}
