package com.example.po31722;

import java.util.LinkedList;

public class ChallengeTwo {
    private Stack stack;

    public ChallengeTwo(LinkedList list) {
        this.stack = new Stack(list);
    }

    public void printStack(){
        stack.print();
    }

    public void push(int value){
        stack.push(value);
    }

    public int pop() throws NullPointerException{
        return stack.pop();
    }

    public int findMax() throws NullPointerException{
        return stack.max();
    }
}
