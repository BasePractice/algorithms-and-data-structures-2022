package ru.mirea.workfourone.task10;

public class Airplane extends Vehicle {

    Airplane() {
        super(250, 900);
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
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return " Airplane super.toString(";
    }
}
