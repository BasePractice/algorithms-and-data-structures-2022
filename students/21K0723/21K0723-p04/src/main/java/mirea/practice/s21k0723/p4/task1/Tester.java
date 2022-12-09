package mirea.practice.s21k0723.p4.task1;

public abstract class Tester {
    public static void favouriteSeason(Season seas) {
        switch (seas) {
            case Winter:
                System.out.println("люблю зиму!");
                break;
            case Spring:
                System.out.println("люблю весну!");
                break;
            case Summer:
                System.out.println("люблю лето!");
                break;
            case Autumn:
                System.out.println("люблю осень!");
                break;
            default:
                System.out.println("люблю любое время года!");
                break;
        }
    }

    public static void main(String[] args) {
        Season season = Season.Summer;
        favouriteSeason(season);
        System.out.println(season);
        Season[] seasons = Season.values();
        for (Season s: seasons) {
            System.out.println(s.getInfo());
        }
    }
}