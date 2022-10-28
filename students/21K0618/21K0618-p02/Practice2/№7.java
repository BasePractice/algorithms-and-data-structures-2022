package Practice2;

import java.util.Arrays;

class BookTest {
    public static void main(String[] args) {

        Book Knigga0 = new Book("Василий Петров", "Сборник задач по физике 7-9 класс", "Учебная литература", 343, 1968);
        Book Knigga1 = new Book("Стэн Ли", "Человек-Паук: Выпуск 123", "Супергероика", 74, 2005);
        Book Knigga2 = new Book("Уильям Шекспир", "Гамлет", "Трагедия", 128, 1600);
        Book Knigga3 = new Book("Иосиф Сталин", "Мемуары", "Автобиография", 528, 1952);
        Book[] Boki = {Knigga0, Knigga1, Knigga2, Knigga3};
        ShelfOfBooks Polka = new ShelfOfBooks(Boki);

        System.out.println(Polka.eldest());
        System.out.println(Polka + "\nОх какой бардак! Нужно поставить по возрасту.");
        Polka.sort();
        System.out.println(Polka + "\nВот так-то лучше B|");
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

        public Book() {}

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
            return "\nКнига: " +
                    "Автор " + writer +
                    ", Название '" + name + '\'' +
                    ", Жанр " + genre +
                    ", Количество страниц " + nop +
                    ", Год написания " + year;
        }
    }
    static class ShelfOfBooks {
        private Book[] Books;

        public ShelfOfBooks(Book[] books) {
            Books = books;
        }

        public ShelfOfBooks() {
        }

        public Book[] getBooks() {
            return Books;
        }

        public void setBooks(Book[] books) {
            Books = books;
        }

        public Book[] eldest() {
            int count = 0;
            Book Not_Book = new Book();
            int max_age = -32000;
            Book[] Knigi = this.Books.clone();
            if (Knigi.length > 0) {
                for (int i = 0; i < Knigi.length; i++) {
                    if (max_age < Knigi[i].year) {
                        count = 1;
                        max_age = Knigi[i].year;
                        for (int k = 0; k < i - 1; k++) {
                            Knigi[k] = Not_Book;
                        }
                    } else if (max_age > Knigi[i].year){
                        Knigi[i] = Not_Book;
                    }
                    else count += 1;
                }
                if (count > 0) {
                    Book[] ReturnBooks = new Book[count];
                    count = 0;
                    for (int i = 0; i < Knigi.length; i++) {
                        if (Knigi[i] != Not_Book) {
                            ReturnBooks[count] = Knigi[i];
                            Knigi[i] = Not_Book;
                            count += 1;
                            if (count == ReturnBooks.length) break;
                        }
                    }
                    return ReturnBooks;
                }
                else {
                    System.out.println("Ничего себе! Какие старые книги! Наша система не распознаёт настолько старые писания!");
                    Knigi = new Book[1];
                    Knigi[0] = Not_Book;
                    return Knigi;
                }
            }
            System.out.println("Нет книг! Сортировать нечего!");
            Knigi = new Book[1];
            Knigi[0] = Not_Book;
            return Knigi;
        }

        public void sort() {
            Sort_Book(Books, 0, Books.length-1);
        }
        void Sort_Book(Book[] array, int left, int right) {
            if (right <= left) return;
            int mid = (left+right)/2;
            Sort_Book(array, left, mid);
            Sort_Book(array, mid+1, right);
            merge(array, left, mid, right);
        }
        void merge(Book[] array, int left, int mid, int right) {

            int lengthLeft = mid - left + 1;
            int lengthRight = right - mid;

            Book[] leftArray = new Book [lengthLeft];
            Book[] rightArray = new Book [lengthRight];

            for (int i = 0; i < lengthLeft; i++)
                leftArray[i] = array[left+i];
            for (int i = 0; i < lengthRight; i++)
                rightArray[i] = array[mid+i+1];

            int leftIndex = 0;
            int rightIndex = 0;

            for (int i = left; i < right + 1; i++) {

                if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                    if (leftArray[leftIndex].year < rightArray[rightIndex].year) {
                        array[i] = leftArray[leftIndex];
                        leftIndex++;
                    }
                    else {
                        array[i] = rightArray[rightIndex];
                        rightIndex++;
                    }
                }
                else if (leftIndex < lengthLeft) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else if (rightIndex < lengthRight) {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
        }

        @Override
        public String toString() {
            return "Книжная полка " + Arrays.toString(Books);
        }


    }
}
