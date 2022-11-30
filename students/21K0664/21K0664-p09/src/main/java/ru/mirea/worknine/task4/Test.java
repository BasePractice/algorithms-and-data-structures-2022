package ru.mirea.worknine.task4;

abstract class Test {
    public static void main(String[] args) {
        Student a = new Student("Ivan", 25, 99);
        Student b = new Student("Max", 15, 100);
        Student c = new Student("Anna", 24, 42);

        Tester arr = new Tester(3);
        arr.setStudent(a, 0);
        arr.setStudent(b, 1);
        arr.setStudent(c, 2);

        System.out.println(arr);
    }
}
