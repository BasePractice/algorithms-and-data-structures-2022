package Practice2;

import java.lang.*;

class TestAuthor {
    public static void main (String[] args) {
        Author Fred = new Author("Fred", "fred@email.dot", 'M');
        System.out.println("Hahaha, LOL, so funny\n" + Fred);
    }
}

class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author: " +
                name +
                ", " + email +
                ", " + gender +
                '.';
    }
}