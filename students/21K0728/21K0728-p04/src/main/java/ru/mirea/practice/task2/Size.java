package ru.mirea.practice.task2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Child size(euSize)";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euSize;
    Size(int euSize) {
        this.euSize = euSize;
    }

    public String getDescription() {
        return "Adult size(euSize): " + euSize;
    }
}
