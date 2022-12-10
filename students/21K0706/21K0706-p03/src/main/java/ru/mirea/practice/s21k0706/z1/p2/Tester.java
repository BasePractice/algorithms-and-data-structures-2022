package ru.mirea.practice.s21k0706.z1.p2;

public final class Tester {
    private Tester() {

    }

    public static String min(Circle[] c) {
        double k = 100000;
        Circle cmin = new Circle();
        for (Circle x: c) {
            if (x.r < k) {
                k = x.r;
                cmin = x;
            }
        }
        return cmin.toString();
    }

    public static String max(Circle[] c) {
        double k = -1;
        Circle cmax = new Circle();
        for (Circle x: c) {
            if (x.r > k) {
                k = x.r;
                cmax = x;
            }
        }
        return cmax.toString();
    }

    public static void sort(Circle[] c) {
        for (int i = 0; i < c.length; ++i) {
            for (int j = i + 1; j < c.length; ++j) {
                if (c[i].r > c[j].r) {
                    Circle x = c[i];
                    c[i] = c[j];
                    c[j] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Circle[] c = new Circle[n];
        for (int i = 0; i < n; i++) {
            Circle cc = new Circle();
            cc.x =  (int)(Math.random() * 100);
            cc.y =  (int)(Math.random() * 100);
            cc.r =  (int)(Math.random() * 100);
            c[i] = cc;
        }
        System.out.println("Circles:");
        for (Circle a: c) {
            System.out.println("x: " + a.x + "\ty: " + a.y + "\tradius: " + a.r);
        }

        System.out.println("\nMin circle: " + min(c));
        System.out.println("Max circle: " + max(c) + "\n");
        sort(c);
        System.out.println("Sorted circles");
        for (Circle x: c) {
            System.out.println(x.toString());
        }
    }
}
