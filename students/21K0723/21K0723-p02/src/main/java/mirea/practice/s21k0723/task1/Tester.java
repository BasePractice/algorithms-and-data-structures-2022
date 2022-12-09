package mirea.practice.s21k0723.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Author author1 = new Author("Kirill", "shangaraev@mail.ru", 'm');
        System.out.println(author1);
        Author author2 = new Author();
        author2.setName("Alice");
        author2.setEmail("kirill@rambler.com");
        author2.setGender('m');
        System.out.println(author2);
    }
}