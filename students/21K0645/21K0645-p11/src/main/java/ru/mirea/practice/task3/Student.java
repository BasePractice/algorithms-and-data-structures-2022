package ru.mirea.practice.task3;

/* Доработайте класс Student предусмотрите поле для хранения даты
рождения, перепишите метод toString() таким образом, чтобы он разработайте
метод, возвращал строковое представление даты рождения по вводимому в
метод формату даты (например, короткий, средний и полный формат даты). */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {

    private final String name;
    private int course;
    private final Calendar birthDate;

    public Student(String name, int course, Calendar birthDate) {
        this.name = name;
        this.course = course;
        this.birthDate = birthDate;
    }

    public String getFormattedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(birthDate);
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ",  course=" + course
                + ",  birthDate=" + getFormattedDate()
                + '}';
    }
}
