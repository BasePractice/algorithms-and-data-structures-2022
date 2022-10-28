package ru.mirea.practice.task7;

public abstract class Tester {
    public static void main(String[] args) {
        Learner[] learners = new Learner[]{new Student("Денис Давыдов", 19, "КВБО-03-21", 2),
            new Pupil("Даниил Войтовски", 14, 8)};
        for (Learner learner : learners) {
            System.out.println(learner.toString());
        }
    }
}
