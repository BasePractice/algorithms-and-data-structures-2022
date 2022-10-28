package ru.mirea.practice.shells.task1;

public class Task5 {
    public static void main(String[] args) {
        Double value = Double.valueOf(5.43);
        System.out.println(value);

        String s = "5.23";
        value = Double.parseDouble(s);
        System.out.println("String to double: " + value);

        System.out.println("Byte: " + value.byteValue());
        System.out.println("Integer: " + value.intValue());
        System.out.println("Short: " + value.shortValue());
        System.out.println("Float: " + value.floatValue());
        System.out.println("Long: " + value.longValue());

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
