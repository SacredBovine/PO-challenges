package com.revature.pochallenges.model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class circularArray<T> implements Iterable<T>{

    private T[] array;

    public circularArray(T[] array) {
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public void set(T element, int index){
        array[index] = element;
    }

    public void rotateRight(){
        T temp = array[array.length - 1];
        for(int i = array.length - 1; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    public void rotateLeft(){
        T temp = array[0];
        for (int i = 0; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
