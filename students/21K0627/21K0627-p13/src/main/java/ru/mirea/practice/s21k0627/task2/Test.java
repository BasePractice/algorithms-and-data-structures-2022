package ru.mirea.practice.s21k0627.task2;

public abstract class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Kvashnina", "Daria", "Olegovna");
        System.out.println(person1.getFIO());
        Person person2 = new Person("Kvashnina", "Daria");
        System.out.println(person2.getFIO());
        Person person3 = new Person("Kvashnina");
        System.out.println(person3.getFIO());
    }
}
