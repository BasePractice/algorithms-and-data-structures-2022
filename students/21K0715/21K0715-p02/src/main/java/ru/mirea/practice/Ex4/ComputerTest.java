package ru.mirea.practice.Ex4;

class ComputerTest {
    public static void main(String[] args) {
        String name = "ENIAC";
        Computer c = new Computer(name);

        System.out.println("name: " + c.getName());
        System.out.println("string: " + c.toString());
    }
}