package mirea.practice.s21k0723.p4.task4;

public final class Tester {
    private Tester() {
        //
    }
    public static void main(String[] args) {
        Computer computer = new Computer(Mark.Macbook, 55000,
                new Monitor(32, 244),
                new Memory(2048, 32, 24),
                new Proccecor(8, 2500, 143));
        System.out.println(computer);
    }
}