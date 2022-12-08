package ru.mirea.practice.WrapperClass;

public class Main {
    public static void main(String[] args) {
        Double a1 = Double.valueOf(43.65d);
        double a2 = Double.parseDouble("45.09");
        int someInt = a1.intValue();
        float someFloat = a1.floatValue();
        boolean someBool = Boolean.parseBoolean(String.valueOf(a1));
        char[] someChar = Double.toString(a1).toCharArray();
        byte someByte = a1.byteValue();//Byte.parseByte(String.valueOf(a1));
        long someLong = a1.longValue();
        short someShort = a1.shortValue();

        System.out.println(a1);

        String d = Double.toString(3.14);

    }
}
