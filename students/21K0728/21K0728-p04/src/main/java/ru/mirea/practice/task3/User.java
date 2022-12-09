package ru.mirea.practice.task3;

import java.util.Scanner;

public class User {
    private String log;
    private String pass;

    public User(String log, String pass) {
        this.log = log;
        this.pass = pass;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean checkUser(Scanner scanner) {
        System.out.print("Enter login: ");
        String userLogin = "";
        userLogin = scanner.next();
        System.out.print("Enter password: ");
        String userPassword = "";
        userPassword = scanner.next();
        if (pass.equals(userPassword) && log.equals(userLogin)) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }
}
