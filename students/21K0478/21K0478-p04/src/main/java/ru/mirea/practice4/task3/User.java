package ru.mirea.practice4.task3;

public class User {
    public String login;
    public String password;
    public Basket purchased;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    boolean isAuth(String login, String password) {
        return this.login == login && this.password == password;
    }
}
