package ru.mirea.practice.task10;

public class Monitor {
    private final String resolution;
    private final int response;

    public Monitor(String resolution, int response) {
        this.resolution = resolution;
        this.response = response;
    }

    public String getResolution() {
        return resolution;
    }

    public int getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "Monitor{" + "resolution='" + resolution + '\'' + ", response=" + response + '}';
    }
}
