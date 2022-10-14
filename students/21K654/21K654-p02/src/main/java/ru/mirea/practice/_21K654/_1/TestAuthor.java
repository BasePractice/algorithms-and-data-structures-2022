package ru.mirea.practice._21K654._1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author=new Author("zhigga","gog@mail.ru",'m');
        System.out.println(author.getEmail()+"   "+author.getName()+"   "+author.getGender());
        author.setEmail("gig@mail.ru");
        System.out.println(author.getEmail()+'\n'+author.toString());
    }
}
