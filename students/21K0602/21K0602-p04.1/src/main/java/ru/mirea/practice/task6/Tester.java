package ru.mirea.practice.task6;

public abstract class Tester {
    public static void main(String[] args) {
        Employer[] employers = {new Employer("Petr", "Grabo", 4500),
            new Manager("Jordan", "Kilgenon", 4500, 2000)};
        for (Employer employer : employers) {
            System.out.println(employer.getFirstName() + " " + employer.getLastName());
            System.out.println(employer.getIncome());
        }
    }
}
