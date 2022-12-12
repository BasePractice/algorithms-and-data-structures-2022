package ru.mirea.practice.n7;

import java.util.Arrays;

abstract class BookTest {
    public static void main(String[] args) {

        Book knigga0 = new Book("Василий Петров", "Сборник задач по физике 7-9 класс", "Учебная литература", 343, 1968);
        Book knigga1 = new Book("Стэн Ли", "Человек-Паук: Выпуск 123", "Супергероика", 74, 2005);
        Book knigga2 = new Book("Уильям Шекспир", "Гамлет", "Трагедия", 128, 1600);
        Book knigga3 = new Book("Иосиф Сталин", "Мемуары", "Автобиография", 528, 1952);
        Book[] boki = {knigga0, knigga1, knigga2, knigga3};
        ShelfOfBooks polka = new ShelfOfBooks(boki);

        System.out.println(polka.eldest());
        System.out.println(polka + "\nОх какой бардак! Нужно поставить по возрасту.");
        polka.sort();
        System.out.println(polka + "\nВот так-то лучше B|");
    }

    static class Book {

        private String writer;
        private String name;
        private String genre;
        private int nop;
        private int year;

        public Book(String writer, String name, String genre, int nop, int year) {
            this.writer = writer;
            this.name = name;
            this.genre = genre;
            this.nop = nop;
            this.year = year;
        }

        public Book() {
            writer = "writer";
            this.name = "name";
            this.genre = "genre";
            this.nop = 1;
            this.year = -1;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getNop() {
            return nop;
        }

        public void setNop(int nop) {
            this.nop = nop;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "\nКнига: " + "Автор " + writer + ", Название '" + name + '\'' + ", Жанр " + genre
                    + ", Количество страниц " + nop + ", Год написания " + year;
        }
    }

    static class ShelfOfBooks {
        private Book[] books;

        public ShelfOfBooks(Book[] books) {
            this.books = books;
        }

        public Book[] getBooks() {
            return books;
        }

        public void setBooks(Book[] books) {
            this.books = books;
        }

        public Book[] eldest() {
            int count = 0;
            Book notBook = new Book();
            int maxAge = -32000;
            Book[] knigi = this.books.clone();
            if (knigi.length > 0) {
                for (int i = 0; i < knigi.length; i++) {
                    if (maxAge < knigi[i].year) {
                        count = 1;
                        maxAge = knigi[i].year;
                        for (int k = 0; k < i - 1; k++) {
                            knigi[k] = notBook;
                        }
                    } else if (maxAge > knigi[i].year) {
                        knigi[i] = notBook;
                    } else {
                        count += 1;
                    }
                }
                if (count > 0) {
                    Book[] returnBooks = new Book[count];
                    count = 0;
                    for (int i = 0; i < knigi.length; i++) {
                        if (!knigi[i].equals(notBook)) {
                            returnBooks[count] = knigi[i];
                            knigi[i] = notBook;
                            count += 1;
                            if (count == returnBooks.length) {
                                break;
                            }
                        }
                    }
                    return returnBooks;
                } else {
                    System.out.println("Ничего себе! Какие старые книги! Наша система не распознаёт настолько старые писания!");
                    knigi = new Book[1];
                    knigi[0] = notBook;
                    return knigi;
                }
            }
            System.out.println("Нет книг! Сортировать нечего!");
            knigi = new Book[1];
            knigi[0] = notBook;
            return knigi;
        }

        public void sort() {
            sortBook(books, 0, books.length - 1);
        }

        void sortBook(Book[] array, int left, int right) {
            if (right <= left) {
                return;
            }
            int mid = (left + right) / 2;
            sortBook(array, left, mid);
            sortBook(array, mid + 1, right);
            merge(array, left, mid, right);
        }

        void merge(Book[] array, int left, int mid, int right) {

            int lengthLeft = mid - left + 1;
            int lengthRight = right - mid;

            Book[] leftArray = new Book[lengthLeft];
            Book[] rightArray = new Book[lengthRight];

            for (int i = 0; i < lengthLeft; i++) {
                leftArray[i] = array[left + i];
            }
            for (int i = 0; i < lengthRight; i++) {
                rightArray[i] = array[mid + i + 1];
            }

            int leftIndex = 0;
            int rightIndex = 0;

            for (int i = left; i < right + 1; i++) {

                if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                    if (leftArray[leftIndex].year < rightArray[rightIndex].year) {
                        array[i] = leftArray[leftIndex];
                        leftIndex++;
                    } else {
                        array[i] = rightArray[rightIndex];
                        rightIndex++;
                    }
                } else if (leftIndex < lengthLeft) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else if (rightIndex < lengthRight) {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
        }

        @Override
        public String toString() {
            return "Книжная полка " + Arrays.toString(books);
        }


    }
}
