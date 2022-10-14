package ru.mirea.practice.task1;

public class Work1 {
    public static void main(String[] args) {
        //1.1
        Double a = Double.valueOf(5.9);
        //1.2
        Double b = Double.parseDouble("1.3");
        //1.3
        int c = a.intValue();
        int d = c;
        byte e = a.byteValue();
        byte f = e;
        short g = a.shortValue();
        short h = g;
        long i = a.longValue();
        long j = i;
        float k = a.floatValue();
        float l = k;
        double n = a;
        //1.4
        System.out.println(a);
        //1.5
        String m = Double.toString(3.14);
    }
}