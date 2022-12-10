package ru.mirea.practice.s21k0709.task2to3;

public abstract class Tester {
    public static void main(String[] args) {
        IteratorList<Integer> iteratorList = new IteratorList<>();
        iteratorList.add(1);
        iteratorList.add(3);
        iteratorList.add(5);
        iteratorList.add(7);
        for (Integer integer : iteratorList) {
            System.out.println(integer);
        }
        iteratorList.remove(5);
        for (Integer integer : iteratorList) {
            System.out.println(integer);
        }

        iteratorList.clear();

        System.out.println(iteratorList.size());
    }
}
