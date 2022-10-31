package ru.mirea.practice.task2;

public enum Sizes {
    XXS(32) {
        @Override
        public void getDescription() {
            super.getDescription();
            System.out.println("Baby size");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int eurosize;

    public void getDescription() {
        System.out.println("Grown Size");
    }

    Sizes(int eurosize) {
        this.eurosize = eurosize;
    }
}
