package ru.mirea.practice.task8;

public class Main {
    public static void main(String[] args) {
        String[] strings=new String[10];
        for (int i=0;i<strings.length;i++){
            strings[i]="*";
            for(int j=0;j<i;j++){
                strings[i]+="*";
            }
        }
        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+ " ");
        }
        System.out.println(" ");

        int lengthArray=strings.length;
        String temp;
        for(int i=0;i<lengthArray/2;i++){
            temp=strings[lengthArray-i-1];
            strings[lengthArray-i-1]=strings[i];
            strings[i]=temp;
        }
        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+ " ");
        }
        System.out.println(" ");

    }
}
