package ru.mirea.worktwo.task5;

abstract class KennelDog {
    public static void main(String[] args) {
        Dog[] a = new Dog[10];
        Dog c = new Dog("спайк",6);
        System.out.println(c.toString());
        c.getin();
        a[0] = c;
        Dog[] b = new Dog[11];
        System.arraycopy(a, 0, b, 0, 10);
    }
}