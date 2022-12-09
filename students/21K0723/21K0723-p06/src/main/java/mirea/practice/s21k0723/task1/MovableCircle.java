package mirea.practice.s21k0723.task1;

public class MovableCircle implements Movable {
    private int r;
    private MovablePoint center;

    public MovableCircle(int r, int x, int y, int xs, int ys) {
        this.r = r;
        center = new MovablePoint(x, y, xs, ys);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }


    @Override
    public String toString() {
        return "MovableCircle{"
                +
                "radius="
                + r
                +
                ", center="
                + center
                +
                '}';
    }
}
