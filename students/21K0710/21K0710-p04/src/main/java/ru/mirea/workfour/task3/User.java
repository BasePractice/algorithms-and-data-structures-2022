package ru.mirea.workfour.task3;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean userAuthorize(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Успешная авторищация");
            return true;
        } else {
            System.out.println("Введены неверные данные");
        }
        return false;
    }
}
