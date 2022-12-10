package ru.mirea.practice.s21k0706.p6789;

public class Shop implements Printable {

    String name;
    String data;

    Shop(String name, String data) {
        this.name = name;
        this.data = data;
    }


    @Override
    public void print() {
        System.out.println("Журнал " + name + "\nДата выпуска " + data + "\n");
    }
}

