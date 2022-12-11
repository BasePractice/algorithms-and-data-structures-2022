package ru.mirea.practice.task1;

public class Author {
    private String name;
    private String mail;
    private char gender;

    public Author(String name, String mail, char gender) {
        this.mail = mail;
        this.name = name;
        this.gender = gender;

    }


    public String getName() {
        return name;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }

    public String getEmail() {
        return mail;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author: name - " + name + ", email - " + mail + ", gender - " + gender;
    }


}
