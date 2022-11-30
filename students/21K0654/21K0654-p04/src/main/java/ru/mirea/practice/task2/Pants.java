package ru.mirea.practice.task2;

public class Pants extends Clothes implements WomenClothing, MenClothing {
    Pants(Size size, int cost, String colour) {
        super(size, cost, colour);
    }

    public int getCost() {
        return this.cost;
    }

    public String getColour() {
        return this.colour;
    }


    @Override
    public void dressMan(Clothes[] arr) {
        System.out.println("This man is dressed with pants." + " Color: " + this.getColour() + " Cost: " + this.getCost() + " Size: " + this.size.getEuroSize() + this.size.getDescription());
    }

    @Override
    public void dressWoman(Clothes[] arr) {
        System.out.println("This woman is dressed with pants." + " Color: " + this.getColour() + " Cost: " + this.getCost() + " Size: " + this.size.getEuroSize() + this.size.getDescription());
    }
}
