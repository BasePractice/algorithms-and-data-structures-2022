package mirea.practice.s21k0723.task2;

public class MovableRectangle implements Movable {
    private MovablePoint bottomRight;
    private MovablePoint topLeft;

    public MovableRectangle(int x1, int y1, int x2, int y2, int x1S, int y1S, int x2S, int y2S) {
        topLeft = new MovablePoint(x1, y1, x1S, y1S);
        bottomRight = new MovablePoint(x2, y2, x2S, y2S);
        equalsSpeed();
    }

    public void equalsSpeed() {
        if (bottomRight.xs != topLeft.xs) {
            bottomRight.xs = topLeft.xs;
        }
        if (bottomRight.ys != topLeft.ys) {
            bottomRight.ys = topLeft.ys;
        }
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }


    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
                +
                "topLeft="
                + topLeft
                +
                ", bottomRight="
                + bottomRight
                +
                '}';
    }
}
