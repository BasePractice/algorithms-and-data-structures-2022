package ru.mirea.practice._21K654._7;

public class BookShelf {
    private  Book[] arr;
    private  int num=arr.length;
    public Book min(){
        int min=arr[0].getYear();
        int j=-1;
        for(int i=0;i<num;i++){
            if(arr[i].getYear()<=min){
                j=i;
            }
        }
        return arr[j];
    }
}
