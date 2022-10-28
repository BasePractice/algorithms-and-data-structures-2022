package ru.mirea.workfourone.task7;

public class Student extends Learner {
    private String ticket;
    private String faculty;

    public Student(String name, String number, double averageMark, String ticket, String faculty) {
        super(name, number, averageMark);
        this.ticket = ticket;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "ticket='" + ticket + '\'' + ", faculty='" + faculty + '\'' + '}';
    }
}
