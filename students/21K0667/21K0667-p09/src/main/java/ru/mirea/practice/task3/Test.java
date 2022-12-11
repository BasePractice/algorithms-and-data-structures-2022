package ru.mirea.practice.task3;

public abstract class Test {
    public static void main(String[] args) {
        Student[] test = new Student[]{new Student(6.6),
            new Student(5.5),
            new Student(4.4),
            new Student(3.3)};
        Student.print(test);
        MergeSort.mergeSort(test, test.length);
        System.out.println();
        Student.print(test);
    }

}
