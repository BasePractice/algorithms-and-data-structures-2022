package ru.mirea.practice.n5;

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return " Собака " + "по кличке " + name + " прожила " + age + " полных лет";
    }
}
