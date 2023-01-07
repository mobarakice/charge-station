package com.mobarak.dsa.queue;

public class QueueUsingArray<T> implements Queue<T> {
    private int head = -1;
    private int tail = -1;
    private final int size;
    private final T[] data;

    public QueueUsingArray(int size) {
        this.size = size;
        data = (T[]) new Object[size];
    }

    @Override
    public void enqueue(T element) {
        if (isFull()) {
            System.out.println("Overflow exception: queue is full");
            return;
        }
        if (head == -1) head++;
        data[++tail] = element;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        T element = data[head];
        if (head >= tail) {
            head = -1;
            tail = -1;
        } else {
            head++;
        }
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
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
        return tail == size - 1;
    }

    @Override
    public void printElements() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("\nQueue elements[");
        for(int i = head; i<=tail; i++){
            if(i == tail){
                System.out.println(data[i] + "]");
            }else {
                System.out.print(data[i] + " ");
            }
        }
    }
}
