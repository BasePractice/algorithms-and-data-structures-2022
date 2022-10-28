package ru.mirea.practice.s21k0647.zad7;

public class Pupil {
    String name;
    int alt;

    Pupil(String name, int alt) {
        this.name = name;
        this.alt = alt;
    }

    public void allPupils(Pupil... pupils) {
        System.out.println("All Students: ");
        for (Pupil x: pupils) {
            System.out.println(x.name);
        }
    }

}
