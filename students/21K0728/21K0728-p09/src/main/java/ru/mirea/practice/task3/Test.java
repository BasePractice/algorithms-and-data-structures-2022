package ru.mirea.practice.task3;

import java.util.ArrayList;

abstract class Test {
    public static void main(String[] args) {

        Student a = new Student("Tony", 2235, 77);
        Student b = new Student("Anthony", 5641, 121);
        Student c = new Student("Chad", 6616, 43);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(a);
        students.add(b);
        students.add(c);

        Student a1 = new Student("Josh", 9357, 69);
        Student b1 = new Student("Lillian", 3225, 11);
        Student c1 = new Student("John", 1122, 83);

        ArrayList<Student> students1 = new ArrayList<Student>();

        students1.add(a1);
        students1.add(b1);
        students1.add(c1);

        ArrayList<Student> students3 = new ArrayList<Student>(students);
        students3.addAll(students1);

        for (Student w : students3) {
            System.out.println(w);
        }
    }
}
