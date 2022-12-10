package ru.mirea.practice.task1;

public abstract class TriangularSequence {
    public static String requrs(int numb) {
        int value = 0;
        int amount = 0;
        if (numb == 1) {
            return "1";
        } else {
            for (int i = 1; amount < numb; i++) {
                amount += i;
                value = i;
            }
            return requrs(--numb) + " " + value;
        }
    }

    public static void main(String[] args) {
        System.out.println(requrs(10));
    }
}
