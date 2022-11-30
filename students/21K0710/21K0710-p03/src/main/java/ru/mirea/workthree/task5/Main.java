package ru.mirea.workthree.task5;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Double a = Double.valueOf("368.17798237984");
        Double.parseDouble("27.12646873254");
        System.out.println(a.byteValue());
        System.out.println(a.toString());
        System.out.println(a.doubleValue());
        System.out.println(a.floatValue());
        System.out.println(a.intValue());
        System.out.println(a.longValue());
        System.out.println(a.shortValue());
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
