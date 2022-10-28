package ru.mirea.practice.task5;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageToHuman() {
        return (this.age * 7);
    }

    @Override
    public String toString() {
        return "{'" + nickname + '\''
                + ", возраст " + age + "}";
    }
}
