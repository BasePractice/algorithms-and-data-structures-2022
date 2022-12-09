package mirea.practice.s21k0723.p4.task4;

public class Monitor {
    float diagonal;
    int freq;

    Monitor(float diagonal, int freq) {
        this.diagonal = diagonal;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Diagonal\n"
                + this.diagonal
                + "\nFrequency: "
                + this.freq;
    }

}