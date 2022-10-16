package ru.mirea.practice.Work_5;

public class Dog {
    private double Age;
    private String Name;

    Dog(double Age, String Name)
    {
        this.Age = Age;
        this.Name = Name;
    }

    public double getAge()
    {
        return this.Age;
    }

    public double getInHuAge()
    {
        return (this.Age)*7;
    }

    public String getName()
    {
        return this.Name;
    }

    public void setAge(double Age)
    {
        this.Age=Age;
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }

    public void setAgeName(double Age, String Name)
    {
        this.Age=Age;
        this.Name=Name;
    }

    public String toString()
    {
        return "{"+ "Возраст = "+Age+", Кличка: "+Name+"}";
    }
}
