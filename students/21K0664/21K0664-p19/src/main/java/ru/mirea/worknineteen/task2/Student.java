package ru.mirea.worknineteen.task2;

import java.util.List;

public class Student {
    private String name;
    private String surname;

    private int gpa;

    Student(String name, String surname, int gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void contain(List<Student> students, String searchName, String searchSurname) throws Exception {
        int i = 0;
        for (Student student : students) {
            if (student.getName().contains(searchName) & student.getSurname().contains(searchSurname)) {
                System.out.println("contain");
                i++;
            }
        }
        if (i == 0) {
            throw new StudentError("Error");
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", surname='" + surname;
    }
}
