package com.mobarak.dsa.queue;

public class CircularQueue<T> implements Queue<T> {
    private int head;
    private int tail;
    private final T[] data;
    private final int size;

    public CircularQueue(int size) {
        this.size = size;
        head = -1;
        tail = -1;
        data = (T[]) new Object[size];
    }

    @Override
    public void enqueue(T element) {
        if (isFull()) {
            System.out.println("OverflowException: queue is full");
        } else {
            if (head == -1) {
                head++;
            }
            tail = (tail + 1) % size;
            data[tail] = element;
            System.out.println("Inserted element>>" + element);
        }

    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("EmptyQueueException>>Queue is empty");
            return null;
        }
        T element = data[head];
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % size;
        }
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("EmptyQueueException>>Queue is empty");
            return null;
        }
        return data[head];
    }

    @Override
    public boolean isEmpty() {
        return head == -1;
    }

    @Override
    public boolean isFull() {
        return (head == 0 && tail == size - 1) || head == tail + 1;
    }

    @Override
    public void printElements() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("\nQueue elements[");
        for(int i = head; i<size; i++){
            System.out.print(data[(i + 1) % size]+" ");
        }
        System.out.println("]");
    }
}
