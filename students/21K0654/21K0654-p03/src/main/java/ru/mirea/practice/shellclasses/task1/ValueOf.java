package ru.mirea.practice.shellclasses.task1;

public final class ValueOf {
    private ValueOf() {
    }

    public static void main(String[] args) {
        Double db = Double.valueOf("30.8");
        System.out.println(db);
        String s = " 123";
        db = Double.parseDouble(s);
        System.out.println(s + " " + db);
        s = String.valueOf(db);
        Integer i = db.intValue();
        System.out.println(i + " " + db);
        Float f = db.floatValue();
        System.out.println(f + " " + db);
        Byte b = db.byteValue();
        System.out.println(b + " " + db);
        Short sh = db.shortValue();
        System.out.println(sh + " " + db);
        Long l = db.longValue();
        System.out.println(l + " " + db);
        String d = Double.toString(3.14);
        System.out.println(d);
        Double dob = 3.14;
        d = String.valueOf(dob);
        System.out.println(d);
    }
}
