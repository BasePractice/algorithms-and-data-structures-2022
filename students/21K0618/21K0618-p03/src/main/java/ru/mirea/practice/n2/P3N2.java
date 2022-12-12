package ru.mirea.practice.n2;

abstract class P3N2 {
    public static void main(String[] args) {

        Point p = new Point(Math.random() * 10, Math.random() * 10);

        Circle krug = new Circle(p, Math.random() * (10 - 1) + 1);

        Circle shar = new Circle(new Point(666, 667), Math.random() * (10 - 1) + 1);

        Circle okrug = new Circle(new Point(766, 767), Math.random() * (10 - 1) + 1);

        Circle sphera = new Circle(new Point(777, 777), Math.random() * (10 - 1) + 1);

        Circle[] krugi = new Circle[]{krug, shar, okrug, sphera};

        Tester test = new Tester(krugi);

        System.out.println("Координаты точки p: " + p);
        System.out.println("Размер массива Krugi: " + test.getL());
        System.out.println("Массив Krugi: " + test);
        test.sort();
        System.out.println("Отсрортированный Массив Krugi: " + test);
        System.out.println("Max Circle in Krugi: " + test.maxC());
        System.out.println("Min Circle in Krugi: " + test.minC());
    }
}

