package ru.mirea.workseven.task78;

abstract class TestPrintable {
    public static void main(String[] args) {
        Printable[] a = new Printable[4];
        a[0] = new Books("qwe");
        a[1] = new Magazines("rty");
        a[2] = new Books("uio");
        a[3] = new Magazines("asd");
        for (int i = 0; i < 4; i++) {
            a[i].print();
        }
    }
}
