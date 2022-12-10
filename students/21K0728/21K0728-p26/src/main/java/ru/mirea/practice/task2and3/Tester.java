package ru.mirea.practice.task2and3;

public abstract class Tester {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        try {
            list.add(10);
            list.add(13);
            list.add(10);
            list.add(45);
            list.add(12);
            list.print();
            System.out.println("next() for 4th element of list: " + list.iterator(4).next());
            list.remove(10);
            System.out.println("------------------------------------------------------------------");
            list.print();
        } catch (RuntimeException exc) {
            System.err.print(exc);
        }
    }
}
