package com.mobarak.dsa.queue;

public class QueueTest {
    public static void intQueueWithArray(){
        Queue<Integer> queue = new QueueUsingArray<>(5);
        System.out.println("Before enqueue>>"+queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Before dequeue>>"+queue.peek());
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);

        System.out.println("Before dequeue>>"+queue.peek());
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());

        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());
        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());
        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());
        queue.printElements();
        queue.enqueue(8);
        queue.printElements();

    }

    public static void intQueueWithList(){
        Queue<Integer> queue = new QueueNode<>();
        System.out.println("Before enqueue>>"+queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Before dequeue>>"+queue.peek());
        queue.dequeue();
        queue.printElements();
        System.out.println("After dequeue>>"+queue.peek());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.printElements();

        System.out.println("Before dequeue>>"+queue.peek());
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());

        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());
        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());
        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>"+queue.peek());
        queue.printElements();
        queue.enqueue(8);
        queue.printElements();

    }

    public static void main(String[] args) {
        //intQueueWithArray();
        intQueueWithList();
    }
}
