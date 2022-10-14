package ru.mirea.practice._21K654._3;

import java.util.Scanner;

public class Tester {
    private Circle[] arr;
    private int size;
    public Tester(Circle[] arr){
        this.arr=arr;
        this.size= this.arr.length;
    }
    @Override
    public String toString(){
        String s="ToString: ";
        for(int i=0;i<size;i++){
            s+=this.arr[i].toString()+"; ";
        }
        return s;
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        Circle[] arr=new Circle[n];
        System.out.println("Проинициализируйте массив, задав координаты для центра каждой окружности:");
        for(int i=0;i< arr.length;i++){
            arr[i]=new Circle(sc.nextDouble(), sc.nextDouble());
            System.out.println(arr[i].toString());
        }
        Tester tester=new Tester(arr);
        System.out.println(tester.toString());

    }
}
