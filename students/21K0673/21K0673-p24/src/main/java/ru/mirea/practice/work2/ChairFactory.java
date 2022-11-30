package ru.mirea.practice.work2;

public class ChairFactory implements AbstractChairFactory {
    private double age;

    ChairFactory(double age) {
        this.age = age;
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public Functionalchair createFunctionalchair() {
        return new Functionalchair();
    }
}
