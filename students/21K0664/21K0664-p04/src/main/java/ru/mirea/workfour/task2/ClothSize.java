package ru.mirea.workfour.task2;

//Задание 4.2
public enum ClothSize {
    XXS(32),
    XS(34),
    S(36) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    M(38),
    L(40);
    private final int euroSize;
    private ClothSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int euroSize() {
        return this.euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    public static void allSize() {
        for (ClothSize s : ClothSize.values()) {
            System.out.println(s);
        }
    }
}