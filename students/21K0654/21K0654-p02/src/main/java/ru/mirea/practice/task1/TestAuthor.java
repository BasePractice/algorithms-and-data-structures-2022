package ru.mirea.practice.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("zhigga","gog@mail.ru",'m');
        System.out.println(author.getEmail() + "   " + author.getName() + "   " + author.getGender());
        author.setEmail("gig@mail.ru");
        System.out.println(author.getEmail() + '\n' + author.toString());
    }
}
