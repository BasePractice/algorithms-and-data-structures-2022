package Practice_4.Work_2;

public class Skirt extends Clothes{
    InterfaceWomenClothing womenClothing;
    public Skirt(EnumAtelier clothing_size, double cost,String colour){
        this.clothing_size=clothing_size;
        this.colour=colour;
        this.cost=cost;
    }
}
