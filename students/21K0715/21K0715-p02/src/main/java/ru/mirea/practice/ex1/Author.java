package ru.mirea.practice.ex1;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(final String name, final String email, final char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{"
                + "name='" + name + '\''
                + ", email='" + email + '\''
                + ", gender=" + gender
                + '}';
    }
}
