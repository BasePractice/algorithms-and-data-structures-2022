package ru.mirea.workfourone.task10;

public class Ship extends Vehicle {

    Ship() {
        super(200, 50);
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
        return distance * 0.01 * this.count;
    }

    @Override
    protected double time(double distance) {
        return distance / speed;
    }

    @Override
    public String toString() {
        return "Ship{" + "count=" + count + ", speed=" + speed + '}';
    }
}

