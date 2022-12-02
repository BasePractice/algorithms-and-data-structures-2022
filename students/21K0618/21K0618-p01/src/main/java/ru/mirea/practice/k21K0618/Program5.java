package ru.mirea.practice.k21K0618;

import java.util.Scanner;

public class Program5
{
    public static int fkt(int ch)
    {
        int f_Res = 1;
        for (int i = 1; i <= ch; i++)
        {
            f_Res *= i;
        }
        return f_Res;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите вычислить \nx = ");
        int x = sc.nextInt();
        System.out.println("x! = " + fkt(x));
    }
}
