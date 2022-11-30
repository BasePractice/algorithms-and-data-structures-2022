package ru.mirea.workeightteen.task6;

public abstract class Test {
    public static void main(String[] args) {
        ThrowsDemo a = new ThrowsDemo();
        try {
            a.getDetails(null);
            a.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
    }
}
