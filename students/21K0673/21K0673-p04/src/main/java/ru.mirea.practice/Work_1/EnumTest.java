package ru.mirea.practice.Work_1;

public class EnumTest {
    Seasons seasons;

    public EnumTest(Seasons seasons){
        this.seasons=seasons;
    }
    public void method(){
        switch (seasons) {
            case SUMMER -> System.out.println("I love summer");
            case WINTER -> System.out.println("I love winter");
            case AUTUMN -> System.out.println("I love autumn");
            case SPRING -> System.out.println("I love spring");
        }
    }
    public static void main(String[] args) {
        String season = Seasons.SUMMER.toString ();
        System.out.println(season+"\n");
        Seasons.SUMMER.getDescription();
        EnumTest b = new EnumTest(Seasons.SUMMER);
        b.method();
        System.out.println("\n");
        for (Seasons a : Seasons.values()) {
            System.out.println(a.getDescription());
            System.out.println(a.getTemperature());
        }
    }
}
