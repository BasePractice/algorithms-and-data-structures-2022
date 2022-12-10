package ru.mirea.practice.s21k0647.punkt3;

import java.util.Date;

public class Student {
    int numbegroup;
    String name;
    String lastname;
    int kurs;
    int gba;
    Date dater;

    Student(int numbegroup, String name, String lastname, int kurs, Date dater) {
        this.name = name;
        this.lastname = lastname;
        this.kurs = kurs;
        this.numbegroup = numbegroup;
        this.dater = dater;
        this.dater.setYear(dater.getYear() - 1900);
        this.dater.setMonth(dater.getMonth() - 1);

    }

    public void setNumbegroup(int numbegroup) {
        this.numbegroup = numbegroup;
    }

    public int getNumbegroup() {
        return numbegroup;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getKurs() {
        return kurs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }


    public void setDater(Date dater) {
        this.dater = dater;
    }

    public Date getDater() {
        return dater;
    }


    @Override
    public String toString() {
        return "ФИО\t" + name  + " " + lastname + "\tГруппа: " + numbegroup + "\tКурс " + kurs + "\tДата рождения " + dater.toString();
    }

    public static void main(String[] args) {
        Student []students = new Student[2];
        students[0] = new Student(321, "Ivan", "Ivanov", 2, new Date(2003, 11, 05));
        students[1] = new Student(222, "Ivan", "Smirnov", 1, new Date(2004, 02, 13));
        for (Student x: students) {
            System.out.println(x);
        }
    }


}
