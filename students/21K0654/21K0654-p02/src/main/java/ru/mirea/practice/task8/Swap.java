package ru.mirea.practice.task8;

public final class Swap {
    private Swap() {
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < (arr.length) / 2; i++) {
            String s;
            s = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = s;
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
