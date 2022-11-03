package ru.mirea.practice.s21K0688.task4;

public class Tester4 {
    private static final int N = 3;

    public static void main(String[] args) {
        Computer[] arr = new Computer[N];
        Shop.addComputer(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getName() + ", ");
        }
        System.out.println("\n");
        Shop.deleteComputer(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getName() + ", ");
        }
    }
}
