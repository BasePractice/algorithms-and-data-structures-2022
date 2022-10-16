package ru.mirea.practice.Work_5;

import java.util.Arrays;

public class Reader {
    private String full_name;
    private int reader_ticket_number;
    private String faculty;
    private String date_birth;
    private String telephone_number;
    Reader(){}
    Reader(String full_name,int reader_ticket_number,String faculty,String date_birth,String telephone_number){
        this.full_name=full_name;
        this.reader_ticket_number=reader_ticket_number;
        this.faculty=faculty;
        this.date_birth=date_birth;
        this.telephone_number=telephone_number;
    }
    public void takeBook(int amount_of_books){
        System.out.println(this.full_name+" взял "+amount_of_books+" книги");
    }
    public void takeBook(String...book_titles){
        System.out.println(this.full_name+" взял книги: "+Arrays.toString(book_titles));
    }
    public void takeBook(Book...book_titles){
        System.out.println(this.full_name+" взял книги: "+Arrays.toString(book_titles));
    }
    public void returnBook(int amount_of_books){
        System.out.println(this.full_name+" вернул "+amount_of_books+" книги");
    }
    public void returnBook(String...book_titles){
        System.out.println(this.full_name+" взял книги: "+Arrays.toString(book_titles));
    }
    public void returnBook(Book...book_titles){
        System.out.println(this.full_name+" взял книги: "+Arrays.toString(book_titles));
    }
}
