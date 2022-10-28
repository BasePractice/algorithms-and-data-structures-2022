package ru.mirea.practice.task5;

public class Dog {
    private String Name;
    private int Age;

    public Dog(){
        Age=0;
        Name="None";
    }
    public Dog(int age,String name){
        Age=age;
        Name=name;
    }

    public static int DogtoHumanAge(int DogAge){
        return DogAge*7;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
