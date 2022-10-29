package ru.mirea.practice.shells.work1;

public class Shell {
    public static void main(String[] args) {

        Double a = Double.valueOf(5.9);

        Double b = Double.parseDouble("1.3");

        Integer c = a.intValue();
        int d = c;

        Byte e = a.byteValue();
        byte f = e;

        Short g = a.shortValue();
        short h = g;

        Long i = a.longValue();
        long j = i;

        Float k = a.floatValue();
        float l = k;

        double n = a;

        System.out.println(a);

        String m = Double.toString(3.14);
    }
}
