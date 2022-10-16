package Practice_3.Shells.Work_1;

public class Shell_1 {
    public static void main(String[] args) {
//1.1
        Double a = Double.valueOf(5.9);
//1.2
        Double b=Double.parseDouble("1.3");
//1.3
        Integer c = a.intValue();   //int преобразование
        int d = c;

        Byte e =a.byteValue();    //byte преобразование
        byte f=e;

        Short g=a.shortValue(); //short преобразование
        short h=g;

        Long i=a.longValue();   //long преобразование
        long j=i;

        Float k=a.floatValue(); //float преобразование
        float l=k;

        double n=a; //double преобразование

        //bool и char преобразования невозможны
//1.4
        System.out.println(a);
//1.5
        String m = Double.toString(3.14);
    }
}
