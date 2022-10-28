package ru.mirea.practice.s21k0647.formatstring.employeereport;

import java.util.Formatter;

public class Report {
    Employee a;

    public Report(Employee a) {
        this.a = a;
    }

    public Formatter generateReport() {
        try (Formatter formatter = new Formatter()) {
            return formatter.format("|%15s %15s| \n|%15s %15.2f|", "Name", a.fullname, "Salary", a.selary);
        }
    }
}
