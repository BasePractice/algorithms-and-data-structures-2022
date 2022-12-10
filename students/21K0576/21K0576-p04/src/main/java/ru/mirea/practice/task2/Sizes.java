package ru.mirea.practice.task2;

enum Sizes {
    XXS(32) {
        String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    Sizes(int s) {
        this.euroSize = s;
    }

    String getDescription() {
        return "Взрослый размер";
    }

    int euroSize;
}
