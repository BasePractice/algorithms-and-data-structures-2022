package ru.mirea.practice;

public final class NumberReversed {
    private NumberReversed() {}
    //11

    public static int numberReversed(int num) {
        if (num % 10 == 0) {
            return num;
        }
        return num % 10 * (int) Math.pow(10, (int) Math.log10(num)) + numberReversed(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(numberReversed(1283454));
    }
}
