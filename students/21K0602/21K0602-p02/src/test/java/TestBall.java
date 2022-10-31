import org.junit.jupiter.api.*;
import ru.mirea.practice.task2.Ball;

public class TestBall {
    private Ball ball;

    @BeforeEach
    protected void setUp() {
        ball = new Ball();

    }

    @RepeatedTest(5)
    public void testSetXY() {
        double x = Math.random();
        double y = Math.random();
        ball.setX(x);
        ball.setY(y);

        Assertions.assertEquals(x, ball.getX());
        Assertions.assertEquals(y, ball.getY());
    }

    @AfterEach
    @Test
    public void testToString() {
        Assertions.assertNotNull(ball.toString());
    }


}
