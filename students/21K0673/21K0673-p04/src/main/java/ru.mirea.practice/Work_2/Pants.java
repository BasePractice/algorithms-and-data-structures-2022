package Practice_4.Work_2;

public class Pants extends Clothes{
    InterfaceMenClothing menClothing;
    InterfaceWomenClothing womenClothing;
    public Pants(EnumAtelier clothing_size, double cost,String colour){
        this.clothing_size=clothing_size;
        this.colour=colour;
        this.cost=cost;
    }
}
