package ru.mirea.practice.p01;

import java.util.Scanner;
public class punkt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int n = sc.nextInt();
        array = new int[n];
        int i = 0, maxi = -999999999, mini = 999999999;
        float a = 0;
        while(i < n){
            array[i] = sc.nextInt();
            a+=array[i];
            if(array[i] < mini){
                mini = array[i];
            }
            if(array[i] > maxi){
                maxi = array[i];
            }
            i++;
        }
        System.out.print("Sum: ");
        System.out.println(a);
        System.out.print("SR: ");
        System.out.println(a/n);
        int j = 0;
        float b = 0;
        do{
            b+=array[j];
            j++;
        }while(j < n);
        System.out.print("Sum: ");
        System.out.println(b);
        System.out.print("SR: ");
        System.out.println(b/n);
        System.out.print("Min: ");
        System.out.println(mini);
        System.out.print("Max: ");
        System.out.println(maxi);
    }
}