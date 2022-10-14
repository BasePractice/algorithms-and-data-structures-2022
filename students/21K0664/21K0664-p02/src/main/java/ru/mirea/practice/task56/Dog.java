package ru.mirea.practice.task56;

public class Dog {
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

    public String toString() {
        return "Task5.Dog's name is " + this.name + " and he is " + this.age + "years old. If he will be a human he will be " + this.age * 7;
    }

    public static class KennelDog {
        public static void main(String[] args) {
            Dog[] a = new Dog[10];
            Dog c = new Dog("Спайк", 5);
            System.out.println(c.toString());
            c.getin();
            a[0] = c;
            Dog[] b = new Dog[11];
            System.arraycopy(a, 0, b, 0, 10);
        }
    }
}