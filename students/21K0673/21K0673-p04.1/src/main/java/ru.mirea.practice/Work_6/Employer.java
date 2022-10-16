package Practice_4_1.Work_6;

public class Employer{
    private String firstName;
    private String lastName;
    private double income;
    public double getIncome(){
        return this.income;
    }
    Employer(){}
    Employer(String firstName,String lastName,double income){
        this.firstName=firstName;
        this.lastName=lastName;
        this.income=income;
    }

    public static void main(String[] args) {
        Employer employer=new Manager();
        Employer[]a={
                new Employer("Михаил","Рогозин",1736),
                new Manager("Георгий","Кокунько",1736,3872)
        };
        a[0].getIncome();
        a[1].getIncome();
    }
}
