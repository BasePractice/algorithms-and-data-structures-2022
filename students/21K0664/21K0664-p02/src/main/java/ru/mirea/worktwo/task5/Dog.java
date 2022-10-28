package ru.mirea.worktwo.task5;

class Dog {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getin() {
        return (this.age) * 7;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog's name is " + this.name + " and he is " + this.age + "years old. \nIf he will be a human he will be " + this.age * 7;
    }

}