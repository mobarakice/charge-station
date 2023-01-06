package com.mobarak.dsa.stack;

public class StackTest {

    public static void intArrayTest(){
        //push 3,2,5, pop, push 8,1,pop
        Stack<Integer> stack = new StackUsingList<>(5);
        stack.push(3);
        System.out.println("After pushed>>head: "+stack.peek());
        stack.push(2);
        System.out.println("After pushed>>head: "+stack.peek());
        stack.push(5);
        System.out.println("After pushed>>head: "+stack.peek());
        System.out.println("Before pop>>head: "+stack.peek());
        stack.pop();
        System.out.println("After pop>>head: "+stack.peek());
        stack.push(8);
        System.out.println("After pushed>>head: "+stack.peek());
        stack.push(1);
        System.out.println("After pushed>>head: "+stack.peek());
        System.out.println("Before pop>>head: "+stack.peek());
        stack.pop();
        System.out.println("After pop>>head: "+stack.peek());
        stack.printElements();

        stack.pop();
        System.out.println("After pop>>head: "+stack.peek());
        stack.printElements();

        stack.pop();
        System.out.println("After pop>>head: "+stack.peek());
        stack.printElements();

        stack.pop();
        //System.out.println("After pop>>head: "+stack.peek());
        stack.printElements();
    }

    public static void reverseWord(String word){
        if(word == null || word.isEmpty()){
            System.out.println("Word is empty or null");
            return;
        }
        StackUsingArray<Character> stack = new StackUsingArray<>(word.length());
        char[] charArr = word.toCharArray();
        for(char c : charArr){
            stack.push(c);
        }
        StringBuilder rev= new StringBuilder();
        for (int i=0; i<word.length();i++){
            rev.append(stack.pop());
        }
        System.out.println("Original word: "+word);
        System.out.println("Reverse word: "+rev);
    }

    public static void main(String[] args) {
        intArrayTest();
        //reverseWord("Hello");
        //reverseWord("");
    }
}
