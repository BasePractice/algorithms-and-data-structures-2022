package ru.mirea.practice._21K654._1;

public class Author {
    private String name;
    private String email;
    private char gender;
    Author(String n,String gm,char gn){
        this.name=n;this.gender=gn;this.email=gm;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name+" "+this.gender+" "+this.email;
    }
}
