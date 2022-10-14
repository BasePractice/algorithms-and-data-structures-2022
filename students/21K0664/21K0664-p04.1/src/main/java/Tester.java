public class Tester {
    public static void main(String[] args) {
        Circle a = new Circle(1818);
        Rectangle b = new Rectangle(231,232);
        Square c = new Square(12);

        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(a.getType());
        System.out.println(a);

        System.out.println(b.getArea());
        System.out.println(b.getType());
        System.out.println(b.getPerimeter());
        System.out.println(b);

        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.getType());
        System.out.println(c);
    }
}