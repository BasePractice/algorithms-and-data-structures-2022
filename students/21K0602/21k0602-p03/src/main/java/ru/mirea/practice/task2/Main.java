package ru.mirea.practice.task2;



public class Main {
    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };

        MyStack<Integer> s = new MyStack<Integer>();
        for (int key: keys) {
            s.push(key);
        }

       System.out.println( s.search(1));

        System.out.println("FrontMiddleBackQueue");
        FrontMiddleBackQueue<Integer> q=new FrontMiddleBackQueue<Integer>();

        q.pushFront(1);
        q.pushBack(2);
        q.pushMiddle(3);
       System.out.println( q.peekMiddle());
       System.out.println( q.popMiddle());

        System.out.println("Middle"+q.peekMiddle());

        while (!q.isEmpty()){
            System.out.println(q.popFront());
        }



    }
}
