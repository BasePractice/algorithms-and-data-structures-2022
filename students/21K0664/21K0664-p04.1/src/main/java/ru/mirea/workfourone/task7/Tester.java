package ru.mirea.workfourone.task7;

abstract class Tester {
    public static void main(String[] args) {
        Pupil[] pupil = new Pupil[2];
        pupil[0] = new SchoolPupil("Ivan", 12);
        pupil[1] = new Student("Max", 21, 2);
    }
}
