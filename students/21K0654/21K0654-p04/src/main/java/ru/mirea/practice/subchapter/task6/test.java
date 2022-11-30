package ru.mirea.practice.subchapter.task6;

import java.util.Scanner;

public class test {
    public static Scanner sc=new Scanner(System.in);
    public  static  void  main(String[]args) {
        Employer e = new Employer();
        Employer m = new Manager();
        Employer[] arr = new Employer[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            if (i<2){
                arr[i]=new Manager("q","w",30,12);
            }
            else arr[i]=new Employer("a","s",30);
        }
        for (Employer E:arr) {
            System.out.println(E.getIncome(30));
        }
    }
}
