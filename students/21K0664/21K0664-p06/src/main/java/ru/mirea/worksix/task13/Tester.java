package ru.mirea.worksix.task13;

public abstract class Tester {
    public static void main(String[] args) {
        Str a = new Str();
        a.setV(b -> System.out.println(b.toString()));
        a.append("qwerty asdf ");
        a.insert(7, "zxcvb");
        a.replace(7, a.length(), "pop");
        a.reverse();
    }

}
