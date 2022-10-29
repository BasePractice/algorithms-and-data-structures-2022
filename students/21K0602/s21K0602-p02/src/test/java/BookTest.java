import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.practice.task7.Book;

class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("D", 22, "A");
    }

    @Test
    void getName() {
        Assertions.assertNotNull(book.getName());
        Assertions.assertEquals("D", book.getName());
        book.setName();
        Assertions.assertNull(book.getName());

    }

    @Test
    void getDate() {
        Assertions.assertEquals(22, book.getDate());
    }

    @Test
    void getAuthor() {
        Assertions.assertEquals("A", book.getAuthor());
    }

    @Test
    void compareTo() {

    }
}