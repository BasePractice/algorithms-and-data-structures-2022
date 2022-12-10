package ru.mirea.practice.dva;

public final class Test3 {
    private Test3() {}

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new Employee("Иванов Иван Иванович", 50000.0),
                                              new Employee("Петров Петр Петрович", 45000.0),
                                              new Employee("Сидоров Сидор Сидорович", 45000.0),
                                              new Employee("Зозуля Зоя Петровна", 35000.0),
                                              new Employee("Лукьянова Тамара Ивановна", 47000.0)};
        Report.generateReport(employees);
    }
}