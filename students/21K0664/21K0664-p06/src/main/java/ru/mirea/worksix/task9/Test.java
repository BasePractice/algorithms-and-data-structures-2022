package ru.mirea.worksix.task9;

abstract class Test {
    public static void main(String[] args) {
        Printable[] printable = new Book[2];
        printable[0] = new Book();
        printable[1] = new Book();
        int i = 0;
        while (i < 2) {
            printable[i].print();
            i++;
        }
    }
}
