package ru.mirea.worksix.task12;

abstract class Test {
    public static void main(Strings[] args) {
        Strings str = new Strings();

        str.append("qwerty ");
        str.insert(6, "asdfg");
        System.out.println(str);
        str.undo();
        str.append("bvbv");
        System.out.println(str);

        str.reverse();
        System.out.println(str);
        str.undo();
        System.out.println(str);
    }
}

