package Practice_4.Work_1;

public enum Seasons {
    SUMMER(18.96){
        public String getDescription(){
            return "Теплое время года";
        }
    },
    WINTER(-5.47){
        public String getDescription(){
            return "Холодное время года";
        }
    },
    AUTUMN(6.6){
        public String getDescription(){
            return "Холодное время года";
        }
    },
    SPRING(7.23){
        public String getDescription(){
            return "Холодное время года";
        }
    };
    private final double temperature;
    Seasons(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public abstract String getDescription();
}