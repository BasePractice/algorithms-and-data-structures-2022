package ru.mirea.workthree.task1;

abstract class Work1 {
    public static void main(String[] args) {
        //1.1
        Double a = 5.9;
        //1.2
        double b = Double.parseDouble("1.3");
        //1.3
        int c = a.intValue();
        byte e = a.byteValue();
        short g = a.shortValue();
        long i = a.longValue();
        float k = a.floatValue();
        double n = a;
        System.out.println(c + " " + i + " " + e + " " + " " + k + " " + g + " " + n + " " + a);
        //1.4
        System.out.println(a);
        //1.5
        String m = Double.toString(3.14);
        System.out.println(m + b);
    }
}