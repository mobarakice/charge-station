package com.mobarak.dsa.queue;

public class Dequeue<T> {
    private int size;
    private int head;
    private int tail;
    private T[] data;

    public Dequeue(int size) {
        this.size = size;
        head = -1;
        tail = 0;
        data = (T[]) new Object[size];
    }

    public void addAtHead(T element) {
        if (isFull()) {
            System.out.println("Overflow exception: dequeue is full");
            return;
        }
        if (head == -1) {
            head = 0;
            tail = 0;
        } else if (head == 0) {
            head = size - 1;
        } else {
            head = head - 1;
        }
        data[head] = element;
    }

    public void addAtTail(T element) {
        if (isFull()) {
            System.out.println("Overflow exception: dequeue is full");
            return;
        }
        if (head == -1) {
            head = 0;
            tail = 0;
        } else if (tail == size - 1) {
            tail = 0;
        } else {
            tail = tail + 1;
        }
        data[tail] = element;
    }

    public T removeFromHead() {
        if (isEmpty()) {
            System.out.println("Underflow exception: dequeue is empty");
            return null;
        }
        T element = data[head];
        if (head == tail) {
            head = -1;
            tail = -1;
        } else if (head == size - 1) {
            head = 0;
        } else {
            head++;
        }
        return element;
    }

    public T removeFromTail() {
        if (isEmpty()) {
            System.out.println("Underflow exception: dequeue is empty");
            return null;
        }
        T element = data[tail];
        if (head == tail) {
            head = -1;
            tail = -1;
        } else if (tail == 0) {
            tail = size - 1;
        } else {
            tail--;
        }
        return element;
    }

    public T peekFromHead() {
        if (isEmpty()) {
            System.out.println("Underflow exception: dequeue is empty");
            return null;
        }
        return data[head];
    }

    public T peekFromTail() {
        if (isEmpty()) {
            System.out.println("Underflow exception: dequeue is empty");
            return null;
        }
        return data[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return (head == 0 && tail == size - 1) || head == tail + 1;
    }

    public int size() {
        return size;
    }
}
