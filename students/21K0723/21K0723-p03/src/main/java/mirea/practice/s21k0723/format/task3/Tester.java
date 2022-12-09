package mirea.practice.s21k0723.format.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Employer employer = new Employer("Shangaraev Vova", 15300);
        Employer employer1 = new Employer("Ivanov Ivan", 10000);
        Employer[] mas = new Employer[2];
        mas[0] = employer;
        mas[1] = employer1;

        for (int j = 0; j < 2; ++j) {
            Report s = new Report(mas[j]);
            String repeated = "_".repeat(24);
            System.out.println(repeated);
            System.out.println(s.generateReport());
        }
    }
}