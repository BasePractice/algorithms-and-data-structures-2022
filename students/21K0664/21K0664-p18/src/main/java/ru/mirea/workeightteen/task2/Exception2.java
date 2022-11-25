package ru.mirea.workeightteen.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter an integer ");
            String intString = in.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Error");
            in.nextInt();
        } finally {
            in.close();
        }
    }
}
