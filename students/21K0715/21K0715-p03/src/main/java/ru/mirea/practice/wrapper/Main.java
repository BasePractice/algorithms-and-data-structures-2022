package ru.mirea.practice.wrapper;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
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

        System.out.println(a2);
        System.out.println(someInt);
        System.out.println(someFloat);
        System.out.println(someBool);
        System.out.println(someChar);
        System.out.println(someByte);
        System.out.println(someLong);
        System.out.println(someShort);

        System.out.println(d);
    }
}
