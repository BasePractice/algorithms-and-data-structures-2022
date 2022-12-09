package ru.mirea.practice.task2;

public abstract class Test {
    public static void main(String[] args) {

        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa(new SortingStudentsByGpa[]{new SortingStudentsByGpa(1.1),
            new SortingStudentsByGpa(2.5),
            new SortingStudentsByGpa(1.7),
            new SortingStudentsByGpa(1.3),
            new SortingStudentsByGpa(4.5),
            new SortingStudentsByGpa(1.05)});
        System.out.println("Было");
        sortingStudentsByGpa.print();
        sortingStudentsByGpa.quickSort(sortingStudentsByGpa.getMass(), 0, sortingStudentsByGpa.getMass().length - 1);
        System.out.println("Стало");
        sortingStudentsByGpa.print();
    }
}
