package ru.mirea.practice;

abstract class ON3 {
    public static void main(String[] args) {
        Double a = 10.0;
        byte b = a.byteValue();
        short c = a.shortValue();
        int d = a.intValue();
        long e = a.longValue();
        float f = a.floatValue();
        double g = a.doubleValue();
        //boolean -
        char i = (char) a.doubleValue(); //Только так
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(i);
    }
}
