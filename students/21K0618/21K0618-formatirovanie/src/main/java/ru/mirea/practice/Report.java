package ru.mirea.practice;

class Report {

    private Employee[] e;

    public Report(Employee[] e) {
        this.e = e;
    }


    public Employee[] getE() {
        return e;
    }

    public void setE(Employee[] e) {
        this.e = e;
    }

    public void generateReport() {
        System.out.println("List of employees:");
        for (int i = 0; i < e.length; i++) {
            System.out.printf("%d. Employee: %20s, salary is %20.2f%s%n", i + 1, e[i].getFullname(),
                    e[i].getSalary().getValue(), Converter.S[e[i].getSalary().getValute() - 1]);
            //System.out.println((i+1) + ". " + e[i].toString());
        }
    }

    @Override
    public String toString() {
        String s = "List of employees:\n";
        for (int i = 0; i < e.length; i++) {
            s += (i + 1) + ". " + e[i].toString() + "\n";
        }
        return s;
    }
}
