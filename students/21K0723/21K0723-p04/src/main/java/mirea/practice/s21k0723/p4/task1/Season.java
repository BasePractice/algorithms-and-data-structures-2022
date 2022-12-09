package mirea.practice.s21k0723.p4.task1;

public enum Season {
    Winter(-32.7f, "Холодно и ветрено") {
        public String getDesription() {
            return "Холодное время года";
        }
    },
    Spring(9.6f, "Все цветет") {
        public String getDesription() {
            return "Теплое время года";
        }
    },
    Summer(22.4f, "Солнечно") {
        public String getDesription() {
            return "Самое жаркое время года";
        }
    },
    Autumn(4.3f, "Дождливо") {
        public String getDesription() {
            return "Дождливое время года";
        }
    },
    ;
    private final float seasontemp;
    private String description;

    Season(float seasontemp, String description) {
        this.seasontemp = seasontemp;
        this.description = description;
    }

    public String getInfo() {
        return name()
                + "\t"
                +  description
                + "\t"
                + seasontemp;
    }
}