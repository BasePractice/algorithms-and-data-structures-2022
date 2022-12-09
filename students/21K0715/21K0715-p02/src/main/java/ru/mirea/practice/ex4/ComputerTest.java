package ru.mirea.practice.ex4;

final class ComputerTest {
    private ComputerTest() {

    }

    public static void main(final String[] args) {
        String name = "ENIAC";
        Computer c = new Computer(name);

        System.out.println("name: " + c.getName());
        System.out.println("string: " + c.toString());
    }
}