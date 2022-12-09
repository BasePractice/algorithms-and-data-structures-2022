package mirea.practice.s21k0723;

public abstract class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        int summa = 0;
        for (int j = 0; j < array.length; j++) {
            array[j] = j;
            System.out.print(j);
            System.out.print(" ");
            summa += j;
        }
        System.out.println();
        System.out.println(summa / array.length);
    }

}
