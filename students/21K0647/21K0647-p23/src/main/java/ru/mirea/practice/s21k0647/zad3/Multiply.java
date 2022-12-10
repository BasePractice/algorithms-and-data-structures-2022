package ru.mirea.practice.s21k0647.zad3;

public class Multiply extends MathOp {
    public Multiply(Op left, Op right) {
        super(left, right);
    }

    public Multiply(Op left, Variable vright) {
        super(left, vright);
    }

    public Multiply(Variable vleft, Variable vright) {
        super(vleft, vright);
    }

    public Multiply(Variable vleft, Op right) {
        super(vleft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() * right.getValue();
    }
}
