package ru.mirea.practice.task3to4;

abstract class Main {
    public static void main(String[] args) {
        new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5);
        new Add(new Subtract(new Multiply(new Variable("x"),
                new Variable("x")), new Multiply(new Const(2), new Variable("x"))),
                new Const(1)).evaluate(0);
        ExpressionParser parser = new ExpressionParser();
        parser.tripleexpressionparse("x *       ( y - 2 )   / z +        1", 1, 2, 3);
        String str = "1000000 * x * x * x * x * x / ( x - 1 )";
        parser.tripleexpressionparse(str, 0);
        parser.tripleexpressionparse(str, 1);
        parser.tripleexpressionparse(str, 2);
        parser.tripleexpressionparse(str, 3);
        parser.tripleexpressionparse(str, 4);
        parser.tripleexpressionparse(str, 5);
        parser.tripleexpressionparse(str, 6);
        parser.tripleexpressionparse(str, 7);
        parser.tripleexpressionparse(str, 8);
        parser.tripleexpressionparse(str, 9);
        parser.tripleexpressionparse(str, 10);
    }
}
