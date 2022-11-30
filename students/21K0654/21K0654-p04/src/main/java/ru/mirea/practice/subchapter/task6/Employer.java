package ru.mirea.practice.subchapter.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;
    Employer(String fn,String ln, double i){this.firstName=fn;this.lastName=ln;this.income=i;}
    Employer(){};
    public double getIncome(){return income;}
    public double getIncome(int i){
        if(i<25){
        return income;
        }
        else return 12*income;
    }


}
