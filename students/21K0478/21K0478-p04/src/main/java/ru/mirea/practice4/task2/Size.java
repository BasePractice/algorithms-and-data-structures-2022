package ru.mirea.practice4.task2;

public enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);
    private final int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        if (this == XXS) {
            return "Это детский размер";
        } else {
            return "Это взрослый размер";
        }
    }
}
