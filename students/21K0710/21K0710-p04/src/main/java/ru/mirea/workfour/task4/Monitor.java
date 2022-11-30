package ru.mirea.workfour.task4;

public class Monitor {
    private int refreshRate;
    private String resolution;
    private double diagonal;
    private String name;

    public Monitor(int refreshRate, String resolution, double diagonal, String name) {
        this.refreshRate = refreshRate;
        this.resolution = resolution;
        this.diagonal = diagonal;
        this.name = name;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor{" + "refresh_rate=" + refreshRate + ", resolution='" + resolution + '\'' + ", diagonal=" + diagonal + ", name='"
                + name + '\'' + '}';
    }
}
