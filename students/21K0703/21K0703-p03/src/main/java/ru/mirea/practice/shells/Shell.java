package ru.mirea.practice.shells;

abstract class Shell {
    public static void main(String[] args) {
        Double a1 = Double.valueOf("5.2");
        System.out.println(a1);
        String s = "41.5";
        a1 = Double.parseDouble(s);
        System.out.println(a1);
        s = String.valueOf(a1);
        Integer i = a1.intValue();
        System.out.println(i);
        Float f = a1.floatValue();
        System.out.println(f);
        Byte b = a1.byteValue();
        System.out.println(b);
        Short sh = a1.shortValue();
        System.out.println(sh);
        Long l = a1.longValue();
        System.out.println(l);
        String d = Double.toString(3.14);
        System.out.println(d);
        Double dob = 3.14;
        d = String.valueOf(dob);
        System.out.println(d);
    }
}
