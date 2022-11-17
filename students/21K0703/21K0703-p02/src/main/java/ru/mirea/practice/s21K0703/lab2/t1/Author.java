package ru.mirea.practice.s21K0703.lab2.t1;

public class Author {
    String name;
    String eMail;
    char gender;

    public Author(String name, String eMail, char gender) {
        this.name = name;
        this.eMail = eMail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "t1.Author{" +
                "name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", gender=" + gender +
                '}';
    }
}
