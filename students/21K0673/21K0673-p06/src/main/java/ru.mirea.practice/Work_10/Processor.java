package Practice_6.Work_10;

public class Processor extends Computer{
    int core;
    int flow;
    double frequency;

    public Processor(EnumComputer company_name, double cost, int core, int flow, double frequency){
        this.company_name=company_name;
        this.cost=cost;
        this.core=core;
        this.flow=flow;
        this.frequency=frequency;
    }

    @Override
    public String toString() {
        return "Processor:{Amount of cores= "+core+"Amount of flows"+flow+"Frequency"+frequency+'}';
    }
}
