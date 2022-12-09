package mirea.practice.s21k0723.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Ball obj1 = new Ball();
        Ball obj2 = new Ball(3.5, 1.7);
        System.out.println(obj1);
        System.out.println(obj2);
        obj1.setXY(45, 12);
        System.out.println(obj1);
    }
}
