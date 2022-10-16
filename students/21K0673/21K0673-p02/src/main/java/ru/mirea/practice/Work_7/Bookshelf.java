package ru.mirea.practice.Work_7;

public class Bookshelf {
    int Amount;
    Book[]Arr;

    Bookshelf(int Amount)
    {
        this.Amount = Amount;
        this.Arr=new Book[Amount];
    }
    public int getAmount()
    {
        return this.Amount;
    }

    public Book[] getShelf()
    {
        return this.Arr;
    }
    public int getFirstYear()
    {
        int i = 0;
            for(int j=1;;){
                if(Arr[i].getYear()>Arr[j].getYear())
                {
                    i=j;
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                }else{
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                    j++;
                }
                i++;
            }
    }
    public int getLastYear()
    {
        int i = 0;
            for(int j=1;;){
                if(Arr[i].getYear()<Arr[j].getYear())
                {
                    i=j;
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                }else{
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                    j++;
                }
                i++;
            }
    }

    public void sort()
    {
        for(int i=0;i<Amount-1;){
            for(int j=1;j<Amount;){
                if(Arr[i].getYear()>Arr[j].getYear())
                {
                    Book c=Arr[j];
                    Arr[j]=Arr[i];
                    Arr[i]=c;
                }else{
                    j++;
                }
            }
            i++;
        }
    }

    public void setAmount(int Amount)
    {
        this.Amount=Amount;
    }
    public void setShelf(Book B,int Number)
    {
        this.Arr[Number]=B;
    }

    public String toString()
    {
        for(int k=0;k<this.Amount;k++){
            System.out.println(Arr[k]+"\n");
        }
        return "";
    }
}
