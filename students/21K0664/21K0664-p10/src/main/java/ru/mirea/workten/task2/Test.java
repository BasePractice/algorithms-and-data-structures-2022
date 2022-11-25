package ru.mirea.workten.task2;

import java.util.ArrayList;

abstract class Test {
    public static void main(String[] args) {
        Student a = new Student("Ivan", "Ivanov", "programmist",3,2,201);
        Student b = new Student("Max", "Maxiomv", "yourist",1,11,199);
        Student c = new Student("Jack", "Jackson", "ingeneer",2,4,121);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(c);

        SortBygpa sorts = new SortBygpa();
        students.sort(sorts);

        for (Student h: students) {
            System.out.println(h);
        }

        SortByname sort = new SortByname();
        students.sort(sort);

        for (Student h: students) {
            System.out.println(h);
        }
    }
}
