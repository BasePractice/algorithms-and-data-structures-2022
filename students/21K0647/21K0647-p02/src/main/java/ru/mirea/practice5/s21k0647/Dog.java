package ru.mirea.practice5.s21k0647;

public class Dog {
    String nickname;
    int alt;

    public Dog(String nickname, int alt) {
        this.nickname = nickname;
        this.alt = alt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int manAlt() {
        return alt * 7;
    }

    public String toString() {
        return "Name: " + nickname + "\tAlt: " + alt;
    }
}
