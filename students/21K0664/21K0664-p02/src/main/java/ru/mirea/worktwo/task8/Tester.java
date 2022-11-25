package ru.mirea.worktwo.task8;

abstract class Tester {
    public static void main(String[] args) {
        String[] b = new String[3];
        b[0] = "qwerty";
        b[1] = "asdf";
        b[2] = "zxcvb";
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
        System.out.println("\n");

        Sort a = new Sort();
        a.sort(b, 3);
        a.print(b, 3);
    }
}
