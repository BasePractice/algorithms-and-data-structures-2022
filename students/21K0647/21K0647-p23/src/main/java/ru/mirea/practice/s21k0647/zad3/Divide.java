package ru.mirea.practice.s21k0647.zad3;

public class Divide extends MathOp {
    public Divide(Op left, Variable vright) {
        super(left, vright);
    }

    public Divide(Variable vleft, Variable vright) {
        super(vleft, vright);
    }

    public Divide(Variable vleft, Op right) {
        super(vleft, right);
    }

    public Divide(Op left, Op right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() / right.getValue();
    }
}
