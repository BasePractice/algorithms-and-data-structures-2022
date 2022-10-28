package ru.mirea.practice;

// 7. Написать программу, которая с помощью метода класса, вычисляет
//факториал числа (использовать управляющую конструкцию цикла), проверить
//работу метода.

import java.util.Scanner;

public final class Task5 {

    private Task5() {
    }

    static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public  static void main(String [] args) {
        System.out.println("Enter number: ");
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();
        }
        System.out.printf("Factorial of number %d : %s", number, factorial(number));
    }

    //      static int recursionFactorial(int number) {
    //        return (number > 1) ? recursionFactorial (number - 1) * number : 1;
    //    }
}
