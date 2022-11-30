package ru.mirea.practice.subchapter.task6;

public class Manager extends  Employer{
    private double averageSum;
    Manager(String fn,String ln, double i,double aS){
        super( fn, ln, i);
        this.averageSum=aS;
    }
    Manager(){}
    @Override
    public double getIncome(int i){
        if(i<25){
            return super.getIncome()+averageSum;
        }
        else return 12*super.getIncome()+averageSum;
    }
}
