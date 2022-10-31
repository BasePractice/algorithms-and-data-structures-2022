import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.practice.task1.Author;


public class TestAuthor {
    private Author author;

    @BeforeEach
    public void setUp() {
        author = new Author("name", "_@gmail.com", 'm');
    }

    @Test
    public void testName() {
        Assertions.assertEquals("name", author.getName());
    }

    @Test
    public void testEmail() {
        Assertions.assertEquals("_@gmail.com", author.getEmail());
    }

    @Test
    public void testGender() {
        Assertions.assertEquals('m', author.getGender());
    }

    @Test
    public void testNameNotNull() {
        Assertions.assertNotNull(author.getName());
    }

    @Test
    public void testEmailNotNull() {
        Assertions.assertNotNull(author.getEmail());
    }

    @Test
    public void testGenderNotNull() {
        Assertions.assertNotNull(author.getGender());
    }


}
