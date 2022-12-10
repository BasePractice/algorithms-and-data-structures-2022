package ru.mirea.practice.s21k0706.p1;

public class Student {
    int num;
    String name;

    int gba;

    Student(int idnumber, String name) {
        this.num = idnumber;
        this.name = name;
    }

    public Student(int idnumber, String name, int gba) {
        this.num = idnumber;
        this.name = name;
        this.gba = gba;
    }

    public int getGba() {
        return gba;
    }

    public String toString() {
        return "ФИО\t" + name + "\tID: " + num + "\tGBA: " + gba;
    }

}
