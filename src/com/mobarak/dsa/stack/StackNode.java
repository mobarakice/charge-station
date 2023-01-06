package com.mobarak.dsa.stack;

import java.util.EmptyStackException;

public class StackNode<T> implements Stack<T> {
    private Node<T> top;
    private int size;
    private static class Node<T> {
        private final T data;
        private Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    @Override
    public void push(T element) {
        Node<T> node = new Node<T>(element);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printElements() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node<T> current = top;
        System.out.print("Stack element[");
        while (current != null){
            T data = current.data;
            current = current.next;
            System.out.print(data+" ");
        }
        System.out.print("]");
    }
}
