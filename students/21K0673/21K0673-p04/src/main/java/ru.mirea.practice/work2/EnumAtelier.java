package ru.mirea.practice.work2;

public enum EnumAtelier {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34) {
        public String getDescription() {
            return "Взрослый размер";
        }
    }, S(36) {
        public String getDescription() {
            return "Взрослый размер";
        }
    }, M(38) {
        public String getDescription() {
            return "Взрослый размер";
        }
    }, L(40) {
        public String getDescription() {
            return "Взрослый размер";
        }
    };

    public abstract String getDescription();

    private final int euroSize;

    EnumAtelier(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }
}
