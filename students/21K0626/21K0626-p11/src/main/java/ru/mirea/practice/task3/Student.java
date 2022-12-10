package ru.mirea.practice.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    public String name;
    public String surname;
    public String group;
    public Calendar birthDay;


    public Student(String name, String surname, String group, Calendar birthDay) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.birthDay = birthDay;
    }
    public String getDate() {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        return date.format(birthDay);
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "name='" + name + '\''
                +
                ", surname='" + surname + '\''
                +
                ", group='" + group + '\''
                +
                ", birthDay=" + getDate()
                +
                '}';
    }
}