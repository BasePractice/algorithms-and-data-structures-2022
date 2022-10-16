package ru.mirea.practice.Work_2;

public class TShirt extends Clothes{
    InterfaceMenClothing menClothing;
    InterfaceWomenClothing womenClothing;
    public TShirt(EnumAtelier clothing_size, double cost,String colour){
        this.clothing_size=clothing_size;
        this.colour=colour;
        this.cost=cost;
    }
}
