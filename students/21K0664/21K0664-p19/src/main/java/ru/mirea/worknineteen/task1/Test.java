package ru.mirea.worknineteen.task1;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите ИНН: ");
            String n = in.next();
            Student a = new Student("qwerty", n);
            System.out.println(a);
        } catch (BadInn e) {
            System.out.println("Error");
            in.next();

        } finally {
            in.close();
        }
    }
}
