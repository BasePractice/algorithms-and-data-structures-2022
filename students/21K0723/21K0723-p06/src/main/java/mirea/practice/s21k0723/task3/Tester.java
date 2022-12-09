package mirea.practice.s21k0723.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Earth earth = new Earth(1674.365, " Земля ", 9.81);
        System.out.println(earth.getName());
    }
}