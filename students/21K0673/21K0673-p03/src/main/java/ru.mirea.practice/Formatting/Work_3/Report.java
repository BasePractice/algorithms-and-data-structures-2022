package ru.mirea.practice.Formatting.Work_3;

public class Report {
    Report(){}
    static public void generateReport(Employee[]a){
        for(int i=0;i<a.length;i++){
            System.out.printf("%24s %-1.2f %n", a[i].getfullname(), a[i].getsalary());
        }
    }
}
