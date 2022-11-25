package ru.mirea.practice28.s21k0706;

public final class Change {
    private Change() {

    }

    public static void main(String[] args) {
        String[] a = {" Actions ", " speak ", " louder ", " than ", " words "};
        for (String i:a) {
            System.out.print(i);
        }
        System.out.println();
        int n = a.length;
        String ch;
        for (int i = 0; i < (n / 2); i++) {
            ch = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = ch;
        }
        for (String i:a) {
            System.out.print(i);
        }
    }
}
