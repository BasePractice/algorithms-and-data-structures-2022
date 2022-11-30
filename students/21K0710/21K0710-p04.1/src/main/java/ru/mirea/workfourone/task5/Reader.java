package ru.mirea.workfourone.task5;

public class Reader {
    private String name;
    private String ticket;
    private String faculty;
    private String birthday;
    private String number;

    public Reader(String name, String ticket, String faculty, String birthday, String number) {
        this.name = name;
        this.ticket = ticket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void takeBook(int n) {
        System.out.println(name + " взял(а) " + n + " книг(и)");
    }

    public void takeBook(String... books) {
        System.out.print(name + " взял(а) книгу(и): ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1]);
    }

    public void takeBook(Book... books) {
        System.out.print(name + " взял(а) книгу(и): ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].getName() + ", ");
        }
        System.out.println(books[books.length - 1].getName());
    }

    public void returnBook(int n) {
        System.out.println(name + " вернул(а) " + n + " книг(и)");
    }

    public void returnBook(String... books) {
        System.out.print(name + " вернул(а) книгу(и): ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1]);
    }

    public void returnBook(Book... books) {
        System.out.print(name + " вернул(а) книгу(и): ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].getName() + ", ");
        }
        System.out.println(books[books.length - 1].getName());
    }

    @Override
    public String toString() {
        return "Reader{" + "name='" + name + '\'' + ", ticket='" + ticket + '\'' + ", faculty='" + faculty + '\'' + ", birthday='"
                + birthday + '\'' + ", number='" + number + '\'' + '}';
    }
}
