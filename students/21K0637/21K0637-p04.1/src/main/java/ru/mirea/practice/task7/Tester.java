package ru.mirea.practice.task7;

public abstract class Tester {
    public static void main(String[] args) {
        Pupil[] pupils = {new Student("Ivan", "Ivanov", 19, 2),
            new Schoolchild("Maxim", "Karpov", 16, 10)};

        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }
}
