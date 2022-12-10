package ru.mirea.practice.work1;

public class EnumTest {
    Seasons seasons;

    public EnumTest(Seasons seasons) {
        this.seasons = seasons;
    }

    public void method() {
        switch (seasons) {
            case SUMMER: {
                System.out.println("I love summer");
                break;
            }
            case WINTER: {
                System.out.println("I love winter");
                break;
            }
            case AUTUMN: {
                System.out.println("I love autumn");
                break;
            }
            case SPRING: {
                System.out.println("I love spring");
                break;
            }
            default: {
                System.out.println(" ");
                break;
            }
        }
    }
}
