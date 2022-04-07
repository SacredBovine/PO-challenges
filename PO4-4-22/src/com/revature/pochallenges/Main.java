package com.revature.pochallenges;

import com.revature.pochallenges.model.CircularArray;

public class Main {

    public static void main(String[] args){
        Integer[] intTest = {1,2,3,4,5};
        String[] stringTest = {"a","b","c","d","e"};
        CircularArray<Integer> array = new CircularArray(intTest);

        System.out.println("initial array: "+ array.toString());
        array.rotateRight();
        System.out.println("rotate right: " + array.toString());
        array.rotateRight();
        System.out.println("rotate right: " + array.toString());

        array = new CircularArray(stringTest);
        System.out.println("initial array: "+ array.toString());
        array.rotateLeft();
        System.out.println("rotate left: " + array.toString());
        array.rotateLeft();
        System.out.println("rotate left: " + array.toString());

        for (int i = 0; i < 25; i++){
            System.out.println(array.next());
        }
    }
}
