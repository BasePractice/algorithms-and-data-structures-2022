package ru.mirea.practice._21K654;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число");
        while(true){
            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0)
                    break;
                else System.out.println("Число должно быть >0");
            }
            else {
                System.out.println("Введите числовое значение");
                sc=new Scanner(System.in);
            }
        }
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
