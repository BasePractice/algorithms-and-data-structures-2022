package ru.mirea.workten.task3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student a = new Student("Ivan", "Ivanov", "programmist",3,2,201);
        Student b = new Student("Max", "Maxiomv", "yourist",1,11,199);
        Student c = new Student("Jack", "Jackson", "ingeneer",2,4,121);
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(a);
        students.add(b);
        students.add(c);

        Student a1 = new Student("Ilia", "None", "programmist",4,23,172);
        Student b1 = new Student("Kolya", "Korni", "yourist",4,91,98);
        Student c1 = new Student("Broke", "Privet", "ingeneer",4,14,12);

        ArrayList<Student> students1 = new ArrayList<Student>();

        students1.add(a1);
        students1.add(b1);
        students1.add(c1);

        ArrayList<Student> students3 = new ArrayList<Student>(students);
        students3.addAll(students1);

        for (Student h: students3) {
            System.out.println(h);
        }

    }
}
