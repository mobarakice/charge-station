package com.mobarak.dsa.queue;

public class QueueNode<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    @Override
    public void enqueue(T element) {
        Node<T> node = new Node<>(element);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head==null){
            head = node;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void printElements() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node<T> current = head;
        System.out.print("\nQueue elements[");
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("]");
    }
}
