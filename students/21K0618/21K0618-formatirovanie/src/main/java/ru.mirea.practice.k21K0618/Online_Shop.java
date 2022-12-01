package Formarts;

import java.text.NumberFormat;
import java.util.Locale;

class Online_Shop {
    public static void main(String[] args) {

        Employee e1 = new Employee("Mark Rosov", new Converter(250, 1));
        Employee e2 = new Employee("Rita Bosova", new Converter(45000, 3));
        Employee e3 = new Employee("George Robertson", new Converter(300, 5));
        Employee e4 = new Employee("U Kan Chi", new Converter(10000, 4));
        Employee[] employees = {e1, e2, e3, e4};
        Report report = new Report(employees);
        System.out.println(report);
        report.generateReport();

    }
}

class Converter {

     private double value;
     private int valute;

    public static final String[] S = {"$", "€", "₽", "¥", "£"};
    //Первая 1 валюта доллар, вторая 2 евро, третья 3 рубли,
    //четвёртая 4 юани, пятая 5 фунты
    private static final double[] k = {1, 1.1, 1/65.0, 1/8.0, 1.2};
    //Коэфициент отношения каждой валюты к доллару сооветственно.
    //Данные выдуманные.

    public Converter(double v, int valute) {
        this.value = v;
        this.valute = valute;
    }

    public Converter() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getValute() {
        return valute;
    }

    public void setValute(int valute) {
        this.valute = valute;
    }

    public Converter toValute(int t) {
        return new Converter(this.value * ( k[this.valute - 1] / k[t-1]), t-1);
    }
    //С помощью входного значения t определяется, в какую валюту произойдёт конвертация
    //Номера валют указаны возле массива S.

    @Override
    public String toString() {
        return value +
                " " + S[valute - 1];
    }


}

class Employee {

     private String fullname;
     private Converter salary;

    public Employee(String fullname, Converter salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Converter getSalary() {
        return salary;
    }

    public void setSalary(Converter salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                fullname +
                ", salary is " + salary;
    }
}

class Report {

    private Employee[] e;

    public Report(Employee[] e) {
        this.e = e;
    }

    public Report() {
    }

    public Employee[] getE() {
        return e;
    }

    public void setE(Employee[] e) {
        this.e = e;
    }

    public void generateReport() {
        System.out.println("List of employees:");
        for (int i = 0; i < e.length; i++)
        {
            System.out.printf("%d. Employee: %20s, salary is %20.2f%s%n", i+1, e[i].getFullname(), e[i].getSalary().getValue(), Converter.S[e[i].getSalary().getValute()-1]);
            //System.out.println((i+1) + ". " + e[i].toString());
        }
    }

    @Override
    public String toString() {
        String s = "List of employees:\n";
        for (int i = 0; i < e.length; i++)
        {
            s += (i+1) + ". " + e[i].toString() + "\n";
        }
        return s;
    }
}