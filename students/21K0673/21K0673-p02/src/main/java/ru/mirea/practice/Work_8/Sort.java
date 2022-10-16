package ru.mirea.practice.Work_8;

public class Sort {
    Sort(){}
    public String[] sort(String[]a,int Amount)
    {
        String buff;
        int i=0;
            for(int j=Amount-1;;j--){
                buff=a[i];
                a[i]=a[j];
                a[j]=buff;
                if(i==j){
                    break;
                }else if(Amount%10==0&i+1==j){
                    break;
                }
                i++;
            }
        return a;
    }
    public void print(String[]a,int Amount)
    {
        for(int i=0;i<Amount;i++){
            System.out.println(a[i]);
        }
    }
}
