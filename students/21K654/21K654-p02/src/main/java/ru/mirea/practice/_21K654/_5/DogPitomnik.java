package ru.mirea.practice._21K654._5;

import java.util.Scanner;

public class DogPitomnik {
    private Dog[] dogs;
    public DogPitomnik(Dog[] k){
        this.dogs=k;
    }
    public void addDogs(Dog[] k){
        Dog[] newDogs=new Dog[this.dogs.length+k.length];
        int j=0;
        for (int i=0;i<newDogs.length;i++){
            if(i<this.dogs.length)
                newDogs[i]=dogs[i];
            else {
                newDogs[i] = k[j];
                j++;
            }
        }
        this.dogs=newDogs;
    }
    @Override
    public String toString(){
        String s="ToString: ";
        for(int i=0;i< this.dogs.length;i++){
            s+=this.dogs[i].toString()+"; ";
        }
        return s;

    }

    public static void main(String[] args) {
        Scanner sc;
        Dog[] dogs1=new Dog[2];
        Dog[] dogs2=new Dog[3];
        for (int i=0;i<dogs1.length;i++) {
            sc=new Scanner(System.in);
            dogs1[i]=new Dog(sc.nextLine(), sc.nextInt());
        }
        for (int i=0;i<dogs2.length;i++) {
            sc=new Scanner(System.in);
            dogs2[i]=new Dog(sc.nextLine(), sc.nextInt());
        }
        DogPitomnik dp=new DogPitomnik(dogs1);
        dp.addDogs(dogs1);
        System.out.println(dp.toString());
        dp.addDogs(dogs2);
        System.out.println(dp.toString());
    }
}
