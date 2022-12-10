package ru.mirea.practice.task4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] arrStr = str.split(",");
        id = arrStr[0];
        name = arrStr[1];
        color = arrStr[2];
        size = arrStr[3];
    }

    @Override
    public String toString() {
        return "Shirts{"
                +
                "id='" + id + '\''
                +
                ", name='" + name + '\''
                +
                ", color='" + color + '\''
                +
                ", size='" + size + '\''
                +
                '}';
    }
    public static void main(String[] args) {
        String[] shirts = new String[]{
                "S001, Black Polo Shirt, Black, XL",
                "S002, Black Polo Shirt, Black, L",
                "S003, Blue Polo Shirt, Blue, XL",
                "S004, Blue Polo Shirt, Blue, M",
                "S005, Tan Polo Shirt, Tan, XL",
                "S006, Black T-Shirt, Black, XL",
                "S007, White T-Shirt, White, XL",
                "S008, White T-Shirt, White, L",
                "S009, Green T-Shirt, Green, S",
                "S010, Orange T-Shirt, Orange, S",
                "S011, Maroon Polo Shirt, Maroon, S"
        };
        Shirt[] shirts1 = new Shirt[shirts.length];
        int i = 0;
        while (i < shirts.length) {
            shirts1[i] = new Shirt(shirts[i]);
            System.out.println(shirts1[i].toString());
            i++;
        }

    }
}
