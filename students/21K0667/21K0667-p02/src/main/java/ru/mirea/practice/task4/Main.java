package ru.mirea.practice.task4;

abstract class Main {
    public static void main(String[] args) {
        Computer[] arr = new Computer[2];
        System.out.println("First add the computers:");
        Shop.addComputer(arr);
        Shop.searching(arr);
        Shop.deleteComputer(arr);
        Shop.show(arr);

    }

}