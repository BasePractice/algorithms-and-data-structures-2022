package ru.mirea.practice.task3;

import java.util.ArrayList;

public class Tester {

    private int CirclesCount;
    private final ArrayList<Circle> circles;
    public Tester(){
        CirclesCount=0;
        circles=new ArrayList<Circle>();
    }
    public void addCircle(Circle circle){
        CirclesCount++;
        circles.add(circle);

    }

    public void printCircles(){
        for(int i=0;i<circles.size();i++){
            System.out.println(i+" "+ circles.get(i).toString());
        }
    }
}
