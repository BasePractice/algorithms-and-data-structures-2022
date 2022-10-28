package ru.mirea.workfour.task2;

class Clothing implements MenClothing, WomenClothing {
    protected ClothSize clothSizes;
    protected int price;
    protected String color;


    Clothing(ClothSize clothSizes, int price, String color) {
        this.clothSizes = clothSizes;
        this.price = price;
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ClothSize getClothSize() {
        return clothSizes;
    }

    public int getPrice() {
        return price;
    }

    public void setClothSize(ClothSize clothSizes) {
        this.clothSizes = clothSizes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setClothSizes(ClothSize clothSizes) {
        this.clothSizes = clothSizes;
    }

    @Override
    public String toString() {
        return "clothSizes=" + clothSizes + ", price=" + price + ", color='" + color;
    }

    @Override
    public void dressMan() {
        System.out.println("Man is dressed");
    }

    @Override
    public void dressWoman() {
        System.out.println("Wiman is dressed");
    }
}
