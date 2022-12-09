package ru.mirea.practice.task1;

public class WrongInnException extends Exception{
    WrongInnException(String message,WrongInnException ex) {super(message,ex);}

    WrongInnException(String message) {super(message);}
}
