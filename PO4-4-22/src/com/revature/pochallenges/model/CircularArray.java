package com.revature.pochallenges.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularArray<T> implements Iterator<T>{

    private T[] array;
    private int headIndex;
    private int size;
    // For iterator use only
    private int currentIndex;

    public CircularArray(T[] array) {
        this.array = array;
        headIndex = 0;
        size = array.length;
        currentIndex = size - 1;

    }
    public CircularArray(){
        super();
        headIndex = 0;
        currentIndex = 0;
        size = 0;
    }

    public int length(){ return size; }

    // Chose to throw an ArrayIndexOutOfBoundsException in order to enforce the size of the array
    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        else {
            if(index + headIndex <= size - 1) return array[index + headIndex];
            else return array[index + headIndex - size];
        }
    }

    // Chose to throw an ArrayIndexOutOfBoundsException in order to enforce the size of the array
    public void set(int index, T element) throws ArrayIndexOutOfBoundsException{
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        else {
            if(index + headIndex <= size - 1) array[index + headIndex] = element;
            else array[index + headIndex - size] = element;
        }
    }

    // Current implementation resets iterator upon rotation
    public void rotateLeft() throws IllegalStateException{
        if(size == 0) throw new IllegalStateException();
        if(headIndex < size - 1) headIndex++;
        else headIndex = 0;
        if(headIndex == 0) currentIndex = size - 1;
        else currentIndex = headIndex - 1;
    }

    // Current implementation resets iterator upon rotation
    public void rotateLeft(int amount) throws IllegalStateException{
        if(size == 0) throw new IllegalStateException();
        if(headIndex + amount < size - 1) headIndex += amount;
        else headIndex = size - headIndex - amount;
        if(headIndex == 0) currentIndex = size - 1;
        else currentIndex = headIndex - 1;
    }

    // Current implementation resets iterator upon rotation
    public void rotateRight() throws IllegalStateException{
        if(size == 0) throw new IllegalStateException();
        if(headIndex > 0) headIndex--;
        else headIndex = size - 1;
        if(headIndex == 0) currentIndex = size - 1;
        else currentIndex = headIndex - 1;
    }

    // Current implementation resets iterator upon rotation
    public void rotateRight(int amount) throws IllegalStateException{
        if(size == 0) throw new IllegalStateException();
        if(headIndex - amount >= 0) headIndex -= amount;
        else headIndex = size + headIndex - amount;
        if(headIndex == 0) currentIndex = size - 1;
        else currentIndex = headIndex - 1;
    }

    @Override
    public String toString(){
        boolean complete = false;
        int cur = headIndex;
        StringBuilder ret = new StringBuilder();
        ret.append('[');
        while(!complete) {
            ret.append(array[cur].toString());
            cur++;
            if (cur >= size) {
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
    public T next() throws NoSuchElementException {
        if (this.hasNext()) {
            if (currentIndex == size - 1) currentIndex = 0;
            else currentIndex++;
            return array[currentIndex];
        }
        else throw new NoSuchElementException();
    }
}
