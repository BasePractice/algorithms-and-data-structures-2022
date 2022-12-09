package ru.mirea.practice.s21k0647.punkt1;

public class Student {
    int numbegroup;
    String name;
    String lastname;
    int kurs;
    int gba;

    Student(int numbegroup, String name, String lastname, int kurs) {
        this.name = name;
        this.lastname = lastname;
        this.kurs = kurs;
        this.numbegroup = numbegroup;

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

    public Student(int idnumber, String name, int gba) {
        this.numbegroup = idnumber;
        this.name = name;
        this.gba = gba;
    }

    public int getGba() {
        return gba;
    }

    public String toString() {
        return "ФИО\t" + name + "\tID: " + numbegroup + "\tGBA: " + gba;
    }


}
