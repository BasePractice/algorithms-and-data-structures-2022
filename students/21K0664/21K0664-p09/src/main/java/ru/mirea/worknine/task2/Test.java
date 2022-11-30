package ru.mirea.worknine.task2;

import java.util.ArrayList;

abstract class Test {
    public static void main(String[] args) {
        Student a = new Student("asa", 57464, 77);
        Student b = new Student("jqj", 12433, 100);
        Student c = new Student("qqq", 76134, 21);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(c);

        System.out.println("До сортировки:");
        for (Student h: students) {
            System.out.println(h);
        }

        Sorting sorts = new Sorting();
        students.sort(sorts);

        System.out.println("\nПосле сортировки в порядке убывания:");
        for (Student h: students) {
            System.out.println(h);
        }

    }
}
