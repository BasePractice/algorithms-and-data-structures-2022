package ru.mirea.practice.Work_2;

public class Clothes {
    protected EnumAtelier clothing_size;
    protected double cost;
    protected String colour;
    Clothes(){}

    public Clothes(EnumAtelier clothing_size, double cost,String colour){
        this.clothing_size=clothing_size;
        this.colour=colour;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return "Clothing{" + "clothing size=" + clothing_size + ", cost=" + cost + ", colour=" + colour + '}';
    }
}
