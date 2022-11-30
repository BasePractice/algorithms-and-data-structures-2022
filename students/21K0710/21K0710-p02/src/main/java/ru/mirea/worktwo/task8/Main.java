package ru.mirea.worktwo.task8;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < 5; i++) {
            String temp = array[i];
            array[i] = array[9 - i];
            array[9 - i] = temp;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
