package ru.mirea.worksix.task10;

abstract class Test {
    public static void main(String[] args) {
        Computer a = new Computer(EnumComputer.DNS, 100000, new Processor(EnumComputer.Samsung, 9000, 9,
                6, 88), new Memory(EnumComputer.Samsung, 512, 15),
                new Monitor(EnumComputer.Apple, 27000, 24, 300));
        System.out.println(a);

    }
}
