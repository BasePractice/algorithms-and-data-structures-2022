package ru.mirea.practice4.task1;


public class EnumTest {
    Seasons seasons;

    public EnumTest(Seasons seasons) {
        this.seasons = seasons;
    }

    public void method() {
        switch (seasons) {
            case SUMMER: {
                System.out.println("I loved summer");
                break;
            }
            case WINTER: {
                System.out.println("I loved winter");
                break;
            }
            case AUTUMN: {
                System.out.println("I loved autumn");
                break;
            }
            case SPRING: {
                System.out.println("I loved spring");
                break;
            }
            default: {
                System.out.println(" ");
                break;
            }
        }
    }
}

