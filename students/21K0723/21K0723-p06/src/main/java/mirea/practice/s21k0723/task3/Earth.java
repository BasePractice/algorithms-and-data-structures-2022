package mirea.practice.s21k0723.task3;

public class Earth implements Nameable {
    private double speed;
    private String name;
    private double g;

    public Earth(double speed, String name, double g) {
        this.speed = speed;
        this.name = name;
        this.g = g;
    }

    public Earth() {
        //
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Earth{"
                +
                "name='"
                + name + '\''
                +
                ", speed="
                + speed
                +
                ", g="
                + g
                +
                '}';
    }
}
