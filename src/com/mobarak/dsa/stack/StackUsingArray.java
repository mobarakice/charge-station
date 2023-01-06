package com.mobarak.dsa.stack;

public class StackUsingArray<T> implements Stack<T> {
    private final T[] data;
    private int top = -1;
    private final int size;

    public StackUsingArray(int size) {
        this.size = size;
        data = (T[]) new Object[this.size];
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            System.out.println("Overflow exception: Stack is full");
            System.exit(1);
        }
        data[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("OutOfBoundException: Stack is empty");
            System.exit(1);
        }
        return data[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("OutOfBoundException: Stack is empty");
            System.exit(1);
        }
        return data[top];
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
                System.out.print("\nStack elements["+data[i]);
            }else if(i == top){
                System.out.println(" "+data[i]+"]");
            }else {
                System.out.print(" "+data[i]);
            }
            if(top == 0){
                System.out.println("]");
            }
        }
    }
}
