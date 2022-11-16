package ru.mirea.practice.s21k0709.p401.task10;

public class Car extends Vehicle {

    public Car(double height, double weight, double speed, double time, double cost) {
        super(height, weight,speed, time, cost);
    }

    @Override
    public double cost(double distance) {
        return distance * cost;
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public String toString() {
        return "Car{"
                +
                "height=" + height
                +
                ", weight=" + weight
                +
                ", speed=" + speed
                +
                ", time=" + time
                +
                ", cost=" + cost
                +
                '}';
    }
}
