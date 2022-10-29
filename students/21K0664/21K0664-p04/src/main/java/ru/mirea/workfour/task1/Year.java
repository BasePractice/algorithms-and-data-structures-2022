package ru.mirea.workfour.task1;

//Задание 4.1
public enum Year {
    WINTER(-15),
    AUTUMN(12),
    SUMMER(30) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    SPRING(12);

    private final int temp;
    private Year(int temp) {
        this.temp = temp;
    }

    public int setTemp() {
        return this.temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public static void allYear() {
        for (Year s : Year.values()) {
            System.out.println(s);
        }
    }
}