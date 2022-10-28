package ru.mirea.workthirteen.task2;

abstract class Test {
    public static void main(String[] args) {
        Person a = new Person("Ivan", "Ivanov", "Ivanovich", 20);
        System.out.println(a);
        a.print();
    }
}
