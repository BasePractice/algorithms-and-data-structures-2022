package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogNursery {
    private ArrayList<Dog> dogs;
    {
        dogs=new ArrayList<Dog>();
    }
    public void add(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of dogs to add");
        int DogCount=in.nextInt();
        for(int i=0;i<DogCount;i++){
            dogs.add(new Dog(in.nextInt(),in.next()));
        }
        in.close();
    }

    public void showDogs(){
        for (int i=0;i<dogs.size();i++){
            System.out.println(dogs.get(i).toString());
        }
    }
}
