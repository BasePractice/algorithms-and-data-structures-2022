package ru.mirea.practice.s21k0627.task3;

public abstract class Test {
    public static void main(String[] args) {
        String[] arrayStr = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T- Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Shirt[] shirts = new Shirt[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            shirts[i] = new Shirt(arrayStr[i]);
            System.out.println(shirts[i].toString());
        }
    }
}
