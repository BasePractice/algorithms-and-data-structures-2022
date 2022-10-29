package ru.mirea.practice.s21k0647.zad2;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Kids size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    int euroSize(int euroSize){
        return euroSize;
    }

    Size(int euroSize) {
        euroSize(euroSize);
    }

    public String getDescription() {
        return "Size Clothes";
    }
}
