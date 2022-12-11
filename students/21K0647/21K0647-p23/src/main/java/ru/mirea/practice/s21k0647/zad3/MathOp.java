package ru.mirea.practice.s21k0647.zad3;

public abstract class MathOp extends Op {
    Op left;
    Op right;
    Variable vleft;
    Variable vright;

    public MathOp(Op left, Op right) {
        this.left = left;
        this.right = right;
    }

    public MathOp(Op left, Variable vright) {
        this.left = left;
        this.vright = vright;
    }

    public MathOp(Variable vleft, Variable vright) {
        this.vleft = vleft;
        this.vright = vright;
    }

    public MathOp(Variable vleft, Op right) {
        this.vleft = vleft;
        this.right = right;
    }

    @Override
    public abstract double getValue();

    public double evaluate(double v) {
        if (right == null) {
            right = vright.toConst(v);
        }
        if (left == null) {
            left = vleft.toConst(v);
        }
        if (left instanceof MathOp) {
            ((MathOp) left).evaluate(v);
        }
        if (right instanceof MathOp) {
            ((MathOp) right).evaluate(v);
        }
        return getValue();
    }
}
