package ru.mirea.practice.s21k0647.zad3;

public class Add extends MathOp {
    public Add(Op left, Op right) {
        super(left, right);
    }

    public Add(Op left, Variable vright) {
        super(left, vright);
    }

    public Add(Variable vleft, Variable vright) {
        super(vleft, vright);
    }

    public Add(Variable vleft, Op right) {
        super(vleft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }
}
