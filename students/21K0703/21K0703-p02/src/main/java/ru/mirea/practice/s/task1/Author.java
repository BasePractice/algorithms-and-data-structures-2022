package ru.mirea.practice.s.task1;

public class Author {
    private final String name;
    private final String email;
    private final String genger;

    public Author(String name, String email, String genger) {
        this.name = name;
        this.email = email;
        this.genger = genger;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGenger() {
        return genger;
    }

    @Override
    public String toString() {
        return name + " " + genger + " " + email;
    }
}
