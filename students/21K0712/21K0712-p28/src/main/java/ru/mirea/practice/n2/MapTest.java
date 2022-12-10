package ru.mirea.practice.n2;

abstract class MapTest {

    public static void main(String[] args) {
        Mapping<String, String> maping = new Mapping<>();
        System.out.println(maping.createMap());
        System.out.println(maping.getSameFirstNameCount());
        System.out.println(maping.getSameLastNameCount());
    }
}
