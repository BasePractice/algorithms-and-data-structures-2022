package ru.mirea.practice.task3;

public class Person {
    private String fullName;
    private int age;

    public Person(){
        fullName = "Somebody";
        age = 0;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {
        System.out.println(this.fullName + " is talking.");
    }
    public void move(){
        System.out.println(this.fullName + " is moving.");
    }

    @Override
    public String toString() {
        return "Person " + this.fullName + " is " + this.age + " y.o.";
    }
}
