package ru.mirea.practice.solutiontask1;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String emailinput) {
        this.email = emailinput;
    }

    @Override
    public String toString() {
        return "Имя автора: " + this.name + "\nПочта автора: " + this.email + "\nПол: " + this.gender;
    }
}
