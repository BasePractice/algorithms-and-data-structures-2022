package ru.mirea.practice1.s21k0647;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nE-mail: " + email + "\nGender: " + gender;
    }

}
