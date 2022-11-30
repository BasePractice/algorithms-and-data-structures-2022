package ru.mirea.workfourone.task10;

public class Car extends Vehicle {

    Car() {
        super(7, 60);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    protected double price(double distance) {
        return distance * 0.5 * this.count;
    }

    @Override
    protected double time(double distance) {
        return distance / speed;
    }

    @Override
    public String toString() {
        return "Car{" + "count=" + count + ", speed=" + speed + '}';
    }
}
