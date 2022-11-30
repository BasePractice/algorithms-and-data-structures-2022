package ru.mirea.practice.task5;

public class Reader {
    private final String fio;
    private final int readerNumber;
    private final String faculty;
    private final String birthDate;
    private final String number;

    public Reader(String fio, String faculty, String birthDate) {
        this.fio = fio;
        this.faculty = faculty;
        this.birthDate = birthDate;
        readerNumber = RandomGenerator.random(1000000, 999999);
        number = RandomGenerator.phoneNumber();
    }

    public String getNumber() {
        return number;
    }

    public String getFio() {
        return fio;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String takeBook(int bookCount) {
        return fio + "взял" + bookCount;
    }

    public String takeBook(String... books) {
        StringBuilder builder = new StringBuilder();
        builder.append(fio);
        builder.append(" взял ");
        for (String book : books) {
            builder.append(book);
            builder.append(" ");
        }
        return builder.toString();
    }

    public String takeBook(Book... books) {
        StringBuilder builder = new StringBuilder();
        builder.append(fio);
        builder.append(" взял: ");
        for (Book book : books) {
            builder.append(book.getName());
            builder.append(", ");
        }
        builder.replace(builder.length() - 2, builder.length() - 1, ".");
        return builder.toString();
    }

    public String returnBook(int bookCount) {
        return fio + " вернул " + bookCount;
    }

    public String returnBook(String... books) {
        StringBuilder builder = new StringBuilder();
        builder.append(fio);
        builder.append(" вернул ");
        for (String book : books) {
            builder.append(book);
            builder.append(", ");
        }
        builder.replace(builder.length() - 2, builder.length() - 1, ".");
        return builder.toString();
    }

    public String returnBook(Book... books) {
        StringBuilder builder = new StringBuilder();
        builder.append(fio);
        builder.append(" вернул: ");
        for (Book book : books) {
            builder.append(book.getName());
            builder.append(", ");
        }
        builder.replace(builder.length() - 2, builder.length() - 1, ".");
        return builder.toString();
    }
}
