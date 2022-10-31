package ru.mirea.practice;

public class Main {

    public static void main(String[] args) throws Exception {
        Number1 num = new Number1();
        System.out.println("Print args");
        num.printArgs(args);
        System.out.println("Factorial");
        num.factocialFunction(2);
        System.out.println("massive initialisation");
        num.initMassive(10);
        System.out.println("min max");
        num.minMax(10);


    }
}
