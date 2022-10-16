package ru.mirea.practice.Work_7;

public class Book {
    private String Author;
    private String Name;
    private int Year;

    Book(String Author, String Name, int Year)
    {
        this.Author = Author;
        this.Name = Name;
        this.Year = Year;
    }
    public String getAuthor()
    {
        return this.Author;
    }

    public String getName()
    {
        return this.Name;
    }

    public int getYear()
    {
        return this.Year;
    }

    public void setAuthor(String Author)
    {
        this.Author=Author;
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setYear(int Year)
    {
        this.Year=Year;
    }

    public String toString()
    {
        return "{Название: "+Name+", Автор: "+Author+", Год издания: "+Year+"}";
    }
}
