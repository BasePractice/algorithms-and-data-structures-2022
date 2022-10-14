package ru.mirea.practice._21K654._7;

public class BookShelf {
    private final Book[] arr;
    private final int num;
    public BookShelf(Book[] arr){
        this.num=arr.length;
        this.arr=arr;
    }
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
    public  Book max(){
        int max=arr[0].getYear();
        int j=-1;
        for(int i=0;i<num;i++){
            if(arr[i].getYear()>=max){
                j=i;
            }
        }
        return arr[j];
    }
    public  void sortBooks(){

    }
}
