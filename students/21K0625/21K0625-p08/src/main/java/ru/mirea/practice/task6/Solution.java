package ru.mirea.practice.task6;

public final class Solution {
    private Solution() {}

    public static boolean recursion(int n, int i) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(18, 2));
    }
}
