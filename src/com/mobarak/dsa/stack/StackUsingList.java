package com.mobarak.dsa.stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingList<T> implements Stack<T> {
    private List<T> data;
    private int top = -1;
    private final int size;

    public StackUsingList(int size) {
        this.size = size;
        data = new ArrayList<>(this.size);
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            System.out.println("Overflow exception: Stack is full");
            System.exit(1);
        }
        data.add(element);
        top++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("OutOfBoundException: Stack is empty");
            System.exit(1);
        }
        return data.get(top--);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("OutOfBoundException: Stack is empty");
            System.exit(1);
        }
        return data.get(top);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void printElements() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        for (int i=0; i<=top;i++){
            if(i==0){
                System.out.print("\nStack elements["+data.get(i));
            }else if(i == top){
                System.out.println(" "+data.get(i)+"]");
            }else {
                System.out.print(" "+data.get(i));
            }
            if(top == 0){
                System.out.println("]");
            }
        }
    }
}
