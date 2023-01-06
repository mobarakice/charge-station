package com.mobarak.dsa.stack;

public interface Stack<T> {
    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();

    boolean isFull();

    int size();

    void printElements();
}
