package ru.mirea.practice.Work_6;

public class Manager extends Employer{
    private String firstName;
    private String lastName;
    private double income;
    private double averageSum;
    Manager(){}
    Manager(String firstName,String lastName,double income,double averageSum){
        this.firstName=firstName;
        this.lastName=lastName;
        this.income=income;
        this.averageSum=averageSum;
    }
    public double getIncome(){
        return this.income+this.averageSum;
    }
}
