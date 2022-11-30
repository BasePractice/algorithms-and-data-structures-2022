package ru.mirea.workfourone.task10;

public abstract class Vehicle {

    protected int count;
    protected int speed;


    Vehicle(int count, int speed) {
        this.speed = speed;
        this.count = count;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public int getCount() {
        return count;
    }

    protected abstract double price(double distance);

    protected abstract double time(double speed);

    @Override
    public String toString() {
        return "Vehicle{" + "count=" + count + ", speed=" + speed + '}';
    }
}
