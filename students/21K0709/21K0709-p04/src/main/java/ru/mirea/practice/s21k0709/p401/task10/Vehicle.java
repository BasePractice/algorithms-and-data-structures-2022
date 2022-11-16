package ru.mirea.practice.s21k0709.p401.task10;

public abstract class Vehicle {
    double height;
    double weight;
    double speed;
    double time;
    double cost;

    public Vehicle(double height, double weight, double speed, double time, double cost) {
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
        this.cost = cost;
    }

    public double cost(double distance) {
        return 0;
    }

    public double time(double distance) {
        return 0;
    }

}
