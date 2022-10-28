package ru.mirea.practice.s21k0647.zad6;

public final class Tester {

    private Tester() {

    }

    public static void main(String[] args) {
        Employer employer = new Manager("Ivan", "Ivanov", 100000, 15000);
        Employer[] employers = new Employer[3];
        employers[0] = employer;
        employers[1] = new Employer("Petrov", "Ivanov", 50000);
        employers[2] = new Manager("Kudrov", "Ivanov", 75321.003, 9999.999);
        System.out.println(employers[0].getIncome());
        System.out.println(employers[1].getIncome());
        System.out.println(employers[2].getIncome());
    }
}
