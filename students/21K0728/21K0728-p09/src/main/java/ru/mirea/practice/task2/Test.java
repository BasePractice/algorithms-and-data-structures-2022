package ru.mirea.practice.task2;

import java.util.ArrayList;

abstract class Test {
    public static void main(String[] args) {
        Student a = new Student("Lisa", 142388, 125);
        Student b = new Student("Layne", 357753, 2);
        Student c = new Student("Chris", 283194, 254);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(c);

        System.out.println("Before sorting:");
        for (Student h: students) {
            System.out.println(h);
        }

        Sorting sorts = new Sorting();
        students.sort(sorts);

        System.out.println("\nAfter sorting:");
        for (Student h: students) {
            System.out.println(h);
        }

    }
}
