package ru.mirea.practice.task2;

import java.util.LinkedList;
import java.util.Queue;

public class FrontMiddleBackQueue<T> {
    private final Queue<T> queue1,queue2;


    public FrontMiddleBackQueue(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();


    }

    public void pushFront(T data){
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }
        queue1.add(data);
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    public void pushMiddle(T data){
        int size= Math.round(queue1.size()/2);

        while(!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }



        while(queue2.size()!=size){
            queue1.add(queue2.peek());
            queue2.poll();
        }
        queue1.add(data);
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }




    }

    public void pushBack(T data){
        queue1.add(data);
    }

    public T popFront(){
        if (queue1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        T front = queue1.peek();
        queue1.poll();

        return front;
    }

    public T popBack(){
        T back=null;
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
            if(queue1.size()==1){
                back= queue1.poll();
            }
        }

        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
        return back;
    }

    public T popMiddle(){
        int size=Math.round(queue1.size()/2);

        while(!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }

       T data = null;
        while(!queue2.isEmpty()){

            queue1.add(queue2.peek());
            queue2.poll();
            if(queue2.size()==size+1){
                data=queue2.poll();
            }
        }
        return  data;
    }

    public T peekMiddle(){
        int size=Math.round(queue1.size()/2);

        while(!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }

        T data = null;
        while(!queue2.isEmpty()){

            queue1.add(queue2.peek());
            queue2.poll();
            if(queue2.size()==size+1){
                data=queue2.peek();
            }
        }
        return  data;
    }
    public T peekFront(){
        if (queue1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        return queue1.peek();
    }


    public T peekBack(){
        T back=null;
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
            if (queue1.size()==1){
                back= queue1.peek();
            }
        }

        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
        return back;
    }




    public boolean isEmpty(){
        return queue1.isEmpty();
    }



}
