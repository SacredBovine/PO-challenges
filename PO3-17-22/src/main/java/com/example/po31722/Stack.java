package com.example.po31722;




import java.util.Collections;
import java.util.LinkedList;


public class Stack {

    private LinkedList<Integer> stack = new LinkedList();

    public Stack(LinkedList<Integer> stack) {
        this.stack = stack;
    }

    public void push(int value){
        this.stack.offerLast(value);
    }

    public int pop() throws NullPointerException{
        if (this.stack.size() == 0){
            throw new NullPointerException("No elements to pop in stack.");
        }
        return this.stack.pop();
    }

    public int max() throws NullPointerException{
        if (this.stack.size() == 0){
            throw new NullPointerException("No elements -> no max.");

        }
        return Collections.max(this.stack);
    }

    public void print() {
        this.stack.stream().forEach(System.out::println);
    }
}
