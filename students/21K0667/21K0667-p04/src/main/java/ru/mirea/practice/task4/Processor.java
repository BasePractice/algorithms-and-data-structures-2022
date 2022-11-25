package ru.mirea.practice.task4;

public class Processor {
    private int frequency;
    private int threads;
    private int cores;

    @Override
    public String toString() {
        return "Частота: " + frequency
                + ", Кол-вл потоков: " + threads
                + ", Кол-во ядер: " + cores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public Processor(int frequency, int threads, int cores) {
        this.frequency = frequency;
        this.threads = threads;
        this.cores = cores;
    }
}
