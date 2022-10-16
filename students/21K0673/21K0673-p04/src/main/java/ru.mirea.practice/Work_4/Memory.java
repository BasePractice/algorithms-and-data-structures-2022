package Practice_4.Work_4;

public class Memory extends Computer{
    double capacity;
    public Memory(EnumComputer company_name, double cost, double capacity){
        this.company_name=company_name;
        this.cost=cost;
        this.capacity=capacity;
    }
    @Override
    public String toString() {
        return "Memory:{Capacity= "+capacity+'}';
    }
}
