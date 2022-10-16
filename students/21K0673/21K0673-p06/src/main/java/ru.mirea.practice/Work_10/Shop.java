package ru.mirea.practice.Work_10;

public class Shop implements Enter{
    private int Space =10;
    private Computer[] computer = new Computer[Space];
    private int Amount;

    Shop(int Amount)
    {
        if (Amount>10)
        {
            this.Amount = 10;
        }
        this.Amount = Amount;

        for(int i=0;i<Amount;i++)
        {
            computer[i].getExistence();
        }
    }

    Shop(){}

    public double getAmount()
    {
        return this.Amount;
    }

    public void setAmount(int Amount)
    {
        this.Amount=Amount;
    }

    public void addComputer(int a)
    {
        if((this.Amount+a)>10)
        {
            this.Amount=10;
        }
        this.Amount+=a;
    }

    public void delComputer(int a)
    {
        if((this.Amount-a)<0)
        {
            this.Amount=0;
        }
        this.Amount-=a;
    }

    public void findComputer(int a)
    {
        if(a<0 || a>10)
        {
            System.out.println("Error");
        }
        else if(!computer[a].getExistence())
        {
            System.out.println("Компьютера "+a+" нет в наличии");
        }
        System.out.println("Компьютер "+a+" есть на складе");
    }

    public String toString()
    {
        return "{"+ "В магазине: "+Amount+" компьютеров}";
    }
}
