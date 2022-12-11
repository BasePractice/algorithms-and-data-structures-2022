package ru.mirea.practice.task3;

abstract class Tester {
    public static void main(String[] args) {
        Animal anim = new Animal("Mary");
        Person pers = new Person("Vladimir Putin");
        Product prod = new Product("Coke");
        System.out.println(prod.getName());
        System.out.println(anim.getName());
        System.out.println(pers.getName());
    }
}
