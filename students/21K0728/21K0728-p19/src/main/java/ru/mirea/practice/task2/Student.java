package ru.mirea.practice.task2;

import java.util.Scanner;

public class Student {
    private final double gpa;
    private final int idNumber;
    private final String nm;

    public Student(double gpa, int idNumber, String nm) {
        this.gpa = gpa;
        this.idNumber = idNumber;
        this.nm = nm;
    }

    public static void findStudent(Student[] students) throws EmptyStringExc, StudentNotFoundExc {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nInput student's name for searching: ");
            String name = scan.nextLine();
            if ("".equals(name)) {
                throw new EmptyStringExc("You have input an empty string!");
            }
            boolean flag = false;
            for (Student student : students) {
                if (student.getNm().equals(name)) {
                    flag = true;
                    System.out.print(student);
                }
            }
            if (!flag) {
                throw new StudentNotFoundExc("Student not found");
            }
        }
    }

    public double getGpa() {
        return gpa;
    }

    public String getNm() {
        return nm;
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + ", idNumber=" + idNumber + ", name='" + nm + '}';
    }
}
