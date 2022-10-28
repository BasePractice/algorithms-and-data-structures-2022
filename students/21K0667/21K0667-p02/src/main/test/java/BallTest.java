import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ru.mirea.practice.task2.Ball;

class BallTest {

    @Test
    void setX() {
        Ball test = new Ball();
        test.setX(2.5);
        assertEquals(2.5, test.getX());
    }

    @Test
    void setY() {
        Ball test = new Ball();
        test.setY(2.5);
        assertEquals(2.5, test.getY());
    }

    @Test
    void setXY() {
        Ball test = new Ball();
        test.setXY(2.5, 2.5);
        assertEquals(2.5, test.getY());
        assertEquals(2.5, test.getX());

    }

    @Test
    void move() {
        Ball test = new Ball(1, 1);
        test.move(1, 1);
        assertEquals(2, test.getX());
        assertEquals(2, test.getY());
    }

    @Test
    void testToString() {
        Ball test = new Ball(1, 1);
        assertEquals("Ball: X = 1.0, Y = 1.0", test.toString());
    }
}