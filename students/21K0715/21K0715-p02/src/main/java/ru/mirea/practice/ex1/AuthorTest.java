package ru.mirea.practice.ex1;

final class AuthorTest {
    private AuthorTest() {

    }

    public static void main(final String[] args) {

        String name = "Pushkin A.S.";
        String email = "pushkin.a.s@yandex.ru";
        char gender = 'm';
        Author author = new Author(name, email, gender);

        System.out.println("name: " + author.getName());
        System.out.println("email: " + author.getEmail());

        author.setEmail("pushkin.a.s@gmail.com");
        System.out.println("new email: " + author.getEmail());

        System.out.println("gender: " + author.getGender());
        System.out.println("string: " + author.toString());
    }

}
