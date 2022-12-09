package mirea.practice.s21k0723.p401.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov Kirill", 22);
        Person person2 = new Person();
        Person person3 = new Person("Baturin Maxim", 19);
        person1.talk(person1.getFio());
        person2.talk(person2.getFio());
        person3.talk(person3.getFio());
    }
}