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
    public void TestName() {
        Assertions.assertEquals("name", author.getName());
    }

    @Test
    public void TestEmail() {
        Assertions.assertEquals("_@gmail.com", author.getEmail());
    }

    @Test
    public void TestGender() {
        Assertions.assertEquals('m', author.getGender());
    }

    @Test
    public void TestNameNotNull() {
        Assertions.assertNotNull(author.getName());
    }

    @Test
    public void TestEmailNotNull() {
        Assertions.assertNotNull(author.getEmail());
    }

    @Test
    public void TestGenderNotNull() {
        Assertions.assertNotNull(author.getGender());
    }


}
