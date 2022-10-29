package ru.mirea.practice.shellclasses.task1;

public class ValueOf {
    public static void main(String[] args) {
        Double db = Double.valueOf("30.8");
        System.out.println(db);
        String s = " 123";
        db = Double.parseDouble(s);
        System.out.println(db);
        s = String.valueOf(db);
        Integer i = db.intValue();
        System.out.println(db);
        Float f = db.floatValue();
        System.out.println(db);
        Byte b = db.byteValue();
        System.out.println(db);
        Short sh = db.shortValue();
        System.out.println(db);
        Long l = db.longValue();
        System.out.println(db);
        String d = Double.toString(3.14);
        System.out.println(d);
        Double dob = 3.14;
        d = String.valueOf(dob);
        System.out.println(d);
    }
}
