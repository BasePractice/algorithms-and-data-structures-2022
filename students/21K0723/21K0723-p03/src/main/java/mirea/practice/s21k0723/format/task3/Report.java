package mirea.practice.s21k0723.format.task3;

import java.util.Formatter;

public class Report {
    Employer employer;

    public Report(Employer employer) {
        this.employer = employer;
    }

    public Formatter generateReport() {
        try (Formatter formatter = new Formatter()) {
            return formatter.format("|%15s %15s| \n|%15s %15.2f|", "Name ", employer.fullName, "Salary ", employer.salary);
        }
    }
}
