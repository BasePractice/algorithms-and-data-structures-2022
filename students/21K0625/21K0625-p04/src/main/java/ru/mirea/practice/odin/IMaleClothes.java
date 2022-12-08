package ru.mirea.practice.odin;

public interface IMaleClothes {
    default void dressMale() {
        System.out.println("Одеваем мужчину");
    }
}
