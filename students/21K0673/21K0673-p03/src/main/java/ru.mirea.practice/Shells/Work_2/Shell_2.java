package Practice_3.Shells.Work_2;

public class Shell_2 {
    public static void main(String[] args) {

        Boolean bo= Boolean.FALSE;

        Byte by= (byte) 0b10;

        Character ch= 'b';

        Double dou = 5.9;

        Float fl= (float) 6.7;

        Integer in = 2 ^ 60;

        Long lo = (long) (2 ^ 100);

        Short sh = (short) 2;

        by.byteValue();
        by.floatValue();
        by.intValue();
        by.longValue();
        by.doubleValue();
        by.shortValue();

        dou.byteValue();
        dou.floatValue();
        dou.intValue();
        dou.longValue();
        dou.doubleValue();
        dou.shortValue();

        fl.byteValue();
        fl.floatValue();
        fl.intValue();
        fl.longValue();
        fl.doubleValue();
        fl.shortValue();

        in.byteValue();
        in.floatValue();
        in.intValue();
        in.longValue();
        in.doubleValue();
        in.shortValue();

        lo.byteValue();
        lo.floatValue();
        lo.intValue();
        lo.longValue();
        lo.doubleValue();
        lo.shortValue();

        sh.byteValue();
        sh.floatValue();
        sh.intValue();
        sh.longValue();
        sh.doubleValue();
        sh.shortValue();

        Boolean.parseBoolean("true");
        Byte.parseByte("0b0111_1111",1);
        Double.parseDouble("5.7");
        Float.parseFloat("4.9");
        Integer.parseInt("2^59",1);
        Long.parseLong("2^99",1);
        Short.parseShort("10",1);

        Byte.valueOf("0B1000_0000",2);
        Integer.valueOf("2^58",2);
        Long.valueOf("2^98",2);
        Short.valueOf("9",2);

        Boolean.toString(false);
        Byte.toString((byte) 4);
        Character.toString('g');
        Double.toString(4.7);
        Float.toString((float) 7.9);
        Integer.toString(2^57,3);
        Long.toString(2^97,3);
        Short.toString((short) 8);
    }
}
