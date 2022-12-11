package ru.mirea.practice.s21k0647.zad3;

public class Subtract extends MathOp {
    public Subtract(Op left, Op right) {
        super(left, right);
    }

    public Subtract(Op left, Variable vright) {
        super(left, vright);
    }

    public Subtract(Variable vleft, Variable vright) {
        super(vleft, vright);
    }

    public Subtract(Variable vleft, Op right) {
        super(vleft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
