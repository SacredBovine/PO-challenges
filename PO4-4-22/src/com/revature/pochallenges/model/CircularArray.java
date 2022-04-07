package com.revature.pochallenges.model;

import java.util.Iterator;
import java.util.function.Consumer;

public class CircularArray<T> implements Iterator<T>{

    private T[] array;
    private int headIndex;
    private int size;
    private int currentIndex;

    public CircularArray(T[] array) {
        this.array = array;
        headIndex = 0;
        currentIndex = 0;
        size = array.length;
    }
    public CircularArray(){
        super();
        headIndex = 0;
        currentIndex = 0;
        size = 0;
    }

    public int length(){ return size; }

    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        else {
            if(index + headIndex < size - 1) return array[index + headIndex];
            else return array[index + headIndex - size - 1];
        }
    }

    public void set(T element, int index) throws ArrayIndexOutOfBoundsException{
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        else {
            if(index + headIndex < size - 1) array[index + headIndex] = element;
            else array[index + headIndex - size - 1] = element;
        }
    }

    public void rotateLeft(){
        if(headIndex < size - 1) headIndex++;
        else headIndex = 0;
        currentIndex = headIndex;
    }

    public void rotateRight(){
        if(headIndex > 0) headIndex--;
        else headIndex = size - 1;
        currentIndex = headIndex;
    }

    @Override
    public String toString(){
        boolean complete = false;
        int cur = headIndex;
        StringBuilder ret = new StringBuilder();
        ret.append('[');
        while(!complete){
            ret.append(array[cur]);
            cur++;
            if (cur >= size){
                cur = 0;
            }
            if(cur == headIndex) {
                complete = true;
                ret.append(']');
            } else ret.append(',');
        }
        return ret.toString();
    }
    @Override
    public boolean hasNext() {
        if (size > 0) return true;
        else return false;
    }


    @Override
    public T next() {
        if (this.hasNext()) {
            if (currentIndex == size - 1) currentIndex = 0;
            else currentIndex++;
            return array[currentIndex];
        }
        else return null; // should probably throw an exception, don't know which one yet though.
    }

    @Override
    public void remove() {
        Iterator.super.remove(); // Will implement at a later date
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action); // will implement at a later date.
    }
}