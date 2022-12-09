package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Human human = new Human("Игорь Григорьевич", 54);
        Car car = new Car("Хюндайка Соната", 200);
        System.out.println(human.getName());
        System.out.println(car.getName());
    }
}
