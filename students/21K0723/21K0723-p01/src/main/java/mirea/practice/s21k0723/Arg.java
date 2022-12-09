package mirea.practice.s21k0723;

public abstract class Arg {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println("аргумент = " + s);
        }
    }
}