package ru.mirea.workeightteen.task8;

public abstract class Test {
    public static void main(String[] args) {
        ThrowsDemo a = new ThrowsDemo();
        try {
            a.getKey();
            a.printDetails(null);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
