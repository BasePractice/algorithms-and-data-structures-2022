package ru.mirea.workfourone.task10;

public class Train extends Vehicle {

    Train() {
        super(1000, 80);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
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
        return "Train{" + "count=" + count + ", speed=" + speed + '}';
    }
}


