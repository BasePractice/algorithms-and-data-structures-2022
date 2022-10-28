package ru.mirea.practice;

import java.util.Scanner;

public class Number1 {
    private int[] massive;
    private  double sum;
    private double average;



    public void InitMassive(int length){
        sum=0;
        massive=new int[length];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<length;i++){
            massive[i]=in.nextInt();
            sum+=massive[i];

        }
        average=sum/(double) length;
        System.out.println("Sum= "+sum+"\n"+"Average= "+average);

    }
    public void MinMax(int length){
        massive=new int[length];
        Scanner in=new Scanner(System.in);
        sum=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,i=0;
        while(i<length){
            massive[i]=in.nextInt();
            sum+=massive[i];
            if(min>massive[i]){
                min=massive[i];
            }
            if(max<massive[i]){
                max=massive[i];
            }
            i++;
        }
        System.out.println("Sum= "+ sum+"\n Max= "+max+"\n Min= "+min);
    }
    public  void PrintArgs(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }

    public void PrintHarmonicSeries(int n){
        for(int i=1;i<=n;i++){
            System.out.print("1/"+i+" ,");
        }
        System.out.println(" ");
    }

    public int Factocial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
            System.out.println(factorial);
        }
        return factorial;
    }
    }

