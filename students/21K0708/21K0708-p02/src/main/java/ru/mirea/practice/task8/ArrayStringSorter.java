package ru.mirea.practice.task8;

public abstract class ArrayStringSorter {
    public static void main(String[] args) {
        String[] arrayString = {"dfdw", "wdfcwqr", "efrwfdew", "wfcqwrcfq", "wdgvfwar"};
        for (int i = 0; i < arrayString.length / 2; i++) {
            String supportString = arrayString[i];
            arrayString[i] = arrayString[arrayString.length - i - 1];
            arrayString[arrayString.length - i - 1] = supportString;
        }
        for (String string: arrayString) {
            System.out.println(string);
        }
    }
}
