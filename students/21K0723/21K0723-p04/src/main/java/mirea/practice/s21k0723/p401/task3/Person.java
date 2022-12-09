package mirea.practice.s21k0723.p401.task3;

public class Person {
    int age;
    String fio;

    Person() {
        //
    }

    Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void move(String fio) {
        System.out.println("Человек: " + fio + " говорит!");
    }

    public void talk(String fio) {
        System.out.println("Человек: " + fio + " говорит!");
    }
}
