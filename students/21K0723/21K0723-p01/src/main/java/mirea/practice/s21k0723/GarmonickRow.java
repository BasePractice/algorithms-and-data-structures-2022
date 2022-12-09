package mirea.practice.s21k0723;

public abstract class GarmonickRow {
    public static void main(String[] args) {
        double summa = 0;
        for (int j = 1; j < 11; j++) {
            summa += 1.0 / j;
            System.out.print(j + ") Число гармонического ряда - ");
            System.out.println(summa);
        }
    }
}