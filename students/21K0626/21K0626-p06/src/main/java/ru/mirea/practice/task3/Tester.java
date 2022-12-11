package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Mars mars = new Mars("mars", 3374.9);
        Dog dog = new Dog("Bobik", 12.0, 1.0);
        Car car = new Car("Audi", 5000000.0);
        System.out.println(mars.getName());
        System.out.println(car.getName());
        System.out.println(dog.getName());
    }


}
