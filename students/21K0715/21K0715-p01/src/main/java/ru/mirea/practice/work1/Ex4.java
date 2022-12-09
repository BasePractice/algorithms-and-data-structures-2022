package ru.mirea.practice.work1;

public final class Ex4 {
    public static final int N = 11;

    private Ex4() {

    }

    public static void main(final String[] args) {
        System.out.println("1");
        for (int i = 2; i < N; i++) {
            System.out.println("1/" + i);
        }
    }
}
