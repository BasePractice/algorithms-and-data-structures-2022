package ru.mirea.worknine.task3;

import java.util.ArrayList;

public class Contain {

    private int n;

    private ArrayList<Student> a;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Student> getA() {
        return a;
    }

    public void setA(ArrayList<Student> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        for (Student student : a) {
            System.out.print(student);
        }
        return " ";
    }

    Contain(int n) {
        this.n = n;
        this.a = new ArrayList<Student>(n);
    }

    public void set(Student k, int n) {
        this.a.set(n, k);
    }

    public static void main(String[] args) {

        Student a = new Student("Ivan", 2155, 60);
        Student b = new Student("Anna", 5241, 100);
        Student c = new Student("Max", 6712, 56);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(a);
        students.add(b);
        students.add(c);

        Student a1 = new Student("John", 9423, 92);
        Student b1 = new Student("Frank", 2314, 84);
        Student c1 = new Student("Phillip", 9954, 81);

        ArrayList<Student> students1 = new ArrayList<Student>();

        students1.add(a1);
        students1.add(b1);
        students1.add(c1);

        ArrayList<Student> students3 = new ArrayList<Student>(students);
        students3.addAll(students1);

        for (Student vv : students3) {
            System.out.println(vv);
        }
    }
}
