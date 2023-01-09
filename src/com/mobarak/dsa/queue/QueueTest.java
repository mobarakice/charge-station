package com.mobarak.dsa.queue;

public class QueueTest {
    public static void intQueueWithArray() {
        Queue<Integer> queue = new QueueUsingArray<>(5);
        System.out.println("Before enqueue>>" + queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Before dequeue>>" + queue.peek());
        queue.dequeue();
        System.out.println("After dequeue>>" + queue.peek());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);

        System.out.println("Before dequeue>>" + queue.peek());
        queue.dequeue();
        System.out.println("After dequeue>>" + queue.peek());

        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>" + queue.peek());
        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>" + queue.peek());
        queue.printElements();
        queue.dequeue();
        System.out.println("After dequeue>>" + queue.peek());
        queue.printElements();
        queue.enqueue(8);
        queue.printElements();

    }

    public static void intQueueWithList() {
        Queue<Integer> queue = new QueueUsingList<>(5);
        System.out.println("Before enqueue>>" + queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printElements();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printElements();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printElements();
        queue.enqueue(6);
        queue.printElements();

//        System.out.println("Before dequeue>>"+queue.peek());
//        queue.dequeue();
//        queue.printElements();
//        System.out.println("After dequeue>>"+queue.peek());
//
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(8);
//        queue.printElements();
//
//        System.out.println("Before dequeue>>"+queue.peek());
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//
//        queue.printElements();
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//        queue.printElements();
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//        queue.printElements();
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//        queue.printElements();
//        queue.enqueue(8);
//        queue.printElements();

    }

    public static void intQueueWithNode() {
        Queue<Integer> queue = new QueueNode<>();
        System.out.println("Before enqueue>>" + queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printElements();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printElements();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printElements();
        queue.enqueue(6);
        queue.printElements();

//        System.out.println("Before dequeue>>"+queue.peek());
//        queue.dequeue();
//        queue.printElements();
//        System.out.println("After dequeue>>"+queue.peek());
//
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(8);
//        queue.printElements();
//
//        System.out.println("Before dequeue>>"+queue.peek());
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//
//        queue.printElements();
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//        queue.printElements();
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//        queue.printElements();
//        queue.dequeue();
//        System.out.println("After dequeue>>"+queue.peek());
//        queue.printElements();
//        queue.enqueue(8);
//        queue.printElements();

    }

    public static void circularQueueTest() {
        Queue<Integer> queue = new CircularQueue<>(5);
        System.out.println("Before enqueue>>" + queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printElements();
        queue.dequeue();
        queue.dequeue();
        queue.printElements();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printElements();
        queue.enqueue(6);
        queue.printElements();
    }

    public static void dequeueTest() {
        Dequeue<Integer> dq = new Dequeue<>(5);

        System.out.println("Insert element at rear end : 12 ");
        dq.addAtTail(12);

        System.out.println("insert element at rear end : 14 ");
        dq.addAtTail(14);

        System.out.println("get head element : " + dq.peekFromHead());
        System.out.println("get rear element : " + dq.peekFromTail());

        dq.removeFromTail();
        System.out.println("After delete rear element new rear become : " + dq.peekFromTail());

        System.out.println("inserting element at front end");
        dq.addAtHead(13);

        System.out.println("get front element: " + dq.peekFromHead());

        dq.removeFromHead();

        System.out.println("After delete front element new front become : " + +dq.peekFromHead());

    }

    public static void main(String[] args) {
//        intQueueWithArray();
//        intQueueWithList();
//        circularQueueTest();
        dequeueTest();
    }
}
