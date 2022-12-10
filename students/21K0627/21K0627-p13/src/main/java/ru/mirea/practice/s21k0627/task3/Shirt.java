package ru.mirea.practice.s21k0627.task3;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] arr = str.split(",");
        number = arr[0];
        name = arr[1];
        color = arr[2];
        size = arr[3];
    }

    @Override
    public String toString() {
        return "Shirt{"
                + "number: " + number
                + ", name: " + name
                + ", color: " + color
                + ", size: " + size + '}';
    }
}
