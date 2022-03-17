package com.example.po31722;




import java.util.Collections;
import java.util.LinkedList;


public class Stack {

    private LinkedList<Integer> stack = new LinkedList();
    private int max;

    public Stack(LinkedList<Integer> stack) {
        this.stack = stack;
        this.max = Collections.max(stack);
    }

    public void push(int value){
        this.stack.offerLast(value);
        if (value > max) max = value;
    }

    public int pop() throws NullPointerException{
        if (this.stack.size() == 0){
            throw new NullPointerException("No elements to pop in stack.");
        }
        int popped = this.stack.pop();
        if (popped == max ) {
            if (this.stack.size() != 0) max = Collections.max(stack);
            else max = 0;
        }
        return popped;
    }

    public int max() throws NullPointerException{
        if (this.stack.size() == 0){
            throw new NullPointerException("No elements -> no max.");

        }
        return this.max;
    }

    public void print() {
        this.stack.stream().forEach(System.out::println);
    }
}
