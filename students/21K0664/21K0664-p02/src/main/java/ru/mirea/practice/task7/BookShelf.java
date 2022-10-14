package ru.mirea.practice.task7;

public class BookShelf {
    int amount;
    Book[]arr;

    BookShelf(int amount) {
        this.amount = amount;
        this.arr = new Book[amount];
    }

    BookShelf() {}

    public int getAmount() {
        return this.amount;
    }

    public Book[] getShelf() {
        return this.arr;
    }

    public int getFirstYear() {
        for (int i = 0; ;) {
            for (int j = 1; ;) {
                if (arr[i].getYear() > arr[j].getYear()) {
                    i = j;
                    if (j == amount - 1) {
                        return arr[i].getYear();
                    }
                } else {
                    if (j == amount - 1) {
                        return arr[i].getYear();
                    }
                    j++;
                }
            }
        }
    }

    public int getLastYear() {
        for (int i = 0; ; ) {
            for (int j = 1; ;) {
                if (arr[i].getYear() < arr[j].getYear()) {
                    i = j;
                    if (j == amount - 1) {
                        return arr[i].getYear();
                    }
                } else {
                    if (j == amount - 1) {
                        return arr[i].getYear();
                    }
                    j++;
                }
            }
        }
    }

    public void sort() {
        for (int i = 0; i < amount - 1;) {
            for (int j = 1; j < amount;) {
                if (arr[i].getYear() > arr[j].getYear()) {
                    Book c = arr[j];
                    arr[j] = arr[i];
                    arr[i] = c;
                } else {
                    j++;
                }
            }
            i++;
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setShelf(Book b,int number) {
        this.arr[number] = b;
    }

    public String toString() {
        for (int k = 0;k < this.amount; k++) {
            System.out.println(arr[k] + "\n");
        }
        return "";
    }
}