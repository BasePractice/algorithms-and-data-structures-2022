package ru.mirea.practice.Ex8;

public class Main {
    public static void main(String[] args) {
        String[] someArray = new String[10];
        for (int i=0; i<someArray.length;i++) {
            someArray[i] = String.valueOf(i * i);
        }
        String tempString;
        for (int i=0; i<someArray.length/2;i++) {
            tempString = someArray[i];
            someArray[i] = someArray[someArray.length - 1 - i];
            someArray[someArray.length - 1 - i] = tempString;
        }

        for (String element: someArray) {
            System.out.println(element);
        }
    }
}
