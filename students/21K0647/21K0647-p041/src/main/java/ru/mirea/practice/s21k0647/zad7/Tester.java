package ru.mirea.practice.s21k0647.zad7;



public final class Tester {
    private Tester() {

    }

    public static void allStudents(Pupil... pupils) {
        System.out.println("Students: ");
        for (Pupil x: pupils) {
            if (x instanceof Student) {
                System.out.println(x.name);
            }
        }
    }

    public static void allSchoolboy(Pupil... pupils) {
        System.out.println("Schoolboy: ");
        for (Pupil x: pupils) {
            if (x instanceof Schoolboy) {
                System.out.println(x.name);
            }
        }
    }

    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[2];

        pupils[0] = new Schoolboy("Petrov", 13, "7A");
        pupils[1] = new Student("Kobilev", 20, "KVBO-03-21");
        allStudents(pupils);
        allSchoolboy(pupils);


    }


}
