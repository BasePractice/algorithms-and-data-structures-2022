package ru.mirea.practice.s21k0709.task2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public VictorianChair() {
        //
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isStrength() {
        return true;
    }

    @Override
    public boolean isComfortable() {
        return false;
    }

    @Override
    public boolean isSiting() {
        return true;
    }
}
