package ru.mirea.practice.task6;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        Employer employer1 = new Manager();
        List<Employer> employers = new ArrayList<>();
        employers.add(employer1);
        employers.add(new Employer("ps", "pps", 20));
        employers.add(new Manager("ps", "pps", 20, 30));


        for (Employer employer : employers) {
            System.out.println(employer.getIncome());
        }
    }

}
